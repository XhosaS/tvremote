package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import defpackage.aap;
import defpackage.ahj;
import defpackage.uxw;
import defpackage.uxx;
import defpackage.uxz;
import defpackage.uyb;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppBarLayout$BaseBehavior extends uyb {
    public int a;
    private int c;
    private SavedState d;
    private WeakReference e;

    public AppBarLayout$BaseBehavior() {
    }

    private final void y(CoordinatorLayout coordinatorLayout, uxz uxzVar) {
        if (ahj.a(coordinatorLayout) != null) {
            return;
        }
        ahj.n(coordinatorLayout, new uxw(uxzVar, coordinatorLayout));
    }

    @Override // defpackage.uye, defpackage.aam
    public final /* synthetic */ boolean d(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.d(coordinatorLayout, (uxz) view, i);
        throw null;
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        uxz uxzVar = (uxz) view;
        if (((aap) uxzVar.getLayoutParams()).height != -2) {
            return false;
        }
        coordinatorLayout.m(uxzVar, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
        return true;
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ void l(View view, View view2, int i, int[] iArr, int i2) {
        uxz uxzVar = (uxz) view;
        if (i == 0 || i >= 0) {
            throw null;
        }
        uxzVar.getTotalScrollRange();
        throw null;
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ void m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        uxz uxzVar = (uxz) view;
        if (i3 < 0) {
            throw null;
        }
        if (i3 == 0) {
            y(coordinatorLayout, uxzVar);
        }
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ void o(View view, Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            this.d = null;
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.d = savedState;
        Parcelable parcelable2 = savedState.d;
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ Parcelable p(View view) {
        uxz uxzVar = (uxz) view;
        Parcelable parcelable = View.BaseSavedState.EMPTY_STATE;
        int childCount = uxzVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = uxzVar.getChildAt(i);
            int bottom = childAt.getBottom();
            if (childAt.getTop() <= 0 && bottom >= 0) {
                if (parcelable == null) {
                    parcelable = AbsSavedState.c;
                }
                SavedState savedState = new SavedState(parcelable);
                savedState.b = true;
                savedState.a = false;
                savedState.e = i;
                childAt.getMinimumHeight();
                throw null;
            }
        }
        return parcelable;
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ boolean q(View view, int i, int i2) {
        if ((i & 2) != 0) {
            throw null;
        }
        this.e = null;
        this.c = i2;
        return false;
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ void r(View view, View view2, int i) {
        if (this.c == 0 || i == 1) {
            throw null;
        }
        this.e = new WeakReference(view2);
    }

    @Override // defpackage.uyb
    public final /* synthetic */ int s(View view) {
        return ((uxz) view).getTotalScrollRange();
    }

    @Override // defpackage.uyb
    public final /* bridge */ /* synthetic */ boolean t(View view) {
        WeakReference weakReference = this.e;
        if (weakReference == null) {
            return true;
        }
        View view2 = (View) weakReference.get();
        return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
    }

    @Override // defpackage.uyb
    public final /* synthetic */ void u(View view) {
        throw null;
    }

    @Override // defpackage.uyb
    public final /* synthetic */ void v(CoordinatorLayout coordinatorLayout, View view, int i, int i2) {
        uxz uxzVar = (uxz) view;
        if (i > i2) {
            i = i2;
        }
        if (i != 0) {
            throw null;
        }
        y(coordinatorLayout, uxzVar);
    }

    @Override // defpackage.uyb
    public final /* bridge */ /* synthetic */ void w(View view) {
        throw null;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new uxx();
        boolean a;
        boolean b;
        int e;
        float f;
        boolean g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readByte() != 0;
            this.b = parcel.readByte() != 0;
            this.e = parcel.readInt();
            this.f = parcel.readFloat();
            this.g = parcel.readByte() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.e);
            parcel.writeFloat(this.f);
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // defpackage.uyb
    public final void x() {
    }
}
