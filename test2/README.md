## 实验二
### 线性布局
![image](/TestImage/test2_1.png)
#### linear_layout.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:gravity="center"
            android:layout_width="95dp"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:layout_height="wrap_content"
            android:textSize="18sp"
            android:textColor="@color/purple_200"
            android:text="One,One"
            android:background="@drawable/textview_border"/>


        <TextView
            android:layout_width="95dp"
            android:layout_height="wrap_content"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:background="@drawable/textview_border"
            android:gravity="center"
            android:text="One,Two"
            android:textColor="@color/purple_200"
            android:textSize="18sp" />

        <TextView
            android:gravity="center"
            android:layout_width="95dp"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:layout_height="wrap_content"
            android:textSize="18sp"
            android:textColor="@color/purple_200"
            android:text="One,Three"
            android:background="@drawable/textview_border"/>

        <TextView
            android:gravity="center"
            android:layout_width="95dp"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:layout_height="wrap_content"
            android:textSize="18sp"
            android:textColor="@color/purple_200"
            android:text="One,Four"
            android:background="@drawable/textview_border"/>
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:gravity="center"
            android:layout_width="95dp"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:layout_height="wrap_content"
            android:textSize="18sp"
            android:textColor="@color/purple_200"
            android:text="Two,One"
            android:background="@drawable/textview_border"/>


        <TextView
            android:layout_width="95dp"
            android:layout_height="wrap_content"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:background="@drawable/textview_border"
            android:gravity="center"
            android:text="Two,Two"
            android:textColor="@color/purple_200"
            android:textSize="18sp" />

        <TextView
            android:gravity="center"
            android:layout_width="95dp"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:layout_height="wrap_content"
            android:textSize="18sp"
            android:textColor="@color/purple_200"
            android:text="Two,Three"
            android:background="@drawable/textview_border"/>

        <TextView
            android:gravity="center"
            android:layout_width="95dp"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:layout_height="wrap_content"
            android:textSize="18sp"
            android:textColor="@color/purple_200"
            android:text="Two,Four"
            android:background="@drawable/textview_border"/>
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:gravity="center"
            android:layout_width="95dp"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:layout_height="80dp"
            android:textSize="18sp"
            android:textColor="@color/purple_200"
            android:text="Three,One"
            android:background="@drawable/textview_border"/>


        <TextView
            android:layout_width="95dp"
            android:layout_height="80dp"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:background="@drawable/textview_border"
            android:gravity="center"
            android:text="Three,Two"
            android:textColor="@color/purple_200"
            android:textSize="18sp" />

        <TextView
            android:gravity="center"
            android:layout_width="95dp"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:layout_height="80dp"
            android:textSize="18sp"
            android:textColor="@color/purple_200"
            android:text="Three,Three"
            android:background="@drawable/textview_border"/>

        <TextView
            android:gravity="center"
            android:layout_width="95dp"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:layout_height="80dp"
            android:textSize="18sp"
            android:textColor="@color/purple_200"
            android:text="Three,Four"
            android:background="@drawable/textview_border"/>
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:gravity="center"
            android:layout_width="95dp"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:layout_height="wrap_content"
            android:textSize="18sp"
            android:textColor="@color/purple_200"
            android:text="Four,One"
            android:background="@drawable/textview_border"/>


        <TextView
            android:layout_width="95dp"
            android:layout_height="wrap_content"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:background="@drawable/textview_border"
            android:gravity="center"
            android:text="Four,Two"
            android:textColor="@color/purple_200"
            android:textSize="18sp" />

        <TextView
            android:gravity="center"
            android:layout_width="95dp"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:layout_height="wrap_content"
            android:textSize="18sp"
            android:textColor="@color/purple_200"
            android:text="Four,Three"
            android:background="@drawable/textview_border"/>

        <TextView
            android:gravity="center"
            android:layout_width="95dp"
            android:layout_marginLeft="5dp"
            android:layout_marginTop="5dp"
            android:layout_height="wrap_content"
            android:textSize="18sp"
            android:textColor="@color/purple_200"
            android:text="Four,Four"
            android:background="@drawable/textview_border"/>
    </LinearLayout>

