package amigoinn.modallist;

import java.util.ArrayList;

import amigoinn.db_model.ClientInfo;
import amigoinn.db_model.ModelDelegates;
import amigoinn.db_model.RouteInfo;
import amigoinn.servicehelper.ServiceHelper;
import amigoinn.servicehelper.ServiceResponse;

/**
 * Created by Virag kuvadia on 24-04-2016.
 */
public class ClientList implements ServiceHelper.ServiceHelperDelegate {

    protected ClientList() {
    }

    private static volatile RouteList _instance = null;
    public ModelDelegates.ModelDelegate<ClientInfo> m_delegate = null;
    protected ArrayList<ClientInfo> m_modelList = null;

    public static RouteList Instance() {
        if (_instance == null) {
            synchronized (RouteList.class) {
                _instance = new RouteList();
            }
        }
        return _instance;
    }




    @Override
    public void CallFinish(ServiceResponse res) {

    }

    @Override
    public void CallFailure(String ErrorMessage) {

    }
}
