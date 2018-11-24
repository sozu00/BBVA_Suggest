package bbva.kumite.bbva_suggest;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.InputStream;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RecommendationDetail.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RecommendationDetail#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecommendationDetail extends Fragment {
    private OnFragmentInteractionListener mListener;
    Recommendation rec;
    public RecommendationDetail() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment RecommendationDetail.
     */
    // TODO: Rename and change types and number of parameters
    public static RecommendationDetail newInstance(String param1, String param2) {
        RecommendationDetail fragment = new RecommendationDetail();
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
        View v = inflater.inflate(R.layout.fragment_recommendation_detail, container, false);

        ImageView image = v.findViewById(R.id.recommImg);
        TextView title = v.findViewById(R.id.recommTitle);
        TextView date = v.findViewById(R.id.recommDate);
        TextView description = v.findViewById(R.id.recommDesciption);
        RelativeLayout contactFrame = v.findViewById(R.id.recommContact);
        final TextView phone = v.findViewById(R.id.recommContactPhone);
        RelativeLayout URL = v.findViewById(R.id.recommURL);
        final TextView url = v.findViewById(R.id.recommURLText);

        new DownloadImageTask(image)
                .execute(rec.mImageURL);

        title.setText(rec.mTitle);
        date.setText(rec.mDate);
        description.setText(rec.mDescription);
        phone.setText(rec.mPhoneNumber);
        url.setText(rec.mUrl);
        contactFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+phone.getText().toString()));
                // No explanation needed; request the permission
                while (ActivityCompat.checkSelfPermission(v.getContext(),Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions((MainActivity)v.getContext(), new String[]{Manifest.permission.CALL_PHONE}, 0);
                }

                v.getContext().startActivity(callIntent);
            }
        });

        URL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(url.getText().toString()));
                startActivity(intent);
            }
        });
        return v;
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

    public void setRecommendationData(Recommendation rec){
        this.rec = rec;
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}
