package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbf implements qbd {
    public static final /* synthetic */ int a = 0;
    private static final tvn b = tvn.n("GnpSdk");
    private final pzq c;

    public qbf(pzq pzqVar, pyd pydVar) {
        pzqVar.getClass();
        pydVar.getClass();
        this.c = pzqVar;
    }

    @Override // defpackage.qbd
    public final Object a(qen qenVar, Long l, vlo vloVar, yih yihVar) {
        long j = qenVar.j;
        if (j == 0) {
            b.l().v("SYNC request fell back to FULL_SYNC for account [%s]. Account never synced before.", qtl.M(qenVar.b));
            Object objB = b(qenVar, vloVar, yihVar);
            if (objB == yio.a) {
                return objB;
            }
        } else {
            if (l != null && j >= l.longValue()) {
                b.l().E("SYNC request ignored for account [%s]. Current version [%d]. Requested version [%d].", qtl.M(qenVar.b), new Long(j), l);
                return ygi.a;
            }
            b.l().E("Sending SYNC request for account [%s], current sync version [%d], for reason [%s].", qtl.M(qenVar.b), new Long(j), vloVar.name());
            Object objB2 = this.c.b(qenVar, j, vloVar, yihVar);
            if (objB2 == yio.a) {
                return objB2;
            }
        }
        return ygi.a;
    }

    @Override // defpackage.qbd
    public final Object b(qen qenVar, vlo vloVar, yih yihVar) {
        Object objC = this.c.c(qenVar, vloVar, yihVar);
        return objC == yio.a ? objC : ygi.a;
    }

    @Override // defpackage.qbd
    public final Object c(qen qenVar, vmo vmoVar, String str, pvu pvuVar, List list, yih yihVar) {
        Object objE = this.c.e(qenVar, vmoVar, str, pvuVar, list, yihVar);
        return objE == yio.a ? objE : ygi.a;
    }
}
