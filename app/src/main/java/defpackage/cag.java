package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cag {
    public static final cag a = new cag();

    private cag() {
    }

    public static final boolean c(String str, agum agumVar) {
        try {
            boolean zBooleanValue = ((Boolean) agumVar.a()).booleanValue();
            if (!zBooleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public final boolean a(agum agumVar) {
        try {
            bxf.b(((bxd) agumVar).a);
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean b(Method method, Class cls) {
        cls.getClass();
        return method.getReturnType().equals(cls);
    }
}
