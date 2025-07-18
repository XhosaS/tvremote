package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.app.AlertDialog;
import android.support.v7.view.menu.MenuPresenter;
import android.view.View;
import android.view.WindowManager;
import com.google.android.videos.R;
import defpackage.fb;

/* compiled from: PG */
/* loaded from: classes.dex */
class MenuDialogHelper implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, MenuPresenter.Callback {
    private AlertDialog mDialog;
    private fb mMenu;
    ListMenuPresenter mPresenter;
    private MenuPresenter.Callback mPresenterCallback;

    public MenuDialogHelper(fb fbVar) {
        this.mMenu = fbVar;
    }

    public void dismiss() {
        AlertDialog alertDialog = this.mDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.mMenu.B((MenuItemImpl) this.mPresenter.getAdapter().getItem(i), 0);
    }

    @Override // android.support.v7.view.menu.MenuPresenter.Callback
    public void onCloseMenu(fb fbVar, boolean z) {
        if (z || fbVar == this.mMenu) {
            dismiss();
        }
        MenuPresenter.Callback callback = this.mPresenterCallback;
        if (callback != null) {
            callback.onCloseMenu(fbVar, z);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.mPresenter.onCloseMenu(this.mMenu, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    @Override // android.content.DialogInterface.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKey(android.content.DialogInterface r3, int r4, android.view.KeyEvent r5) {
        /*
            r2 = this;
            r0 = 82
            if (r4 == r0) goto L8
            r0 = 4
            if (r4 != r0) goto L5c
            r4 = r0
        L8:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != 0) goto L2d
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L2d
            android.support.v7.app.AlertDialog r3 = r2.mDialog
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L5c
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L5c
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L5c
            r3.startTracking(r5, r2)
            return r1
        L2d:
            int r0 = r5.getAction()
            if (r0 != r1) goto L5c
            boolean r0 = r5.isCanceled()
            if (r0 != 0) goto L5c
            android.support.v7.app.AlertDialog r0 = r2.mDialog
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L5c
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L5c
            android.view.KeyEvent$DispatcherState r0 = r0.getKeyDispatcherState()
            if (r0 == 0) goto L5c
            boolean r0 = r0.isTracking(r5)
            if (r0 == 0) goto L5c
            fb r4 = r2.mMenu
            r4.i(r1)
            r3.dismiss()
            return r1
        L5c:
            fb r3 = r2.mMenu
            r0 = 0
            boolean r3 = r3.performShortcut(r4, r5, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.menu.MenuDialogHelper.onKey(android.content.DialogInterface, int, android.view.KeyEvent):boolean");
    }

    @Override // android.support.v7.view.menu.MenuPresenter.Callback
    public boolean onOpenSubMenu(fb fbVar) {
        MenuPresenter.Callback callback = this.mPresenterCallback;
        if (callback != null) {
            return callback.onOpenSubMenu(fbVar);
        }
        return false;
    }

    public void setPresenterCallback(MenuPresenter.Callback callback) {
        this.mPresenterCallback = callback;
    }

    public void show(IBinder iBinder) {
        fb fbVar = this.mMenu;
        AlertDialog.Builder builder = new AlertDialog.Builder(fbVar.a);
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(builder.getContext(), R.layout.abc_list_menu_item_layout);
        this.mPresenter = listMenuPresenter;
        listMenuPresenter.setCallback(this);
        this.mMenu.g(this.mPresenter);
        builder.setAdapter(this.mPresenter.getAdapter(), this);
        View view = fbVar.g;
        if (view != null) {
            builder.setCustomTitle(view);
        } else {
            builder.setIcon(fbVar.f);
            builder.setTitle(fbVar.e);
        }
        builder.setOnKeyListener(this);
        AlertDialog alertDialogCreate = builder.create();
        this.mDialog = alertDialogCreate;
        alertDialogCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.mDialog.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.mDialog.show();
    }
}
