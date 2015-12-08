package tunesquad.com.tunesquad;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import humm.android.api.Model.Song;

/**
 * Created by shaun.d.clark on 06/12/15.
 */
public class SearchResults extends AppCompatActivity {

    private ListView songview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_results);

        String videoID = "";

        final ArrayList<Song> songlist = getIntent().getParcelableArrayListExtra("list");

        SongAdapter sa = new SongAdapter(SearchResults.this,songlist);


        for (Song song : songlist)
        {
            Log.d("DEBUG", song.getTitle());
        }

        songview = (ListView)findViewById(R.id.songlist);
        songview.setAdapter(sa);
        songview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Song songTitle = songlist.get(position);

                Log.d("song","id" +  songTitle.getYoutubeId());

            }
        });

    }
}
