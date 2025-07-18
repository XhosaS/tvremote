package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udm {
    private static Method a;

    public static void a(de deVar) {
        if (a == null) {
            try {
                Method declaredMethod = de.class.getDeclaredMethod("noteStateNotSaved", null);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                b(e);
            }
        }
        try {
            Method method = a;
            method.getClass();
            method.invoke(deVar, null);
        } catch (IllegalAccessException e2) {
            b(e2);
        } catch (InvocationTargetException e3) {
            b(e3);
        }
    }

    private static void b(Throwable th) {
        throw new IllegalStateException("Could not access method FragmentManager#noteStateNotSaved", th);
    }
}
