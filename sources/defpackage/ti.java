package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ti implements View.OnTouchListener {
    private static final int g = ViewConfiguration.getTapTimeout();
    public final th a;
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ListView f;
    private final Interpolator h;
    private Runnable i;
    private final float[] j;
    private final float[] k;
    private final int l;
    private final float[] m;
    private final float[] n;
    private final float[] o;
    private boolean p;
    private boolean q;

    public ti(ListView listView) {
        th thVar = new th();
        this.a = thVar;
        this.h = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.m = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.n = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.o = fArr5;
        this.b = listView;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = displayMetrics.density * 1575.0f;
        float f2 = displayMetrics.density * 315.0f;
        float f3 = ((int) (f + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) (f2 + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.l = g;
        thVar.a = 500;
        thVar.b = 500;
        this.f = listView;
    }

    static float a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float d(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.j
            r0 = r0[r4]
            float r0 = r0 * r6
            float[] r1 = r3.k
            r1 = r1[r4]
            r2 = 0
            float r0 = a(r0, r2, r1)
            float r6 = r6 - r5
            float r5 = r3.e(r5, r0)
            float r6 = r3.e(r6, r0)
            float r6 = r6 - r5
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 >= 0) goto L25
            android.view.animation.Interpolator r5 = r3.h
            float r6 = -r6
            float r5 = r5.getInterpolation(r6)
            float r5 = -r5
            goto L2f
        L25:
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 <= 0) goto L38
            android.view.animation.Interpolator r5 = r3.h
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
            float[] r0 = r3.m
            r0 = r0[r4]
            float[] r1 = r3.n
            r1 = r1[r4]
            float[] r2 = r3.o
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti.d(int, float, float, float):float");
    }

    private final float e(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.e) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    private final void f() {
        int i = 0;
        if (this.c) {
            this.e = false;
            return;
        }
        th thVar = this.a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - thVar.e);
        int i3 = thVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        thVar.i = i;
        thVar.h = thVar.a(jCurrentAnimationTimeMillis);
        thVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean b() {
        ListView listView;
        int count;
        th thVar = this.a;
        float f = thVar.d;
        float fAbs = f / Math.abs(f);
        Math.abs(thVar.c);
        int i = (int) fAbs;
        if (i != 0 && (count = (listView = this.f).getCount()) != 0) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (i > 0) {
                if (i2 < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                    return true;
                }
            } else if (i < 0 && (firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0)) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean z) {
        if (this.q && !z) {
            f();
        }
        this.q = z;
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
            boolean r0 = r7.q
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.f()
            goto L7e
        L1b:
            r7.d = r2
            r7.p = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.b
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.d(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.d(r2, r9, r8, r3)
            th r9 = r7.a
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.e
            if (r8 != 0) goto L7e
            boolean r8 = r7.b()
            if (r8 == 0) goto L7e
            java.lang.Runnable r8 = r7.i
            if (r8 != 0) goto L62
            ki r8 = new ki
            r9 = 5
            r0 = 0
            r8.<init>(r7, r9, r0)
            r7.i = r8
        L62:
            r7.e = r2
            r7.c = r2
            boolean r8 = r7.p
            if (r8 != 0) goto L77
            int r8 = r7.l
            if (r8 <= 0) goto L77
            java.lang.Runnable r9 = r7.i
            int[] r0 = defpackage.qv.a
            long r5 = (long) r8
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            java.lang.Runnable r8 = r7.i
            r8.run()
        L7c:
            r7.p = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
