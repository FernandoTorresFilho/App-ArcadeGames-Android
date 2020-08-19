package com.example.arcadegamesbancodedados;

import androidx.appcompat.app.AppCompatActivity;

        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteException;
        import android.database.sqlite.SQLiteOpenHelper;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;


public class ConsoleDetalhes extends AppCompatActivity {

    public static final String EXTRA_CONSOLENO = "consoleNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_console_detalhes);

        int consoleNo = (Integer) getIntent().getExtras().get(EXTRA_CONSOLENO);

//        Console console = Console.consoles[consoleNo];
//
//        ImageView photo = findViewById(R.id.photo);
//        photo.setImageResource(console.getImageResourceId());
//        photo.setContentDescription(console.getName());
//
//        TextView name = findViewById(R.id.name);
//        name.setText(console.getName());
//
//        TextView description = findViewById(R.id.description);
//        description.setText(console.getDescription());


//Create a cursor
        SQLiteOpenHelper arcadegamesDataHelper = new ArcadegamesDataHelper(this);
        try {
            SQLiteDatabase db = arcadegamesDataHelper.getReadableDatabase();
            Cursor cursor = db.query("produto",
                    new String[]{"NAME", "DESCRIPTION", "IMAGE_RESOURCE_ID"},
                    "_id = ?", new String[]{Integer.toString(consoleNo)},
                    null, null, null);

            //Alimentando as views com informações do banco de dados
            if (cursor.moveToFirst()) {
                String nameText = cursor.getString(0);
                String descriptionText = cursor.getString(1);
                int photoId = cursor.getInt(2);

                TextView name = (TextView) findViewById(R.id.name);
                name.setText(nameText);

                TextView description = (TextView) findViewById(R.id.description);
                description.setText(descriptionText);

                ImageView photo = (ImageView) findViewById(R.id.photo);
                photo.setImageResource(photoId);
                photo.setContentDescription(nameText);
            }

        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Database " + "unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
