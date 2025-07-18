package defpackage;

import com.google.android.tv.remote.service.RemoteService;
import com.google.android.tv.remote.service.pairing.PairingCodeActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bni implements cow {
    private final bnh a;
    private final /* synthetic */ int b;

    public bni(bnh bnhVar, int i) {
        this.b = i;
        this.a = bnhVar;
    }

    @Override // defpackage.cow
    public final /* synthetic */ cox a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return new bnj(this.a, 0);
        }
        if (i == 1) {
            return new bnj(this.a, 1);
        }
        if (i != 2) {
            return new bnm(this.a, (RemoteService) obj);
        }
        return new bnk(this.a, (PairingCodeActivity) obj);
    }
}
