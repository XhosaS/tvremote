package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmo implements fmj {
    final /* synthetic */ fmq a;
    private final edh b = new edh(new byte[4]);

    public fmo(fmq fmqVar) {
        this.a = fmqVar;
    }

    @Override // defpackage.fmj
    public final void a(edi ediVar) {
        if (ediVar.j() == 0 && (ediVar.j() & 128) != 0) {
            ediVar.L(6);
            int iA = ediVar.a() / 4;
            for (int i = 0; i < iA; i++) {
                edh edhVar = this.b;
                ediVar.E(edhVar, 4);
                int iD = edhVar.d(16);
                edhVar.n(3);
                if (iD == 0) {
                    edhVar.n(13);
                } else {
                    int iD2 = edhVar.d(13);
                    fmq fmqVar = this.a;
                    SparseArray sparseArray = fmqVar.c;
                    if (sparseArray.get(iD2) == null) {
                        sparseArray.put(iD2, new fmk(new fmp(fmqVar, iD2)));
                        fmqVar.g++;
                    }
                }
            }
            fmq fmqVar2 = this.a;
            if (fmqVar2.a != 2) {
                fmqVar2.c.remove(0);
            }
        }
    }

    @Override // defpackage.fmj
    public final void b(edo edoVar, fdr fdrVar, fmr fmrVar) {
    }
}
