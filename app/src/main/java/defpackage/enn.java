package defpackage;

import android.content.res.TypedArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public class enn {
    final enp a = new enp();

    private static float c(float f) {
        return Math.min(1.0f, Math.max(0.0f, f));
    }

    public final enp a() {
        enp enpVar = this.a;
        int i = enpVar.f;
        if (i != 1) {
            int[] iArr = enpVar.b;
            int i2 = enpVar.e;
            iArr[0] = i2;
            int i3 = enpVar.d;
            iArr[1] = i3;
            iArr[2] = i3;
            iArr[3] = i2;
        } else {
            int[] iArr2 = enpVar.b;
            int i4 = enpVar.d;
            iArr2[0] = i4;
            iArr2[1] = i4;
            int i5 = enpVar.e;
            iArr2[2] = i5;
            iArr2[3] = i5;
        }
        if (i != 1) {
            float[] fArr = enpVar.a;
            fArr[0] = Math.max(((1.0f - enpVar.k) - enpVar.l) / 2.0f, 0.0f);
            fArr[1] = Math.max(((1.0f - enpVar.k) - 0.001f) / 2.0f, 0.0f);
            fArr[2] = Math.min(((enpVar.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((enpVar.k + 1.0f) + enpVar.l) / 2.0f, 1.0f);
            return enpVar;
        }
        float[] fArr2 = enpVar.a;
        fArr2[0] = 0.0f;
        fArr2[1] = Math.min(enpVar.k, 1.0f);
        fArr2[2] = Math.min(enpVar.k + enpVar.l, 1.0f);
        fArr2[3] = 1.0f;
        return enpVar;
    }

    public void b(TypedArray typedArray) {
        int[] iArr = enl.a;
        if (typedArray.hasValue(3)) {
            enp enpVar = this.a;
            enpVar.n = typedArray.getBoolean(3, enpVar.n);
        }
        if (typedArray.hasValue(0)) {
            enp enpVar2 = this.a;
            enpVar2.o = typedArray.getBoolean(0, enpVar2.o);
        }
        if (typedArray.hasValue(1)) {
            float fC = c(typedArray.getFloat(1, 0.3f)) * 255.0f;
            enp enpVar3 = this.a;
            enpVar3.e = (((int) fC) << 24) | (enpVar3.e & 16777215);
        }
        if (typedArray.hasValue(11)) {
            float fC2 = c(typedArray.getFloat(11, 1.0f)) * 255.0f;
            enp enpVar4 = this.a;
            enpVar4.d = (((int) fC2) << 24) | (16777215 & enpVar4.d);
        }
        if (typedArray.hasValue(7)) {
            enp enpVar5 = this.a;
            long j = typedArray.getInt(7, (int) enpVar5.s);
            if (j < 0) {
                throw new IllegalArgumentException(a.l(j, "Given a negative duration: "));
            }
            enpVar5.s = j;
        }
        if (typedArray.hasValue(14)) {
            enp enpVar6 = this.a;
            enpVar6.q = typedArray.getInt(14, enpVar6.q);
        }
        if (typedArray.hasValue(15)) {
            enp enpVar7 = this.a;
            long j2 = typedArray.getInt(15, (int) enpVar7.t);
            if (j2 < 0) {
                throw new IllegalArgumentException(a.l(j2, "Given a negative repeat delay: "));
            }
            enpVar7.t = j2;
        }
        if (typedArray.hasValue(18)) {
            enp enpVar8 = this.a;
            long j3 = typedArray.getInt(18, (int) enpVar8.u);
            if (j3 < 0) {
                throw new IllegalArgumentException(a.l(j3, "Given a negative start delay: "));
            }
            enpVar8.u = j3;
        }
        if (typedArray.hasValue(16)) {
            enp enpVar9 = this.a;
            enpVar9.r = typedArray.getInt(16, enpVar9.r);
        }
        if (typedArray.hasValue(5)) {
            enp enpVar10 = this.a;
            int i = typedArray.getInt(5, enpVar10.c);
            if (i == 1) {
                enpVar10.c = 1;
            } else if (i == 2) {
                enpVar10.c = 2;
            } else if (i != 3) {
                enpVar10.c = 0;
            } else {
                enpVar10.c = 3;
            }
        }
        if (typedArray.hasValue(17)) {
            enp enpVar11 = this.a;
            if (typedArray.getInt(17, enpVar11.f) != 1) {
                enpVar11.f = 0;
            } else {
                enpVar11.f = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            enp enpVar12 = this.a;
            float f = typedArray.getFloat(6, enpVar12.l);
            if (f < 0.0f) {
                throw new IllegalArgumentException("Given invalid dropoff value: " + f);
            }
            enpVar12.l = f;
        }
        if (typedArray.hasValue(9)) {
            enp enpVar13 = this.a;
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, enpVar13.g);
            if (dimensionPixelSize < 0) {
                throw new IllegalArgumentException(a.b(dimensionPixelSize, "Given invalid width: "));
            }
            enpVar13.g = dimensionPixelSize;
        }
        if (typedArray.hasValue(8)) {
            enp enpVar14 = this.a;
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, enpVar14.h);
            if (dimensionPixelSize2 < 0) {
                throw new IllegalArgumentException(a.b(dimensionPixelSize2, "Given invalid height: "));
            }
            enpVar14.h = dimensionPixelSize2;
        }
        if (typedArray.hasValue(13)) {
            enp enpVar15 = this.a;
            float f2 = typedArray.getFloat(13, enpVar15.k);
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Given invalid intensity value: " + f2);
            }
            enpVar15.k = f2;
        }
        if (typedArray.hasValue(20)) {
            enp enpVar16 = this.a;
            float f3 = typedArray.getFloat(20, enpVar16.i);
            if (f3 < 0.0f) {
                throw new IllegalArgumentException("Given invalid width ratio: " + f3);
            }
            enpVar16.i = f3;
        }
        if (typedArray.hasValue(10)) {
            enp enpVar17 = this.a;
            float f4 = typedArray.getFloat(10, enpVar17.j);
            if (f4 < 0.0f) {
                throw new IllegalArgumentException("Given invalid height ratio: " + f4);
            }
            enpVar17.j = f4;
        }
        if (typedArray.hasValue(19)) {
            enp enpVar18 = this.a;
            enpVar18.m = typedArray.getFloat(19, enpVar18.m);
        }
    }
}
