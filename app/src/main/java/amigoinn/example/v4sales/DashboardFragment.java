package amigoinn.example.v4sales;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.v4sales.R;

import amigoinn.adapters.SectionedListBeforeFilter;
import amigoinn.walkietalkie.Constants;

public class DashboardFragment extends Fragment implements View.OnClickListener {
    RelativeLayout rlAdd, rlRecipts, rlPendingOrder;
    LinearLayout llNew, llPriceList, llItem, llCustomer, llOverDue, llTotal, llRejected, llOpen, llClosed;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.dashboard_fragment, container, false);

        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        rlAdd = (RelativeLayout) v.findViewById(R.id.rlAdd);

        rlRecipts = (RelativeLayout) v.findViewById(R.id.rlRecipts);
        rlPendingOrder = (RelativeLayout) v.findViewById(R.id.rlPendingOrder);

        llNew = (LinearLayout) v.findViewById(R.id.llNew);

        llPriceList = (LinearLayout) v.findViewById(R.id.llPriceList);
        llItem = (LinearLayout) v.findViewById(R.id.llItem);
        llCustomer = (LinearLayout) v.findViewById(R.id.llCustomer);
        llOverDue = (LinearLayout) v.findViewById(R.id.llOverDue);
        llTotal = (LinearLayout) v.findViewById(R.id.llTotal);
        llRejected = (LinearLayout) v.findViewById(R.id.llRejected);
        llOpen = (LinearLayout) v.findViewById(R.id.llOpen);
        llClosed = (LinearLayout) v.findViewById(R.id.llClosed);

        llCustomer.setOnClickListener(this);
        llItem.setOnClickListener(this);
        llPriceList.setOnClickListener(this);

        llCustomer.setOnClickListener(this);

        llNew.setOnClickListener(this);
        llClosed.setOnClickListener(this);
        llOpen.setOnClickListener(this);
        llRejected.setOnClickListener(this);


        rlAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                Bundle args = new Bundle();
                FragmentManager frgManager = getFragmentManager();
                fragment = new FragmentCategory();
                fragment.setArguments(args);
                frgManager.beginTransaction()
                        .replace(R.id.content_frame, fragment).commit();
            }
        });
    }


    @Override
    public void onClick(View v) {
        if (v == llCustomer) {

            Constants.PartyList.clear();
            Constants.addParty();
            Constants.countries=Constants.PartyList;
            Config.filterfrom="Mainmenu";
            
            Fragment fragment = null;
            Bundle args = new Bundle();
            FragmentManager frgManager = getFragmentManager();
            fragment = new SectionedListBeforeFilter();
            fragment.setArguments(args);
            frgManager.beginTransaction()
                    .replace(R.id.content_frame, fragment).commit();
        } else if (v == llItem) {

            Config.filterfrom = "product";
            Constants.Productlist.clear();
            Constants.addProducts();
            Constants.countries = Constants.Productlist;
            Fragment fragment = null;
            Bundle args = new Bundle();
            FragmentManager frgManager = getFragmentManager();
            fragment = new SectionedListBeforeFilter();
            fragment.setArguments(args);
            frgManager.beginTransaction()
                    .replace(R.id.content_frame, fragment).commit();

        } else if (v == llPriceList) {

        } else if (v == llNew) {
            Intent start = new Intent(getActivity(), NewOrderTabActiviy.class);
            startActivity(start);

        } else if (v == llRejected) {
            Intent start = new Intent(getActivity(), NewOrderTabActiviy.class);
            startActivity(start);


        } else if (v == llOpen) {
            Intent start = new Intent(getActivity(), NewOrderTabActiviy.class);
            startActivity(start);


        } else if (v == llClosed) {
            Intent start = new Intent(getActivity(), NewOrderTabActiviy.class);
            startActivity(start);


        }

    }
}
