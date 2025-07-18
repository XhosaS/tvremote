package com.google.android.apps.play.movies.mobileux.view.widget;

import android.content.Context;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.cww;
import defpackage.nbq;
import defpackage.nbr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LeadingEdgeSnapRecyclerView extends RecyclerView {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public boolean e;
    private final int f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private final RecyclerView.OnScrollListener l;

    public LeadingEdgeSnapRecyclerView(Context context) {
        this(context, null);
    }

    private final void d(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.j = (int) motionEvent.getX();
        } else {
            if (action != 1) {
                return;
            }
            this.k = Math.abs(((int) motionEvent.getX()) - this.j);
        }
    }

    private static final int e(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return view.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public final void a(boolean z) {
        int[] iArr = cww.a;
        int layoutDirection = getLayoutDirection();
        int width = getWidth();
        int childCount = getChildCount();
        int i = this.d;
        this.g = -1;
        this.c = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.h = false;
        if (z) {
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) getLayoutManager()).findLastVisibleItemPosition() - ((getAdapter().getItemCount() - 1) - this.i);
            if (iFindLastVisibleItemPosition > 0) {
                int iE = e(getChildAt(0));
                int iE2 = e(getChildAt((childCount - this.i) - 1));
                int iMax = (Math.max(0, ((getWidth() - iE2) - this.d) / iE) * iE) + iE2;
                int iE3 = 0;
                for (int i2 = 0; i2 < iFindLastVisibleItemPosition; i2++) {
                    iE3 += e(getChildAt((childCount - 1) - i2));
                }
                i = (width - iE3) - iMax;
                this.h = true;
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getWidth() != 0) {
                int left = layoutDirection == 0 ? childAt.getLeft() - i : (childAt.getRight() + i) - width;
                if (Math.abs(left) < Math.abs(this.c)) {
                    this.c = left;
                    this.g = i3;
                }
            }
        }
    }

    public final void b(int i) {
        if (this.d != i) {
            this.d = i;
        }
    }

    public final void c() {
        this.i = 0;
    }

    @Override // android.support.v7.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        if (Math.abs(i) < this.f || getChildCount() <= 0) {
            return super.fling(i, i2);
        }
        int[] iArr = cww.a;
        int i3 = getLayoutDirection() == 0 ? 1 : -1;
        int i4 = i * i3;
        int i5 = 0;
        a(i4 > 0);
        if (this.g != -1) {
            if (this.h) {
                i5 = i3 * this.c;
            } else {
                int i6 = this.c * i3;
                int i7 = i4 >= 0 ? 1 : -1;
                int width = getWidth();
                int iE = e(getChildAt(this.g));
                int iMax = Math.max(1, (getWidth() - this.d) / iE);
                int iMin = ((Math.min((i4 / 5) * i7, ((iMax > 1 ? 2 : 1) * width) - this.k) * i7) - i6) / iE;
                if (iMin != 0) {
                    i7 = iMin;
                } else if (i7 * i6 >= 0) {
                    i7 = 0;
                }
                RecyclerView.LayoutManager layoutManager = getLayoutManager();
                int position = layoutManager.getPosition(getChildAt(this.g)) + i7;
                if (position < 0) {
                    i7 += -position;
                } else {
                    int itemCount = (layoutManager.getItemCount() - this.i) - iMax;
                    if (position > itemCount) {
                        i7 -= position - itemCount;
                        if (!this.h) {
                            int i8 = this.d;
                            i5 = i8 - ((width - i8) - (iMax * iE));
                        }
                    }
                }
                i5 = i3 * (i6 + (i7 * iE) + i5);
            }
        }
        ((LinearLayoutManager) getLayoutManager()).startSmoothScroll(new nbr(this, i5));
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void scrollToPosition(int i) {
        if (i < 0) {
            return;
        }
        this.a = i;
        ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(i, this.d);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new IllegalArgumentException("Only LinearLayoutManager is supported");
        }
        if (((LinearLayoutManager) layoutManager).getOrientation() != 0) {
            throw new IllegalArgumentException("Only horizontal LinearLayoutManager is supported");
        }
        super.setLayoutManager(layoutManager);
    }

    public LeadingEdgeSnapRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.i = 1;
        this.e = true;
        nbq nbqVar = new nbq(this);
        this.l = nbqVar;
        this.f = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        addOnScrollListener(nbqVar);
        setImportantForAccessibility(2);
    }
}
