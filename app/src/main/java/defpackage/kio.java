package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class kio extends kis {
    public final int a;
    public final Bundle b;
    final /* synthetic */ kiz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected kio(kiz kizVar, int i, Bundle bundle) {
        super(kizVar, true);
        this.c = kizVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(ConnectionResult connectionResult);

    protected abstract boolean b();

    @Override // defpackage.kis
    protected final /* bridge */ /* synthetic */ void c() {
        int i = this.a;
        if (i != 0) {
            this.c.C(1, null);
            Bundle bundle = this.b;
            a(new ConnectionResult(1, i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
        } else {
            if (b()) {
                return;
            }
            this.c.C(1, null);
            a(new ConnectionResult(1, 8, null, null));
        }
    }
}
