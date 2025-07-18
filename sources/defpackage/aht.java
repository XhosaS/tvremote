package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class aht extends ahv {
    public final int a;
    public final Bundle b;
    final /* synthetic */ aib c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aht(aib aibVar, int i, Bundle bundle) {
        super(aibVar, true);
        this.c = aibVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(aeq aeqVar);

    protected abstract boolean b();

    @Override // defpackage.ahv
    protected final /* bridge */ /* synthetic */ void c() {
        int i = this.a;
        if (i != 0) {
            this.c.G(1, null);
            Bundle bundle = this.b;
            a(new aeq(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (b()) {
                return;
            }
            this.c.G(1, null);
            a(new aeq(8, null));
        }
    }
}
