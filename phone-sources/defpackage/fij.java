package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fij extends fiq {
    private fdu a;
    private fii o;

    private static boolean d(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // defpackage.fiq
    protected final long a(edi ediVar) {
        if (!d(ediVar.a)) {
            return -1L;
        }
        int i = (ediVar.a[2] & 255) >> 4;
        if (i == 6) {
            ediVar.L(4);
            ediVar.t();
        } else if (i == 7) {
            i = 7;
            ediVar.L(4);
            ediVar.t();
        }
        int iT = fki.T(ediVar, i);
        ediVar.K(0);
        return iT;
    }

    @Override // defpackage.fiq
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.a = null;
            this.o = null;
        }
    }

    @Override // defpackage.fiq
    protected final boolean c(edi ediVar, long j, hig higVar) {
        byte[] bArr = ediVar.a;
        fdu fduVar = this.a;
        if (fduVar == null) {
            fdu fduVar2 = new fdu(bArr, 17);
            this.a = fduVar2;
            dzd dzdVar = new dzd(fduVar2.c(Arrays.copyOfRange(bArr, 9, ediVar.c), null));
            dzdVar.a("audio/ogg");
            higVar.a = new dze(dzdVar);
            return true;
        }
        if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            fse fseVarS = fki.S(ediVar);
            fdu fduVarE = fduVar.e(fseVarS);
            this.a = fduVarE;
            this.o = new fii(fduVarE, fseVarS);
            return true;
        }
        if (!d(bArr)) {
            return true;
        }
        fii fiiVar = this.o;
        if (fiiVar != null) {
            fiiVar.a = j;
            higVar.b = fiiVar;
        }
        higVar.a.getClass();
        return false;
    }
}
