package defpackage;

import android.accounts.Account;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvn {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/platform/account/auth/AuthTokenCheckerImpl");
    public final jwr b;
    public final ghr c;
    private final ahbt d;
    private final yrx e;

    public gvn(ahbt ahbtVar, jwr jwrVar, yrx yrxVar, ghr ghrVar) {
        ahbtVar.getClass();
        ghrVar.getClass();
        this.d = ahbtVar;
        this.b = jwrVar;
        this.e = yrxVar;
        this.c = ghrVar;
    }

    public final void a(Account account, gvj gvjVar, String str, Duration duration) {
        duration.getClass();
        ahal.e(this.d, null, 0, new gvm(duration, this, account, str, gvjVar, yrn.c(this.e), null), 3);
    }

    public final void b(gvw gvwVar, String str) {
        this.c.ab("GET_TOKEN_DETAILS", str, 3, gvwVar.name());
    }
}
