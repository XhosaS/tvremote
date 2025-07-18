package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.widget.ActivityChooserView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.videos.R;
import defpackage.csr;
import defpackage.cvn;
import defpackage.cvo;
import defpackage.cvp;
import defpackage.cwk;
import defpackage.cwm;
import defpackage.cww;
import defpackage.cxr;
import defpackage.cxs;
import defpackage.cxt;
import defpackage.cxu;
import defpackage.cxv;
import defpackage.cxw;
import defpackage.cye;
import defpackage.cyh;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, cvn, cvo {
    private static final int ACTION_BAR_ANIMATE_DELAY = 600;
    private static final cyh NON_EMPTY_SYSTEM_WINDOW_INSETS;
    private static final String TAG = "ActionBarOverlayLayout";
    private static final Rect ZERO_INSETS;
    private boolean mActionBarExtendsIntoSystemInsets;
    private int mActionBarHeight;
    ActionBarContainer mActionBarTop;
    private ActionBarVisibilityCallback mActionBarVisibilityCallback;
    private final Runnable mAddActionBarHideOffset;
    boolean mAnimatingForFling;
    private final Rect mBaseContentInsets;
    private cyh mBaseInnerInsets;
    private final Rect mBaseInnerInsetsRect;
    private ContentFrameLayout mContent;
    private final Rect mContentInsets;
    ViewPropertyAnimator mCurrentActionBarTopAnimator;
    private boolean mDecorFitsSystemWindows;
    private DecorToolbar mDecorToolbar;
    private OverScroller mFlingEstimator;
    private boolean mHasNonEmbeddedTabs;
    private boolean mHideOnContentScroll;
    private int mHideOnContentScrollReference;
    private cyh mInnerInsets;
    private final Rect mInnerInsetsRect;
    private final Rect mLastBaseContentInsets;
    private cyh mLastBaseInnerInsets;
    private final Rect mLastBaseInnerInsetsRect;
    private cyh mLastInnerInsets;
    private final Rect mLastInnerInsetsRect;
    private int mLastSystemUiVisibility;
    private final NoSystemUiLayoutFlagView mNoSystemUiLayoutFlagView;
    private boolean mOverlayMode;
    private final cvp mParentHelper;
    private final Runnable mRemoveActionBarHideOffset;
    private final Rect mSystemInsets;
    private final Rect mTmpRect;
    final AnimatorListenerAdapter mTopAnimatorListener;
    private Drawable mWindowContentOverlay;
    private int mWindowVisibility;
    private static final Rect EMPTY_RECT = new Rect();
    static final int[] ATTRS = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* compiled from: PG */
    public interface ActionBarVisibilityCallback {
        void enableContentAnimations(boolean z);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int i);

        void showForSystem();
    }

    /* compiled from: PG */
    public class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* compiled from: PG */
    final class NoSystemUiLayoutFlagView extends View {
        public NoSystemUiLayoutFlagView(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        cxw cxvVar = Build.VERSION.SDK_INT >= 34 ? new cxv() : Build.VERSION.SDK_INT >= 31 ? new cxu() : Build.VERSION.SDK_INT >= 30 ? new cxt() : Build.VERSION.SDK_INT >= 29 ? new cxs() : new cxr();
        cxvVar.c(csr.e(0, 1, 0, 1));
        NON_EMPTY_SYSTEM_WINDOW_INSETS = cxvVar.a();
        ZERO_INSETS = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private void addActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        this.mAddActionBarHideOffset.run();
    }

    private boolean decorFitsSystemWindows() {
        cyh cyhVar = NON_EMPTY_SYSTEM_WINDOW_INSETS;
        int[] iArr = cww.a;
        cwm.e(this.mNoSystemUiLayoutFlagView, cyhVar, this.mTmpRect);
        return !this.mTmpRect.equals(ZERO_INSETS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DecorToolbar getDecorToolbar(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(view.getClass().getSimpleName())));
    }

    private void init(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(ATTRS);
        this.mActionBarHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.mWindowContentOverlay = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.mFlingEstimator = new OverScroller(context);
    }

    private void postAddActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        postDelayed(this.mAddActionBarHideOffset, 600L);
    }

    private void postRemoveActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        postDelayed(this.mRemoveActionBarHideOffset, 600L);
    }

    private void removeActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        this.mRemoveActionBarHideOffset.run();
    }

    private boolean setMargin(View view, int i, int i2, int i3, int i4) {
        boolean z;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.leftMargin != i) {
            layoutParams.leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (layoutParams.topMargin != i2) {
            layoutParams.topMargin = i2;
            z = true;
        }
        if (layoutParams.rightMargin != i3) {
            layoutParams.rightMargin = i3;
            z = true;
        }
        if (layoutParams.bottomMargin == i4) {
            return z;
        }
        layoutParams.bottomMargin = i4;
        return true;
    }

    private boolean shouldHideActionBarOnFling(float f) {
        this.mFlingEstimator.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        return this.mFlingEstimator.getFinalY() > this.mActionBarTop.getHeight();
    }

    @Override // android.support.v7.widget.DecorContentParent
    public boolean canShowOverflowMenu() {
        pullChildren();
        return this.mDecorToolbar.canShowOverflowMenu();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.support.v7.widget.DecorContentParent
    public void dismissPopups() {
        pullChildren();
        this.mDecorToolbar.dismissPopupMenus();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.mWindowContentOverlay != null) {
            int bottom = this.mActionBarTop.getVisibility() == 0 ? (int) (this.mActionBarTop.getBottom() + this.mActionBarTop.getTranslationY() + 0.5f) : 0;
            this.mWindowContentOverlay.setBounds(0, bottom, getWidth(), this.mWindowContentOverlay.getIntrinsicHeight() + bottom);
            this.mWindowContentOverlay.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.mActionBarTop;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mParentHelper.a();
    }

    @Override // android.support.v7.widget.DecorContentParent
    public CharSequence getTitle() {
        pullChildren();
        return this.mDecorToolbar.getTitle();
    }

    public void haltActionBarHideOffsetAnimations() {
        removeCallbacks(this.mRemoveActionBarHideOffset);
        removeCallbacks(this.mAddActionBarHideOffset);
        ViewPropertyAnimator viewPropertyAnimator = this.mCurrentActionBarTopAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.support.v7.widget.DecorContentParent
    public boolean hasIcon() {
        pullChildren();
        return this.mDecorToolbar.hasIcon();
    }

    @Override // android.support.v7.widget.DecorContentParent
    public boolean hasLogo() {
        pullChildren();
        return this.mDecorToolbar.hasLogo();
    }

    @Override // android.support.v7.widget.DecorContentParent
    public boolean hideOverflowMenu() {
        pullChildren();
        return this.mDecorToolbar.hideOverflowMenu();
    }

    @Override // android.support.v7.widget.DecorContentParent
    public void initFeature(int i) {
        pullChildren();
        if (i == 2) {
            this.mDecorToolbar.initProgress();
        } else if (i == 5) {
            this.mDecorToolbar.initIndeterminateProgress();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public boolean isHideOnContentScrollEnabled() {
        return this.mHideOnContentScroll;
    }

    public boolean isInOverlayMode() {
        return this.mOverlayMode;
    }

    @Override // android.support.v7.widget.DecorContentParent
    public boolean isOverflowMenuShowPending() {
        pullChildren();
        return this.mDecorToolbar.isOverflowMenuShowPending();
    }

    @Override // android.support.v7.widget.DecorContentParent
    public boolean isOverflowMenuShowing() {
        pullChildren();
        return this.mDecorToolbar.isOverflowMenuShowing();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean margin;
        pullChildren();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        int i = windowSystemUiVisibility & 256;
        int i2 = windowSystemUiVisibility & 1536;
        boolean zDecorFitsSystemWindows = decorFitsSystemWindows();
        this.mDecorFitsSystemWindows = zDecorFitsSystemWindows;
        boolean z = true;
        boolean z2 = i != 0;
        boolean z3 = !zDecorFitsSystemWindows || (z2 && i2 != 0);
        this.mActionBarExtendsIntoSystemInsets = z3;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.mActionBarVisibilityCallback;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.enableContentAnimations((z2 || z3) ? false : true);
        }
        cyh cyhVarP = cyh.p(windowInsets, this);
        cye cyeVar = cyhVarP.b;
        Rect rect = this.mSystemInsets;
        csr csrVarD = cyeVar.d();
        int i3 = csrVarD.b;
        int i4 = csrVarD.c;
        int i5 = csrVarD.d;
        rect.set(i3, i4, i5, csrVarD.e);
        if (this.mActionBarExtendsIntoSystemInsets) {
            csr csrVarF = cyhVarP.f(2);
            int i6 = csrVarF.b;
            int i7 = csrVarF.d;
            this.mActionBarTop.setPadding(i3 - i6, i4, i5 - i7, 0);
            margin = setMargin(this.mActionBarTop, i6, 0, i7, 0);
        } else {
            this.mActionBarTop.setPadding(0, 0, 0, 0);
            margin = setMargin(this.mActionBarTop, i3, i4, i5, 0);
        }
        Rect rect2 = this.mBaseContentInsets;
        int[] iArr = cww.a;
        cwm.e(this, cyhVarP, rect2);
        Rect rect3 = this.mBaseContentInsets;
        cyh cyhVarN = cyhVarP.n(rect3.left, rect3.top, rect3.right, rect3.bottom);
        this.mBaseInnerInsets = cyhVarN;
        if (this.mLastBaseInnerInsets.equals(cyhVarN)) {
            z = margin;
        } else {
            this.mLastBaseInnerInsets = this.mBaseInnerInsets;
        }
        if (this.mLastBaseContentInsets.equals(this.mBaseContentInsets)) {
            if (z) {
            }
            return cyhVarP.k().m().l().e();
        }
        this.mLastBaseContentInsets.set(this.mBaseContentInsets);
        requestLayout();
        return cyhVarP.k().m().l().e();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        init(getContext());
        int[] iArr = cww.a;
        cwk.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        haltActionBarHideOffsetAnimations();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        pullChildren();
        measureChildWithMargins(this.mActionBarTop, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.mActionBarTop.getLayoutParams();
        int iMax = Math.max(0, this.mActionBarTop.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int iMax2 = Math.max(0, this.mActionBarTop.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.mActionBarTop.getMeasuredState());
        int[] iArr = cww.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.mActionBarHeight;
            if (this.mActionBarExtendsIntoSystemInsets) {
                measuredHeight += this.mSystemInsets.top;
            }
            if (this.mHasNonEmbeddedTabs && this.mActionBarTop.getTabContainer() != null) {
                measuredHeight += this.mActionBarHeight;
            }
        } else {
            measuredHeight = this.mActionBarTop.getVisibility() != 8 ? this.mActionBarTop.getMeasuredHeight() : 0;
        }
        this.mContentInsets.set(this.mBaseContentInsets);
        cyh cyhVar = this.mBaseInnerInsets;
        this.mInnerInsets = cyhVar;
        if (this.mOverlayMode || z || !this.mDecorFitsSystemWindows) {
            csr csrVarE = this.mActionBarExtendsIntoSystemInsets ? csr.e(cyhVar.b(), Math.max(this.mInnerInsets.d(), measuredHeight), this.mInnerInsets.c(), Math.max(this.mInnerInsets.a(), 0)) : csr.e(cyhVar.b(), this.mInnerInsets.d() + measuredHeight, this.mInnerInsets.c(), this.mInnerInsets.a());
            cyh cyhVar2 = this.mInnerInsets;
            cxw cxvVar = Build.VERSION.SDK_INT >= 34 ? new cxv(cyhVar2) : Build.VERSION.SDK_INT >= 31 ? new cxu(cyhVar2) : Build.VERSION.SDK_INT >= 30 ? new cxt(cyhVar2) : Build.VERSION.SDK_INT >= 29 ? new cxs(cyhVar2) : new cxr(cyhVar2);
            cxvVar.c(csrVarE);
            this.mInnerInsets = cxvVar.a();
        } else {
            if (this.mActionBarExtendsIntoSystemInsets) {
                Rect rect = this.mContentInsets;
                rect.top = Math.max(rect.top, measuredHeight);
                Rect rect2 = this.mContentInsets;
                rect2.bottom = Math.max(rect2.bottom, 0);
            } else {
                this.mContentInsets.top += measuredHeight;
                Rect rect3 = this.mContentInsets;
                rect3.bottom = rect3.bottom;
            }
            this.mInnerInsets = this.mInnerInsets.n(0, measuredHeight, 0, 0);
        }
        ContentFrameLayout contentFrameLayout = this.mContent;
        Rect rect4 = this.mContentInsets;
        setMargin(contentFrameLayout, rect4.left, rect4.top, rect4.right, rect4.bottom);
        if (!this.mLastInnerInsets.equals(this.mInnerInsets)) {
            cyh cyhVar3 = this.mInnerInsets;
            this.mLastInnerInsets = cyhVar3;
            cww.e(this.mContent, cyhVar3);
        }
        measureChildWithMargins(this.mContent, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.mContent.getLayoutParams();
        int iMax3 = Math.max(iMax, this.mContent.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int iMax4 = Math.max(iMax2, this.mContent.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mContent.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.mHideOnContentScroll || !z) {
            return false;
        }
        if (shouldHideActionBarOnFling(f2)) {
            addActionBarHideOffset();
        } else {
            removeActionBarHideOffset();
        }
        this.mAnimatingForFling = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.mHideOnContentScrollReference + i2;
        this.mHideOnContentScrollReference = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.mParentHelper.d(i);
        this.mHideOnContentScrollReference = getActionBarHideOffset();
        haltActionBarHideOffsetAnimations();
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.mActionBarVisibilityCallback;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStarted();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.mActionBarTop.getVisibility() != 0) {
            return false;
        }
        return this.mHideOnContentScroll;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.mHideOnContentScroll && !this.mAnimatingForFling) {
            if (this.mHideOnContentScrollReference <= this.mActionBarTop.getHeight()) {
                postRemoveActionBarHideOffset();
            } else {
                postAddActionBarHideOffset();
            }
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.mActionBarVisibilityCallback;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onContentScrollStopped();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        pullChildren();
        int i2 = this.mLastSystemUiVisibility ^ i;
        this.mLastSystemUiVisibility = i;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.mActionBarVisibilityCallback;
        if (actionBarVisibilityCallback != null) {
            boolean z = (i & 256) != 0;
            int i3 = i & 4;
            actionBarVisibilityCallback.enableContentAnimations((z || this.mActionBarExtendsIntoSystemInsets) ? false : true);
            if (i3 == 0 || !z) {
                this.mActionBarVisibilityCallback.showForSystem();
            } else {
                this.mActionBarVisibilityCallback.hideForSystem();
            }
        }
        if ((i2 & 256) == 0 || this.mActionBarVisibilityCallback == null) {
            return;
        }
        int[] iArr = cww.a;
        cwk.e(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.mWindowVisibility = i;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.mActionBarVisibilityCallback;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onWindowVisibilityChanged(i);
        }
    }

    public void pullChildren() {
        if (this.mContent == null) {
            this.mContent = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.mActionBarTop = (ActionBarContainer) findViewById(R.id.action_bar_container);
            this.mDecorToolbar = getDecorToolbar(findViewById(R.id.action_bar));
        }
    }

    @Override // android.support.v7.widget.DecorContentParent
    public void restoreToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        pullChildren();
        this.mDecorToolbar.restoreHierarchyState(sparseArray);
    }

    @Override // android.support.v7.widget.DecorContentParent
    public void saveToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        pullChildren();
        this.mDecorToolbar.saveHierarchyState(sparseArray);
    }

    public void setActionBarHideOffset(int i) {
        haltActionBarHideOffsetAnimations();
        this.mActionBarTop.setTranslationY(-Math.max(0, Math.min(i, this.mActionBarTop.getHeight())));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.mActionBarVisibilityCallback = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            this.mActionBarVisibilityCallback.onWindowVisibilityChanged(this.mWindowVisibility);
            int i = this.mLastSystemUiVisibility;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                int[] iArr = cww.a;
                cwk.e(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.mHasNonEmbeddedTabs = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.mHideOnContentScroll) {
            this.mHideOnContentScroll = z;
            if (z) {
                return;
            }
            haltActionBarHideOffsetAnimations();
            setActionBarHideOffset(0);
        }
    }

    @Override // android.support.v7.widget.DecorContentParent
    public void setIcon(int i) {
        pullChildren();
        this.mDecorToolbar.setIcon(i);
    }

    @Override // android.support.v7.widget.DecorContentParent
    public void setLogo(int i) {
        pullChildren();
        this.mDecorToolbar.setLogo(i);
    }

    @Override // android.support.v7.widget.DecorContentParent
    public void setMenu(Menu menu, MenuPresenter.Callback callback) {
        pullChildren();
        this.mDecorToolbar.setMenu(menu, callback);
    }

    @Override // android.support.v7.widget.DecorContentParent
    public void setMenuPrepared() {
        pullChildren();
        this.mDecorToolbar.setMenuPrepared();
    }

    public void setOverlayMode(boolean z) {
        this.mOverlayMode = z;
    }

    @Override // android.support.v7.widget.DecorContentParent
    public void setWindowCallback(Window.Callback callback) {
        pullChildren();
        this.mDecorToolbar.setWindowCallback(callback);
    }

    @Override // android.support.v7.widget.DecorContentParent
    public void setWindowTitle(CharSequence charSequence) {
        pullChildren();
        this.mDecorToolbar.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.support.v7.widget.DecorContentParent
    public boolean showOverflowMenu() {
        pullChildren();
        return this.mDecorToolbar.showOverflowMenu();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWindowVisibility = 0;
        this.mBaseContentInsets = new Rect();
        this.mLastBaseContentInsets = new Rect();
        this.mContentInsets = new Rect();
        this.mSystemInsets = new Rect();
        this.mTmpRect = new Rect();
        this.mDecorFitsSystemWindows = true;
        this.mActionBarExtendsIntoSystemInsets = false;
        this.mBaseInnerInsetsRect = new Rect();
        this.mLastBaseInnerInsetsRect = new Rect();
        this.mInnerInsetsRect = new Rect();
        this.mLastInnerInsetsRect = new Rect();
        cyh cyhVar = cyh.a;
        this.mBaseInnerInsets = cyhVar;
        this.mLastBaseInnerInsets = cyhVar;
        this.mInnerInsets = cyhVar;
        this.mLastInnerInsets = cyhVar;
        this.mTopAnimatorListener = new AnimatorListenerAdapter() { // from class: android.support.v7.widget.ActionBarOverlayLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.mCurrentActionBarTopAnimator = null;
                actionBarOverlayLayout.mAnimatingForFling = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.mCurrentActionBarTopAnimator = null;
                actionBarOverlayLayout.mAnimatingForFling = false;
            }
        };
        this.mRemoveActionBarHideOffset = new Runnable() { // from class: android.support.v7.widget.ActionBarOverlayLayout.2
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.haltActionBarHideOffsetAnimations();
                ActionBarOverlayLayout.this.mCurrentActionBarTopAnimator = ActionBarOverlayLayout.this.mActionBarTop.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.mTopAnimatorListener);
            }
        };
        this.mAddActionBarHideOffset = new Runnable() { // from class: android.support.v7.widget.ActionBarOverlayLayout.3
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.haltActionBarHideOffsetAnimations();
                ActionBarOverlayLayout.this.mCurrentActionBarTopAnimator = ActionBarOverlayLayout.this.mActionBarTop.animate().translationY(-ActionBarOverlayLayout.this.mActionBarTop.getHeight()).setListener(ActionBarOverlayLayout.this.mTopAnimatorListener);
            }
        };
        init(context);
        this.mParentHelper = new cvp();
        NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = new NoSystemUiLayoutFlagView(context);
        this.mNoSystemUiLayoutFlagView = noSystemUiLayoutFlagView;
        addView(noSystemUiLayoutFlagView);
    }

    @Override // defpackage.cvn
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // defpackage.cvn
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.cvn
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // defpackage.cvo
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // android.support.v7.widget.DecorContentParent
    public void setIcon(Drawable drawable) {
        pullChildren();
        this.mDecorToolbar.setIcon(drawable);
    }

    @Override // defpackage.cvn
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.cvn
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override // android.support.v7.widget.DecorContentParent
    public void setUiOptions(int i) {
    }
}
