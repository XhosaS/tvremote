package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import com.google.android.play.layout.ForegroundRelativeLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class muf extends ForegroundRelativeLayout implements lio {
    private final int a;
    private lio b;
    private liq c;
    public float e;
    public ImageView f;

    public muf(Context context) {
        this(context, null, 0);
    }

    @Override // defpackage.lio
    public final int a() {
        liq liqVar = this.c;
        int iHashCode = liqVar != null ? liqVar.hashCode() : 0;
        lio lioVar = this.b;
        return (iHashCode * 31) + (lioVar != null ? lioVar.a() : 0);
    }

    @Override // defpackage.lio
    public final lio b() {
        return this.b;
    }

    @Override // defpackage.lio
    public final liq c() {
        return this.c;
    }

    @Override // defpackage.lio
    public final void d(liq liqVar) {
        if (nqq.e(this, liqVar) || !liqVar.b.isEmpty()) {
            lio lioVar = this.b;
            liq liqVar2 = this.c;
            liqVar2.getClass();
            lioVar.d(liqVar2);
        }
    }

    @Override // defpackage.lio
    public final boolean e(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        muf mufVar = (muf) obj;
        liq liqVar = this.c;
        if (liqVar == null ? mufVar.c != null : !liqVar.equals(mufVar.c)) {
            return false;
        }
        lio lioVar = this.b;
        return lioVar != null ? lioVar.e(mufVar.b) : mufVar.b == null;
    }

    public final void k(lio lioVar, liq liqVar) {
        this.b = lioVar;
        this.c = liqVar;
        if (lioVar != null) {
            lioVar.d(liqVar);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f = (ImageView) findViewById(R.id.thumbnail_frame);
        cww.y(this);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f != null) {
            int i3 = this.a;
            if (i3 == 1) {
                int size = View.MeasureSpec.getSize(i) - (getPaddingLeft() + getPaddingRight());
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
                int i4 = (size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
                marginLayoutParams.width = i4;
                marginLayoutParams.height = (int) (i4 / this.e);
            } else if (i3 == 2) {
                int size2 = View.MeasureSpec.getSize(i2) - (getPaddingTop() + getPaddingBottom());
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
                int i5 = (size2 - marginLayoutParams2.topMargin) - marginLayoutParams2.bottomMargin;
                marginLayoutParams2.height = i5;
                marginLayoutParams2.width = (int) (i5 * this.e);
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        boolean zPerformAccessibilityAction = super.performAccessibilityAction(i, bundle);
        if (!zPerformAccessibilityAction || i != 64) {
            return zPerformAccessibilityAction;
        }
        ViewParent parent = getParent();
        if (parent instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) parent;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int decoratedLeft = layoutManager.getDecoratedLeft(this) - ((recyclerView.getWidth() - layoutManager.getDecoratedMeasuredWidth(this)) / 2);
            recyclerView.setTag(R.id.suppress_item_accessibility_event_tag, true);
            recyclerView.scrollBy(decoratedLeft, 0);
            recyclerView.setTag(R.id.suppress_item_accessibility_event_tag, null);
        }
        ViewParent parent2 = getParent();
        while (parent2 != 0) {
            ViewParent parent3 = parent2.getParent();
            if (!(parent3 instanceof View)) {
                break;
            }
            if ((parent3 instanceof RecyclerView) && ((RecyclerView) parent3).getLayoutManager().canScrollVertically()) {
                break;
            }
            parent2 = parent3;
        }
        if (parent2 == 0) {
            krd.c("Could not find parent that is a vertically scrolling RecyclerView");
        } else {
            RecyclerView recyclerView2 = (RecyclerView) parent2.getParent();
            RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
            View view = (View) parent2;
            int decoratedTop = layoutManager2.getDecoratedTop(view) - ((recyclerView2.getHeight() - layoutManager2.getDecoratedMeasuredHeight(view)) / 2);
            recyclerView2.setTag(R.id.suppress_item_accessibility_event_tag, true);
            recyclerView2.scrollBy(0, decoratedTop);
            recyclerView2.setTag(R.id.suppress_item_accessibility_event_tag, null);
        }
        return true;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        Object parent = getParent();
        if (!(parent instanceof View) || ((View) parent).getTag(R.id.suppress_item_accessibility_event_tag) == null) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public muf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public muf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kqb.a);
        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.6939625f);
        if (f != this.e) {
            this.e = f;
            requestLayout();
        }
        this.a = typedArrayObtainStyledAttributes.getInteger(1, 3);
        typedArrayObtainStyledAttributes.recycle();
    }
}
