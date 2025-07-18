package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ogl implements nwi {
    public final Account a;
    public final uep b;

    public ogl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ogl) {
            ogl oglVar = (ogl) obj;
            if (this.a.equals(oglVar.a) && this.b.equals(oglVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MdiSyncClientOptions{account=" + this.a.toString() + ", timeSource=TimeSource.system()}";
    }

    public ogl(Account account, uep uepVar) {
        if (account == null) {
            throw new NullPointerException("Null account");
        }
        this.a = account;
        if (uepVar == null) {
            throw new NullPointerException("Null timeSource");
        }
        this.b = uepVar;
    }
}
