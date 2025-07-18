package defpackage;

import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qmq {
    public boolean a = false;
    public final OnAccountsUpdateListener b;
    public final AccountManager c;

    public qmq(Context context, qlo qloVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        this.b = onAccountsUpdateListener;
        this.c = AccountManager.get(context.getApplicationContext());
        if (abs.a(context, "android.permission.GET_ACCOUNTS") != 0) {
            final qls qlsVar = (qls) qloVar;
            Callable callable = new Callable() { // from class: qlp
                @Override // java.util.concurrent.Callable
                public final Object call() throws jwj {
                    String str = jwk.a;
                    Context context2 = qlsVar.b;
                    kkk.k(context2);
                    jwq.c(context2, 11400000);
                    return (Boolean) jwq.f(context2, jwq.d, new jwo(context2.getApplicationInfo().packageName, context2), null);
                }
            };
            zyd zydVarK = zxn.k(wyo.i(callable), qlsVar.c);
            qmp qmpVar = new qmp();
            zxn.p(zydVarK, wyo.f(qmpVar), zwk.a);
        }
    }
}
