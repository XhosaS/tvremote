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
public final class cs extends cy implements ds {
    public final du a;
    public cx b;
    final /* synthetic */ ct c;
    private final Context f;
    private WeakReference g;

    public cs(ct ctVar, Context context, cx cxVar) {
        this.c = ctVar;
        this.f = context;
        this.b = cxVar;
        du duVar = new du(context);
        duVar.D();
        this.a = duVar;
        duVar.b = this;
    }

    @Override // defpackage.ds
    public final void E(du duVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.d.o();
    }

    @Override // defpackage.ds
    public final boolean I(du duVar, MenuItem menuItem) {
        cx cxVar = this.b;
        if (cxVar != null) {
            return cxVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.cy
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.cy
    public final MenuInflater b() {
        return new de(this.f);
    }

    @Override // defpackage.cy
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.cy
    public final CharSequence d() {
        return this.c.d.h;
    }

    @Override // defpackage.cy
    public final CharSequence e() {
        return this.c.d.g;
    }

    @Override // defpackage.cy
    public final void f() {
        ct ctVar = this.c;
        if (ctVar.f != this) {
            return;
        }
        if (ct.j(ctVar.k, false)) {
            this.b.a(this);
        } else {
            ctVar.g = this;
            ctVar.h = this.b;
        }
        this.b = null;
        ctVar.g(false);
        ActionBarContextView actionBarContextView = ctVar.d;
        if (actionBarContextView.i == null) {
            actionBarContextView.i();
        }
        ctVar.b.k(ctVar.m);
        ctVar.f = null;
    }

    @Override // defpackage.cy
    public final void g() {
        if (this.c.f != this) {
            return;
        }
        du duVar = this.a;
        duVar.s();
        try {
            this.b.d(this, duVar);
        } finally {
            this.a.r();
        }
    }

    @Override // defpackage.cy
    public final void h(View view) {
        this.c.d.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.cy
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.cy
    public final void j(CharSequence charSequence) {
        this.c.d.k(charSequence);
    }

    @Override // defpackage.cy
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.cy
    public final void l(CharSequence charSequence) {
        this.c.d.l(charSequence);
    }

    @Override // defpackage.cy
    public final void m(boolean z) {
        this.e = z;
        this.c.d.m(z);
    }

    @Override // defpackage.cy
    public final boolean n() {
        return this.c.d.j;
    }
}
