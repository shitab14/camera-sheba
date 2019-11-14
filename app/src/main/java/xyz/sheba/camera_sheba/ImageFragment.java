package xyz.sheba.camera_sheba;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * Created by Shitab Mir on 13,November,2019
 */

public class ImageFragment extends Fragment {

    private Bitmap bitmap;

    ImageView ivPreview;

    Button btnTakePictureAgain, btnSubmit;

    public void imageSetupFragment(Bitmap bitmap) {
        if (bitmap != null) {
            this.bitmap = bitmap;
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_image, container, false);

        ivPreview = view.findViewById(R.id.ivPreview);

        btnTakePictureAgain = view.findViewById(R.id.btnTakePictureAgain);
        btnSubmit = view.findViewById(R.id.btnSubmit);

        btnTakePictureAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //check if bitmap exist, set to ImageView
        if (bitmap != null) {
            ivPreview.setImageBitmap(bitmap);
        }
        return view;
    }
}
