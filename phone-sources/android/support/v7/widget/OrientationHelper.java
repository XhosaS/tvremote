package android.support.v7.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class OrientationHelper {
    public static final int HORIZONTAL = 0;
    private static final int INVALID_SIZE = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;
    private int mLastTotalSpace;
    protected final RecyclerView.LayoutManager mLayoutManager;
    final Rect mTmpRect;

    private OrientationHelper(RecyclerView.LayoutManager layoutManager) {
        this.mLastTotalSpace = Integer.MIN_VALUE;
        this.mTmpRect = new Rect();
        this.mLayoutManager = layoutManager;
    }

    public static OrientationHelper createHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        return new OrientationHelper(layoutManager) { // from class: android.support.v7.widget.OrientationHelper.1
            @Override // android.support.v7.widget.OrientationHelper
            public int getDecoratedEnd(View view) {
                return this.mLayoutManager.getDecoratedRight(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getDecoratedMeasurement(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.mLayoutManager.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getDecoratedMeasurementInOther(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.mLayoutManager.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getDecoratedStart(View view) {
                return this.mLayoutManager.getDecoratedLeft(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getEnd() {
                return this.mLayoutManager.getWidth();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getEndAfterPadding() {
                RecyclerView.LayoutManager layoutManager2 = this.mLayoutManager;
                return layoutManager2.getWidth() - layoutManager2.getPaddingRight();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getEndPadding() {
                return this.mLayoutManager.getPaddingRight();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getMode() {
                return this.mLayoutManager.getWidthMode();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getModeInOther() {
                return this.mLayoutManager.getHeightMode();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getStartAfterPadding() {
                return this.mLayoutManager.getPaddingLeft();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getTotalSpace() {
                RecyclerView.LayoutManager layoutManager2 = this.mLayoutManager;
                return (layoutManager2.getWidth() - layoutManager2.getPaddingLeft()) - this.mLayoutManager.getPaddingRight();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getTransformedEndWithDecoration(View view) {
                this.mLayoutManager.getTransformedBoundingBox(view, true, this.mTmpRect);
                return this.mTmpRect.right;
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getTransformedStartWithDecoration(View view) {
                this.mLayoutManager.getTransformedBoundingBox(view, true, this.mTmpRect);
                return this.mTmpRect.left;
            }

            @Override // android.support.v7.widget.OrientationHelper
            public void offsetChild(View view, int i) {
                view.offsetLeftAndRight(i);
            }

            @Override // android.support.v7.widget.OrientationHelper
            public void offsetChildren(int i) {
                this.mLayoutManager.offsetChildrenHorizontal(i);
            }
        };
    }

    public static OrientationHelper createOrientationHelper(RecyclerView.LayoutManager layoutManager, int i) {
        if (i == 0) {
            return createHorizontalHelper(layoutManager);
        }
        if (i == 1) {
            return createVerticalHelper(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static OrientationHelper createVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        return new OrientationHelper(layoutManager) { // from class: android.support.v7.widget.OrientationHelper.2
            @Override // android.support.v7.widget.OrientationHelper
            public int getDecoratedEnd(View view) {
                return this.mLayoutManager.getDecoratedBottom(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getDecoratedMeasurement(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.mLayoutManager.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getDecoratedMeasurementInOther(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.mLayoutManager.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getDecoratedStart(View view) {
                return this.mLayoutManager.getDecoratedTop(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getEnd() {
                return this.mLayoutManager.getHeight();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getEndAfterPadding() {
                RecyclerView.LayoutManager layoutManager2 = this.mLayoutManager;
                return layoutManager2.getHeight() - layoutManager2.getPaddingBottom();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getEndPadding() {
                return this.mLayoutManager.getPaddingBottom();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getMode() {
                return this.mLayoutManager.getHeightMode();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getModeInOther() {
                return this.mLayoutManager.getWidthMode();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getStartAfterPadding() {
                return this.mLayoutManager.getPaddingTop();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getTotalSpace() {
                RecyclerView.LayoutManager layoutManager2 = this.mLayoutManager;
                return (layoutManager2.getHeight() - layoutManager2.getPaddingTop()) - this.mLayoutManager.getPaddingBottom();
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getTransformedEndWithDecoration(View view) {
                this.mLayoutManager.getTransformedBoundingBox(view, true, this.mTmpRect);
                return this.mTmpRect.bottom;
            }

            @Override // android.support.v7.widget.OrientationHelper
            public int getTransformedStartWithDecoration(View view) {
                this.mLayoutManager.getTransformedBoundingBox(view, true, this.mTmpRect);
                return this.mTmpRect.top;
            }

            @Override // android.support.v7.widget.OrientationHelper
            public void offsetChild(View view, int i) {
                view.offsetTopAndBottom(i);
            }

            @Override // android.support.v7.widget.OrientationHelper
            public void offsetChildren(int i) {
                this.mLayoutManager.offsetChildrenVertical(i);
            }
        };
    }

    public abstract int getDecoratedEnd(View view);

    public abstract int getDecoratedMeasurement(View view);

    public abstract int getDecoratedMeasurementInOther(View view);

    public abstract int getDecoratedStart(View view);

    public abstract int getEnd();

    public abstract int getEndAfterPadding();

    public abstract int getEndPadding();

    public RecyclerView.LayoutManager getLayoutManager() {
        return this.mLayoutManager;
    }

    public abstract int getMode();

    public abstract int getModeInOther();

    public abstract int getStartAfterPadding();

    public abstract int getTotalSpace();

    public int getTotalSpaceChange() {
        if (this.mLastTotalSpace == Integer.MIN_VALUE) {
            return 0;
        }
        return getTotalSpace() - this.mLastTotalSpace;
    }

    public abstract int getTransformedEndWithDecoration(View view);

    public abstract int getTransformedStartWithDecoration(View view);

    public abstract void offsetChild(View view, int i);

    public abstract void offsetChildren(int i);

    public void onLayoutComplete() {
        this.mLastTotalSpace = getTotalSpace();
    }
}
