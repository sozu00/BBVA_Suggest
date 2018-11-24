package bbva.kumite.bbva_suggest;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import static bbva.kumite.bbva_suggest.Utilities.categoriesSelected;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.ic_cat1, R.drawable.ic_cat2,
            R.drawable.ic_cat3, R.drawable.ic_cat4,
            R.drawable.ic_cat5, R.drawable.ic_cat6,
            R.drawable.ic_cat7, R.drawable.ic_cat8,
            R.drawable.ic_cat9
    };
    public ImageView[] imageViews;
    // Constructor
    public ImageAdapter(final Context c){
        mContext = c;
        imageViews = new ImageView[]{
                new ImageView(mContext), new ImageView(mContext), new ImageView(mContext),
                new ImageView(mContext), new ImageView(mContext), new ImageView(mContext),
                new ImageView(mContext), new ImageView(mContext), new ImageView(mContext)
        };
        for (int i = 0; i < imageViews.length; i++) {
            final int finalI = i;
            imageViews[i].setImageResource(mThumbIds[finalI]);
            imageViews[i].setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageViews[i].setPadding(10,10,10,10);
            imageViews[i].setLayoutParams(new GridView.LayoutParams(300, 300));

            ColorMatrix matrix = new ColorMatrix();
            matrix.setSaturation(categoriesSelected.get(finalI)? 1 : 0);
            ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
            imageViews[i].setColorFilter(filter);

            imageViews[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ColorMatrix matrix = new ColorMatrix();
                    matrix.setSaturation(categoriesSelected.get(finalI)? 0 : 1);

                    ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
                    imageViews[finalI].setColorFilter(filter);
                    Toast.makeText(c, categoriesSelected.get(finalI)? "Categoría eliminada" : "Categoría seleccionada", Toast.LENGTH_SHORT).show();
                    categoriesSelected.set(finalI, !categoriesSelected.get(finalI));
                }
            });
        }
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        return imageViews[position];
    }
}