package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjb {
    public final Account a;
    public final String b;

    public qjb(Account account, String str) {
        str.getClass();
        this.a = account;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjb)) {
            return false;
        }
        qjb qjbVar = (qjb) obj;
        return yks.e(this.a, qjbVar.a) && yks.e(this.b, qjbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccountAndScope(account=" + this.a + ", scope=" + this.b + ")";
    }
}
