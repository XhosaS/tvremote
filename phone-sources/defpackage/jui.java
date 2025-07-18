package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jui extends ixi {
    public final Object d;
    public final Object e;

    /* JADX WARN: Illegal instructions before constructor call */
    public jui(iof iofVar, ino inoVar, wkx wkxVar) {
        vvd vvdVar = wuh.j;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.e = iofVar;
        this.d = inoVar;
    }

    public final void i(boolean z) {
        wll wllVar = ((wvg) this.b).c;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        Object obj = this.e;
        wllVar.getClass();
        ((isw) obj).s(new iog(wllVar, ((ksn) ((ldy) this.d).a().g()).a), z);
    }

    public final boolean j() {
        wkk wkkVar = ((wvg) this.b).f;
        if (wkkVar == null) {
            wkkVar = wkk.a;
        }
        return wkkVar.b == 2;
    }

    public final boolean k() {
        wll wllVar = ((wvg) this.b).c;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        Object obj = this.e;
        wllVar.getClass();
        return ((isw) obj).t(new iog(wllVar, ((ksn) ((ldy) this.d).a().g()).a));
    }

    public final wni l() {
        wni wniVarO = ihz.o(m());
        if (wniVarO != null) {
            return wniVarO;
        }
        wni wniVar = ((wuh) this.b).i;
        if (wniVar == null) {
            wniVar = wni.a;
        }
        if (true != hju.v(wniVar)) {
            return wniVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [iof, java.lang.Object] */
    public final wnp m() {
        wuh wuhVar = (wuh) this.b;
        wll wllVar = wuhVar.b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        ?? r2 = this.e;
        wllVar.getClass();
        return r2.b(wllVar, wuhVar.h);
    }

    public final String n() {
        String str;
        wnp wnpVarM = m();
        if (wnpVarM == null) {
            return "";
        }
        wno wnoVar = wnpVarM.b;
        if (wnoVar == null) {
            wnoVar = wno.a;
        }
        return (wnoVar == null || (str = wnoVar.b) == null) ? "" : str;
    }

    public final String o() {
        wni wniVarL = l();
        if (wniVarL != null) {
            return wniVarL.b;
        }
        return null;
    }

    public final boolean p() {
        int iBm = a.bm(((wuh) this.b).c);
        if (iBm == 0 || iBm == 1) {
            return false;
        }
        return q() || ihz.K(m()) || ihz.D(m());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ino, java.lang.Object] */
    public final boolean q() {
        if (ihz.H(m()) || ihz.I(m())) {
            return true;
        }
        wni wniVarL = l();
        return wniVarL != null && this.d.H(wniVarL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jui(isw iswVar, iea ieaVar, wkx wkxVar) {
        vvd vvdVar = wvg.g;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.e = iswVar;
        this.d = ieaVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jui(wkx wkxVar, isi isiVar, Context context) {
        vvd vvdVar = wtz.j;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.e = isiVar;
        this.d = context;
    }
}
