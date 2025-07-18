package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbp {
    public static final zyd a(final Executor executor, final String str, final agum agumVar) {
        executor.getClass();
        return xt.a(new xq() { // from class: cbj
            @Override // defpackage.xq
            public final Object a(final xo xoVar) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                xoVar.a(new Runnable() { // from class: cbl
                    @Override // java.lang.Runnable
                    public final void run() {
                        atomicBoolean.set(true);
                    }
                }, cbe.a);
                final agum agumVar2 = agumVar;
                executor.execute(new Runnable() { // from class: cbm
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
                return str;
            }
        });
    }

    public static final zyd b(final agte agteVar, final agvb agvbVar) {
        agteVar.getClass();
        return xt.a(new xq() { // from class: cbk
            @Override // defpackage.xq
            public final Object a(xo xoVar) {
                agte agteVar2 = agteVar;
                final ahdl ahdlVar = (ahdl) agteVar2.get(ahdl.c);
                xoVar.a(new Runnable() { // from class: cbn
                    @Override // java.lang.Runnable
                    public final void run() {
                        ahdl ahdlVar2 = ahdlVar;
                        if (ahdlVar2 != null) {
                            ahdlVar2.s(null);
                        }
                    }
                }, cbe.a);
                return ahal.e(ahbu.b(agteVar2), null, 1, new cbo(agvbVar, xoVar, null), 1);
            }
        });
    }
}
