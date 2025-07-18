package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class om extends ViewGroup {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    public boolean f;
    private float g;
    private boolean h;
    private int[] i;
    private int[] j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    public om(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ol;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ol generateDefaultLayoutParams() {
        int i = this.c;
        if (i == 0) {
            return new ol(-2);
        }
        if (i == 1) {
            return new ol(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ol generateLayoutParams(AttributeSet attributeSet) {
        return new ol(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.a < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.a;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.a == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.b;
        if (this.c == 1 && (i = this.d & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.e) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.e;
            }
        }
        return bottom + ((ol) childAt.getLayoutParams()).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.a;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    public int getGravity() {
        return this.d;
    }

    public int getOrientation() {
        return this.c;
    }

    public int getShowDividers() {
        return this.n;
    }

    public float getWeightSum() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ol generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ol ? new ol((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ol((ViewGroup.MarginLayoutParams) layoutParams) : new ol(layoutParams);
    }

    final void m(Canvas canvas, int i) {
        this.k.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.k.draw(canvas);
    }

    final void n(Canvas canvas, int i) {
        this.k.setBounds(i, getPaddingTop() + this.o, this.l + i, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    protected final boolean o(int i) {
        if (i == 0) {
            return (this.n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) != 0) {
            do {
                i--;
                if (i >= 0) {
                }
            } while (getChildAt(i).getVisibility() == 8);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.k == null) {
            return;
        }
        int i2 = 0;
        if (this.c == 1) {
            int childCount = getChildCount();
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && o(i2)) {
                    m(canvas, (childAt.getTop() - ((ol) childAt.getLayoutParams()).topMargin) - this.m);
                }
                i2++;
            }
            if (o(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                m(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.m : childAt2.getBottom() + ((ol) childAt2.getLayoutParams()).bottomMargin);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean zA = sm.a(this);
        while (i2 < childCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && o(i2)) {
                ol olVar = (ol) childAt3.getLayoutParams();
                n(canvas, zA ? childAt3.getRight() + olVar.rightMargin : (childAt3.getLeft() - olVar.leftMargin) - this.l);
            }
            i2++;
        }
        if (o(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 != null) {
                ol olVar2 = (ol) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - olVar2.leftMargin;
                    i = this.l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + olVar2.rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.l;
                right = left - i;
            }
            n(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0198  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:431:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r36, int r37) {
        /*
            Method dump skipped, instructions count: 2149
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om.onMeasure(int, int):void");
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.a = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerPadding(int i) {
        this.o = i;
    }

    public void setGravity(int i) {
        if (this.d != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.d = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = this.d;
        int i3 = i & 8388615;
        if ((i2 & 8388615) != i3) {
            this.d = i3 | (i2 & (-8388616));
            requestLayout();
        }
    }

    public void setOrientation(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.n) {
            requestLayout();
        }
        this.n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = this.d;
        int i3 = i & 112;
        if ((i2 & 112) != i3) {
            this.d = i3 | (i2 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public om(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public om(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = true;
        this.a = -1;
        this.b = 0;
        this.d = 8388659;
        int[] iArr = hs.n;
        rv rvVarF = rv.f(context, attributeSet, iArr, i, 0);
        ahj.m(this, context, iArr, attributeSet, rvVarF.b, i, 0);
        int i2 = rvVarF.b.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = rvVarF.b.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        if (!rvVarF.b.getBoolean(2, true)) {
            this.f = false;
        }
        this.g = rvVarF.b.getFloat(4, -1.0f);
        this.a = rvVarF.b.getInt(3, -1);
        this.h = rvVarF.b.getBoolean(7, false);
        Drawable drawableB = rvVarF.b(5);
        if (drawableB != this.k) {
            this.k = drawableB;
            if (drawableB != null) {
                this.l = drawableB.getIntrinsicWidth();
                this.m = drawableB.getIntrinsicHeight();
            } else {
                this.l = 0;
                this.m = 0;
            }
            setWillNotDraw(drawableB == null);
            requestLayout();
        }
        this.n = rvVarF.b.getInt(8, 0);
        this.o = rvVarF.b.getDimensionPixelSize(6, 0);
        rvVarF.b.recycle();
    }
}
