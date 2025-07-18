package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utd implements xqc {
    private final /* synthetic */ int a;

    public utd(int i) {
        this.a = i;
    }

    @Override // defpackage.xqc
    public final xqb a(xsq xsqVar, xpy xpyVar, xpz xpzVar) {
        if (this.a != 0) {
            return xpyVar.g(uqx.a) == null ? xpzVar.a(xsqVar, xpyVar) : new usy(xpzVar, xsqVar, xpyVar);
        }
        sij.x(xpyVar.g(uqx.a) == null, "AuthContext was set, but no AuthContextManager was bound");
        return xpzVar.a(xsqVar, xpyVar);
    }
}
