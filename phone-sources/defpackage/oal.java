package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class oal extends oan {
    public final int a;
    public final Bundle b;
    final /* synthetic */ oat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected oal(oat oatVar, int i, Bundle bundle) {
        super(oatVar, true);
        this.c = oatVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(nve nveVar);

    protected abstract boolean b();

    @Override // defpackage.oan
    protected final /* bridge */ /* synthetic */ void c() {
        int i = this.a;
        if (i != 0) {
            this.c.m(1, null);
            Bundle bundle = this.b;
            a(new nve(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (b()) {
                return;
            }
            this.c.m(1, null);
            a(new nve(8, null));
        }
    }
}
