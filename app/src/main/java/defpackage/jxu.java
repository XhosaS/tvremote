package defpackage;

import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
class jxu extends jxm {
    final /* synthetic */ lvj a;
    final /* synthetic */ jxw b;

    public jxu(jxw jxwVar, lvj lvjVar) {
        this.a = lvjVar;
        this.b = jxwVar;
    }

    @Override // defpackage.jxm, defpackage.jxp
    public final void c(Status status, GetAccountsResponse getAccountsResponse) {
        this.b.c(status, getAccountsResponse, this.a);
    }
}
