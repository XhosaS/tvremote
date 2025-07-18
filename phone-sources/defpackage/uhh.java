package defpackage;

import com.google.common.collect.Ordering;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhh {
    public static final /* synthetic */ int a = 0;
    private static final Ordering b;
    private static final Ordering c;

    static {
        Ordering orderingReverse = Ordering.natural().onResultOf(new uhe(1)).compound(Ordering.natural().onResultOf(new uhe(0))).reverse();
        b = orderingReverse;
        c = orderingReverse.onResultOf(new uhe(2));
    }

    public static Exception a(Class cls, Throwable th) {
        Iterator it = c.sortedCopy(Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            Exception exc = (Exception) b((Constructor) it.next(), th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException(a.ch(cls, "No appropriate constructor for exception of type ", " in response to chained exception"), th);
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
