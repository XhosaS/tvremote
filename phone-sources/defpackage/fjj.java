package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjj implements fdr {
    private final fdr a;
    private final fjg b;
    private final SparseArray c = new SparseArray();
    private boolean d;

    public fjj(fdr fdrVar, fjg fjgVar) {
        this.a = fdrVar;
        this.b = fjgVar;
    }

    @Override // defpackage.fdr
    public final fel dq(int i, int i2) {
        if (i2 != 3) {
            this.d = true;
            return this.a.dq(i, i2);
        }
        SparseArray sparseArray = this.c;
        fjl fjlVar = (fjl) sparseArray.get(i);
        if (fjlVar != null) {
            return fjlVar;
        }
        fjl fjlVar2 = new fjl(this.a.dq(i, 3), this.b);
        sparseArray.put(i, fjlVar2);
        return fjlVar2;
    }

    @Override // defpackage.fdr
    public final void j() {
        this.a.j();
        if (!this.d) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            ((fjl) sparseArray.valueAt(i)).d = true;
            i++;
        }
    }

    @Override // defpackage.fdr
    public final void r(fef fefVar) {
        this.a.r(fefVar);
    }
}
