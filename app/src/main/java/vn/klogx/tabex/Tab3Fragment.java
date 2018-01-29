package vn.klogx.tabex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Tab3Fragment extends Fragment {

    private static Tab3Fragment instance = null;

    public Tab3Fragment() {
    }

    public static Tab3Fragment getInstance() {
        if (instance == null) {
            instance = new Tab3Fragment();
            return instance;
        } else return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab3, container, false);
        TextView textView = rootView.findViewById(R.id.section_label);
        textView.setText(getString(R.string.section_format, 3));
        return rootView;
    }
}
