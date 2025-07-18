package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pkh implements pjg {
    private final pjd a;

    public pkh(pjd pjdVar) {
        this.a = pjdVar;
    }

    @Override // defpackage.pjg
    public final uhp a(pjk pjkVar) {
        if (pjkVar instanceof plh) {
            plh plhVar = (plh) pjkVar;
            pka pkaVarA = plhVar.a();
            vvd vvdVar = pkj.a;
            pkaVarA.i(vvdVar);
            vtr vtrVar = pkaVarA.l;
            vub vubVar = (vub) vvdVar.c;
            if (vtrVar.m(vubVar)) {
                pka pkaVarA2 = plhVar.a();
                pkaVarA2.i(vvdVar);
                Object objK = pkaVarA2.l.k(vubVar);
                if (objK == null) {
                    objK = vvdVar.b;
                } else {
                    vvdVar.c(objK);
                }
                pki pkiVar = (pki) objK;
                int iAL = a.aL(pkiVar.d);
                if (iAL == 0) {
                    iAL = 1;
                }
                int i = iAL - 1;
                if (i == 1) {
                    if ((pkiVar.b & 1) != 0) {
                        return sfy.C(pjd.a(pkiVar.c));
                    }
                    throw new IllegalArgumentException("GAIA type must have a name");
                }
                if (i == 2) {
                    return sfy.C(new pjd(3, null));
                }
                if (i == 3) {
                    return sfy.C(new pjd(2, null));
                }
                if (i == 4) {
                    return sfy.C(this.a);
                }
                throw new IllegalArgumentException("Unknown type");
            }
        }
        return sfy.C(null);
    }
}
