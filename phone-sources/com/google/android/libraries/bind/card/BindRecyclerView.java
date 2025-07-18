package com.google.android.libraries.bind.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import defpackage.ctq;
import defpackage.orf;
import defpackage.orl;
import defpackage.orm;
import defpackage.oro;
import defpackage.orp;
import defpackage.orq;
import defpackage.orv;
import defpackage.ory;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BindRecyclerView extends RecyclerView {
    public static final ory a = ory.a(BindRecyclerView.class);
    public oro b;
    private orp c;
    private boolean d;
    private final boolean e;
    private final RecyclerView.AdapterDataObserver f;
    private float g;
    private float h;
    private final int i;

    public BindRecyclerView(Context context) {
        this(context, null);
    }

    @Override // android.support.v7.widget.RecyclerView
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final orv getAdapter() {
        return (orv) super.getAdapter();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getParent() != null) {
            a.b("Attempt to add child: %s with parent: %s to RecyclerView.", view, view.getParent());
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(oro oroVar) {
        getAdapter();
        this.b = oroVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.d) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnScrollListener(this.c);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAdapter(null);
        clearOnScrollListeners();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            if (motionEvent.getActionMasked() == 0) {
                this.g = motionEvent.getX();
                this.h = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 2) {
                float fAbs = Math.abs(motionEvent.getY() - this.h);
                float x = motionEvent.getX() - this.g;
                int i = this.i;
                float fAbs2 = Math.abs(x);
                if (fAbs2 > i && fAbs2 > fAbs) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        String strValueOf = String.valueOf(getClass().getSimpleName());
        int i5 = ctq.a;
        Trace.beginSection(strValueOf.concat(" onLayout"));
        super.onLayout(z, i, i2, i3, i4);
        Trace.endSection();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof oro)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        oro oroVar = (oro) parcelable;
        super.onRestoreInstanceState(oroVar.b);
        b(oroVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r6 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            oro r1 = r6.b
            if (r1 == 0) goto L9
            goto L38
        L9:
            android.support.v7.widget.RecyclerView$LayoutManager r1 = r6.getLayoutManager()
            r2 = 0
            if (r1 != 0) goto L12
        L10:
            r4 = r2
            goto L2f
        L12:
            android.support.v7.widget.RecyclerView$LayoutManager r1 = r6.getLayoutManager()
            int r1 = r1.getChildCount()
            r3 = 0
        L1b:
            if (r3 == r1) goto L10
            android.support.v7.widget.RecyclerView$LayoutManager r4 = r6.getLayoutManager()
            android.view.View r4 = r4.getChildAt(r3)
            int r5 = r4.getTop()
            if (r5 < 0) goto L2c
            goto L2f
        L2c:
            int r3 = r3 + 1
            goto L1b
        L2f:
            if (r4 == 0) goto L37
            r6.getChildAdapterPosition(r4)
            r6.getAdapter()
        L37:
            r1 = r2
        L38:
            if (r1 != 0) goto L3b
            return r0
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.bind.card.BindRecyclerView.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void setAdapter(RecyclerView.Adapter adapter) {
        if (adapter != null && !(adapter instanceof orv)) {
            throw new IllegalArgumentException(String.format(Locale.US, "Adapter must be a RecyclerViewAdapter, got %s instead", adapter.getClass().getSimpleName()));
        }
        orv adapter2 = getAdapter();
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.f);
        }
        super.setAdapter(adapter);
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void smoothScrollToPosition(int i) {
        if (i == 0) {
            a.c("Smooth scroll to 0 position with 0 offset %d", new Object[0]);
            i = 0;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null) {
            orm ormVar = new orm(getContext(), layoutManager);
            ormVar.setTargetPosition(i);
            layoutManager.startSmoothScroll(ormVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void swapAdapter(RecyclerView.Adapter adapter, boolean z) {
        if (adapter != null && !(adapter instanceof orv)) {
            throw new IllegalArgumentException(String.format(Locale.US, "Adapter must be a RecyclerViewAdapter, got %s instead", adapter.getClass().getSimpleName()));
        }
        orv adapter2 = getAdapter();
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.f);
        }
        super.swapAdapter(adapter, z);
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f);
        }
    }

    public BindRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BindRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new orp();
        this.d = true;
        this.f = new orl(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, orf.a);
        setNestedScrollingEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.e = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        this.i = ViewConfiguration.get(context).getScaledTouchSlop();
        if (isInEditMode()) {
            return;
        }
        addItemDecoration(new orq());
    }
}
