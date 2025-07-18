package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnj {
    public static final kw A() {
        return new kw(new PathMeasure());
    }

    public static final void a(String str) {
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    public static final Shader.TileMode b() {
        return a.r(0, 0) ? Shader.TileMode.CLAMP : a.r(0, 1) ? Shader.TileMode.REPEAT : a.r(0, 2) ? Shader.TileMode.MIRROR : a.r(0, 3) ? Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final int c(List list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iQ = yfm.q(list);
        for (int i2 = 1; i2 < iQ; i2++) {
            if (bnq.a(((bnq) list.get(i2)).h) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static final void d(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final float[] e(List list, List list2, int i) {
        float fFloatValue;
        int i2 = 0;
        if (i == 0) {
            if (list == null) {
                return null;
            }
            float[] fArr = new float[list.size()];
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fArr[i2] = ((Number) it.next()).floatValue();
                i2++;
            }
            return fArr;
        }
        float[] fArr2 = new float[list2.size() + i];
        if (list != null) {
            fFloatValue = ((Number) list.get(0)).floatValue();
        } else {
            list = null;
            fFloatValue = 0.0f;
        }
        fArr2[0] = fFloatValue;
        int iQ = yfm.q(list2);
        int i3 = 1;
        for (int i4 = 1; i4 < iQ; i4++) {
            long j = ((bnq) list2.get(i4)).h;
            float fFloatValue2 = list != null ? ((Number) list.get(i4)).floatValue() : i4 / yfm.q(list2);
            int i5 = i3 + 1;
            fArr2[i3] = fFloatValue2;
            if (bnq.a(j) == 0.0f) {
                i3 += 2;
                fArr2[i5] = fFloatValue2;
            } else {
                i3 = i5;
            }
        }
        fArr2[i3] = list != null ? ((Number) list.get(yfm.q(list2))).floatValue() : 1.0f;
        return fArr2;
    }

    public static final int[] f(List list, int i) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i2 < size) {
                iArr[i2] = bny.h(((bnq) list.get(i2)).h);
                i2++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int iQ = yfm.q(list);
        int size2 = list.size();
        int i3 = 0;
        while (i2 < size2) {
            int i4 = i3 + 1;
            long j = ((bnq) list.get(i2)).h;
            if (bnq.a(j) != 0.0f) {
                iArr2[i3] = bny.h(j);
            } else if (i2 == 0) {
                long j2 = ((bnq) list.get(1)).h;
                iArr2[i3] = bny.h(bny.k(bnq.d(j2), bnq.c(j2), bnq.b(j2), 0.0f, bnq.f(j2)));
            } else {
                int i5 = i2 - 1;
                if (i2 == iQ) {
                    long j3 = ((bnq) list.get(i5)).h;
                    iArr2[i3] = bny.h(bny.k(bnq.d(j3), bnq.c(j3), bnq.b(j3), 0.0f, bnq.f(j3)));
                } else {
                    long j4 = ((bnq) list.get(i5)).h;
                    iArr2[i3] = bny.h(bny.k(bnq.d(j4), bnq.c(j4), bnq.b(j4), 0.0f, bnq.f(j4)));
                    long j5 = ((bnq) list.get(i2 + 1)).h;
                    i3 += 2;
                    iArr2[i4] = bny.h(bny.k(bnq.d(j5), bnq.c(j5), bnq.b(j5), 0.0f, bnq.f(j5)));
                    i2++;
                }
            }
            i3 = i4;
            i2++;
        }
        return iArr2;
    }

    public static final void g(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static final void h(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final Bitmap.Config i(int i) {
        return a.r(i, 0) ? Bitmap.Config.ARGB_8888 : a.r(i, 1) ? Bitmap.Config.ALPHA_8 : a.r(i, 2) ? Bitmap.Config.RGB_565 : (Build.VERSION.SDK_INT < 26 || !a.r(i, 3)) ? (Build.VERSION.SDK_INT < 26 || !a.r(i, 4)) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final Bitmap j(bng bngVar) {
        if (bngVar instanceof bng) {
            return bngVar.a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final BlendMode k(int i) {
        return a.r(i, 0) ? BlendMode.CLEAR : a.r(i, 1) ? BlendMode.SRC : a.r(i, 2) ? BlendMode.DST : a.r(i, 3) ? BlendMode.SRC_OVER : a.r(i, 4) ? BlendMode.DST_OVER : a.r(i, 5) ? BlendMode.SRC_IN : a.r(i, 6) ? BlendMode.DST_IN : a.r(i, 7) ? BlendMode.SRC_OUT : a.r(i, 8) ? BlendMode.DST_OUT : a.r(i, 9) ? BlendMode.SRC_ATOP : a.r(i, 10) ? BlendMode.DST_ATOP : a.r(i, 11) ? BlendMode.XOR : a.r(i, 12) ? BlendMode.PLUS : a.r(i, 13) ? BlendMode.MODULATE : a.r(i, 14) ? BlendMode.SCREEN : a.r(i, 15) ? BlendMode.OVERLAY : a.r(i, 16) ? BlendMode.DARKEN : a.r(i, 17) ? BlendMode.LIGHTEN : a.r(i, 18) ? BlendMode.COLOR_DODGE : a.r(i, 19) ? BlendMode.COLOR_BURN : a.r(i, 20) ? BlendMode.HARD_LIGHT : a.r(i, 21) ? BlendMode.SOFT_LIGHT : a.r(i, 22) ? BlendMode.DIFFERENCE : a.r(i, 23) ? BlendMode.EXCLUSION : a.r(i, 24) ? BlendMode.MULTIPLY : a.r(i, 25) ? BlendMode.HUE : a.r(i, 26) ? BlendMode.SATURATION : a.r(i, 27) ? BlendMode.COLOR : a.r(i, 28) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode l(int i) {
        return a.r(i, 0) ? PorterDuff.Mode.CLEAR : a.r(i, 1) ? PorterDuff.Mode.SRC : a.r(i, 2) ? PorterDuff.Mode.DST : a.r(i, 3) ? PorterDuff.Mode.SRC_OVER : a.r(i, 4) ? PorterDuff.Mode.DST_OVER : a.r(i, 5) ? PorterDuff.Mode.SRC_IN : a.r(i, 6) ? PorterDuff.Mode.DST_IN : a.r(i, 7) ? PorterDuff.Mode.SRC_OUT : a.r(i, 8) ? PorterDuff.Mode.DST_OUT : a.r(i, 9) ? PorterDuff.Mode.SRC_ATOP : a.r(i, 10) ? PorterDuff.Mode.DST_ATOP : a.r(i, 11) ? PorterDuff.Mode.XOR : a.r(i, 12) ? PorterDuff.Mode.ADD : a.r(i, 14) ? PorterDuff.Mode.SCREEN : a.r(i, 15) ? PorterDuff.Mode.OVERLAY : a.r(i, 16) ? PorterDuff.Mode.DARKEN : a.r(i, 17) ? PorterDuff.Mode.LIGHTEN : a.r(i, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    @yfp
    public static final Rect m(bmy bmyVar) {
        float f = bmyVar.e;
        float f2 = bmyVar.d;
        return new Rect((int) bmyVar.b, (int) bmyVar.c, (int) f2, (int) f);
    }

    public static final Rect n(cmg cmgVar) {
        return new Rect(cmgVar.b, cmgVar.c, cmgVar.d, cmgVar.e);
    }

    public static final RectF o(bmy bmyVar) {
        return new RectF(bmyVar.b, bmyVar.c, bmyVar.d, bmyVar.e);
    }

    public static final bmy p(Rect rect) {
        return new bmy(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final bmy q(RectF rectF) {
        return new bmy(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final cmg r(Rect rect) {
        return new cmg(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ void s(bni bniVar, bmy bmyVar) {
        float f = bmyVar.b;
        if (Float.isNaN(f) || Float.isNaN(bmyVar.c) || Float.isNaN(bmyVar.d) || Float.isNaN(bmyVar.e)) {
            a("Invalid rectangle, make sure no value is NaN");
        }
        if (bniVar.b == null) {
            bniVar.b = new RectF();
        }
        RectF rectF = bniVar.b;
        rectF.getClass();
        rectF.set(f, bmyVar.c, bmyVar.d, bmyVar.e);
        Path path = bniVar.a;
        RectF rectF2 = bniVar.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static /* synthetic */ void t(bni bniVar, bmz bmzVar) {
        if (bniVar.b == null) {
            bniVar.b = new RectF();
        }
        RectF rectF = bniVar.b;
        rectF.getClass();
        rectF.set(bmzVar.a, bmzVar.b, bmzVar.c, bmzVar.d);
        if (bniVar.c == null) {
            bniVar.c = new float[8];
        }
        float[] fArr = bniVar.c;
        fArr.getClass();
        long j = bmzVar.e;
        fArr[0] = Float.intBitsToFloat((int) (j >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j & 4294967295L));
        long j2 = bmzVar.f;
        fArr[2] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long j3 = bmzVar.g;
        fArr[4] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j4 = bmzVar.h;
        fArr[6] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        Path path = bniVar.a;
        RectF rectF2 = bniVar.b;
        rectF2.getClass();
        float[] fArr2 = bniVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static final long u(bmy bmyVar) {
        return (Float.floatToRawIntBits(bmyVar.d - bmyVar.b) << 32) | (Float.floatToRawIntBits(bmyVar.e - bmyVar.c) & 4294967295L);
    }

    public static final long v(bmz bmzVar) {
        float fB = bmzVar.b();
        float fA = bmzVar.a();
        return (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L);
    }

    public static final long w(bmy bmyVar) {
        return (Float.floatToRawIntBits(bmyVar.b) << 32) | (Float.floatToRawIntBits(bmyVar.c) & 4294967295L);
    }

    public static final long x(bmz bmzVar) {
        return (Float.floatToRawIntBits(bmzVar.a) << 32) | (Float.floatToRawIntBits(bmzVar.b) & 4294967295L);
    }

    public static /* synthetic */ void y(bpq bpqVar, boe boeVar, long j, float f, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        boolean z = boeVar instanceof boc;
        bps bpsVar = bps.a;
        if (z) {
            bmy bmyVar = ((boc) boeVar).a;
            bpqVar.s(j, w(bmyVar), u(bmyVar), f2, bpsVar, null, 3);
            return;
        }
        float f3 = f2;
        if (!(boeVar instanceof bod)) {
            if (!(boeVar instanceof bob)) {
                throw new yfu();
            }
            bpqVar.x(((bob) boeVar).a, j, f3, bpsVar);
            return;
        }
        bod bodVar = (bod) boeVar;
        bni bniVar = bodVar.b;
        if (bniVar != null) {
            bpqVar.x(bniVar, j, f3, bpsVar);
            return;
        }
        bmz bmzVar = bodVar.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bmzVar.h >> 32));
        bpqVar.z(j, x(bmzVar), v(bmzVar), (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), bpsVar, f3);
    }

    public static final boolean z(float[] fArr) {
        return fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }
}
