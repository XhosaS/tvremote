package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hq extends ij implements jh {
    public final jj a;
    public ii b;
    final /* synthetic */ hr c;
    private final Context f;
    private WeakReference g;

    public hq(hr hrVar, Context context, ii iiVar) {
        this.c = hrVar;
        this.f = context;
        this.b = iiVar;
        jj jjVar = new jj(context);
        jjVar.f = 1;
        this.a = jjVar;
        jjVar.b = this;
    }

    @Override // defpackage.jh
    public final void C(jj jjVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.e.n();
    }

    @Override // defpackage.jh
    public final boolean G(jj jjVar, MenuItem menuItem) {
        ii iiVar = this.b;
        if (iiVar != null) {
            return iiVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.ij
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.ij
    public final MenuInflater b() {
        return new ip(this.f);
    }

    @Override // defpackage.ij
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.ij
    public final CharSequence d() {
        return this.c.e.getSubtitle();
    }

    @Override // defpackage.ij
    public final CharSequence e() {
        return this.c.e.getTitle();
    }

    @Override // defpackage.ij
    public final void f() {
        hr hrVar = this.c;
        if (hrVar.g != this) {
            return;
        }
        if (hr.o(hrVar.k, false)) {
            this.b.a(this);
        } else {
            hrVar.h = this;
            hrVar.i = this.b;
        }
        this.b = null;
        hrVar.g(false);
        ActionBarContextView actionBarContextView = hrVar.e;
        if (actionBarContextView.h == null) {
            actionBarContextView.i();
        }
        hrVar.b.j(hrVar.m);
        hrVar.g = null;
    }

    @Override // defpackage.ij
    public final void g() {
        if (this.c.g != this) {
            return;
        }
        jj jjVar = this.a;
        jjVar.q();
        try {
            this.b.d(this, jjVar);
        } finally {
            this.a.p();
        }
    }

    @Override // defpackage.ij
    public final void h(View view) {
        this.c.e.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.ij
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.ij
    public final void j(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.c.e;
        actionBarContextView.g = charSequence;
        actionBarContextView.h();
    }

    @Override // defpackage.ij
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.ij
    public final void l(CharSequence charSequence) {
        this.c.e.k(charSequence);
    }

    @Override // defpackage.ij
    public final void m(boolean z) {
        this.e = z;
        this.c.e.l(z);
    }

    @Override // defpackage.ij
    public final boolean n() {
        return this.c.e.i;
    }
}
