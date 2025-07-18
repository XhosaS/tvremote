package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovj implements ovi {
    private final Context a;
    private final Executor b;

    public ovj(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    @Override // defpackage.ovi
    public final String a(Account account, String str) {
        return jwk.i(this.a, account, str, new Bundle(), this.b).b;
    }

    @Override // defpackage.ovi
    public final void b(String str) {
        String str2 = jwk.a;
        AccountManager.get(this.a).invalidateAuthToken("com.google", str);
    }
}
