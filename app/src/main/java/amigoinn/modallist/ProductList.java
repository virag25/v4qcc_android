package amigoinn.modallist;

import java.util.ArrayList;

import amigoinn.db_model.ModelDelegates;
import amigoinn.db_model.ProductInfo;
import amigoinn.db_model.TaskInfo;
import amigoinn.servicehelper.ServiceHelper;
import amigoinn.servicehelper.ServiceResponse;

/**
 * Created by Virag kuvadia on 24-04-2016.
 */
public class ProductList implements ServiceHelper.ServiceHelperDelegate {


    protected ProductList() {
    }

    private static volatile ProductList _instance = null;
    public ModelDelegates.ModelDelegate<ProductInfo> m_delegate = null;
    protected ArrayList<ProductInfo> m_modelList = null;

    public static ProductList Instance() {
        if (_instance == null) {
            synchronized (ProductList.class) {
                _instance = new ProductList();
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
