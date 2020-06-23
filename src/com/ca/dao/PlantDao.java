package com.ca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ca.business.Flower;
import com.ca.exceptions.DaoException;

public class PlantDao extends Dao {
	
	public List<Flower> findPlant(String search) throws DaoException {
		
		Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Flower f = null;
        List<Flower> found = new ArrayList<Flower>();
        
        try {
            con = this.getConnection();
            //String query = "SELECT * FROM FLOWER WHERE flowerName = ?";
            String query = "SELECT * FROM FLOWER WHERE flowerName Like '%" + search + "%'" ;
            ps = con.prepareStatement(query);
            //ps.setString(1, search);
            
            rs = ps.executeQuery();
            if (rs.next()) {
            	String image = rs.getString("IMAGE");
                String flowername = rs.getString("FLOWERNAME");
                String description = rs.getString("DESCRIPTION");
                String season = rs.getString("SEASON");
                String habitat = rs.getString("HABITAT");
                f = new Flower(image, flowername, description, season, habitat);
                found.add(f);
                System.out.println("SSSSSSSSSSSS"+ found);
            }
        } catch (SQLException e) {
            throw new DaoException("findPlant" + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                throw new DaoException("findPlant" + e.getMessage());
            }
        }
        return found;     // u may be null 
    }
   
	 public List<Flower> getAllPlants() {
		   
		   Connection con = null;
	       PreparedStatement ps = null;
	       ResultSet rs = null;
	       List<Flower> flowers = new ArrayList<Flower>();
	       Flower f = null;
		   String getFlower = "SELECT * FROM FLOWER";



		   try {
			   con = this.getConnection();
			   ps = con.prepareStatement(getFlower);
			   rs = ps.executeQuery();
			   
			     // String [] users = rs.getString(user);
		       while(rs.next()) {
		       		String image = rs.getString("Image");
		            String flowername = rs.getString("flowerName");
               //if you still want the found/notfound sticker better find a way to change image based on status		               
		            f = new Flower(image, flowername);
	                flowers.add(f);
	                System.out.println(">>>>>>>>>>>>> " + f.getFlowerName());
		           }      
		    	   
		       
			   
		   } catch (SQLException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
		   }
	       
	       
		return flowers;
		   
	   }

}
