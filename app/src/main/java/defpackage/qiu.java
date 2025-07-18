package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qiu extends BroadcastReceiver {
    final /* synthetic */ yrp a;
    final /* synthetic */ Account b;

    public qiu(yrp yrpVar, Account account) {
        this.a = yrpVar;
        this.b = account;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qip] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ?? EV = this.a.eV();
        if (EV != 0) {
            Account[] accounts = aevz.c(context) ? AccountManager.get(context).getAccounts() : kns.a(context).b();
            int intExtra = intent.getIntExtra("account_index", -1);
            if (intExtra == -1 || intExtra >= accounts.length || !accounts[intExtra].equals(this.b)) {
                return;
            }
            EV.j();
        }
    }
}
