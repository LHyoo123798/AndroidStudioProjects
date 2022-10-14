package com.test.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    HashMap<View,Boolean> list_selected=new HashMap<>();
    private String[] names=new String[]{"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private int[] images=new int[]{R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};
    int selected_num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.list1);
        List<Map<String,Object>> mapList=new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("name",names[i]);
            map.put("image",images[i]);
            mapList.add(map);
        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,mapList,R.layout.simple_list,new String[]{"name","image"},new int[]{R.id.name1,R.id.image1});
        listView.setAdapter(simpleAdapter);
    }

    public  void click_list(View view){
        LinearLayout linearLayout=view.findViewById(R.id.simple_list);
        TextView textView=view.findViewById(R.id.name1);
        ActionMode actionMode=startActionMode(callback);
        if(list_selected.get(view)==null||!list_selected.get(view)){
            selected_num++;
            list_selected.put(view,true);
            linearLayout.setBackgroundColor(Color.RED);
            Toast toast=Toast.makeText(this,textView.getText(),Toast.LENGTH_SHORT);
            toast.show();
        }else {
            selected_num--;
            list_selected.put(view,false);
            linearLayout.setBackgroundColor(Color.WHITE);
        }
        callback.onActionItemClicked(actionMode,null);
    }

    ActionMode.Callback callback=new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            mode.setTitle(selected_num+"selected");
            return true;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {

        }
    };
}