package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class prx extends BroadcastReceiver {
    final /* synthetic */ ttm a;
    final /* synthetic */ Account b;

    public prx(ttm ttmVar, Account account) {
        this.a = ttmVar;
        this.b = account;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pru] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ?? r0 = this.a.get();
        if (r0 != 0) {
            Account[] accounts = xhc.b(context) ? AccountManager.get(context).getAccounts() : kwy.D(context).x();
            int intExtra = intent.getIntExtra("account_index", -1);
            if (intExtra == -1 || intExtra >= accounts.length || !accounts[intExtra].equals(this.b)) {
                return;
            }
            r0.f();
        }
    }
}
