package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.videos.R;
import defpackage.cti;
import defpackage.cuq;
import defpackage.cur;
import defpackage.fb;
import defpackage.fc;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MenuItemImpl implements cti {
    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int ENABLED = 16;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private static final int IS_ACTION = 32;
    static final int NO_ICON = 0;
    private static final int SHOW_AS_ACTION_MASK = 3;
    private static final String TAG = "MenuItemImpl";
    private cur mActionProvider;
    private View mActionView;
    private final int mCategoryOrder;
    private MenuItem.OnMenuItemClickListener mClickListener;
    private CharSequence mContentDescription;
    private final int mGroup;
    private Drawable mIconDrawable;
    private final int mId;
    private Intent mIntent;
    private Runnable mItemCallback;
    fb mMenu;
    private ContextMenu.ContextMenuInfo mMenuInfo;
    private MenuItem.OnActionExpandListener mOnActionExpandListener;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private int mShowAsAction;
    private fc mSubMenu;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;
    private CharSequence mTooltipText;
    private int mShortcutNumericModifiers = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    private int mShortcutAlphabeticModifiers = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    private int mIconResId = 0;
    private ColorStateList mIconTintList = null;
    private PorterDuff.Mode mIconTintMode = null;
    private boolean mHasIconTint = false;
    private boolean mHasIconTintMode = false;
    private boolean mNeedToApplyIconTint = false;
    private int mFlags = 16;
    private boolean mIsActionViewExpanded = false;

    public MenuItemImpl(fb fbVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.mMenu = fbVar;
        this.mId = i2;
        this.mGroup = i;
        this.mCategoryOrder = i3;
        this.mOrdering = i4;
        this.mTitle = charSequence;
        this.mShowAsAction = i5;
    }

    private static void appendModifier(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    private Drawable applyIconTintIfNecessary(Drawable drawable) {
        if (drawable != null && this.mNeedToApplyIconTint && (this.mHasIconTint || this.mHasIconTintMode)) {
            drawable = drawable.mutate();
            if (this.mHasIconTint) {
                drawable.setTintList(this.mIconTintList);
            }
            if (this.mHasIconTintMode) {
                drawable.setTintMode(this.mIconTintMode);
            }
            this.mNeedToApplyIconTint = false;
        }
        return drawable;
    }

    public void actionFormatChanged() {
        this.mMenu.D();
    }

    @Override // defpackage.cti, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.mShowAsAction & 8) == 0) {
            return false;
        }
        if (this.mActionView == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.mOnActionExpandListener;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.mMenu.v(this);
        }
        return false;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public boolean expandActionView() {
        if (!hasCollapsibleActionView()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.mOnActionExpandListener;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.mMenu.x(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // defpackage.cti, android.view.MenuItem
    public View getActionView() {
        View view = this.mActionView;
        if (view != null) {
            return view;
        }
        cur curVar = this.mActionProvider;
        if (curVar == null) {
            return null;
        }
        View viewOnCreateActionView = curVar.onCreateActionView(this);
        this.mActionView = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.mShortcutAlphabeticModifiers;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.mShortcutAlphabeticChar;
    }

    Runnable getCallback() {
        return this.mItemCallback;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.mGroup;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.mIconDrawable;
        if (drawable != null) {
            return applyIconTintIfNecessary(drawable);
        }
        int i = this.mIconResId;
        if (i == 0) {
            return null;
        }
        Drawable drawable2 = AppCompatResources.getDrawable(this.mMenu.a, i);
        this.mIconResId = 0;
        this.mIconDrawable = drawable2;
        return applyIconTintIfNecessary(drawable2);
    }

    @Override // defpackage.cti, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.mIconTintList;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.mIconTintMode;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.mIntent;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.mId;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.mMenuInfo;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public int getNumericModifiers() {
        return this.mShortcutNumericModifiers;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.mShortcutNumericChar;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.mCategoryOrder;
    }

    public int getOrdering() {
        return this.mOrdering;
    }

    public char getShortcut() {
        return this.mMenu.z() ? this.mShortcutAlphabeticChar : this.mShortcutNumericChar;
    }

    public String getShortcutLabel() {
        char shortcut = getShortcut();
        if (shortcut == 0) {
            return "";
        }
        Resources resources = this.mMenu.a.getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.mMenu.a).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
        }
        int i = this.mMenu.z() ? this.mShortcutAlphabeticModifiers : this.mShortcutNumericModifiers;
        appendModifier(sb, i, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
        appendModifier(sb, i, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
        appendModifier(sb, i, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
        appendModifier(sb, i, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
        appendModifier(sb, i, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
        appendModifier(sb, i, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
        if (shortcut == '\b') {
            sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
        } else if (shortcut == '\n') {
            sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
        } else if (shortcut != ' ') {
            sb.append(shortcut);
        } else {
            sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.mSubMenu;
    }

    @Override // defpackage.cti
    public cur getSupportActionProvider() {
        return this.mActionProvider;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.mTitle;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.mTitleCondensed;
        return charSequence != null ? charSequence : this.mTitle;
    }

    public CharSequence getTitleForItemView(MenuView.ItemView itemView) {
        return (itemView == null || !itemView.prefersCondensedTitle()) ? getTitle() : getTitleCondensed();
    }

    @Override // defpackage.cti, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.mTooltipText;
    }

    public boolean hasCollapsibleActionView() {
        cur curVar;
        if ((this.mShowAsAction & 8) != 0) {
            if (this.mActionView == null && (curVar = this.mActionProvider) != null) {
                this.mActionView = curVar.onCreateActionView(this);
            }
            if (this.mActionView != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.mSubMenu != null;
    }

    public boolean invoke() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.mClickListener;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        fb fbVar = this.mMenu;
        if (fbVar.w(fbVar, this)) {
            return true;
        }
        Runnable runnable = this.mItemCallback;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        Intent intent = this.mIntent;
        if (intent != null) {
            try {
                this.mMenu.a.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e(TAG, "Can't find activity to handle intent; ignoring", e);
            }
        }
        cur curVar = this.mActionProvider;
        return curVar != null && curVar.onPerformDefaultAction();
    }

    public boolean isActionButton() {
        return (this.mFlags & 32) == 32;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.mIsActionViewExpanded;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.mFlags & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.mFlags & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.mFlags & 16) != 0;
    }

    public boolean isExclusiveCheckable() {
        return (this.mFlags & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        cur curVar = this.mActionProvider;
        return (curVar == null || !curVar.overridesItemVisibility()) ? (this.mFlags & 8) == 0 : (this.mFlags & 8) == 0 && this.mActionProvider.isVisible();
    }

    public boolean requestsActionButton() {
        return (this.mShowAsAction & 1) == 1;
    }

    public boolean requiresActionButton() {
        return (this.mShowAsAction & 2) == 2;
    }

    public boolean requiresOverflow() {
        return (requiresActionButton() || requestsActionButton()) ? false : true;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // defpackage.cti, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        setActionView(i);
        return this;
    }

    public void setActionViewExpanded(boolean z) {
        this.mIsActionViewExpanded = z;
        this.mMenu.n(false);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.mShortcutAlphabeticChar == c) {
            return this;
        }
        this.mShortcutAlphabeticChar = Character.toLowerCase(c);
        this.mMenu.n(false);
        return this;
    }

    public MenuItem setCallback(Runnable runnable) {
        this.mItemCallback = runnable;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.mFlags;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.mFlags = i2;
        if (i != i2) {
            this.mMenu.n(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.mFlags & 4) == 0) {
            setCheckedInt(z);
            return this;
        }
        fb fbVar = this.mMenu;
        int groupId = getGroupId();
        ArrayList arrayList = fbVar.c;
        int size = arrayList.size();
        fbVar.u();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i);
            if (menuItemImpl.getGroupId() == groupId && menuItemImpl.isExclusiveCheckable() && menuItemImpl.isCheckable()) {
                menuItemImpl.setCheckedInt(menuItemImpl == this);
            }
        }
        fbVar.t();
        return this;
    }

    public void setCheckedInt(boolean z) {
        int i = this.mFlags;
        int i2 = (true != z ? 0 : 2) | (i & (-3));
        this.mFlags = i2;
        if (i != i2) {
            this.mMenu.n(false);
        }
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.mFlags = z ? this.mFlags | 16 : this.mFlags & (-17);
        this.mMenu.n(false);
        return this;
    }

    public void setExclusiveCheckable(boolean z) {
        this.mFlags = (true != z ? 0 : 4) | (this.mFlags & (-5));
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.mIconDrawable = null;
        this.mIconResId = i;
        this.mNeedToApplyIconTint = true;
        this.mMenu.n(false);
        return this;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.mIconTintList = colorStateList;
        this.mHasIconTint = true;
        this.mNeedToApplyIconTint = true;
        this.mMenu.n(false);
        return this;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.mIconTintMode = mode;
        this.mHasIconTintMode = true;
        this.mNeedToApplyIconTint = true;
        this.mMenu.n(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.mIntent = intent;
        return this;
    }

    public void setIsActionButton(boolean z) {
        this.mFlags = z ? this.mFlags | 32 : this.mFlags & (-33);
    }

    void setMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mMenuInfo = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.mShortcutNumericChar == c) {
            return this;
        }
        this.mShortcutNumericChar = c;
        this.mMenu.n(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.mOnActionExpandListener = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mClickListener = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.mShortcutNumericChar = c;
        this.mShortcutAlphabeticChar = Character.toLowerCase(c2);
        this.mMenu.n(false);
        return this;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.mShowAsAction = i;
        this.mMenu.D();
    }

    @Override // defpackage.cti, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsActionFlags(i);
        return this;
    }

    public void setSubMenu(fc fcVar) {
        this.mSubMenu = fcVar;
        fcVar.setHeaderTitle(getTitle());
    }

    @Override // defpackage.cti
    public cti setSupportActionProvider(cur curVar) {
        cur curVar2 = this.mActionProvider;
        if (curVar2 != null) {
            curVar2.reset();
        }
        this.mActionView = null;
        this.mActionProvider = curVar;
        this.mMenu.n(true);
        cur curVar3 = this.mActionProvider;
        if (curVar3 != null) {
            curVar3.setVisibilityListener(new cuq() { // from class: android.support.v7.view.menu.MenuItemImpl.1
                @Override // defpackage.cuq
                public void onActionProviderVisibilityChanged(boolean z) {
                    MenuItemImpl.this.mMenu.E();
                }
            });
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.mMenu.a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.mTitleCondensed = charSequence;
        this.mMenu.n(false);
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (setVisibleInt(z)) {
            this.mMenu.E();
        }
        return this;
    }

    public boolean setVisibleInt(boolean z) {
        int i = this.mFlags;
        int i2 = (true != z ? 8 : 0) | (i & (-9));
        this.mFlags = i2;
        return i != i2;
    }

    public boolean shouldShowIcon() {
        return this.mMenu.i;
    }

    public boolean shouldShowShortcut() {
        return this.mMenu.A() && getShortcut() != 0;
    }

    public boolean showsTextAsAction() {
        return (this.mShowAsAction & 4) == 4;
    }

    public String toString() {
        CharSequence charSequence = this.mTitle;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public cti setActionView(int i) {
        Context context = this.mMenu.a;
        setActionView(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public cti setContentDescription(CharSequence charSequence) {
        this.mContentDescription = charSequence;
        this.mMenu.n(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.mIconResId = 0;
        this.mIconDrawable = drawable;
        this.mNeedToApplyIconTint = true;
        this.mMenu.n(false);
        return this;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.mShortcutNumericChar == c && this.mShortcutNumericModifiers == i) {
            return this;
        }
        this.mShortcutNumericChar = c;
        this.mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i);
        this.mMenu.n(false);
        return this;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public cti setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        this.mMenu.n(false);
        fc fcVar = this.mSubMenu;
        if (fcVar != null) {
            fcVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public cti setTooltipText(CharSequence charSequence) {
        this.mTooltipText = charSequence;
        this.mMenu.n(false);
        return this;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.mShortcutAlphabeticChar == c && this.mShortcutAlphabeticModifiers == i) {
            return this;
        }
        this.mShortcutAlphabeticChar = Character.toLowerCase(c);
        this.mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(i);
        this.mMenu.n(false);
        return this;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.mShortcutNumericChar = c;
        this.mShortcutNumericModifiers = KeyEvent.normalizeMetaState(i);
        this.mShortcutAlphabeticChar = Character.toLowerCase(c2);
        this.mShortcutAlphabeticModifiers = KeyEvent.normalizeMetaState(i2);
        this.mMenu.n(false);
        return this;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        setActionView(view);
        return this;
    }

    @Override // defpackage.cti, android.view.MenuItem
    public cti setActionView(View view) {
        int i;
        this.mActionView = view;
        this.mActionProvider = null;
        if (view != null && view.getId() == -1 && (i = this.mId) > 0) {
            view.setId(i);
        }
        this.mMenu.D();
        return this;
    }
}
