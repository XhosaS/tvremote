package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class klo implements OnAccountsUpdateListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ klo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.accounts.OnAccountsUpdateListener
    public final void onAccountsUpdated(Account[] accountArr) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ((igp) this.a).c.s();
                return;
            }
            rkc rkcVar = (rkc) this.a;
            rkcVar.i();
            for (Account account : accountArr) {
                rkcVar.h(account);
            }
            return;
        }
        accountArr.getClass();
        boolean z = accountArr.length != 0;
        mdw mdwVar = (mdw) this.a;
        ((yvc) mdwVar.a).e(Boolean.valueOf(z));
        Intent intent = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
        Context context = (Context) mdwVar.c;
        intent.setPackage(context.getPackageName());
        intent.putExtra("FORCE_REFRESH", true);
        context.sendBroadcast(intent);
    }
}
