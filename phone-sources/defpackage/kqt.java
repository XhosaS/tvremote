package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqt implements xcm {
    private final kqf a;
    private final xcq b;
    private final /* synthetic */ int c;

    public kqt(kqf kqfVar, xcq xcqVar, int i) {
        this.c = i;
        this.a = kqfVar;
        this.b = xcqVar;
    }

    public final Executor a() {
        if (this.c != 0) {
            return this.a.A((jzs) this.b.b());
        }
        return this.a.B((jzs) this.b.b());
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        return this.c != 0 ? a() : a();
    }
}
