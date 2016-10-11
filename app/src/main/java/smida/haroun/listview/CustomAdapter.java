package smida.haroun.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by odc on 11/10/16.
 */

public class CustomAdapter extends ArrayAdapter<DataModel>{

    private ArrayList<DataModel> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView txtName;
        View line;
    }

    public CustomAdapter(ArrayList<DataModel> data, Context context) {
        super(context, R.layout.card_item, data);
        this.dataSet = data;
        this.mContext=context;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        DataModel dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.card_item, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.text);
            viewHolder.line = convertView.findViewById(R.id.view);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.txtName.setText(dataModel.getName());
        if ((position+1) == dataSet.size())
            viewHolder.line.setBackgroundColor(mContext.getResources().getColor(android.R.color.transparent));
        else if (position % 2 == 1)
            viewHolder.line.setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimaryDark));
        else
            viewHolder.line.setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));



        // Return the completed view to render on screen
        return convertView;
    }
}
