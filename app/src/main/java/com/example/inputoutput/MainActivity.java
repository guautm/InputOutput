package com.example.inputoutput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Song> songs = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readSongData();

        TextView songView = findViewById(R.id.songView);

        String songStr = "";
        for (Song s : songs){
            songStr += s.getTitle() + " " + s.getArtist() + " " + s.getYear() + "\n";
            songView.setText(songStr);
        }
    }

    private void readSongData(){
        InputStream is = getResources().openRawResource(R.raw.songs);

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String line = "";
        try {
            while ((line = reader.readLine()) != null) {
                //Split by
                String[] fields = line.split(",");

                //Read the data
                songs.add(new Song(fields[0], fields[1], Integer.parseInt(fields[2])));
            }
        }
        catch (IOException e) {
            Log.wtf("MainActivity", "ERROR reading data on line: " + line);
        }
    }

}
