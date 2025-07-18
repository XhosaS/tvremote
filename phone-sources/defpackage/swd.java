package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuView;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swd implements MenuPresenter {
    public swa a;
    public boolean b = false;
    public int c;

    @Override // android.support.v7.view.menu.MenuPresenter
    public final boolean collapseItemActionView(fb fbVar, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // android.support.v7.view.menu.MenuPresenter
    public final boolean expandItemActionView(fb fbVar, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // android.support.v7.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override // android.support.v7.view.menu.MenuPresenter
    public final int getId() {
        return this.c;
    }

    @Override // android.support.v7.view.menu.MenuPresenter
    public final MenuView getMenuView(ViewGroup viewGroup) {
        return this.a;
    }

    @Override // android.support.v7.view.menu.MenuPresenter
    public final void initForMenu(Context context, fb fbVar) {
        this.a.initialize(fbVar);
    }

    @Override // android.support.v7.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof swc) {
            swa swaVar = this.a;
            swc swcVar = (swc) parcelable;
            int i = swcVar.a;
            int iA = swaVar.H.a();
            int i2 = 0;
            while (true) {
                if (i2 >= iA) {
                    break;
                }
                MenuItem menuItemB = swaVar.H.b(i2);
                if (i == menuItemB.getItemId()) {
                    swaVar.f = i;
                    swaVar.g = i2;
                    swaVar.f(menuItemB);
                    break;
                }
                i2++;
            }
            Context context = this.a.getContext();
            sun sunVar = swcVar.b;
            SparseArray sparseArray = new SparseArray(sunVar.size());
            for (int i3 = 0; i3 < sunVar.size(); i3++) {
                int iKeyAt = sunVar.keyAt(i3);
                sop sopVar = (sop) sunVar.valueAt(i3);
                sparseArray.put(iKeyAt, sopVar != null ? new soo(context, sopVar) : null);
            }
            swa swaVar2 = this.a;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int iKeyAt2 = sparseArray.keyAt(i4);
                SparseArray sparseArray2 = swaVar2.q;
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (soo) sparseArray.get(iKeyAt2));
                }
            }
            svz[] svzVarArr = swaVar2.e;
            if (svzVarArr != null) {
                for (svz svzVar : svzVarArr) {
                    if (svzVar instanceof svw) {
                        svw svwVar = (svw) svzVar;
                        soo sooVar = (soo) swaVar2.q.get(svwVar.getId());
                        if (sooVar != null) {
                            svwVar.o(sooVar);
                        }
                    }
                }
            }
        }
    }

    @Override // android.support.v7.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        swc swcVar = new swc();
        swa swaVar = this.a;
        swcVar.a = swaVar.f;
        SparseArray sparseArray = swaVar.q;
        sun sunVar = new sun();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            soo sooVar = (soo) sparseArray.valueAt(i);
            sunVar.put(iKeyAt, sooVar != null ? sooVar.b.a : null);
        }
        swcVar.b = sunVar;
        return swcVar;
    }

    @Override // android.support.v7.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(fc fcVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.MenuPresenter
    public final void updateMenuView(boolean z) throws Resources.NotFoundException {
        svy svyVar;
        gkc gkcVar;
        if (this.b) {
            return;
        }
        if (z) {
            this.a.e();
            return;
        }
        swa swaVar = this.a;
        svy svyVar2 = swaVar.H;
        if (svyVar2 == null || swaVar.e == null) {
            return;
        }
        swaVar.G.b = true;
        svyVar2.c();
        swaVar.G.b = false;
        if (swaVar.e != null && (svyVar = swaVar.H) != null && svyVar.a() == swaVar.e.length) {
            for (int i = 0; i < swaVar.e.length; i++) {
                if (!(swaVar.H.b(i) instanceof svs) || (swaVar.e[i] instanceof svt)) {
                    boolean z2 = swaVar.H.b(i).hasSubMenu() && !(swaVar.e[i] instanceof swf);
                    boolean z3 = (swaVar.H.b(i).hasSubMenu() || (swaVar.e[i] instanceof svw)) ? false : true;
                    if ((swaVar.H.b(i) instanceof svs) || (!z2 && !z3)) {
                    }
                }
            }
            int i2 = swaVar.f;
            int iA = swaVar.H.a();
            for (int i3 = 0; i3 < iA; i3++) {
                MenuItem menuItemB = swaVar.H.b(i3);
                if (menuItemB.isChecked()) {
                    swaVar.f(menuItemB);
                    swaVar.f = menuItemB.getItemId();
                    swaVar.g = i3;
                }
            }
            if (i2 != swaVar.f && (gkcVar = swaVar.b) != null) {
                gjy.c(swaVar, gkcVar);
            }
            boolean zJ = swaVar.j(swaVar.c, swaVar.b());
            for (int i4 = 0; i4 < iA; i4++) {
                swaVar.G.b = true;
                swaVar.e[i4].ex(swaVar.L);
                svz svzVar = swaVar.e[i4];
                if (svzVar instanceof svw) {
                    svw svwVar = (svw) svzVar;
                    svwVar.C(swaVar.c);
                    svwVar.w(swaVar.d);
                    svwVar.v(swaVar.C);
                    svwVar.E(zJ);
                }
                if (swaVar.H.b(i4) instanceof MenuItemImpl) {
                    swaVar.e[i4].initialize((MenuItemImpl) swaVar.H.b(i4), 0);
                }
                swaVar.G.b = false;
            }
            return;
        }
        swaVar.e();
    }

    @Override // android.support.v7.view.menu.MenuPresenter
    public final void setCallback(MenuPresenter.Callback callback) {
    }

    @Override // android.support.v7.view.menu.MenuPresenter
    public final void onCloseMenu(fb fbVar, boolean z) {
    }
}
