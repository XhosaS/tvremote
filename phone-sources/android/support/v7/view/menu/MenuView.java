package android.support.v7.view.menu;

import android.graphics.drawable.Drawable;
import defpackage.fb;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface MenuView {

    /* compiled from: PG */
    public interface ItemView {
        MenuItemImpl getItemData();

        void initialize(MenuItemImpl menuItemImpl, int i);

        boolean prefersCondensedTitle();

        void setCheckable(boolean z);

        void setChecked(boolean z);

        void setEnabled(boolean z);

        void setIcon(Drawable drawable);

        void setShortcut(boolean z, char c);

        void setTitle(CharSequence charSequence);

        boolean showsIcon();
    }

    int getWindowAnimations();

    void initialize(fb fbVar);
}
