/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class StudentDaoImpl implements StudentDao{

    
    public void insert(Score score) {
        
        Connection connection = null;
	PreparedStatement preparedStatement = null;

		try {
			connection = ConnectionConfiguration.getConnection();
			preparedStatement = connection.prepareStatement("INSERT INTO score (player1,player2,winner,duration)" +
					"VALUES (?,?,?,?)");
                        
			preparedStatement.setString(1, score.getP1());
			preparedStatement.setString(2, score.getP2());
                        preparedStatement.setString(3, score.getWinner());
			preparedStatement.setDouble(4, score.getDuration());
			preparedStatement.executeUpdate();
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
    }
    
    
    
      public List<Score> selectAll() {
        
        List<Score> scrList = new ArrayList<Score>();
	Connection connection = null;
	Statement statement = null;
        ResultSet resultSet = null;

        try {
                connection = ConnectionConfiguration.getConnection();
                statement = connection.createStatement();
                resultSet = statement.executeQuery("SELECT * FROM score");

                while (resultSet.next()) {
                        Score scr = new Score();
                        scr.setTimeStamp(resultSet.getString("time"));
                        scr.setP1(resultSet.getString("player1"));
                        scr.setP2(resultSet.getString("player2"));
                        scr.setWinner(resultSet.getString("winner"));
                        scr.setDuration(resultSet.getDouble("duration"));
                        scrList.add(scr);
                }

        } catch (Exception e) {
                e.printStackTrace();
        } finally {
                if (resultSet != null) {
                        try {
                                resultSet.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
                if (statement != null) {
                        try {
                                statement.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
                if (connection != null) {
                        try {
                                connection.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
        }

        return scrList; //To change body of generated methods, choose Tools | Templates.
    }
}
/*
    public Student selectById(int id) {
         Student student = new Student();
	 Connection connection = null;
	 PreparedStatement preparedStatement = null;
	 ResultSet resultSet = null;

	try {
			
            connection = ConnectionConfiguration.getConnection();
	    preparedStatement = connection.prepareStatement("SELECT * FROM student WHERE id = ?");
	    preparedStatement.setInt(1, id);
	    resultSet = preparedStatement.executeQuery();

	    while (resultSet.next()) {
				
                student.setId(resultSet.getInt("id"));
		student.setFirstName(resultSet.getString("firstname"));
		student.setLastName(resultSet.getString("lastname"));
	    }

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (resultSet != null) {
		    try {
			resultSet.close();
		    } catch (SQLException e) {
			e.printStackTrace();
		    }
	        }
		if (preparedStatement != null) {
		    try {
			    preparedStatement.close();
		    } catch (SQLException e) {
			   e.printStackTrace();
		    }
		}
		if (connection != null) {
		    try {
			connection.close();
		    } catch (SQLException e) {
			e.printStackTrace();
		    }
		}
	}

		return student;
	
    }

    */
  

    /*
    public void delete(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
                connection = ConnectionConfiguration.getConnection();
                preparedStatement = connection.prepareStatement("DELETE FROM student WHERE id = ?");
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();

                System.out.println("");

        } catch (Exception e) {
                e.printStackTrace();
        } finally {
                if (preparedStatement != null) {
                        try {
                                preparedStatement.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
                if (connection != null) {
                        try {
                                connection.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
        } //To change body of generated methods, choose Tools | Templates.
    }

    
    public void update(Student student, int id) {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
                connection = ConnectionConfiguration.getConnection();
                preparedStatement = connection.prepareStatement("UPDATE student SET " +
                                "firstname = ?, lastname = ? WHERE id = ?");

                preparedStatement.setString(1, student.getFirstName());
                preparedStatement.setString(2, student.getLastName());
                preparedStatement.setInt(3, id);
                preparedStatement.executeUpdate();

                System.out.println("UPDATE student SET " +
                                "firstname = ?, lastname = ? WHERE id = ?");

        } catch (Exception e) {
                e.printStackTrace();
        } finally {
                if (preparedStatement != null) {
                        try {
                                preparedStatement.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
                if (connection != null) {
                        try {
                                connection.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                }
        }
}

    
    */
    

