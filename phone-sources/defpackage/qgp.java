package defpackage;

import android.content.BroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgp {
    private static final tvn a = tvn.n("GnpSdk");
    private final BroadcastReceiver.PendingResult b;
    private final boolean c;
    private final int d;
    private boolean e;

    public qgp(BroadcastReceiver.PendingResult pendingResult, boolean z, int i) {
        this.b = pendingResult;
        this.c = z;
        this.d = i;
    }

    public final synchronized void a() {
        if (this.e) {
            ((tvk) a.l().j("com/google/android/libraries/notifications/platform/executor/BroadcastAsyncOperation", "finish", 29, "BroadcastAsyncOperation.java")).t("Already finished BroadcastAsyncOperation [%d]", this.d);
            return;
        }
        if (this.c) {
            this.b.setResultCode(-1);
        }
        this.b.finish();
        this.e = true;
        ((tvk) a.l().j("com/google/android/libraries/notifications/platform/executor/BroadcastAsyncOperation", "finish", 41, "BroadcastAsyncOperation.java")).t("Finished BroadcastAsyncOperation [%d]", this.d);
    }

    public final String toString() {
        return "BroadcastAsyncOperation{executionId=" + this.d + "}";
    }
}
