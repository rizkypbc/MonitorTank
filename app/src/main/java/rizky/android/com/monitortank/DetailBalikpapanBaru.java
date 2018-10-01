package rizky.android.com.monitortank;

import android.app.DatePickerDialog;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class DetailBalikpapanBaru extends AppCompatActivity {

    int year, day, month;
    Calendar mcurrentDate;
    private ImageView imageViewTanki;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_detail_balikpapan_baru);

        final LineChart lineChart = (LineChart) findViewById(R.id.lineChartBA);

        ArrayList<Entry> entries = new ArrayList<> ();
        entries.add (new Entry (4039,0));
        entries.add (new Entry (4036,1));
        entries.add (new Entry (4033,2));
        entries.add (new Entry (4030,3));
        entries.add (new Entry (4027,4));
        entries.add (new Entry (4024,5));
        entries.add (new Entry (4021,6));
        entries.add (new Entry (4017,7));
        entries.add (new Entry (4012,8));
        entries.add (new Entry (4009,9));
        entries.add (new Entry (4006,10));
        entries.add (new Entry (4003,11));
        entries.add (new Entry (4000,12));
        entries.add (new Entry (4000,13));
        entries.add (new Entry (4000,14));
        entries.add (new Entry (4000,15));
        entries.add (new Entry (4000,16));
        entries.add (new Entry (4000,17));
        entries.add (new Entry (4000,18));
        entries.add (new Entry (4000,19));
        entries.add (new Entry (4000,20));
        entries.add (new Entry (3980,21));
        entries.add (new Entry (3480,22));
        entries.add (new Entry (2680,23));
        entries.add (new Entry (2180,24));
        entries.add (new Entry (1280,25));
        entries.add (new Entry (580,26));
        entries.add (new Entry (330,27));
        entries.add (new Entry (30,28));
        entries.add (new Entry (0,29));
        LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");


        ArrayList<String> labels = new ArrayList<String>();
        labels.add("2018/10/1");
        labels.add("2018/10/2");
        labels.add("2018/10/3");
        labels.add("2018/10/4");
        labels.add("2018/10/5");
        labels.add("2018/10/6");
        labels.add("2018/10/7");
        labels.add("2018/10/8");
        labels.add("2018/10/9");
        labels.add("2018/10/10");
        labels.add("2018/10/11");
        labels.add("2018/10/12");
        labels.add("2018/10/13");
        labels.add("2018/10/14");
        labels.add("2018/10/15");
        labels.add("2018/10/16");
        labels.add("2018/10/17");
        labels.add("2018/10/18");
        labels.add("2018/10/19");
        labels.add("2018/10/20");
        labels.add("2018/10/21");
        labels.add("2018/10/22");
        labels.add("2018/10/23");
        labels.add("2018/10/24");
        labels.add("2018/10/25");
        labels.add("2018/10/26");
        labels.add("2018/10/27");
        labels.add("2018/10/28");
        labels.add("2018/10/29");
        labels.add("2018/10/30");
        LineData data = new LineData (labels, dataSet);
        lineChart.setData (data);
        lineChart.setDescription ("Data Isi Tanki");

        imageViewTanki = (ImageView) findViewById (R.id.imageBA);
        final TextView textViewDateBA = (TextView)findViewById (R.id.textDateBA);
        Button btnDatePickerBA = (Button) findViewById (R.id.btnDatePickerBA);

        mcurrentDate = Calendar.getInstance ();
        SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
        String strDate = dateFormat.format (mcurrentDate.getTime ());
        textViewDateBA.setText (strDate);

        btnDatePickerBA.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                mcurrentDate = Calendar.getInstance ();
                year = mcurrentDate.get(Calendar.YEAR);
                month = mcurrentDate.get (Calendar.MONTH);
                day = mcurrentDate.get (Calendar.DAY_OF_MONTH);

                final DatePickerDialog datePickerDialog  = new DatePickerDialog (DetailBalikpapanBaru.this, new DatePickerDialog.OnDateSetListener () {
                    @Override
                    public void onDateSet(DatePicker datePicker, int selectedyear, int selectedmonth, int selectedday) {

                        String date = String.valueOf (selectedyear) + "-" + String.valueOf (selectedmonth + 1)
                                + "-" + String.valueOf (selectedday);
                        textViewDateBA.setText (date);

                        String  example4039 = "2018-10-1" , example4036 = "2018-10-2", example4033 = "2018-10-3", example4030 = "2018-10-4" ,
                                example4027 = "2018-10-5", example4024 = "2018-10-6", example4021 = "2018-10-7", example4017 = "2018-10-8",
                                example4012 = "2018-10-9", example4009 = "2018-10-10", example4006 = "2018-10-11", example4003 = "2018-10-12",
                                example4000 = "2018-10-13", example400014 = "2018-10-14", example400015 = "2018-10-15", example400016 = "2018-10-16",
                                example400017 = "2018-10-17", example400018 = "2018-10-18", example400019 = "2018-10-19", example400020 = "2018-10-20",
                                example400021 = "2018-10-21", example3980 = "2018-10-22", example3480 = "2018-10-23", example2680 = "2018-10-24",
                                example2180 = "2018-10-25", example1280 = "2018-10-26", example580 = "2018-10-27", example330 = "2018-10-28",
                                example30 = "2018-10-29", example0 = "2018-10-30";

                        if (example4039.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4039);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example4036.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4036);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example4033.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4033);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example4030.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4030);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example4027.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4027);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example4024.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4024);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example4021.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4021);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example4017.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4017);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));
                            entries.add (new Entry (4017, 6));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");
                            labels.add ("2018/10/8");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example4012.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4012);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));
                            entries.add (new Entry (4017, 7));
                            entries.add (new Entry (4012, 8));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");
                            labels.add ("2018/10/8");
                            labels.add ("2018/10/9");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example4009.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4009);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));
                            entries.add (new Entry (4017, 7));
                            entries.add (new Entry (4012, 8));
                            entries.add (new Entry (4009, 9));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");
                            labels.add ("2018/10/8");
                            labels.add ("2018/10/9");
                            labels.add ("2018/10/10");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example4006.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4006);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));
                            entries.add (new Entry (4017, 7));
                            entries.add (new Entry (4012, 8));
                            entries.add (new Entry (4009, 9));
                            entries.add (new Entry (4006, 10));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");
                            labels.add ("2018/10/8");
                            labels.add ("2018/10/9");
                            labels.add ("2018/10/10");
                            labels.add ("2018/10/11");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example4003.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4003);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));
                            entries.add (new Entry (4017, 7));
                            entries.add (new Entry (4012, 8));
                            entries.add (new Entry (4009, 9));
                            entries.add (new Entry (4006, 10));
                            entries.add (new Entry (4003, 11));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");
                            labels.add ("2018/10/8");
                            labels.add ("2018/10/9");
                            labels.add ("2018/10/10");
                            labels.add ("2018/10/11");
                            labels.add ("2018/10/12");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example4000.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4000);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));
                            entries.add (new Entry (4017, 7));
                            entries.add (new Entry (4012, 8));
                            entries.add (new Entry (4009, 9));
                            entries.add (new Entry (4006, 10));
                            entries.add (new Entry (4003, 11));
                            entries.add (new Entry (4000, 12));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");
                            labels.add ("2018/10/8");
                            labels.add ("2018/10/9");
                            labels.add ("2018/10/10");
                            labels.add ("2018/10/11");
                            labels.add ("2018/10/12");
                            labels.add ("2018/10/13");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example400014.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4000);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));
                            entries.add (new Entry (4017, 7));
                            entries.add (new Entry (4012, 8));
                            entries.add (new Entry (4009, 9));
                            entries.add (new Entry (4006, 10));
                            entries.add (new Entry (4003, 11));
                            entries.add (new Entry (4000, 12));
                            entries.add (new Entry (4000, 13));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");
                            labels.add ("2018/10/8");
                            labels.add ("2018/10/9");
                            labels.add ("2018/10/10");
                            labels.add ("2018/10/11");
                            labels.add ("2018/10/12");
                            labels.add ("2018/10/13");
                            labels.add ("2018/10/14");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        }  else if (example400015.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4000);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));
                            entries.add (new Entry (4017, 7));
                            entries.add (new Entry (4012, 8));
                            entries.add (new Entry (4009, 9));
                            entries.add (new Entry (4006, 10));
                            entries.add (new Entry (4003, 11));
                            entries.add (new Entry (4000, 12));
                            entries.add (new Entry (4000, 13));
                            entries.add (new Entry (4000, 14));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");
                            labels.add ("2018/10/8");
                            labels.add ("2018/10/9");
                            labels.add ("2018/10/10");
                            labels.add ("2018/10/11");
                            labels.add ("2018/10/12");
                            labels.add ("2018/10/13");
                            labels.add ("2018/10/14");
                            labels.add ("2018/10/15");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example400016.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4000);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));
                            entries.add (new Entry (4017, 7));
                            entries.add (new Entry (4012, 8));
                            entries.add (new Entry (4009, 9));
                            entries.add (new Entry (4006, 10));
                            entries.add (new Entry (4003, 11));
                            entries.add (new Entry (4000, 12));
                            entries.add (new Entry (4000, 13));
                            entries.add (new Entry (4000, 14));
                            entries.add (new Entry (4000, 15));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");
                            labels.add ("2018/10/8");
                            labels.add ("2018/10/9");
                            labels.add ("2018/10/10");
                            labels.add ("2018/10/11");
                            labels.add ("2018/10/12");
                            labels.add ("2018/10/13");
                            labels.add ("2018/10/14");
                            labels.add ("2018/10/15");
                            labels.add ("2018/10/16");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example400017.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4000);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));
                            entries.add (new Entry (4017, 7));
                            entries.add (new Entry (4012, 8));
                            entries.add (new Entry (4009, 9));
                            entries.add (new Entry (4006, 10));
                            entries.add (new Entry (4003, 11));
                            entries.add (new Entry (4000, 12));
                            entries.add (new Entry (4000, 13));
                            entries.add (new Entry (4000, 14));
                            entries.add (new Entry (4000, 15));
                            entries.add (new Entry (4000, 16));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");
                            labels.add ("2018/10/8");
                            labels.add ("2018/10/9");
                            labels.add ("2018/10/10");
                            labels.add ("2018/10/11");
                            labels.add ("2018/10/12");
                            labels.add ("2018/10/13");
                            labels.add ("2018/10/14");
                            labels.add ("2018/10/15");
                            labels.add ("2018/10/16");
                            labels.add ("2018/10/17");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example400018.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4000);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));
                            entries.add (new Entry (4017, 7));
                            entries.add (new Entry (4012, 8));
                            entries.add (new Entry (4009, 9));
                            entries.add (new Entry (4006, 10));
                            entries.add (new Entry (4003, 11));
                            entries.add (new Entry (4000, 12));
                            entries.add (new Entry (4000, 13));
                            entries.add (new Entry (4000, 14));
                            entries.add (new Entry (4000, 15));
                            entries.add (new Entry (4000, 16));
                            entries.add (new Entry (4000, 17));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");
                            labels.add ("2018/10/8");
                            labels.add ("2018/10/9");
                            labels.add ("2018/10/10");
                            labels.add ("2018/10/11");
                            labels.add ("2018/10/12");
                            labels.add ("2018/10/13");
                            labels.add ("2018/10/14");
                            labels.add ("2018/10/15");
                            labels.add ("2018/10/16");
                            labels.add ("2018/10/17");
                            labels.add ("2018/10/18");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example400019.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4000);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));
                            entries.add (new Entry (4017, 7));
                            entries.add (new Entry (4012, 8));
                            entries.add (new Entry (4009, 9));
                            entries.add (new Entry (4006, 10));
                            entries.add (new Entry (4003, 11));
                            entries.add (new Entry (4000, 12));
                            entries.add (new Entry (4000, 13));
                            entries.add (new Entry (4000, 14));
                            entries.add (new Entry (4000, 15));
                            entries.add (new Entry (4000, 16));
                            entries.add (new Entry (4000, 17));
                            entries.add (new Entry (4000, 18));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");
                            labels.add ("2018/10/8");
                            labels.add ("2018/10/9");
                            labels.add ("2018/10/10");
                            labels.add ("2018/10/11");
                            labels.add ("2018/10/12");
                            labels.add ("2018/10/13");
                            labels.add ("2018/10/14");
                            labels.add ("2018/10/15");
                            labels.add ("2018/10/16");
                            labels.add ("2018/10/17");
                            labels.add ("2018/10/18");
                            labels.add ("2018/10/19");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example400020.equals (textViewDateBA.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_4000);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (4039, 0));
                            entries.add (new Entry (4036, 1));
                            entries.add (new Entry (4033, 2));
                            entries.add (new Entry (4030, 3));
                            entries.add (new Entry (4027, 4));
                            entries.add (new Entry (4024, 5));
                            entries.add (new Entry (4021, 6));
                            entries.add (new Entry (4017, 7));
                            entries.add (new Entry (4012, 8));
                            entries.add (new Entry (4009, 9));
                            entries.add (new Entry (4006, 10));
                            entries.add (new Entry (4003, 11));
                            entries.add (new Entry (4000, 12));
                            entries.add (new Entry (4000, 13));
                            entries.add (new Entry (4000, 14));
                            entries.add (new Entry (4000, 15));
                            entries.add (new Entry (4000, 16));
                            entries.add (new Entry (4000, 17));
                            entries.add (new Entry (4000, 18));
                            entries.add (new Entry (4000, 19));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String> ();

                            labels.add ("2018/10/1");
                            labels.add ("2018/10/2");
                            labels.add ("2018/10/3");
                            labels.add ("2018/10/4");
                            labels.add ("2018/10/5");
                            labels.add ("2018/10/6");
                            labels.add ("2018/10/7");
                            labels.add ("2018/10/8");
                            labels.add ("2018/10/9");
                            labels.add ("2018/10/10");
                            labels.add ("2018/10/11");
                            labels.add ("2018/10/12");
                            labels.add ("2018/10/13");
                            labels.add ("2018/10/14");
                            labels.add ("2018/10/15");
                            labels.add ("2018/10/16");
                            labels.add ("2018/10/17");
                            labels.add ("2018/10/18");
                            labels.add ("2018/10/19");
                            labels.add ("2018/10/20");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        }

                    }
                }, year, month, day);
                datePickerDialog.setTitle ("Please Select Date");
                datePickerDialog.getDatePicker ().setMaxDate (System.currentTimeMillis ());
                datePickerDialog.show ();
            }
        });
    }
}
