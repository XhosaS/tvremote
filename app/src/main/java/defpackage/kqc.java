package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqc extends kqg {
    private final Account b;
    private final ztw c;

    public kqc(Account account, ztw ztwVar) {
        if (account == null) {
            throw new NullPointerException("Null account");
        }
        this.b = account;
        if (ztwVar == null) {
            throw new NullPointerException("Null timeSource");
        }
        this.c = ztwVar;
    }

    @Override // defpackage.kqg, defpackage.keb
    public final Account a() {
        return this.b;
    }

    @Override // defpackage.kqg
    public final ztw b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kqg) {
            kqg kqgVar = (kqg) obj;
            if (this.b.equals(kqgVar.a()) && this.c.equals(kqgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "MdiSyncClientOptions{account=" + this.b.toString() + ", timeSource=TimeSource.system()}";
    }
}