</LinearLayout>
```

### 表格布局
![image](/TestImage/test2_2.png)
#### table_layout.xml
```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/black"
    >

    <TableRow>
        <Button
            android:layout_width="80dp"
            android:layout_height="wrap_content"
            android:background="@color/black"
            android:textColor="@color/white"
            android:text="Open..."
            android:textStyle="bold"
            android:textSize="18sp"
            />

        <TextView
            android:layout_width="265dp"
            android:layout_height="wrap_content"
            />

        <TextView
            android:layout_width="80dp"
            android:layout_height="wrap_content"
            android:text="Ctrl-O"
            android:textColor="@color/white"
            android:textSize="18sp"
            android:textStyle="bold" />
    </TableRow>

    <TableRow >
        <Button
            android:layout_width="80dp"
            android:layout_height="wrap_content"
            android:background="@color/black"
            android:textColor="@color/white"
            android:text="Save..."
            android:textStyle="bold"
            android:textSize="18sp"
            />
        <TextView
            android:layout_width="265dp"
            android:layout_height="wrap_content"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Ctrl-S"
            android:textColor="@color/white"
            android:textStyle="bold"
            android:textSize="18sp"
            />
    </TableRow>

    <TableRow>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@color/black"
            android:textColor="@color/white"
            android:text="Save as..."
            android:textStyle="bold"
            android:textSize="18sp"
            />
        <TextView
            android:layout_width="265dp"
            android:layout_height="wrap_content"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Ctrl-Shirt-S"
            android:textColor="@color/white"
            android:textStyle="bold"
            android:textSize="18sp"
            />
    </TableRow>

    <View
        android:layout_width="wrap_content"
        android:layout_marginTop="10dp"
        android:layout_height="1dp"
        android:background="@color/white"
        />

    <TableRow>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@color/black"
            android:textColor="@color/white"
            android:text="Import..."
            android:textStyle="bold"
            android:textSize="18sp"
            />
        <TextView
            android:layout_width="265dp"
            android:layout_height="wrap_content"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            />
    </TableRow>

    <TableRow >
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@color/black"
            android:textColor="@color/white"
            android:text="Export..."
            android:textStyle="bold"
            android:textSize="18sp"
            />
        <TextView
            android:layout_width="265dp"
            android:layout_height="wrap_content"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Ctrl-E"
            android:textColor="@color/white"
            android:textStyle="bold"
            android:textSize="18sp"
            />
    </TableRow>

    <View
        android:layout_width="wrap_content"
        android:layout_marginTop="10dp"
        android:layout_height="1dp"
        android:background="@color/white"
        />

    <TableRow>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@color/black"
            android:textColor="@color/white"
            android:text="Quit"
            android:textStyle="bold"
            android:textSize="18sp"
            />
        <TextView
            android:layout_width="265dp"
            android:layout_height="wrap_content"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            />
    </TableRow>
</TableLayout>
```

### 约束布局1
![image](/TestImage/test2_3.png)
#### constrant_layout.xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">


    <EditText
        android:id="@+id/editTextTextPersonName"
        android:layout_width="377dp"
        android:layout_height="50dp"
        android:background="@color/purple_200"
        android:ems="10"
        android:gravity="right|center"
        android:textSize="18sp"
        android:inputType="textPersonName"
        android:text="0.0"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.529"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.08" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="56dp"
        android:layout_height="39dp"
        android:text="Input"
        android:textSize="18sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.05"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.021" />

    <Button
        android:id="@+id/button7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="5"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.337"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.267" />

    <Button
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="8"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.337"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.168" />

    <Button
        android:id="@+id/button14"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="."
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.03"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.456" />

    <Button
        android:id="@+id/button15"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="0"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.337"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.456" />

    <Button
        android:id="@+id/button4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="9"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.637"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.168" />

    <Button
        android:id="@+id/button11"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="2"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.337"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.36" />

    <Button
        android:id="@+id/button9"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="*"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.95"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.267" />

    <Button
        android:id="@+id/button5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="="
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.637"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.456" />

    <Button
        android:id="@+id/button10"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="1"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.03"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.36" />

    <Button
        android:id="@+id/button8"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="6"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.637"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.266" />

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="7"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.03"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.168" />

    <Button
        android:id="@+id/button16"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="+"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.95"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.168" />

    <Button
        android:id="@+id/button12"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="3"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.637"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.36" />

    <Button
        android:id="@+id/button6"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="4"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.03"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.266" />

    <Button
        android:id="@+id/button17"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="-"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.95"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.456" />

    <Button
        android:id="@+id/button13"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="+"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.95"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.36" />
</androidx.constraintlayout.widget.ConstraintLayout>
```

