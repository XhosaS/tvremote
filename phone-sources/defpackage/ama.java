package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ama implements yjz {
    final /* synthetic */ cds a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean c;
    final /* synthetic */ bkp d;
    final /* synthetic */ amg e;

    public ama(cds cdsVar, long j, boolean z, bkp bkpVar, amg amgVar) {
        this.a = cdsVar;
        this.b = j;
        this.c = z;
        this.d = bkpVar;
        this.e = amgVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            bcm.i(ccq.m.c(this.a), bga.k(1260045569, new alz(this.b, this.c, this.d, this.e), baoVar), baoVar, 56);
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}
