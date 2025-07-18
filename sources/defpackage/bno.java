package defpackage;

import com.google.android.tv.remote.service.DiscoveryService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bno implements bpn {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bno(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.bpn
    public final void a(long j, long j2, long j3) {
        if (this.b == 0) {
            DiscoveryService discoveryService = (DiscoveryService) this.a;
            discoveryService.f = j;
            discoveryService.g = j2;
            discoveryService.h = j3;
            ((cbs) ((cbs) DiscoveryService.a.e().g(btt.a)).j("com/google/android/tv/remote/service/DiscoveryService", "<init>", 78, "DiscoveryService.java")).p("Rotating identifiers have changed");
            discoveryService.a();
            return;
        }
        cbs cbsVar = (cbs) ((cbs) bna.a.e().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothLeServer", "<init>", 57, "BluetoothLeServer.java");
        Long lValueOf = Long.valueOf(j);
        Long lValueOf2 = Long.valueOf(j2);
        cbsVar.A("Rotating identifiers changed (%x, %x, %x), updating scan response data", lValueOf, lValueOf2, Long.valueOf(j3));
        bmx bmxVar = ((bna) this.a).b;
        bmxVar.c = lValueOf2;
        bmxVar.f = null;
        bmxVar.a();
    }
}
