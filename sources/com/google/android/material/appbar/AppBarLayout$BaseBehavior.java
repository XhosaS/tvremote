package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.bha;
import defpackage.bhb;
import defpackage.bhc;
import defpackage.bhe;
import defpackage.mo;
import defpackage.mr;
import defpackage.qv;
import defpackage.tr;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior extends bhe {
    public int a;
    private int c;
    private bhb d;
    private WeakReference e;

    public AppBarLayout$BaseBehavior() {
    }

    private static final void aa(CoordinatorLayout coordinatorLayout) {
        if (qv.a(coordinatorLayout) != null) {
            return;
        }
        qv.l(coordinatorLayout, new bha());
    }

    @Override // defpackage.bhe
    public final /* synthetic */ void W(View view) {
        throw null;
    }

    @Override // defpackage.bhe
    public final /* synthetic */ void X(CoordinatorLayout coordinatorLayout, View view, int i, int i2) {
        if (mo.E(i, Integer.MIN_VALUE, i2) != 0) {
            throw null;
        }
        aa(coordinatorLayout);
    }

    @Override // defpackage.bhe
    public final /* bridge */ /* synthetic */ void Y(View view) {
        throw null;
    }

    @Override // defpackage.bhe
    public final /* synthetic */ int a(View view) {
        throw null;
    }

    @Override // defpackage.bhe
    public final /* bridge */ /* synthetic */ boolean b(View view) {
        WeakReference weakReference = this.e;
        if (weakReference == null) {
            return true;
        }
        View view2 = (View) weakReference.get();
        return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
    }

    @Override // defpackage.bhh, defpackage.mo
    public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.f(coordinatorLayout, (bhc) view, i);
        throw null;
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        bhc bhcVar = (bhc) view;
        if (((mr) bhcVar.getLayoutParams()).height != -2) {
            return false;
        }
        coordinatorLayout.l(bhcVar, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
        return true;
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ void m(View view, View view2, int i, int[] iArr, int i2) {
        if (i != 0 && i >= 0) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ void n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i3 < 0) {
            throw null;
        }
        if (i3 == 0) {
            aa(coordinatorLayout);
        }
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ void p(View view, Parcelable parcelable) {
        if (!(parcelable instanceof bhb)) {
            this.d = null;
            return;
        }
        bhb bhbVar = (bhb) parcelable;
        this.d = bhbVar;
        Parcelable parcelable2 = bhbVar.d;
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ Parcelable q(View view) {
        bhc bhcVar = (bhc) view;
        Parcelable parcelable = View.BaseSavedState.EMPTY_STATE;
        int childCount = bhcVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = bhcVar.getChildAt(i);
            int bottom = childAt.getBottom();
            if (childAt.getTop() <= 0 && bottom >= 0) {
                if (parcelable == null) {
                    parcelable = tr.c;
                }
                bhb bhbVar = new bhb(parcelable);
                bhbVar.b = true;
                bhbVar.a = false;
                bhbVar.e = i;
                childAt.getMinimumHeight();
                throw null;
            }
        }
        return parcelable;
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ boolean r(View view, int i, int i2) {
        if ((i & 2) != 0) {
            throw null;
        }
        this.e = null;
        this.c = i2;
        return false;
    }

    @Override // defpackage.mo
    public final /* bridge */ /* synthetic */ void s(View view, View view2, int i) {
        if (this.c == 0 || i == 1) {
            throw null;
        }
        this.e = new WeakReference(view2);
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.bhe
    public final void Z() {
    }
}
