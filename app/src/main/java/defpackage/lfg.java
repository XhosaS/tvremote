package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lfg extends ksw {
    public volatile lez a;
    public volatile lez b;
    protected lez c;
    public final Map d;
    public ScionActivityInfo e;
    public volatile boolean f;
    public volatile lez g;
    public lez h;
    public boolean i;
    public final Object j;

    public lfg(lbk lbkVar) {
        super(lbkVar);
        this.j = new Object();
        this.d = new ConcurrentHashMap();
    }

    @Override // defpackage.ksw
    protected final boolean f() {
        return false;
    }

    public final lez i(ScionActivityInfo scionActivityInfo) {
        kkk.k(scionActivityInfo);
        Integer numValueOf = Integer.valueOf(scionActivityInfo.a);
        Map map = this.d;
        lez lezVar = (lez) map.get(numValueOf);
        if (lezVar == null) {
            String strO = o(scionActivityInfo.b);
            lbk lbkVar = this.y;
            lio lioVar = lbkVar.i;
            lbkVar.m(lioVar);
            lez lezVar2 = new lez(null, strO, lioVar.v());
            map.put(numValueOf, lezVar2);
            lezVar = lezVar2;
        }
        return this.g != null ? this.g : lezVar;
    }

    public final lez j(boolean z) {
        a();
        g();
        if (!z) {
            return this.c;
        }
        lez lezVar = this.c;
        return lezVar != null ? lezVar : this.h;
    }

    public final void k(String str, lez lezVar, boolean z) {
        lez lezVar2;
        lez lezVar3 = this.a == null ? this.b : this.a;
        if (lezVar.b == null) {
            lezVar2 = new lez(lezVar.a, str != null ? o(str) : null, lezVar.c, lezVar.e, lezVar.f);
        } else {
            lezVar2 = lezVar;
        }
        this.b = this.a;
        this.a = lezVar2;
        lbk lbkVar = this.y;
        klk klkVar = lbkVar.B;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(new lfb(this, lezVar2, lezVar3, jElapsedRealtime, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.lez r15, defpackage.lez r16, long r17, boolean r19, android.os.Bundle r20) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfg.l(lez, lez, long, boolean, android.os.Bundle):void");
    }

    public final void m(ScionActivityInfo scionActivityInfo, Bundle bundle) {
        Bundle bundle2;
        if (!this.y.d.v() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.d.put(Integer.valueOf(scionActivityInfo.a), new lez(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void n(lez lezVar, boolean z, long j) {
        lbk lbkVar = this.y;
        kst kstVar = lbkVar.m;
        lbkVar.l(kstVar);
        klk klkVar = this.y.B;
        kstVar.e(SystemClock.elapsedRealtime());
        boolean z2 = lezVar != null && lezVar.d;
        lhg lhgVar = lbkVar.h;
        lbkVar.n(lhgVar);
        if (!lhgVar.d.b(z2, z, j) || lezVar == null) {
            return;
        }
        lezVar.d = false;
    }

    public final String o(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        ktx ktxVar = this.y.d;
        return str2.length() > ktxVar.c(null, false) ? str2.substring(0, ktxVar.c(null, false)) : str2;
    }
}
