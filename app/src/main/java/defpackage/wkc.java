package defpackage;

import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes2.dex */
class wkc implements bbv {
    final /* synthetic */ wke a;
    final /* synthetic */ ComponentCallbacks2 b;
    final /* synthetic */ wkd c;

    public wkc(wkd wkdVar, wke wkeVar, ComponentCallbacks2 componentCallbacks2) {
        this.a = wkeVar;
        this.b = componentCallbacks2;
        this.c = wkdVar;
    }

    @Override // defpackage.bbv
    public final void b(bcl bclVar) {
        bq bqVar = this.c.a;
        bqVar.s().unregisterComponentCallbacks(this.b);
        bqVar.ek().c(this);
    }

    @Override // defpackage.bbv
    public final void c(bcl bclVar) {
        this.a.b++;
    }

    @Override // defpackage.bbv
    public final void d(bcl bclVar) {
        wke wkeVar = this.a;
        wkeVar.b--;
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void eY(bcl bclVar) {
    }
}
