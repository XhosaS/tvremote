package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.bhc;
import defpackage.bjb;
import defpackage.bjc;
import defpackage.mo;
import defpackage.mr;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior extends mo {
    private final boolean a;

    public FloatingActionButton$BaseBehavior() {
        this.a = true;
    }

    private static boolean a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof mr) {
            return ((mr) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final void b(View view, bjb bjbVar) {
        mr mrVar = (mr) bjbVar.getLayoutParams();
        if (this.a && mrVar.f == view.getId()) {
            throw null;
        }
    }

    @Override // defpackage.mo
    public final void c(mr mrVar) {
        if (mrVar.h == 0) {
            mrVar.h = 80;
        }
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        bjb bjbVar = (bjb) view;
        List listA = coordinatorLayout.a(bjbVar);
        int size = listA.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) listA.get(i2);
            if (view2 instanceof bhc) {
                b((bhc) view2, bjbVar);
            } else if (a(view2)) {
                b(view2, bjbVar);
            }
        }
        coordinatorLayout.i(bjbVar, i);
        Rect rect = bjbVar.a;
        throw null;
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        bjb bjbVar = (bjb) view;
        if (view2 instanceof bhc) {
            b((bhc) view2, bjbVar);
        } else if (a(view2)) {
            b(view2, bjbVar);
        }
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ void t(View view) {
        bjb bjbVar = (bjb) view;
        Rect rect = bjbVar.a;
        bjbVar.getLeft();
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bjc.b);
        this.a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
