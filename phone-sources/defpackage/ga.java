package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ga implements yjv {
    private final /* synthetic */ int a;

    public /* synthetic */ ga(int i) {
        this.a = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                ((Boolean) obj).booleanValue();
                return ygi.a;
            case 2:
                return ygi.a;
            case 3:
                op opVar = (op) obj;
                yjv yjvVar = pi.a;
                long j = opVar.d;
                opVar.n();
                long j2 = opVar.d;
                if (j != j2) {
                    oh ohVar = opVar.g;
                    if (ohVar != null) {
                        if (ohVar.a > j2) {
                            opVar.l();
                        } else {
                            ohVar.g = j2;
                            ohVar.h = yln.w((1.0d - ohVar.e.a(0)) * j2);
                        }
                    } else if (j2 != 0) {
                        opVar.o();
                    }
                }
                return ygi.a;
            case 4:
                yjv yjvVar2 = pi.a;
                return a.w((yjk) obj);
            case 5:
                return new na(((Float) obj).floatValue());
            case 6:
                return new na(((Integer) obj).intValue());
            case 7:
                return Integer.valueOf((int) ((na) obj).a);
            case 8:
                return new na(((cma) obj).a);
            case 9:
                return new cma(((na) obj).a);
            case 10:
                long j3 = ((cmb) obj).a;
                return new nb(cmb.a(j3), cmb.b(j3));
            case 11:
                nb nbVar = (nb) obj;
                return new cmb((Float.floatToRawIntBits(nbVar.a) << 32) | (4294967295L & Float.floatToRawIntBits(nbVar.b)));
            case 12:
                long j4 = ((bna) obj).a;
                return new nb(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)));
            case 13:
                nb nbVar2 = (nb) obj;
                return new bna((Float.floatToRawIntBits(nbVar2.a) << 32) | (4294967295L & Float.floatToRawIntBits(nbVar2.b)));
            case 14:
                long j5 = ((bmx) obj).a;
                return new nb(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
            case 15:
                nb nbVar3 = (nb) obj;
                return new bmx((Float.floatToRawIntBits(nbVar3.a) << 32) | (4294967295L & Float.floatToRawIntBits(nbVar3.b)));
            case 16:
                long j6 = ((cmf) obj).a;
                return new nb(cmf.a(j6), cmf.b(j6));
            case 17:
                nb nbVar4 = (nb) obj;
                return new cmf((Math.round(nbVar4.a) << 32) | (4294967295L & Math.round(nbVar4.b)));
            case 18:
                long j7 = ((cmh) obj).a;
                return new nb((int) (j7 >> 32), (int) (j7 & 4294967295L));
            case 19:
                nb nbVar5 = (nb) obj;
                int iRound = Math.round(nbVar5.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                return new cmh((Math.round(nbVar5.b) >= 0 ? r9 : 0) | (iRound << 32));
            default:
                bmy bmyVar = (bmy) obj;
                return new nd(bmyVar.b, bmyVar.c, bmyVar.d, bmyVar.e);
        }
    }
}
