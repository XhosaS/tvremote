package defpackage;

import com.google.android.gms.auth.aang.GetTokenResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
class jxv extends jxm {
    final /* synthetic */ lvj a;
    final /* synthetic */ jxw b;

    public jxv(jxw jxwVar, lvj lvjVar) {
        this.a = lvjVar;
        this.b = jxwVar;
    }

    @Override // defpackage.jxm, defpackage.jxp
    public final void d(Status status, GetTokenResponse getTokenResponse) {
        this.b.c(status, getTokenResponse, this.a);
    }
}
