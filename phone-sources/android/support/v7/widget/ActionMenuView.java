package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.ez;
import defpackage.fa;
import defpackage.fb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuView, fa {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private fb mMenu;
    ez mMenuBuilderCallback;
    private int mMinCellSize;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    /* compiled from: PG */
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    /* compiled from: PG */
    public class LayoutParams extends LinearLayoutCompat.LayoutParams {

        @ViewDebug.ExportedProperty
        public int cellsUsed;

        @ViewDebug.ExportedProperty
        public boolean expandable;
        boolean expanded;

        @ViewDebug.ExportedProperty
        public int extraPixels;

        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.isOverflowButton = false;
        }

        LayoutParams(int i, int i2, boolean z) {
            super(i, i2);
            this.isOverflowButton = z;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* compiled from: PG */
    class MenuBuilderCallback implements ez {
        public MenuBuilderCallback() {
        }

        @Override // defpackage.ez
        public boolean onMenuItemSelected(fb fbVar, MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.mOnMenuItemClickListener;
            return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
        }

        @Override // defpackage.ez
        public void onMenuModeChange(fb fbVar) {
            ez ezVar = ActionMenuView.this.mMenuBuilderCallback;
            if (ezVar != null) {
                ezVar.onMenuModeChange(fbVar);
            }
        }
    }

    /* compiled from: PG */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int measureChildForCells(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r0 = (android.support.v7.widget.ActionMenuView.LayoutParams) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof android.support.v7.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            android.support.v7.view.menu.ActionMenuItemView r9 = (android.support.v7.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L28
            boolean r9 = r9.hasText()
            if (r9 == 0) goto L28
            r9 = r1
            goto L29
        L28:
            r9 = r2
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r2
        L4d:
            boolean r7 = r0.isOverflowButton
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            goto L55
        L54:
            r1 = r2
        L55:
            r0.expandable = r1
            r0.cellsUsed = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.measureChildForCells(android.view.View, int, int, int, int):int");
    }

    /* JADX WARN: Type inference failed for: r2v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v52 */
    private void onMeasureExactFormat(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        ?? r2;
        boolean z4;
        ?? r3;
        int i8;
        int i9;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i10 = size - paddingLeft;
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i11 = this.mMinCellSize;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = i11 + (i13 / i12);
        int childCount = getChildCount();
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z5 = false;
        int i17 = 0;
        int iMax2 = 0;
        long j = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            int i18 = size2;
            int i19 = i12;
            if (childAt.getVisibility() == 8) {
                i8 = paddingTop;
                i9 = i14;
                i12 = i19;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                i17++;
                if (z6) {
                    int i20 = this.mGeneratedItemPadding;
                    z4 = z6;
                    r3 = 0;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    z4 = z6;
                    r3 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.expanded = r3;
                layoutParams.extraPixels = r3;
                layoutParams.cellsUsed = r3;
                layoutParams.expandable = r3;
                layoutParams.leftMargin = r3;
                layoutParams.rightMargin = r3;
                layoutParams.preventEdgeOffset = z4 && ((ActionMenuItemView) childAt).hasText();
                int i21 = i15;
                int iMeasureChildForCells = measureChildForCells(childAt, i14, true != layoutParams.isOverflowButton ? i19 : 1, childMeasureSpec, paddingTop);
                iMax = Math.max(iMax, iMeasureChildForCells);
                i15 = layoutParams.expandable ? i21 + 1 : i21;
                z5 |= layoutParams.isOverflowButton;
                i12 = i19 - iMeasureChildForCells;
                i8 = paddingTop;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (iMeasureChildForCells == 1) {
                    i9 = i14;
                    j |= 1 << i16;
                } else {
                    i9 = i14;
                }
            }
            i16++;
            i14 = i9;
            size2 = i18;
            paddingTop = i8;
        }
        int i22 = size2;
        int i23 = i14;
        int i24 = i12;
        int i25 = i15;
        int i26 = iMax2;
        char c = 2;
        if (z5 && i17 == 2) {
            i17 = 2;
            z = true;
        } else {
            z = false;
        }
        int i27 = i24;
        boolean z7 = false;
        while (i25 > 0 && i27 > 0) {
            int i28 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            long j2 = 0;
            char c2 = c;
            i4 = i26;
            int i29 = 0;
            int i30 = 0;
            while (i29 < childCount) {
                int i31 = i29;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i29).getLayoutParams();
                boolean z8 = z;
                if (layoutParams2.expandable) {
                    int i32 = layoutParams2.cellsUsed;
                    if (i32 < i28) {
                        j2 = 1 << i31;
                        i28 = i32;
                        i30 = 1;
                    } else if (i32 == i28) {
                        j2 |= 1 << i31;
                        i30++;
                    }
                }
                i29 = i31 + 1;
                z = z8;
            }
            boolean z9 = z;
            j |= j2;
            if (i30 > i27) {
                i3 = i10;
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount) {
                View childAt2 = getChildAt(i34);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i35 = i10;
                int i36 = i34;
                long j3 = 1 << i34;
                if ((j2 & j3) != 0) {
                    if (z9 && layoutParams3.preventEdgeOffset) {
                        z3 = true;
                        r2 = 1;
                        if (i27 == 1) {
                            int i37 = this.mGeneratedItemPadding;
                            childAt2.setPadding(i37 + i23, 0, i37, 0);
                            i7 = 1;
                        }
                        layoutParams3.cellsUsed += r2;
                        layoutParams3.expanded = r2;
                        i27 = i7 - 1;
                    } else {
                        z3 = true;
                    }
                    i7 = i27;
                    r2 = z3;
                    layoutParams3.cellsUsed += r2;
                    layoutParams3.expanded = r2;
                    i27 = i7 - 1;
                } else if (layoutParams3.cellsUsed == i33) {
                    j |= j3;
                }
                i34 = i36 + 1;
                i10 = i35;
            }
            z7 = true;
            c = c2;
            i26 = i4;
            z = z9;
            i10 = i10;
        }
        i3 = i10;
        i4 = i26;
        if (z5 || i17 != 1) {
            i5 = i17;
            z2 = false;
        } else {
            z2 = true;
            i5 = 1;
        }
        if (i27 <= 0 || j == 0 || (i27 >= i5 - 1 && !z2 && iMax <= 1)) {
            i6 = 0;
        } else {
            float fBitCount = Long.bitCount(j);
            if (z2) {
                i6 = 0;
            } else {
                int i38 = childCount - 1;
                if ((j & 1) != 0) {
                    i6 = 0;
                    if (!((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i6 = 0;
                }
                if (((1 << i38) & j) != 0 && !((LayoutParams) getChildAt(i38).getLayoutParams()).preventEdgeOffset) {
                    fBitCount -= 0.5f;
                }
            }
            int i39 = fBitCount > 0.0f ? (int) ((i27 * i23) / fBitCount) : i6;
            int i40 = i6;
            while (i40 < childCount) {
                if (((1 << i40) & j) != 0) {
                    View childAt3 = getChildAt(i40);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.extraPixels = i39;
                        layoutParams4.expanded = true;
                        if (i40 == 0) {
                            if (!layoutParams4.preventEdgeOffset) {
                                layoutParams4.leftMargin = (-i39) / 2;
                            }
                            i40 = i6;
                        }
                    } else if (layoutParams4.isOverflowButton) {
                        layoutParams4.extraPixels = i39;
                        layoutParams4.expanded = true;
                        layoutParams4.rightMargin = (-i39) / 2;
                    } else {
                        int i41 = childCount - 1;
                        if (i40 != 0) {
                            layoutParams4.leftMargin = i39 / 2;
                        }
                        if (i40 != i41) {
                            layoutParams4.rightMargin = i39 / 2;
                        }
                    }
                    z7 = true;
                }
                i40++;
            }
        }
        if (z7) {
            while (i6 < childCount) {
                View childAt4 = getChildAt(i6);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.expanded) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.cellsUsed * i23) + layoutParams5.extraPixels, 1073741824), childMeasureSpec);
                }
                i6++;
            }
        }
        setMeasuredDimension(i3, mode == 1073741824 ? i22 : i4);
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.isOverflowButton = true;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            fb fbVar = new fb(context);
            this.mMenu = fbVar;
            fbVar.r(new MenuBuilderCallback());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.mPresenter = actionMenuPresenter;
            actionMenuPresenter.setReserveOverflow(true);
            ActionMenuPresenter actionMenuPresenter2 = this.mPresenter;
            MenuPresenter.Callback actionMenuPresenterCallback = this.mActionMenuPresenterCallback;
            if (actionMenuPresenterCallback == null) {
                actionMenuPresenterCallback = new ActionMenuPresenterCallback();
            }
            actionMenuPresenter2.setCallback(actionMenuPresenterCallback);
            this.mMenu.h(this.mPresenter, this.mPopupContext);
            this.mPresenter.setMenuView(this);
        }
        return this.mMenu;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.mPresenter.getOverflowIcon();
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    @Override // android.support.v7.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    protected boolean hasSupportDividerBeforeChildAt(int i) {
        boolean zNeedsDividerAfter = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            zNeedsDividerAfter = ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        return (i <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? zNeedsDividerAfter : ((ActionMenuChildView) childAt2).needsDividerBefore() | zNeedsDividerAfter;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.hideOverflowMenu();
    }

    @Override // android.support.v7.view.menu.MenuView
    public void initialize(fb fbVar) {
        this.mMenu = fbVar;
    }

    @Override // defpackage.fa
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.B(menuItemImpl, 0);
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowing();
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int paddingLeft;
        if (!this.mFormatItems) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = i6 / 2;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i8)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zIsLayoutRtl) {
                        paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    hasSupportDividerBeforeChildAt(i8);
                    i10++;
                }
            }
            i8++;
        }
        if (childCount == 1) {
            if (i9 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i12 = i5 - (measuredHeight2 / 2);
                int i13 = (i7 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i13, i12, measuredWidth2 + i13, measuredHeight2 + i12);
                return;
            }
            childCount = 1;
        }
        int i14 = i10 - (i9 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (zIsLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i16 = width2 - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + layoutParams2.leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i19 = paddingLeft2 + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = i19 + measuredWidth4 + layoutParams3.rightMargin + iMax;
            }
        }
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i, int i2) {
        fb fbVar;
        boolean z = this.mFormatItems;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.mFormatItems = z2;
        if (z != z2) {
            this.mFormatItemsWidth = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.mFormatItems && (fbVar = this.mMenu) != null && size != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = size;
            fbVar.n(true);
        }
        int childCount = getChildCount();
        if (this.mFormatItems && childCount > 0) {
            onMeasureExactFormat(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
            layoutParams.rightMargin = 0;
            layoutParams.leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public fb peekMenu() {
        return this.mMenu;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.mPresenter.setExpandedActionViewsExclusive(z);
    }

    public void setMenuCallbacks(MenuPresenter.Callback callback, ez ezVar) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = ezVar;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.mPresenter.setOverflowIcon(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.mReserveOverflow = z;
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
        actionMenuPresenter.setMenuView(this);
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.showOverflowMenu();
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f);
        this.mGeneratedItemPadding = (int) (f * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
            if (layoutParams2.gravity <= 0) {
                layoutParams2.gravity = 16;
            }
            return layoutParams2;
        }
        return generateDefaultLayoutParams();
    }

    /* compiled from: PG */
    class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        @Override // android.support.v7.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(fb fbVar) {
            return false;
        }

        @Override // android.support.v7.view.menu.MenuPresenter.Callback
        public void onCloseMenu(fb fbVar, boolean z) {
        }
    }
}
