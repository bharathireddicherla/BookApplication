import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getConnection();
		if (connection != null)
			System.out.println("sucess");
	}

}