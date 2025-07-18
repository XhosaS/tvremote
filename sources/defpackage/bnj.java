package defpackage;

import android.content.Context;
import com.google.android.tv.remote.service.AtvRemoteProviderService;
import com.google.android.tv.remote.service.DiscoveryService;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnj implements cox {
    private final bnh a;
    private final /* synthetic */ int b;

    public bnj(bnh bnhVar, int i) {
        this.b = i;
        this.a = bnhVar;
    }

    @Override // defpackage.cox
    public final /* synthetic */ void b(Object obj) {
        if (this.b != 0) {
            ((AtvRemoteProviderService) obj).e = (bsi) this.a.dE.a();
            return;
        }
        DiscoveryService discoveryService = (DiscoveryService) obj;
        bnh bnhVar = this.a;
        Context context = bnhVar.a;
        discoveryService.i = new dka(context, new btn(context));
        discoveryService.c = (bpo) bnhVar.dF.a();
        discoveryService.d = ((Boolean) bnhVar.dG.a()).booleanValue();
    }
}
