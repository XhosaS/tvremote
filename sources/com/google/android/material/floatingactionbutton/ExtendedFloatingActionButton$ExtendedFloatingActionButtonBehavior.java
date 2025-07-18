package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.bhc;
import defpackage.bja;
import defpackage.bjc;
import defpackage.bjf;
import defpackage.mo;
import defpackage.mr;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends mo {
    private Rect a;
    private final boolean b;
    private final boolean c;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }

    private final void W(CoordinatorLayout coordinatorLayout, bhc bhcVar, bja bjaVar) {
        if (b(bhcVar, bjaVar)) {
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            ThreadLocal threadLocal = bjf.a;
            rect.set(0, 0, bhcVar.getWidth(), bhcVar.getHeight());
            ThreadLocal threadLocal2 = bjf.a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            bjf.a(coordinatorLayout, bhcVar, matrix);
            ThreadLocal threadLocal3 = bjf.b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            int i = rect.bottom;
            throw null;
        }
    }

    private final void X(View view, bja bjaVar) {
        if (b(view, bjaVar)) {
            if (view.getTop() >= (bjaVar.getHeight() / 2) + ((mr) bjaVar.getLayoutParams()).topMargin) {
                throw null;
            }
            throw null;
        }
    }

    private static boolean a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof mr) {
            return ((mr) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final boolean b(View view, bja bjaVar) {
        return (this.b || this.c) && ((mr) bjaVar.getLayoutParams()).f == view.getId();
    }

    @Override // defpackage.mo
    public final void c(mr mrVar) {
        if (mrVar.h == 0) {
            mrVar.h = 80;
        }
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        bja bjaVar = (bja) view;
        List listA = coordinatorLayout.a(bjaVar);
        int size = listA.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) listA.get(i2);
            if (view2 instanceof bhc) {
                W(coordinatorLayout, (bhc) view2, bjaVar);
            } else if (a(view2)) {
                X(view2, bjaVar);
            }
        }
        coordinatorLayout.i(bjaVar, i);
        return true;
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        bja bjaVar = (bja) view;
        if (view2 instanceof bhc) {
            W(coordinatorLayout, (bhc) view2, bjaVar);
        } else if (a(view2)) {
            X(view2, bjaVar);
        }
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ void t(View view) {
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bjc.a);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
