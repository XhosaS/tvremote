package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pde extends pby {
    static final tsg a = new pch();
    static final tsl b = new pdc();

    @Override // defpackage.pby
    public final void a(voe voeVar, vtw vtwVar) {
        if (voeVar.b == 3) {
            vtw vtwVarM = uyf.a.m();
            String str = (voeVar.b == 3 ? (voi) voeVar.c : voi.a).b;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            uyf uyfVar = (uyf) vucVar;
            str.getClass();
            uyfVar.b |= 1;
            uyfVar.c = str;
            boolean z = (voeVar.b == 3 ? (voi) voeVar.c : voi.a).c;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            uyf uyfVar2 = (uyf) vtwVarM.b;
            uyfVar2.b |= 2;
            uyfVar2.d = z;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uxs uxsVar = (uxs) vtwVar.b;
            uyf uyfVar3 = (uyf) vtwVarM.r();
            uxs uxsVar2 = uxs.a;
            uyfVar3.getClass();
            uxsVar.c = uyfVar3;
            uxsVar.b = 3;
        }
    }
}
