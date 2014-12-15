/*(C) 2007-2012 Alibaba Group Holding Limited.	

import com.taobao.tddl.common.util.TStringUtil;
/**���ӵ�ַ��������Ҫͨ��ConnectionURLParser �������þ���Ķ���
 * @author qihao
 *
 */
public abstract class ConnectionURL {
	private String ip;

	private String port;

	private String dbName;

	public abstract DBType getDbType();

	public abstract String renderURL();

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = TStringUtil.trim(ip);
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = TStringUtil.trim(port);
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName =  TStringUtil.trim(dbName);
	}
}