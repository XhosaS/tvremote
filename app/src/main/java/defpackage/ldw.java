package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ldw implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ leo b;

    public ldw(leo leoVar, long j) {
        this.a = j;
        this.b = leoVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        leo leoVar = this.b;
        leoVar.g();
        leoVar.a();
        lbk lbkVar = leoVar.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.j.a("Resetting analytics data (FE)");
        lbk lbkVar2 = leoVar.y;
        lhg lhgVar = lbkVar2.h;
        lbkVar2.n(lhgVar);
        lhgVar.g();
        lhf lhfVar = lhgVar.c;
        lhe lheVar = lhgVar.d;
        lheVar.c.a();
        klk klkVar = lheVar.d.y.B;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        lheVar.a = jElapsedRealtime;
        lheVar.b = jElapsedRealtime;
        lbkVar2.e().k();
        lao laoVar = lbkVar.e;
        boolean zS = leoVar.y.s();
        lbkVar.m(laoVar);
        boolean z = !zS;
        laoVar.d.b(this.a);
        lbk lbkVar3 = laoVar.y;
        lao laoVar2 = lbkVar3.e;
        lbkVar3.m(laoVar2);
        lan lanVar = laoVar2.u;
        lanVar.a();
        if (!TextUtils.isEmpty(lanVar.a)) {
            laoVar.u.b(null);
        }
        laoVar.o.b(0L);
        laoVar.p.b(0L);
        if (!lbkVar3.d.w()) {
            laoVar.k(z);
        }
        laoVar.v.b(null);
        laoVar.w.b(0L);
        laoVar.x.b(null);
        lgp lgpVarK = lbkVar2.k();
        lgpVarK.g();
        lbk lbkVar4 = lgpVarK.y;
        lgpVarK.a();
        AppMetadata appMetadataI = lgpVarK.i(false);
        kts ktsVar = lgpVarK.y.c;
        lbkVar4.f().i();
        lgpVarK.p(new lfq(lgpVarK, appMetadataI));
        lbkVar2.n(lhgVar);
        lhfVar.a();
        leoVar.j = z;
        lbkVar2.k().m(new AtomicReference());
    }
}
