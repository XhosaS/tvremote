package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lro implements idf {
    private final moz a;
    private final kuw b;

    public lro(moz mozVar, kuw kuwVar) {
        this.a = mozVar;
        this.b = kuwVar;
    }

    @Override // defpackage.idf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vyn b(lrn lrnVar) {
        vtw vtwVarM = vyn.a.m();
        vdn vdnVarD = this.a.d(lrnVar.a, trk.a);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vyn vynVar = (vyn) vtwVarM.b;
        vdnVarD.getClass();
        vynVar.c = vdnVarD;
        vynVar.b |= 1;
        vtw vtwVarM2 = vyo.a.m();
        String str = lrnVar.b;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        str.getClass();
        ((vyo) vucVar).c = str;
        int i = lrnVar.c;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        ((vyo) vtwVarM2.b).d = i;
        vbz vbzVarL = this.b.l();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vyo vyoVar = (vyo) vtwVarM2.b;
        vbzVarL.getClass();
        vyoVar.e = vbzVarL;
        vyoVar.b |= 1;
        vyo vyoVar2 = (vyo) vtwVarM2.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vyn vynVar2 = (vyn) vtwVarM.b;
        vyoVar2.getClass();
        vynVar2.d = vyoVar2;
        vynVar2.b |= 2;
        vtw vtwVarM3 = vcr.a.m();
        int i2 = lrnVar.d;
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar2 = vtwVarM3.b;
        ((vcr) vucVar2).c = i2;
        int i3 = lrnVar.e;
        if (!vucVar2.A()) {
            vtwVarM3.u();
        }
        ((vcr) vtwVarM3.b).b = i3;
        vcr vcrVar = (vcr) vtwVarM3.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vyn vynVar3 = (vyn) vtwVarM.b;
        vcrVar.getClass();
        vynVar3.e = vcrVar;
        vynVar3.b |= 4;
        return (vyn) vtwVarM.r();
    }
}
