package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqw implements xcm {
    private final kqf a;
    private final xcq b;

    public kqw(kqf kqfVar, xcq xcqVar) {
        this.a = kqfVar;
        this.b = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yow b() {
        return this.a.f((Executor) this.b.b());
    }
}
