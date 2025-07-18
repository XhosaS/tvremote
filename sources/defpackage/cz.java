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
public final class cz extends cy implements ds {
    public final du a;
    private final Context b;
    private final ActionBarContextView c;
    private final cx f;
    private WeakReference g;
    private boolean h;

    public cz(Context context, ActionBarContextView actionBarContextView, cx cxVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = cxVar;
        du duVar = new du(actionBarContextView.getContext());
        duVar.D();
        this.a = duVar;
        duVar.b = this;
    }

    @Override // defpackage.ds
    public final void E(du duVar) {
        g();
        this.c.o();
    }

    @Override // defpackage.ds
    public final boolean I(du duVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.cy
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.cy
    public final MenuInflater b() {
        return new de(this.c.getContext());
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
        return this.c.h;
    }

    @Override // defpackage.cy
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.cy
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override // defpackage.cy
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.cy
    public final void h(View view) {
        this.c.j(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.cy
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.cy
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.cy
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.cy
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.cy
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.cy
    public final boolean n() {
        return this.c.j;
    }
}
