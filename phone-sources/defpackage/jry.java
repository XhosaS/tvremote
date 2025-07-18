package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jry extends ixi implements ixh {
    public final Object d;

    /* JADX WARN: Illegal instructions before constructor call */
    public jry(iof iofVar, wkx wkxVar) {
        vvd vvdVar = wui.f;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.d = iofVar;
    }

    public final boolean i() {
        int i = ((wsy) this.b).b;
        return ((i & 4) == 0 || (i & 8) == 0) ? false : true;
    }

    public final boolean j() {
        wll wllVar = ((wuu) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        Object obj = this.d;
        wllVar.getClass();
        return ((isr) obj).q(wllVar);
    }

    public final void k(boolean z) {
        wll wllVar = ((wus) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        Object obj = this.d;
        wllVar.getClass();
        ((irn) obj).t(wllVar, z);
    }

    public final boolean l() {
        wll wllVar = ((wus) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        Object obj = this.d;
        wllVar.getClass();
        return ((irn) obj).r(wllVar);
    }

    public final void m(boolean z) {
        wll wllVar = ((wur) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        Object obj = this.d;
        wllVar.getClass();
        ((irn) obj).s(wllVar, z);
    }

    public final boolean n() {
        wll wllVar = ((wur) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        Object obj = this.d;
        wllVar.getClass();
        return ((irn) obj).q(wllVar);
    }

    public final wlx o() {
        wlx wlxVar = ((wui) this.b).c;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        wlxVar.getClass();
        return wlxVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [iof, java.lang.Object] */
    public final wnp p() {
        wll wllVar = ((wui) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        ?? r1 = this.d;
        wllVar.getClass();
        return r1.b(wllVar, "play-movies");
    }

    public final wpm q() {
        return ihz.t(p());
    }

    public final String r() {
        String str = ((wui) this.b).d;
        str.getClass();
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jry(jzs jzsVar, wkx wkxVar) {
        vvd vvdVar = wve.c;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.d = jzsVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jry(irn irnVar, wkx wkxVar, byte[] bArr) {
        vvd vvdVar = wur.d;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.d = irnVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jry(irn irnVar, wkx wkxVar) {
        vvd vvdVar = wus.d;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.d = irnVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jry(isr isrVar, wkx wkxVar) {
        vvd vvdVar = wuu.e;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.d = isrVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jry(wkx wkxVar, isi isiVar, byte[] bArr) {
        vvd vvdVar = wsy.l;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.d = isiVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, yfo] */
    public jry(mru mruVar, lxj lxjVar, wkx wkxVar) {
        vvd vvdVar = wta.b;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        iea ieaVarA = lxjVar.a();
        iea ieaVarB = lxjVar.b();
        Object objB = mruVar.c.b();
        Object objB2 = mruVar.a.b();
        SharedPreferences sharedPreferences = (SharedPreferences) mruVar.b.b();
        sharedPreferences.getClass();
        this.d = new mok((kuw) objB, (oxe) objB2, sharedPreferences, ieaVarA, ieaVarB);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, yfo] */
    public jry(paq paqVar, lxj lxjVar, wkx wkxVar) {
        vvd vvdVar = wtb.b;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        iea ieaVarC = lxjVar.c();
        ((rgq) paqVar.a).a();
        Object objB = paqVar.b.b();
        Object objB2 = paqVar.d.b();
        SharedPreferences sharedPreferences = (SharedPreferences) paqVar.c.b();
        sharedPreferences.getClass();
        this.d = new mpb((kuw) objB, (oxe) objB2, sharedPreferences, ieaVarC);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jry(wkx wkxVar, isi isiVar) {
        vvd vvdVar = wtj.j;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.d = isiVar;
    }
}
