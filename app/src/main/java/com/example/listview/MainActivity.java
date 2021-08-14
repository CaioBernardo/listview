package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.idList);

        ArrayList<String> versoes = preenche();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, versoes);

        lista.setAdapter(arrayAdapter);

    }

    private ArrayList<String> preenche() {
        ArrayList<String> dados = new ArrayList<String>();

        dados.add("Cupcake");
        dados.add("Donut");
        dados.add("Eclair");
        dados.add("Froyo");
        dados.add("Gingerbread");
        dados.add("Honeycomb");
        dados.add("Ice Cream");
        dados.add("Sandwich");
        dados.add("Jelly Bean");
        dados.add("KitKat");
        dados.add("Lollipop");
        dados.add("Marshmallow");
        dados.add("Nougat");
        dados.add("oreo");
        dados.add("pie");

        return dados;

    }

}