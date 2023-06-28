package DAO;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StuDAO extends DBContext {

	public List<Student> getAll() {
		List<Student> list = new ArrayList<>();
		String sql = "select * from student.infor;";

		try {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String pass = rs.getString("pass");
				String address = rs.getString("address");
				int age = rs.getInt("age");

				Student stu = new Student(id, name, pass, address, age);
				list.add(stu);
			}

			return list;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	public void delete(String id) {

		String sql = "delete from student.infor where student.infor.id='" + id + "';";

		try {
			Statement st = c.createStatement();
			int rs = st.executeUpdate(sql);

			if (rs > 0) {
				System.out.println("delete success!");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public Student check(String id1) {

		String sql = "select * from student.infor where id='" + id1 + "';";

		try {
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String pass = rs.getString("pass");
				String address = rs.getString("address");
				int age = rs.getInt("age");

				Student stu = new Student(id, name, pass, address, age);

				return stu;

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	public void insert(Student stu) {
		
		String sql="insert into student.infor values ('"+stu.getId()+"','"+stu.getName()+"','"+stu.getPass()+"','"+stu.getAdress()+"','"+stu.getAge()+"');";
		
		try {
			
			Statement st = c.createStatement();
			int rs=st.executeUpdate(sql);
			
			if(rs>0) {
				System.out.println("insert success!");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
			
		}
	
	public void update(Student stu) {
		String sql="update student.infor set student.infor.name='"+stu.getName()+"', student.infor.pass='"+stu.getPass()+"', student.infor.address='"+stu.getAdress()+"', student.infor.age="+stu.getAge()+" where student.infor.id='"+stu.getId()+"';";
System.out.println(sql);
		
		try {

			Statement st = c.createStatement();
			int rs=st.executeUpdate(sql);
			
			if(rs>0) {
				System.out.println("update success!");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	
	}

	

}
