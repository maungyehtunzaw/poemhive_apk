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

public class PoetFragment extends ListFragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.poetframent,container,false);
        getActivity().setTitle("POETS");
        ArrayList<PoetData> poetDatas = new ArrayList<>();
        poetDatas.add(new PoetData(1,R.raw.no_poet_image,"",1000));
        poetDatas.add(new PoetData(2,R.raw.no_poet_image,"မေနာ္ဟရီ",1000));
        poetDatas.add(new PoetData(3,R.raw.no_poet_image,"မေနာ္ဟရီ",1000));
        poetDatas.add(new PoetData(4,R.raw.no_poet_image,"ေမာင္ေခ်ာႏြယ္",1000));
        poetDatas.add(new PoetData(5,R.raw.no_poet_image,"စစ္ျငိမ္း",1000));
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
