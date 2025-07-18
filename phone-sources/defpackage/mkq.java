package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mkq extends jys {
    final /* synthetic */ mkr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkq(mkr mkrVar) {
        super((char[]) null);
        this.a = mkrVar;
    }

    @Override // defpackage.jys
    public final void I(int i) {
        krd.f(a.cf(i, "onApplicationDisconnected: "));
        if (i == 2005) {
            this.a.B();
        }
        this.a.C(false);
    }

    @Override // defpackage.jys
    public final void K() {
        nwu nwuVar = this.a.h;
        if (!nwuVar.g()) {
            krd.b("onApplicationStatusChanged not connected");
        } else {
            jzs jzsVar = nkm.a;
            krd.b("onApplicationStatusChanged ".concat(String.valueOf(TextUtils.isEmpty(jys.N(nwuVar)) ? "empty status " : jys.N(nwuVar))));
        }
    }
}
