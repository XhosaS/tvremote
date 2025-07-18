package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gka extends gjv {
    final /* synthetic */ gkc a;

    public gka(gkc gkcVar) {
        this.a = gkcVar;
    }

    @Override // defpackage.gjv, defpackage.gjr
    public final void a(gju gjuVar) {
        gkc gkcVar = this.a;
        gkcVar.v.remove(gjuVar);
        if (gkcVar.z()) {
            return;
        }
        gkcVar.s(gkcVar, gjt.c, false);
        gkcVar.l = true;
        gkcVar.s(gkcVar, gjt.b, false);
    }
}
