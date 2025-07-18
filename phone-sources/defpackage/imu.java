package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imu implements xqc {
    public static final xsj a;
    public static final xsj b;
    public static final xsj c;
    public static final xsj d;
    public static final xsj e;
    public static final xsj f;
    public static final xsj g;
    public static final xsj h;
    public final wjv i;
    public final xms j;
    public final xll k;
    public final ihi l;
    public final xkk m;
    public final xjf n;
    public final yfo o;
    public final Context p;
    public final lys q;
    public final isi r;
    public final jzs s;
    public final irc t;
    public final mdw u;
    public final obl v;

    static {
        wjv wjvVar = wjv.a;
        vtp vtpVar = yer.a;
        yeq yeqVar = new yeq(wjvVar);
        int i = xsj.c;
        a = new xsf("x-goog-ext-298970259-bin", yeqVar);
        b = new xsf("x-goog-ext-355860449-bin", new yeq(wkq.a));
        c = new xsf("x-goog-ext-322599375-bin", new yeq(wju.a));
        d = new xsf("x-goog-ext-361235433-bin", new yeq(wkb.a));
        e = new xsd("Accept-Language", xsm.c);
        f = new xsf("x-goog-ext-369731708-bin", new yeq(wjz.a));
        g = new xsf("x-goog-ext-286253865-bin", new yeq(uvi.a));
        h = new xsf("x-goog-ext-174067345-bin", xsm.b);
    }

    public imu(wjv wjvVar, irc ircVar, jzs jzsVar, lys lysVar, mdw mdwVar, obl oblVar, xms xmsVar, xll xllVar, ihi ihiVar, xkk xkkVar, xjf xjfVar, yfo yfoVar, Context context, isi isiVar) {
        wjvVar.getClass();
        ircVar.getClass();
        jzsVar.getClass();
        lysVar.getClass();
        mdwVar.getClass();
        oblVar.getClass();
        yfoVar.getClass();
        isiVar.getClass();
        this.i = wjvVar;
        this.t = ircVar;
        this.s = jzsVar;
        this.q = lysVar;
        this.u = mdwVar;
        this.v = oblVar;
        this.j = xmsVar;
        this.k = xllVar;
        this.l = ihiVar;
        this.m = xkkVar;
        this.n = xjfVar;
        this.o = yfoVar;
        this.p = context;
        this.r = isiVar;
    }

    @Override // defpackage.xqc
    public final xqb a(xsq xsqVar, xpy xpyVar, xpz xpzVar) {
        xpyVar.getClass();
        return new imt(this, xpzVar.a(xsqVar, xpyVar));
    }
}
