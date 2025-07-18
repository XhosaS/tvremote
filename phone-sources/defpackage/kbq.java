package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbq {
    public final ino a;
    public final wni b;
    public final ysx c;
    private final Context d;
    private final ixm e;
    private final wkx f;
    private final lfn g;
    private final iea h;
    private final xjt i;
    private final int j;
    private final int k;
    private final yow l;
    private final yil m;
    private final ovq n;
    private final ioy o;
    private final irc p;

    public kbq(Context context, irc ircVar, ovq ovqVar, ixm ixmVar, wkx wkxVar, ino inoVar, ioy ioyVar, lfn lfnVar, iea ieaVar, xjt xjtVar, int i, int i2, yow yowVar, yil yilVar) {
        context.getClass();
        yowVar.getClass();
        yilVar.getClass();
        this.d = context;
        this.p = ircVar;
        this.n = ovqVar;
        this.e = ixmVar;
        this.f = wkxVar;
        this.a = inoVar;
        this.o = ioyVar;
        this.g = lfnVar;
        this.h = ieaVar;
        this.i = xjtVar;
        this.j = i;
        this.k = i2;
        this.l = yowVar;
        this.m = yilVar;
        vvd vvdVar = wsu.l;
        wkxVar.i(vvdVar);
        Object objK = wkxVar.l.k((vub) vvdVar.c);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        vun vunVar = ((wsu) objK).k;
        vunVar.getClass();
        this.b = (wni) yfm.U(vunVar);
        this.c = new ipi(ytb.a(new ipi(new ipi(inoVar.A(), this, 5), this, 6)), this, 7);
    }

    public final kbm a(boolean z) {
        return new kbm(this.h, this.f, this.g, this.j, this.k, this.d, this.p, this.o, z, this.n, this.e, this.i, this.l, this.m);
    }
}
