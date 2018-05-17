package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int skor_a = 0;
    int skor_b = 0;

    public void tigaPoinTimA(View view) {
        final int tambahTiga = 3;
        skor_a = skor_a + tambahTiga;
        gantiSkorTimA(skor_a);
    }

    public void duaPoinTimA(View view) {
        final int tambahDua = 2;
        skor_a = skor_a + tambahDua;
        gantiSkorTimA(skor_a);
    }

    public void satuPoinTimA(View view) {
        final int tambahSatu = 1;
        skor_a = skor_a + tambahSatu;
        gantiSkorTimA(skor_a);
    }

    public void tigaPoinTimB(View v) {
        final int tambahTiga = 3;
        skor_b = skor_b + tambahTiga;
        gantiSkorTimB(skor_b);
    }

    public void duaPoinTimB(View v) {
        final int tambahDua = 2;
        skor_b = skor_b + tambahDua;
        gantiSkorTimB(skor_b);
    }

    public void satuPoinTimB(View v) {
        final int tambahSatu = 1;
        skor_b = skor_b + tambahSatu;
        gantiSkorTimB(skor_b);

    }

    public void clickReset(View v) {
        final int resetToZero = 0;
        skor_a = resetToZero;
        skor_b = resetToZero;
        gantiSkorTimA(skor_a);
        gantiSkorTimB(skor_b);

    }

    private void gantiSkorTimA(int nilai) {
        TextView varnilai = findViewById(R.id.team_a_score);
        varnilai.setText(String.valueOf(nilai));
    }

    private void gantiSkorTimB(int nilai) {
        TextView varnilai = findViewById(R.id.team_b_score);
        varnilai.setText(String.valueOf(nilai));
    }
}
