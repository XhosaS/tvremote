package android.support.v7.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import defpackage.fb;
import defpackage.fc;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface MenuPresenter {

    /* compiled from: PG */
    public interface Callback {
        void onCloseMenu(fb fbVar, boolean z);

        boolean onOpenSubMenu(fb fbVar);
    }

    boolean collapseItemActionView(fb fbVar, MenuItemImpl menuItemImpl);

    boolean expandItemActionView(fb fbVar, MenuItemImpl menuItemImpl);

    boolean flagActionItems();

    int getId();

    MenuView getMenuView(ViewGroup viewGroup);

    void initForMenu(Context context, fb fbVar);

    void onCloseMenu(fb fbVar, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(fc fcVar);

    void setCallback(Callback callback);

    void updateMenuView(boolean z);
}
