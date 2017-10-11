package poemhive.dream.yehtun.poemhive;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import poemhive.dream.yehtun.poemhive.data.PoemData;
import poemhive.dream.yehtun.poemhive.data.PoetData;
import poemhive.dream.yehtun.poemhive.utils.PoetAdaptor;

public class MemberFragment extends ListFragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.poetframent,container,false);
        getActivity().setTitle("POETS");
        ArrayList<PoetData> poetDatas = new ArrayList<>();
        poetDatas.add(new PoetData(1,R.raw.no_poet_image,"Ye Htun",1000));
        poetDatas.add(new PoetData(2,R.raw.no_poet_image,"Maung Maung",1000));
        poetDatas.add(new PoetData(3,R.raw.no_poet_image,"Nat Khat",1000));
        poetDatas.add(new PoetData(4,R.raw.no_poet_image,"စမ္းသပ္သည",1000));
        poetDatas.add(new PoetData(5,R.raw.no_poet_image,"Rabindanatago",1000));
        poetDatas.add(new PoetData(3,R.raw.no_poet_image,"Nat Khat",1000));
        poetDatas.add(new PoetData(4,R.raw.no_poet_image,"Adele",1000));
        poetDatas.add(new PoetData(5,R.raw.no_poet_image,"Kate Winslet",1000));

        PoetAdaptor poetAdaptor=new PoetAdaptor(getActivity().getBaseContext(),poetDatas);
        ListView listView=(ListView)rootView.findViewById(R.id.lv_poetlist);
        listView.setAdapter(poetAdaptor);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}
