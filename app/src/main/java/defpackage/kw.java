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
import com.google.android.katniss.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kw extends iw {
    public kt g;
    public int h;
    public boolean i;
    ku j;
    public kp k;
    kr l;
    final kv m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private final SparseBooleanArray r;
    private kq s;

    public kw(Context context) {
        super(context);
        this.r = new SparseBooleanArray();
        this.m = new kv(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw
    public final View a(jm jmVar, View view, ViewGroup viewGroup) {
        View actionView = jmVar.getActionView();
        if (actionView == null || jmVar.m()) {
            jx jxVar = view instanceof jx ? (jx) view : (jx) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            b(jmVar, jxVar);
            actionView = (View) jxVar;
        }
        actionView.setVisibility(true == jmVar.p ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof kz)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.iw
    public final void b(jm jmVar, jx jxVar) {
        jxVar.e(jmVar);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) jxVar;
        actionMenuItemView.b = (ActionMenuView) this.f;
        if (this.s == null) {
            this.s = new kq(this);
        }
        actionMenuItemView.c = this.s;
    }

    @Override // defpackage.iw, defpackage.jw
    public final void c(Context context, jj jjVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = jjVar;
        Resources resources = context.getResources();
        if (!this.o) {
            this.n = true;
        }
        this.p = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.h = ih.a(context);
        int measuredWidth = this.p;
        if (this.n) {
            if (this.g == null) {
                this.g = new kt(this, this.a);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.q = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.iw, defpackage.jw
    public final void d(jj jjVar, boolean z) {
        n();
        q();
        jv jvVar = this.e;
        if (jvVar != null) {
            jvVar.a(jjVar, z);
        }
    }

    @Override // defpackage.iw
    public final boolean f(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.g) {
            return false;
        }
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // defpackage.iw, defpackage.jw
    public final boolean g() {
        ArrayList arrayListE;
        int size;
        boolean z;
        boolean z2;
        boolean z3;
        jj jjVar = this.c;
        View view = null;
        boolean z4 = false;
        if (jjVar != null) {
            arrayListE = jjVar.e();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i = this.h;
        int i2 = this.q;
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
            jm jmVar = (jm) arrayListE.get(i3);
            if (jmVar.r()) {
                i4++;
            } else if (jmVar.q()) {
                i5++;
            } else {
                z5 = true;
            }
            if (this.i && jmVar.p) {
                i = 0;
            }
            i3++;
        }
        if (this.n && (z5 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            jm jmVar2 = (jm) arrayListE.get(i7);
            if (jmVar2.r()) {
                View viewA = a(jmVar2, view, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int i9 = jmVar2.b;
                if (i9 != 0) {
                    sparseBooleanArray.put(i9, z);
                }
                jmVar2.k(z);
                z2 = z4;
                z3 = z;
            } else if (jmVar2.q()) {
                int i10 = jmVar2.b;
                boolean z6 = sparseBooleanArray.get(i10);
                boolean z7 = ((i6 > 0 || z6) && i2 > 0) ? z : z4;
                if (z7) {
                    View viewA2 = a(jmVar2, view, viewGroup);
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
                        jm jmVar3 = (jm) arrayListE.get(i11);
                        boolean z9 = z;
                        if (jmVar3.b == i10) {
                            if (jmVar3.o()) {
                                i6++;
                            }
                            jmVar3.k(false);
                        }
                        i11++;
                        z = z9;
                    }
                }
                z3 = z;
                if (z8) {
                    i6--;
                }
                jmVar2.k(z8);
                z2 = false;
            } else {
                z2 = z4;
                z3 = z;
                jmVar2.k(z2);
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
    /* JADX WARN: Type inference failed for: r9v3, types: [jj] */
    @Override // defpackage.iw, defpackage.jw
    public final boolean h(ke keVar) {
        boolean z = false;
        if (!keVar.hasVisibleItems()) {
            return false;
        }
        ke keVar2 = keVar;
        while (true) {
            jj jjVar = keVar2.m;
            if (jjVar == this.c) {
                break;
            }
            keVar2 = (ke) jjVar;
        }
        jm jmVar = keVar2.n;
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
                if ((childAt instanceof jx) && ((jx) childAt).getItemData() == jmVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        jm jmVar2 = keVar.n;
        int size = keVar.c.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = keVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        kp kpVar = new kp(this, this.b, keVar, view);
        this.k = kpVar;
        kpVar.d(z);
        if (!this.k.h()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        jv jvVar = this.e;
        ke keVar3 = keVar;
        if (jvVar != null) {
            if (keVar == null) {
                keVar3 = this.c;
            }
            jvVar.b(keVar3);
        }
        return true;
    }

    @Override // defpackage.iw
    public final boolean k(jm jmVar) {
        return jmVar.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    @Override // defpackage.iw, defpackage.jw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw.l():void");
    }

    public final void m(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean n() {
        Object obj;
        kr krVar = this.l;
        if (krVar != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(krVar);
            this.l = null;
            return true;
        }
        ku kuVar = this.j;
        if (kuVar == null) {
            return false;
        }
        kuVar.b();
        return true;
    }

    public final boolean o() {
        ku kuVar = this.j;
        return kuVar != null && kuVar.g();
    }

    public final boolean p() {
        jj jjVar;
        if (!this.n || o() || (jjVar = this.c) == null || this.f == null || this.l != null) {
            return false;
        }
        jjVar.i();
        if (jjVar.e.isEmpty()) {
            return false;
        }
        this.l = new kr(this, new ku(this, this.b, this.c, this.g));
        ((View) this.f).post(this.l);
        return true;
    }

    public final void q() {
        kp kpVar = this.k;
        if (kpVar != null) {
            kpVar.b();
        }
    }

    public final void r() {
        this.n = true;
        this.o = true;
    }
}
