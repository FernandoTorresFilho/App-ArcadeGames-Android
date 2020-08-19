package com.example.arcadegamesbancodedados;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.cursoradapter.widget.SimpleCursorAdapter;

public class ConsoleCategory extends ListActivity {

    private SQLiteDatabase db;
    private Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listConsole = getListView();

        SQLiteOpenHelper arcadegamesDataHelper = new ArcadegamesDataHelper(this);
        try{
            db = arcadegamesDataHelper.getReadableDatabase();
            cursor = db.query("produto", new String[]{"_id", "NAME"},
                    null, null, null, null, null);
            SimpleCursorAdapter listAdapter = new SimpleCursorAdapter(this,
                    android.R.layout.simple_list_item_1,
                    cursor,
                    new String[]{"NAME"},
                    new int[]{android.R.id.text1}, 0);
            listConsole.setAdapter(listAdapter);
        }   catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Database " + "unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }

//        ArrayAdapter<Console> listAdapter = new ArrayAdapter(
//                this, android.R.layout.simple_list_item_1, Console.consoles);
//        listConsole.setAdapter(listAdapter);
//        setContentView(R.layout.activity_console_category);
    }


    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(ConsoleCategory.this, ConsoleDetalhes.class);
        intent.putExtra(ConsoleDetalhes.EXTRA_CONSOLENO, (int) id);
        startActivity(intent);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        cursor.close();
        db.close();
    }
}

