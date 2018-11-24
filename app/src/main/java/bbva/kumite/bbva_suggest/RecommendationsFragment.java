package bbva.kumite.bbva_suggest;

import android.Manifest;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RecommendationsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RecommendationsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecommendationsFragment extends Fragment {
    private final List<HashMap<String, Object>> recommendationsMap = new ArrayList<>();
    ListView lv;
    private OnFragmentInteractionListener mListener;

    public RecommendationsFragment() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment RecommendationsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RecommendationsFragment newInstance(String param1) {
        RecommendationsFragment fragment = new RecommendationsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recomendation, container, false);

        TextView mainText = v.findViewById(R.id.textViewRecomm);
        setRecommendations();
        mainText.setText(Utilities.recommendations.size() == 0 ? "¡Lo sentimos mucho Carlos! No tenemos recomendaciones para tí, ¿has probado a seleccionar más categorías?" : "¡Hola Carlos! Tus recomendaciones de hoy son...");

        // Keys used in Hashmap
        String[] from = {"mCategory", "mTitle", "mDescription"};

        // Ids of views in listview_layout
        int[] to = {R.id.imgCategorySingle, R.id.textTitleSingle, R.id.textDescSingle};

        lv = v.findViewById(R.id.listRecommendations);
        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        final RecommendationsListAdapter adapter = new RecommendationsListAdapter(v.getContext(), recommendationsMap, from, to);
        ActivityCompat.requestPermissions(this.getActivity(),
                new String[]{Manifest.permission.INTERNET},
                0);
        lv.setAdapter(adapter);
        return v;
    }

    private void setRecommendations() {
        recommendationsMap.clear();
        Recommendation.getRecommendations();
        for (Recommendation rec : Utilities.recommendations) {
            HashMap<String, Object> hm = new HashMap<>();
            hm.put("mTitle", rec.mTitle);
            hm.put("mDescription", rec.mDescription);
            hm.put("mImageURL", rec.mImageURL);
            hm.put("mDate", rec.mDate);
            hm.put("mCategory", Utilities.findCategory(rec.mCategory));
            hm.put("mPhoneNumber", rec.mPhoneNumber);
            hm.put("mUrl", rec.mUrl);
            recommendationsMap.add(hm);
        }
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
