package poemhive.dream.yehtun.poemhive.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

import poemhive.dream.yehtun.poemhive.PoemsActivity;
import poemhive.dream.yehtun.poemhive.R;
import poemhive.dream.yehtun.poemhive.data.PoemData;

import static android.support.v7.widget.RecyclerView.*;

/**
 * Created by Ye Htun on 2017-09-01.
 */

public class PoemAdaptor extends RecyclerView.Adapter<PoemAdaptor.PoemViewHolder> {
    Context context;
    ArrayList<PoemData> poemDatas;
    PoemItemClick pic;
    View v;
    public PoemAdaptor(Context context, ArrayList<PoemData> poemDatas,PoemItemClick pic) {
        this.context = context;
        this.poemDatas = poemDatas;
        this.pic=pic;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<PoemData> getPoemDatas() {
        return poemDatas;
    }

    public void setPoemDatas(ArrayList<PoemData> poemDatas) {
        this.poemDatas = poemDatas;
    }

    @Override
    public PoemAdaptor.PoemViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
         v = LayoutInflater.from(context).inflate(R.layout.poemcard, parent, false);
        return new PoemViewHolder(v);

    }

    @Override
    public void onBindViewHolder(PoemAdaptor.PoemViewHolder holder, final int position) {
        //holder.imgPoem.setImageResource(poemDatas.get(position).getImage());
//        Picasso.with(context)
//                .load(poemDatas.get(position).getImage())
//                .resize(50, 50)
//                .centerCrop()
//                .into(holder.imgPoem);
        holder.imgPoem.setImageResource(poemDatas.get(position).getImage());
        holder.txtTitle.setText(poemDatas.get(position).getTitle());
        holder.txtCreated.setText(poemDatas.get(position).getCreated());
        holder.poemcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic.onPoemClickListener(poemDatas,v,position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return (poemDatas==null) ? 0:poemDatas.size();
    }

    public class PoemViewHolder extends ViewHolder {
        ImageView imgPoem;
        TextView txtTitle, txtCreated;
        CardView poemcard;

        public PoemViewHolder(View itemView) {
            super(itemView);
            imgPoem = (ImageView) itemView.findViewById(R.id.iv_poemimg);
            txtTitle = (TextView) itemView.findViewById(R.id.tv_poemtitle);
            txtCreated = (TextView) itemView.findViewById(R.id.tv_poemcreated);
            poemcard =(CardView) itemView.findViewById(R.id.cv_poemcard);
        }
    }
    public interface PoemItemClick{
        public void onPoemClickListener(ArrayList<PoemData> poems,View view,int position);
    }

    public void onPoemClickListener(PoemItemClick ptc){

    }

}
