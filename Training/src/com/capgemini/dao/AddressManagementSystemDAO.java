package com.capgemini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.capgemini.bean.AddressManagementSystemBean;

public class AddressManagementSystemDAO {
	public int addAddress(AddressManagementSystemBean addressManagementSystemBean) throws ClassNotFoundException, SQLException {
		Connection c=null;
		PreparedStatement p=null;
			c=AddressManagementSystemDB.getConnection1();
			p=c.prepareStatement("insert into god values(?,?,?,?,?,?,?)");
			p.setInt(1,addressManagementSystemBean.getUserid());
			p.setString(2,addressManagementSystemBean.getHousenumber());
			p.setString(3,addressManagementSystemBean.getStreetnumber());
			p.setString(4,addressManagementSystemBean.getCity());
			p.setString(5,addressManagementSystemBean.getDistrict());
			p.setString(6, addressManagementSystemBean.getState());
			p.setDouble(7,addressManagementSystemBean.getPincode());
			int updateCount=p.executeUpdate();
			return updateCount;
		}
	public int updateAddresshousenumber(int userid,String housenumber) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		con=AddressManagementSystemDB.getConnection1();
		pst=con.prepareStatement("update god set housenumber=? where userid=?");
		pst.setString(1, housenumber);
		pst.setInt(2, userid);
		int n=pst.executeUpdate();
		return n;
		}
	public int updateAddressstreetnumber(int userid,String streetnumber) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		con=AddressManagementSystemDB.getConnection1();
		pst=con.prepareStatement("update god set streetnumber=? where userid=?");
		pst.setString(1,streetnumber);
		pst.setInt(2, userid);
		int n=pst.executeUpdate();
		return n;
		}
	public int updateAddresscity(int userid,String city) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		con=AddressManagementSystemDB.getConnection1();
		pst=con.prepareStatement("update god set city=? where userid=?");
		pst.setString(1, city);
		pst.setInt(2, userid);
		int n=pst.executeUpdate();
		return n;
		}
	public int updateAddressdistrict(int userid,String district) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null; //used to execute sql queries
		con=AddressManagementSystemDB.getConnection1();
		pst=con.prepareStatement("update god set district=? where userid=?");
		pst.setString(1, district);
		pst.setInt(2, userid);
		int n=pst.executeUpdate();
		return n;
		}
	public int updateAddressstate(int userid,String state) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		con=AddressManagementSystemDB.getConnection1();
		pst=con.prepareStatement("update god set state=? where userid=?");
		pst.setString(1, state);
		pst.setInt(2, userid);
		int n=pst.executeUpdate();
		return n;
		}
	public int updateAddresspincode(int userid,double pincode) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		con=AddressManagementSystemDB.getConnection1();
		pst=con.prepareStatement("update god set pincode=? where userid=?");
		pst.setDouble(1, pincode);
		pst.setInt(2, userid);
		int n=pst.executeUpdate();
		return n;
		}
	public int deleteAddress(int userid) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		con=AddressManagementSystemDB.getConnection1();
		String sql="delete god where userid=?";
		pst=con.prepareStatement(sql);
		pst.setInt(1,userid);
		int n=pst.executeUpdate();
		return n;
	}
	
		}
