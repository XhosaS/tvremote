package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dia {
    public static final /* synthetic */ int a = 0;
    private static final dhz b = dhz.a;

    public static final void a(bv bvVar, String str) {
        bvVar.getClass();
        dhx dhxVar = new dhx(bvVar, str);
        d(dhxVar);
        dhz dhzVarB = b(bvVar);
        if (dhzVarB.b.contains(dhy.c) && e(dhzVarB, bvVar.getClass(), dhxVar.getClass())) {
            c(dhzVarB, dhxVar);
        }
    }

    public static final dhz b(bv bvVar) {
        while (bvVar != null) {
            if (bvVar.isAdded()) {
                bvVar.getParentFragmentManager();
            }
            bvVar = bvVar.getParentFragment();
        }
        return b;
    }

    public static final void c(dhz dhzVar, dik dikVar) {
        bv bvVar = dikVar.a;
        String name = bvVar.getClass().getName();
        Set set = dhzVar.b;
        set.contains(dhy.a);
        if (set.contains(dhy.b)) {
            be beVar = new be(name, dikVar, 16);
            if (!bvVar.isAdded()) {
                beVar.run();
                return;
            }
            Handler handler = bvVar.getParentFragmentManager().m.d;
            if (yks.e(handler.getLooper(), Looper.myLooper())) {
                beVar.run();
            } else {
                handler.post(beVar);
            }
        }
    }

    public static final void d(dik dikVar) {
        if (cr.Y(3)) {
            dikVar.a.getClass().getName();
        }
    }

    public static final boolean e(dhz dhzVar, Class cls, Class cls2) {
        Set set = (Set) dhzVar.c.get(cls.getName());
        if (set == null) {
            return true;
        }
        return (yks.e(cls2.getSuperclass(), dik.class) || !yfm.as(set, cls2.getSuperclass())) && !set.contains(cls2);
    }
}
