package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aks implements View.OnTouchListener {
    private static final int f = ViewConfiguration.getTapTimeout();
    final akq a;
    final View b;
    boolean c;
    boolean d;
    boolean e;
    private final Interpolator g;
    private Runnable h;
    private final float[] i;
    private final float[] j;
    private final int k;
    private final float[] l;
    private final float[] m;
    private final float[] n;
    private boolean o;
    private boolean p;

    public aks(View view) {
        akq akqVar = new akq();
        this.a = akqVar;
        this.g = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.i = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.j = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.l = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.m = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.n = fArr5;
        this.b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f2 = displayMetrics.density * 1575.0f;
        float f3 = displayMetrics.density * 315.0f;
        float f4 = ((int) (f2 + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((int) (f3 + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.k = f;
        akqVar.a = 500;
        akqVar.b = 500;
    }

    static float a(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float f(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.i
            r0 = r0[r4]
            float r0 = r0 * r6
            float[] r1 = r3.j
            r1 = r1[r4]
            r2 = 0
            float r0 = a(r0, r2, r1)
            float r6 = r6 - r5
            float r5 = r3.g(r5, r0)
            float r6 = r3.g(r6, r0)
            float r6 = r6 - r5
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 >= 0) goto L25
            android.view.animation.Interpolator r5 = r3.g
            float r6 = -r6
            float r5 = r5.getInterpolation(r6)
            float r5 = -r5
            goto L2f
        L25:
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 <= 0) goto L38
            android.view.animation.Interpolator r5 = r3.g
            float r5 = r5.getInterpolation(r6)
        L2f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = a(r5, r6, r0)
            goto L39
        L38:
            r5 = r2
        L39:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3e
            return r2
        L3e:
            float[] r0 = r3.l
            r0 = r0[r4]
            float[] r1 = r3.m
            r1 = r1[r4]
            float[] r2 = r3.n
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L53
            float r5 = r5 * r0
            float r4 = a(r5, r1, r4)
            return r4
        L53:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = a(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aks.f(int, float, float, float):float");
    }

    private final float g(float f2, float f3) {
        if (f3 != 0.0f && f2 < f3) {
            if (f2 >= 0.0f) {
                return 1.0f - (f2 / f3);
            }
            if (this.e) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    private final void h() {
        int i = 0;
        if (this.c) {
            this.e = false;
            return;
        }
        akq akqVar = this.a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - akqVar.e);
        int i3 = akqVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        akqVar.i = i;
        akqVar.h = akqVar.a(jCurrentAnimationTimeMillis);
        akqVar.g = jCurrentAnimationTimeMillis;
    }

    public abstract boolean b(int i);

    final boolean c() {
        akq akqVar = this.a;
        float f2 = akqVar.d;
        float fAbs = f2 / Math.abs(f2);
        Math.abs(akqVar.c);
        int i = (int) fAbs;
        return i != 0 && b(i);
    }

    public abstract void d(int i);

    public final void e(boolean z) {
        if (this.p && !z) {
            h();
        }
        this.p = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0017  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.p
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.h()
            goto L7c
        L1b:
            r7.d = r2
            r7.o = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.b
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.f(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.f(r2, r9, r8, r3)
            akq r9 = r7.a
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.e
            if (r8 != 0) goto L7c
            boolean r8 = r7.c()
            if (r8 == 0) goto L7c
            java.lang.Runnable r8 = r7.h
            if (r8 != 0) goto L60
            akr r8 = new akr
            r8.<init>(r7)
            r7.h = r8
        L60:
            r7.e = r2
            r7.c = r2
            boolean r8 = r7.o
            if (r8 != 0) goto L75
            int r8 = r7.k
            if (r8 <= 0) goto L75
            java.lang.Runnable r9 = r7.h
            int[] r0 = defpackage.ahj.a
            long r5 = (long) r8
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            java.lang.Runnable r8 = r7.h
            r8.run()
        L7a:
            r7.o = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aks.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
