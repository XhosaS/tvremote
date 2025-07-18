package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* compiled from: PG */
/* loaded from: classes.dex */
class lte extends ltf {
    final /* synthetic */ lvj a;

    public lte(lvj lvjVar) {
        this.a = lvjVar;
    }

    @Override // defpackage.ltf, defpackage.ltk
    public final void c(Status status, PseudonymousIdToken pseudonymousIdToken) {
        kid.a(status, pseudonymousIdToken, this.a);
    }
}
