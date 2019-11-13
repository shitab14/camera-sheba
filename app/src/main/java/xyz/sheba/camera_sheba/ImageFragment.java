package xyz.sheba.camera_sheba;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//import butterknife.BindView;
//import butterknife.ButterKnife;

/**
 * Created by Shitab Mir on 13,November,2019
 */

public class ImageFragment extends Fragment {

    private Bitmap bitmap;

    //@BindView(R.id.ivPreview)
    ImageView ivPreview;

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
        //ButterKnife.bind(this, view);

        ivPreview = view.findViewById(R.id.ivPreview);

        //check if bitmap exist, set to ImageView
        if (bitmap != null) {
            ivPreview.setImageBitmap(bitmap);
            /*String info = "image with:" + bitmap.getWidth() + "\n" + "image height:" + bitmap.getHeight();
            resPhotoSize.setText(info);*/
        }
        return view;
    }
}
