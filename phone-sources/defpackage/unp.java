package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class unp implements unt {
    private final unu a;
    private final kwy b;

    public unp(unu unuVar, kwy kwyVar) {
        this.a = unuVar;
        this.b = kwyVar;
    }

    @Override // defpackage.unt
    public final boolean a(Exception exc) {
        this.b.v(exc);
        return true;
    }

    @Override // defpackage.unt
    public final boolean b(unz unzVar) {
        if (!unzVar.d() || this.a.c(unzVar)) {
            return false;
        }
        kwy kwyVar = this.b;
        String str = unzVar.b;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        kwyVar.u(new unr(str, unzVar.d, unzVar.e));
        return true;
    }
}
