package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.leanback.transition.FadeAndShortSlide;
import com.google.android.tv.remote.service.R;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qm {
    public static void A() {
        Thread.currentThread().interrupt();
    }

    public static void B(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static void C(Throwable th) {
        if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
            throw ((Error) th);
        }
    }

    public static cjd D(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof cjd ? (cjd) scheduledExecutorService : new cjh(scheduledExecutorService);
    }

    public static Executor E(final Executor executor, final cgx cgxVar) {
        executor.getClass();
        return executor == chz.a ? executor : new Executor() { // from class: cje
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                qm.F(executor, cgxVar, runnable);
            }
        };
    }

    public static /* synthetic */ void F(Executor executor, cgx cgxVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            cgxVar.d(e);
        }
    }

    public static cip G(Iterable iterable) {
        return new cip(false, bzs.n(iterable));
    }

    @SafeVarargs
    public static cip H(cja... cjaVarArr) {
        return new cip(false, bzs.p(cjaVarArr));
    }

    public static cip I(Iterable iterable) {
        return new cip(true, bzs.n(iterable));
    }

    public static cja J() {
        ciu ciuVar = ciu.a;
        return ciuVar != null ? ciuVar : new ciu();
    }

    public static cja K(Object obj) {
        return obj == null ? ciw.a : new ciw(obj);
    }

    public static cja L(cja cjaVar) {
        if (cjaVar.isDone()) {
            return cjaVar;
        }
        cis cisVar = new cis(cjaVar);
        cjaVar.m(cisVar, chz.a);
        return cisVar;
    }

    public static cja M(Runnable runnable, Executor executor) {
        cjs cjsVarF = cjs.f(runnable, null);
        executor.execute(cjsVarF);
        return cjsVarF;
    }

    public static cja N(Callable callable, Executor executor) {
        cjs cjsVar = new cjs(callable);
        executor.execute(cjsVar);
        return cjsVar;
    }

    public static cja O(chs chsVar, Executor executor) {
        cjs cjsVar = new cjs(chsVar);
        executor.execute(cjsVar);
        return cjsVar;
    }

    public static Object P(Future future) {
        bdq.m(future.isDone(), "Future was expected to be done: %s", future);
        return dnx.bI(future);
    }

    public static void Q(cja cjaVar, cim cimVar, Executor executor) {
        cjaVar.m(new cin(cjaVar, cimVar), executor);
    }

    public static void R(cja cjaVar, Future future) {
        if (cjaVar instanceof cgx) {
            ((cgx) cjaVar).p(future);
        } else {
            if (cjaVar == null || !cjaVar.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    public static int S(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static void T(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j2 + ")");
    }

    public static void U(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static long V(long j, long j2) {
        long j3 = j + j2;
        T(((j ^ j2) < 0) | ((j ^ j3) >= 0), "checkedAdd", j, j2);
        return j3;
    }

    public static int W(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (cgm.a[roundingMode.ordinal()]) {
            case 1:
                U(false);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i3 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i3;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static int X(int i, int i2) {
        return S(i + i2);
    }

    public static clo Y(Throwable th) {
        StackTraceElement[] stackTrace;
        clo cloVarO = cgk.a.o();
        clo cloVarO2 = cgi.a.o();
        String name = th.getClass().getName();
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        cgi cgiVar = (cgi) cloVarO2.b;
        name.getClass();
        cgiVar.b |= 1;
        cgiVar.c = name;
        if (th.getMessage() != null) {
            String message = th.getMessage();
            if (!cloVarO2.b.A()) {
                cloVarO2.l();
            }
            cgi cgiVar2 = (cgi) cloVarO2.b;
            message.getClass();
            cgiVar2.b |= 2;
            cgiVar2.d = message;
        }
        try {
            stackTrace = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTrace = null;
        }
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                clo cloVarO3 = cgh.a.o();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (!cloVarO3.b.A()) {
                        cloVarO3.l();
                    }
                    cgh cghVar = (cgh) cloVarO3.b;
                    className.getClass();
                    cghVar.b |= 1;
                    cghVar.c = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (!cloVarO3.b.A()) {
                        cloVarO3.l();
                    }
                    cgh cghVar2 = (cgh) cloVarO3.b;
                    methodName.getClass();
                    cghVar2.b |= 2;
                    cghVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (!cloVarO3.b.A()) {
                        cloVarO3.l();
                    }
                    cgh cghVar3 = (cgh) cloVarO3.b;
                    cghVar3.b |= 8;
                    cghVar3.f = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (!cloVarO3.b.A()) {
                            cloVarO3.l();
                        }
                        cgh cghVar4 = (cgh) cloVarO3.b;
                        fileName.getClass();
                        cghVar4.b |= 4;
                        cghVar4.e = fileName;
                    }
                }
                if (!cloVarO2.b.A()) {
                    cloVarO2.l();
                }
                cgi cgiVar3 = (cgi) cloVarO2.b;
                cgh cghVar5 = (cgh) cloVarO3.i();
                cghVar5.getClass();
                cme cmeVar = cgiVar3.f;
                if (!cmeVar.c()) {
                    cgiVar3.f = clt.t(cmeVar);
                }
                cgiVar3.f.add(cghVar5);
            }
        }
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        cgk cgkVar = (cgk) cloVarO.b;
        cgi cgiVar4 = (cgi) cloVarO2.i();
        cgiVar4.getClass();
        cgkVar.c = cgiVar4;
        cgkVar.b |= 1;
        return cloVarO;
    }

    private static int Z(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static float a(View view) {
        return view.getZ();
    }

    private static long aa(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long ab(byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }

    private static long ac(long j) {
        return j ^ (j >>> 47);
    }

    private static void ad(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jAb = j + ab(bArr, i);
        long jAb2 = ab(bArr, i + 8);
        long jAb3 = ab(bArr, i + 16);
        long jAb4 = ab(bArr, i + 24);
        long j3 = jAb2 + jAb + jAb3;
        long jRotateRight = Long.rotateRight(j2 + jAb + jAb4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + jAb4;
        jArr[1] = jRotateRight + jAb;
    }

    public static ColorStateList b(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode c(View view) {
        return view.getBackgroundTintMode();
    }

    public static sf d(View view, sf sfVar, Rect rect) {
        WindowInsets windowInsetsE = sfVar.e();
        if (windowInsetsE != null) {
            return sf.o(view.computeSystemWindowInsets(windowInsetsE, rect), view);
        }
        rect.setEmpty();
        return sfVar;
    }

    static void e(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void f(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void g(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void h(View view, float f) {
        view.setElevation(f);
    }

    public static void i(View view, pw pwVar) {
        ql qlVar = pwVar != null ? new ql(view, pwVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, qlVar);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (qlVar != null) {
            view.setOnApplyWindowInsetsListener(qlVar);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void j(View view, float f) {
        view.setZ(f);
    }

    static void k(View view) {
        view.stopNestedScroll();
    }

    public static void l(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof pt) {
            ((pt) viewParent).d(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", b.b(viewParent, "ViewParent ", " does not implement interface method onNestedPreScroll"), e);
            }
        }
    }

    public static void m(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof pu) {
            ((pu) viewParent).f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof pt) {
            ((pt) viewParent).e(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", b.b(viewParent, "ViewParent ", " does not implement interface method onNestedScroll"), e);
            }
        }
    }

    public static void n(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof pt) {
            ((pt) viewParent).g(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", b.b(viewParent, "ViewParent ", " does not implement interface method onNestedScrollAccepted"), e);
            }
        }
    }

    public static void o(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof pt) {
            ((pt) viewParent).h(view, i);
        } else if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", b.b(viewParent, "ViewParent ", " does not implement interface method onStopNestedScroll"), e);
            }
        }
    }

    public static boolean p(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", b.b(viewParent, "ViewParent ", " does not implement interface method onNestedFling"), e);
            return false;
        }
    }

    public static boolean q(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", b.b(viewParent, "ViewParent ", " does not implement interface method onNestedPreFling"), e);
            return false;
        }
    }

    public static boolean r(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof pt) {
            return ((pt) viewParent).t(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", b.b(viewParent, "ViewParent ", " does not implement interface method onStartNestedScroll"), e);
            return false;
        }
    }

    public static float u(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int iMin = Math.min((int) (200.0f * f), 199);
        float f2 = f - (iMin * 0.005f);
        float f3 = fArr[iMin];
        return f3 + ((f2 / 0.005f) * (fArr[iMin + 1] - f3));
    }

    public static int v(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static long w(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        long j = -5435081209227447693L;
        boolean z = false;
        if (length <= 32) {
            if (length > 16) {
                long jAb = ab(bArr2, 0) * (-5435081209227447693L);
                long jAb2 = ab(bArr2, 8);
                long j2 = (length + length) - 7286425919675154353L;
                long jAb3 = ab(bArr2, length - 8) * j2;
                return aa(Long.rotateRight(jAb + jAb2, 43) + Long.rotateRight(jAb3, 30) + (ab(bArr2, length - 16) * (-7286425919675154353L)), jAb + Long.rotateRight(jAb2 - 7286425919675154353L, 18) + jAb3, j2);
            }
            if (length >= 8) {
                long j3 = (length + length) - 7286425919675154353L;
                long jAb4 = ab(bArr2, 0) - 7286425919675154353L;
                long jAb5 = ab(bArr2, length - 8);
                return aa((Long.rotateRight(jAb5, 37) * j3) + jAb4, (Long.rotateRight(jAb4, 25) + jAb5) * j3, j3);
            }
            if (length >= 4) {
                return aa(length + ((Z(bArr2, 0) & 4294967295L) << 3), Z(bArr2, length - 4) & 4294967295L, (length + length) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            return ac((((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr2[length - 1] & 255) << 2)) * (-4348849565147123417L))) * (-7286425919675154353L);
        }
        char c = '@';
        if (length <= 64) {
            long jAb6 = ab(bArr2, 0) * (-7286425919675154353L);
            long jAb7 = ab(bArr2, 8);
            long j4 = (length + length) - 7286425919675154353L;
            long jAb8 = ab(bArr2, length - 8) * j4;
            long jAb9 = ab(bArr2, length - 16) * (-7286425919675154353L);
            long jRotateRight = Long.rotateRight(jAb6 + jAb7, 43) + Long.rotateRight(jAb8, 30);
            long jRotateRight2 = Long.rotateRight(jAb7 - 7286425919675154353L, 18) + jAb6;
            long jAb10 = ab(bArr2, 16) * j4;
            long jAb11 = ab(bArr2, 24);
            long j5 = jRotateRight + jAb9;
            long jAb12 = j5 + ab(bArr2, length - 32);
            long j6 = jAb12 * j4;
            return aa(Long.rotateRight(jAb10 + jAb11, 43) + Long.rotateRight(j6, 30) + ((aa(j5, jRotateRight2 + jAb8, j4) + ab(bArr2, length - 24)) * j4), jAb10 + Long.rotateRight(jAb11 + jAb6, 18) + j6, j4);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jAb13 = ab(bArr2, 0) + 95310865018149119L;
        long jAc = ac(-7956866745689871395L) * (-7286425919675154353L);
        long j7 = 2480279821605975764L;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            boolean z2 = z;
            int i3 = (i2 >> 6) * 64;
            char c2 = c;
            long jRotateRight3 = Long.rotateRight(jAb13 + j7 + jArr[z2 ? 1 : 0] + ab(bArr2, i + 8), 37) * j;
            long jRotateRight4 = Long.rotateRight(j7 + jArr[1] + ab(bArr2, i + 48), 42) * j;
            long j8 = jRotateRight3 ^ jArr2[1];
            long j9 = j;
            long jAb14 = ab(bArr2, i + 40) + jArr[z2 ? 1 : 0];
            long jRotateRight5 = Long.rotateRight(jAc + jArr2[z2 ? 1 : 0], 33) * j9;
            int i4 = i;
            ad(bArr2, i4, jArr[1] * j9, j8 + jArr2[z2 ? 1 : 0], jArr);
            long[] jArr3 = jArr;
            j7 = jRotateRight4 + jAb14;
            ad(bArr2, i4 + 32, jRotateRight5 + jArr2[1], ab(bArr2, i4 + 16) + j7, jArr2);
            i = i4 + 64;
            if (i == i3) {
                int i5 = i2 & 63;
                int i6 = i3 + i5;
                long j10 = j8 & 255;
                long j11 = j10 + j10 + j9;
                long j12 = jArr2[z2 ? 1 : 0] + i5;
                long j13 = jArr3[z2 ? 1 : 0] + j12;
                jArr3[z2 ? 1 : 0] = j13;
                jArr2[z2 ? 1 : 0] = j12 + j13;
                long jRotateRight6 = Long.rotateRight(jRotateRight5 + j7 + j13 + ab(bArr2, i6 - 55), 37) * j11;
                long jRotateRight7 = Long.rotateRight(j7 + jArr3[1] + ab(bArr2, i6 - 15), 42) * j11;
                long j14 = jArr2[1] * 9;
                long jAb15 = (jArr3[z2 ? 1 : 0] * 9) + ab(bArr2, i6 - 23);
                long jRotateRight8 = Long.rotateRight(j8 + jArr2[z2 ? 1 : 0], 33) * j11;
                long j15 = jRotateRight6 ^ j14;
                ad(bArr2, i6 - 63, jArr3[1] * j11, j15 + jArr2[z2 ? 1 : 0], jArr3);
                long j16 = jRotateRight7 + jAb15;
                ad(bArr2, i6 - 31, jArr2[1] + jRotateRight8, ab(bArr2, i6 - 47) + j16, jArr2);
                return aa(aa(jArr3[z2 ? 1 : 0], jArr2[z2 ? 1 : 0], j11) + (ac(j16) * (-4348849565147123417L)) + j15, aa(jArr3[1], jArr2[1], j11) + jRotateRight8, j11);
            }
            bArr2 = bArr;
            c = c2;
            z = z2 ? 1 : 0;
            jAc = j8;
            j = j9;
            jAb13 = jRotateRight5;
            jArr = jArr3;
        }
    }

    public static int x(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }

    public static int y(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int z(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }

    public float s(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationX();
    }

    public float t(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationY();
    }
}
