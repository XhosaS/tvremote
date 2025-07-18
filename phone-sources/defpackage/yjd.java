package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yjd {
    public static final Method a;
    public static final Method b;

    static {
        int length;
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int i = 0;
        int i2 = 0;
        while (true) {
            length = methods.length;
            method = null;
            if (i2 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i2];
            if (yks.e(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (yks.e(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i2++;
        }
        a = method2;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method3 = methods[i];
            if (yks.e(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        b = method;
    }
}
