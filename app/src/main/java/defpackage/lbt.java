package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
class lbt implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ lcl b;

    public lbt(lcl lclVar, AppMetadata appMetadata) {
        this.a = appMetadata;
        this.b = lclVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ljy ljyVarE;
        lih lihVar = this.b.a;
        lihVar.t();
        lihVar.aC().g();
        lihVar.v();
        AppMetadata appMetadata = this.a;
        kkk.k(appMetadata);
        String str = appMetadata.a;
        kkk.h(str);
        int i = 0;
        if (lihVar.j().t(null, kzg.az)) {
            kkk.k(lihVar.l);
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iH = lihVar.j().h(null, kzg.ai);
            long j = jCurrentTimeMillis - lihVar.j().j();
            while (i < iH && lihVar.af(null, j)) {
                i++;
            }
        } else {
            long jK = lihVar.j().k();
            while (i < jK && lihVar.af(str, 0L)) {
                i++;
            }
        }
        if (lihVar.j().t(null, kzg.aA)) {
            lihVar.aC().g();
            lihVar.O();
        }
        lhv lhvVar = lihVar.j;
        lln llnVarB = lln.b(appMetadata.E);
        lhvVar.g();
        if (llnVarB != lln.CLIENT_UPLOAD_ELIGIBLE || lhvVar.e(str) || (ljyVarE = lhvVar.ae().e(str)) == null || (ljyVarE.b & 512) == 0) {
            return;
        }
        lkc lkcVar = ljyVarE.l;
        if (lkcVar == null) {
            lkcVar = lkc.a;
        }
        if (lkcVar.e.isEmpty()) {
            return;
        }
        lihVar.aB().k.b("[sgtm] Going background, trigger client side upload. appId", str);
        kkk.k(lihVar.l);
        lihVar.aa(str, System.currentTimeMillis());
    }
}
