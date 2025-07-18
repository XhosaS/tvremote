package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asx {
    public static final asx a = new asx();
    private static final asw b = asw.a;

    private asx() {
    }

    public static final void d(bq bqVar, String str) {
        bqVar.getClass();
        ast astVar = new ast(bqVar, str);
        asx asxVar = a;
        asxVar.c(astVar);
        asw aswVarA = asxVar.a(bqVar);
        if (aswVarA.b.contains(asv.c) && asxVar.e(aswVarA, bqVar.getClass(), astVar.getClass())) {
            asxVar.b(aswVarA, astVar);
        }
    }

    public final asw a(bq bqVar) {
        while (bqVar != null) {
            if (bqVar.ao()) {
                bqVar.eh();
            }
            bqVar = bqVar.F;
        }
        return b;
    }

    public final void b(asw aswVar, final atc atcVar) {
        bq bqVar = atcVar.a;
        final String name = bqVar.getClass().getName();
        Set set = aswVar.b;
        if (set.contains(asv.a)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(String.valueOf(name)), atcVar);
        }
        if (set.contains(asv.b)) {
            Runnable runnable = new Runnable() { // from class: asu
                @Override // java.lang.Runnable
                public final void run() {
                    asx asxVar = asx.a;
                    String strConcat = "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(name));
                    atc atcVar2 = atcVar;
                    Log.e("FragmentStrictMode", strConcat, atcVar2);
                    throw atcVar2;
                }
            };
            if (!bqVar.ao()) {
                runnable.run();
                return;
            }
            Handler handler = bqVar.eh().n.d;
            if (agvy.c(handler.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public final void c(atc atcVar) {
        if (de.S(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(String.valueOf(atcVar.a.getClass().getName())), atcVar);
        }
    }

    public final boolean e(asw aswVar, Class cls, Class cls2) {
        Set set = (Set) aswVar.c.get(cls.getName());
        if (set == null) {
            return true;
        }
        return (agvy.c(cls2.getSuperclass(), atc.class) || !agqq.D(set, cls2.getSuperclass())) && !set.contains(cls2);
    }
}
