package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjm implements uha {
    private final /* synthetic */ int a;

    public pjm(int i) {
        this.a = i;
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
        int i = this.a;
        if (i == 0) {
            ((tvk) ((tvk) ((tvk) pne.a.f()).i(th)).j("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "provideEventResultHandler", 24, "FloggerResultDaggerModule.java")).r();
            return;
        }
        if (i == 1) {
            hiy.e("BillingClient", "RuntimeFlags registration failed.");
        } else if (i == 2) {
            Log.w("OneGoogle", "Failed to grant account access to app", th);
        } else {
            if (th instanceof rkd) {
                return;
            }
            Log.w("OneGoogle", String.format("Failed to load owner avatar. exception type: %s", th.getClass().getName()));
        }
    }

    @Override // defpackage.uha
    public final /* synthetic */ void b(Object obj) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            hiy.e("BillingClient", "RuntimeFlags registration success.");
        } else if (i != 2) {
        } else {
            if (((Boolean) obj).booleanValue()) {
                return;
            }
            Log.e("OneGoogle", "Failed to grant account access to app");
        }
    }
}
