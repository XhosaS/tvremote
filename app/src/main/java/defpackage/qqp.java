package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qqp implements qqq {
    public qpw a;
    public final agow b;
    public final qqk c;
    private final Executor d;
    private final Executor e;
    private final Set f;

    public qqp(Executor executor, Set set, qqk qqkVar, agow agowVar) {
        this.d = executor;
        this.c = qqkVar;
        this.e = new zyt(executor);
        this.f = set;
        this.b = agowVar;
    }

    @Override // defpackage.qqm
    public final zyd a(final qql qqlVar) {
        return zxn.j(new Runnable() { // from class: qqo
            /* JADX WARN: Removed duplicated region for block: B:75:0x01c1  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 498
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qqo.run():void");
            }
        }, this.e);
    }

    @Override // defpackage.qqq
    public final void b() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            zuz.h(((qqv) it.next()).a(), new zvi() { // from class: qqn
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    return this.a.a((qql) obj);
                }
            }, this.d);
        }
    }
}
