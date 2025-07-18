package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffk implements fdp {
    private fdr b;
    private int c;
    private int d;
    private int e;
    private fgp g;
    private fdq h;
    private ffl i;
    private fhz j;
    private final edi a = new edi(6);
    private long f = -1;

    private final int h(fdq fdqVar) {
        edi ediVar = this.a;
        ediVar.G(2);
        fdqVar.i(ediVar.a, 0, 2);
        return ediVar.n();
    }

    private final void i() {
        fdr fdrVar = this.b;
        fdrVar.getClass();
        fdrVar.j();
        this.b.r(new fee(-9223372036854775807L));
        this.c = 6;
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            fhz fhzVar = this.j;
            fhzVar.getClass();
            fhzVar.d(j, j2);
        }
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        if (h(fdqVar) != 65496) {
            return false;
        }
        int iH = h(fdqVar);
        this.d = iH;
        if (iH == 65504) {
            edi ediVar = this.a;
            ediVar.G(2);
            fdqVar.i(ediVar.a, 0, 2);
            fdqVar.g(ediVar.n() - 2);
            iH = h(fdqVar);
            this.d = iH;
        }
        if (iH != 65505) {
            return false;
        }
        fdqVar.g(2);
        edi ediVar2 = this.a;
        ediVar2.G(6);
        fdqVar.i(ediVar2.a, 0, 6);
        return ediVar2.r() == 1165519206 && ediVar2.n() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017f  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(defpackage.fdq r26, defpackage.rsj r27) throws defpackage.eaf {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffk.g(fdq, rsj):int");
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        this.b = fdrVar;
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
