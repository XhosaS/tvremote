package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxa implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;

    public pxa(xcq xcqVar, xcq xcqVar2, xcq xcqVar3) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pwz b() {
        return new pwz((tst) ((xcn) this.a).a, (tst) this.b.b(), (Map) ((xcn) this.c).a);
    }
}
