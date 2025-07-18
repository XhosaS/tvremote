package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class bnq {
    public static final long a = bny.j(4278190080L);
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public final long h;

    static {
        bny.j(4282664004L);
        bny.j(4287137928L);
        b = bny.j(4291611852L);
        c = bny.j(4294967295L);
        d = bny.j(4294901760L);
        bny.j(4278255360L);
        e = bny.j(4278190335L);
        bny.j(4294967040L);
        bny.j(4278255615L);
        bny.j(4294902015L);
        f = bny.i(0);
        float[] fArr = box.a;
        g = bny.k(0.0f, 0.0f, 0.0f, 0.0f, box.u);
    }

    public /* synthetic */ bnq(long j) {
        this.h = j;
    }

    public static final float a(long j) {
        float fD;
        float f2;
        if ((63 & j) == 0) {
            fD = (float) ybn.d(j >>> 56);
            f2 = 255.0f;
        } else {
            fD = (float) ybn.d((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fD / f2;
    }

    public static final float b(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) ybn.d((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - bnv.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final float c(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) ybn.d((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - bnv.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final float d(long j) {
        int i;
        int i2;
        long j2 = 63 & j;
        long j3 = j >>> 48;
        if (j2 == 0) {
            return ((float) ybn.d(j3 & 255)) / 255.0f;
        }
        short s = (short) j3;
        char c2 = (char) s;
        int i3 = c2 & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c2 & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - bnv.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i5 << 16) | i);
    }

    public static final long e(long j, bov bovVar) {
        bpa bpaVarD;
        bov bovVarF = f(j);
        int i = bovVarF.c;
        int i2 = bovVar.c;
        if ((i | i2) < 0) {
            bpaVarD = brx.D(bovVarF, bovVar);
        } else {
            int i3 = i | (i2 << 6);
            jc jcVar = bpb.a;
            Object objA = jcVar.a(i3);
            if (objA == null) {
                objA = brx.D(bovVarF, bovVar);
                jcVar.f(i3, objA);
            }
            bpaVarD = (bpa) objA;
        }
        return bpaVarD.a(j);
    }

    public static final bov f(long j) {
        float[] fArr = box.a;
        return box.y[(int) (j & 63)];
    }

    public static String g(long j) {
        return "Color(" + d(j) + ", " + c(j) + ", " + b(j) + ", " + a(j) + ", " + f(j).a + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bnq) && this.h == ((bnq) obj).h;
    }

    public final int hashCode() {
        return a.k(this.h);
    }

    public final String toString() {
        return g(this.h);
    }
}
