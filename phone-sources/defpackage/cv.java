package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class cv extends gll {
    private final cr c;
    private cy d = null;
    private bv e = null;
    private boolean f;

    @Deprecated
    public cv(cr crVar) {
        this.c = crVar;
    }

    private static String n(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // defpackage.gll
    public final Parcelable a() {
        return null;
    }

    public abstract bv b(int i);

    @Override // defpackage.gll
    public final Object c(ViewGroup viewGroup, int i) {
        if (this.d == null) {
            this.d = new at(this.c);
        }
        long j = i;
        bv bvVarF = this.c.f(n(viewGroup.getId(), j));
        if (bvVarF != null) {
            this.d.o(new cx(7, bvVarF));
        } else {
            bvVarF = b(i);
            this.d.q(viewGroup.getId(), bvVarF, n(viewGroup.getId(), j));
        }
        if (bvVarF != this.e) {
            bvVarF.setMenuVisibility(false);
            bvVarF.setUserVisibleHint(false);
        }
        return bvVarF;
    }

    @Override // defpackage.gll
    public final void d(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException(a.cj(this, "ViewPager with adapter ", " requires a view id"));
        }
    }

    @Override // defpackage.gll
    public final boolean e(View view, Object obj) {
        return ((bv) obj).getView() == view;
    }

    @Override // defpackage.gll
    public final void f(ViewGroup viewGroup, Object obj) {
        bv bvVar = (bv) obj;
        if (this.d == null) {
            this.d = new at(this.c);
        }
        cy cyVar = this.d;
        cr crVar = bvVar.mFragmentManager;
        if (crVar != null && crVar != ((at) cyVar).a) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + bvVar.toString() + " is already attached to a FragmentManager.");
        }
        cyVar.o(new cx(6, bvVar));
        if (bvVar.equals(this.e)) {
            this.e = null;
        }
    }

    @Override // defpackage.gll
    public final void g() {
        cy cyVar = this.d;
        if (cyVar != null) {
            if (!this.f) {
                try {
                    this.f = true;
                    cyVar.f();
                } finally {
                    this.f = false;
                }
            }
            this.d = null;
        }
    }

    @Override // defpackage.gll
    public final void i(Object obj) {
        bv bvVar = (bv) obj;
        bv bvVar2 = this.e;
        if (bvVar != bvVar2) {
            if (bvVar2 != null) {
                bvVar2.setMenuVisibility(false);
                this.e.setUserVisibleHint(false);
            }
            bvVar.setMenuVisibility(true);
            bvVar.setUserVisibleHint(true);
            this.e = bvVar;
        }
    }

    @Override // defpackage.gll
    public final void h(Parcelable parcelable) {
    }
}
