package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.SupportMenuInflater;
import android.util.SparseArray;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class swj extends FrameLayout {
    public final svx a;
    public final swa b;
    public final swd c;
    public swh d;
    public pku e;
    private MenuInflater f;

    /* JADX WARN: Removed duplicated region for block: B:211:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0470  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public swj(android.content.Context r17, android.util.AttributeSet r18, int r19, int r20) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swj.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public abstract int a();

    protected abstract swa b(Context context);

    public int d() {
        return a();
    }

    public final int e() {
        return this.b.f;
    }

    public final soo f(int i) {
        return (soo) this.b.q.get(i);
    }

    public final soo g(int i) {
        swa swaVar = this.b;
        swaVar.i(i);
        SparseArray sparseArray = swaVar.q;
        soo sooVar = (soo) sparseArray.get(i);
        if (sooVar == null) {
            soo sooVar2 = new soo(swaVar.getContext(), null);
            sparseArray.put(i, sooVar2);
            sooVar = sooVar2;
        }
        svw svwVarD = swaVar.d(i);
        if (svwVarD != null) {
            svwVarD.o(sooVar);
        }
        return sooVar;
    }

    public final void h(int i) {
        swd swdVar = this.c;
        swdVar.b = true;
        if (this.f == null) {
            this.f = new SupportMenuInflater(getContext());
        }
        this.f.inflate(i, this.a);
        swdVar.b = false;
        swdVar.updateMenuView(true);
    }

    public final void i(int i) {
        swa swaVar = this.b;
        swaVar.i(i);
        svw svwVarD = swaVar.d(i);
        if (svwVarD != null) {
            svwVarD.d();
        }
        swaVar.q.put(i, null);
    }

    public void j(int i) throws Resources.NotFoundException {
        swa swaVar = this.b;
        if (swaVar.C != i) {
            swaVar.h(i);
            this.c.updateMenuView(false);
        }
    }

    public void k(int i) throws Resources.NotFoundException {
        swa swaVar = this.b;
        if (swaVar.d != i) {
            swaVar.d = i;
            svz[] svzVarArr = swaVar.e;
            if (svzVarArr != null) {
                for (svz svzVar : svzVarArr) {
                    if (svzVar instanceof svw) {
                        ((svw) svzVar).w(i);
                    }
                }
            }
            this.c.updateMenuView(false);
        }
    }

    public final void l(int i) {
        swa swaVar = this.b;
        swaVar.s = i;
        svz[] svzVarArr = swaVar.e;
        if (svzVarArr != null) {
            for (svz svzVar : svzVarArr) {
                if (svzVar instanceof svw) {
                    ((svw) svzVar).x(swaVar.s);
                }
            }
        }
    }

    public final void m(int i) {
        swa swaVar = this.b;
        swaVar.r = i;
        svz[] svzVarArr = swaVar.e;
        if (svzVarArr != null) {
            for (svz svzVar : svzVarArr) {
                if (svzVar instanceof svw) {
                    ((svw) svzVar).y(i);
                }
            }
        }
    }

    public final void n(int i) {
        swa swaVar = this.b;
        if (swaVar.c != i) {
            swaVar.c = i;
            this.c.updateMenuView(false);
        }
    }

    public final void o(int i) {
        svx svxVar = this.a;
        MenuItem menuItemFindItem = svxVar.findItem(i);
        if (menuItemFindItem != null) {
            boolean zC = svxVar.C(menuItemFindItem, this.c, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zC || menuItemFindItem.isChecked()) {
                    this.b.f(menuItemFindItem);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        szg.e(this);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof swi)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        swi swiVar = (swi) parcelable;
        super.onRestoreInstanceState(swiVar.getSuperState());
        this.a.j(swiVar.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        swi swiVar = new swi(super.onSaveInstanceState());
        swiVar.a = new Bundle();
        this.a.k(swiVar.a);
        return swiVar;
    }

    protected boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        szg.d(this, f);
    }
}
