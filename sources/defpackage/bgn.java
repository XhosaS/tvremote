package defpackage;

import android.content.Context;
import android.hardware.hdmi.HdmiControlManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bgn extends bgt {
    protected static final bzw a;
    protected final bzt b;

    static {
        bzu bzuVarC = bzw.c(28);
        bzuVarC.c(26, 0);
        bzuVarC.c(27, 1);
        bzuVarC.c(7, 2);
        bzuVarC.c(8, 3);
        bzuVarC.c(3, 4);
        bzuVarC.c(4, 5);
        bzuVarC.c(13, 6);
        bzuVarC.c(12, 7);
        bzuVarC.c(11, 8);
        bzuVarC.c(22, 9);
        bzuVarC.c(18, 10);
        bzuVarC.c(5, 11);
        bzuVarC.c(6, 12);
        bzuVarC.c(14, 13);
        bzuVarC.c(19, 14);
        bzuVarC.c(20, 15);
        bzuVarC.c(23, 16);
        bzuVarC.c(15, 17);
        bzuVarC.c(16, 18);
        bzuVarC.c(17, 19);
        bzuVarC.c(25, 20);
        bzuVarC.c(9, 21);
        bzuVarC.c(10, 22);
        bzuVarC.c(29, 23);
        bzuVarC.c(21, 24);
        bzuVarC.c(1, 25);
        bzuVarC.c(2, 26);
        bzuVarC.c(24, 27);
        a = bzuVarC.b();
    }

    public bgn(Context context) {
        super(context);
        this.b = new bzt(context);
    }

    static bgm c(bgl bglVar) {
        switch (bglVar.b) {
            case 0:
            case 25:
                return bgm.NONE;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            case 27:
                return bgm.VARIABLE;
            case 9:
            case 10:
                return bgm.INCREMENTAL;
            default:
                return null;
        }
    }

    private final bgm k() {
        Object obj = this.b.b;
        return ((obj != null && ((HdmiControlManager) obj).getTvClient() != null) || obj == null || ((HdmiControlManager) obj).getPlaybackClient() == null) ? bgm.VARIABLE : bgm.INCREMENTAL;
    }

    @Override // defpackage.bgt
    public bgl a() {
        List<bgl> listE = this.f.e();
        if (listE.isEmpty()) {
            return null;
        }
        bgl bglVar = (bgl) listE.get(0);
        int iIntValue = Integer.MAX_VALUE;
        for (bgl bglVar2 : listE) {
            Integer num = (Integer) a.get(Integer.valueOf(bglVar2.b));
            if (num != null && num.intValue() < iIntValue) {
                iIntValue = num.intValue();
                bglVar = bglVar2;
            }
        }
        return bglVar;
    }

    @Override // defpackage.bgt
    public bgm b(bgl bglVar) {
        if (this.f.f()) {
            return bgm.NONE;
        }
        if (bglVar == null) {
            return k();
        }
        bgm bgmVarC = c(bglVar);
        return bgmVarC != null ? bgmVarC : k();
    }
}
