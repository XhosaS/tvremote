package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pcg extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uwf uwfVar = (uwf) obj;
        vtw vtwVarM = vko.a.m();
        if ((uwfVar.b & 1) != 0) {
            String str = uwfVar.c;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vko vkoVar = (vko) vtwVarM.b;
            str.getClass();
            vkoVar.b |= 1;
            vkoVar.c = str;
        }
        if ((uwfVar.b & 2) != 0) {
            long j = uwfVar.d;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vko vkoVar2 = (vko) vtwVarM.b;
            vkoVar2.b |= 2;
            vkoVar2.d = j;
        }
        if ((uwfVar.b & 4) != 0) {
            long j2 = uwfVar.e;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vko vkoVar3 = (vko) vtwVarM.b;
            vkoVar3.b |= 4;
            vkoVar3.e = j2;
        }
        if ((uwfVar.b & 8) != 0) {
            vsz vszVar = uwfVar.f;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vko vkoVar4 = (vko) vtwVarM.b;
            vszVar.getClass();
            vkoVar4.b |= 8;
            vkoVar4.f = vszVar;
        }
        return (vko) vtwVarM.r();
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vko vkoVar = (vko) obj;
        vtw vtwVarM = uwf.a.m();
        if ((vkoVar.b & 1) != 0) {
            String str = vkoVar.c;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uwf uwfVar = (uwf) vtwVarM.b;
            str.getClass();
            uwfVar.b |= 1;
            uwfVar.c = str;
        }
        if ((vkoVar.b & 2) != 0) {
            long j = vkoVar.d;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uwf uwfVar2 = (uwf) vtwVarM.b;
            uwfVar2.b |= 2;
            uwfVar2.d = j;
        }
        if ((vkoVar.b & 4) != 0) {
            long j2 = vkoVar.e;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uwf uwfVar3 = (uwf) vtwVarM.b;
            uwfVar3.b |= 4;
            uwfVar3.e = j2;
        }
        if ((vkoVar.b & 8) != 0) {
            vsz vszVar = vkoVar.f;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uwf uwfVar4 = (uwf) vtwVarM.b;
            vszVar.getClass();
            uwfVar4.b |= 8;
            uwfVar4.f = vszVar;
        }
        return (uwf) vtwVarM.r();
    }
}
