package com.example.a3_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,AdapterView.OnItemSelectedListener{
    ListView lv;
    Spinner spinner;
    TextView tv1,tv2,tv3,tv4;

    Student[] class1  = new Student[12];
    Student[] class2  = new Student[12];
    Student[] class3  = new Student[12];
    Student[] class4  = new Student[12];
    Student[] class5  = new Student[12];

    String[] names1 = new String[12];
    String[] names2 = new String[12];
    String[] names3 = new String[12];
    String[] names4 = new String[12];
    String[] names5 = new String[12];

    int kita;


    String[] classes_names = {"Select class: ","yud_alef1" , "yud_alef2" , "yud_alef3" ,"yud_alef4","yud_alef5" };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.lv);
        spinner = (Spinner)findViewById(R.id.spinner);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        lv.setOnItemClickListener(this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);


        spinner.setOnItemSelectedListener(this);
        createClass();
        createClassName();

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,classes_names);
        spinner.setAdapter(adp);


    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if(kita==1){

            ezer(class1,position);
        }
        else if(kita==2){
            ezer(class2,position);
        }
        else if(kita==3){
            ezer(class3,position);
        }
        else if(kita==4){
            ezer(class4,position);
        }
        else if(kita==5){
            ezer(class5,position);
        }

    }
    private void ezer(Student[] c ,int pos){
        tv1.setText("name: "+c[pos].getName());
        tv2.setText("last name: " +c[pos].getLast_name());
        tv3.setText("birth date: "+c[pos].getBirth_date());
        tv4.setText("phone number: "+c[pos].getPhone_number());
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position==1){
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, names1);
            lv.setAdapter(adapter);
        }
        else if(position==2){
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, names2);
            lv.setAdapter(adapter);

        }
        else if(position==3){
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, names3);
            lv.setAdapter(adapter);
        }
        else if(position==4){
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, names4);
            lv.setAdapter(adapter);
        }
        else if(position==5){
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, names5);
            lv.setAdapter(adapter);
        }
        else{
            lv.setAdapter(null);
            tv1.setText("");
            tv2.setText("");
            tv3.setText("");
            tv4.setText("");

        }
        kita = position;

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    private void createClass(){
        class1[0] = new Student("Darnell","Borkholder","21/4/2005","0574596784");
        class1[1] = new Student("Frances","Maldonado","15/1/2005","0571758406");
        class1[2] = new Student("Kathy","King","24/8/2005","0540712189");
        class1[3] = new Student("Dave","Price","12/3/2005","0593311557");
        class1[4] = new Student("Thanh","Ford","9/11/2005","0564899232");
        class1[5] = new Student("Lena","Vogler","19/5/2005","0562139370");
        class1[6] = new Student("Octavia","Elliott","5/6/2005","0571556998");
        class1[7] = new Student("Kenneth","Jefferson","3/1/2005","0537641666");
        class1[8] = new Student("Ruben","Hernandez","7/8/2005","0533740622");
        class1[9] = new Student("Tammy","Fairley","3/11/2005","0511120735");
        class1[10] = new Student("Germaine","Muse","27/8/2005","0514776136");
        class1[11] = new Student("Karen","Griffitts","17/3/2005","0595976806");

        class2[0] = new Student("Craig","Warren","1/6/2005","0521473330");
        class2[1] = new Student("Jeffrey","Ravenell","22/2/2005","0528844995");
        class2[2] = new Student("Marc","Taylor","5/4/2005","0597386288");
        class2[3] = new Student("David","Lewis","22/4/2005","0530079873");
        class2[4] = new Student("Thomas","Patton","13/2/2005","0541158853");
        class2[5] = new Student("Cynthia","Mccray","17/8/2005","0510708561");
        class2[6] = new Student("Shannon","Reilly","20/1/2005","0566880833");
        class2[7] = new Student("Alice","Martin","13/5/2005","0591590237");
        class2[8] = new Student("Edward","Ford","4/1/2005","0547446832");
        class2[9] = new Student("Melissa","Harrison","23/8/2005","0558455777");
        class2[10] = new Student("Frederick","Chamberlain","18/10/2005","0534223921");
        class2[11] = new Student("Garrett","Meyer","5/9/2005","0580503355");

        class3[0] = new Student("Doris","Bunn","20/10/2005","0530374902");
        class3[1] = new Student("Billy","Kidd","23/6/2005","0586998324");
        class3[2] = new Student("Charles","Greco","14/7/2005","0569380585");
        class3[3] = new Student("Carol","Aguayo","1/10/2005","0564358528");
        class3[4] = new Student("Christopher","Brown","19/6/2005","0599592520");
        class3[5] = new Student("Susan","Asakura","27/9/2005","0597115667");
        class3[6] = new Student("Pauline","Waters","27/10/2005","0591330565");
        class3[7] = new Student("Angela","Person","5/8/2005","0518899093");
        class3[8] = new Student("Kali","Moody","11/4/2005","0589290339");
        class3[9] = new Student("Ronald","Fitzwater","22/3/2005","0566112999");
        class3[10] = new Student("Adria","Duncan","13/7/2005","0515381588");
        class3[11] = new Student("Sandy","Winfrey","7/10/2005","0584294716");

        class4[0] = new Student("Leonor","Hoy","16/11/2005","0516147138");
        class4[1] = new Student("Jose","Mages","4/5/2005","0513176968");
        class4[2] = new Student("Beatrice","Edwards","8/4/2005","0565062000");
        class4[3] = new Student("Hattie","Diaz","27/5/2005","0557927048");
        class4[4] = new Student("Eugene","Landefeld","21/5/2005","0512349252");
        class4[5] = new Student("Derrick","Cataldo","4/9/2005","0530557220");
        class4[6] = new Student("Nancy","Paulino","5/1/2005","0558107973");
        class4[7] = new Student("Christopher","Severs","10/7/2005","0573364816");
        class4[8] = new Student("Edward","Voeltner","6/6/2005","0541385117");
        class4[9] = new Student("Cecil","Daugherty","26/2/2005","0554352176");
        class4[10] = new Student("William","Flanagan","6/8/2005","0539718813");
        class4[11] = new Student("James","Zambrano","14/6/2005","0584398920");

        class5[0] = new Student("Susan","Evan","21/10/2005","0570757976");
        class5[1] = new Student("Jose","Doggett","20/7/2005","0573158002");
        class5[2] = new Student("Jeremy","Myers","18/9/2005","0545877891");
        class5[3] = new Student("Cheryl","Pratt","13/1/2005","0518755472");
        class5[4] = new Student("Andrew","Tagliarini","11/1/2005","0550626540");
        class5[5] = new Student("Terrence","Page","10/7/2005","0558200284");
        class5[6] = new Student("Linda","Dutton","13/6/2005","0588424494");
        class5[7] = new Student("Stacey","Bailey","2/3/2005","0518832216");
        class5[8] = new Student("Anna","Boone","11/6/2005","0546982281");
        class5[9] = new Student("Salvador","Roscioli","9/5/2005","0518724901");
        class5[10] = new Student("Thomas","Holliday","7/10/2005","0562912717");
        class5[11] = new Student("Tabetha","Baker","10/9/2005","0586290525");
    }
    private void createClassName(){
        for(int i= 0;i<12;i++){
            names1[i] = class1[i].getName()+" "+class1[i].getLast_name();
        }
        for(int i= 0;i<12;i++){
            names2[i] = class2[i].getName()+" "+class2[i].getLast_name();
        }
        for(int i= 0;i<12;i++){
            names3[i] = class3[i].getName()+" "+class3[i].getLast_name();
        }
        for(int i= 0;i<12;i++){
            names4[i] = class4[i].getName()+" "+class4[i].getLast_name();
        }
        for(int i= 0;i<12;i++){
            names5[i] = class5[i].getName()+" "+class5[i].getLast_name();
        }
    }
}