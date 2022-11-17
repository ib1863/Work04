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
    String[][] names = {{"Lebron", "Stephen", "Paolo", "Bol", "Mohammed", "Zach", "Joel", "James",
        "Jalen", "Albert"},
            {"Lionel", "Cristiano", "Wayne", "Marcus", "Kylian", "Erlind", "Maor",
            "Tomer ", "Rotem ", "Albert"},
            {"Dudu", "Hen", "Itay", "Itay", "Liad", "Ron", "Ravid", "Itay",
            "Tamir", "Albert"},
            {"Ben", "David", "Igor", "Roy", "Tadjin", "Halil",
            "Joaquin", "Tomer", "Neta", "Albert"}};

    String[][] familyNames = {{"James", "Curry", "Banchero", "Bol", "Bamba", "Lavine", "Embiid",
            "Harden", "Suggs", "Levy"}, {"Messi", "Ronaldo", "Rooney", "Rashford",
            "Mbappe", "Haaland", "Melikson", "Hemed", "Chatoel", "Levy"},
            {"Faruk", "Porati", "Lukach", "Peled", "Meir", "Nesher", "Plotnik",
                    "Zvulun", "Bar", "Levy"},
            {"Moore", "Afieny", "Kulshov", "Paritzki", "Keita", "Ahmed",
                    "Schuchman", "Porat", "Segal", "Levy"}};

    String[][] phoneNum = {{"0544771601", "0544771602", "0544771603", "0544771604",
            "0544771605", "0544771606", "0544771607", "0544771608", "05447716089", "0544771610"},
            {"0544771611", "0544771612", "0544771613", "0544771614", "0544771615", "0544771616", "0544771617",
                    "0544771618", "0544771619", "0544771620"},
            {"0544771621", "0544771622", "0544771623", "0544771624", "0544771625", "0544771626", "0544771627",
                    "0544771628", "0544771629", "0544771630"},
            {"0544771631", "0544771632", "0544771633", "0544771634", "0544771635", "0544771636", "0544771637",
                    "0544771638", "0544771639", "0544771640"}};

    String[][] birthDay = {{"1/1/2006", "2/1/2006", "3/1/2006", "4/1/2006", "5/1/2006", "6/1/2006", "7/1/2006", "8/1/2006",
            "9/1/2006", "10/1/2006"},
            {"1/2/2006", "2/2/2006", "3/2/2006", "4/2/2006", "5/2/2006", "6/2/2006", "7/2/2006", "8/2/2006",
                    "9/2/2006", "10/2/2006"},
            {"1/3/2006", "2/3/2006", "3/3/2006", "4/3/2006", "5/3/2006", "6/3/2006", "7/3/2006", "8/3/2006",
                    "9/3/2006", "10/3/2006"},
            {"1/4/2006", "2/4/2006", "3/4/2006", "4/4/2006", "5/4/2006", "6/4/2006", "7/4/2006", "8/4/2006",
                    "9/4/2006", "10/4/2006"}};



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
        switch (i)
        {
            case 0:
                Toast.makeText(MainActivity.this, "Please choose a class", Toast.LENGTH_SHORT).show();
                lv.setAdapter(null);
                tv.setText("");
                tv1.setText("");
                tv2.setText("");
                tv3.setText("");
                break;
            case 1:
                ArrayAdapter<String> adp1 = new ArrayAdapter<String>(this,
                        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, names[0]);
                lv.setAdapter(adp1);
                classNum = 1;
                break;
            case 2:
                ArrayAdapter<String> adp2 = new ArrayAdapter<String>(this,
                        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, names[1]);
                lv.setAdapter(adp2);
                classNum = 2;
                break;
            case 3:
                ArrayAdapter<String> adp3 = new ArrayAdapter<String>(this,
                        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, names[2]);
                lv.setAdapter(adp3);
                classNum = 3;
                break;
            case 4:
                ArrayAdapter<String> adp4 = new ArrayAdapter<String>(this,
                        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, names[3]);
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
        switch(classNum) {
            case 1:
                tv.setText(names[0][i]);
                tv1.setText(familyNames[0][i]);
                tv2.setText(birthDay[0][i]);
                tv3.setText(phoneNum[0][i]);
                break;
            case 2:
                tv.setText(names[1][i]);
                tv1.setText(familyNames[1][i]);
                tv2.setText(birthDay[1][i]);
                tv3.setText(phoneNum[1][i]);
                break;
            case 3:
                tv.setText(names[2][i]);
                tv1.setText(familyNames[2][i]);
                tv2.setText(birthDay[2][i]);
                tv3.setText(phoneNum[2][i]);
                break;
            case 4:
                tv.setText(names[3][i]);
                tv1.setText(familyNames[3][i]);
                tv2.setText(birthDay[3][i]);
                tv3.setText(phoneNum[3][i]);
                break;
        }




        }

}