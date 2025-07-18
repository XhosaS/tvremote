package android.support.v7.widget;

import android.graphics.PointF;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PagerSnapHelper extends SnapHelper {
    private static final int MAX_SCROLL_ON_FLING_DURATION = 100;
    private OrientationHelper mHorizontalHelper;
    private OrientationHelper mVerticalHelper;

    private int distanceToCenter(View view, OrientationHelper orientationHelper) {
        return (orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2)) - (orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2));
    }

    private View findCenterView(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int startAfterPadding = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        int i = 0;
        int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        while (i < childCount) {
            View childAt = layoutManager.getChildAt(i);
            int iAbs = Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
            int i3 = iAbs < i2 ? iAbs : i2;
            if (iAbs < i2) {
                view = childAt;
            }
            i++;
            i2 = i3;
        }
        return view;
    }

    private OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.mHorizontalHelper;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.mHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.mHorizontalHelper;
    }

    private OrientationHelper getOrientationHelper(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return getVerticalHelper(layoutManager);
        }
        if (layoutManager.canScrollHorizontally()) {
            return getHorizontalHelper(layoutManager);
        }
        return null;
    }

    private OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.mVerticalHelper;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.mVerticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.mVerticalHelper;
    }

    private boolean isForwardFling(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        if (true != layoutManager.canScrollHorizontally()) {
            i = i2;
        }
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.LayoutManager layoutManager) {
        PointF pointFComputeScrollVectorForPosition;
        boolean z = layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider;
        int itemCount = layoutManager.getItemCount();
        if (!z || (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // android.support.v7.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(view, getHorizontalHelper(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(view, getVerticalHelper(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // android.support.v7.widget.SnapHelper
    protected RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.mRecyclerView.getContext()) { // from class: android.support.v7.widget.PagerSnapHelper.1
                @Override // android.support.v7.widget.LinearSmoothScroller
                protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // android.support.v7.widget.LinearSmoothScroller
                protected int calculateTimeForScrolling(int i) {
                    return Math.min(100, super.calculateTimeForScrolling(i));
                }

                @Override // android.support.v7.widget.LinearSmoothScroller, android.support.v7.widget.RecyclerView.SmoothScroller
                protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    int[] iArrCalculateDistanceToFinalSnap = PagerSnapHelper.this.calculateDistanceToFinalSnap(PagerSnapHelper.this.mRecyclerView.getLayoutManager(), view);
                    int i = iArrCalculateDistanceToFinalSnap[0];
                    int i2 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                    if (iCalculateTimeForDeceleration > 0) {
                        action.update(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            };
        }
        return null;
    }

    @Override // android.support.v7.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return findCenterView(layoutManager, getVerticalHelper(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return findCenterView(layoutManager, getHorizontalHelper(layoutManager));
        }
        return null;
    }

    @Override // android.support.v7.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        OrientationHelper orientationHelper;
        int itemCount = layoutManager.getItemCount();
        if (itemCount != 0 && (orientationHelper = getOrientationHelper(layoutManager)) != null) {
            int childCount = layoutManager.getChildCount();
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = layoutManager.getChildAt(i5);
                if (childAt != null) {
                    int iDistanceToCenter = distanceToCenter(childAt, orientationHelper);
                    if (iDistanceToCenter <= 0 && iDistanceToCenter > i3) {
                        view2 = childAt;
                        i3 = iDistanceToCenter;
                    }
                    if (iDistanceToCenter >= 0 && iDistanceToCenter < i4) {
                        view = childAt;
                        i4 = iDistanceToCenter;
                    }
                }
            }
            boolean zIsForwardFling = isForwardFling(layoutManager, i, i2);
            if (zIsForwardFling && view != null) {
                return layoutManager.getPosition(view);
            }
            if (!zIsForwardFling && view2 != null) {
                return layoutManager.getPosition(view2);
            }
            if (true == zIsForwardFling) {
                view = view2;
            }
            if (view != null) {
                int position = layoutManager.getPosition(view) + (isReverseLayout(layoutManager) == zIsForwardFling ? -1 : 1);
                if (position >= 0 && position < itemCount) {
                    return position;
                }
            }
        }
        return -1;
    }
}
