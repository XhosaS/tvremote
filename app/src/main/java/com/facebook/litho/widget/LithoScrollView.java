package com.facebook.litho.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.facebook.litho.ComponentTree;
import defpackage.dtf;
import defpackage.duj;
import defpackage.dvp;
import defpackage.dvz;
import defpackage.eev;
import defpackage.efs;
import defpackage.ehe;
import defpackage.elo;
import defpackage.elp;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LithoScrollView extends NestedScrollView implements duj {
    public final dvz i;
    public ehe j;
    public ViewTreeObserver.OnPreDrawListener k;
    public dtf l;
    public boolean m;
    public efs n;

    public LithoScrollView(Context context) {
        this(context, null);
    }

    @Override // defpackage.duj
    public final void a(List list) {
        list.add(this.i);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.e.c(f, f2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dtf dtfVar = this.l;
        if (dtfVar != null) {
            dtfVar.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        try {
            super.draw(canvas);
            efs efsVar = this.n;
            if (efsVar != null) {
                efsVar.a(this);
            }
        } catch (Throwable th) {
            dvz dvzVar = this.i;
            ComponentTree componentTree = dvzVar.getComponentTree();
            if (componentTree == null) {
                throw th;
            }
            elp elpVarA = elo.a();
            String strValueOf = String.valueOf(componentTree.g());
            elpVarA.a(2, "Root component: ".concat(strValueOf), th, eev.a(dvzVar.getComponentContext()));
            throw new dvp(null, componentTree, th);
        }
    }

    @Override // defpackage.duh
    public dtf getDispatchTouchListener() {
        return this.l;
    }

    @Override // defpackage.duh
    public final void i(dtf dtfVar) {
        this.l = dtfVar;
    }

    @Override // androidx.core.widget.NestedScrollView
    public final void j(int i) {
        super.j(i);
        efs efsVar = this.n;
        if (efsVar != null) {
            efsVar.b = true;
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.m) {
            this.i.s();
        }
        ehe eheVar = this.j;
        if (eheVar != null) {
            eheVar.a = getScrollY();
        }
        efs efsVar = this.n;
        if (efsVar != null) {
            efsVar.b(this);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        efs efsVar = this.n;
        if (efsVar != null) {
            efsVar.c(this, motionEvent);
        }
        return zOnTouchEvent;
    }

    public LithoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LithoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dvz dvzVar = new dvz(context);
        this.i = dvzVar;
        addView(dvzVar);
    }
}
