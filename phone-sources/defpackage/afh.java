package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afh implements yjv {
    private final /* synthetic */ int a;

    public /* synthetic */ afh(int i) {
        this.a = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        cgs cgsVar;
        int i = this.a;
        Float fValueOf = Float.valueOf(290.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        switch (i) {
            case 0:
                Long l = (Long) obj;
                l.longValue();
                break;
            case 1:
                ((Integer) obj).intValue();
                abj abjVar = aby.a;
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                cfx cfxVar = (cfx) obj;
                Object obj2 = cfxVar.a;
                if (obj2 instanceof cgf) {
                    obj2.getClass();
                    cgf cgfVar = (cgf) obj2;
                    if (!hq.n(cgfVar.a())) {
                        cfx[] cfxVarArr = new cfx[2];
                        cfxVarArr[0] = cfxVar;
                        obj2.getClass();
                        cha chaVarA = cgfVar.a();
                        if (chaVarA == null || (cgsVar = chaVarA.a) == null) {
                            cgsVar = new cgs(0L, (cji) null, (cje) null, (cjf) null, (ciy) null, 0L, (cld) null, 0L, (cll) null, 65535);
                        }
                        cfxVarArr[1] = new cfx(cgsVar, cfxVar.b, cfxVar.c);
                        break;
                    }
                }
                break;
            case 5:
                cfm cfmVar = cfi.z;
                ygi ygiVar = ygi.a;
                ((cfc) obj).e(cfmVar, ygiVar);
                break;
            case 6:
                ((Long) obj).longValue();
                break;
            case 7:
                View view = (View) obj;
                if (Build.VERSION.SDK_INT < 34) {
                    break;
                } else {
                    break;
                }
            case 8:
                ((ahw) obj).d();
                break;
            case 9:
                ((akk) obj).r();
                break;
            case 10:
                ((akk) obj).t();
                break;
            case 11:
                break;
            case 12:
                long j = ((bmx) obj).a;
                long j2 = 9223372034707292159L & j;
                nb nbVar = ang.a;
                if (j2 == 9205357640488583168L) {
                    break;
                } else {
                    break;
                }
            case 13:
                nb nbVar2 = (nb) obj;
                nb nbVar3 = ang.a;
                break;
            case 14:
                break;
            case 15:
                int i2 = aoh.a;
                break;
            case 16:
                break;
            case 17:
                nue nueVar = (nue) obj;
                ni niVar = aoy.a;
                nueVar.m();
                nueVar.n(fValueOf2, 0).b = aoy.a;
                nueVar.n(fValueOf, 666);
                break;
            case 18:
                nue nueVar2 = (nue) obj;
                ni niVar2 = aoy.a;
                nueVar2.m();
                nueVar2.n(fValueOf2, 666).b = aoy.a;
                nueVar2.n(fValueOf, nueVar2.a);
                break;
            case 19:
                cfk.w((cfc) obj);
                break;
            default:
                break;
        }
        return ygi.a;
    }
}
