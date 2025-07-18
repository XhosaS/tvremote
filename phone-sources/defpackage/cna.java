package defpackage;

import android.content.Context;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.FocusGroupPropertiesElement;
import androidx.compose.ui.viewinterop.FocusTargetPropertiesElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cna {
    public static final yjv a = ccu.j;

    public static final void a(yjv yjvVar, bkp bkpVar, yjv yjvVar2, bao baoVar, int i) {
        int i2;
        yjv yjvVar3;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1783766393);
        if (i3 == 0) {
            i2 = i | (true != baoVarD.H(yjvVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (baoVarD.L((i4 & 147) != 146, i4 & 1)) {
            int i5 = (i4 & 14) | 3072 | (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4 << 6) & 57344);
            yjv yjvVar4 = a;
            b(yjvVar, bkpVar, yjvVar4, yjvVar4, baoVarD, i5);
            yjvVar3 = yjvVar4;
        } else {
            baoVarD.t();
            yjvVar3 = yjvVar2;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ccp(yjvVar, bkpVar, yjvVar3, i, 2);
        }
    }

    public static final void b(yjv yjvVar, bkp bkpVar, yjv yjvVar2, yjv yjvVar3, bao baoVar, int i) {
        int i2;
        yjv yjvVar4;
        int i3;
        dvk dvkVar;
        bas basVar;
        bhu bhuVar;
        ghe gheVar;
        int i4 = i & 6;
        bao baoVarD = baoVar.d(-180024211);
        if (i4 == 0) {
            i2 = (true != baoVarD.H(yjvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        int i5 = i2 | 384;
        if ((i & 3072) == 0) {
            i5 |= true != baoVarD.H(yjvVar2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i5 |= true != baoVarD.H(yjvVar3) ? 8192 : 16384;
        }
        if (baoVarD.L((i5 & 9363) != 9362, i5 & 1)) {
            int iK = a.k(zy.p(baoVarD));
            bkp bkpVarC = bdi.C(baoVarD, d.S(d.S(bkpVar.a(FocusGroupPropertiesElement.a)).a(FocusTargetPropertiesElement.a)));
            clx clxVar = (clx) baoVarD.f(ccq.d);
            cmi cmiVar = (cmi) baoVarD.f(ccq.i);
            bas basVar2 = (bas) baoVarD;
            bhu bhuVarAi = basVar2.ai();
            dvk dvkVar2 = (dvk) baoVarD.f(dxf.a);
            ghe gheVar2 = (ghe) baoVarD.f(ghg.a);
            baoVarD.x(1314800527);
            int iK2 = a.k(zy.p(baoVarD));
            int i6 = i5;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baw bawVarR = zy.r(baoVarD);
            bie bieVar = (bie) baoVarD.f(big.a);
            View view = (View) baoVarD.f(AndroidCompositionLocals_androidKt.f);
            boolean zH = baoVarD.H(context) | ((((i6 & 14) ^ 6) > 4 && baoVarD.F(yjvVar)) || (i6 & 6) == 4) | baoVarD.H(bawVarR) | baoVarD.H(bieVar) | baoVarD.D(iK2) | baoVarD.H(view);
            Object objT = basVar2.T();
            if (zH || objT == ban.a) {
                i3 = iK;
                dvkVar = dvkVar2;
                basVar = basVar2;
                bhuVar = bhuVarAi;
                gheVar = gheVar2;
                cmz cmzVar = new cmz(context, yjvVar, bawVarR, bieVar, iK2, view);
                basVar.ae(cmzVar);
                objT = cmzVar;
            } else {
                i3 = iK;
                dvkVar = dvkVar2;
                basVar = basVar2;
                bhuVar = bhuVarAi;
                gheVar = gheVar2;
            }
            yjk yjkVar = (yjk) objT;
            if (!(basVar.a instanceof cal)) {
                zy.n();
            }
            baoVarD.w();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bhuVar, bxt.c);
            beb.a(baoVarD, bkpVarC, cfh.m);
            beb.a(baoVarD, clxVar, cfh.n);
            beb.a(baoVarD, dvkVar, cfh.o);
            beb.a(baoVarD, gheVar, cfh.p);
            beb.a(baoVarD, cmiVar, cfh.q);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(i3))) {
                Integer numValueOf = Integer.valueOf(i3);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, yjvVar3, cfh.k);
            yjvVar4 = yjvVar2;
            beb.a(baoVarD, yjvVar4, cfh.l);
            baoVarD.o();
            basVar.aa();
        } else {
            yjvVar4 = yjvVar2;
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new cmy(yjvVar, bkpVar, yjvVar4, yjvVar3, i);
        }
    }

    public static final cmv c(bys bysVar) {
        cmv cmvVar = bysVar.j;
        if (cmvVar != null) {
            return cmvVar;
        }
        bty.a("Required value was null.");
        throw new yfs();
    }
}
