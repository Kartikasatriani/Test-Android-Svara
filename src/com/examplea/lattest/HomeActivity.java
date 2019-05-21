package com.examplea.lattest;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;


public class HomeActivity extends Activity {
	
	protected ListView lv;
	protected ListAdapter adapter;
	SimpleAdapter Adapter;
	HashMap<String, String> map;
	ArrayList<HashMap<String, String>> mylist;
	String[] Pil;
	String[] Gbr;
	Button b;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        lv = (ListView) findViewById(R.id.lv);
        Pil = new String[] {"Playlist", "Music", "Artist", "Radio", "Radio Content", "Album", "Uploaded Content"};
        Gbr = new String[] {Integer.toString(R.drawable.icon_playlist),
        Integer.toString(R.drawable.icon_music),
        Integer.toString(R.drawable.icon_artist),
        Integer.toString(R.drawable.icon_radio),
        Integer.toString(R.drawable.icon_radio_content),
        Integer.toString(R.drawable.icon_album),
        Integer.toString(R.drawable.icon_upload_content) };
        
        mylist = new ArrayList<HashMap<String,String>>();
	        for (int i = 0; i < Pil.length; i++){
		        map = new HashMap<String, String>();
		        map.put("list", Pil[i]);
		        map.put("gbr", Gbr[i]);
		        mylist.add(map);
	        	}
        Adapter = new SimpleAdapter(this, mylist, R.layout.layout_isi_lv,
        new String[] {"list", "gbr"}, new int[] {R.id.tv_nama, R.id.imV});
        lv.setAdapter(Adapter);
        
        lv.setOnItemClickListener(new OnItemClickListener() {
        	@Override
			public void onItemClick(AdapterView<?> aView, View View, int posisi,
					long id) {
				// TODO Auto-generated method stub
				//item yg dipilih
        		
        		
				switch(posisi){
				case 0:
					Intent i = new Intent(HomeActivity.this, DaftarActivity.class);
					startActivity(i);
					break;
				case 1:
					Intent j = new Intent(HomeActivity.this, DaftarActivity.class);
					startActivity(j);
					break;
				case 2:
					Intent k = new Intent(HomeActivity.this, DaftarActivity.class);
					startActivity(k);
					break;
				case 3:
					Intent l = new Intent(HomeActivity.this, DaftarActivity.class);
					startActivity(l);
					break;
				case 4:
					Intent m = new Intent(HomeActivity.this, DaftarActivity.class);
					startActivity(m);
					break;
				case 5:
					Intent n = new Intent(HomeActivity.this, DaftarActivity.class);
					startActivity(n);
					break;
				case 6:
					Intent o = new Intent(HomeActivity.this, DaftarActivity.class);
					startActivity(o);
					break;
				default:
					break;
				}
			}
		});
        
        b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        
        
        
    }
    
}
