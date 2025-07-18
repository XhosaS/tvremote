package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.ActionMode;
import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import defpackage.ez;
import defpackage.fb;
import defpackage.fc;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StandaloneActionMode extends ActionMode implements ez {
    private ActionMode.Callback mCallback;
    private Context mContext;
    private ActionBarContextView mContextView;
    private WeakReference<View> mCustomView;
    private boolean mFinished;
    private boolean mFocusable;
    private fb mMenu;

    public StandaloneActionMode(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback, boolean z) {
        this.mContext = context;
        this.mContextView = actionBarContextView;
        this.mCallback = callback;
        fb fbVar = new fb(actionBarContextView.getContext());
        fbVar.F();
        this.mMenu = fbVar;
        fbVar.r(this);
        this.mFocusable = z;
    }

    @Override // android.support.v7.view.ActionMode
    public void finish() {
        if (this.mFinished) {
            return;
        }
        this.mFinished = true;
        this.mCallback.onDestroyActionMode(this);
    }

    @Override // android.support.v7.view.ActionMode
    public View getCustomView() {
        WeakReference<View> weakReference = this.mCustomView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.support.v7.view.ActionMode
    public Menu getMenu() {
        return this.mMenu;
    }

    @Override // android.support.v7.view.ActionMode
    public MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.mContextView.getContext());
    }

    @Override // android.support.v7.view.ActionMode
    public CharSequence getSubtitle() {
        return this.mContextView.getSubtitle();
    }

    @Override // android.support.v7.view.ActionMode
    public CharSequence getTitle() {
        return this.mContextView.getTitle();
    }

    @Override // android.support.v7.view.ActionMode
    public void invalidate() {
        this.mCallback.onPrepareActionMode(this, this.mMenu);
    }

    @Override // android.support.v7.view.ActionMode
    public boolean isTitleOptional() {
        return this.mContextView.isTitleOptional();
    }

    @Override // android.support.v7.view.ActionMode
    public boolean isUiFocusable() {
        return this.mFocusable;
    }

    @Override // defpackage.ez
    public boolean onMenuItemSelected(fb fbVar, MenuItem menuItem) {
        return this.mCallback.onActionItemClicked(this, menuItem);
    }

    @Override // defpackage.ez
    public void onMenuModeChange(fb fbVar) {
        invalidate();
        this.mContextView.showOverflowMenu();
    }

    public boolean onSubMenuSelected(fc fcVar) {
        if (!fcVar.hasVisibleItems()) {
            return true;
        }
        new MenuPopupHelper(this.mContextView.getContext(), fcVar).show();
        return true;
    }

    @Override // android.support.v7.view.ActionMode
    public void setCustomView(View view) {
        this.mContextView.setCustomView(view);
        this.mCustomView = view != null ? new WeakReference<>(view) : null;
    }

    @Override // android.support.v7.view.ActionMode
    public void setSubtitle(int i) {
        setSubtitle(this.mContext.getString(i));
    }

    @Override // android.support.v7.view.ActionMode
    public void setTitle(int i) {
        setTitle(this.mContext.getString(i));
    }

    @Override // android.support.v7.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        super.setTitleOptionalHint(z);
        this.mContextView.setTitleOptional(z);
    }

    @Override // android.support.v7.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.mContextView.setSubtitle(charSequence);
    }

    @Override // android.support.v7.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.mContextView.setTitle(charSequence);
    }

    public void onCloseSubMenu(fc fcVar) {
    }

    public void onCloseMenu(fb fbVar, boolean z) {
    }
}
