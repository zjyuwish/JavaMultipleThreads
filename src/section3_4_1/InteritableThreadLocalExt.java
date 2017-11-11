package section3_4_1;

import java.util.Date;
public class InteritableThreadLocalExt extends InheritableThreadLocal {
	protected Object initialValue() {
		return new Date().getTime();
	}
}
