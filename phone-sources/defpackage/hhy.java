package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhy extends BroadcastReceiver {
    final /* synthetic */ qtx a;
    private boolean b;
    private final boolean c;

    public hhy(qtx qtxVar, boolean z) {
        this.a = qtxVar;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [hii, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [hii, java.lang.Object] */
    private final void d(Bundle bundle, hij hijVar, int i, wdc wdcVar, long j, boolean z) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                this.a.f.b(hih.c(23, i, hijVar, wdcVar), j, z);
                return;
            }
            ?? r4 = this.a.f;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            vuc vucVarP = vuc.p(wcy.a, byteArray, 0, byteArray.length, vtp.a());
            vuc.B(vucVarP);
            r4.b((wcy) vucVarP, j, z);
        } catch (Throwable unused) {
            hiy.e("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        if (this.b) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, true != this.c ? 4 : 2);
        } else {
            context.registerReceiver(this, intentFilter);
        }
        this.b = true;
    }

    public final synchronized void b(Context context) {
        if (!this.b) {
            hiy.e("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.b = false;
        }
    }

    public final synchronized void c(Context context, IntentFilter intentFilter) {
        hhy hhyVar;
        try {
            try {
                if (this.b) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    hhyVar = this;
                    context.registerReceiver(hhyVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.c ? 4 : 2);
                } else {
                    hhyVar = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                hhyVar.b = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Type inference failed for: r0v10, types: [hii, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [hii, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [hii, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r4v15, types: [hii, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [hii, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [hii, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r21, android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhy.onReceive(android.content.Context, android.content.Intent):void");
    }
}
