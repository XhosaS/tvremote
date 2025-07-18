package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdt extends sbx {
    private final kdh a;

    public kdt(kdh kdhVar) {
        this.a = kdhVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new kdv(this.a.a);
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        wlx wlxVar;
        kds kdsVar = (kds) obj;
        kdv kdvVar = (kdv) obj2;
        wlx wlxVar2 = kdsVar.d;
        if (wlxVar2 == null) {
            wlxVar2 = wlx.a;
        }
        wlxVar2.getClass();
        if (ihz.U(wlxVar2)) {
            wlxVar = null;
        } else {
            wlxVar = kdsVar.d;
            if (wlxVar == null) {
                wlxVar = wlx.a;
            }
        }
        if (!yks.e(kdvVar.a, wlxVar)) {
            kdvVar.a = wlxVar;
            kdvVar.G(0);
        }
        sco scoVar = new sco(kdsVar.c);
        if (!yks.e(kdvVar.b, scoVar)) {
            kdvVar.b = scoVar;
            kdvVar.G(1);
        }
        wls wlsVar = kdsVar.e;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(kdvVar.c, wlsVar)) {
            kdvVar.c = wlsVar;
            kdvVar.G(2);
        }
        wls wlsVar2 = kdsVar.f;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        if (yks.e(kdvVar.d, wlsVar2)) {
            return;
        }
        kdvVar.d = wlsVar2;
        kdvVar.G(3);
    }
}
