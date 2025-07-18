package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jil extends ixi {
    public final iea d;
    public final ino e;
    public final boolean f;
    public final lhm g;
    private final ihi h;

    /* JADX WARN: Illegal instructions before constructor call */
    public jil(lhm lhmVar, iea ieaVar, ihi ihiVar, ino inoVar, wkx wkxVar) {
        vvd vvdVar = wup.c;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.g = lhmVar;
        this.d = ieaVar;
        this.h = ihiVar;
        this.e = inoVar;
        this.f = ihiVar.b();
    }

    public final wll i() {
        wll wllVar = ((wup) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        wllVar.getClass();
        return wllVar;
    }

    public final boolean j(wni wniVar) {
        wniVar.getClass();
        if (hju.v(wniVar)) {
            return false;
        }
        if (this.f) {
            return this.e.F(wniVar);
        }
        sei seiVarG = this.g.g(((ldy) this.d).a(), hju.r(wniVar));
        return seiVarG.b() && seiVarG.c();
    }
}
