package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fb implements cth {
    private static final int[] l = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public ez b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public Drawable f;
    public View g;
    public MenuItemImpl j;
    public boolean k;
    private final Resources m;
    private boolean n;
    private final boolean o;
    private final ArrayList p;
    private boolean q;
    private final ArrayList r;
    private boolean s;
    private int t = 0;
    public boolean h = false;
    private boolean u = false;
    private boolean v = false;
    public boolean i = false;
    private boolean w = false;
    private final ArrayList x = new ArrayList();
    private final CopyOnWriteArrayList y = new CopyOnWriteArrayList();
    private boolean z = false;

    public fb(Context context) {
        Resources resources;
        int iD;
        boolean z = false;
        this.a = context;
        Resources resources2 = context.getResources();
        this.m = resources2;
        this.c = new ArrayList();
        this.p = new ArrayList();
        this.q = true;
        this.d = new ArrayList();
        this.r = new ArrayList();
        this.s = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = cwy.a;
            if (Build.VERSION.SDK_INT < 28 ? !((iD = cwy.d((resources = context.getResources()), "config_showMenuShortcutsWhenKeyboardPresent", "bool")) == 0 || !resources.getBoolean(iD)) : viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent()) {
                z = true;
            }
        }
        this.o = z;
    }

    private final void G(int i, boolean z) {
        if (i >= 0) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.remove(i);
            if (z) {
                n(true);
            }
        }
    }

    public boolean A() {
        return this.o;
    }

    public final boolean B(MenuItem menuItem, int i) {
        return C(menuItem, null, i);
    }

    public final boolean C(MenuItem menuItem, MenuPresenter menuPresenter, int i) {
        boolean zOnSubMenuSelected;
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        if (menuItemImpl != null && menuItemImpl.isEnabled()) {
            boolean zInvoke = menuItemImpl.invoke();
            cur supportActionProvider = menuItemImpl.getSupportActionProvider();
            boolean z = supportActionProvider != null && supportActionProvider.hasSubMenu();
            if (menuItemImpl.hasCollapsibleActionView()) {
                boolean zExpandActionView = menuItemImpl.expandActionView() | zInvoke;
                if (!zExpandActionView) {
                    return zExpandActionView;
                }
                i(true);
                return true;
            }
            if (!menuItemImpl.hasSubMenu() && !z) {
                if ((i & 1) != 0) {
                    return zInvoke;
                }
                i(true);
                return zInvoke;
            }
            if ((i & 4) == 0) {
                i(false);
            }
            if (!menuItemImpl.hasSubMenu()) {
                menuItemImpl.setSubMenu(new fc(this.a, this, menuItemImpl));
            }
            SubMenu subMenu = menuItemImpl.getSubMenu();
            if (z) {
                supportActionProvider.onPrepareSubMenu(subMenu);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.y;
            if (copyOnWriteArrayList.isEmpty()) {
                zOnSubMenuSelected = false;
            } else {
                zOnSubMenuSelected = menuPresenter != null ? menuPresenter.onSubMenuSelected((fc) subMenu) : false;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    MenuPresenter menuPresenter2 = (MenuPresenter) weakReference.get();
                    if (menuPresenter2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zOnSubMenuSelected) {
                        zOnSubMenuSelected = menuPresenter2.onSubMenuSelected((fc) subMenu);
                    }
                }
            }
            boolean z2 = zInvoke | zOnSubMenuSelected;
            if (z2) {
                return z2;
            }
            i(true);
        }
        return false;
    }

    public final void D() {
        this.s = true;
        n(true);
    }

    public final void E() {
        this.q = true;
        n(true);
    }

    public final void F() {
        this.t = 1;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return c(0, 0, 0, this.m.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem menuItemC = c(i, i2, i3, resolveInfo.loadLabel(packageManager));
            menuItemC.setIcon(resolveInfo.loadIcon(packageManager));
            menuItemC.setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = menuItemC;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.m.getString(i));
    }

    final MenuItemImpl b(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.x;
        arrayList.clear();
        l(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemImpl) arrayList.get(0);
        }
        boolean z = z();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            char alphabeticShortcut = z ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (z && alphabeticShortcut == '\b' && i == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    public MenuItem c(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (l[i5] << 16) | ((char) i3);
        MenuItemImpl menuItemImpl = new MenuItemImpl(this, i, i2, i3, i6, charSequence, this.t);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((MenuItemImpl) arrayList.get(size)).getOrdering() <= i6) {
                i4 = size + 1;
                break;
            }
        }
        arrayList.add(i4, menuItemImpl);
        n(true);
        return menuItemImpl;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemImpl menuItemImpl = this.j;
        if (menuItemImpl != null) {
            v(menuItemImpl);
        }
        this.c.clear();
        n(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        n(false);
    }

    @Override // android.view.Menu
    public final void close() {
        i(true);
    }

    protected String d() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList e() {
        m();
        return this.r;
    }

    public final ArrayList f() {
        if (!this.q) {
            return this.p;
        }
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList2.get(i);
            if (menuItemImpl.isVisible()) {
                arrayList.add(menuItemImpl);
            }
        }
        this.q = false;
        this.s = true;
        return arrayList;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.c.get(i2);
            if (menuItemImpl.getItemId() == i) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (menuItemFindItem = menuItemImpl.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final void g(MenuPresenter menuPresenter) {
        h(menuPresenter, this.a);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.c.get(i);
    }

    public final void h(MenuPresenter menuPresenter, Context context) {
        this.y.add(new WeakReference(menuPresenter));
        menuPresenter.initForMenu(context, this);
        this.s = true;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.k) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((MenuItemImpl) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.w) {
            return;
        }
        this.w = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.y;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                menuPresenter.onCloseMenu(this, z);
            }
        }
        this.w = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return b(i, keyEvent) != null;
    }

    public final void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.y;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = menuPresenter.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        menuPresenter.onRestoreInstanceState(parcelable);
                    }
                }
            }
        }
    }

    public final void k(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        CopyOnWriteArrayList copyOnWriteArrayList = this.y;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = menuPresenter.getId();
                if (id > 0 && (parcelableOnSaveInstanceState = menuPresenter.onSaveInstanceState()) != null) {
                    sparseArray.put(id, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    final void l(List list, int i, KeyEvent keyEvent) {
        int i2;
        boolean z = z();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData)) {
            i2 = i;
        } else if (i != 67) {
            return;
        } else {
            i2 = 67;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i3);
            if (menuItemImpl.hasSubMenu()) {
                ((fb) menuItemImpl.getSubMenu()).l(list, i2, keyEvent);
            }
            char alphabeticShortcut = z ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
            if ((modifiers & 69647) == ((z ? menuItemImpl.getAlphabeticModifiers() : menuItemImpl.getNumericModifiers()) & 69647) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (z && alphabeticShortcut == '\b' && i2 == 67)) && menuItemImpl.isEnabled())) {
                list.add(menuItemImpl);
            }
        }
    }

    public final void m() {
        ArrayList arrayListF = f();
        if (this.s) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.y;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zFlagActionItems = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zFlagActionItems |= menuPresenter.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                ArrayList arrayList = this.d;
                arrayList.clear();
                ArrayList arrayList2 = this.r;
                arrayList2.clear();
                int size = arrayListF.size();
                for (int i = 0; i < size; i++) {
                    MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListF.get(i);
                    if (menuItemImpl.isActionButton()) {
                        arrayList.add(menuItemImpl);
                    } else {
                        arrayList2.add(menuItemImpl);
                    }
                }
            } else {
                this.d.clear();
                ArrayList arrayList3 = this.r;
                arrayList3.clear();
                arrayList3.addAll(f());
            }
            this.s = false;
        }
    }

    public void n(boolean z) {
        boolean z2 = true;
        if (this.h) {
            this.u = true;
            if (z) {
                this.v = true;
                return;
            }
            return;
        }
        if (z) {
            this.q = true;
            this.s = true;
        } else {
            z2 = false;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.y;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        u();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                menuPresenter.updateMenuView(z2);
            }
        }
        t();
    }

    public final void o(MenuPresenter menuPresenter) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.y;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter2 = (MenuPresenter) weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void p(Bundle bundle) {
        MenuItem menuItemFindItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(d());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((fc) item.getSubMenu()).p(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return B(findItem(i), i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItemImpl menuItemImplB = b(i, keyEvent);
        boolean zB = menuItemImplB != null ? B(menuItemImplB, i2) : false;
        if ((i2 & 2) != 0) {
            i(true);
        }
        return zB;
    }

    public final void q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((fc) item.getSubMenu()).q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    public void r(ez ezVar) {
        this.b = ezVar;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((MenuItemImpl) this.c.get(i2)).getGroupId() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList = this.c;
            int size2 = arrayList.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((MenuItemImpl) arrayList.get(i2)).getGroupId() != i) {
                    break;
                }
                G(i2, false);
                i3 = i4;
            }
            n(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((MenuItemImpl) this.c.get(i2)).getItemId() == i) {
                break;
            } else {
                i2++;
            }
        }
        G(i2, true);
    }

    public final void s(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i > 0) {
                this.e = this.m.getText(i);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i2 > 0) {
                this.f = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        n(false);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.setExclusiveCheckable(z2);
                menuItemImpl.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.z = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            if (menuItemImpl.getGroupId() == i && menuItemImpl.setVisibleInt(z)) {
                z2 = true;
            }
        }
        if (z2) {
            n(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.n = z;
        n(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public final void t() {
        this.h = false;
        if (this.u) {
            this.u = false;
            n(this.v);
        }
    }

    public final void u() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.u = false;
        this.v = false;
    }

    public boolean v(MenuItemImpl menuItemImpl) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.y;
        boolean zCollapseItemActionView = false;
        if (!copyOnWriteArrayList.isEmpty() && this.j == menuItemImpl) {
            u();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zCollapseItemActionView = menuPresenter.collapseItemActionView(this, menuItemImpl);
                    if (zCollapseItemActionView) {
                        break;
                    }
                }
            }
            t();
            if (zCollapseItemActionView) {
                this.j = null;
            }
        }
        return zCollapseItemActionView;
    }

    public boolean w(fb fbVar, MenuItem menuItem) {
        ez ezVar = this.b;
        return ezVar != null && ezVar.onMenuItemSelected(fbVar, menuItem);
    }

    public boolean x(MenuItemImpl menuItemImpl) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.y;
        boolean zExpandItemActionView = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        u();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zExpandItemActionView = menuPresenter.expandItemActionView(this, menuItemImpl);
                if (zExpandItemActionView) {
                    break;
                }
            }
        }
        t();
        if (zExpandItemActionView) {
            this.j = menuItemImpl;
        }
        return zExpandItemActionView;
    }

    public boolean y() {
        return this.z;
    }

    public boolean z() {
        return this.n;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) c(i, i2, i3, charSequence);
        fc fcVar = new fc(this.a, this, menuItemImpl);
        menuItemImpl.setSubMenu(fcVar);
        return fcVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public fb a() {
        return this;
    }
}
