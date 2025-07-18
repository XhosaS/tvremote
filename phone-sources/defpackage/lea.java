package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lea implements xcm {
    private final xcq a;

    public lea(xcq xcqVar) {
        this.a = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Account b() {
        ldv ldvVar = (ldv) this.a.b();
        Account accountB = ldvVar.b(ldvVar.g());
        if (accountB != null) {
            return accountB;
        }
        throw new RuntimeException("Could not get current account");
    }
}
