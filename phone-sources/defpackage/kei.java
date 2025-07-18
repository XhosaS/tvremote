package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kei extends iyd {
    private final String n;
    private final isf o;

    public kei(jzs jzsVar, irc ircVar, kw kwVar, isf isfVar, String str) {
        super(jzsVar, ircVar, kwVar, isfVar);
        this.o = isfVar;
        this.n = str;
    }

    @Override // defpackage.iyd
    public final Object a(yih yihVar) {
        wod wodVar = wod.a;
        wodVar.getClass();
        Object objA = b("", wodVar, false).a(new jze(this, 6), yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    @Override // defpackage.iyd
    public final ysx b(String str, wod wodVar, boolean z) {
        wodVar.getClass();
        if (str != null && str.length() != 0) {
            return super.b(str, wodVar, z);
        }
        isf isfVar = this.o;
        String str2 = this.n;
        vtw vtwVarM = wwq.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((wwq) vucVar).c = str2;
        String str3 = isfVar.b;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        str3.getClass();
        ((wwq) vucVar2).d = str3;
        wom womVar = isfVar.c;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        wwq wwqVar = (wwq) vtwVarM.b;
        womVar.getClass();
        wwqVar.e = womVar;
        wwqVar.b |= 1;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        wwq wwqVar2 = (wwq) vucVarR;
        vtw vtwVarM2 = ink.a.m();
        vtwVarM2.getClass();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ink inkVar = (ink) vtwVarM2.b;
        inkVar.d = wwqVar2;
        inkVar.c = 3;
        ink inkVarP = ipc.p(vtwVarM2);
        return new gxd(isfVar.d.h(z ? ihz.Z(inkVarP) : ihz.Y(inkVarP)), 13);
    }

    @Override // defpackage.iyd
    public final boolean d() {
        return true;
    }
}
