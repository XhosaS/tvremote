package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.bhc;
import defpackage.bhf;
import defpackage.bhg;
import defpackage.mo;
import defpackage.mr;
import defpackage.qv;
import defpackage.sf;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends bhf {
    public AppBarLayout$ScrollingViewBehavior() {
    }

    static final bhc b(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = (View) list.get(i);
            if (view instanceof bhc) {
                return (bhc) view;
            }
        }
        return null;
    }

    @Override // defpackage.bhf
    public final int W() {
        throw null;
    }

    @Override // defpackage.bhf
    public final void X(View view) {
        if (view instanceof bhc) {
            throw null;
        }
    }

    @Override // defpackage.bhf
    public final /* bridge */ /* synthetic */ View a(List list) {
        return b(list);
    }

    @Override // defpackage.bhh, defpackage.mo
    public /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.f(coordinatorLayout, view, i);
        return true;
    }

    @Override // defpackage.mo
    public final boolean h(View view) {
        return view instanceof bhc;
    }

    @Override // defpackage.mo
    public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        mo moVar = ((mr) view2.getLayoutParams()).a;
        if (moVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = ((AppBarLayout$BaseBehavior) moVar).a;
            int iY = (bottom + this.c) - Y(view2);
            int[] iArr = qv.a;
            view.offsetTopAndBottom(iY);
        }
        if (view2 instanceof bhc) {
            throw null;
        }
    }

    @Override // defpackage.mo
    public final void j(CoordinatorLayout coordinatorLayout, View view) {
        if (view instanceof bhc) {
            qv.l(coordinatorLayout, null);
        }
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        sf sfVar;
        int i4 = view.getLayoutParams().height;
        if (i4 != -1) {
            if (i4 != -2) {
                return false;
            }
            i4 = -2;
        }
        View viewA = a(coordinatorLayout.a(view));
        if (viewA == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (viewA.getFitsSystemWindows() && (sfVar = coordinatorLayout.e) != null) {
            size += sfVar.d() + sfVar.a();
        }
        int iW = size + W();
        int measuredHeight = viewA.getMeasuredHeight();
        if (aa()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iW -= measuredHeight;
        }
        coordinatorLayout.l(view, i, i2, View.MeasureSpec.makeMeasureSpec(iW, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // defpackage.mo
    public final void o(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        if (b(coordinatorLayout.a(view)) != null) {
            Rect rect2 = new Rect(rect);
            rect2.offset(view.getLeft(), view.getTop());
            Rect rect3 = this.a;
            rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
            if (!rect3.contains(rect2)) {
                throw null;
            }
        }
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bhg.b);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
