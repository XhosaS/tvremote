package defpackage;

import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nls extends nlx {
    final /* synthetic */ long a;
    final /* synthetic */ nma b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nls(nma nmaVar, nwu nwuVar, long j) {
        super(nmaVar, nwuVar);
        this.a = j;
        this.b = nmaVar;
    }

    @Override // defpackage.nlx
    public final void d() throws JSONException {
        this.b.b.r(e(), new nlm(this.a));
    }
}
