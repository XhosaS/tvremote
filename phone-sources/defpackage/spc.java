package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spc extends dar {
    final /* synthetic */ SwipeDismissBehavior a;
    private int b;
    private int c = -1;

    public spc(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.dar
    public final int a(View view) {
        return view.getWidth();
    }

    @Override // defpackage.dar
    public final void b(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.a;
            swipeDismissBehavior.b = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.b = false;
        }
    }

    @Override // defpackage.dar
    public final void c(int i) {
        zft zftVar = this.a.f;
        if (zftVar != null) {
            if (i != 0) {
                tbe.a().e(((taz) zftVar.a).v);
            } else {
                tbe.a().f(((taz) zftVar.a).v);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    @Override // defpackage.dar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            r9 = -1
            r6.c = r9
            r9 = 0
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            int r1 = r7.getWidth()
            r2 = 1
            if (r0 == 0) goto L2f
            int r3 = r7.getLayoutDirection()
            com.google.android.material.behavior.SwipeDismissBehavior r4 = r6.a
            int r4 = r4.c
            r5 = 2
            if (r4 != r5) goto L19
            goto L48
        L19:
            if (r4 != 0) goto L25
            if (r3 != r2) goto L22
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 < 0) goto L48
            goto L5c
        L22:
            if (r0 <= 0) goto L5c
            goto L48
        L25:
            if (r3 != r2) goto L2a
            if (r0 <= 0) goto L5c
            goto L48
        L2a:
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 >= 0) goto L5c
            goto L48
        L2f:
            int r0 = r7.getLeft()
            int r3 = r6.b
            int r0 = r0 - r3
            int r3 = r7.getWidth()
            float r3 = (float) r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            int r0 = java.lang.Math.abs(r0)
            if (r0 < r3) goto L5c
        L48:
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L57
            int r8 = r7.getLeft()
            int r9 = r6.b
            if (r8 >= r9) goto L55
            goto L57
        L55:
            int r9 = r9 + r1
            goto L5f
        L57:
            int r8 = r6.b
            int r9 = r8 - r1
            goto L5f
        L5c:
            int r9 = r6.b
            r2 = 0
        L5f:
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r6.a
            das r0 = r8.a
            int r1 = r7.getTop()
            boolean r9 = r0.i(r9, r1)
            if (r9 == 0) goto L76
            spd r9 = new spd
            r9.<init>(r8, r7, r2)
            r7.postOnAnimation(r9)
            return
        L76:
            if (r2 == 0) goto L7f
            zft r8 = r8.f
            if (r8 == 0) goto L7f
            r8.k(r7)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spc.d(android.view.View, float, float):void");
    }

    @Override // defpackage.dar
    public final boolean e(View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.a.D(view);
    }

    @Override // defpackage.dar
    public final int f(View view, int i) {
        int width;
        int width2;
        int width3;
        int layoutDirection = view.getLayoutDirection();
        int i2 = this.a.c;
        if (i2 == 0) {
            if (layoutDirection == 1) {
                width = this.b - view.getWidth();
                width2 = this.b;
            } else {
                width = this.b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.b - view.getWidth();
            width2 = view.getWidth() + this.b;
        } else if (layoutDirection == 1) {
            width = this.b;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.b - view.getWidth();
            width2 = this.b;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.dar
    public final int g(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.dar
    public final void i(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        float f = width * swipeDismissBehavior.d;
        float width2 = view.getWidth() * swipeDismissBehavior.e;
        float fAbs = Math.abs(i - this.b);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.E(1.0f - ((fAbs - f) / (width2 - f))));
        }
    }
}
