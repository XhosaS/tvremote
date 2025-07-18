package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tly implements tma {
    private final tlx a;

    public tly(tlx tlxVar) {
        this.a = tlxVar;
    }

    @Override // defpackage.tma
    public final void a(tnq tnqVar) {
        if (tnqVar.b == 8) {
            tlx tlxVar = this.a;
            vtw vtwVarM = tms.a.m();
            vtw vtwVarM2 = tnl.a.m();
            int i = (tnqVar.b == 8 ? (tnk) tnqVar.c : tnk.a).b;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            tnl tnlVar = (tnl) vtwVarM2.b;
            tnlVar.b |= 1;
            tnlVar.c = i;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            tms tmsVar = (tms) vtwVarM.b;
            tnl tnlVar2 = (tnl) vtwVarM2.r();
            tnlVar2.getClass();
            tmsVar.c = tnlVar2;
            tmsVar.b = 9;
            tlxVar.a((tms) vtwVarM.r());
        }
    }

    @Override // defpackage.tma
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.tma
    public final /* synthetic */ void c(int i) {
    }
}
