package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.Arrays;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class boa {
    public final float[] a;

    public /* synthetic */ boa(float[] fArr) {
        this.a = fArr;
    }

    public static final long a(float[] fArr, long j) {
        int length = fArr.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f3 * fIntBitsToFloat) + (f6 * fIntBitsToFloat2)) + f9);
        float f11 = (f * fIntBitsToFloat) + (f4 * fIntBitsToFloat2) + f7;
        float f12 = (f2 * fIntBitsToFloat) + (f5 * fIntBitsToFloat2) + f8;
        if ((Float.floatToRawIntBits(f10) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) >= 2139095040) {
            f10 = 0.0f;
        }
        return (Float.floatToRawIntBits(f11 * f10) << 32) | (Float.floatToRawIntBits(f10 * f12) & 4294967295L);
    }

    public static final void b(float[] fArr, bmw bmwVar) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = bmwVar.a;
        float f11 = f3 * f10;
        float f12 = bmwVar.b;
        float f13 = f6 * f12;
        float f14 = 1.0f / ((f11 + f13) + f9);
        float f15 = bmwVar.c;
        float f16 = bmwVar.d;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f14) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        float f17 = f * f10;
        float f18 = f4 * f12;
        float f19 = f17 + f18 + f7;
        float f20 = f10 * f2;
        float f21 = f12 * f5;
        float f22 = f20 + f21 + f8;
        float f23 = f6 * f16;
        float f24 = 1.0f / ((f11 + f23) + f9);
        int iFloatToRawIntBits2 = Float.floatToRawIntBits(f24) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        float f25 = f4 * f16;
        float f26 = f17 + f25 + f7;
        float f27 = f5 * f16;
        float f28 = f20 + f27 + f8;
        float f29 = f3 * f15;
        float f30 = 1.0f / ((f13 + f29) + f9);
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f30) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        float f31 = f * f15;
        float f32 = f31 + f18 + f7;
        float f33 = f15 * f2;
        float f34 = f21 + f33 + f8;
        float f35 = 1.0f / ((f29 + f23) + f9);
        int iFloatToRawIntBits4 = Float.floatToRawIntBits(f35) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        float f36 = f31 + f25 + f7;
        float f37 = f33 + f27 + f8;
        if (iFloatToRawIntBits2 >= 2139095040) {
            f24 = 0.0f;
        }
        float f38 = f24 * f26;
        if (iFloatToRawIntBits3 >= 2139095040) {
            f30 = 0.0f;
        }
        float f39 = f30 * f32;
        if (iFloatToRawIntBits4 >= 2139095040) {
            f35 = 0.0f;
        }
        float f40 = f35 * f36;
        float fMin = Math.min(f38, Math.min(f39, f40));
        if (iFloatToRawIntBits >= 2139095040) {
            f14 = 0.0f;
        }
        float f41 = f14 * f19;
        bmwVar.a = Math.min(f41, fMin);
        float f42 = f30 * f34;
        float f43 = f35 * f37;
        float f44 = f24 * f28;
        float f45 = f14 * f22;
        bmwVar.b = Math.min(f45, Math.min(f44, Math.min(f42, f43)));
        bmwVar.c = Math.max(f41, Math.max(f38, Math.max(f39, f40)));
        bmwVar.d = Math.max(f45, Math.max(f44, Math.max(f42, f43)));
    }

    public static final void c(float[] fArr) {
        int length = fArr.length;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void d(float[] fArr, float[] fArr2) {
        int length = fArr2.length;
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[4];
        float f5 = fArr[2];
        float f6 = fArr2[8];
        float f7 = f5 * f6;
        float f8 = fArr[3];
        float f9 = fArr2[12];
        float f10 = f8 * f9;
        float f11 = fArr2[1];
        float f12 = f * f11;
        float f13 = fArr2[5];
        float f14 = f3 * f13;
        float f15 = fArr2[9];
        float f16 = f5 * f15;
        float f17 = fArr2[13];
        float f18 = f8 * f17;
        float f19 = fArr2[2];
        float f20 = f * f19;
        float f21 = fArr2[6];
        float f22 = f3 * f21;
        float f23 = fArr2[10];
        float f24 = f5 * f23;
        float f25 = fArr2[14];
        float f26 = f8 * f25;
        float f27 = fArr2[3];
        float f28 = fArr2[7];
        float f29 = fArr2[11];
        float f30 = fArr2[15];
        float f31 = fArr[4];
        float f32 = fArr[5];
        float f33 = fArr[6];
        float f34 = f33 * f6;
        float f35 = fArr[7];
        float f36 = f35 * f9;
        float f37 = f31 * f11;
        float f38 = f32 * f13;
        float f39 = f33 * f15;
        float f40 = f35 * f17;
        float f41 = f31 * f19;
        float f42 = f32 * f21;
        float f43 = f33 * f23;
        float f44 = f35 * f25;
        float f45 = fArr[8];
        float f46 = fArr[9];
        float f47 = fArr[10];
        float f48 = f47 * f6;
        float f49 = fArr[11];
        float f50 = f49 * f9;
        float f51 = f45 * f11;
        float f52 = f46 * f13;
        float f53 = f47 * f15;
        float f54 = f49 * f17;
        float f55 = f45 * f19;
        float f56 = f46 * f21;
        float f57 = f47 * f23;
        float f58 = f49 * f25;
        float f59 = fArr[12];
        float f60 = fArr[13];
        float f61 = fArr[14];
        float f62 = fArr[15];
        float f63 = (f2 * f59) + (f4 * f60);
        float f64 = f9 * f62;
        float f65 = f15 * f61;
        float f66 = f17 * f62;
        float f67 = f23 * f61;
        float f68 = f25 * f62;
        fArr[0] = (f * f2) + (f3 * f4) + f7 + f10;
        fArr[1] = f12 + f14 + f16 + f18;
        fArr[2] = f20 + f22 + f24 + f26;
        fArr[3] = (f * f27) + (f3 * f28) + (f5 * f29) + (f8 * f30);
        fArr[4] = (f31 * f2) + (f32 * f4) + f34 + f36;
        fArr[5] = f37 + f38 + f39 + f40;
        fArr[6] = f41 + f42 + f43 + f44;
        fArr[7] = (f31 * f27) + (f32 * f28) + (f33 * f29) + (f35 * f30);
        fArr[8] = (f45 * f2) + (f46 * f4) + f48 + f50;
        fArr[9] = f51 + f52 + f53 + f54;
        fArr[10] = f55 + f56 + f57 + f58;
        fArr[11] = (f45 * f27) + (f46 * f28) + (f47 * f29) + (f49 * f30);
        fArr[12] = f63 + (f6 * f61) + f64;
        fArr[13] = (f11 * f59) + (f13 * f60) + f65 + f66;
        fArr[14] = (f19 * f59) + (f21 * f60) + f67 + f68;
        fArr[15] = (f59 * f27) + (f60 * f28) + (f61 * f29) + (f62 * f30);
    }

    public static /* synthetic */ float[] e() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final void f(float[] fArr, float f, float f2) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
    }

    public static final void g(float[] fArr, float f, float f2) {
        int length = fArr.length;
        float f3 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * 0.0f) + fArr[12];
        float f4 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * 0.0f) + fArr[13];
        float f5 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * 0.0f) + fArr[14];
        float f6 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * 0.0f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof boa) && yks.e(this.a, ((boa) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return ylh.r(sb.toString());
    }
}
