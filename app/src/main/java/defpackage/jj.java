package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
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
public class jj implements adk {
    private static final int[] m = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public jh b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    CharSequence g;
    Drawable h;
    View i;
    public jm k;
    public boolean l;
    private final Resources n;
    private boolean o;
    private final boolean p;
    private final ArrayList q;
    private boolean r;
    private boolean s;
    public int f = 0;
    public boolean j = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private final ArrayList w = new ArrayList();
    private final CopyOnWriteArrayList x = new CopyOnWriteArrayList();
    private boolean y = false;

    public jj(Context context) {
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.n = resources;
        this.c = new ArrayList();
        this.q = new ArrayList();
        this.r = true;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.s = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z = true;
        }
        this.p = z;
    }

    private final void A(int i, boolean z) {
        if (i >= 0) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.remove(i);
            if (z) {
                j(true);
            }
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return c(0, 0, 0, this.n.getString(i));
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
            ((jm) menuItemC).e = intent2;
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = menuItemC;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.n.getString(i));
    }

    final jm b(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.w;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (jm) arrayList.get(0);
        }
        boolean zV = v();
        for (int i2 = 0; i2 < size; i2++) {
            jm jmVar = (jm) arrayList.get(i2);
            char c = zV ? jmVar.h : jmVar.f;
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (zV && c == '\b' && i == 67))) {
                return jmVar;
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
        int i6 = (m[i5] << 16) | ((char) i3);
        jm jmVar = new jm(this, i, i2, i3, i6, charSequence, this.f);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((jm) arrayList.get(size)).c <= i6) {
                i4 = size + 1;
                break;
            }
        }
        arrayList.add(i4, jmVar);
        j(true);
        return jmVar;
    }

    @Override // android.view.Menu
    public final void clear() {
        jm jmVar = this.k;
        if (jmVar != null) {
            r(jmVar);
        }
        this.c.clear();
        j(true);
    }

    public final void clearHeader() {
        this.h = null;
        this.g = null;
        this.i = null;
        j(false);
    }

    @Override // android.view.Menu
    public final void close() {
        g(true);
    }

    protected String d() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList e() {
        if (!this.r) {
            return this.q;
        }
        ArrayList arrayList = this.q;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            jm jmVar = (jm) arrayList2.get(i);
            if (jmVar.isVisible()) {
                arrayList.add(jmVar);
            }
        }
        this.r = false;
        this.s = true;
        return arrayList;
    }

    public final void f(jw jwVar, Context context) {
        this.x.add(new WeakReference(jwVar));
        jwVar.c(context, this);
        this.s = true;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            jm jmVar = (jm) arrayList.get(i2);
            if (jmVar.a == i) {
                return jmVar;
            }
            if (jmVar.hasSubMenu() && (menuItemFindItem = jmVar.k.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final void g(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.x;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            jw jwVar = (jw) weakReference.get();
            if (jwVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                jwVar.d(this, z);
            }
        }
        this.v = false;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.c.get(i);
    }

    final void h(List list, int i, KeyEvent keyEvent) {
        int i2;
        boolean zV = v();
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
            jm jmVar = (jm) arrayList.get(i3);
            if (jmVar.hasSubMenu()) {
                jmVar.k.h(list, i2, keyEvent);
            }
            char c = zV ? jmVar.h : jmVar.f;
            if ((modifiers & 69647) == ((zV ? jmVar.i : jmVar.g) & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (zV && c == '\b' && i2 == 67)) && jmVar.isEnabled())) {
                list.add(jmVar);
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.l) {
            return true;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((jm) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListE = e();
        if (this.s) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.x;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zG = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                jw jwVar = (jw) weakReference.get();
                if (jwVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zG |= jwVar.g();
                }
            }
            if (zG) {
                ArrayList arrayList = this.d;
                arrayList.clear();
                ArrayList arrayList2 = this.e;
                arrayList2.clear();
                int size = arrayListE.size();
                for (int i = 0; i < size; i++) {
                    jm jmVar = (jm) arrayListE.get(i);
                    if (jmVar.o()) {
                        arrayList.add(jmVar);
                    } else {
                        arrayList2.add(jmVar);
                    }
                }
            } else {
                this.d.clear();
                ArrayList arrayList3 = this.e;
                arrayList3.clear();
                arrayList3.addAll(e());
            }
            this.s = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return b(i, keyEvent) != null;
    }

    public final void j(boolean z) {
        if (this.j) {
            this.t = true;
            if (z) {
                this.u = true;
                return;
            }
            return;
        }
        if (z) {
            this.r = true;
            this.s = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.x;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        q();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            jw jwVar = (jw) weakReference.get();
            if (jwVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                jwVar.l();
            }
        }
        p();
    }

    public final void k(jw jwVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.x;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            jw jwVar2 = (jw) weakReference.get();
            if (jwVar2 == null || jwVar2 == jwVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void l(Bundle bundle) {
        MenuItem menuItemFindItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(d());
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((ke) item.getSubMenu()).l(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void m(Bundle bundle) {
        int size = this.c.size();
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
                ((ke) item.getSubMenu()).m(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    public void n(jh jhVar) {
        this.b = jhVar;
    }

    public final void o(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.i = view;
            this.g = null;
            this.h = null;
        } else {
            if (i > 0) {
                this.g = this.n.getText(i);
            } else if (charSequence != null) {
                this.g = charSequence;
            }
            if (i2 > 0) {
                this.h = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.h = drawable;
            }
            this.i = null;
        }
        j(false);
    }

    public final void p() {
        this.j = false;
        if (this.t) {
            this.t = false;
            j(this.u);
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return x(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        jm jmVarB = b(i, keyEvent);
        boolean zX = jmVarB != null ? x(jmVarB, null, i2) : false;
        if ((i2 & 2) != 0) {
            g(true);
        }
        return zX;
    }

    public final void q() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.t = false;
        this.u = false;
    }

    public boolean r(jm jmVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.x;
        boolean zI = false;
        if (!copyOnWriteArrayList.isEmpty() && this.k == jmVar) {
            q();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                jw jwVar = (jw) weakReference.get();
                if (jwVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zI = jwVar.i(jmVar);
                    if (zI) {
                        break;
                    }
                }
            }
            p();
            if (zI) {
                this.k = null;
            }
        }
        return zI;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((jm) arrayList.get(i2)).b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = arrayList.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((jm) arrayList.get(i2)).b != i) {
                    break;
                }
                A(i2, false);
                i3 = i4;
            }
            j(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((jm) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        A(i2, true);
    }

    public boolean s(jj jjVar, MenuItem menuItem) {
        jh jhVar = this.b;
        return jhVar != null && jhVar.G(jjVar, menuItem);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            jm jmVar = (jm) arrayList.get(i2);
            if (jmVar.b == i) {
                jmVar.j(z2);
                jmVar.setCheckable(z);
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
            jm jmVar = (jm) arrayList.get(i2);
            if (jmVar.b == i) {
                jmVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            jm jmVar = (jm) arrayList.get(i2);
            if (jmVar.b == i && jmVar.s(z)) {
                z2 = true;
            }
        }
        if (z2) {
            j(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.o = z;
        j(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public boolean t(jm jmVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.x;
        boolean zJ = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        q();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            jw jwVar = (jw) weakReference.get();
            if (jwVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zJ = jwVar.j(jmVar);
                if (zJ) {
                    break;
                }
            }
        }
        p();
        if (zJ) {
            this.k = jmVar;
        }
        return zJ;
    }

    public boolean u() {
        return this.y;
    }

    public boolean v() {
        return this.o;
    }

    public boolean w() {
        return this.p;
    }

    public final boolean x(MenuItem menuItem, jw jwVar, int i) {
        boolean zH;
        jm jmVar = (jm) menuItem;
        if (jmVar != null && jmVar.isEnabled()) {
            boolean zN = jmVar.n();
            afo afoVar = jmVar.o;
            boolean z = afoVar != null && afoVar.c();
            if (jmVar.m()) {
                boolean zExpandActionView = jmVar.expandActionView() | zN;
                if (!zExpandActionView) {
                    return zExpandActionView;
                }
                g(true);
                return true;
            }
            if (!jmVar.hasSubMenu() && !z) {
                if ((i & 1) != 0) {
                    return zN;
                }
                g(true);
                return zN;
            }
            if ((i & 4) == 0) {
                g(false);
            }
            if (!jmVar.hasSubMenu()) {
                jmVar.l(new ke(this.a, this, jmVar));
            }
            ke keVar = jmVar.k;
            if (z) {
                afoVar.b(keVar);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.x;
            if (copyOnWriteArrayList.isEmpty()) {
                zH = false;
            } else {
                zH = jwVar != null ? jwVar.h(keVar) : false;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    jw jwVar2 = (jw) weakReference.get();
                    if (jwVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zH) {
                        zH = jwVar2.h(keVar);
                    }
                }
            }
            boolean z2 = zN | zH;
            if (z2) {
                return z2;
            }
            g(true);
        }
        return false;
    }

    final void y() {
        this.s = true;
        j(true);
    }

    final void z() {
        this.r = true;
        j(true);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, this.n.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.n.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        jm jmVar = (jm) c(i, i2, i3, charSequence);
        ke keVar = new ke(this.a, this, jmVar);
        jmVar.l(keVar);
        return keVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public jj a() {
        return this;
    }
}
