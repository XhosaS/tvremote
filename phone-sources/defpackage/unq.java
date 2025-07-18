package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class unq implements unt {
    final kwy a;

    public unq(kwy kwyVar) {
        this.a = kwyVar;
    }

    @Override // defpackage.unt
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.unt
    public final boolean b(unz unzVar) {
        if (!unzVar.e() && !unzVar.d() && !unzVar.b()) {
            return false;
        }
        this.a.w(unzVar.a);
        return true;
    }
}
