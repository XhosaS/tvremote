package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bio extends bin {
    private final bin l;
    private boolean m;

    public bio(long j, bja bjaVar, yjv yjvVar, yjv yjvVar2, bin binVar) {
        super(j, bjaVar, yjvVar, yjvVar2);
        this.l = binVar;
        binVar.f();
    }

    private final void F() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.l.g();
    }

    @Override // defpackage.bin
    public final bix c() throws Throwable {
        bio bioVar;
        bin binVar = this.l;
        if (binVar.f || binVar.j) {
            return new biv(this);
        }
        kk kkVar = this.g;
        long j = this.i;
        Map mapO = kkVar != null ? bjb.o(binVar.v(), this, binVar.x()) : null;
        Object obj = bjb.b;
        synchronized (obj) {
            try {
                bjb.w(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (kkVar == null || kkVar.d == 0) {
                    bioVar = this;
                    y();
                } else {
                    bioVar = this;
                    bix bixVarT = bioVar.t(binVar.v(), kkVar, mapO, binVar.x());
                    if (!yks.e(bixVarT, biw.a)) {
                        return bixVarT;
                    }
                    kk kkVarS = binVar.s();
                    if (kkVarS != null) {
                        kkVarS.f(kkVar);
                    } else {
                        binVar.u(kkVar);
                        bioVar.g = null;
                    }
                }
                if (yks.b(binVar.v(), j) < 0) {
                    binVar.l();
                }
                binVar.A(binVar.x().b(j).a(bioVar.d));
                binVar.o(j);
                int i = bioVar.k;
                bioVar.k = -1;
                if (i >= 0) {
                    int[] iArr = binVar.e;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    iArrCopyOf.getClass();
                    binVar.e = iArrCopyOf;
                }
                bja bjaVar = bioVar.d;
                synchronized (obj) {
                    binVar.d = binVar.d.c(bjaVar);
                    bin binVar2 = bioVar.l;
                    int[] iArr2 = bioVar.e;
                    int length2 = iArr2.length;
                    if (length2 != 0) {
                        int[] iArr3 = binVar2.e;
                        int length3 = iArr3.length;
                        if (length3 != 0) {
                            iArr3.getClass();
                            iArr2.getClass();
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length3 + length2);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length3, length2);
                            iArrCopyOf2.getClass();
                            iArr2 = iArrCopyOf2;
                        }
                        binVar2.e = iArr2;
                    }
                }
                bioVar.f = true;
                F();
                return biw.a;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // defpackage.bin, defpackage.bit
    public final void d() {
        if (this.j) {
            return;
        }
        super.d();
        F();
    }
}
