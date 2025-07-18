package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usz implements xqc {
    private static final tui a = tui.l("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor");

    @Override // defpackage.xqc
    public final xqb a(xsq xsqVar, xpy xpyVar, xpz xpzVar) {
        ush ushVar = (ush) xpyVar.g(ush.c);
        if (ushVar != null) {
            ((tug) ((tug) a.b()).j("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 29, "CredentialStrategyInterceptor.java")).v("Using CredentialStrategy: %s", ushVar.getClass());
            return wbb.y(xpzVar, sij.ad(new lii(ushVar, 14))).a(xsqVar, xpyVar);
        }
        ((tug) ((tug) a.b()).j("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 37, "CredentialStrategyInterceptor.java")).s("Did not set CredentialStrategy");
        return xpzVar.a(xsqVar, xpyVar);
    }
}
