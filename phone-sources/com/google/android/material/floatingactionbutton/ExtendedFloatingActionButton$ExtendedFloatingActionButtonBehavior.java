package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.cqv;
import defpackage.cqx;
import defpackage.stk;
import defpackage.stu;
import defpackage.suc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T extends stk> extends cqv<T> {
    private Rect a;
    private final boolean b;
    private final boolean c;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }

    private static boolean F(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof cqx) {
            return ((cqx) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final boolean G(View view, stk stkVar) {
        return (this.b || this.c) && ((cqx) stkVar.getLayoutParams()).f == view.getId();
    }

    private final boolean H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, stk stkVar) {
        if (!G(appBarLayout, stkVar)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        Rect rect = this.a;
        suc.a(coordinatorLayout, appBarLayout, rect);
        if (rect.bottom <= appBarLayout.d()) {
            E(stkVar);
            return true;
        }
        D(stkVar);
        return true;
    }

    private final boolean I(View view, stk stkVar) {
        if (!G(view, stkVar)) {
            return false;
        }
        if (view.getTop() < (stkVar.getHeight() / 2) + ((cqx) stkVar.getLayoutParams()).topMargin) {
            E(stkVar);
            return true;
        }
        D(stkVar);
        return true;
    }

    protected final void D(stk stkVar) {
        int i = stk.H;
        stkVar.B(true != this.c ? 0 : 3);
    }

    protected final void E(stk stkVar) {
        int i = stk.H;
        stkVar.B(true == this.c ? 2 : 1);
    }

    @Override // defpackage.cqv
    public final void b(cqx cqxVar) {
        if (cqxVar.h == 0) {
            cqxVar.h = 80;
        }
    }

    @Override // defpackage.cqv
    public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        stk stkVar = (stk) view;
        List listA = coordinatorLayout.a(stkVar);
        int size = listA.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) listA.get(i2);
            if (!(view2 instanceof AppBarLayout)) {
                if (F(view2) && I(view2, stkVar)) {
                    break;
                }
            } else {
                if (H(coordinatorLayout, (AppBarLayout) view2, stkVar)) {
                    break;
                }
            }
        }
        coordinatorLayout.f(stkVar, i);
        return true;
    }

    @Override // defpackage.cqv
    public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2) {
        stk stkVar = (stk) view;
        if (view2 instanceof AppBarLayout) {
            H(coordinatorLayout, (AppBarLayout) view2, stkVar);
        } else if (F(view2)) {
            I(view2, stkVar);
        }
    }

    @Override // defpackage.cqv
    public final /* bridge */ /* synthetic */ boolean s(View view, Rect rect) {
        return false;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, stu.b);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
