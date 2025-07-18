package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjh implements wlk, wla {
    private static final zdy a = zdy.h("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedReceiver");
    private final vjg b;

    public vjh(vjg vjgVar) {
        this.b = vjgVar;
    }

    @Override // defpackage.wlk
    public final zyd a(Intent intent) {
        ((zdv) ((zdv) a.b()).q("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedReceiver", "onReceive", 40, "DeviceAccountsChangedReceiver.java")).u("DeviceAccountsChangedReceiver#onReceive");
        vjg vjgVar = this.b;
        if (vjgVar.c()) {
            return zxy.a;
        }
        vjgVar.b();
        return vjgVar.a();
    }

    @Override // defpackage.wla
    public final long b() {
        return -1L;
    }

    @Override // defpackage.wla
    public final /* synthetic */ long c() {
        return -1L;
    }
}
