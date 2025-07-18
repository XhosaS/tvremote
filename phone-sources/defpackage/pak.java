package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pak implements xcm {
    private final /* synthetic */ int a;

    public pak(int i) {
        this.a = i;
    }

    public static final Long a() {
        return Long.valueOf(xgp.a.get().d());
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                return new pai(0);
            case 1:
                return new pai(1);
            case 2:
                return a();
            case 3:
                uyq uyqVar = uyq.UITYPE_GNP_CUSTOM_UI;
                uyqVar.getClass();
                return uyqVar;
            case 4:
                uyq uyqVar2 = uyq.UITYPE_GM_DIALOG;
                uyqVar2.getClass();
                return uyqVar2;
            case 5:
                vtw vtwVarM = vmg.a.m();
                vtwVarM.getClass();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vmg vmgVar = (vmg) vtwVarM.b;
                vmgVar.b |= 8192;
                vmgVar.j = true;
                return ves.q(vtwVarM);
            case 6:
                uyq uyqVar3 = uyq.UITYPE_GM_TAP_TARGET;
                uyqVar3.getClass();
                return uyqVar3;
            case 7:
                uyq uyqVar4 = uyq.UITYPE_GM_TOOLTIP;
                uyqVar4.getClass();
                return uyqVar4;
            case 8:
                uyq uyqVar5 = uyq.UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG;
                uyqVar5.getClass();
                return uyqVar5;
            case 9:
                uyq uyqVar6 = uyq.UITYPE_PERMISSION;
                uyqVar6.getClass();
                return uyqVar6;
            case 10:
                return new kww();
            case 11:
                return new ntp((byte[]) null, (byte[]) null);
            case 12:
                vtw vtwVarM2 = vmg.a.m();
                vtwVarM2.getClass();
                if (xfi.a.get().c()) {
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    vmg vmgVar2 = (vmg) vtwVarM2.b;
                    vmgVar2.b |= 32;
                    vmgVar2.d = true;
                }
                return ves.q(vtwVarM2);
            case 13:
                return new pmi(2);
            case 14:
                return new pmi(4);
            case 15:
                return new pmi(3);
            case 16:
                return new pmi(i2);
            case 17:
                return new pmi(i);
            case 18:
                return new pmi(6);
            case 19:
                return new pmi(5);
            default:
                tvn tvnVar = pne.a;
                return new qtl();
        }
    }
}
