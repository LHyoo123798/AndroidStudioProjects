## 实验三

### 项目结构
![image](/TestImage/test3_projectStructure.png)

### 实验1、4效果图
![image](/TestImage/test3_1&&4.png)
### 主要代码
#### activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <ListView
        android:id="@+id/list1"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

#### simple_list.xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="70dp">

    <LinearLayout
        android:id="@+id/simple_list"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="horizontal"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        android:onClick="click_list">

        <TextView
            android:id="@+id/name1"
            android:textSize="18sp"
            android:textStyle="bold"
            android:gravity="center_vertical|start"
            android:layout_marginLeft="10dp"
            android:layout_width="312dp"
            android:layout_height="match_parent" />

        <ImageView
            android:id="@+id/image1"
            android:layout_width="70dp"
            android:layout_height="match_parent"
            android:layout_gravity="end"
            android:scaleType="centerCrop" />

    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>
```

#### MainActivity.java
```
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
```

### 实验2、3效果图
![image](/TestImage/test3_2&&3%281%29.png)
![image](/TestImage/test3_2&&3%282%29.png)
![image](/TestImage/test3_2&&3%283%29.png)
### 主要代码
#### menu_demo.xml
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:title="字体大小">
        <menu>
            <item
                android:id="@+id/small1"
                android:title="小">
            </item>
            <item
                android:id="@+id/middle1"
                android:title="中">
            </item>
            <item
                android:id="@+id/big1"
                android:title="大">
            </item>
        </menu>
    </item>
    <item
        android:id="@+id/simple_menu"
        android:title="普通菜单项">
    </item>
    <item
        android:title="字体颜色">
        <menu>
            <item
                android:id="@+id/red1"
                android:title="红色">
            </item>
            <item
                android:id="@+id/black1"
                android:title="黑色">
            </item>
        </menu>
    </item>
</menu>
```

#### alertdialog_layout.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:gravity="center|center_horizontal|center_vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/text11"
        android:layout_width="200dp"
        android:layout_height="150dp"
        android:gravity="center"
        android:text="这是一段测试文本！"
        android:textSize="8sp"
        android:textStyle="bold" />

    <Button
        android:layout_width="150dp"
        android:layout_height="72dp"
        android:text="登录"
        android:onClick="login"/>
</LinearLayout>
```

#### table_layout1.xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto">

    <TableLayout
        android:id="@+id/table1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <TextView
                android:layout_width="match_parent"
                android:layout_height="70dp"
                android:background="#FFA500"
                android:layout_weight="1"
                android:textSize="20sp"
                android:textStyle="bold"
                android:textColor="#FFFFFF"
                android:gravity="center"
                android:text="ANDROID APP" />
        </TableRow>
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            >
            <EditText
                android:layout_width="match_parent"
                android:layout_height="60dp"
                android:layout_weight="1"
                android:hint="用户名"
                android:inputType="text"
                />
        </TableRow>
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            >
            <EditText
                android:layout_width="match_parent"
                android:layout_height="60dp"
                android:layout_weight="1"
                android:hint="密码"
                android:inputType="textWebPassword"
                />
        </TableRow>
        <TableRow
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            >

            <Button
                android:id="@+id/button_cancel"
                android:layout_width="20dp"
                android:layout_height="60dp"
                android:text="取消"
                android:onClick="click_cancel"
                android:layout_gravity="center" />

            <Button
                android:id="@+id/button_login"
                android:layout_width="139dp"
                android:layout_height="60dp"
                android:text="登录"
                android:onClick="click_login"
                android:layout_gravity="center" />

        </TableRow>
    </TableLayout>

</androidx.constraintlayout.widget.ConstraintLayout>
```

#### MainActivity2.java
```
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

```


