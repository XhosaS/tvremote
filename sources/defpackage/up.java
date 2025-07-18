package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class up {
    public static final /* synthetic */ int a = 0;
    private static final uo b = uo.a;

    public static final void a(q qVar, String str) {
        qVar.getClass();
        um umVar = new um(qVar, str);
        d(umVar);
        uo uoVarB = b(qVar);
        if (uoVarB.b.contains(un.c) && e(uoVarB, qVar.getClass(), umVar.getClass())) {
            c(uoVarB, umVar);
        }
    }

    public static final uo b(q qVar) {
        while (qVar != null) {
            if (qVar.B()) {
                qVar.k();
            }
            qVar = qVar.z;
        }
        return b;
    }

    public static final void c(uo uoVar, ur urVar) {
        q qVar = urVar.a;
        String name = qVar.getClass().getName();
        Set set = uoVar.b;
        if (set.contains(un.a)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(String.valueOf(name)), urVar);
        }
        if (set.contains(un.b)) {
            bb bbVar = new bb(name, urVar, 14);
            if (!qVar.B()) {
                bbVar.run();
                return;
            }
            Handler handler = qVar.k().l.d;
            if (dnx.aB(handler.getLooper(), Looper.myLooper())) {
                bbVar.run();
            } else {
                handler.post(bbVar);
            }
        }
    }

    public static final void d(ur urVar) {
        if (am.S(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(String.valueOf(urVar.a.getClass().getName())), urVar);
        }
    }

    public static final boolean e(uo uoVar, Class cls, Class cls2) {
        Set set = (Set) uoVar.c.get(cls.getName());
        if (set == null) {
            return true;
        }
        return (dnx.aB(cls2.getSuperclass(), ur.class) || !dnx.aO(set, cls2.getSuperclass())) && !set.contains(cls2);
    }
}
