package com.example.gsoinfoappoberflaechefuergaeste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SchulRegeln extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schul_regeln);
        pdfView = (PDFView) findViewById(R.id.pdfvistest);

        pdfView.fromAsset( "Test_PDF.pdf").load();
    }
}