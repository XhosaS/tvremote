package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cde {
    public static final zyd a(final Executor executor, final agum agumVar) {
        return xt.a(new xq() { // from class: cdd
            @Override // defpackage.xq
            public final Object a(final xo xoVar) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                xoVar.a(new Runnable() { // from class: cdb
                    @Override // java.lang.Runnable
                    public final void run() {
                        atomicBoolean.set(true);
                    }
                }, cbe.a);
                final agum agumVar2 = agumVar;
                executor.execute(new Runnable() { // from class: cdc
                    @Override // java.lang.Runnable
                    public final void run() {
                        xo xoVar2 = xoVar;
                        agum agumVar3 = agumVar2;
                        if (atomicBoolean.get()) {
                            return;
                        }
                        try {
                            xoVar2.b(agumVar3.a());
                        } catch (Throwable th) {
                            xoVar2.d(th);
                        }
                    }
                });
                return agpu.a;
            }
        });
    }
}
