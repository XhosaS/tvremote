package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerFuture;
import android.accounts.OnAccountsUpdateListener;
import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.auth.TokenData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ldv {
    Account b(ieg iegVar);

    Account c(String str);

    Intent e(ieg iegVar);

    iea f();

    ieg g();

    ieh h();

    TokenData i(ieg iegVar);

    String j(ieg iegVar);

    String k();

    String l();

    void m(String str);

    @Deprecated
    void n(String str);

    void o(ieg iegVar, Activity activity, ldu lduVar);

    void p(ksn ksnVar);

    void q(ksn ksnVar, Intent intent);

    boolean r(ieg iegVar);

    boolean s(ksn ksnVar);

    boolean t(String str);

    Account[] u();

    void v(OnAccountsUpdateListener onAccountsUpdateListener);

    AccountManagerFuture w();

    boolean x(int i, int i2);
}
