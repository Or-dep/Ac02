package com.example.acs.ui.gallery;

import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.acs.R;

public class GalleryFragment extends Fragment {

    //private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View galleryView = inflater.inflate(R.layout.fragment_gallery, container, false);


        return galleryView;
    }

}
