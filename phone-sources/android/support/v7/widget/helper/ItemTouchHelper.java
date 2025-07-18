package android.support.v7.widget.helper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import com.google.android.videos.R;
import defpackage.cww;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {
    static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    private static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    private static final boolean DEBUG = false;
    static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    private static final String TAG = "ItemTouchHelper";
    public static final int UP = 1;
    Callback mCallback;
    private List<Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    GestureDetector mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    private ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
    private float mMaxSwipeVelocity;
    RecyclerView mRecyclerView;
    int mSelectedFlags;
    private float mSelectedStartX;
    private float mSelectedStartY;
    private int mSlop;
    private List<RecyclerView.ViewHolder> mSwapTargets;
    private float mSwipeEscapeVelocity;
    private Rect mTmpRect;
    VelocityTracker mVelocityTracker;
    final List<View> mPendingCleanup = new ArrayList();
    private final float[] mTmpPosition = new float[2];
    RecyclerView.ViewHolder mSelected = null;
    int mActivePointerId = -1;
    private int mActionState = 0;
    List<RecoverAnimation> mRecoverAnimations = new ArrayList();
    final Runnable mScrollRunnable = new Runnable() { // from class: android.support.v7.widget.helper.ItemTouchHelper.1
        @Override // java.lang.Runnable
        public void run() {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (itemTouchHelper.mSelected == null || !itemTouchHelper.scrollIfNecessary()) {
                return;
            }
            ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
            RecyclerView.ViewHolder viewHolder = itemTouchHelper2.mSelected;
            if (viewHolder != null) {
                itemTouchHelper2.moveIfNecessary(viewHolder);
            }
            ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
            itemTouchHelper3.mRecyclerView.removeCallbacks(itemTouchHelper3.mScrollRunnable);
            RecyclerView recyclerView = ItemTouchHelper.this.mRecyclerView;
            int[] iArr = cww.a;
            recyclerView.postOnAnimation(this);
        }
    };
    private RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback = null;
    View mOverdrawChild = null;
    int mOverdrawChildPosition = -1;
    private final RecyclerView.OnItemTouchListener mOnItemTouchListener = new RecyclerView.OnItemTouchListener() { // from class: android.support.v7.widget.helper.ItemTouchHelper.2
        @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            RecoverAnimation recoverAnimationFindAnimation;
            ItemTouchHelper.this.mGestureDetector.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ItemTouchHelper.this.mActivePointerId = motionEvent.getPointerId(0);
                ItemTouchHelper.this.mInitialTouchX = motionEvent.getX();
                ItemTouchHelper.this.mInitialTouchY = motionEvent.getY();
                ItemTouchHelper.this.obtainVelocityTracker();
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                if (itemTouchHelper.mSelected == null && (recoverAnimationFindAnimation = itemTouchHelper.findAnimation(motionEvent)) != null) {
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.mInitialTouchX -= recoverAnimationFindAnimation.mX;
                    itemTouchHelper2.mInitialTouchY -= recoverAnimationFindAnimation.mY;
                    itemTouchHelper2.endRecoverAnimation(recoverAnimationFindAnimation.mViewHolder, true);
                    if (ItemTouchHelper.this.mPendingCleanup.remove(recoverAnimationFindAnimation.mViewHolder.itemView)) {
                        ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                        itemTouchHelper3.mCallback.clearView(itemTouchHelper3.mRecyclerView, recoverAnimationFindAnimation.mViewHolder);
                    }
                    ItemTouchHelper.this.select(recoverAnimationFindAnimation.mViewHolder, recoverAnimationFindAnimation.mActionState);
                    ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                    itemTouchHelper4.updateDxDy(motionEvent, itemTouchHelper4.mSelectedFlags, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                ItemTouchHelper itemTouchHelper5 = ItemTouchHelper.this;
                itemTouchHelper5.mActivePointerId = -1;
                itemTouchHelper5.select(null, 0);
            } else {
                int i = ItemTouchHelper.this.mActivePointerId;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = ItemTouchHelper.this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.mSelected != null) {
                return true;
            }
            return ItemTouchHelper.DEBUG;
        }

        @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (z) {
                ItemTouchHelper.this.select(null, 0);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            ItemTouchHelper.this.mGestureDetector.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = ItemTouchHelper.this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.mActivePointerId == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
            if (iFindPointerIndex >= 0) {
                ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, iFindPointerIndex);
            }
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            RecyclerView.ViewHolder viewHolder = itemTouchHelper.mSelected;
            if (viewHolder != null) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (iFindPointerIndex >= 0) {
                            itemTouchHelper.updateDxDy(motionEvent, itemTouchHelper.mSelectedFlags, iFindPointerIndex);
                            ItemTouchHelper.this.moveIfNecessary(viewHolder);
                            ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                            itemTouchHelper2.mRecyclerView.removeCallbacks(itemTouchHelper2.mScrollRunnable);
                            ItemTouchHelper.this.mScrollRunnable.run();
                            ItemTouchHelper.this.mRecyclerView.invalidate();
                            return;
                        }
                        return;
                    }
                    if (actionMasked != 3) {
                        if (actionMasked != 6) {
                            return;
                        }
                        int actionIndex = motionEvent.getActionIndex();
                        int pointerId = motionEvent.getPointerId(actionIndex);
                        ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                        if (pointerId == itemTouchHelper3.mActivePointerId) {
                            itemTouchHelper3.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                            itemTouchHelper4.updateDxDy(motionEvent, itemTouchHelper4.mSelectedFlags, actionIndex);
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = itemTouchHelper.mVelocityTracker;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                }
                ItemTouchHelper.this.select(null, 0);
                ItemTouchHelper.this.mActivePointerId = -1;
            }
        }
    };

    /* compiled from: PG */
    /* renamed from: android.support.v7.widget.helper.ItemTouchHelper$5, reason: invalid class name */
    class AnonymousClass5 implements RecyclerView.ChildDrawingOrderCallback {
        AnonymousClass5() {
        }

        @Override // android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback
        public int onGetChildDrawingOrder(int i, int i2) {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            View view = itemTouchHelper.mOverdrawChild;
            if (view != null) {
                int iIndexOfChild = itemTouchHelper.mOverdrawChildPosition;
                if (iIndexOfChild == -1) {
                    iIndexOfChild = itemTouchHelper.mRecyclerView.indexOfChild(view);
                    ItemTouchHelper.this.mOverdrawChildPosition = iIndexOfChild;
                }
                if (i2 == i - 1) {
                    return iIndexOfChild;
                }
                if (i2 >= iIndexOfChild) {
                    return i2 + 1;
                }
            }
            return i2;
        }
    }

    /* compiled from: PG */
    class ItemTouchHelperGestureListener extends GestureDetector.SimpleOnGestureListener {
        private boolean mShouldReactToLongPress = true;

        public ItemTouchHelperGestureListener() {
        }

        public void doNotReactToLongPress() {
            this.mShouldReactToLongPress = ItemTouchHelper.DEBUG;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewFindChildView;
            RecyclerView.ViewHolder childViewHolder;
            if (!this.mShouldReactToLongPress || (viewFindChildView = ItemTouchHelper.this.findChildView(motionEvent)) == null || (childViewHolder = ItemTouchHelper.this.mRecyclerView.getChildViewHolder(viewFindChildView)) == null) {
                return;
            }
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (itemTouchHelper.mCallback.hasDragFlag(itemTouchHelper.mRecyclerView, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i = ItemTouchHelper.this.mActivePointerId;
                if (pointerId == i) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.mInitialTouchX = x;
                    itemTouchHelper2.mInitialTouchY = y;
                    itemTouchHelper2.mDy = 0.0f;
                    itemTouchHelper2.mDx = 0.0f;
                    if (itemTouchHelper2.mCallback.isLongPressDragEnabled()) {
                        ItemTouchHelper.this.select(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* compiled from: PG */
    public abstract class SimpleCallback extends Callback {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public SimpleCallback(int i, int i2) {
            this.mDefaultSwipeDirs = i2;
            this.mDefaultDragDirs = i;
        }

        public int getDragDirs(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return this.mDefaultDragDirs;
        }

        @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return makeMovementFlags(getDragDirs(recyclerView, viewHolder), getSwipeDirs(recyclerView, viewHolder));
        }

        public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return this.mDefaultSwipeDirs;
        }

        public void setDefaultDragDirs(int i) {
            this.mDefaultDragDirs = i;
        }

        public void setDefaultSwipeDirs(int i) {
            this.mDefaultSwipeDirs = i;
        }
    }

    /* compiled from: PG */
    public interface ViewDropHandler {
        void prepareForDrop(View view, View view2, int i, int i2);
    }

    public ItemTouchHelper(Callback callback) {
        this.mCallback = callback;
    }

    private int checkHorizontalSwipe(RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.mDx > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId >= 0) {
            velocityTracker.computeCurrentVelocity(PIXELS_PER_SECOND, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            int i3 = xVelocity <= 0.0f ? 4 : 8;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.mRecyclerView.getWidth() * this.mCallback.getSwipeThreshold(viewHolder);
        if ((i & i2) == 0 || Math.abs(this.mDx) <= width) {
            return 0;
        }
        return i2;
    }

    private int checkVerticalSwipe(RecyclerView.ViewHolder viewHolder, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.mDy > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId >= 0) {
            velocityTracker.computeCurrentVelocity(PIXELS_PER_SECOND, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            int i3 = yVelocity <= 0.0f ? 1 : 2;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.mRecyclerView.getHeight() * this.mCallback.getSwipeThreshold(viewHolder);
        if ((i & i2) == 0 || Math.abs(this.mDy) <= height) {
            return 0;
        }
        return i2;
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.removeOnChildAttachStateChangeListener(this);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(0);
            recoverAnimation.cancel();
            this.mCallback.clearView(this.mRecyclerView, recoverAnimation.mViewHolder);
        }
        this.mRecoverAnimations.clear();
        this.mOverdrawChild = null;
        this.mOverdrawChildPosition = -1;
        releaseVelocityTracker();
        stopGestureDetection();
    }

    private List<RecyclerView.ViewHolder> findSwapTargets(RecyclerView.ViewHolder viewHolder) {
        int i;
        int i2;
        int i3;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List<RecyclerView.ViewHolder> list = this.mSwapTargets;
        if (list == null) {
            this.mSwapTargets = new ArrayList();
            this.mDistances = new ArrayList();
        } else {
            list.clear();
            this.mDistances.clear();
        }
        int boundingBoxMargin = this.mCallback.getBoundingBoxMargin();
        int iRound = Math.round(this.mSelectedStartX + this.mDx) - boundingBoxMargin;
        int iRound2 = Math.round(this.mSelectedStartY + this.mDy) - boundingBoxMargin;
        int width = viewHolder2.itemView.getWidth() + iRound;
        int i4 = boundingBoxMargin + boundingBoxMargin;
        int height = viewHolder2.itemView.getHeight() + iRound2;
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = layoutManager.getChildAt(i5);
            if (childAt != viewHolder2.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= (i = height + i4) && childAt.getRight() >= iRound && childAt.getLeft() <= (i2 = width + i4)) {
                RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(childAt);
                if (this.mCallback.canDropOver(this.mRecyclerView, this.mSelected, childViewHolder)) {
                    int iAbs = Math.abs(((i2 + iRound) / 2) - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int i6 = iAbs * iAbs;
                    int iAbs2 = Math.abs(((i + iRound2) / 2) - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i7 = iAbs2 * iAbs2;
                    int size = this.mSwapTargets.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        i3 = i6 + i7;
                        if (i8 >= size) {
                            break;
                        }
                        int i10 = i6;
                        if (i3 <= this.mDistances.get(i8).intValue()) {
                            break;
                        }
                        i9++;
                        i8++;
                        i6 = i10;
                    }
                    this.mSwapTargets.add(i9, childViewHolder);
                    this.mDistances.add(i9, Integer.valueOf(i3));
                }
            }
            i5++;
            viewHolder2 = viewHolder;
        }
        return this.mSwapTargets;
    }

    private RecyclerView.ViewHolder findSwipedView(MotionEvent motionEvent) {
        View viewFindChildView;
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int i = this.mActivePointerId;
        if (i == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        float x = motionEvent.getX(iFindPointerIndex) - this.mInitialTouchX;
        float y = motionEvent.getY(iFindPointerIndex) - this.mInitialTouchY;
        float fAbs = Math.abs(x);
        float fAbs2 = Math.abs(y);
        float f = this.mSlop;
        if (fAbs < f && fAbs2 < f) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewFindChildView = findChildView(motionEvent)) != null) {
            return this.mRecyclerView.getChildViewHolder(viewFindChildView);
        }
        return null;
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.mSelectedFlags & 12) != 0) {
            fArr[0] = (this.mSelectedStartX + this.mDx) - this.mSelected.itemView.getLeft();
        } else {
            fArr[0] = this.mSelected.itemView.getTranslationX();
        }
        if ((this.mSelectedFlags & 3) != 0) {
            fArr[1] = (this.mSelectedStartY + this.mDy) - this.mSelected.itemView.getTop();
        } else {
            fArr[1] = this.mSelected.itemView.getTranslationY();
        }
    }

    private static boolean hitTest(View view, float f, float f2, float f3, float f4) {
        if (f < f3 || f > f3 + view.getWidth() || f2 < f4 || f2 > f4 + view.getHeight()) {
            return DEBUG;
        }
        return true;
    }

    private void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setupCallbacks() {
        this.mSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.addOnChildAttachStateChangeListener(this);
        startGestureDetection();
    }

    private void startGestureDetection() {
        this.mItemTouchHelperGestureListener = new ItemTouchHelperGestureListener();
        this.mGestureDetector = new GestureDetector(this.mRecyclerView.getContext(), this.mItemTouchHelperGestureListener);
    }

    private void stopGestureDetection() {
        ItemTouchHelperGestureListener itemTouchHelperGestureListener = this.mItemTouchHelperGestureListener;
        if (itemTouchHelperGestureListener != null) {
            itemTouchHelperGestureListener.doNotReactToLongPress();
            this.mItemTouchHelperGestureListener = null;
        }
        if (this.mGestureDetector != null) {
            this.mGestureDetector = null;
        }
    }

    private int swipeIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (this.mActionState == 2) {
            return 0;
        }
        int movementFlags = this.mCallback.getMovementFlags(this.mRecyclerView, viewHolder);
        int iConvertToAbsoluteDirection = (this.mCallback.convertToAbsoluteDirection(movementFlags, this.mRecyclerView.getLayoutDirection()) >> 8) & ACTION_MODE_IDLE_MASK;
        if (iConvertToAbsoluteDirection == 0) {
            return 0;
        }
        int i = (movementFlags >> 8) & ACTION_MODE_IDLE_MASK;
        if (Math.abs(this.mDx) > Math.abs(this.mDy)) {
            int iCheckHorizontalSwipe = checkHorizontalSwipe(viewHolder, iConvertToAbsoluteDirection);
            if (iCheckHorizontalSwipe > 0) {
                return (i & iCheckHorizontalSwipe) == 0 ? Callback.convertToRelativeDirection(iCheckHorizontalSwipe, this.mRecyclerView.getLayoutDirection()) : iCheckHorizontalSwipe;
            }
            int iCheckVerticalSwipe = checkVerticalSwipe(viewHolder, iConvertToAbsoluteDirection);
            if (iCheckVerticalSwipe > 0) {
                return iCheckVerticalSwipe;
            }
        } else {
            int iCheckVerticalSwipe2 = checkVerticalSwipe(viewHolder, iConvertToAbsoluteDirection);
            if (iCheckVerticalSwipe2 > 0) {
                return iCheckVerticalSwipe2;
            }
            int iCheckHorizontalSwipe2 = checkHorizontalSwipe(viewHolder, iConvertToAbsoluteDirection);
            if (iCheckHorizontalSwipe2 > 0) {
                return (i & iCheckHorizontalSwipe2) == 0 ? Callback.convertToRelativeDirection(iCheckHorizontalSwipe2, this.mRecyclerView.getLayoutDirection()) : iCheckHorizontalSwipe2;
            }
        }
        return 0;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.mSwipeEscapeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.mMaxSwipeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            setupCallbacks();
        }
    }

    public void checkSelectForSwipe(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.ViewHolder viewHolderFindSwipedView;
        if (this.mSelected != null || i != 2 || this.mActionState == 2 || !this.mCallback.isItemViewSwipeEnabled() || this.mRecyclerView.getScrollState() == 1 || (viewHolderFindSwipedView = findSwipedView(motionEvent)) == null) {
            return;
        }
        int absoluteMovementFlags = this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, viewHolderFindSwipedView) >> 8;
        if ((absoluteMovementFlags & ACTION_MODE_IDLE_MASK) != 0) {
            float x = motionEvent.getX(i2);
            float y = motionEvent.getY(i2);
            float f = x - this.mInitialTouchX;
            float f2 = y - this.mInitialTouchY;
            float fAbs = Math.abs(f);
            float fAbs2 = Math.abs(f2);
            float f3 = this.mSlop;
            if (fAbs >= f3 || fAbs2 >= f3) {
                if (fAbs > fAbs2) {
                    if (f < 0.0f && (absoluteMovementFlags & 4) == 0) {
                        return;
                    }
                    if (f > 0.0f && (absoluteMovementFlags & 8) == 0) {
                        return;
                    }
                } else {
                    if (f2 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                        return;
                    }
                }
                this.mDy = 0.0f;
                this.mDx = 0.0f;
                this.mActivePointerId = motionEvent.getPointerId(0);
                select(viewHolderFindSwipedView, 1);
            }
        }
    }

    public void endRecoverAnimation(RecyclerView.ViewHolder viewHolder, boolean z) {
        RecoverAnimation recoverAnimation;
        int size = this.mRecoverAnimations.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                recoverAnimation = this.mRecoverAnimations.get(size);
            }
        } while (recoverAnimation.mViewHolder != viewHolder);
        recoverAnimation.mOverridden |= z;
        if (!recoverAnimation.mEnded) {
            recoverAnimation.cancel();
        }
        this.mRecoverAnimations.remove(size);
    }

    public RecoverAnimation findAnimation(MotionEvent motionEvent) {
        RecoverAnimation recoverAnimation;
        if (this.mRecoverAnimations.isEmpty()) {
            return null;
        }
        View viewFindChildView = findChildView(motionEvent);
        int size = this.mRecoverAnimations.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            recoverAnimation = this.mRecoverAnimations.get(size);
        } while (recoverAnimation.mViewHolder.itemView != viewFindChildView);
        return recoverAnimation;
    }

    public View findChildView(MotionEvent motionEvent) {
        RecoverAnimation recoverAnimation;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null) {
            float f = this.mSelectedStartX + this.mDx;
            float f2 = this.mSelectedStartY + this.mDy;
            View view2 = viewHolder.itemView;
            if (hitTest(view2, x, y, f, f2)) {
                return view2;
            }
        }
        int size = this.mRecoverAnimations.size();
        do {
            size--;
            if (size < 0) {
                return this.mRecyclerView.findChildViewUnder(x, y);
            }
            recoverAnimation = this.mRecoverAnimations.get(size);
            view = recoverAnimation.mViewHolder.itemView;
        } while (!hitTest(view, x, y, recoverAnimation.mX, recoverAnimation.mY));
        return view;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    public boolean hasRunningRecoverAnim() {
        int size = this.mRecoverAnimations.size();
        for (int i = 0; i < size; i++) {
            if (!this.mRecoverAnimations.get(i).mEnded) {
                return true;
            }
        }
        return DEBUG;
    }

    public void moveIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (!this.mRecyclerView.isLayoutRequested() && this.mActionState == 2) {
            float moveThreshold = this.mCallback.getMoveThreshold(viewHolder);
            float f = this.mSelectedStartX + this.mDx;
            int i = (int) (this.mSelectedStartY + this.mDy);
            int i2 = (int) f;
            if (Math.abs(i - viewHolder.itemView.getTop()) >= viewHolder.itemView.getHeight() * moveThreshold || Math.abs(i2 - viewHolder.itemView.getLeft()) >= viewHolder.itemView.getWidth() * moveThreshold) {
                List<RecyclerView.ViewHolder> listFindSwapTargets = findSwapTargets(viewHolder);
                if (listFindSwapTargets.size() != 0) {
                    RecyclerView.ViewHolder viewHolderChooseDropTarget = this.mCallback.chooseDropTarget(viewHolder, listFindSwapTargets, i2, i);
                    if (viewHolderChooseDropTarget == null) {
                        this.mSwapTargets.clear();
                        this.mDistances.clear();
                        return;
                    }
                    int absoluteAdapterPosition = viewHolderChooseDropTarget.getAbsoluteAdapterPosition();
                    int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
                    if (this.mCallback.onMove(this.mRecyclerView, viewHolder, viewHolderChooseDropTarget)) {
                        this.mCallback.onMoved(this.mRecyclerView, viewHolder, absoluteAdapterPosition2, viewHolderChooseDropTarget, absoluteAdapterPosition, i2, i);
                    }
                }
            }
        }
    }

    public void obtainVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.mVelocityTracker = VelocityTracker.obtain();
    }

    @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(View view) {
        removeChildDrawingOrderCallbackIfNecessary(view);
        RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null && childViewHolder == viewHolder) {
            select(null, 0);
            return;
        }
        endRecoverAnimation(childViewHolder, DEBUG);
        if (this.mPendingCleanup.remove(childViewHolder.itemView)) {
            this.mCallback.clearView(this.mRecyclerView, childViewHolder);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        this.mOverdrawChildPosition = -1;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.mCallback.onDraw(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f, f2);
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.mCallback.onDrawOver(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f, f2);
    }

    public void postDispatchSwipe(final RecoverAnimation recoverAnimation, final int i) {
        this.mRecyclerView.post(new Runnable() { // from class: android.support.v7.widget.helper.ItemTouchHelper.4
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = ItemTouchHelper.this.mRecyclerView;
                if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                RecoverAnimation recoverAnimation2 = recoverAnimation;
                if (recoverAnimation2.mOverridden || recoverAnimation2.mViewHolder.getAbsoluteAdapterPosition() == -1) {
                    return;
                }
                RecyclerView.ItemAnimator itemAnimator = ItemTouchHelper.this.mRecyclerView.getItemAnimator();
                if ((itemAnimator != null && itemAnimator.isRunning(null)) || ItemTouchHelper.this.hasRunningRecoverAnim()) {
                    ItemTouchHelper.this.mRecyclerView.post(this);
                    return;
                }
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                RecoverAnimation recoverAnimation3 = recoverAnimation;
                itemTouchHelper.mCallback.onSwiped(recoverAnimation3.mViewHolder, i);
            }
        });
    }

    public void removeChildDrawingOrderCallbackIfNecessary(View view) {
        if (view == this.mOverdrawChild) {
            this.mOverdrawChild = null;
            if (this.mChildDrawingOrderCallback != null) {
                this.mRecyclerView.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f7, code lost:
    
        if (r6 != 0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean scrollIfNecessary() {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.helper.ItemTouchHelper.scrollIfNecessary():boolean");
    }

    public void select(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        float fSignum;
        float fSignum2;
        if (viewHolder == this.mSelected && i == this.mActionState) {
            return;
        }
        this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
        int i2 = this.mActionState;
        endRecoverAnimation(viewHolder, true);
        this.mActionState = i;
        if (i == 2) {
            if (viewHolder == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.mOverdrawChild = viewHolder.itemView;
        }
        int i3 = 1 << ((i * 8) + 8);
        final RecyclerView.ViewHolder viewHolder2 = this.mSelected;
        boolean z2 = DEBUG;
        if (viewHolder2 != null) {
            if (viewHolder2.itemView.getParent() != null) {
                final int iSwipeIfNecessary = i2 == 2 ? 0 : swipeIfNecessary(viewHolder2);
                releaseVelocityTracker();
                int i4 = 4;
                if (iSwipeIfNecessary == 1 || iSwipeIfNecessary == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.mDy) * this.mRecyclerView.getHeight();
                } else if (iSwipeIfNecessary == 4 || iSwipeIfNecessary == 8 || iSwipeIfNecessary == 16 || iSwipeIfNecessary == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.mDx) * this.mRecyclerView.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i2 == 2) {
                    i4 = 8;
                } else if (iSwipeIfNecessary > 0) {
                    i4 = 2;
                }
                getSelectedDxDy(this.mTmpPosition);
                float[] fArr = this.mTmpPosition;
                float f = fArr[0];
                float f2 = fArr[1];
                z = false;
                RecoverAnimation recoverAnimation = new RecoverAnimation(viewHolder2, i4, i2, f, f2, fSignum, fSignum2) { // from class: android.support.v7.widget.helper.ItemTouchHelper.3
                    @Override // android.support.v7.widget.helper.ItemTouchHelper.RecoverAnimation, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (this.mOverridden) {
                            return;
                        }
                        if (iSwipeIfNecessary <= 0) {
                            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                            itemTouchHelper.mCallback.clearView(itemTouchHelper.mRecyclerView, viewHolder2);
                        } else {
                            ItemTouchHelper.this.mPendingCleanup.add(viewHolder2.itemView);
                            this.mIsPendingCleanup = true;
                            int i5 = iSwipeIfNecessary;
                            if (i5 > 0) {
                                ItemTouchHelper.this.postDispatchSwipe(this, i5);
                            }
                        }
                        ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                        RecyclerView.ViewHolder viewHolder3 = viewHolder2;
                        View view = itemTouchHelper2.mOverdrawChild;
                        View view2 = viewHolder3.itemView;
                        if (view == view2) {
                            itemTouchHelper2.removeChildDrawingOrderCallbackIfNecessary(view2);
                        }
                    }
                };
                recoverAnimation.setDuration(this.mCallback.getAnimationDuration(this.mRecyclerView, i4, fSignum - f, fSignum2 - f2));
                this.mRecoverAnimations.add(recoverAnimation);
                recoverAnimation.start();
                z2 = true;
            } else {
                z = false;
                removeChildDrawingOrderCallbackIfNecessary(viewHolder2.itemView);
                this.mCallback.clearView(this.mRecyclerView, viewHolder2);
                z2 = false;
            }
            this.mSelected = null;
        } else {
            z = false;
        }
        if (viewHolder != null) {
            this.mSelectedFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, viewHolder) & (i3 - 1)) >> (this.mActionState * 8);
            this.mSelectedStartX = viewHolder.itemView.getLeft();
            this.mSelectedStartY = viewHolder.itemView.getTop();
            this.mSelected = viewHolder;
            if (i == 2) {
                viewHolder.itemView.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.mRecyclerView.getParent();
        if (parent != null) {
            if (this.mSelected != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.mCallback.onSelectedChanged(this.mSelected, this.mActionState);
        this.mRecyclerView.invalidate();
    }

    public void startDrag(RecyclerView.ViewHolder viewHolder) {
        if (!this.mCallback.hasDragFlag(this.mRecyclerView, viewHolder)) {
            Log.e(TAG, "Start drag has been called but dragging is not enabled");
            return;
        }
        if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e(TAG, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        obtainVelocityTracker();
        this.mDy = 0.0f;
        this.mDx = 0.0f;
        select(viewHolder, 2);
    }

    public void startSwipe(RecyclerView.ViewHolder viewHolder) {
        if (!this.mCallback.hasSwipeFlag(this.mRecyclerView, viewHolder)) {
            Log.e(TAG, "Start swipe has been called but swiping is not enabled");
            return;
        }
        if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e(TAG, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }
        obtainVelocityTracker();
        this.mDy = 0.0f;
        this.mDx = 0.0f;
        select(viewHolder, 1);
    }

    public void updateDxDy(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.mInitialTouchX;
        this.mDx = fMax;
        this.mDy = y - this.mInitialTouchY;
        if ((i & 4) == 0) {
            fMax = Math.max(0.0f, fMax);
            this.mDx = fMax;
        }
        if ((i & 8) == 0) {
            this.mDx = Math.min(0.0f, fMax);
        }
        if ((i & 1) == 0) {
            this.mDy = Math.max(0.0f, this.mDy);
        }
        if ((i & 2) == 0) {
            this.mDy = Math.min(0.0f, this.mDy);
        }
    }

    private void addChildDrawingOrderCallback() {
    }

    /* compiled from: PG */
    public abstract class Callback {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new Interpolator() { // from class: android.support.v7.widget.helper.ItemTouchHelper.Callback.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        };
        private static final Interpolator sDragViewScrollCapInterpolator = new Interpolator() { // from class: android.support.v7.widget.helper.ItemTouchHelper.Callback.2
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        private int mCachedMaxScrollSpeed = -1;

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & ABS_HORIZONTAL_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 + i4;
                i5 |= (-789517) & i6;
                i3 = (i6 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i5 | i3;
        }

        public static ItemTouchUIUtil getDefaultUIUtil() {
            return ItemTouchUIUtilImpl.INSTANCE;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) throws Resources.NotFoundException {
            int i = this.mCachedMaxScrollSpeed;
            if (i != -1) {
                return i;
            }
            int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.mCachedMaxScrollSpeed = dimensionPixelSize;
            return dimensionPixelSize;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag(0, i2 | i);
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        public RecyclerView.ViewHolder chooseDropTarget(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i, int i2) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = viewHolder.itemView.getWidth() + i;
            int height = i2 + viewHolder.itemView.getHeight();
            int left2 = i - viewHolder.itemView.getLeft();
            int top2 = i2 - viewHolder.itemView.getTop();
            int size = list.size();
            int i3 = -1;
            RecyclerView.ViewHolder viewHolder2 = null;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.ViewHolder viewHolder3 = list.get(i4);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (iAbs4 = Math.abs(right)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i2) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (iAbs2 = Math.abs(top)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs;
                }
            }
            return viewHolder2;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            ItemTouchUIUtilImpl.INSTANCE.clearView(viewHolder.itemView);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & RELATIVE_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i5 | i3;
        }

        final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), recyclerView.getLayoutDirection());
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i == 8 ? 200L : 250L : i == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

        public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if ((getAbsoluteMovementFlags(recyclerView, viewHolder) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) != 0) {
                return true;
            }
            return ItemTouchHelper.DEBUG;
        }

        public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if ((getAbsoluteMovementFlags(recyclerView, viewHolder) & ItemTouchHelper.ACTION_MODE_SWIPE_MASK) != 0) {
                return true;
            }
            return ItemTouchHelper.DEBUG;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int iSignum = (int) (((int) (((int) Math.signum(i2)) * getMaxDragScroll(recyclerView) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, Math.abs(i2) / i)))) * sDragScrollInterpolator.getInterpolation(j <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS ? j / 2000.0f : 1.0f));
            return iSignum == 0 ? i2 > 0 ? 1 : -1 : iSignum;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            ItemTouchUIUtilImpl.INSTANCE.onDraw(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            ItemTouchUIUtilImpl.INSTANCE.onDrawOver(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<RecoverAnimation> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                RecoverAnimation recoverAnimation = list.get(i2);
                recoverAnimation.update();
                int iSave = canvas.save();
                onChildDraw(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, ItemTouchHelper.DEBUG);
                canvas.restoreToCount(iSave);
            }
            if (viewHolder != null) {
                int iSave2 = canvas.save();
                onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<RecoverAnimation> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = ItemTouchHelper.DEBUG;
            for (int i2 = 0; i2 < size; i2++) {
                RecoverAnimation recoverAnimation = list.get(i2);
                int iSave = canvas.save();
                onChildDrawOver(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, ItemTouchHelper.DEBUG);
                canvas.restoreToCount(iSave);
            }
            if (viewHolder != null) {
                int iSave2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                RecoverAnimation recoverAnimation2 = list.get(size);
                if (!recoverAnimation2.mEnded) {
                    z = true;
                } else if (!recoverAnimation2.mIsPendingCleanup) {
                    list.remove(size);
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ViewDropHandler) {
                ((ViewDropHandler) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                ItemTouchUIUtilImpl.INSTANCE.onSelected(viewHolder.itemView);
            }
        }

        public abstract void onSwiped(RecyclerView.ViewHolder viewHolder, int i);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }
    }

    /* compiled from: PG */
    class RecoverAnimation implements Animator.AnimatorListener {
        final int mActionState;
        final int mAnimationType;
        private float mFraction;
        boolean mIsPendingCleanup;
        final float mStartDx;
        final float mStartDy;
        final float mTargetX;
        final float mTargetY;
        final ValueAnimator mValueAnimator;
        final RecyclerView.ViewHolder mViewHolder;
        float mX;
        float mY;
        boolean mOverridden = ItemTouchHelper.DEBUG;
        boolean mEnded = ItemTouchHelper.DEBUG;

        public RecoverAnimation(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4) {
            this.mActionState = i2;
            this.mAnimationType = i;
            this.mViewHolder = viewHolder;
            this.mStartDx = f;
            this.mStartDy = f2;
            this.mTargetX = f3;
            this.mTargetY = f4;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.mValueAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.v7.widget.helper.ItemTouchHelper.RecoverAnimation.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RecoverAnimation.this.setFraction(valueAnimator.getAnimatedFraction());
                }
            });
            valueAnimatorOfFloat.setTarget(viewHolder.itemView);
            valueAnimatorOfFloat.addListener(this);
            setFraction(0.0f);
        }

        public void cancel() {
            this.mValueAnimator.cancel();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            setFraction(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.mEnded) {
                this.mViewHolder.setIsRecyclable(true);
            }
            this.mEnded = true;
        }

        public void setDuration(long j) {
            this.mValueAnimator.setDuration(j);
        }

        public void setFraction(float f) {
            this.mFraction = f;
        }

        public void start() {
            this.mViewHolder.setIsRecyclable(ItemTouchHelper.DEBUG);
            this.mValueAnimator.start();
        }

        public void update() {
            float f = this.mStartDx;
            float f2 = this.mTargetX;
            if (f == f2) {
                this.mX = this.mViewHolder.itemView.getTranslationX();
            } else {
                this.mX = f + (this.mFraction * (f2 - f));
            }
            float f3 = this.mStartDy;
            float f4 = this.mTargetY;
            this.mY = f3 == f4 ? this.mViewHolder.itemView.getTranslationY() : f3 + (this.mFraction * (f4 - f3));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(View view) {
    }
}
