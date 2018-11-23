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
        //final RecommendationData u = (RecommendationData) elements.get(position).get("data");
        return v;
    }

}
