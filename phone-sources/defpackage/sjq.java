package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjq {
    public static final Account a = new Account("shared", "mobstore");

    public static String a(Account account) {
        sij.c(account.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        sij.c(account.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        sij.c(account.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (b(account)) {
            return "shared";
        }
        return account.type + ":" + account.name;
    }

    static boolean b(Account account) {
        return a.equals(account);
    }
}
