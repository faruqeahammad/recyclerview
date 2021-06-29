package com.faruqe.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<MClass>userList;
    Adapter adapter;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        mrecyclerView=findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mrecyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
    private void initData() {
        userList = new ArrayList<>();

        userList.add(new MClass(R.drawable.nahid,"Md Nahid Alam", "Students: ES APP DEV 2003", "Class 18","1"));
        userList.add(new MClass(R.drawable.sunan,"Sunan Rashid", "Students: ES APP DEV 2003", "Class 18","2"));
        userList.add(new MClass(R.drawable.jui,"Jannat Ara Haque Jui", "Students: ES APP DEV 2003", "Class 18","3"));
        userList.add(new MClass(R.drawable.tonmoy,"Toufique Elahi Tonmoy", "Students: ES APP DEV 2003", "Class 18","4"));
        userList.add(new MClass(R.drawable.mamun,"Mamun Sorkar", "Students: ES APP DEV 2003", "Class 18","5"));
        userList.add(new MClass(R.drawable.faruk,"Md Faruk", "Students: ES APP DEV 2003", "Class 18","6"));
        userList.add(new MClass(R.drawable.rafi,"Abdur Rafi Adib", "Students: ES APP DEV 2003", "Class 18","7"));
        userList.add(new MClass(R.drawable.nirob,"Nirob Rudra", "Students: ES APP DEV 2003", "Class 18","8"));
        userList.add(new MClass(R.drawable.jaber,"Jihadul Islam Jaber", "Students: ES APP DEV 2003", "Class 18","9"));
        userList.add(new MClass(R.drawable.masud,"Masud Arnob", "Students: ES APP DEV 2003", "Class 18","10"));
        userList.add(new MClass(R.drawable.nezam,"Nezam Uddin", "Students: ES APP DEV 2003", "Class 18","11"));
        userList.add(new MClass(R.drawable.ic_user,"Mangreang Morung", "Students: ES APP DEV 2003", "Class 18","12"));
        userList.add(new MClass(R.drawable.female,"Autoshi Kundu", "Students: ES APP DEV 2003", "Class 18","13"));
        userList.add(new MClass(R.drawable.female,"Sumaiya Mariya", "Students: ES APP DEV 2003", "Class 18","14"));
        userList.add(new MClass(R.drawable.female,"Sleepingg Beautyy", "Students: ES APP DEV 2003", "Class 18","15"));
        userList.add(new MClass(R.drawable.ic_user,"Afif Rayed", "Students: ES APP DEV 2003", "Class 18","16"));
        userList.add(new MClass(R.drawable.faruqe,"M Faruqe Ahammad", "Students: ES APP DEV 2003", "Class 18","17"));
    }
}