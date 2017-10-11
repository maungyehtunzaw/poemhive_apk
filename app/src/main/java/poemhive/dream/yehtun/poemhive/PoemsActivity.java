package poemhive.dream.yehtun.poemhive;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import poemhive.dream.yehtun.poemhive.data.PoemData;
import poemhive.dream.yehtun.poemhive.utils.PoemAdaptor;

public class PoemsActivity extends AppCompatActivity {

    RecyclerView recyclerViewPoem;
    PoemAdaptor poemAdaptor;
    ArrayList<PoemData> poemDataList;
    ProgressDialog pd;
    String jsonUrl="http://www.poemhive.com/poems/poemlist";
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poems);
        recyclerViewPoem=(RecyclerView)findViewById(R.id.recv_poem);
    //    requestQueue= Volley.newRequestQueue(this);
        new loadPoemData().execute();
    }
    public class loadPoemData extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... params) {
            getPoemJsonData();
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (pd.isShowing())
                pd.dismiss();
            recyclerViewPoem.setHasFixedSize(true); //for recycle view
            recyclerViewPoem.setLayoutManager(new LinearLayoutManager(PoemsActivity.this));
            PoemAdaptor myad = new PoemAdaptor(PoemsActivity.this, poemDataList, new PoemAdaptor.PoemItemClick() {
                @Override
                public void onPoemClickListener(ArrayList<PoemData> poems, View view, int position) {
                    //Toast.makeText(PoemsActivity.this,"Click Poem"+poems.get(position).getTitle(),Toast.LENGTH_SHORT).show();
                    Intent in=new Intent(PoemsActivity.this,PoemDetail.class);
                    in.putExtra("poemid",poems.get(position).getId());
                    in.putExtra("poemtitle",poems.get(position).getTitle());
                    startActivityForResult(in,100);
                }
            });
            recyclerViewPoem.setAdapter(myad);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd = new ProgressDialog(PoemsActivity.this);
            pd.setMessage("Please wait...");
            pd.setCancelable(false);
            pd.show();

        }
        void getPoemJsonData() {
            poemDataList=new ArrayList<PoemData>();
            poemDataList.add(new PoemData(1,R.raw.android_img_poem1,"who care one light goest out, over many stars","2017-10-22 T 20:00 AM"));
            poemDataList.add(new PoemData(2,R.raw.android_img_poem2,"twinlight saga","2017-10-22 T 20:00 AM"));
            poemDataList.add(new PoemData(3,R.raw.android_img_poem3,"အိမ္မက္မ်ားသည္း စာတန္းထုိးထားျပိး ေနာက္တြင္","2017-10-22 T 20:00 AM"));
            poemDataList.add(new PoemData(3,R.raw.android_img_poem4,"the day you went away, this is totall sadness","2017-10-22 T 20:00 AM"));
            poemDataList.add(new PoemData(3,R.raw.android_img_poem5,"လမ္းမၾကီးေဘး သစ္ပင္ရိပ္္ေအာက္က ငွက္ကေလး တစ္ေကာင္ နာမည္","2017-10-22 T 20:00 AM"));

            poemDataList.add(new PoemData(1,R.raw.android_img_poem1,"who care one light goest out, over many stars","2017-10-22 T 20:00 AM"));
            poemDataList.add(new PoemData(2,R.raw.android_img_poem2,"twinlight saga","2017-10-22 T 20:00 AM"));
            poemDataList.add(new PoemData(3,R.raw.android_img_poem3,"အိမ္မက္မ်ားသည္း စာတန္းထုိးထားျပိး ေနာက္တြင္","2017-10-22 T 20:00 AM"));
            poemDataList.add(new PoemData(3,R.raw.android_img_poem4,"the day you went away, this is totall sadness","2017-10-22 T 20:00 AM"));
            poemDataList.add(new PoemData(3,R.raw.android_img_poem5,"လမ္းမၾကီးေဘး သစ္ပင္ရိပ္္ေအာက္က ငွက္ကေလး တစ္ေကာင္ နာမည္","2017-10-22 T 20:00 AM"));

            poemDataList.add(new PoemData(1,R.raw.android_img_poem1,"who care one light goest out, over many stars","2017-10-22 T 20:00 AM"));
            poemDataList.add(new PoemData(2,R.raw.android_img_poem2,"twinlight saga","2017-10-22 T 20:00 AM"));
            poemDataList.add(new PoemData(3,R.raw.android_img_poem3,"အိမ္မက္မ်ားသည္း စာတန္းထုိးထားျပိး ေနာက္တြင္","2017-10-22 T 20:00 AM"));
            poemDataList.add(new PoemData(3,R.raw.android_img_poem4,"the day you went away, this is totall sadness","2017-10-22 T 20:00 AM"));
            poemDataList.add(new PoemData(3,R.raw.android_img_poem5,"လမ္းမၾကီးေဘး သစ္ပင္ရိပ္္ေအာက္က ငွက္ကေလး တစ္ေကာင္ နာမည္","2017-10-22 T 20:00 AM"));
//            final JsonObjectRequest jsonReq=new JsonObjectRequest(Request.Method.GET,jsonUrl,null,
//                    new Response.Listener<JSONObject>() {
//                @Override
//                public void onResponse(JSONObject response) {
//                    try {
//                        poemDataList= new ArrayList<PoemData>();
//                        JSONArray poemJsonArr=response.getJSONArray("data");
//                        for (int i = 0; i<3; i++){
//                            JSONObject poem=poemJsonArr.getJSONObject(i);
//                            System.out.print("APPLE"+poem.getString("title"));
//                            Log.d("POEMDATA",poem.getString("title"));
//                            Log.d("POEMDATA", String.valueOf(poem.getInt("poemId")));
//                            Log.d("POEMDATA",poem.getString("created"));
//                            Log.d("POEMDATA",poem.getString("image"));
//                            poemDataList.add(new PoemData(
//                                    poem.getInt("poemId"),
//                                    poem.getString("image"),
//                                    poem.getString("title"),
//                                    poem.getString("created")
//                            ));
//
//                        }
//
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//                }
//            },
//                    new Response.ErrorListener(){
//
//                        @Override
//                        public void onErrorResponse(VolleyError error) {
//                            Log.d("YEYE",error.getMessage());
//                        }
//                    }
//            );
//
//            requestQueue.add(jsonReq);

        }
    }


}
