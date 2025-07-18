package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tv.remote.service.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fa extends dk {
    ey g;
    public int h;
    public ez i;
    public ew j;
    public bhv k;
    final ci l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private final SparseBooleanArray r;
    private byj s;

    public fa(Context context) {
        super(context);
        this.r = new SparseBooleanArray();
        this.l = new ci(this, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v4, types: [eh] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.dk
    public final View a(dw dwVar, View view, ViewGroup viewGroup) {
        View actionView = dwVar.getActionView();
        if (actionView == null || dwVar.m()) {
            ActionMenuItemView actionMenuItemView = view instanceof eh ? (eh) view : (eh) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            actionMenuItemView.f(dwVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.b = (ActionMenuView) this.f;
            if (this.s == null) {
                this.s = new byj(this, null);
            }
            actionMenuItemView2.c = this.s;
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(true == dwVar.o ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof fd)) {
            actionView.setLayoutParams(ActionMenuView.n(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.dk, defpackage.eg
    public final void b(Context context, du duVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = duVar;
        Resources resources = context.getResources();
        if (!this.n) {
            this.m = true;
        }
        this.o = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.h = ii.H(context);
        int measuredWidth = this.o;
        if (this.m) {
            if (this.g == null) {
                this.g = new ey(this, this.a);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.p = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.dk, defpackage.eg
    public final void c(du duVar, boolean z) {
        n();
        ef efVar = this.e;
        if (efVar != null) {
            efVar.a(duVar, z);
        }
    }

    @Override // defpackage.dk, defpackage.eg
    public final boolean e() {
        ArrayList arrayListF;
        int size;
        boolean z;
        boolean z2;
        boolean z3;
        du duVar = this.c;
        View view = null;
        boolean z4 = false;
        if (duVar != null) {
            arrayListF = duVar.f();
            size = arrayListF.size();
        } else {
            arrayListF = null;
            size = 0;
        }
        int i = this.h;
        int i2 = this.p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i3 = 0;
        boolean z5 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            dw dwVar = (dw) arrayListF.get(i3);
            if (dwVar.r()) {
                i4++;
            } else if (dwVar.q()) {
                i5++;
            } else {
                z5 = true;
            }
            if (this.q && dwVar.o) {
                i = 0;
            }
            i3++;
        }
        if (this.m && (z5 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            dw dwVar2 = (dw) arrayListF.get(i7);
            if (dwVar2.r()) {
                View viewA = a(dwVar2, view, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int i9 = dwVar2.b;
                if (i9 != 0) {
                    sparseBooleanArray.put(i9, z);
                }
                dwVar2.k(z);
                z2 = z4;
                z3 = z;
            } else if (dwVar2.q()) {
                int i10 = dwVar2.b;
                boolean z6 = sparseBooleanArray.get(i10);
                boolean z7 = ((i6 > 0 || z6) && i2 > 0) ? z : z4;
                if (z7) {
                    View viewA2 = a(dwVar2, view, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z7 = i2 + i8 > 0 ? z : false;
                }
                boolean z8 = z7;
                if (z8 && i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                } else if (z6) {
                    sparseBooleanArray.put(i10, false);
                    int i11 = 0;
                    while (i11 < i7) {
                        dw dwVar3 = (dw) arrayListF.get(i11);
                        boolean z9 = z;
                        if (dwVar3.b == i10) {
                            if (dwVar3.o()) {
                                i6++;
                            }
                            dwVar3.k(false);
                        }
                        i11++;
                        z = z9;
                    }
                }
                z3 = z;
                if (z8) {
                    i6--;
                }
                dwVar2.k(z8);
                z2 = false;
            } else {
                z2 = z4;
                z3 = z;
                dwVar2.k(z2);
            }
            i7++;
            z4 = z2;
            z = z3;
            view = null;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v3, types: [du] */
    @Override // defpackage.dk, defpackage.eg
    public final boolean f(en enVar) {
        boolean z = false;
        if (!enVar.hasVisibleItems()) {
            return false;
        }
        en enVar2 = enVar;
        while (true) {
            du duVar = enVar2.k;
            if (duVar == this.c) {
                break;
            }
            enVar2 = (en) duVar;
        }
        dw dwVar = enVar2.l;
        ViewGroup viewGroup = (ViewGroup) this.f;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                ?? childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof eh) && ((eh) childAt).a() == dwVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        dw dwVar2 = enVar.l;
        int size = enVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = enVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        ew ewVar = new ew(this, this.b, enVar, view);
        this.j = ewVar;
        ewVar.d(z);
        if (!this.j.h()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        ef efVar = this.e;
        en enVar3 = enVar;
        if (efVar != null) {
            if (enVar == null) {
                enVar3 = this.c;
            }
            efVar.b(enVar3);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
    @Override // defpackage.dk, defpackage.eg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa.i():void");
    }

    public final void j(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean k() {
        Object obj;
        bhv bhvVar = this.k;
        if (bhvVar != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(bhvVar);
            this.k = null;
            return true;
        }
        ez ezVar = this.i;
        if (ezVar == null) {
            return false;
        }
        ezVar.b();
        return true;
    }

    public final boolean l() {
        ez ezVar = this.i;
        return ezVar != null && ezVar.g();
    }

    public final boolean m() {
        du duVar;
        if (!this.m || l() || (duVar = this.c) == null || this.f == null || this.k != null || duVar.e().isEmpty()) {
            return false;
        }
        this.k = new bhv(this, new ez(this, this.b, this.c, this.g), 1);
        ((View) this.f).post(this.k);
        return true;
    }

    public final void n() {
        k();
        q();
    }

    public final void o() {
        this.q = true;
    }

    public final void p() {
        this.m = true;
        this.n = true;
    }

    public final void q() {
        ew ewVar = this.j;
        if (ewVar != null) {
            ewVar.b();
        }
    }
}
