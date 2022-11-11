package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
    ListView lv;
    int count, ifNotPicked, classNum;
    Spinner s;
    TextView tv, tv1, tv2, tv3;
    String[] classes = {"Choose Class:", "YodA1", "YodA2", "YodA3", "Yoda4"};
    String[] class1 = {"Lebron James", "Stephen Curry", "Paolo Banchero", "Bol Bol", "Mohammed Bamba", "Zach Lavine", "Joel Embiid", "James Harden",
        "Jalen Suggs", "Albert Levy"};

    String[] class2 = {"Lionel Messi", "Cristiano Ronaldo", "Wayne Ronney", "Marcus Rashford", "Kylian Mbappe", "Erlind Haaland", "Maor Melikson",
    "Tomer Hemed", "Rotem Chatoel", "Albert Levy"};

    String[] class3 = {"Dudu Faruk", "Hen Porati", "Itay Lukach", "Itay Peled", "Liad Meir", "Ron Nesher", "Ravid Plotnik", "Itay Zvulun",
    "Tamir Bar", "Albert Levy"};

    String[] class4 = {"Ben Moore", "David Afieny", "Igor Kulshov", "Roy Paritzki", "Tadjin Keita", "Halil Ahmed",
    "Joaquin Schuchman", "Tomer Porat", "Neta Segal", "Albert Levy"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;
        tv = (TextView) findViewById(R.id.textView);
        tv1 = (TextView) findViewById(R.id.textView2);
        tv2 = (TextView) findViewById(R.id.textView3);
        tv3 = (TextView) findViewById(R.id.textView4);
        s = (Spinner) findViewById(R.id.spinner);
        lv = (ListView) findViewById(R.id.ListView);


        s.setOnItemSelectedListener(this);
        lv.setOnItemClickListener(this);

        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);


        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, classes);
        s.setAdapter(adp);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        System.out.println(i);
        switch (i)
        {
            case 0:
                Toast.makeText(MainActivity.this, "Please choose a class", Toast.LENGTH_SHORT).show();
                lv.setAdapter(null);
                break;
            case 1:
                ArrayAdapter<String> adp1 = new ArrayAdapter<String>(this,
                        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, class1);
                lv.setAdapter(adp1);
                classNum = 1;
                break;
            case 2:
                ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this,
                        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, class2);
                lv.setAdapter(adp2);
                classNum = 2;
                break;
            case 3:
                ArrayAdapter<String> adp3 = new ArrayAdapter<String>(this,
                        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, class3);
                lv.setAdapter(adp3);
                classNum = 3;
                break;
            case 4:
                ArrayAdapter<String> adp4 = new ArrayAdapter<String>(this,
                        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, class4);
                lv.setAdapter(adp4);
                classNum = 4;
                break;

        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        int index;
        Random rand = new Random();
        int day = 20, month = 0, year = 2006;


        System.out.println(classNum);

        switch(classNum) {
            case 1:
                index = class1[i].indexOf(' ');
                tv.setText(class1[i].substring(index, class1[i].length()));
                tv1.setText(class1[i].substring(0, index));
                tv2.setText(Integer.toString(day + i + 1) + "/" + Integer.toString(month + i + 1) + "/2006");
                tv3.setText("05449087" + Integer.toString(i));
                break;
            case 2:
                index = class2[i].indexOf(' ');
                tv.setText(class2[i].substring(index, class2[i].length()));
                tv1.setText(class2[i].substring(0, index));
                tv2.setText(Integer.toString(day + i + 2) + "/" + Integer.toString(month + i + 1) + "/2006");
                tv3.setText("0544908" + Integer.toString(i) + "0");
                break;
            case 3:
                index = class3[i].indexOf(' ');
                tv.setText(class3[i].substring(index, class3[i].length()));
                tv1.setText(class3[i].substring(0, index));
                tv2.setText(Integer.toString(day + i) + "/" + Integer.toString(month + i + 2) + "/2006");
                tv3.setText("0544908" + Integer.toString(i) + "1");
                break;
            case 4:
                index = class4[i].indexOf(' ');
                tv.setText(class4[i].substring(index, class4[i].length()));
                tv1.setText(class4[i].substring(0, index));
                tv2.setText(Integer.toString(day + i + 1) + "/" + Integer.toString(month + i + 2) + "/2006");
                tv3.setText("0544908" + Integer.toString(i) + "2");
                break;
        }




        }

}