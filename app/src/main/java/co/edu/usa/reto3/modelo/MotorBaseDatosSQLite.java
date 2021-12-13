package co.edu.usa.reto3.modelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MotorBaseDatosSQLite extends SQLiteOpenHelper {

    public MotorBaseDatosSQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Creación de la tabla favoritos
        db.execSQL("CREATE TABLE favoritos (id INT, titulo TEXT, descripcion TEXT)");
        //db.execSQL("INSERT INTO favoritos VALUES (2, 'Chaqueta de cuero', 'Chaqueta tradicional de cuero de vaca curado')");
        //Lleno la base de datos

        // Creación de la tabla Productos
        db.execSQL("CREATE TABLE productos (id INT, titulo TEXT, descripcion TEXT)");
        //Lleno la base de datos
        db.execSQL("INSERT INTO productos VALUES (0, 'Chaqueta denim', 'Chaqueta en tela de jean')");
        db.execSQL("INSERT INTO productos VALUES (1, 'Chaqueta impermeable', 'Chaqueta en polipropileno 99% resistente al agua')");
        db.execSQL("INSERT INTO productos VALUES (2, 'Chaqueta de cuero', 'Chaqueta tradicional de cuero de vaca curado')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE productos");
        db.execSQL("DROP TABLE favoritos");
        onCreate(db);
    }
}
