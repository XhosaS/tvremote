package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pox {
    public static final long a = a.j(4.0f, 44.0f);
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        a.j(44.0f, 4.0f);
        b = 6.0f;
        c = 2.0f;
        d = 4.0f;
    }

    public static final void a(float f, yjv yjvVar, bkp bkpVar, boolean z, auy auyVar, kw kwVar, yka ykaVar, yka ykaVar2, ylz ylzVar, bao baoVar, int i, int i2) {
        int i3;
        yjv yjvVar2;
        bkp bkpVar2;
        kw kwVar2;
        ylz ylzVar2;
        yka ykaVar3;
        boolean z2;
        bao baoVar2;
        ylz ylzVar3;
        yka ykaVar4;
        yjvVar.getClass();
        bao baoVarD = baoVar.d(1432189287);
        boolean z3 = true;
        if ((i & 6) == 0) {
            i3 = (true != baoVarD.C(f) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            yjvVar2 = yjvVar;
            i3 |= true != baoVarD.H(yjvVar2) ? 16 : 32;
        } else {
            yjvVar2 = yjvVar;
        }
        if ((i & 384) == 0) {
            bkpVar2 = bkpVar;
            i3 |= true != baoVarD.F(bkpVar2) ? 128 : 256;
        } else {
            bkpVar2 = bkpVar;
        }
        int i4 = i3 | 224256;
        if ((1572864 & i) == 0) {
            i4 |= true != baoVarD.F(auyVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            kwVar2 = kwVar;
            i4 |= true != baoVarD.F(kwVar2) ? 4194304 : 8388608;
        } else {
            kwVar2 = kwVar;
        }
        if ((100663296 & i) == 0) {
            i4 |= true != baoVarD.H(ykaVar) ? 33554432 : 67108864;
        }
        int i5 = (i2 & 6) == 0 ? i2 | 2 : i2;
        int i6 = i4 | 805306368;
        if ((306783379 & i6) == 306783378 && (i5 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
            z2 = z;
            ykaVar4 = ykaVar2;
            baoVar2 = baoVarD;
            ylzVar3 = ylzVar;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bhq bhqVarK = bga.k(1723292034, new khb(auyVar, 14), baoVarD);
                ylzVar2 = new ylz(0.0f, 1.0f);
                ykaVar3 = bhqVarK;
            } else {
                baoVarD.t();
                z3 = z;
                ykaVar3 = ykaVar2;
                ylzVar2 = ylzVar;
            }
            baoVarD.m();
            int i7 = i6 >> 3;
            int i8 = 1879048192 & i6;
            int i9 = (i6 & 8190) | (57344 & i7) | (458752 & i7) | (i7 & 3670016) | (29360128 & (i6 << 9)) | (234881024 & i6) | i8;
            yjv yjvVar3 = yjvVar2;
            boolean z4 = z3;
            avm.d(f, yjvVar3, bkpVar2, z4, auyVar, kwVar2, ykaVar, ykaVar3, ylzVar2, baoVarD, i9, 0);
            z2 = z4;
            baoVar2 = baoVarD;
            ylzVar3 = ylzVar2;
            ykaVar4 = ykaVar3;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new pow(f, yjvVar, bkpVar, z2, auyVar, kwVar, ykaVar, ykaVar4, ylzVar3, i, i2, 0);
        }
    }
}
