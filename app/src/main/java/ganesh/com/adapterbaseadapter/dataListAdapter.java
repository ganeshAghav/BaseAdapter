package ganesh.com.adapterbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 23-Jan-17.
 */

public class dataListAdapter extends BaseAdapter
{
    String[] title,details;
    int[] image;
    Context context;

    dataListAdapter()
    {
        title=null;
        details=null;
        image=null;
    }
    public dataListAdapter(String[] text, String[] text1,int[] text3,Context con)
    {
        title=text;
        details=text1;
        image=text3;
        context=con;
    }
    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row;
        row=layoutInflater.inflate(R.layout.custom,parent,false);
        TextView Title,Details;
        ImageView myimg;


        Title= (TextView) row.findViewById(R.id.txttitle);
        Details= (TextView) row.findViewById(R.id.txtdetail);
        myimg= (ImageView) row.findViewById(R.id.mimg);

        Title.setText(title[position]);
        Details.setText(details[position]);
        myimg.setImageResource(image[position]);
        return (row);
    }
}
