package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ueh {
    public static final Account a = new Account("shared", "mobstore");

    public static Account a(String str) {
        if ("shared".equals(str)) {
            return a;
        }
        int iIndexOf = str.indexOf(58);
        ugg.a(iIndexOf >= 0, "Malformed account", new Object[0]);
        return new Account(str.substring(iIndexOf + 1), str.substring(0, iIndexOf));
    }

    public static String b(Account account) {
        ugg.a(account.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        ugg.a(account.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        ugg.a(account.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (a.equals(account)) {
            return "shared";
        }
        return account.type + ":" + account.name;
    }
}
