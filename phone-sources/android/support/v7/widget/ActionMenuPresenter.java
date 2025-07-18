package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.view.ActionBarPolicy;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.BaseMenuPresenter;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuView;
import android.support.v7.view.menu.ShowableListMenu;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import defpackage.cup;
import defpackage.ez;
import defpackage.fb;
import defpackage.fc;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class ActionMenuPresenter extends BaseMenuPresenter implements cup {
    private static final String TAG = "ActionMenuPresenter";
    private final SparseBooleanArray mActionButtonGroups;
    ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    OverflowMenuButton mOverflowButton;
    OverflowPopup mOverflowPopup;
    private Drawable mPendingOverflowIcon;
    private boolean mPendingOverflowIconSet;
    private ActionMenuPopupCallback mPopupCallback;
    final PopupPresenterCallback mPopupPresenterCallback;
    OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    /* compiled from: PG */
    class ActionButtonSubmenu extends MenuPopupHelper {
        public ActionButtonSubmenu(Context context, fc fcVar, View view) {
            super(context, fcVar, view, false, R.attr.actionOverflowMenuStyle);
            if (!fcVar.m.isActionButton()) {
                View view2 = ActionMenuPresenter.this.mOverflowButton;
                setAnchorView(view2 == null ? (View) ActionMenuPresenter.this.mMenuView : view2);
            }
            setPresenterCallback(ActionMenuPresenter.this.mPopupPresenterCallback);
        }

        @Override // android.support.v7.view.menu.MenuPopupHelper
        protected void onDismiss() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.mActionButtonPopup = null;
            actionMenuPresenter.mOpenSubMenuId = 0;
            super.onDismiss();
        }
    }

    /* compiled from: PG */
    class ActionMenuPopupCallback extends ActionMenuItemView.PopupCallback {
        public ActionMenuPopupCallback() {
        }

        @Override // android.support.v7.view.menu.ActionMenuItemView.PopupCallback
        public ShowableListMenu getPopup() {
            ActionButtonSubmenu actionButtonSubmenu = ActionMenuPresenter.this.mActionButtonPopup;
            if (actionButtonSubmenu != null) {
                return actionButtonSubmenu.getPopup();
            }
            return null;
        }
    }

    /* compiled from: PG */
    class OpenOverflowRunnable implements Runnable {
        private OverflowPopup mPopup;

        public OpenOverflowRunnable(OverflowPopup overflowPopup) {
            this.mPopup = overflowPopup;
        }

        @Override // java.lang.Runnable
        public void run() {
            fb fbVar;
            ez ezVar;
            if (ActionMenuPresenter.this.mMenu != null && (ezVar = (fbVar = ActionMenuPresenter.this.mMenu).b) != null) {
                ezVar.onMenuModeChange(fbVar);
            }
            View view = (View) ActionMenuPresenter.this.mMenuView;
            if (view != null && view.getWindowToken() != null && this.mPopup.tryShow()) {
                ActionMenuPresenter.this.mOverflowPopup = this.mPopup;
            }
            ActionMenuPresenter.this.mPostedOpenRunnable = null;
        }
    }

    /* compiled from: PG */
    class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {
        public OverflowMenuButton(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.setTooltipText(this, getContentDescription());
            setOnTouchListener(new ForwardingListener(this) { // from class: android.support.v7.widget.ActionMenuPresenter.OverflowMenuButton.1
                @Override // android.support.v7.widget.ForwardingListener
                public ShowableListMenu getPopup() {
                    OverflowPopup overflowPopup = ActionMenuPresenter.this.mOverflowPopup;
                    if (overflowPopup == null) {
                        return null;
                    }
                    return overflowPopup.getPopup();
                }

                @Override // android.support.v7.widget.ForwardingListener
                public boolean onForwardingStarted() {
                    ActionMenuPresenter.this.showOverflowMenu();
                    return true;
                }

                @Override // android.support.v7.widget.ForwardingListener
                public boolean onForwardingStopped() {
                    ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                    if (actionMenuPresenter.mPostedOpenRunnable != null) {
                        return false;
                    }
                    actionMenuPresenter.hideOverflowMenu();
                    return true;
                }
            });
        }

        @Override // android.support.v7.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerAfter() {
            return false;
        }

        @Override // android.support.v7.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerBefore() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.showOverflowMenu();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* compiled from: PG */
    class OverflowPopup extends MenuPopupHelper {
        public OverflowPopup(Context context, fb fbVar, View view, boolean z) {
            super(context, fbVar, view, z, R.attr.actionOverflowMenuStyle);
            setGravity(8388613);
            setPresenterCallback(ActionMenuPresenter.this.mPopupPresenterCallback);
        }

        @Override // android.support.v7.view.menu.MenuPopupHelper
        protected void onDismiss() {
            if (ActionMenuPresenter.this.mMenu != null) {
                ActionMenuPresenter.this.mMenu.close();
            }
            ActionMenuPresenter.this.mOverflowPopup = null;
            super.onDismiss();
        }
    }

    /* compiled from: PG */
    class PopupPresenterCallback implements MenuPresenter.Callback {
        public PopupPresenterCallback() {
        }

        @Override // android.support.v7.view.menu.MenuPresenter.Callback
        public void onCloseMenu(fb fbVar, boolean z) {
            if (fbVar instanceof fc) {
                fbVar.a().i(false);
            }
            MenuPresenter.Callback callback = ActionMenuPresenter.this.getCallback();
            if (callback != null) {
                callback.onCloseMenu(fbVar, z);
            }
        }

        @Override // android.support.v7.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(fb fbVar) {
            if (fbVar == ActionMenuPresenter.this.mMenu) {
                return false;
            }
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.mOpenSubMenuId = ((fc) fbVar).m.getItemId();
            MenuPresenter.Callback callback = actionMenuPresenter.getCallback();
            if (callback != null) {
                return callback.onOpenSubMenu(fbVar);
            }
            return false;
        }
    }

    /* compiled from: PG */
    class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v7.widget.ActionMenuPresenter.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public int openSubMenuId;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.openSubMenuId);
        }

        public SavedState(Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.mActionButtonGroups = new SparseBooleanArray();
        this.mPopupPresenterCallback = new PopupPresenterCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View findViewForItem(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof MenuView.ItemView) && ((MenuView.ItemView) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.support.v7.view.menu.BaseMenuPresenter
    public void bindItemView(MenuItemImpl menuItemImpl, MenuView.ItemView itemView) {
        itemView.initialize(menuItemImpl, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.mMenuView);
        if (this.mPopupCallback == null) {
            this.mPopupCallback = new ActionMenuPopupCallback();
        }
        actionMenuItemView.setPopupCallback(this.mPopupCallback);
    }

    public boolean dismissPopupMenus() {
        return hideOverflowMenu() | hideSubMenus();
    }

    @Override // android.support.v7.view.menu.BaseMenuPresenter
    public boolean filterLeftoverView(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.mOverflowButton) {
            return false;
        }
        super.filterLeftoverView(viewGroup, i);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.view.menu.BaseMenuPresenter, android.support.v7.view.menu.MenuPresenter
    public boolean flagActionItems() {
        ArrayList arrayListF;
        int size;
        int i;
        int iMeasureChildForCells;
        boolean z;
        int i2;
        char c;
        ActionMenuPresenter actionMenuPresenter = this;
        fb fbVar = actionMenuPresenter.mMenu;
        View view = null;
        boolean z2 = false;
        if (fbVar != null) {
            arrayListF = fbVar.f();
            size = arrayListF.size();
        } else {
            arrayListF = null;
            size = 0;
        }
        int i3 = actionMenuPresenter.mMaxItems;
        int i4 = actionMenuPresenter.mActionItemWidthLimit;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.mMenuView;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListF.get(i7);
            if (menuItemImpl.requiresActionButton()) {
                i5++;
            } else if (menuItemImpl.requestsActionButton()) {
                i6++;
            } else {
                z3 = true;
            }
            if (actionMenuPresenter.mExpandedActionViewsExclusive && menuItemImpl.isActionViewExpanded()) {
                i3 = 0;
            }
        }
        if (actionMenuPresenter.mReserveOverflow && (z3 || i6 + i5 > i3)) {
            i3--;
        }
        int i8 = i3 - i5;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.mActionButtonGroups;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.mStrictWidthLimit) {
            int i9 = actionMenuPresenter.mMinCellSize;
            iMeasureChildForCells = i4 / i9;
            i = i9 + ((i4 % i9) / iMeasureChildForCells);
        } else {
            i = 0;
            iMeasureChildForCells = 0;
        }
        int i10 = 0;
        int i11 = 0;
        ActionMenuPresenter actionMenuPresenter2 = actionMenuPresenter;
        while (i10 < size) {
            MenuItemImpl menuItemImpl2 = (MenuItemImpl) arrayListF.get(i10);
            if (menuItemImpl2.requiresActionButton()) {
                View itemView = actionMenuPresenter2.getItemView(menuItemImpl2, view, viewGroup);
                if (actionMenuPresenter2.mStrictWidthLimit) {
                    iMeasureChildForCells -= ActionMenuView.measureChildForCells(itemView, i, iMeasureChildForCells, iMakeMeasureSpec, z2 ? 1 : 0);
                } else {
                    itemView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = itemView.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int groupId = menuItemImpl2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                menuItemImpl2.setIsActionButton(true);
                z = z2 ? 1 : 0;
                i2 = size;
            } else if (menuItemImpl2.requestsActionButton()) {
                int groupId2 = menuItemImpl2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = z2;
                if (i8 > 0 || z4) {
                    z5 = i4 > 0 && (!actionMenuPresenter2.mStrictWidthLimit || iMeasureChildForCells > 0);
                }
                char c2 = z5 ? 1 : 0;
                i2 = size;
                boolean z6 = z5;
                if (z5) {
                    View itemView2 = actionMenuPresenter2.getItemView(menuItemImpl2, null, viewGroup);
                    if (actionMenuPresenter2.mStrictWidthLimit) {
                        int iMeasureChildForCells2 = ActionMenuView.measureChildForCells(itemView2, i, iMeasureChildForCells, iMakeMeasureSpec, 0);
                        iMeasureChildForCells -= iMeasureChildForCells2;
                        c = iMeasureChildForCells2 == 0 ? (char) 0 : (char) 1;
                    } else {
                        itemView2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        c = c2;
                    }
                    int measuredWidth2 = itemView2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 = c & ((!actionMenuPresenter2.mStrictWidthLimit ? i4 + i11 > 0 : i4 >= 0) ? (char) 0 : (char) 1);
                }
                if (z6 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i12 = 0; i12 < i10; i12++) {
                        MenuItemImpl menuItemImpl3 = (MenuItemImpl) arrayListF.get(i12);
                        if (menuItemImpl3.getGroupId() == groupId2) {
                            if (menuItemImpl3.isActionButton()) {
                                i8++;
                            }
                            menuItemImpl3.setIsActionButton(false);
                        }
                    }
                }
                if (z6) {
                    i8--;
                }
                menuItemImpl2.setIsActionButton(z6);
                z = false;
            } else {
                z = z2 ? 1 : 0;
                i2 = size;
                menuItemImpl2.setIsActionButton(z);
            }
            i10++;
            z2 = z;
            size = i2;
            view = null;
            actionMenuPresenter2 = this;
        }
        return true;
    }

    @Override // android.support.v7.view.menu.BaseMenuPresenter
    public View getItemView(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.hasCollapsibleActionView()) {
            actionView = super.getItemView(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(true != menuItemImpl.isActionViewExpanded() ? 0 : 8);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // android.support.v7.view.menu.BaseMenuPresenter, android.support.v7.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        MenuView menuView = this.mMenuView;
        MenuView menuView2 = super.getMenuView(viewGroup);
        if (menuView != menuView2) {
            ((ActionMenuView) menuView2).setPresenter(this);
        }
        return menuView2;
    }

    public Drawable getOverflowIcon() {
        OverflowMenuButton overflowMenuButton = this.mOverflowButton;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (this.mPendingOverflowIconSet) {
            return this.mPendingOverflowIcon;
        }
        return null;
    }

    public boolean hideOverflowMenu() {
        Object obj;
        OpenOverflowRunnable openOverflowRunnable = this.mPostedOpenRunnable;
        if (openOverflowRunnable != null && (obj = this.mMenuView) != null) {
            ((View) obj).removeCallbacks(openOverflowRunnable);
            this.mPostedOpenRunnable = null;
            return true;
        }
        OverflowPopup overflowPopup = this.mOverflowPopup;
        if (overflowPopup == null) {
            return false;
        }
        overflowPopup.dismiss();
        return true;
    }

    public boolean hideSubMenus() {
        ActionButtonSubmenu actionButtonSubmenu = this.mActionButtonPopup;
        if (actionButtonSubmenu == null) {
            return false;
        }
        actionButtonSubmenu.dismiss();
        return true;
    }

    @Override // android.support.v7.view.menu.BaseMenuPresenter, android.support.v7.view.menu.MenuPresenter
    public void initForMenu(Context context, fb fbVar) {
        super.initForMenu(context, fbVar);
        Resources resources = context.getResources();
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(context);
        if (!this.mReserveOverflowSet) {
            this.mReserveOverflow = true;
        }
        if (!this.mWidthLimitSet) {
            this.mWidthLimit = actionBarPolicy.getEmbeddedMenuWidthLimit();
        }
        if (!this.mMaxItemsSet) {
            this.mMaxItems = actionBarPolicy.getMaxActionButtons();
        }
        int measuredWidth = this.mWidthLimit;
        if (this.mReserveOverflow) {
            if (this.mOverflowButton == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.mSystemContext);
                this.mOverflowButton = overflowMenuButton;
                if (this.mPendingOverflowIconSet) {
                    overflowMenuButton.setImageDrawable(this.mPendingOverflowIcon);
                    this.mPendingOverflowIcon = null;
                    this.mPendingOverflowIconSet = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.mOverflowButton.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.mOverflowButton.getMeasuredWidth();
        } else {
            this.mOverflowButton = null;
        }
        this.mActionItemWidthLimit = measuredWidth;
        this.mMinCellSize = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean isOverflowMenuShowPending() {
        return this.mPostedOpenRunnable != null || isOverflowMenuShowing();
    }

    public boolean isOverflowMenuShowing() {
        OverflowPopup overflowPopup = this.mOverflowPopup;
        return overflowPopup != null && overflowPopup.isShowing();
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    @Override // android.support.v7.view.menu.BaseMenuPresenter, android.support.v7.view.menu.MenuPresenter
    public void onCloseMenu(fb fbVar, boolean z) {
        dismissPopupMenus();
        super.onCloseMenu(fbVar, z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.mMaxItemsSet) {
            this.mMaxItems = ActionBarPolicy.get(this.mContext).getMaxActionButtons();
        }
        fb fbVar = this.mMenu;
        if (fbVar != null) {
            fbVar.n(true);
        }
    }

    @Override // android.support.v7.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).openSubMenuId) > 0 && (menuItemFindItem = this.mMenu.findItem(i)) != null) {
            onSubMenuSelected((fc) menuItemFindItem.getSubMenu());
        }
    }

    @Override // android.support.v7.view.menu.MenuPresenter
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.openSubMenuId = this.mOpenSubMenuId;
        return savedState;
    }

    @Override // android.support.v7.view.menu.BaseMenuPresenter, android.support.v7.view.menu.MenuPresenter
    public boolean onSubMenuSelected(fc fcVar) {
        boolean z = false;
        if (fcVar.hasVisibleItems()) {
            fc fcVar2 = fcVar;
            while (true) {
                fb fbVar = fcVar2.l;
                if (fbVar == this.mMenu) {
                    break;
                }
                fcVar2 = (fc) fbVar;
            }
            View viewFindViewForItem = findViewForItem(fcVar2.m);
            if (viewFindViewForItem != null) {
                this.mOpenSubMenuId = fcVar.m.getItemId();
                int size = fcVar.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    MenuItem item = fcVar.getItem(i);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i++;
                }
                ActionButtonSubmenu actionButtonSubmenu = new ActionButtonSubmenu(this.mContext, fcVar, viewFindViewForItem);
                this.mActionButtonPopup = actionButtonSubmenu;
                actionButtonSubmenu.setForceShowIcon(z);
                this.mActionButtonPopup.show();
                super.onSubMenuSelected(fcVar);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cup
    public void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
            return;
        }
        fb fbVar = this.mMenu;
        if (fbVar != null) {
            fbVar.i(false);
        }
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.mExpandedActionViewsExclusive = z;
    }

    public void setItemLimit(int i) {
        this.mMaxItems = i;
        this.mMaxItemsSet = true;
    }

    public void setMenuView(ActionMenuView actionMenuView) {
        this.mMenuView = actionMenuView;
        actionMenuView.initialize(this.mMenu);
    }

    public void setOverflowIcon(Drawable drawable) {
        OverflowMenuButton overflowMenuButton = this.mOverflowButton;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
        } else {
            this.mPendingOverflowIconSet = true;
            this.mPendingOverflowIcon = drawable;
        }
    }

    public void setReserveOverflow(boolean z) {
        this.mReserveOverflow = z;
        this.mReserveOverflowSet = true;
    }

    public void setWidthLimit(int i, boolean z) {
        this.mWidthLimit = i;
        this.mStrictWidthLimit = z;
        this.mWidthLimitSet = true;
    }

    @Override // android.support.v7.view.menu.BaseMenuPresenter
    public boolean shouldIncludeItem(int i, MenuItemImpl menuItemImpl) {
        return menuItemImpl.isActionButton();
    }

    public boolean showOverflowMenu() {
        fb fbVar;
        if (!this.mReserveOverflow || isOverflowMenuShowing() || (fbVar = this.mMenu) == null || this.mMenuView == null || this.mPostedOpenRunnable != null || fbVar.e().isEmpty()) {
            return false;
        }
        this.mPostedOpenRunnable = new OpenOverflowRunnable(new OverflowPopup(this.mContext, this.mMenu, this.mOverflowButton, true));
        ((View) this.mMenuView).post(this.mPostedOpenRunnable);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    @Override // android.support.v7.view.menu.BaseMenuPresenter, android.support.v7.view.menu.MenuPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateMenuView(boolean r5) {
        /*
            r4 = this;
            super.updateMenuView(r5)
            android.support.v7.view.menu.MenuView r5 = r4.mMenuView
            android.view.View r5 = (android.view.View) r5
            r5.requestLayout()
            fb r5 = r4.mMenu
            r0 = 0
            if (r5 == 0) goto L2d
            r5.m()
            java.util.ArrayList r5 = r5.d
            int r1 = r5.size()
            r2 = r0
        L19:
            if (r2 >= r1) goto L2d
            java.lang.Object r3 = r5.get(r2)
            android.support.v7.view.menu.MenuItemImpl r3 = (android.support.v7.view.menu.MenuItemImpl) r3
            cur r3 = r3.getSupportActionProvider()
            if (r3 == 0) goto L2a
            r3.setSubUiVisibilityListener(r4)
        L2a:
            int r2 = r2 + 1
            goto L19
        L2d:
            fb r5 = r4.mMenu
            if (r5 == 0) goto L36
            java.util.ArrayList r5 = r5.e()
            goto L37
        L36:
            r5 = 0
        L37:
            boolean r1 = r4.mReserveOverflow
            if (r1 == 0) goto L84
            if (r5 == 0) goto L84
            int r1 = r5.size()
            r2 = 1
            if (r1 != r2) goto L51
            java.lang.Object r5 = r5.get(r0)
            android.support.v7.view.menu.MenuItemImpl r5 = (android.support.v7.view.menu.MenuItemImpl) r5
            boolean r5 = r5.isActionViewExpanded()
            r0 = r5 ^ 1
            goto L54
        L51:
            if (r1 <= 0) goto L54
            r0 = r2
        L54:
            if (r0 == 0) goto L84
            android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton r5 = r4.mOverflowButton
            if (r5 != 0) goto L63
            android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton r5 = new android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton
            android.content.Context r0 = r4.mSystemContext
            r5.<init>(r0)
            r4.mOverflowButton = r5
        L63:
            android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton r5 = r4.mOverflowButton
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.support.v7.view.menu.MenuView r0 = r4.mMenuView
            if (r5 == r0) goto L97
            if (r5 == 0) goto L76
            android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton r0 = r4.mOverflowButton
            r5.removeView(r0)
        L76:
            android.support.v7.view.menu.MenuView r5 = r4.mMenuView
            android.support.v7.widget.ActionMenuView r5 = (android.support.v7.widget.ActionMenuView) r5
            android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton r0 = r4.mOverflowButton
            android.support.v7.widget.ActionMenuView$LayoutParams r1 = r5.generateOverflowButtonLayoutParams()
            r5.addView(r0, r1)
            goto L97
        L84:
            android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton r5 = r4.mOverflowButton
            if (r5 == 0) goto L97
            android.view.ViewParent r5 = r5.getParent()
            android.support.v7.view.menu.MenuView r0 = r4.mMenuView
            if (r5 != r0) goto L97
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton r5 = r4.mOverflowButton
            r0.removeView(r5)
        L97:
            android.support.v7.view.menu.MenuView r5 = r4.mMenuView
            android.support.v7.widget.ActionMenuView r5 = (android.support.v7.widget.ActionMenuView) r5
            boolean r0 = r4.mReserveOverflow
            r5.setOverflowReserved(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuPresenter.updateMenuView(boolean):void");
    }
}
