package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qps implements qpr {
    private static final tvn a = tvn.n("GnpSdk");

    @Override // defpackage.qpr
    public final void a(Context context) {
        try {
            rwv.c(context);
        } catch (IllegalStateException e) {
            ((tvk) ((tvk) a.l().i(e)).j("com/google/android/libraries/notifications/platform/phenotype/impl/GnpPhenotypeContextInitImpl", "initPhenotypeContext", 23, "GnpPhenotypeContextInitImpl.java")).s("PhenotypeContext.setContext was called more than once");
        }
    }
}
