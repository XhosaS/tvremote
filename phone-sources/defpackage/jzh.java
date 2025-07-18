package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzh extends iyd {
    private final wll n;
    private final isf o;

    public jzh(jzs jzsVar, isf isfVar, irc ircVar, kw kwVar, wll wllVar) {
        super(jzsVar, ircVar, kwVar, isfVar);
        this.o = isfVar;
        this.n = wllVar;
    }

    @Override // defpackage.iyd
    public final Object a(yih yihVar) {
        wod wodVar = wod.a;
        wodVar.getClass();
        Object objA = b("", wodVar, false).a(new jze(this, 2), yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    @Override // defpackage.iyd
    public final ysx b(String str, wod wodVar, boolean z) {
        wodVar.getClass();
        vtw vtwVarM = wwu.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wll wllVar = this.n;
        wwu wwuVar = (wwu) vtwVarM.b;
        wwuVar.c = wllVar;
        wwuVar.b |= 1;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        wwu wwuVar2 = (wwu) vucVarR;
        vtw vtwVarM2 = ink.a.m();
        vtwVarM2.getClass();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        isf isfVar = this.o;
        ink inkVar = (ink) vtwVarM2.b;
        inkVar.d = wwuVar2;
        inkVar.c = 6;
        ink inkVarP = ipc.p(vtwVarM2);
        return new gxd(isfVar.h.h(z ? ihz.Z(inkVarP) : ihz.Y(inkVarP)), 17);
    }

    @Override // defpackage.iyd
    public final boolean d() {
        return true;
    }
}
