package p2;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import p1.Connectionfactory;

public class EmployeeService implements EmployeeDao {

	
	@Override
	public void Electronic(Employee employee) {
		try
        {
			
 Connection con = Connectionfactory.getConnection();

Statement stmt= con.createStatement();
 stmt.executeUpdate("insert into electronic(`pro_id`,`pro_name`,`pro_cate`,`pro_price`,`pro_descri`) values('"+employee.getPro_id()+"','"+employee.getPro_name()+"','"+employee.getPro_cate()+"','"+employee.getPro_price()+"','"+employee.getPro_descri()+"')");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
	}

	@Override
	public void Home(Employee employee) {
		try
        {
			
            Connection con = Connectionfactory.getConnection();

			 Statement stmt= con.createStatement();
             stmt.executeUpdate("insert into home(`pro_id`,`pro_name`,`pro_cate`,`pro_price`,`pro_descri`) values('"+employee.getPro_id()+"','"+employee.getPro_name()+"','"+employee.getPro_cate()+"','"+employee.getPro_price()+"','"+employee.getPro_descri()+"')");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
	}

	@Override
	public void Kitchen(Employee employee) {
		try
        {
			
            Connection con = Connectionfactory.getConnection();

			 Statement stmt= con.createStatement();
             stmt.executeUpdate("insert into kitchen(`pro_id`,`pro_name`,`pro_cate`,`pro_price`,`pro_descri`) values('"+employee.getPro_id()+"','"+employee.getPro_name()+"','"+employee.getPro_price()+"','"+employee.getPro_cate()+"')");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
		
	}

	@Override
	public void result(Employee employee) {
		try
        {
			
            Connection con = Connectionfactory.getConnection();

			 Statement stmt= con.createStatement();
             stmt.executeUpdate("insert into result(`pro_id`,`pro_name`,`pro_cate`,`pro_price`,`pro_descri`) values('"+employee.getPro_id()+"','"+employee.getPro_name()+"','"+employee.getPro_cate()+"','"+employee.getPro_price()+"',"+employee.getPro_descri()+"')");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
	}
	}

	

	