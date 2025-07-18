package defpackage;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
class lhf {
    final /* synthetic */ lhg a;

    public lhf(lhg lhgVar) {
        this.a = lhgVar;
    }

    final void a() {
        lhg lhgVar = this.a;
        lhgVar.g();
        lbk lbkVar = lhgVar.y;
        lao laoVar = lbkVar.e;
        lbkVar.m(laoVar);
        klk klkVar = lbkVar.B;
        if (laoVar.l(System.currentTimeMillis())) {
            lbkVar.m(laoVar);
            laoVar.k.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.k.a("Detected application was in foreground");
                b(System.currentTimeMillis());
            }
        }
    }

    final void b(long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        lhg lhgVar = this.a;
        lhgVar.g();
        if (lhgVar.y.s()) {
            lbk lbkVar = lhgVar.y;
            lao laoVar = lbkVar.e;
            lbkVar.m(laoVar);
            laoVar.o.b(j);
            klk klkVar = lbkVar.B;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.b("Session started, time", Long.valueOf(jElapsedRealtime));
            long j2 = j / 1000;
            lbk lbkVar2 = lhgVar.y;
            Long lValueOf = Long.valueOf(j2);
            leo leoVar = lbkVar2.l;
            lbkVar2.n(leoVar);
            leoVar.I("auto", "_sid", lValueOf, j);
            lbkVar.m(laoVar);
            lal lalVar = laoVar.p;
            lValueOf.getClass();
            lalVar.b(j2);
            lbkVar.m(laoVar);
            laoVar.k.b(false);
            Bundle bundle = new Bundle();
            lValueOf.getClass();
            bundle.putLong("_sid", j2);
            lbkVar2.n(leoVar);
            leoVar.v("auto", "_s", j, bundle);
            lbkVar.m(laoVar);
            lan lanVar = laoVar.u;
            lanVar.a();
            String str = lanVar.a;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", str);
            lbkVar2.n(leoVar);
            leoVar.v("auto", "_ssr", j, bundle2);
        }
    }

    final void c(long j) {
        lhg lhgVar = this.a;
        lhgVar.g();
        lhgVar.i();
        lbk lbkVar = lhgVar.y;
        lao laoVar = lbkVar.e;
        lbkVar.m(laoVar);
        if (laoVar.l(j)) {
            lbkVar.m(laoVar);
            laoVar.k.b(true);
            lhgVar.y.e().k();
        }
        lbkVar.m(laoVar);
        laoVar.o.b(j);
        lbkVar.m(laoVar);
        laj lajVar = laoVar.k;
        lajVar.a();
        if (lajVar.a) {
            b(j);
        }
    }
}
