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
import defpackage.vad;
import defpackage.vaf;
import defpackage.vai;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends aam {
    private Rect a;
    private final boolean b;
    private final boolean c;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }

    private static boolean s(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof aap) {
            return ((aap) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final boolean t(View view, vad vadVar) {
        return (this.b || this.c) && ((aap) vadVar.getLayoutParams()).f == view.getId();
    }

    private final void u(CoordinatorLayout coordinatorLayout, uxz uxzVar, vad vadVar) {
        if (t(uxzVar, vadVar)) {
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            vai.a(coordinatorLayout, uxzVar, rect);
            if (rect.bottom <= uxzVar.getMinimumHeightForVisibleOverlappingContent()) {
                int i = vad.g;
                throw null;
            }
            int i2 = vad.g;
            throw null;
        }
    }

    private final void v(View view, vad vadVar) {
        if (t(view, vadVar)) {
            if (view.getTop() >= (vadVar.getHeight() / 2) + ((aap) vadVar.getLayoutParams()).topMargin) {
                throw null;
            }
            throw null;
        }
    }

    @Override // defpackage.aam
    public final void a(aap aapVar) {
        if (aapVar.h == 0) {
            aapVar.h = 80;
        }
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ boolean d(CoordinatorLayout coordinatorLayout, View view, int i) throws Throwable {
        vad vadVar = (vad) view;
        List listB = coordinatorLayout.b(vadVar);
        int size = listB.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) listB.get(i2);
            if (view2 instanceof uxz) {
                u(coordinatorLayout, (uxz) view2, vadVar);
            } else if (s(view2)) {
                v(view2, vadVar);
            }
        }
        coordinatorLayout.j(vadVar, i);
        return true;
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ void g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        vad vadVar = (vad) view;
        if (view2 instanceof uxz) {
            u(coordinatorLayout, (uxz) view2, vadVar);
        } else if (s(view2)) {
            v(view2, vadVar);
        }
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ boolean k(View view) {
        return false;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vaf.a);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
