package tunesquad.com.tunesquad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import humm.android.api.Model.Song;

/**
 * Created by shaun.d.clark on 06/12/15.
 */
public class SongAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Song> mData;


    SongAdapter(Context mContext, ArrayList<Song> songArray){
        this.mContext = mContext;
                mData = songArray;
    }





    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if( convertView == null ){
            final LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //We must create a View:
            convertView = inflater.inflate(R.layout.list_row, parent, false);
        }

        Song song = mData.get(position);
        TextView myText = (TextView) convertView.findViewById(R.id.song_name);
        myText.setText(song.getTitle());
        //Here we can do changes to the convertView, such as set a text on a TextView
        //or an image on an ImageView.
        return convertView;
    }
}
