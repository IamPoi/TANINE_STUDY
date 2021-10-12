package DataBaseTest;

import java.util.Vector;

public class ConnPool {
	private Vector buffer = new Vector();
	private  static connPool = new ConnPool();
	static {
		try {
			initConnPool();
		}
	}

}
