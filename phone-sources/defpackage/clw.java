package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.Build;
import android.support.v7.widget.ActivityChooserView;
import com.google.common.collect.ImmutableMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clw {
    private static Executor a;

    public static final cmg A(bmy bmyVar) {
        return new cmg(Math.round(bmyVar.b), Math.round(bmyVar.c), Math.round(bmyVar.d), Math.round(bmyVar.e));
    }

    public static String B(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static eey C(enz enzVar, String str, enw enwVar, int i, Map map) {
        eex eexVar = new eex();
        eexVar.a = enwVar.a(str);
        eexVar.f = enwVar.a;
        eexVar.g = enwVar.b;
        String strM = enzVar.m();
        if (strM == null) {
            strM = enwVar.a(((enq) enzVar.f.get(0)).a).toString();
        }
        eexVar.h = strM;
        eexVar.i = i;
        eexVar.e = map;
        return eexVar.a();
    }

    public static fdg D(ees eesVar, int i, enz enzVar) {
        if (enzVar.i == null) {
            return null;
        }
        exo exoVarZ = Z(i, enzVar.e);
        try {
            ab(exoVarZ, eesVar, enzVar, true);
            exoVarZ.b();
            return exoVarZ.a();
        } catch (Throwable th) {
            exoVarZ.b();
            throw th;
        }
    }

    public static dze E(ees eesVar, gsf gsfVar) {
        int i = 2;
        enz enzVarAc = ac(gsfVar, 2);
        dze dzeVar = null;
        if (enzVarAc == null) {
            i = 1;
            enzVarAc = ac(gsfVar, 1);
            if (enzVarAc == null) {
                return null;
            }
        }
        dze dzeVar2 = enzVarAc.e;
        if (enzVarAc.i != null) {
            exo exoVarZ = Z(i, dzeVar2);
            try {
                ab(exoVarZ, eesVar, enzVarAc, false);
                exoVarZ.b();
                dze[] dzeVarArr = exoVarZ.a;
                eci.e(dzeVarArr);
                dzeVar = dzeVarArr[0];
            } catch (Throwable th) {
                exoVarZ.b();
                throw th;
            }
        }
        return dzeVar == null ? dzeVar2 : dzeVar.c(dzeVar2);
    }

    public static int F(int i) {
        return H(i, 0, 0, 0);
    }

    public static int G(int i, int i2, int i3) {
        return I(i, i2, i3, 0, 128, 0);
    }

    public static int H(int i, int i2, int i3, int i4) {
        return I(i, i2, i3, 0, 128, i4);
    }

    public static int I(int i, int i2, int i3, int i4, int i5, int i6) {
        return i | i2 | i3 | i4 | i5 | i6;
    }

    public static int J(int i) {
        return i & 3584;
    }

    public static int K(int i) {
        return i & 384;
    }

    public static int L(int i) {
        return i & 7;
    }

    public static int M(int i) {
        return i & 64;
    }

    public static boolean N(int i, boolean z) {
        int iL = L(i);
        if (iL != 4) {
            return z && iL == 3;
        }
        return true;
    }

    public static long O(egs egsVar) {
        byte[] bArr = (byte[]) ((egt) egsVar).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public static /* synthetic */ String P(eey eeyVar) {
        String str = eeyVar.h;
        return str != null ? str : eeyVar.a.toString();
    }

    public static FloatBuffer Q(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void R() throws ect {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new ect(sb.toString());
        }
    }

    public static void S(boolean z, String str) throws ect {
        if (!z) {
            throw new ect(str);
        }
    }

    public static void T(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static boolean U() {
        return Build.VERSION.SDK_INT >= 33 && V("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean V(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static void W(int i, int i2) throws ect {
        GLES20.glBindTexture(i, i2);
        R();
        GLES20.glTexParameteri(i, 10240, 9729);
        R();
        GLES20.glTexParameteri(i, 10241, 9729);
        R();
        GLES20.glTexParameteri(i, 10242, 33071);
        R();
        GLES20.glTexParameteri(i, 10243, 33071);
        R();
    }

    public static synchronized Executor X() {
        if (a == null) {
            a = edt.ab("ExoPlayer:BackgroundExecutor");
        }
        return a;
    }

    public static void Y(AudioTrack audioTrack, dxc dxcVar) {
        audioTrack.setPreferredDevice((AudioDeviceInfo) (dxcVar == null ? null : dxcVar.a));
    }

    private static exo Z(int i, dze dzeVar) {
        String str = dzeVar.X;
        return new exo((str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new fhw(fjg.a, 32) : new fhb(fjg.a, 2), i, dzeVar);
    }

    public static final int a(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i >= 262143 ? 255 : 18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void aa(ees eesVar, enz enzVar, exo exoVar, enw enwVar) {
        new exv(eesVar, C(enzVar, ((enq) enzVar.f.get(0)).a, enwVar, 0, ImmutableMap.of()), enzVar.e, 0, exoVar).e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void ab(exo exoVar, ees eesVar, enz enzVar, boolean z) {
        enw enwVar = enzVar.i;
        enwVar.getClass();
        if (z) {
            enw enwVarL = enzVar.l();
            if (enwVarL == null) {
                return;
            }
            enw enwVarB = enwVar.b(enwVarL, ((enq) enzVar.f.get(0)).a);
            if (enwVarB == null) {
                aa(eesVar, enzVar, exoVar, enwVar);
                enwVar = enwVarL;
            } else {
                enwVar = enwVarB;
            }
        }
        aa(eesVar, enzVar, exoVar, enwVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    private static enz ac(gsf gsfVar, int i) {
        int iA = gsfVar.a(i);
        if (iA == -1) {
            return null;
        }
        List list = ((enp) gsfVar.b.get(iA)).c;
        if (list.isEmpty()) {
            return null;
        }
        return (enz) list.get(0);
    }

    public static final int b(long j, int i) {
        int iC = clv.c(j);
        if (i < iC) {
            i = iC;
        }
        int iA = clv.a(j);
        return i > iA ? iA : i;
    }

    public static final int c(long j, int i) {
        int iD = clv.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = clv.b(j);
        return i > iB ? iB : i;
    }

    public static final long d(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            cme.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return g(i, i2, i3, i4);
    }

    public static final long e(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iD = clv.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = clv.b(j);
        if (i > iB) {
            i = iB;
        }
        long j3 = i << 32;
        int iA = clv.a(j);
        int i2 = (int) (j2 & 4294967295L);
        int iC = clv.c(j);
        if (i2 < iC) {
            i2 = iC;
        }
        if (i2 <= iA) {
            iA = i2;
        }
        return iA | j3;
    }

    public static final long f(long j, long j2) {
        int iD = clv.d(j2);
        int iD2 = clv.d(j);
        if (iD < iD2) {
            iD = iD2;
        }
        int iB = clv.b(j);
        if (iD > iB) {
            iD = iB;
        }
        int iB2 = clv.b(j2);
        if (iB2 >= iD2) {
            iD2 = iB2;
        }
        if (iD2 <= iB) {
            iB = iD2;
        }
        int iC = clv.c(j2);
        int iC2 = clv.c(j);
        if (iC < iC2) {
            iC = iC2;
        }
        int iA = clv.a(j);
        if (iC > iA) {
            iC = iA;
        }
        int iA2 = clv.a(j2);
        if (iA2 >= iC2) {
            iC2 = iA2;
        }
        if (iC2 <= iA) {
            iA = iC2;
        }
        return d(iD, iB, iC, iA);
    }

    public static final long g(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iA = a(i5);
        int iA2 = a(i6);
        if (iA + iA2 > 31) {
            j(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iA2 - 13;
        return (((~(i7 >> 31)) & i7) << 33) | (i << 2) | ((i9 >> 1) + (i9 & 1)) | (i3 << (iA2 + 2)) | (((~(i8 >> 31)) & i8) << (iA2 + 33));
    }

    public static final long h(long j, int i, int i2) {
        int iB = clv.b(j);
        if (iB != Integer.MAX_VALUE && (iB = iB + i) < 0) {
            iB = 0;
        }
        int iC = clv.c(j) + i2;
        if (iC < 0) {
            iC = 0;
        }
        int iA = clv.a(j);
        if (iA != Integer.MAX_VALUE && (iA = iA + i2) < 0) {
            iA = 0;
        }
        int iD = clv.d(j) + i;
        return d(iD >= 0 ? iD : 0, iB, iC, iA);
    }

    public static final Void i(int i) {
        throw new IllegalArgumentException(a.cd(i, "Can't represent a size of ", " in Constraints"));
    }

    public static final void j(int i, int i2) {
        throw new IllegalArgumentException(a.cn(i2, i, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static /* synthetic */ long k(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return d(0, i, 0, i2);
    }

    public static /* synthetic */ long l(long j, int i, int i2, int i3) {
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return h(j, i, i2);
    }

    public static final long m(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int iMin3 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    i(i6);
                    throw new yfs();
                }
                i5 = 8190;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i5, i2);
        }
        return d(Math.min(i5, i), iMin2, iMin, iMin3);
    }

    public static final long n(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int iMin3 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    i(i6);
                    throw new yfs();
                }
                i5 = 8190;
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i5, i4);
        }
        return d(iMin, iMin3, Math.min(i5, i3), iMin2);
    }

    public static final long o(int i, int i2) {
        if (!((i2 >= 0) & (i >= 0))) {
            cme.a("width and height must be >= 0");
        }
        return g(i, i, i2, i2);
    }

    public static final long p(int i) {
        if (i < 0) {
            cme.a("width must be >= 0");
        }
        return g(i, i, 0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public static final clx q(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        int i = cmo.a;
        cmn cmnVarB = cmo.b(f);
        if (cmnVarB == null) {
            cmnVarB = new cmj(f);
        }
        return new clz(f2, f, cmnVarB);
    }

    public static final clo r(long j) {
        return j != 16 ? new clf(j) : cln.a;
    }

    public static final float s(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float fI;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            fI = fArr2[iBinarySearch];
        } else {
            int i = -(iBinarySearch + 1);
            int i2 = i - 1;
            int length = fArr.length - 1;
            float f5 = 0.0f;
            if (i2 >= length) {
                float f6 = fArr[length];
                float f7 = fArr2[length];
                if (f6 == 0.0f) {
                    return 0.0f;
                }
                return f * (f7 / f6);
            }
            if (i2 == -1) {
                f2 = fArr[0];
                f3 = fArr2[0];
                f4 = 0.0f;
            } else {
                float f8 = fArr[i2];
                f2 = fArr[i];
                f5 = fArr2[i2];
                f3 = fArr2[i];
                f4 = f8;
            }
            fI = cmq.i(f5, f3, f4, f2, fAbs);
        }
        return fSignum * fI;
    }

    public static final long t(double d) {
        return w(4294967296L, (float) d);
    }

    public static final long u(float f) {
        return w(4294967296L, f);
    }

    public static final long v(int i) {
        return w(4294967296L, i);
    }

    public static final long w(long j, float f) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long j2 = cmk.a;
        return j | (jFloatToRawIntBits & 4294967295L);
    }

    public static final void x() {
        w(8589934592L, 0.25f);
    }

    public static final long y(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final cmg z(long j, long j2) {
        return new cmg(cmf.a(j), cmf.b(j), cmf.a(j) + ((int) (j2 >> 32)), cmf.b(j) + ((int) (4294967295L & j2)));
    }
}
