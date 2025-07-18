package defpackage;

import android.animation.ObjectAnimator;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mud {
    public static final LinearInterpolator a = new LinearInterpolator();
    public final VelocityTracker b = VelocityTracker.obtain();
    public final float c;
    public float d;
    public boolean e;
    public View f;
    public boolean g;
    public final msh h;
    private final float i;

    public mud(msh mshVar, float f, float f2) {
        this.h = mshVar;
        this.c = f;
        this.i = f2;
    }

    public final float a(View view) {
        float fB = b(view);
        float f = 0.65f * fB;
        float f2 = 0.15f * fB;
        float translationX = view.getTranslationX();
        return Math.max(0.0f, Math.max(Math.min(translationX >= f2 ? 1.0f - ((translationX - f2) / f) : translationX < fB * 0.85f ? ((f2 + translationX) / f) + 1.0f : 1.0f, 1.0f), 0.0f));
    }

    public final float b(View view) {
        return view.getWidth();
    }

    public final ObjectAnimator c(View view, float f) {
        return ObjectAnimator.ofFloat(view, "translationX", f);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getAction()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L5a
            r3 = 1
            if (r0 == r3) goto L55
            r4 = 2
            if (r0 == r4) goto L13
            r8 = 3
            if (r0 == r8) goto L55
            goto La5
        L13:
            android.view.View r0 = r7.f
            if (r0 == 0) goto La5
            android.view.VelocityTracker r0 = r7.b
            r0.addMovement(r8)
            float r0 = r8.getRawX()
            float r2 = r7.d
            float r0 = r0 - r2
            float r2 = r7.i
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto La5
            msh r0 = r7.h
            java.lang.Object r0 = r0.b
            com.google.android.apps.play.movies.mobile.usecase.watch.bingewatch.BingeWatchCard r0 = (com.google.android.apps.play.movies.mobile.usecase.watch.bingewatch.BingeWatchCard) r0
            android.view.ViewParent r2 = r0.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.requestDisallowInterceptTouchEvent(r3)
            boolean r4 = r0.c
            if (r4 == 0) goto L43
            r2.setWillNotDraw(r1)
        L43:
            r0.f = r3
            r7.e = r3
            float r8 = r8.getRawX()
            android.view.View r0 = r7.f
            float r0 = r0.getTranslationX()
            float r8 = r8 - r0
            r7.d = r8
            goto La5
        L55:
            r7.e = r1
            r7.f = r2
            goto La5
        L5a:
            r7.e = r1
            msh r0 = r7.h
            java.lang.Object r1 = r0.b
            com.google.android.apps.play.movies.mobile.usecase.watch.bingewatch.BingeWatchCard r1 = (com.google.android.apps.play.movies.mobile.usecase.watch.bingewatch.BingeWatchCard) r1
            boolean r3 = r1.f
            if (r3 != 0) goto L8b
            int r3 = r1.getVisibility()
            if (r3 != 0) goto L8b
            android.view.View r3 = r1.a
            java.lang.Object r4 = r0.a
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r3.getHitRect(r4)
            float r3 = r8.getX()
            r5 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r5
            float r6 = r8.getY()
            float r6 = r6 + r5
            int r3 = (int) r3
            int r5 = (int) r6
            boolean r3 = r4.contains(r3, r5)
            if (r3 == 0) goto L8b
            android.view.View r2 = r1.a
        L8b:
            r7.f = r2
            android.view.VelocityTracker r1 = r7.b
            r1.clear()
            android.view.View r2 = r7.f
            if (r2 == 0) goto La5
            boolean r0 = r0.a(r2)
            r7.g = r0
            r1.addMovement(r8)
            float r8 = r8.getRawX()
            r7.d = r8
        La5:
            boolean r8 = r7.e
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mud.d(android.view.MotionEvent):boolean");
    }
}
