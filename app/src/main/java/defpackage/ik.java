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
public class ik extends ij implements jh {
    public final jj a;
    private final Context b;
    private final ActionBarContextView c;
    private final ii f;
    private WeakReference g;
    private boolean h;

    public ik(Context context, ActionBarContextView actionBarContextView, ii iiVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = iiVar;
        jj jjVar = new jj(actionBarContextView.getContext());
        jjVar.f = 1;
        this.a = jjVar;
        jjVar.b = this;
    }

    @Override // defpackage.jh
    public final void C(jj jjVar) {
        g();
        this.c.n();
    }

    @Override // defpackage.jh
    public final boolean G(jj jjVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.ij
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.ij
    public final MenuInflater b() {
        return new ip(this.c.getContext());
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
        return this.c.getSubtitle();
    }

    @Override // defpackage.ij
    public final CharSequence e() {
        return this.c.getTitle();
    }

    @Override // defpackage.ij
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override // defpackage.ij
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.ij
    public final void h(View view) {
        this.c.j(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.ij
    public final void i(int i) {
        Context context = this.b;
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.g = context.getString(i);
        actionBarContextView.h();
    }

    @Override // defpackage.ij
    public final void j(CharSequence charSequence) {
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.g = charSequence;
        actionBarContextView.h();
    }

    @Override // defpackage.ij
    public final void k(int i) {
        this.c.k(this.b.getString(i));
    }

    @Override // defpackage.ij
    public final void l(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.ij
    public final void m(boolean z) {
        this.e = z;
        this.c.l(z);
    }

    @Override // defpackage.ij
    public final boolean n() {
        return this.c.i;
    }
}
