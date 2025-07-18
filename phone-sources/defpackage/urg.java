package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urg {
    public final Account a;
    public final String b;

    public urg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof urg) {
            urg urgVar = (urg) obj;
            if (this.a.equals(urgVar.a) && this.b.equals(urgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AccountAndScope{account=" + this.a.toString() + ", scope=" + this.b + "}";
    }

    public urg(Account account, String str) {
        this.a = account;
        this.b = str;
    }
}
