package rtc.sasithon.jirawan.healthchack;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Admin on 1/2/2559.
 */
public class DiseaseAdapter extends BaseAdapter {

    //Explicit
    private Context objContext;
    private int iconAnInt;
    private String[]titleStrings;

    public DiseaseAdapter(Context objContext, int iconAnInt, String[] titleStrings) {
        this.objContext = objContext;
        this.iconAnInt = iconAnInt;
        this.titleStrings = titleStrings;

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
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View ovjView=objLayoutInflater.inflate(R.layout.disease_listview,parent,false);

        ImageView iconImageView= (ImageView) ovjView.findViewById(R.id.imageView4);
        iconImageView.setImageResource(iconAnInt);
        TextView titleTextView = (TextView) ovjView.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[position]);


        return ovjView;
    }
}   //Main Class
