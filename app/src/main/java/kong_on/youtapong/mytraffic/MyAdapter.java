package kong_on.youtapong.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by youtapong on 21/02/2016.
 */
public class MyAdapter extends BaseAdapter{
    //Explicate
    private Context context;
    private int[] iconInts;
    private String[] titleStrings, detailShortStrings;

    public MyAdapter(Context context, int[] iconInts, String[] titleStrings, String[] detailShortStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailShortStrings = detailShortStrings;
    }//Constructor


    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);
        //about ICON
        ImageView iconImaageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImaageView.setImageResource(iconInts[i]);

        //about Title
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);

        //About Detail
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);
        detailTextView.setText(detailShortStrings[i]);

        return view1;
    }
}//Main Class
