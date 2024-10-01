package productWeb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class DAO 
{
    private Connection getConnection() throws Exception
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	return DriverManager.getConnection("jdbc:mysql:///productdatabase","root","root");
    }
    int insert (Product p)throws Exception
    {
    	Connection con=getConnection();
    	PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?,?)");
    	ps.setInt(1, p.getId());
    	ps.setString(2, p.getBrand());
    	ps.setDouble(3, p.getPrice());
    	ps.setDouble(4, p.getDiscount());
    	
    	return ps.executeUpdate();
    }
    int delete(int id) throws Exception
    {
    	Connection con=getConnection();
    	PreparedStatement ps=con.prepareStatement("delete from product where id=?");
    	ps.setInt(1, id);
    	return ps.executeUpdate();
    }
    Product fetchdata(int id) throws Exception
    {
    	Connection con=getConnection();
    	PreparedStatement ps=con.prepareStatement("select * from product where id=?");
    	ps.setInt(1, id);
    	ResultSet rs=ps.executeQuery();
    	if(rs.next())
    	{
    		return new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4));
    		return null;
    	}
		return null;
    }
    List<product>fetchAll() throws Exception
    {
    	Connection con=getConnection();
    	PreparedStatement ps=con.prepareStatement("select * from product *");
    	
    }
    
}
