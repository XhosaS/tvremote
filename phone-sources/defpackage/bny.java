package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerElement;
import androidx.compose.ui.input.nestedscroll.NestedScrollElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bny {
    private static Method a;
    private static Method b;
    private static boolean c;

    public static final long A(bsz bszVar) {
        return B(bszVar, false);
    }

    public static final long B(bsz bszVar, boolean z) {
        long jAt = a.at(bszVar.c, bszVar.g);
        if (z || !bszVar.c()) {
            return jAt;
        }
        return 0L;
    }

    public static final boolean C(bsz bszVar) {
        return (bszVar.c() || bszVar.h || !bszVar.d) ? false : true;
    }

    public static final boolean D(bsz bszVar) {
        return !bszVar.h && bszVar.d;
    }

    public static final boolean E(bsz bszVar) {
        return (bszVar.c() || !bszVar.h || bszVar.d) ? false : true;
    }

    public static final boolean F(bsz bszVar) {
        return bszVar.h && !bszVar.d;
    }

    public static final boolean G(bsz bszVar, long j, long j2) {
        boolean zR = a.r(bszVar.i, 1);
        long j3 = bszVar.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float f = zR ? 1.0f : 0.0f;
        float f2 = fIntBitsToFloat3 * f;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > ((float) ((int) (j >> 32))) + f2) | (fIntBitsToFloat < (-f2)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((float) ((int) (j & 4294967295L))) + fIntBitsToFloat4);
    }

    public static final boolean H(bsz bszVar) {
        return !a.s(B(bszVar, true), 0L);
    }

    public static /* synthetic */ bkp J(bsb bsbVar) {
        return new NestedScrollElement(bsbVar, null);
    }

    public static final long K(int i) {
        return i << 32;
    }

    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ defpackage.bng b(int r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bny.b(int, int, int):bng");
    }

    public static final bkp c(bkp bkpVar, yjv yjvVar) {
        return bkpVar.a(new BlockGraphicsLayerElement(yjvVar));
    }

    public static /* synthetic */ bkp d(bkp bkpVar, float f, float f2, float f3, float f4, bol bolVar, int i) {
        long j = (i & 1024) != 0 ? bop.a : 0L;
        bol bolVar2 = (i & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? boh.a : bolVar;
        int i2 = i & 32;
        int i3 = i & 4;
        int i4 = i & 2;
        int i5 = i & 1;
        float f5 = (i & 512) != 0 ? 8.0f : 0.0f;
        float f6 = i2 != 0 ? 0.0f : f4;
        float f7 = i3 != 0 ? 1.0f : f3;
        float f8 = i4 != 0 ? 1.0f : f2;
        float f9 = 1 == i5 ? 1.0f : f;
        long j2 = bnw.a;
        return e(bkpVar, f9, f8, f7, f6, f5, j, bolVar2, false, j2, j2, 0);
    }

    public static final bkp e(bkp bkpVar, float f, float f2, float f3, float f4, float f5, long j, bol bolVar, boolean z, long j2, long j3, int i) {
        return bkpVar.a(new GraphicsLayerElement(f, f2, f3, f4, f5, j, bolVar, z, j2, j3, i));
    }

    public static /* synthetic */ bkp f(bkp bkpVar, float f, bol bolVar, boolean z, int i, int i2) {
        long j = (i2 & 1024) != 0 ? bop.a : 0L;
        bol bolVar2 = (i2 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? boh.a : bolVar;
        boolean z2 = ((i2 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) & z;
        long j2 = (i2 & 16384) != 0 ? bnw.a : 0L;
        long j3 = (32768 & i2) != 0 ? bnw.a : 0L;
        int i3 = ((65536 & i2) == 0 ? 1 : 0) & i;
        int i4 = i2 & 4;
        int i5 = i2 & 2;
        int i6 = i2 & 1;
        float f2 = (i2 & 512) != 0 ? 8.0f : 0.0f;
        float f3 = i4 != 0 ? 1.0f : f;
        return e(bkpVar, 1 != i6 ? 0.0f : 1.0f, i5 != 0 ? 1.0f : 0.0f, f3, 0.0f, f2, j, bolVar2, z2, j2, j3, i3);
    }

    public static final float g(long j) {
        bov bovVarF = bnq.f(j);
        long j2 = bovVarF.b;
        if (!a.s(j2, 12884901888L)) {
            String strA = bou.a(j2);
            Objects.toString(strA);
            a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(strA));
        }
        bovVarF.getClass();
        bpc bpcVar = ((bpi) bovVarF).p;
        float fA = (float) ((bpcVar.a(bnq.d(j)) * 0.2126d) + (bpcVar.a(bnq.c(j)) * 0.7152d) + (bpcVar.a(bnq.b(j)) * 0.0722d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final int h(long j) {
        float[] fArr = box.a;
        return (int) (bnq.e(j, box.e) >>> 32);
    }

    public static final long i(int i) {
        long j = bnq.a;
        return i << 32;
    }

    public static final long j(long j) {
        long j2 = bnq.a;
        return j << 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long k(float r20, float r21, float r22, float r23, defpackage.bov r24) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bny.k(float, float, float, float, bov):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long l(float r18, float r19, float r20, float r21, defpackage.bov r22) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bny.l(float, float, float, float, bov):long");
    }

    public static final long m(long j, long j2) {
        long jE = bnq.e(j, bnq.f(j2));
        float fA = bnq.a(jE);
        float fD = bnq.d(jE);
        float fD2 = bnq.d(j2);
        float fA2 = bnq.a(j2);
        float f = 1.0f - fA;
        float f2 = (fA2 * f) + fA;
        return l(f2 == 0.0f ? 0.0f : ((fD * fA) + ((fD2 * fA2) * f)) / f2, f2 == 0.0f ? 0.0f : ((bnq.c(jE) * fA) + ((bnq.c(j2) * fA2) * f)) / f2, f2 != 0.0f ? ((bnq.b(jE) * fA) + ((bnq.b(j2) * fA2) * f)) / f2 : 0.0f, f2, bnq.f(j2));
    }

    public static final void o(Canvas canvas, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!c) {
            try {
                if (Build.VERSION.SDK_INT == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    a = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    b = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method = a;
                if (method != null) {
                    method.setAccessible(true);
                }
                Method method2 = b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            c = true;
        }
        try {
            if (z) {
                Method method3 = a;
                if (method3 != null) {
                    method3.invoke(canvas, null);
                }
            } else {
                Method method4 = b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            }
        } catch (IllegalAccessException | InvocationTargetException unused2) {
        }
    }

    public static void r(bnp bnpVar, bmy bmyVar) {
        bnpVar.a(bmyVar.b, bmyVar.c, bmyVar.d, bmyVar.e, 1);
    }

    public static final bnn t(yfw[] yfwVarArr, long j, long j2) {
        ArrayList arrayList = new ArrayList(yfwVarArr.length);
        for (yfw yfwVar : yfwVarArr) {
            arrayList.add(new bnq(((bnq) yfwVar.b).h));
        }
        ArrayList arrayList2 = new ArrayList(yfwVarArr.length);
        for (yfw yfwVar2 : yfwVarArr) {
            arrayList2.add(Float.valueOf(((Number) yfwVar2.a).floatValue()));
        }
        return new bnz(arrayList, arrayList2, j, j2);
    }

    public static final int v(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return Float.isNaN(f2) ? 0 : 1;
    }

    public static final void w(bsr bsrVar, long j, yjv yjvVar, boolean z) {
        MotionEvent motionEventA = bsrVar.a();
        if (motionEventA == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        yjvVar.a(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventA.setAction(action);
    }

    public static final int x(boolean z, boolean z2, boolean z3) {
        return (z ? 1 : 0) | ((z2 ? 1 : 0) + (z2 ? 1 : 0)) | ((z3 ? 1 : 0) << 2);
    }

    public static final boolean z(int i) {
        return (i & 33) != 0;
    }
}
