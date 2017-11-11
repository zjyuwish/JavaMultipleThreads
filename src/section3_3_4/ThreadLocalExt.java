package section3_3_4;

import java.util.Date;
public class ThreadLocalExt extends ThreadLocal {
	protected Object initialValue() {
		return new Date().getTime();
	}
}
