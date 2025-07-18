package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pzz extends qad {
    private final pyd c;
    private final String d;

    public pzz(pyd pydVar) {
        pydVar.getClass();
        this.c = pydVar;
        this.d = "RPC_FETCH_LATEST_THREADS";
    }

    @Override // defpackage.qsx
    public final String d() {
        return this.d;
    }

    @Override // defpackage.qad
    public final Object f(Bundle bundle, vme vmeVar, qen qenVar, yih yihVar) {
        if (qenVar == null) {
            return j();
        }
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION");
        vlo vloVarB = vlo.b(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", vlo.FETCH_REASON_UNSPECIFIED.p));
        if (vloVarB != null) {
            return this.c.d(qenVar, j, vloVarB, vmeVar, yihVar);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // defpackage.qad
    protected final String g() {
        return "FetchLatestThreadsCallback";
    }
}
