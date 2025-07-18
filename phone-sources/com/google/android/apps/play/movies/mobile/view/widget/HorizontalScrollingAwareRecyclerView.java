package com.google.android.apps.play.movies.mobile.view.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.muh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HorizontalScrollingAwareRecyclerView extends RecyclerView {
    private final muh a;

    public HorizontalScrollingAwareRecyclerView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            muh r0 = r8.a
            boolean r1 = r0.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto La
            goto L9b
        La:
            r0.d = r3
            r0.e = r3
            float r1 = r9.getX()
            float r4 = r9.getY()
            int r5 = r9.getAction()
            r6 = 2
            if (r5 == 0) goto L2e
            if (r5 == r6) goto L20
            goto L40
        L20:
            float r5 = r0.i
            float r7 = r0.g
            float r7 = r4 - r7
            float r7 = java.lang.Math.abs(r7)
            float r5 = r5 + r7
            r0.i = r5
            goto L40
        L2e:
            r5 = 0
            r0.h = r5
            r0.i = r5
            android.view.MotionEvent r5 = r0.k
            if (r5 == 0) goto L3a
            r5.recycle()
        L3a:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r9)
            r0.k = r5
        L40:
            android.support.v7.widget.RecyclerView r5 = r0.a
            boolean r7 = r5.isShown()
            if (r7 == 0) goto L9b
            r0.f = r1
            r0.g = r4
            float r1 = r0.i
            int r4 = r0.c
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L59
            r0.b(r9)
            goto La1
        L59:
            int r1 = r9.getAction()
            if (r1 != 0) goto L9b
            int r1 = r5.getScrollState()
            if (r1 != r6) goto L68
            r5.stopScroll()
        L68:
            int r1 = r5.getScrollState()
            if (r1 == r2) goto L9b
            android.view.MotionEvent r1 = r0.k
            if (r1 == 0) goto L73
            r9 = r1
        L73:
            float r1 = r9.getX()
            float r9 = r9.getY()
            r3 = r5
        L7c:
            android.view.ViewParent r4 = r5.getParent()
            if (r3 == r4) goto L8f
            int r4 = r3.getTop()
            float r4 = (float) r4
            float r9 = r9 - r4
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            goto L7c
        L8f:
            android.view.View r9 = r5.findChildViewUnder(r1, r9)
            if (r9 == 0) goto L98
            r0.j = r9
            goto La1
        L98:
            r0.j = r5
            goto La1
        L9b:
            boolean r9 = super.onInterceptTouchEvent(r9)
            if (r9 == 0) goto La2
        La1:
            return r2
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobile.view.widget.HorizontalScrollingAwareRecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getPointerCount()
            r1 = 1
            if (r0 <= r1) goto L8
            return r1
        L8:
            muh r0 = r8.a
            boolean r2 = r0.b
            if (r2 == 0) goto L10
            goto L80
        L10:
            android.view.View r2 = r0.j
            if (r2 == 0) goto L80
            float r2 = r9.getX()
            float r3 = r9.getY()
            r0.a(r9)
            int r4 = r9.getAction()
            r5 = 0
            if (r4 == r1) goto L79
            r6 = 2
            if (r4 == r6) goto L2d
            r9 = 3
            if (r4 == r9) goto L79
            goto L7b
        L2d:
            boolean r4 = r0.d
            if (r4 != 0) goto L7b
            boolean r4 = r0.e
            if (r4 != 0) goto L7b
            float r4 = r0.h
            float r6 = r0.f
            float r6 = r2 - r6
            float r6 = java.lang.Math.abs(r6)
            float r4 = r4 + r6
            r0.h = r4
            float r4 = r0.i
            float r6 = r0.g
            float r6 = r3 - r6
            float r6 = java.lang.Math.abs(r6)
            float r4 = r4 + r6
            r0.i = r4
            float r6 = r0.h
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 < 0) goto L6b
            int r9 = r0.c
            float r9 = (float) r9
            r4 = 1092616192(0x41200000, float:10.0)
            float r9 = r9 * r4
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L7b
            r0.d = r1
            android.view.MotionEvent r9 = r0.k
            if (r9 == 0) goto L7b
            r9.recycle()
            r0.k = r5
            goto L7b
        L6b:
            int r5 = r0.c
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L7b
            r0.b(r9)
            r0.a(r9)
            goto L7b
        L79:
            r0.j = r5
        L7b:
            r0.f = r2
            r0.g = r3
            goto L86
        L80:
            boolean r9 = super.onTouchEvent(r9)
            if (r9 == 0) goto L87
        L86:
            return r1
        L87:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobile.view.widget.HorizontalScrollingAwareRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public HorizontalScrollingAwareRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalScrollingAwareRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new muh(this, getContext());
    }
}
