package defpackage;

import android.content.Context;
import com.google.android.tv.remote.service.pairing.PairingCodeActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnk implements cox {
    private final PairingCodeActivity a;
    private final bnh b;

    public bnk(bnh bnhVar, PairingCodeActivity pairingCodeActivity) {
        this.b = bnhVar;
        this.a = pairingCodeActivity;
    }

    @Override // defpackage.cox
    public final /* synthetic */ void b(Object obj) {
        PairingCodeActivity pairingCodeActivity = (PairingCodeActivity) obj;
        pairingCodeActivity.e = this.b.a();
        pairingCodeActivity.d = new adx((Context) this.a, (byte[]) null);
    }
}
