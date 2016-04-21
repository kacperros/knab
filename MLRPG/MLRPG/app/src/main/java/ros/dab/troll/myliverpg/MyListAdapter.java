package ros.dab.troll.myliverpg;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kacper on 21.04.16.
 */
public class MyListAdapter extends ArrayAdapter<String> {
    List<String> objects;
    Context context;

    public MyListAdapter(Context context, List<String> objects) {
        super(context, -1, objects);
        this.objects = objects;
        this.context = context;
    }

    static class ViewHolder{
        TextView textView;
    }


    @Override
    public View getView(int positon, View convertView, ViewGroup parent){
        View rowView = convertView;
        if(rowView == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.row_view, parent, false);
            ViewHolder holder = new ViewHolder();
            holder.textView = (TextView) rowView.findViewById(R.id.row_text);
            rowView.setTag(holder);
        }

        ViewHolder holder = (ViewHolder) rowView.getTag();
        holder.textView.setText(objects.get(positon));
        return rowView;
    }

}
