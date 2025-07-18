package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class pcb implements tsl {
    public abstract void a(vno vnoVar, vtw vtwVar);

    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vno vnoVar = (vno) obj;
        vtw vtwVarM = uzb.a.m();
        if (vnoVar.c == 6 && vfi.H(6) == 7) {
            String str = (String) vnoVar.d;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uzb uzbVar = (uzb) vtwVarM.b;
            str.getClass();
            uzbVar.c = 1;
            uzbVar.d = str;
        }
        if (vnoVar.c == 7 && vfi.H(7) == 8) {
            String str2 = (String) vnoVar.d;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uzb uzbVar2 = (uzb) vtwVarM.b;
            str2.getClass();
            uzbVar2.c = 8;
            uzbVar2.d = str2;
        }
        if (vnoVar.c == 8 && vfi.H(8) == 9) {
            Integer num = (Integer) vnoVar.d;
            num.intValue();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uzb uzbVar3 = (uzb) vtwVarM.b;
            uzbVar3.c = 9;
            uzbVar3.d = num;
        }
        b(vnoVar, vtwVarM);
        g(vnoVar, vtwVarM);
        if ((vnoVar.b & 1) != 0) {
            d(vnoVar, vtwVarM);
        }
        if ((vnoVar.b & 2) != 0) {
            c(vnoVar, vtwVarM);
        }
        e(vnoVar, vtwVarM);
        a(vnoVar, vtwVarM);
        f(vnoVar, vtwVarM);
        return (uzb) vtwVarM.r();
    }

    public abstract void b(vno vnoVar, vtw vtwVar);

    public abstract void c(vno vnoVar, vtw vtwVar);

    public abstract void d(vno vnoVar, vtw vtwVar);

    public abstract void e(vno vnoVar, vtw vtwVar);

    public abstract void f(vno vnoVar, vtw vtwVar);

    public abstract void g(vno vnoVar, vtw vtwVar);
}
