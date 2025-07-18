package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrk implements idf {
    private final moz a;
    private final kuw b;

    public lrk(moz mozVar, kuw kuwVar) {
        this.a = mozVar;
        this.b = kuwVar;
    }

    @Override // defpackage.idf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vyl b(lrj lrjVar) {
        vtw vtwVarM = vyl.a.m();
        vdn vdnVarD = this.a.d((ieg) ((kqd) lrjVar.a).a, trk.a);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vyl vylVar = (vyl) vtwVarM.b;
        vdnVarD.getClass();
        vylVar.c = vdnVarD;
        vylVar.b |= 1;
        vtw vtwVarM2 = vyk.a.m();
        int i = lrjVar.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        int i3 = i2 != 1 ? i2 != 2 ? 2 : 4 : 3;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ((vyk) vtwVarM2.b).c = a.aE(i3);
        val valVarO = kgu.o(lrjVar.b);
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vyk vykVar = (vyk) vtwVarM2.b;
        valVarO.getClass();
        vykVar.d = valVarO;
        vykVar.b |= 1;
        vbz vbzVarL = this.b.l();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vyk vykVar2 = (vyk) vtwVarM2.b;
        vbzVarL.getClass();
        vykVar2.e = vbzVarL;
        vykVar2.b |= 2;
        vyk vykVar3 = (vyk) vtwVarM2.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vyl vylVar2 = (vyl) vtwVarM.b;
        vykVar3.getClass();
        vylVar2.d = vykVar3;
        vylVar2.b |= 2;
        vtw vtwVarM3 = vcr.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar = vtwVarM3.b;
        ((vcr) vucVar).c = 10;
        if (!vucVar.A()) {
            vtwVarM3.u();
        }
        ((vcr) vtwVarM3.b).b = 20;
        vcr vcrVar = (vcr) vtwVarM3.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vyl vylVar3 = (vyl) vtwVarM.b;
        vcrVar.getClass();
        vylVar3.e = vcrVar;
        vylVar3.b |= 4;
        return (vyl) vtwVarM.r();
    }
}