### 约束布局2
![image](/TestImage/test2_4.png)
#### constrant_layout.xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <ImageView
        android:id="@+id/spaceStationIcon"
        android:layout_width="30dp"
        android:layout_height="30dp"
        android:layout_marginTop="15dp"
        app:layout_constraintEnd_toStartOf="@+id/flightsIcon"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintHorizontal_chainStyle="spread"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/space_station_icon" />

    <ImageView
        android:id="@+id/flightsIcon"
        android:layout_width="30dp"
        android:layout_height="30dp"
        android:layout_marginTop="15dp"
        app:layout_constraintBottom_toBottomOf="@+id/spaceStationIcon"
        app:layout_constraintEnd_toStartOf="@+id/roverIcon"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@+id/spaceStationIcon"
        app:layout_constraintTop_toTopOf="@+id/spaceStationIcon"
        app:layout_constraintVertical_bias="1.0"
        app:srcCompat="@drawable/rocket_icon" />

    <ImageView
        android:id="@+id/roverIcon"
        android:layout_width="30dp"
        android:layout_height="30dp"
        android:layout_marginTop="15dp"
        app:layout_constraintBottom_toBottomOf="@+id/flightsIcon"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toEndOf="@+id/flightsIcon"
        app:layout_constraintTop_toTopOf="@+id/flightsIcon"
        app:layout_constraintVertical_bias="1.0"
        app:srcCompat="@drawable/rover_icon" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Space Stations"
        app:layout_constraintEnd_toEndOf="@+id/spaceStationIcon"
        app:layout_constraintStart_toStartOf="@+id/spaceStationIcon"
        app:layout_constraintTop_toBottomOf="@+id/spaceStationIcon" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Flights"
        app:layout_constraintEnd_toEndOf="@+id/flightsIcon"
        app:layout_constraintHorizontal_bias="0.583"
        app:layout_constraintStart_toStartOf="@+id/flightsIcon"
        app:layout_constraintTop_toBottomOf="@+id/flightsIcon" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Rovers"
        app:layout_constraintEnd_toEndOf="@+id/roverIcon"
        app:layout_constraintStart_toStartOf="@+id/roverIcon"
        app:layout_constraintTop_toBottomOf="@+id/roverIcon" />

    <TextView
        android:id="@+id/textView8"
        android:layout_width="124dp"
        android:layout_height="98dp"
        android:layout_marginStart="40dp"
        android:background="@color/teal_200"
        android:gravity="center"
        android:text="MARS"
        app:layout_constraintBottom_toBottomOf="@+id/imageView4"
        app:layout_constraintStart_toStartOf="@+id/imageView4"
        app:layout_constraintTop_toTopOf="@+id/imageView4" />

    <TextView
        android:id="@+id/textView7"
        android:layout_width="124dp"
        android:layout_height="98dp"
        android:layout_marginEnd="40dp"
        android:background="@color/teal_200"
        android:gravity="center"
        android:text="DCA"
        app:layout_constraintBottom_toBottomOf="@+id/imageView4"
        app:layout_constraintEnd_toEndOf="@+id/imageView4"
        app:layout_constraintTop_toTopOf="@+id/imageView4" />

    <ImageView
        android:id="@+id/imageView4"
        android:layout_width="60dp"
        android:layout_height="60dp"
        android:layout_marginBottom="28dp"
        app:layout_constraintBottom_toTopOf="@+id/guideline1"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:srcCompat="@drawable/double_arrows" />

    <androidx.constraintlayout.widget.Guideline
        android:id="@+id/guideline1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        app:layout_constraintGuide_begin="200dp" />

    <androidx.constraintlayout.widget.Guideline
        android:id="@+id/guideline2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        app:layout_constraintGuide_begin="20dp"
        app:layout_constraintGuide_percent="0.05" />

    <ImageView
        android:id="@+id/galaxyIcon"
        android:layout_width="90dp"
        android:layout_height="90dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@+id/guideline1"
        app:srcCompat="@drawable/galaxy" />

    <ImageView
        android:id="@+id/rocketIcon"
        android:layout_width="30dp"
        android:layout_height="30dp"
        app:layout_constraintBottom_toBottomOf="@+id/galaxyIcon"
        app:layout_constraintEnd_toStartOf="@+id/galaxyIcon"
        app:layout_constraintTop_toTopOf="@+id/galaxyIcon"
        app:srcCompat="@drawable/rocket_icon"
        app:layout_constraintCircle = "@id/galaxyIcon"
        app:layout_constraintCircleAngle = "270"
        app:layout_constraintCircleRadius = "100dp"/>

    <Switch
        android:id="@+id/switch1"
        android:layout_width="160dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="200dp"
        android:background="@color/purple_200"
        android:text="One Way"
        app:layout_constraintStart_toStartOf="@+id/guideline2"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView9"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="16dp"
        android:background="@color/purple_200"
        android:text="One Traveller"
        app:layout_constraintStart_toStartOf="@+id/guideline2"
        app:layout_constraintTop_toBottomOf="@+id/switch1" />

    <Button
        android:id="@+id/button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="76dp"
        android:background="@color/teal_200"
        android:text="DEPART"
        app:layout_constraintBottom_toBottomOf="parent"
        tools:layout_editor_absoluteX="0dp" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

