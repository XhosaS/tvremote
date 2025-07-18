package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atm extends atp {
    public static final atm a = new atm();

    private atm() {
    }

    @Override // defpackage.atp
    public final /* bridge */ /* synthetic */ cmz a(String str, Object obj) {
        int iIntValue = ((Long) obj).intValue();
        if (iIntValue == 0) {
            return null;
        }
        clo cloVarO = cwm.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        cwm cwmVar = (cwm) cloVarO.b;
        cwmVar.b |= 1;
        cwmVar.c = iIntValue;
        if (str != null) {
            cwn cwnVarM = se.m(str);
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwm cwmVar2 = (cwm) cloVarO.b;
            cwnVarM.getClass();
            cwmVar2.d = cwnVarM;
            cwmVar2.b |= 2;
        }
        return (cwm) cloVarO.i();
    }

    @Override // defpackage.atp
    public final /* synthetic */ cmz b(cmz cmzVar, cmz cmzVar2) {
        int i;
        cwm cwmVar = (cwm) cmzVar;
        cwm cwmVar2 = (cwm) cmzVar2;
        if (cwmVar == null || cwmVar2 == null) {
            return cwmVar;
        }
        if ((cwmVar.b & 1) == 0 || (i = cwmVar.c - cwmVar2.c) == 0) {
            return null;
        }
        clo cloVarO = cwm.a.o();
        if ((cwmVar.b & 2) != 0) {
            cwn cwnVar = cwmVar.d;
            if (cwnVar == null) {
                cwnVar = cwn.a;
            }
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cwm cwmVar3 = (cwm) cloVarO.b;
            cwnVar.getClass();
            cwmVar3.d = cwnVar;
            cwmVar3.b |= 2;
        }
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        cwm cwmVar4 = (cwm) cloVarO.b;
        cwmVar4.b |= 1;
        cwmVar4.c = i;
        return (cwm) cloVarO.i();
    }

    @Override // defpackage.atp
    public final /* bridge */ /* synthetic */ String c(cmz cmzVar) {
        cwn cwnVar = ((cwm) cmzVar).d;
        if (cwnVar == null) {
            cwnVar = cwn.a;
        }
        return cwnVar.d;
    }
}
