package bbva.kumite.bbva_suggest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RecommendationsListAdapter extends SimpleAdapter {
    private final List<HashMap<String, Object>> elements;
    private final MainActivity myActivity;
    RecommendationsListAdapter(Context context, List<? extends Map<String, ?>> data, String[] from, int[] to) {
        super(context, data, R.layout.single_recommendation, from, to);
        myActivity = (MainActivity) context;
        elements = (List<HashMap<String, Object>>) data;
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        final View v = super.getView(position, convertView, parent);

        final HashMap<String, Object> recMap = elements.get(position);
       v.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               RecommendationDetail detail = new RecommendationDetail();
               Recommendation rec = new Recommendation();
               rec.mTitle = (String) recMap.get("mTitle");
               rec.mDescription = (String) recMap.get("mDescription");
               rec.mImageURL = (String) recMap.get("mImageURL");
               rec.mDate = (String) recMap.get("mDate");
               rec.mPhoneNumber = (String) recMap.get("mPhoneNumber");
               rec.mUrl = (String) recMap.get("mUrl");

               detail.setRecommendationData(rec);
               myActivity.setFragment(detail);
           }
        });
        return v;
    }

}
