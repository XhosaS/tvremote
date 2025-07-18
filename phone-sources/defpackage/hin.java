package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hin {
    public boolean a;
    public Object b;

    public hin() {
    }

    public final void a(wdh wdhVar) {
        if (this.a) {
            hiy.e("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((pkg) this.b).l(new ndu(null, wdhVar, 1, null));
        } catch (Throwable unused) {
            hiy.e("BillingLogger", "logging failed.");
        }
    }

    public hin(byte[] bArr) {
        this.b = new fjf(1);
    }

    public hin(Context context) {
        int i = 1;
        try {
            nea.b(context);
            this.b = nea.a().c().a("PLAY_BILLING_LIBRARY", new ndt(), new nnp(i));
        } catch (Throwable unused) {
            this.a = true;
        }
    }
}
