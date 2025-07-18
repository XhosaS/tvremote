package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzy implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;

    public qzy(xcq xcqVar, xcq xcqVar2, xcq xcqVar3) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
    }

    public static qtr c(Context context, ExecutorService executorService, qzf qzfVar) {
        return new qty(context, executorService, new rgk(1), qzfVar);
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qtr b() {
        return c(((rgq) this.a).a(), ((mii) this.b).b(), ((qzg) this.c).b());
    }
}
