package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dhf {
    public dhf() {
    }

    public static int a(byte b) {
        return b & 63;
    }

    public static void b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean c(byte b) {
        return b > -65;
    }

    public static boolean d(byte b) {
        return b >= 0;
    }

    public static dxj e(dxd dxdVar) {
        return dxdVar instanceof duz ? ((duz) dxdVar).getDefaultViewModelCreationExtras() : dxh.a;
    }

    public static dwt f(Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()));
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (dwt) objNewInstance;
            } catch (IllegalAccessException e) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
            } catch (InstantiationException e2) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
            }
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        }
    }

    public static String g(ymh ymhVar) {
        return ymhVar.b();
    }

    public dhf(byte[] bArr) {
    }

    public void onInitialized() {
    }

    public void onFailed(Throwable th) {
    }
}
