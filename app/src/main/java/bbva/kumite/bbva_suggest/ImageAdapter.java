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
            R.drawable.ic_books, R.drawable.ic_books,
            R.drawable.ic_books, R.drawable.ic_books,
            R.drawable.ic_books, R.drawable.ic_books,
            R.drawable.ic_books, R.drawable.ic_books,
            R.drawable.ic_books
    };
    public Boolean[] mBWImages = {
            false, false, false,
            false, false, false,
            false, false, false
    };
    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
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
        final ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(10,10,10,10);
        imageView.setLayoutParams(new GridView.LayoutParams(400, 400));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorMatrix matrix = new ColorMatrix();
                matrix.setSaturation(mBWImages[position]? 0 : 1);

                ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
                imageView.setColorFilter(filter);
                mBWImages[position] = !mBWImages[position];
            }
        });
        return imageView;
    }


    private ImageView setImageBW(boolean isBW, ImageView imageView){
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(isBW? 0 : 1);

        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
        imageView.setColorFilter(filter);

        return imageView;
    }
}