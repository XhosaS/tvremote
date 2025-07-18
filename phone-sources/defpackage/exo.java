package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exo implements fdr {

    @Deprecated
    public static final hin b = new hin((byte[]) null);
    private static final rsj j = new rsj();
    public dze[] a;
    private final fdp c;
    private final int d;
    private final dze e;
    private final SparseArray f = new SparseArray();
    private boolean g;
    private long h;
    private fef i;
    private epm k;

    public exo(fdp fdpVar, int i, dze dzeVar) {
        this.c = fdpVar;
        this.d = i;
        this.e = dzeVar;
    }

    public final fdg a() {
        fef fefVar = this.i;
        if (fefVar instanceof fdg) {
            return (fdg) fefVar;
        }
        return null;
    }

    public final void b() {
        this.c.c();
    }

    public final boolean c(fdq fdqVar) {
        int iG = this.c.g(fdqVar, j);
        a.ab(iG != 1);
        return iG == 0;
    }

    public final void d(epm epmVar, long j2, long j3) {
        this.k = epmVar;
        this.h = j3;
        if (!this.g) {
            fdp fdpVar = this.c;
            fdpVar.y(this);
            if (j2 != -9223372036854775807L) {
                fdpVar.d(0L, j2);
            }
            this.g = true;
            return;
        }
        fdp fdpVar2 = this.c;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        fdpVar2.d(0L, j2);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f;
            if (i >= sparseArray.size()) {
                return;
            }
            ((exn) sparseArray.valueAt(i)).h(epmVar, j3);
            i++;
        }
    }

    @Override // defpackage.fdr
    public final fel dq(int i, int i2) {
        SparseArray sparseArray = this.f;
        exn exnVar = (exn) sparseArray.get(i);
        if (exnVar != null) {
            return exnVar;
        }
        a.ab(this.a == null);
        exn exnVar2 = new exn(i2, i2 == this.d ? this.e : null);
        exnVar2.h(this.k, this.h);
        sparseArray.put(i, exnVar2);
        return exnVar2;
    }

    @Override // defpackage.fdr
    public final void j() {
        SparseArray sparseArray = this.f;
        dze[] dzeVarArr = new dze[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            dze dzeVar = ((exn) sparseArray.valueAt(i)).a;
            eci.e(dzeVar);
            dzeVarArr[i] = dzeVar;
        }
        this.a = dzeVarArr;
    }

    @Override // defpackage.fdr
    public final void r(fef fefVar) {
        this.i = fefVar;
    }
}
