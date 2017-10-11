package poemhive.dream.yehtun.poemhive.utils;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import poemhive.dream.yehtun.poemhive.PoemsActivity;
import poemhive.dream.yehtun.poemhive.PoetFragment;
import poemhive.dream.yehtun.poemhive.R;
import poemhive.dream.yehtun.poemhive.data.PoetData;

/**
 * Created by Ye Htun on 2017-10-04.
 */

public class PoetAdaptor extends ArrayAdapter<PoetData> {
    Context context;

    public PoetAdaptor(Context context, ArrayList<PoetData> poets) {
        super(context,0,poets);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        PoetData currentPoet=getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.poet_list, parent, false);
        }


        ImageView poetImage=(ImageView)listItemView.findViewById(R.id.poetimage);
        TextView poetName=(TextView)listItemView.findViewById(R.id.poetname);
        TextView poemCount=(TextView)listItemView.findViewById(R.id.poemcount);
        Log.d("TAG","SHIT HERE");
        poetImage.setImageResource(currentPoet.getPoetImage());
        poetName.setText(currentPoet.getPoetName());
        poemCount.setText(String.valueOf(currentPoet.getPoemCount()));

        return listItemView;
    }
}
