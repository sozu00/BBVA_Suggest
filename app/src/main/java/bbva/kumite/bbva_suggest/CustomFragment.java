package bbva.kumite.bbva_suggest;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class CustomFragment extends Fragment {
    List<Recommendation> recommendations = new ArrayList<>();

    public static CustomFragment newInstance(List<Recommendation> rec) {
        CustomFragment fragment = new CustomFragment();
        fragment.recommendations = rec;
        return fragment;
    }

}
