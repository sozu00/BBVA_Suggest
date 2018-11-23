package bbva.kumite.bbva_suggest;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

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
    public Boolean[] mBWImages = {
            true, true, true,
            true, true, true,
            true, true, true
    };

    public ImageView[] imageViews;
    // Constructor
    public ImageAdapter(Context c){
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
            matrix.setSaturation(mBWImages[finalI]? 0 : 1);
            ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
            imageViews[i].setColorFilter(filter);

            imageViews[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ColorMatrix matrix = new ColorMatrix();
                    matrix.setSaturation(mBWImages[finalI]? 0 : 1);

                    ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
                    imageViews[finalI].setColorFilter(filter);
                    mBWImages[finalI] = !mBWImages[finalI];
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


    private ImageView setImageBW(boolean isBW, ImageView imageView){
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(isBW? 0 : 1);

        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
        imageView.setColorFilter(filter);

        return imageView;
    }
}