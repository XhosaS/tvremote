package defpackage;

import android.accounts.AccountManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pku {
    public final String a;
    public final AccountManager b;

    public pku(Context context) {
        this.a = context.getPackageName();
        this.b = AccountManager.get(context);
    }
}
