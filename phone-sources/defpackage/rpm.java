package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rpm extends rpp {
    public static final rpm a = new rpm();

    private rpm() {
    }

    @Override // defpackage.rpp
    public final /* bridge */ /* synthetic */ vvj a(String str, Object obj) {
        int iIntValue = ((Long) obj).intValue();
        if (iIntValue == 0) {
            return null;
        }
        vtw vtwVarM = yyy.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        yyy yyyVar = (yyy) vtwVarM.b;
        yyyVar.b |= 1;
        yyyVar.c = iIntValue;
        if (str != null) {
            yyz yyzVarQ = rrx.q(str);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yyy yyyVar2 = (yyy) vtwVarM.b;
            yyzVarQ.getClass();
            yyyVar2.d = yyzVarQ;
            yyyVar2.b |= 2;
        }
        return (yyy) vtwVarM.r();
    }

    @Override // defpackage.rpp
    public final /* synthetic */ vvj b(vvj vvjVar, vvj vvjVar2) {
        int i;
        yyy yyyVar = (yyy) vvjVar;
        yyy yyyVar2 = (yyy) vvjVar2;
        if (yyyVar == null || yyyVar2 == null) {
            return yyyVar;
        }
        if ((yyyVar.b & 1) == 0 || (i = yyyVar.c - yyyVar2.c) == 0) {
            return null;
        }
        vtw vtwVarM = yyy.a.m();
        if ((yyyVar.b & 2) != 0) {
            yyz yyzVar = yyyVar.d;
            if (yyzVar == null) {
                yyzVar = yyz.a;
            }
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yyy yyyVar3 = (yyy) vtwVarM.b;
            yyzVar.getClass();
            yyyVar3.d = yyzVar;
            yyyVar3.b |= 2;
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        yyy yyyVar4 = (yyy) vtwVarM.b;
        yyyVar4.b |= 1;
        yyyVar4.c = i;
        return (yyy) vtwVarM.r();
    }

    @Override // defpackage.rpp
    public final /* bridge */ /* synthetic */ String c(vvj vvjVar) {
        yyz yyzVar = ((yyy) vvjVar).d;
        if (yyzVar == null) {
            yyzVar = yyz.a;
        }
        return yyzVar.d;
    }
}
