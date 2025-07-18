package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzf extends iyd {
    private final wll n;
    private final isf o;

    public jzf(jzs jzsVar, irc ircVar, kw kwVar, isf isfVar, wll wllVar) {
        super(jzsVar, ircVar, kwVar, isfVar);
        this.o = isfVar;
        this.n = wllVar;
    }

    @Override // defpackage.iyd
    public final Object a(yih yihVar) {
        vtw vtwVarM = www.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wll wllVar = this.n;
        www wwwVar = (www) vtwVarM.b;
        wwwVar.c = wllVar;
        wwwVar.b |= 1;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        www wwwVar2 = (www) vucVarR;
        vtw vtwVarM2 = ink.a.m();
        vtwVarM2.getClass();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        isf isfVar = this.o;
        ink inkVar = (ink) vtwVarM2.b;
        inkVar.d = wwwVar2;
        inkVar.c = 5;
        Object objA = new gxd(isfVar.g.h(ihz.Y(ipc.p(vtwVarM2))), 18).a(new jze(this, 0), yihVar);
        return objA == yio.a ? objA : ygi.a;
    }
}
