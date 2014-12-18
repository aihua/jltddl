/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * TaobaoDataSource�ĳ����࣬��javax.sql.DataSource�еķ������е�һ��
 * 
 * @author qihao
 * 
 */
public abstract class AbstractTaobaoDataSource implements DataSource {

	protected abstract DataSource getDatasource() throws SQLException;

	public Connection getConnection() throws SQLException {
		return getDatasource().getConnection();
	}

	public Connection getConnection(String username, String password) throws SQLException {
		return getDatasource().getConnection(username, password);
	}

	public PrintWriter getLogWriter() throws SQLException {
		return getDatasource().getLogWriter();

	}

	public int getLoginTimeout() throws SQLException {
		return getDatasource().getLoginTimeout();
	}

	public void setLogWriter(PrintWriter out) throws SQLException {
		getDatasource().setLogWriter(out);
	}

	public void setLoginTimeout(int seconds) throws SQLException {
		getDatasource().setLoginTimeout(seconds);
	}

	@SuppressWarnings("unchecked")
	public <T> T unwrap(Class<T> iface) throws SQLException {
		if (isWrapperFor(iface)) {
			return (T) this;
		} else {
			throw new SQLException("not a wrapper for " + iface);
		}
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return AbstractTaobaoDataSource.class.isAssignableFrom(iface);
	}
}