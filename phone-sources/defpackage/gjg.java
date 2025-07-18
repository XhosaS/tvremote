package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjg extends gjv {
    boolean a = false;
    final ViewGroup b;

    public gjg(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.gjv, defpackage.gjr
    public final void a(gju gjuVar) {
        gkf.a(this.b, false);
        this.a = true;
    }

    @Override // defpackage.gjv, defpackage.gjr
    public final void b(gju gjuVar) {
        if (!this.a) {
            gkf.a(this.b, false);
        }
        gjuVar.G(this);
    }

    @Override // defpackage.gjv, defpackage.gjr
    public final void c() {
        gkf.a(this.b, false);
    }

    @Override // defpackage.gjv, defpackage.gjr
    public final void d() {
        gkf.a(this.b, true);
    }
}
