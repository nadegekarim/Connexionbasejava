package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import bo.Contact;

public class ContactDAO {
	
	public List<Contact> select () {
		List<Contact> contacts = new ArrayList<>();
	
		try {
			Context context = new InitialContext();
			DataSource ds =(DataSource)context.lookup("java:comp/env/admin");
			Connection cnx =ds.getConnection();
			if(!cnx.isClosed()) {
				PreparedStatement ps = cnx.prepareStatement("SELECT * FROM contacts");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					contacts.add(convertResultSetToContact(rs));
				 }
				
				}
				
				
			cnx.close();	
		
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}
		return contacts;
	}

	private Contact convertResultSetToContact(ResultSet rs) throws SQLException {
		Contact contact = new Contact();
		contact.setId(rs.getInt("id"));
		contact.setNom(rs.getString("nom"));
		contact.setPrenom(rs.getString("prenom"));
		contact.setDatenaissance(rs.getDate("datenaissance").toLocalDate());
		contact.setTelephone(rs.getString("telephone"));
		contact.setUrl(rs.getString("url"));
		contact.setPoste(rs.getString("poste"));
		contact.setSpecialite(rs.getString("specialite"));
		
		return contact;
		
	}
	

}
