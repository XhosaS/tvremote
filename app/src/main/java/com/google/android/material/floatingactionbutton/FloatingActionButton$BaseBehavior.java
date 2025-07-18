package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.aam;
import defpackage.aap;
import defpackage.uxz;
import defpackage.vae;
import defpackage.vaf;
import defpackage.vai;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FloatingActionButton$BaseBehavior extends aam {
    private Rect a;
    private final boolean b;

    public FloatingActionButton$BaseBehavior() {
        this.b = true;
    }

    private final boolean t(View view, vae vaeVar) {
        return (this.b && ((aap) vaeVar.getLayoutParams()).f == view.getId() && vaeVar.getUserSetVisibility() == 0) ? false : true;
    }

    private static boolean u(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof aap) {
            return ((aap) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final void v(CoordinatorLayout coordinatorLayout, uxz uxzVar, vae vaeVar) {
        if (t(uxzVar, vaeVar)) {
            return;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        Rect rect = this.a;
        vai.a(coordinatorLayout, uxzVar, rect);
        if (rect.bottom > uxzVar.getMinimumHeightForVisibleOverlappingContent()) {
            throw null;
        }
        throw null;
    }

    private final void w(View view, vae vaeVar) {
        if (t(view, vaeVar)) {
            return;
        }
        if (view.getTop() >= (vaeVar.getHeight() / 2) + ((aap) vaeVar.getLayoutParams()).topMargin) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.aam
    public final void a(aap aapVar) {
        if (aapVar.h == 0) {
            aapVar.h = 80;
        }
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ boolean d(CoordinatorLayout coordinatorLayout, View view, int i) throws Throwable {
        vae vaeVar = (vae) view;
        List listB = coordinatorLayout.b(vaeVar);
        int size = listB.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) listB.get(i2);
            if (view2 instanceof uxz) {
                v(coordinatorLayout, (uxz) view2, vaeVar);
            } else if (u(view2)) {
                w(view2, vaeVar);
            }
        }
        coordinatorLayout.j(vaeVar, i);
        Rect rect = vaeVar.a;
        throw null;
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ void g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        vae vaeVar = (vae) view;
        if (view2 instanceof uxz) {
            v(coordinatorLayout, (uxz) view2, vaeVar);
        } else if (u(view2)) {
            w(view2, vaeVar);
        }
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ boolean k(View view) {
        s((vae) view);
        return true;
    }

    public void s(vae vaeVar) {
        Rect rect = vaeVar.a;
        vaeVar.getLeft();
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vaf.b);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
