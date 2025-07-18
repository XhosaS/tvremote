package defpackage;

import android.accounts.OnAccountsUpdateListener;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rjz implements rju {
    private final /* synthetic */ int a;

    public rjz(int i) {
        this.a = i;
    }

    @Override // defpackage.rju
    public final rjv a(Context context, rjk rjkVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        return this.a != 0 ? new rjx(context, rjkVar, onAccountsUpdateListener) : new rjy(context, rjkVar, onAccountsUpdateListener);
    }
}
