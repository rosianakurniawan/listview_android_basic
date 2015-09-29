package com.example.listview_basic_nondatabase;

import java.util.ArrayList;
import java.util.Arrays;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends Activity {	
	private ListView lv;	
	private ArrayAdapter<String> namaArrayAdapter;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         lv = (ListView) findViewById(R.id.listview1);
         String [] nama = new String [] {"aa", "bb","cc","dd","ee","ff","gg"};
         ArrayList<String> namalist = new ArrayList<String>();
         namalist.addAll(Arrays.asList(nama));
         namaArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1, nama);
     	
        lv.setAdapter(namaArrayAdapter);
    }

}
