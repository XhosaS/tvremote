package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvo {
    public static final dvo a = new dvo();
    private static final Map c = new HashMap();
    public static final Map b = new HashMap();

    private dvo() {
    }

    public static final duy b(Constructor constructor, Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            objNewInstance.getClass();
            return (duy) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static final boolean c(Class cls) {
        return cls != null && dvj.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5 A[PHI: r0
  0x00f5: PHI (r0v7 java.util.ArrayList) = (r0v5 java.util.ArrayList), (r0v13 java.util.ArrayList) binds: [B:44:0x00d9, B:48:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Class r12) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvo.a(java.lang.Class):int");
    }
}
