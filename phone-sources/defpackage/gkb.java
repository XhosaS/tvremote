package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkb extends gjv {
    final gkc a;

    public gkb(gkc gkcVar) {
        this.a = gkcVar;
    }

    @Override // defpackage.gjv, defpackage.gjr
    public final void b(gju gjuVar) {
        gkc gkcVar = this.a;
        int i = gkcVar.w - 1;
        gkcVar.w = i;
        if (i == 0) {
            gkcVar.x = false;
            gkcVar.r();
        }
        gjuVar.G(this);
    }

    @Override // defpackage.gjv, defpackage.gjr
    public final void e(gju gjuVar) {
        gkc gkcVar = this.a;
        if (gkcVar.x) {
            return;
        }
        gkcVar.y();
        gkcVar.x = true;
    }
}
