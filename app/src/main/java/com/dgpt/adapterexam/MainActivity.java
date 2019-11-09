package com.dgpt.adapterexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private String[] names={"张三","李四","王五","赵柳"};
    private int[] icons={R.drawable.jd,R.drawable.qq,R.drawable.qq_dizhu,R.drawable.sina};
    private int[] ages={15,21,16,18};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.lv) ;

        List<Person> list=getData();

       /* ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(
        		MainActivity.this,
        		R.layout.item_view,
        		R.id.tv_name,
        		names);*/

       /* List<Map<String, Object>> dataList=new ArrayList<Map<String,Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object>map=new HashMap<String, Object>();
            map.put("name", names[i]);
            map.put("age", ages[i]);
            map.put("icon", icons[i]);
            dataList.add(map);
        }

        SimpleAdapter adapter=new SimpleAdapter(
                MainActivity.this,
                dataList,
                R.layout.item_view,
                new String[]{"icon","name","age"},
                new int[]{R.id.iv_icon,R.id.tv_name,R.id.tv_age});*/

       MyAdapter myadapter=new MyAdapter(MainActivity.this, names, ages, icons);

        lv.setAdapter(myadapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String location = "位置："+lv.getItemIdAtPosition(i);
                String content = "   内容，"+lv.getItemAtPosition(i);
                Toast.makeText(MainActivity.this, location+content, Toast.LENGTH_SHORT).show();
            }
        });





    }

    private List<Person> getData() {
        List<Person>list=new ArrayList<Person>();
        for (int i=0;i<names.length;i++){
            Person p=new Person();
            p.setAge(ages[i]);
            p.setIcon(icons[i]);
            p.setName(names[i]);
            list.add(p);
        }
        return  list;
    }


}
