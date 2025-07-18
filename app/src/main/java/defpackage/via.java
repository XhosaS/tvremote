package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class via implements zxe {
    final /* synthetic */ vib a;

    public via(vib vibVar) {
        this.a = vibVar;
    }

    @Override // defpackage.zxe
    public final void b(Object obj) {
        Iterator it = ((Set) this.a.d.a()).iterator();
        while (it.hasNext()) {
            vqi.d("com/google/apps/tiktok/account/data/AccountProviderSyncer$1", "onSuccess", 220, ((vir) it.next()).a(), "AvailableAccountsInvalidatedObserver failed", new Object[0]);
        }
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
    }
}
