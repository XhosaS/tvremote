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
public class du implements of {
    private static final int[] k = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public ds b;
    public final ArrayList c;
    public final ArrayList d;
    CharSequence e;
    Drawable f;
    View g;
    public dw i;
    public boolean j;
    private final Resources l;
    private boolean m;
    private final boolean n;
    private final ArrayList o;
    private boolean p;
    private final ArrayList q;
    private boolean r;
    private int s = 0;
    public boolean h = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private final ArrayList w = new ArrayList();
    private final CopyOnWriteArrayList x = new CopyOnWriteArrayList();
    private boolean y = false;

    public du(Context context) {
        Resources resources;
        int iC;
        boolean z = false;
        this.a = context;
        Resources resources2 = context.getResources();
        this.l = resources2;
        this.c = new ArrayList();
        this.o = new ArrayList();
        this.p = true;
        this.d = new ArrayList();
        this.q = new ArrayList();
        this.r = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = qx.a;
            if (Build.VERSION.SDK_INT < 28 ? !((iC = qx.c((resources = context.getResources()), "config_showMenuShortcutsWhenKeyboardPresent", "bool")) == 0 || !resources.getBoolean(iC)) : viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent()) {
                z = true;
            }
        }
        this.n = z;
    }

    private final void E(int i, boolean z) {
        if (i >= 0) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.remove(i);
            if (z) {
                l(true);
            }
        }
    }

    public final boolean A(MenuItem menuItem, eg egVar, int i) {
        boolean zF;
        dw dwVar = (dw) menuItem;
        if (dwVar != null && dwVar.isEnabled()) {
            boolean zN = dwVar.n();
            qk qkVar = dwVar.p;
            boolean z = qkVar != null && qkVar.c();
            if (dwVar.m()) {
                boolean zExpandActionView = dwVar.expandActionView() | zN;
                if (!zExpandActionView) {
                    return zExpandActionView;
                }
                i(true);
                return true;
            }
            if (!dwVar.hasSubMenu() && !z) {
                if ((i & 1) != 0) {
                    return zN;
                }
                i(true);
                return zN;
            }
            if ((i & 4) == 0) {
                i(false);
            }
            if (!dwVar.hasSubMenu()) {
                dwVar.l(new en(this.a, this, dwVar));
            }
            en enVar = dwVar.k;
            if (z) {
                qkVar.b(enVar);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.x;
            if (copyOnWriteArrayList.isEmpty()) {
                zF = false;
            } else {
                zF = egVar != null ? egVar.f(enVar) : false;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    eg egVar2 = (eg) weakReference.get();
                    if (egVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zF) {
                        zF = egVar2.f(enVar);
                    }
                }
            }
            boolean z2 = zN | zF;
            if (z2) {
                return z2;
            }
            i(true);
        }
        return false;
    }

    final void B() {
        this.r = true;
        l(true);
    }

    final void C() {
        this.p = true;
        l(true);
    }

    public final void D() {
        this.s = 1;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return c(0, 0, 0, this.l.getString(i));
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
            ((dw) menuItemC).e = intent2;
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = menuItemC;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.l.getString(i));
    }

    final dw b(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.w;
        arrayList.clear();
        j(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (dw) arrayList.get(0);
        }
        boolean zX = x();
        for (int i2 = 0; i2 < size; i2++) {
            dw dwVar = (dw) arrayList.get(i2);
            char c = zX ? dwVar.h : dwVar.f;
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (zX && c == '\b' && i == 67))) {
                return dwVar;
            }
        }
        return null;
    }

    protected final MenuItem c(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (k[i5] << 16) | ((char) i3);
        dw dwVar = new dw(this, i, i2, i3, i6, charSequence, this.s);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((dw) arrayList.get(size)).c <= i6) {
                i4 = size + 1;
                break;
            }
        }
        arrayList.add(i4, dwVar);
        l(true);
        return dwVar;
    }

    @Override // android.view.Menu
    public final void clear() {
        dw dwVar = this.i;
        if (dwVar != null) {
            t(dwVar);
        }
        this.c.clear();
        l(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        l(false);
    }

    @Override // android.view.Menu
    public final void close() {
        i(true);
    }

    protected String d() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList e() {
        k();
        return this.q;
    }

    public final ArrayList f() {
        if (!this.p) {
            return this.o;
        }
        ArrayList arrayList = this.o;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            dw dwVar = (dw) arrayList2.get(i);
            if (dwVar.isVisible()) {
                arrayList.add(dwVar);
            }
        }
        this.p = false;
        this.r = true;
        return arrayList;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            dw dwVar = (dw) this.c.get(i2);
            if (dwVar.a == i) {
                return dwVar;
            }
            if (dwVar.hasSubMenu() && (menuItemFindItem = dwVar.k.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final void g(eg egVar) {
        h(egVar, this.a);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.c.get(i);
    }

    public final void h(eg egVar, Context context) {
        this.x.add(new WeakReference(egVar));
        egVar.b(context, this);
        this.r = true;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.j) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((dw) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.x;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            eg egVar = (eg) weakReference.get();
            if (egVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                egVar.c(this, z);
            }
        }
        this.v = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return b(i, keyEvent) != null;
    }

    final void j(List list, int i, KeyEvent keyEvent) {
        int i2;
        boolean zX = x();
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
            dw dwVar = (dw) arrayList.get(i3);
            if (dwVar.hasSubMenu()) {
                dwVar.k.j(list, i2, keyEvent);
            }
            char c = zX ? dwVar.h : dwVar.f;
            if ((modifiers & 69647) == ((zX ? dwVar.i : dwVar.g) & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (zX && c == '\b' && i2 == 67)) && dwVar.isEnabled())) {
                list.add(dwVar);
            }
        }
    }

    public final void k() {
        ArrayList arrayListF = f();
        if (this.r) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.x;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zE = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                eg egVar = (eg) weakReference.get();
                if (egVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zE |= egVar.e();
                }
            }
            if (zE) {
                ArrayList arrayList = this.d;
                arrayList.clear();
                ArrayList arrayList2 = this.q;
                arrayList2.clear();
                int size = arrayListF.size();
                for (int i = 0; i < size; i++) {
                    dw dwVar = (dw) arrayListF.get(i);
                    if (dwVar.o()) {
                        arrayList.add(dwVar);
                    } else {
                        arrayList2.add(dwVar);
                    }
                }
            } else {
                this.d.clear();
                ArrayList arrayList3 = this.q;
                arrayList3.clear();
                arrayList3.addAll(f());
            }
            this.r = false;
        }
    }

    public final void l(boolean z) {
        if (this.h) {
            this.t = true;
            if (z) {
                this.u = true;
                return;
            }
            return;
        }
        if (z) {
            this.p = true;
            this.r = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.x;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            eg egVar = (eg) weakReference.get();
            if (egVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                egVar.i();
            }
        }
        r();
    }

    public final void m(eg egVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.x;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            eg egVar2 = (eg) weakReference.get();
            if (egVar2 == null || egVar2 == egVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void n(Bundle bundle) {
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
                ((en) item.getSubMenu()).n(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void o(Bundle bundle) {
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
                ((en) item.getSubMenu()).o(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    public void p(ds dsVar) {
        this.b = dsVar;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return z(findItem(i), i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        dw dwVarB = b(i, keyEvent);
        boolean z = dwVarB != null ? z(dwVarB, i2) : false;
        if ((i2 & 2) != 0) {
            i(true);
        }
        return z;
    }

    public final void q(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i > 0) {
                this.e = this.l.getText(i);
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
        l(false);
    }

    public final void r() {
        this.h = false;
        if (this.t) {
            this.t = false;
            l(this.u);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((dw) this.c.get(i2)).b == i) {
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
                if (i3 >= size2 || ((dw) arrayList.get(i2)).b != i) {
                    break;
                }
                E(i2, false);
                i3 = i4;
            }
            l(true);
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
            } else if (((dw) this.c.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        E(i2, true);
    }

    public final void s() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.t = false;
        this.u = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dw dwVar = (dw) arrayList.get(i2);
            if (dwVar.b == i) {
                dwVar.j(z2);
                dwVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dw dwVar = (dw) arrayList.get(i2);
            if (dwVar.b == i) {
                dwVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            dw dwVar = (dw) arrayList.get(i2);
            if (dwVar.b == i && dwVar.s(z)) {
                z2 = true;
            }
        }
        if (z2) {
            l(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.m = z;
        l(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public boolean t(dw dwVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.x;
        boolean zG = false;
        if (!copyOnWriteArrayList.isEmpty() && this.i == dwVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                eg egVar = (eg) weakReference.get();
                if (egVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zG = egVar.g(dwVar);
                    if (zG) {
                        break;
                    }
                }
            }
            r();
            if (zG) {
                this.i = null;
            }
        }
        return zG;
    }

    public boolean u(du duVar, MenuItem menuItem) {
        ds dsVar = this.b;
        return dsVar != null && dsVar.I(duVar, menuItem);
    }

    public boolean v(dw dwVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.x;
        boolean zH = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            eg egVar = (eg) weakReference.get();
            if (egVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zH = egVar.h(dwVar);
                if (zH) {
                    break;
                }
            }
        }
        r();
        if (zH) {
            this.i = dwVar;
        }
        return zH;
    }

    public boolean w() {
        return this.y;
    }

    public boolean x() {
        return this.m;
    }

    public boolean y() {
        return this.n;
    }

    public final boolean z(MenuItem menuItem, int i) {
        return A(menuItem, null, i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, this.l.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.l.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        dw dwVar = (dw) c(i, i2, i3, charSequence);
        en enVar = new en(this.a, this, dwVar);
        dwVar.l(enVar);
        return enVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public du a() {
        return this;
    }
}
