package defpackage;

import android.database.ContentObserver;
import com.google.android.tv.remote.service.DiscoveryService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnp extends ContentObserver {
    final /* synthetic */ DiscoveryService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnp(DiscoveryService discoveryService) {
        super(null);
        this.a = discoveryService;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        DiscoveryService discoveryService = this.a;
        discoveryService.e = discoveryService.i.c();
        ((cbs) DiscoveryService.a.e().j("com/google/android/tv/remote/service/DiscoveryService$1", "onChange", 43, "DiscoveryService.java")).t("Device name has changed to %s", discoveryService.e);
        discoveryService.a();
    }
}
