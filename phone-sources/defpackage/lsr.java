package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class lsr implements tsl {
    @Override // defpackage.tsl
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lbe apply(wam wamVar) {
        vtw vtwVarM = lbe.a.m();
        f(vtwVarM);
        String str = wamVar.e;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        str.getClass();
        ((lbe) vucVar).d = str;
        String str2 = wamVar.f;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        lbe lbeVar = (lbe) vtwVarM.b;
        str2.getClass();
        lbeVar.e = str2;
        if ((wamVar.b & 1) != 0) {
            tsl tslVar = lta.a;
            vai vaiVar = wamVar.g;
            if (vaiVar == null) {
                vaiVar = vai.a;
            }
            Object objApply = tslVar.apply(vaiVar);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            lbe lbeVar2 = (lbe) vtwVarM.b;
            objApply.getClass();
            lbeVar2.f = (kzh) objApply;
            lbeVar2.b |= 2;
        }
        b(wamVar, vtwVarM);
        if ((wamVar.b & 2) != 0) {
            tsl tslVar2 = lta.b;
            vdb vdbVar = wamVar.i;
            if (vdbVar == null) {
                vdbVar = vdb.a;
            }
            Object objApply2 = tslVar2.apply(vdbVar);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            lbe lbeVar3 = (lbe) vtwVarM.b;
            objApply2.getClass();
            lbeVar3.h = (lcc) objApply2;
            lbeVar3.b |= 8;
        }
        if (wamVar.c == 5 && wbb.j(5) == 6) {
            c(wamVar, vtwVarM);
        }
        e(wamVar, vtwVarM);
        if (wamVar.c == 8 && wbb.j(8) == 9) {
            d(wamVar, vtwVarM);
        }
        return (lbe) vtwVarM.r();
    }

    public abstract void b(wam wamVar, vtw vtwVar);

    public abstract void c(wam wamVar, vtw vtwVar);

    public abstract void d(wam wamVar, vtw vtwVar);

    public abstract void e(wam wamVar, vtw vtwVar);

    public abstract void f(vtw vtwVar);
}
