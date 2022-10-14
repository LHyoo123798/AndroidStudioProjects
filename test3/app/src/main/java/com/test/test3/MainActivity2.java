package com.test.test3;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    AlertDialog dialog;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
        setContentView(R.layout.alertdialog_layout);
        textView=(TextView) findViewById(R.id.text11);
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_demo,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.small1:
                textView.setTextSize(10);
                return true;
            case R.id.middle1:
                textView.setTextSize(16);
                return true;
            case R.id.big1:
                textView.setTextSize(20);
                return true;
            case R.id.simple_menu:
                Toast toast=Toast.makeText(this,"这是普通菜单",Toast.LENGTH_SHORT);
                toast.show();
                return true;
            case R.id.red1:
                textView.setTextColor(Color.RED);
                return true;
            case R.id.black1:
                textView.setTextColor(Color.BLACK);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public void login(View view){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setView(View.inflate(this,R.layout.table_layout1,null));
        dialog=builder.show();
    }

    public void click_cancel(View view){
        if(dialog!=null&&dialog.isShowing()){
            dialog.dismiss();
        }
    }

    public void click_login(View view){
        Toast toast=Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT);
        toast.show();
    }

}
