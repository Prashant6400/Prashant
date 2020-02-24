package com.capgemini.service;

import java.sql.SQLException;
import com.capgemini.bean.AddressManagementSystemBean;
import com.capgemini.dao.AddressManagementSystemDAO;

public class AddressManagementSystemService {
	public int addAddress(int userid,String housenumber, String streetnumber,
			String city, String district,String state, Double pincode) throws ClassNotFoundException, SQLException {

		AddressManagementSystemDAO addressManagementSystemDAO=new AddressManagementSystemDAO();
		AddressManagementSystemBean addressManagementSystemBean=new AddressManagementSystemBean();
		addressManagementSystemBean.setUserid(userid);
		addressManagementSystemBean.setHousenumber(housenumber);
		addressManagementSystemBean.setStreetnumber(streetnumber);	
		addressManagementSystemBean.setCity(city);
		addressManagementSystemBean.setDistrict(district);
		addressManagementSystemBean.setState(state);
		addressManagementSystemBean.setPincode(pincode);	
		
		int updateResult=0;
		updateResult=addressManagementSystemDAO.addAddress(addressManagementSystemBean);
		return updateResult;
		
	}
	public int updateAddresshousenumber(int userid,String housenumber) throws ClassNotFoundException, SQLException {
	AddressManagementSystemDAO pd=new AddressManagementSystemDAO();
		int n=0;
		n=pd.updateAddresshousenumber(userid,housenumber);
		return n;
	}
	public int updateAddressstreetnumber(int userid,String streetnumber) throws ClassNotFoundException, SQLException {
		AddressManagementSystemDAO pd=new AddressManagementSystemDAO();
			int n=0;
			n=pd.updateAddresshousenumber(userid,streetnumber);
			return n;
		}
	public int updateAddresscity(int userid,String city) throws ClassNotFoundException, SQLException {
		AddressManagementSystemDAO pd=new AddressManagementSystemDAO();
			int n=0;
			n=pd.updateAddressstreetnumber(userid,city);
			return n;
		}
	public int updateAddressdistrict(int userid,String district) throws ClassNotFoundException, SQLException {
		AddressManagementSystemDAO pd=new AddressManagementSystemDAO();
			int n=0;
			n=pd.updateAddressdistrict(userid,district);
			return n;
		}
	public int updateAddressstate(int userid,String state) throws ClassNotFoundException, SQLException {
		AddressManagementSystemDAO pd=new AddressManagementSystemDAO();
			int n=0;
			n=pd.updateAddressstate(userid,state);
			return n;
		}
	public int updateAddresspincode(int userid,double pincode) throws ClassNotFoundException, SQLException {
		AddressManagementSystemDAO pd=new AddressManagementSystemDAO();
			int n=0;
			n=pd.updateAddresspincode(userid,pincode);
			return n;
		}

	public int deleteAddress(int userid) throws ClassNotFoundException, SQLException {
		AddressManagementSystemDAO pd=new AddressManagementSystemDAO();
		int n=0;
		n=pd.deleteAddress(userid);
		return n;
	}
}
