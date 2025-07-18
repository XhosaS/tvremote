package defpackage;

import android.os.Trace;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccj {
    public static final ccf a(final cam camVar, final String str, final Executor executor, final agum agumVar) {
        executor.getClass();
        final bcx bcxVar = new bcx(ccf.b);
        return new ccg(xt.a(new xq() { // from class: cch
            @Override // defpackage.xq
            public final Object a(final xo xoVar) {
                final String str2 = str;
                final agum agumVar2 = agumVar;
                final bcx bcxVar2 = bcxVar;
                executor.execute(new Runnable() { // from class: cci
                    @Override // java.lang.Runnable
                    public final void run() {
                        xo xoVar2 = xoVar;
                        bcx bcxVar3 = bcxVar2;
                        agum agumVar3 = agumVar2;
                        String str3 = str2;
                        boolean zE = btt.e();
                        if (zE) {
                            try {
                                btt.b(str3);
                            } finally {
                                if (zE) {
                                    Trace.endSection();
                                }
                            }
                        }
                        try {
                            agumVar3.a();
                            ccd ccdVar = ccf.a;
                            bcxVar3.h(ccdVar);
                            xoVar2.b(ccdVar);
                        } catch (Throwable th) {
                            bcxVar3.h(new ccb(th));
                            xoVar2.d(th);
                        }
                    }
                });
                return agpu.a;
            }
        }));
    }
}
