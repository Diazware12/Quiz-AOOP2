import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	Connection con;
	Statement st;
	ResultSet rs;
	
	public Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbName = "purchase";
			String dbUser = "root";
			String dbPass = "";
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName, dbUser, dbPass);
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet selectAllData()
	{
		String query = "SELECT DISTINCT ProductName FROM Products";
		try {
			rs = st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet selectPriceByTitle(String title)
	{
		String query = String.format("SELECT Price FROM Products WHERE ProductName = %s", title);
		try {
			rs = st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	
/*
	public ResultSet selectAllDataBelanjaan() {
		try {
			rs = st.executeQuery("SELECT * FROM Belanjaan");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;		
	}
	
	public ResultSet selectDistinctKategori() {
		try {
			rs = st.executeQuery("SELECT DISTINCT Kategori "
					+ " FROM Buku ORDER BY Kategori");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;		
	}
	
	public ResultSet selectJudulByKategori(String kategori) {
		try {
			String sql = String.format(
					"SELECT Judul FROM Buku WHERE Kategori = '%s' "
					+ " ORDER BY Judul", kategori);
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;		
	}
	
	public ResultSet selectHargaByJudul(String judul) {
		try {
			String sql = String.format(
					"SELECT Harga FROM Buku WHERE Judul = '%s'", 
					judul);
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;		
	}
	
	
	public void insertDataBelanjaan(Belanjaan belanjaan) {
		try {
			// check data belanjaan
			rs = st.executeQuery("SELECT Id FROM Belanjaan "
					+ " ORDER BY Id DESC LIMIT 1");
			String idBelanjaan = null;
			while (rs.next()) {
				idBelanjaan = rs.getString("Id");
			}
			if (idBelanjaan != null) {
				// exists
				int id = Integer.parseInt(idBelanjaan.substring(3)) + 1;
				idBelanjaan = "BLJ" + String.format("%010d", id);
			} else {
				// BLJ0000000001
				idBelanjaan = "BLJ" + String.format("%010d", 1);
			}
			String sql = String.format(
					"INSERT INTO Belanjaan "
					+ " VALUES ('%s','%s','%s','%s','%s','%s','%d')"
					, idBelanjaan
					, belanjaan.getPenerima()
					, belanjaan.getAlamat()
					, belanjaan.getKeterangan()
					, belanjaan.getJudulBuku()
					, belanjaan.getKategoriBuku()
					, belanjaan.getHargaBuku());
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateData(String id, String penerima, String alamat, String keterangan) {
		try {
			
			String sql = String.format("UPDATE Belanjaan SET PENERIMA = '%s', Alamat = '%s', Keterangan = '%s' WHERE ID = '%s'", penerima,alamat,keterangan, id );
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteData(String id) {
		try {
			
			String sql = String.format("DELETE FROM Belanjaan WHERE ID = '%s'", id );
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
 */
}
