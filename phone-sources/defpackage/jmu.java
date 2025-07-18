package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmu implements ixn {
    public final iea a;
    public final isw b;
    private final ykc c;

    public jmu(isw iswVar, iea ieaVar) {
        iswVar.getClass();
        this.b = iswVar;
        this.a = ieaVar;
        this.c = new bhq(-863791107, true, new jmt(this, 0));
    }

    @Override // defpackage.ixn
    public final ykc a() {
        return this.c;
    }

    @Override // defpackage.ixn
    public final /* synthetic */ void b(wkx wkxVar, bkp bkpVar, ixo ixoVar, bao baoVar, int i) {
        jbr.af(this, wkxVar, bkpVar, ixoVar, baoVar, i);
    }

    @Override // defpackage.ixn
    public final /* synthetic */ void c(wkx wkxVar, bkp bkpVar, ixo ixoVar, bao baoVar, int i) {
        jbr.ag(this, wkxVar, bkpVar, ixoVar, baoVar, i, 0);
    }

    public final void d(jmq jmqVar, ixo ixoVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        jmqVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1581931193);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(jmqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 131) == 130 && baoVarD.K()) {
            baoVarD.t();
        } else {
            LayoutInflater.Factory factoryF = hju.F((Context) baoVarD.f(AndroidCompositionLocals_androidKt.b));
            kiw kiwVar = factoryF instanceof kiw ? (kiw) factoryF : null;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = bbn.a(yim.a, baoVarD);
                basVar.ae(objT);
            }
            ((kdj) baoVarD.f(jab.a)).d(jmqVar.b, bga.k(1353118122, new ada(jmqVar, bkpVar, kiwVar, (yow) objT, 3), baoVarD), baoVarD, 48);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(this, jmqVar, ixoVar, bkpVar, i, 4, (byte[]) null);
        }
    }
}
