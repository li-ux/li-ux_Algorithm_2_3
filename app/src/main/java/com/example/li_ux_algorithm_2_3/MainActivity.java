package com.example.li_ux_algorithm_2_3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView mExam2Question1TV;
    private TextView mExam2Question2TV;
    private TextView mExam2Question3TV;
    private TextView mExam3Question1TV;
    private TextView mExam3Question2TV;
    private TextView mExam3Question3TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mExam2Question1TV = (TextView) findViewById(R.id.exam2_question1_TV);
        mExam2Question2TV = (TextView) findViewById(R.id.exam2_question2_TV);
        mExam2Question3TV = (TextView) findViewById(R.id.exam2_question3_TV);
        mExam3Question1TV = (TextView) findViewById(R.id.exam3_question1_TV);
        mExam3Question2TV = (TextView) findViewById(R.id.exam3_question2_TV);
        mExam3Question3TV = (TextView) findViewById(R.id.exam3_question3_TV);
    }

    public void exam2_question1(){
        String[] str1 = {"Hello", "Hello", "Hello", "Hello", "Hello"};
        String[] str2 = {"Jack", "Tom", "Lee", "John", "Alisa"};
        String[] result_str = new String[str1.length];
        for (int i = 0; i < str1.length; i++) {
            result_str[i] = str1[i] + " " + str2[i];
        }
        String str = "";
        for (int i = 0; i < str1.length; i++) {
            str += result_str[i]+"  ";
        }
        mExam2Question1TV.setText(str);
    }

    public void exam2_question2(){
        int[] num_arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        List<Integer> odd_arr = new ArrayList<>();
        for (int i = 0; i < num_arr.length; i++) {
            if (num_arr[i]%2==0)
                odd_arr.add(num_arr[i]);
        }
        mExam2Question2TV.setText(odd_arr.toString());
    }

    public void exam2_question3(){
        new CollegeStudent(1, "张三", "Android");
    }

    public void exam3_question1(){

    }

    public void exam3_question2(){

    }

    public void exam3_question3(){

    }
}
