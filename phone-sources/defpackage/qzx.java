package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzx implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;

    public qzx(xcq xcqVar, xcq xcqVar2, xcq xcqVar3) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, rjk] */
    public static rjq c(rzy rzyVar, Context context, ExecutorService executorService) {
        ogx ogxVar = new ogx(context);
        upc upcVar = new upc(context);
        upcVar.c = ogxVar;
        aafi aafiVar = new aafi(yfm.p(new sjr(upcVar)));
        smf smfVar = smf.a;
        HashMap map = new HashMap();
        sik.b(slu.a, map);
        unc uncVar = new unc(executorService, aafiVar, smfVar, map);
        sjo sjoVar = new sjo();
        sjoVar.c(context);
        sjoVar.e(executorService);
        sjoVar.a = aafiVar;
        sjoVar.b = uncVar;
        sjoVar.d();
        return new rkc((Context) rzyVar.b, sjoVar.f(), rzyVar.a, trk.a, rrx.S());
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rjq b() {
        return c(((rkm) this.a).b(), ((rgq) this.b).a(), ((mii) this.c).b());
    }
}
