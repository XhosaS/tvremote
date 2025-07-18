package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvv {
    public final Account a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ gvv(Account account, String str, String str2, boolean z, boolean z2, int i) {
        account.getClass();
        str = (i & 2) != 0 ? "" : str;
        str.getClass();
        str2 = (i & 4) != 0 ? "" : str2;
        str2.getClass();
        this.a = account;
        this.b = str;
        this.c = str2;
        this.d = ((i & 8) == 0) & z;
        this.e = ((i & 16) == 0) & z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvv)) {
            return false;
        }
        gvv gvvVar = (gvv) obj;
        return agvy.c(this.a, gvvVar.a) && agvy.c(this.b, gvvVar.b) && agvy.c(this.c, gvvVar.c) && this.d == gvvVar.d && this.e == gvvVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + gvu.a(this.d)) * 31) + gvu.a(this.e);
    }

    public final String toString() {
        return "TokenInfo(account=" + this.a + ", gaiaId=" + this.b + ", token=" + this.c + ", signedIn=" + this.d + ", shouldRetry=" + this.e + ")";
    }
}
