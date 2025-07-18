package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agcx {
    private final Class a;
    private final String b;
    private final Class[] c;

    public agcx(Class cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    private final Method d(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2;
        Method methodE = e(cls, this.b, this.c);
        if (methodE == null || (cls2 = this.a) == null || cls2.isAssignableFrom(methodE.getReturnType())) {
            return methodE;
        }
        return null;
    }

    private static Method e(Class cls, String str, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return e(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public final Object a(Object obj, Object... objArr) throws NoSuchMethodException, SecurityException {
        try {
            Method methodD = d(obj.getClass());
            if (methodD != null) {
                try {
                    return methodD.invoke(obj, objArr);
                } catch (IllegalAccessException e) {
                    AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(methodD.toString()));
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            throw new AssertionError("Method " + this.b + " not supported for object " + String.valueOf(obj));
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public final boolean b(Object obj) {
        return d(obj.getClass()) != null;
    }

    public final void c(Object obj, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodD = d(obj.getClass());
            if (methodD == null) {
                return;
            }
            try {
                methodD.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
