package defpackage;

import android.content.Context;
import android.support.v7.appcompat.R;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agy {
    private static final cob a = new cob();

    public static final void a(ago agoVar, agk agkVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1904307118);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(agoVar) : baoVarD.H(agoVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(agkVar) ? 16 : 32;
        }
        if (baoVarD.L((i2 & 19) != 18, i2 & 1)) {
            boolean zH = baoVarD.H(agkVar);
            int i4 = 8;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !baoVarD.H(agoVar))) {
                z = false;
            }
            boolean z2 = zH | z;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (z2 || objT == ban.a) {
                objT = new afk(agkVar, agoVar, i4);
                basVar.ae(objT);
            }
            sy.b(null, null, (yjv) objT, baoVarD, 0);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(agoVar, agkVar, i, 7, null);
        }
    }

    public static final void b(final int i, long j, bao baoVar, final int i2) {
        int i3;
        int i4;
        bnl bnlVar;
        final long j2 = j;
        int i5 = i2 & 6;
        bao baoVarD = baoVar.d(-1240244237);
        if (i5 == 0) {
            i3 = i;
            i4 = i2 | (true != baoVarD.D(i3) ? 2 : 4);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.E(j2) ? 16 : 32;
        }
        if (baoVarD.L((i4 & 19) != 18, i4 & 1)) {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            boolean zF = baoVarD.F(context) | ((i4 & 14) == 4);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zF || objT == ban.a) {
                objT = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                basVar.ae(objT);
            }
            int iIntValue = ((Number) objT).intValue();
            if (iIntValue == -1) {
                bcr bcrVarM = baoVarD.M();
                if (bcrVarM != null) {
                    final int i6 = 1;
                    final int i7 = i3;
                    bcrVarM.d = new yjz() { // from class: agw
                        @Override // defpackage.yjz
                        public final Object a(Object obj, Object obj2) {
                            if (i6 != 0) {
                                ((Integer) obj2).intValue();
                                long j3 = j2;
                                agy.b(i7, j3, (bao) obj, bdi.n(i2 | 1));
                                return ygi.a;
                            }
                            ((Integer) obj2).intValue();
                            long j4 = j2;
                            agy.b(i7, j4, (bao) obj, bdi.n(i2 | 1));
                            return ygi.a;
                        }
                    };
                    return;
                }
                return;
            }
            bqh bqhVarY = ccf.y(iIntValue, baoVarD, 0);
            int i8 = i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            Object objT2 = basVar.T();
            if (i8 == 32 || objT2 == ban.a) {
                if (j2 == 16) {
                    bnlVar = null;
                    j2 = 16;
                } else {
                    bnlVar = new bnl(j2, 5);
                }
                objT2 = bnlVar;
                basVar.ae(objT2);
            }
            bnr bnrVar = (bnr) objT2;
            bkm bkmVar = bkp.g;
            long j3 = su.a;
            xo.b(bga.r(zi.d(bkmVar, 24.0f), bqhVarY, null, bun.b, 0.0f, bnrVar, 22), baoVarD, 0);
        } else {
            baoVarD.t();
        }
        final long j4 = j2;
        bcr bcrVarM2 = baoVarD.M();
        if (bcrVarM2 != null) {
            final int i9 = 0;
            bcrVarM2.d = new yjz() { // from class: agw
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    if (i9 != 0) {
                        ((Integer) obj2).intValue();
                        long j32 = j4;
                        agy.b(i, j32, (bao) obj, bdi.n(i2 | 1));
                        return ygi.a;
                    }
                    ((Integer) obj2).intValue();
                    long j42 = j4;
                    agy.b(i, j42, (bao) obj, bdi.n(i2 | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final void c(ago agoVar, ahn ahnVar, yjk yjkVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-2040393164);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(agoVar) : baoVarD.H(agoVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? baoVarD.F(ahnVar) : baoVarD.H(ahnVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 128 : 256;
        }
        if (baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            boolean z2 = (i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32 || ((i2 & 64) != 0 && baoVarD.F(ahnVar));
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (z2 || objT == ban.a) {
                objT = new aha(new st(new qm(ahnVar, yjkVar, 11)));
                basVar.ae(objT);
            }
            aha ahaVar = (aha) objT;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !baoVarD.H(agoVar))) {
                z = false;
            }
            Object objT2 = basVar.T();
            if (z || objT2 == ban.a) {
                objT2 = new afi(agoVar, 7);
                basVar.ae(objT2);
            }
            cnk.b(ahaVar, (yjk) objT2, a, bga.k(1315155414, new acv(ahnVar, agoVar, 3), baoVarD), baoVarD, 3456, 0);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(agoVar, ahnVar, yjkVar, i, 4);
        }
    }

    public static final void d(bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        yjz yjzVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1392105195);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if (baoVarD.L((i2 & 19) != 18, i2 & 1)) {
            bkpVar2 = bkpVar;
            yjzVar2 = yjzVar;
            ht.s(bkpVar2, ahp.a, agv.a, yjzVar2, baoVarD, (i2 & 14) | 432 | ((i2 << 6) & 7168));
        } else {
            bkpVar2 = bkpVar;
            yjzVar2 = yjzVar;
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(bkpVar2, yjzVar2, i, 8);
        }
    }
}
