package defpackage;

import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rjy implements rjv {
    private boolean a = false;
    private final OnAccountsUpdateListener b;
    private final AccountManager c;

    public rjy(Context context, rjk rjkVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        this.b = onAccountsUpdateListener;
        this.c = AccountManager.get(context.getApplicationContext());
        if (czi.b(context, "android.permission.GET_ACCOUNTS") != 0) {
            szg.n(rjkVar.b(), new pjm(2), ugk.a);
        }
    }

    @Override // defpackage.rjv
    public final void a() {
        synchronized (this) {
            if (!this.a) {
                this.c.addOnAccountsUpdatedListener(this.b, null, false, new String[]{"com.google"});
                this.a = true;
            }
        }
    }

    @Override // defpackage.rjv
    public final void b() {
        synchronized (this) {
            if (this.a) {
                try {
                    this.c.removeOnAccountsUpdatedListener(this.b);
                } catch (IllegalArgumentException e) {
                    Log.w("OneGoogle", "Failed to remove an OnAccountsUpdatedListener", e);
                }
                this.a = false;
            }
        }
    }
}
