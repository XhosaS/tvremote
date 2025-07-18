package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kns {
    private final AccountManager a;

    private kns(AccountManager accountManager) {
        this.a = accountManager;
    }

    public static kns a(Context context) {
        return new kns(AccountManager.get(context));
    }

    public final Account[] b() {
        wvx wvxVarF = wzg.f("AccountManager.getAccounts", wwb.a, true);
        try {
            Account[] accounts = this.a.getAccounts();
            wvxVarF.close();
            return accounts;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
