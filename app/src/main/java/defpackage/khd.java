package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
class khd implements Runnable {
    final /* synthetic */ kha a;
    final /* synthetic */ String b = "ConnectionlessLifecycleHelper";
    final /* synthetic */ khe c;

    public khd(khe kheVar, kha khaVar) {
        this.a = khaVar;
        this.c = kheVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        khe kheVar = this.c;
        if (kheVar.a > 0) {
            kha khaVar = this.a;
            Bundle bundle = kheVar.b;
            khaVar.d(bundle != null ? bundle.getBundle(this.b) : null);
        }
        if (kheVar.a >= 2) {
            this.a.i();
        }
        if (kheVar.a >= 3) {
            this.a.h();
        }
        if (kheVar.a >= 4) {
            this.a.j();
        }
    }
}
