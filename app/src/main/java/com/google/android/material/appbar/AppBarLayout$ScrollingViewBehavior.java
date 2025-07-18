package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.aam;
import defpackage.aap;
import defpackage.ahj;
import defpackage.ajc;
import defpackage.uxz;
import defpackage.uyc;
import defpackage.uyd;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppBarLayout$ScrollingViewBehavior extends uyc {
    public AppBarLayout$ScrollingViewBehavior() {
    }

    @Override // defpackage.uye, defpackage.aam
    public /* bridge */ /* synthetic */ boolean d(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.d(coordinatorLayout, view, i);
        return true;
    }

    @Override // defpackage.aam
    public final boolean f(View view) {
        return view instanceof uxz;
    }

    @Override // defpackage.aam
    public void g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        aam aamVar = ((aap) view2.getLayoutParams()).a;
        if (aamVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = ((AppBarLayout$BaseBehavior) aamVar).a;
            int iW = (bottom + this.c) - w(view2);
            int[] iArr = ahj.a;
            view.offsetTopAndBottom(iW);
        }
        if (view2 instanceof uxz) {
            throw null;
        }
    }

    @Override // defpackage.aam
    public final void h(CoordinatorLayout coordinatorLayout, View view) {
        if (view instanceof uxz) {
            ahj.n(coordinatorLayout, null);
        }
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ajc lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if (i4 != -1) {
            if (i4 != -2) {
                return false;
            }
            i4 = -2;
        }
        View viewT = t(coordinatorLayout.b(view));
        if (viewT == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (viewT.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.d() + lastWindowInsets.a();
        }
        int iS = size + s(viewT);
        int measuredHeight = viewT.getMeasuredHeight();
        if (y()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iS -= measuredHeight;
        }
        coordinatorLayout.m(view, i, i2, View.MeasureSpec.makeMeasureSpec(iS, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // defpackage.aam
    public final void n(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        if (t(coordinatorLayout.b(view)) != null) {
            Rect rect2 = new Rect(rect);
            rect2.offset(view.getLeft(), view.getTop());
            Rect rect3 = this.a;
            rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
            if (!rect3.contains(rect2)) {
                throw null;
            }
        }
    }

    @Override // defpackage.uyc
    public final int s(View view) {
        return ((uxz) view).getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uyc
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final uxz t(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = (View) list.get(i);
            if (view instanceof uxz) {
                return (uxz) view;
            }
        }
        return null;
    }

    @Override // defpackage.uyc
    public final void v(View view) {
        if (view instanceof uxz) {
            ((uxz) view).getTotalScrollRange();
            throw null;
        }
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uyd.b);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
