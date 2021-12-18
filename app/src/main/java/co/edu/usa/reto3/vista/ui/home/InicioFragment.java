package co.edu.usa.reto3.vista.ui.home;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URI;

import co.edu.usa.reto3.R;

public class InicioFragment extends Fragment {
    View v;
    Drawable drawable;
    ImageView imagenini;
    String TAG = "InicioFragment";
            ;

    public InicioFragment() {
    }

    @SuppressLint("WrongThread")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        v = inflater.inflate(R.layout.fragment_home,container,false);

        Resources res = getResources();
        drawable = res.getDrawable(R.drawable.inicioimg, v.getContext().getTheme());

        imagenini = (ImageView) v.findViewById(R.id.imagenini);
        imagenini.setImageDrawable(drawable);




        return v;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}