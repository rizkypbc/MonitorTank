package rizky.android.com.monitortank;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class DetailActivity extends AppCompatActivity {

    int year, day, month;
    Calendar mcurrentDate;
    private ImageView imageViewTanki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_detail);

        final LineChart lineChart = (LineChart) findViewById(R.id.lineChart);

        ArrayList<Entry> entries = new ArrayList<> ();
        entries.add (new Entry (14.792f,0));
        entries.add (new Entry (14.789f,1));
        entries.add (new Entry (14.786f,2));
        entries.add (new Entry (14.783f,3));
        entries.add (new Entry (14.780f,4));
        entries.add (new Entry (14.777f,5));
        entries.add (new Entry (14.774f,6));
        entries.add (new Entry (14.771f,7));
        entries.add (new Entry (14.768f,8));
        entries.add (new Entry (14.765f,9));
        entries.add (new Entry (14.762f,10));
        entries.add (new Entry (14.759f,11));
        entries.add (new Entry (14.756f,12));
        entries.add (new Entry (14.753f,13));
        entries.add (new Entry (14.750f,14));
        entries.add (new Entry (14.747f,15));
        entries.add (new Entry (14.744f,16));
        entries.add (new Entry (14.741f,17));
        entries.add (new Entry (14.738f,18));
        entries.add (new Entry (14.735f,19));
        entries.add (new Entry (14.732f,20));
        entries.add (new Entry (14.729f,21));
        entries.add (new Entry (14.726f,22));
        entries.add (new Entry (14.723f,23));
        entries.add (new Entry (14.720f,24));
        entries.add (new Entry (14.717f,25));
        entries.add (new Entry (14.714f,26));
        entries.add (new Entry (14.711f,27));
        entries.add (new Entry (14.708f,28));
        entries.add (new Entry (14.705f,29));
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



        imageViewTanki = (ImageView) findViewById (R.id.imageViewTanki);
        final TextView textViewTanggal = (TextView) findViewById (R.id.textDate);
        Button btnDatePicker = (Button) findViewById (R.id.btnDatePicker);

        mcurrentDate = Calendar.getInstance ();
        SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
        String strDate = dateFormat.format (mcurrentDate.getTime ());
        textViewTanggal.setText (strDate);


        btnDatePicker.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                mcurrentDate = Calendar.getInstance ();
                year = mcurrentDate.get (Calendar.YEAR);
                month = mcurrentDate.get (Calendar.MONTH);
                day = mcurrentDate.get (Calendar.DAY_OF_MONTH);

                final DatePickerDialog mDatePicker = new DatePickerDialog (DetailActivity.this, new DatePickerDialog.OnDateSetListener () {
                    @Override
                    public void onDateSet(DatePicker datepicker, int selectedyear, int selectedmonth, int selectedday) {

//                        textViewTanggal.setText (new StringBuilder().append(year).append("-").append(month+1).append("-").append(day));
//                        textViewTanggal.setText (new StringBuilder().append(selectedyear).append("-").append(selectedmonth+1).append("-").append(selectedday));
//                        int month_k = selectedmonth+1;

                        String date = String.valueOf (selectedyear) + "-" + String.valueOf (selectedmonth + 1)
                                + "-" + String.valueOf (selectedday);
                        textViewTanggal.setText (date);

                        String  example792 = "2018-10-1" , example789 = "2018-10-2", example786 = "2018-10-3", example783 = "2018-10-4" ,
                                example780 = "2018-10-5", example777 = "2018-10-6", example774 = "2018-10-7", example771 = "2018-10-8",
                                example768 = "2018-10-9", example765 = "2018-10-10", example762 = "2018-10-11", example759 = "2018-10-12",
                                example756 = "2018-10-13", example753 = "2018-10-14", example750 = "2018-10-15", example747 = "2018-10-16",
                                example744 = "2018-10-17", example741 = "2018-10-18", example738 = "2018-10-19", example735 = "2018-10-20",
                                example732 = "2018-10-21", example729 = "2018-10-22", example726 = "2018-10-23", example723 = "2018-10-24",
                                example720 = "2018-10-25", example717 = "2018-10-26", example714 = "2018-10-27", example711 = "2018-10-28",
                                example708 = "2018-10-29", example705 = "2018-10-30";


                        if (example744.equals (textViewTanggal.getText ().toString ())) {

                            imageViewTanki.setImageResource (R.drawable.tanki_14744);

                            ArrayList<Entry> entries = new ArrayList<> ();
                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example747.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14747);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example750.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14750);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example753.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14753);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example756.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14756);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example759.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14759);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example762.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14762);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example765.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14765);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example768.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14768);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));

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


                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example771.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14771);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));

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


                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example774.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14774);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String>();

                            labels.add("2018/10/1");
                            labels.add("2018/10/2");
                            labels.add("2018/10/3");
                            labels.add("2018/10/4");
                            labels.add("2018/10/5");
                            labels.add("2018/10/6");
                            labels.add("2018/10/7");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example777.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14777);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String>();

                            labels.add("2018/10/1");
                            labels.add("2018/10/2");
                            labels.add("2018/10/3");
                            labels.add("2018/10/4");
                            labels.add("2018/10/5");
                            labels.add("2018/10/6");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example780.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14780);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String>();

                            labels.add("2018/10/1");
                            labels.add("2018/10/2");
                            labels.add("2018/10/3");
                            labels.add("2018/10/4");
                            labels.add("2018/10/5");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example783.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14783);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String>();

                            labels.add("2018/10/1");
                            labels.add("2018/10/2");
                            labels.add("2018/10/3");
                            labels.add("2018/10/4");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example786.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14786);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String>();

                            labels.add("2018/10/1");
                            labels.add("2018/10/2");
                            labels.add("2018/10/3");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example789.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14789);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String>();

                            labels.add("2018/10/1");
                            labels.add("2018/10/2");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example792.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14792);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));

                            LineDataSet dataSet = new LineDataSet (entries, "Isi Tanki (liter)");

                            ArrayList<String> labels = new ArrayList<String>();

                            labels.add("2018/10/1");

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example741.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14741);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));
                            entries.add (new Entry (14.741f,17));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example738.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14738);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));
                            entries.add (new Entry (14.741f,17));
                            entries.add (new Entry (14.738f,18));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example735.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14735);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));
                            entries.add (new Entry (14.741f,17));
                            entries.add (new Entry (14.738f,18));
                            entries.add (new Entry (14.735f,19));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example732.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14732);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));
                            entries.add (new Entry (14.741f,17));
                            entries.add (new Entry (14.738f,18));
                            entries.add (new Entry (14.735f,19));
                            entries.add (new Entry (14.732f,20));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example729.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14729);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));
                            entries.add (new Entry (14.741f,17));
                            entries.add (new Entry (14.738f,18));
                            entries.add (new Entry (14.735f,19));
                            entries.add (new Entry (14.732f,20));
                            entries.add (new Entry (14.729f,21));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example726.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14726);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));
                            entries.add (new Entry (14.741f,17));
                            entries.add (new Entry (14.738f,18));
                            entries.add (new Entry (14.735f,19));
                            entries.add (new Entry (14.732f,20));
                            entries.add (new Entry (14.729f,21));
                            entries.add (new Entry (14.726f,22));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example723.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14723);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));
                            entries.add (new Entry (14.741f,17));
                            entries.add (new Entry (14.738f,18));
                            entries.add (new Entry (14.735f,19));
                            entries.add (new Entry (14.732f,20));
                            entries.add (new Entry (14.729f,21));
                            entries.add (new Entry (14.726f,22));
                            entries.add (new Entry (14.723f,23));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example720.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14720);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));
                            entries.add (new Entry (14.741f,17));
                            entries.add (new Entry (14.738f,18));
                            entries.add (new Entry (14.735f,19));
                            entries.add (new Entry (14.732f,20));
                            entries.add (new Entry (14.729f,21));
                            entries.add (new Entry (14.726f,22));
                            entries.add (new Entry (14.723f,23));
                            entries.add (new Entry (14.720f,24));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example717.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14717);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));
                            entries.add (new Entry (14.741f,17));
                            entries.add (new Entry (14.738f,18));
                            entries.add (new Entry (14.735f,19));
                            entries.add (new Entry (14.732f,20));
                            entries.add (new Entry (14.729f,21));
                            entries.add (new Entry (14.726f,22));
                            entries.add (new Entry (14.723f,23));
                            entries.add (new Entry (14.720f,24));
                            entries.add (new Entry (14.717f,25));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example714.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14714);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));
                            entries.add (new Entry (14.741f,17));
                            entries.add (new Entry (14.738f,18));
                            entries.add (new Entry (14.735f,19));
                            entries.add (new Entry (14.732f,20));
                            entries.add (new Entry (14.729f,21));
                            entries.add (new Entry (14.726f,22));
                            entries.add (new Entry (14.723f,23));
                            entries.add (new Entry (14.720f,24));
                            entries.add (new Entry (14.717f,25));
                            entries.add (new Entry (14.714f,26));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example711.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14711);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));
                            entries.add (new Entry (14.741f,17));
                            entries.add (new Entry (14.738f,18));
                            entries.add (new Entry (14.735f,19));
                            entries.add (new Entry (14.732f,20));
                            entries.add (new Entry (14.729f,21));
                            entries.add (new Entry (14.726f,22));
                            entries.add (new Entry (14.723f,23));
                            entries.add (new Entry (14.720f,24));
                            entries.add (new Entry (14.717f,25));
                            entries.add (new Entry (14.714f,26));
                            entries.add (new Entry (14.711f,27));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example708.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14708);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));
                            entries.add (new Entry (14.741f,17));
                            entries.add (new Entry (14.738f,18));
                            entries.add (new Entry (14.735f,19));
                            entries.add (new Entry (14.732f,20));
                            entries.add (new Entry (14.729f,21));
                            entries.add (new Entry (14.726f,22));
                            entries.add (new Entry (14.723f,23));
                            entries.add (new Entry (14.720f,24));
                            entries.add (new Entry (14.717f,25));
                            entries.add (new Entry (14.714f,26));
                            entries.add (new Entry (14.711f,27));
                            entries.add (new Entry (14.708f,28));

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

                            LineData data = new LineData (labels, dataSet);
                            lineChart.setData (data);
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        } else if (example705.equals (textViewTanggal.getText ().toString ())){

                            imageViewTanki.setImageResource (R.drawable.tanki_14705);

                            ArrayList<Entry> entries = new ArrayList<> ();

                            entries.add (new Entry (14.792f,0));
                            entries.add (new Entry (14.789f,1));
                            entries.add (new Entry (14.786f,2));
                            entries.add (new Entry (14.783f,3));
                            entries.add (new Entry (14.780f,4));
                            entries.add (new Entry (14.777f,5));
                            entries.add (new Entry (14.774f,6));
                            entries.add (new Entry (14.771f,7));
                            entries.add (new Entry (14.768f,8));
                            entries.add (new Entry (14.765f,9));
                            entries.add (new Entry (14.762f,10));
                            entries.add (new Entry (14.759f,11));
                            entries.add (new Entry (14.756f,12));
                            entries.add (new Entry (14.753f,13));
                            entries.add (new Entry (14.750f,14));
                            entries.add (new Entry (14.747f,15));
                            entries.add (new Entry (14.744f,16));
                            entries.add (new Entry (14.741f,17));
                            entries.add (new Entry (14.738f,18));
                            entries.add (new Entry (14.735f,19));
                            entries.add (new Entry (14.732f,20));
                            entries.add (new Entry (14.729f,21));
                            entries.add (new Entry (14.726f,22));
                            entries.add (new Entry (14.723f,23));
                            entries.add (new Entry (14.720f,24));
                            entries.add (new Entry (14.717f,25));
                            entries.add (new Entry (14.714f,26));
                            entries.add (new Entry (14.711f,27));
                            entries.add (new Entry (14.708f,28));
                            entries.add (new Entry (14.705f,29));

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
                            lineChart.notifyDataSetChanged ();
                            lineChart.invalidate ();

                        }

                    }
                }, year, month, day);
                mDatePicker.setTitle ("Please Select Date");
                mDatePicker.getDatePicker ().setMaxDate (System.currentTimeMillis ());
                mDatePicker.show ();
            }
        });
    }

}
