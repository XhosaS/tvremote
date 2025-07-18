package defpackage;

import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class arq implements arr {
    private final boolean a;
    private final Instant b;
    private final /* synthetic */ int c;
    private final clt d;

    private arq(clt cltVar, boolean z, Instant instant, int i) {
        this.c = i;
        this.d = cltVar;
        this.a = z;
        this.b = instant;
    }

    public static arq c(cyt cytVar) {
        Instant instant = Instant.EPOCH;
        cnv cnvVar = cytVar.c;
        if (cnvVar == null) {
            cnvVar = cnv.a;
        }
        Instant instantBp = dnx.bp(cnvVar);
        boolean z = false;
        for (cys cysVar : cytVar.b) {
            clf clfVar = cysVar.c;
            if (clfVar == null) {
                clfVar = clf.a;
            }
            Instant instantPlus = instantBp.plus(dnx.bo(clfVar));
            clf clfVar2 = cysVar.d;
            if (clfVar2 == null) {
                clfVar2 = clf.a;
            }
            Instant instantPlus2 = instantPlus.plus(dnx.bo(clfVar2));
            if (true == instantPlus2.isAfter(instant)) {
                instant = instantPlus2;
            }
            z |= !((cysVar.b & 16) != 0);
        }
        return new arq(cytVar, z, instant, 0);
    }

    public static arq d(cxl cxlVar) {
        Instant instant = Instant.EPOCH;
        cnv cnvVar = cxlVar.b;
        if (cnvVar == null) {
            cnvVar = cnv.a;
        }
        Instant instantBp = dnx.bp(cnvVar);
        HashSet hashSet = new HashSet();
        for (cxp cxpVar : cxlVar.c) {
            clf clfVar = cxpVar.d;
            if (clfVar == null) {
                clfVar = clf.a;
            }
            Instant instantPlus = instantBp.plus(dnx.bo(clfVar));
            if (true == instantPlus.isAfter(instant)) {
                instant = instantPlus;
            }
            int i = cxpVar.b;
            int i2 = i != 0 ? i != 3 ? i != 4 ? i != 5 ? 0 : 3 : 2 : 1 : 4;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                hashSet.add(Long.valueOf(cxpVar.c));
            } else if (i3 == 1) {
                hashSet.remove(Long.valueOf(cxpVar.c));
            }
        }
        return new arq(cxlVar, !hashSet.isEmpty(), instant, 1);
    }

    @Override // defpackage.arr
    public final long a() {
        int iL;
        int iL2;
        if (this.c != 0) {
            clt cltVar = this.d;
            if (cltVar.A()) {
                iL2 = cltVar.l(null);
                if (iL2 < 0) {
                    throw new IllegalStateException(b.e(iL2, "serialized size must be non-negative, was "));
                }
            } else {
                int i = cltVar.u & Integer.MAX_VALUE;
                if (i != Integer.MAX_VALUE) {
                    iL2 = i;
                } else {
                    int iL3 = cltVar.l(null);
                    if (iL3 < 0) {
                        throw new IllegalStateException(b.e(iL3, "serialized size must be non-negative, was "));
                    }
                    cltVar.u = (Integer.MIN_VALUE & cltVar.u) | iL3;
                    iL2 = iL3;
                }
            }
            return iL2;
        }
        clt cltVar2 = this.d;
        if (cltVar2.A()) {
            iL = cltVar2.l(null);
            if (iL < 0) {
                throw new IllegalStateException(b.e(iL, "serialized size must be non-negative, was "));
            }
        } else {
            int i2 = cltVar2.u & Integer.MAX_VALUE;
            if (i2 != Integer.MAX_VALUE) {
                iL = i2;
            } else {
                int iL4 = cltVar2.l(null);
                if (iL4 < 0) {
                    throw new IllegalStateException(b.e(iL4, "serialized size must be non-negative, was "));
                }
                cltVar2.u = (Integer.MIN_VALUE & cltVar2.u) | iL4;
                iL = iL4;
            }
        }
        return iL;
    }

    @Override // defpackage.arr
    public final /* synthetic */ Object b() {
        return this.c != 0 ? this.d : this.d;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        if (this.c != 0) {
            arq arqVar = (arq) obj;
            boolean z = arqVar.a;
            boolean z2 = this.a;
            return z2 != z ? !z2 ? 1 : -1 : arqVar.b.compareTo(this.b);
        }
        arq arqVar2 = (arq) obj;
        boolean z3 = arqVar2.a;
        boolean z4 = this.a;
        return z4 != z3 ? !z4 ? 1 : -1 : arqVar2.b.compareTo(this.b);
    }
}
