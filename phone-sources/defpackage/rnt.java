package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnt {
    public final Executor a;
    public final Set b;
    public final yfo c;
    public vtw d;
    public final rvg e;
    private final Executor f;

    public rnt(Executor executor, Set set, rvg rvgVar, yfo yfoVar) {
        this.a = executor;
        this.e = rvgVar;
        this.f = new uib(executor);
        this.b = set;
        this.c = yfoVar;
    }

    public final uhp a(final rnr rnrVar) {
        return sfy.E(new Runnable() { // from class: rns
            /* JADX WARN: Removed duplicated region for block: B:60:0x0188  */
            /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Set] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 466
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rns.run():void");
            }
        }, this.f);
    }
}
