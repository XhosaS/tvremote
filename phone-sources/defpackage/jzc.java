package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzc extends iyd {
    public final wni n;
    public final ihi o;
    public final ino p;
    private final iea q;
    private final wll r;
    private final wpd s;
    private final isf t;

    public jzc(jzs jzsVar, irc ircVar, kw kwVar, isf isfVar, iea ieaVar, wll wllVar, wni wniVar, wpd wpdVar, ihi ihiVar, ino inoVar) {
        super(jzsVar, ircVar, kwVar, isfVar);
        this.t = isfVar;
        this.q = ieaVar;
        this.r = wllVar;
        this.n = wniVar;
        this.s = wpdVar;
        this.o = ihiVar;
        this.p = inoVar;
    }

    @Override // defpackage.iyd
    public final Object a(yih yihVar) {
        wod wodVar = wod.a;
        wodVar.getClass();
        Object objA = b("", wodVar, false).a(new jze(this, 1), yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    @Override // defpackage.iyd
    public final ysx b(String str, wod wodVar, boolean z) {
        wodVar.getClass();
        wll wllVar = this.r;
        boolean z2 = (hju.u(wllVar) && this.n == null) ? false : true;
        wni wniVar = this.n;
        sij.A(z2, "Neither EntityId [%s] nor PlayId [%s] is non-null / non-empty.", wllVar, wniVar);
        ieg iegVarA = ((ldy) this.q).a();
        iegVarA.getClass();
        if (!hju.u(wllVar)) {
            return new jzb(this.t.j(wllVar, this.s, z), iegVarA, this, 1);
        }
        if (wniVar == null) {
            return new isv(new ihz[0], 5);
        }
        isf isfVar = this.t;
        wpd wpdVar = this.s;
        vtw vtwVarM = wwy.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wwy wwyVar = (wwy) vucVar;
        wwyVar.d = wniVar;
        wwyVar.c = 2;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wwy wwyVar2 = (wwy) vtwVarM.b;
        wwyVar2.e = wpdVar;
        wwyVar2.b = 1 | wwyVar2.b;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        vtw vtwVarM2 = ink.a.m();
        vtwVarM2.getClass();
        ipc.r((wwy) vucVarR, vtwVarM2);
        hfx hfxVar = isfVar.f;
        ink inkVarP = ipc.p(vtwVarM2);
        return new jzb(new gxd(hfxVar.h(z ? ihz.Z(inkVarP) : ihz.Y(inkVarP)), 20), iegVarA, this, 0);
    }

    @Override // defpackage.iyd
    public final boolean d() {
        return true;
    }
}
