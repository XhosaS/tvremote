package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccd extends ViewGroup {
    public final HashMap a;
    public final HashMap b;

    public ccd(Context context) {
        super(context);
        setClipChildren(false);
        this.a = new HashMap();
        this.b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (cmv cmvVar : this.a.keySet()) {
            cmvVar.layout(cmvVar.getLeft(), cmvVar.getTop(), cmvVar.getRight(), cmvVar.getBottom());
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            bty.b("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            bty.b("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (cmv cmvVar : this.a.keySet()) {
            int i4 = cmvVar.s;
            if (i4 != Integer.MIN_VALUE && (i3 = cmvVar.t) != Integer.MIN_VALUE) {
                cmvVar.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            bys bysVar = (bys) this.a.get(childAt);
            if (childAt.isLayoutRequested() && bysVar != null) {
                bys.aq(bysVar, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
