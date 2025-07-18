package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxt {
    public static final /* synthetic */ int a = 0;
    private static final zca b;
    private static final zca c;

    static {
        zbv zbvVar = zbv.a;
        zcr zcrVar = new zcr(new yxe(new yvv(new yqi() { // from class: zxo
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i = zxt.a;
                return Boolean.valueOf(((List) obj).contains(String.class));
            }
        }, zbvVar), new yvv(new yqi() { // from class: zxp
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i = zxt.a;
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            }
        }, zbvVar)));
        b = zcrVar;
        c = new yvv(new yqi() { // from class: zxq
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i = zxt.a;
                return Arrays.asList(((Constructor) obj).getParameterTypes());
            }
        }, zcrVar);
    }

    public static Exception a(Class cls, Throwable th) {
        List listAsList = Arrays.asList(cls.getConstructors());
        zca zcaVar = c;
        Object[] objArrJ = zag.j(listAsList);
        Arrays.sort(objArrJ, zcaVar);
        Iterator it = new ArrayList(Arrays.asList(objArrJ)).iterator();
        while (it.hasNext()) {
            Exception exc = (Exception) b((Constructor) it.next(), th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException(a.t(cls, "No appropriate constructor for exception of type ", " in response to chained exception"), th);
    }

    private static Object b(Constructor constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }
}
