package defpackage;

import android.app.Activity;
import com.google.android.tv.remote.service.pairing.PairingCodeActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bsk implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bsk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((adx) this.a).i();
                break;
            case 1:
                ((bnu) this.a).a.j.a(1013, 0L);
                break;
            case 2:
                ((PairingCodeActivity) this.a).b();
                break;
            case 3:
                PairingCodeActivity pairingCodeActivity = (PairingCodeActivity) this.a;
                pairingCodeActivity.c = true;
                pairingCodeActivity.b.a();
                pairingCodeActivity.finish();
                break;
            case 4:
                ((Activity) this.a).finish();
                break;
            case 5:
                new Thread(new bsk(this.a, 6), "CancelPairingSession").start();
                break;
            case 6:
                ((blq) this.a).e();
                break;
            default:
                this.a.cancel(false);
                break;
        }
    }
}
