package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ara {
    public static final ara a = new ara();

    private ara() {
    }

    public final void a(bkp bkpVar, float f, float f2, bol bolVar, final long j, bao baoVar, final int i) {
        bao baoVar2;
        final bkp bkpVar2;
        final float f3;
        final float f4;
        final bol bolVar2;
        bkp bkpVar3;
        float f5;
        bol bolVar3;
        int i2 = i & 3072;
        int i3 = i | 438;
        bao baoVarD = baoVar.d(-1364277227);
        if (i2 == 0) {
            i3 = i | 1462;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.E(j) ? 8192 : 16384;
        }
        if (baoVarD.L((i3 & 9363) != 9362, i3 & 1)) {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bkpVar3 = bkp.g;
                f4 = 4.0f;
                f5 = 32.0f;
                bolVar3 = wv.M(baoVarD).e;
            } else {
                baoVarD.t();
                bkpVar3 = bkpVar;
                f5 = f;
                f4 = f2;
                bolVar3 = bolVar;
            }
            baoVarD.m();
            String strW = zy.w(R.string.m3c_bottom_sheet_drag_handle_description, baoVarD);
            my myVar = aut.a;
            bkp bkpVarU = wv.u(bkpVar3, 0.0f, 22.0f, 1);
            boolean zF = baoVarD.F(strW);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zF || objT == ban.a) {
                objT = new akh(strW, 19);
                basVar.ae(objT);
            }
            baoVar2 = baoVarD;
            awq.c(cfd.b(bkpVarU, false, (yjv) objT), bolVar3, j, 0L, 0.0f, 0.0f, bga.k(-1039573072, new aqz(f5, f4), baoVarD), baoVar2, android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor);
            bkpVar2 = bkpVar3;
            f3 = f5;
            bolVar2 = bolVar3;
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
            bkpVar2 = bkpVar;
            f3 = f;
            f4 = f2;
            bolVar2 = bolVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: aqy
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ara araVar = this.a;
                    bkp bkpVar4 = bkpVar2;
                    float f6 = f3;
                    float f7 = f4;
                    bol bolVar4 = bolVar2;
                    araVar.a(bkpVar4, f6, f7, bolVar4, j, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }
}
