package android.support.v7.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import defpackage.cti;
import defpackage.ctj;
import defpackage.ko;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class BaseMenuWrapper {
    final Context mContext;
    private ko<cti, MenuItem> mMenuItems;
    private ko<ctj, SubMenu> mSubMenus;

    public BaseMenuWrapper(Context context) {
        this.mContext = context;
    }

    final MenuItem getMenuItemWrapper(MenuItem menuItem) {
        if (!(menuItem instanceof cti)) {
            return menuItem;
        }
        cti ctiVar = (cti) menuItem;
        if (this.mMenuItems == null) {
            this.mMenuItems = new ko<>();
        }
        MenuItem menuItem2 = this.mMenuItems.get(ctiVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.mContext, ctiVar);
        this.mMenuItems.put(ctiVar, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    final SubMenu getSubMenuWrapper(SubMenu subMenu) {
        if (!(subMenu instanceof ctj)) {
            return subMenu;
        }
        ctj ctjVar = (ctj) subMenu;
        if (this.mSubMenus == null) {
            this.mSubMenus = new ko<>();
        }
        SubMenu subMenu2 = this.mSubMenus.get(ctjVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuWrapperICS subMenuWrapperICS = new SubMenuWrapperICS(this.mContext, ctjVar);
        this.mSubMenus.put(ctjVar, subMenuWrapperICS);
        return subMenuWrapperICS;
    }

    final void internalClear() {
        ko<cti, MenuItem> koVar = this.mMenuItems;
        if (koVar != null) {
            koVar.clear();
        }
        ko<ctj, SubMenu> koVar2 = this.mSubMenus;
        if (koVar2 != null) {
            koVar2.clear();
        }
    }

    final void internalRemoveGroup(int i) {
        if (this.mMenuItems == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            ko<cti, MenuItem> koVar = this.mMenuItems;
            if (i2 >= koVar.d) {
                return;
            }
            if (((cti) koVar.d(i2)).getGroupId() == i) {
                this.mMenuItems.e(i2);
                i2--;
            }
            i2++;
        }
    }

    final void internalRemoveItem(int i) {
        if (this.mMenuItems == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            ko<cti, MenuItem> koVar = this.mMenuItems;
            if (i2 >= koVar.d) {
                return;
            }
            if (((cti) koVar.d(i2)).getItemId() == i) {
                this.mMenuItems.e(i2);
                return;
            }
            i2++;
        }
    }
}
