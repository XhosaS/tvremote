package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aid {
    public ahw a;
    public final bcb b;
    public final bfz c;
    public final kw d;
    public final bhi e;
    private final bcb f;

    public aid(String str, long j, bhi bhiVar) {
        this.e = bhiVar;
        this.a = new ahw(new ahx(str, ccf.P(j, str.length()), null, null, null, 60));
        bcz bczVar = bcz.c;
        this.b = new bci(false, bczVar);
        byte b = 0 == true ? 1 : 0;
        this.f = new bci(new ahx(str, j, b, null, null, 60), bczVar);
        this.d = new kw(this);
        this.c = new bfz(new pku[16], 0);
    }

    public static final /* synthetic */ void h(aid aidVar, boolean z, int i) {
        ahx ahxVarB = aidVar.b();
        if (aidVar.a.b().a() == 0) {
            long j = ahxVarB.d;
            long j2 = aidVar.a.b;
            long j3 = chb.a;
            if (a.s(j, j2)) {
                if (yks.e(ahxVarB.e, aidVar.a.c) && yks.e(ahxVarB.f, aidVar.a.e) && yks.e(ahxVarB.a, aidVar.a.d)) {
                    return;
                }
                ahx ahxVarB2 = aidVar.b();
                String string = aidVar.a.toString();
                ahw ahwVar = aidVar.a;
                long j4 = ahwVar.b;
                chb chbVar = ahwVar.c;
                aidVar.f(ahxVarB2, new ahx(string, j4, chbVar, ahwVar.e, hu.P(chbVar, ahwVar.d), 32), z);
                return;
            }
        }
        int iA = aidVar.a.b().a();
        String string2 = aidVar.a.toString();
        ahw ahwVar2 = aidVar.a;
        long j5 = ahwVar2.b;
        chb chbVar2 = ahwVar2.c;
        ahx ahxVar = new ahx(string2, j5, chbVar2, ahwVar2.e, hu.P(chbVar2, ahwVar2.d), 32);
        aidVar.f(ahxVarB, ahxVar, iA != 0 && z);
        aio aioVarB = aidVar.a.b();
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            hu.T(aidVar.e, ahxVarB, ahxVar, aioVarB, true);
        } else if (i2 == 1) {
            aidVar.e.j();
        } else {
            if (i2 != 2) {
                throw new yfu();
            }
            hu.T(aidVar.e, ahxVarB, ahxVar, aioVarB, false);
        }
    }

    public final long a() {
        return b().d;
    }

    public final ahx b() {
        return (ahx) this.f.a();
    }

    public final CharSequence c() {
        return b().c;
    }

    public final void d() {
        e(false);
    }

    public final void e(boolean z) {
        this.b.b(Boolean.valueOf(z));
    }

    public final void f(ahx ahxVar, ahx ahxVar2, boolean z) {
        this.f.b(ahxVar2);
        d();
        bfz bfzVar = this.c;
        Object[] objArr = bfzVar.a;
        int i = bfzVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            pku pkuVar = (pku) objArr[i2];
            boolean z2 = (!z || ahxVar.b(ahxVar2) || ahxVar.e == null) ? false : true;
            Object obj = pkuVar.a;
            if (z2) {
                aip aipVar = (aip) obj;
                aipVar.a().restartInput(aipVar.a);
            } else {
                chb chbVar = ahxVar2.e;
                long j = ahxVar2.d;
                long j2 = ahxVar.d;
                long j3 = chb.a;
                if (!a.s(j2, j) || !yks.e(ahxVar.e, chbVar)) {
                    aip aipVar2 = (aip) obj;
                    aipVar2.a().updateSelection(aipVar2.a, chb.d(j), chb.c(j), chbVar != null ? chb.d(chbVar.b) : -1, chbVar != null ? chb.c(chbVar.b) : -1);
                }
            }
        }
    }

    public final String toString() {
        bit bitVarT = bcm.t();
        yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
        bit bitVarU = bcm.u(bitVarT);
        try {
            return "TextFieldState(selection=" + ((Object) chb.f(a())) + ", text=\"" + ((Object) c()) + "\")";
        } finally {
            bcm.z(bitVarT, bitVarU, yjvVarI);
        }
    }
}
