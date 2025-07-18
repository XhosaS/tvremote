package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xyj extends ykn {
    final xyi a;
    final xsx b;
    final /* synthetic */ xyr c;

    public xyj(xyr xyrVar, xyi xyiVar, xsx xsxVar) {
        this.c = xyrVar;
        this.a = xyiVar;
        xsxVar.getClass();
        this.b = xsxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01fa  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ykn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.xtk G(defpackage.xsv r20) throws defpackage.xuw {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xyj.G(xsv):xtk");
    }

    public final void d(xtk xtkVar) {
        Logger logger = xyr.a;
        Level level = Level.WARNING;
        xyr xyrVar = this.c;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{xyrVar.h, xtkVar});
        xyn xynVar = xyrVar.H;
        if (xynVar.a.get() == xyr.e) {
            xyr xyrVar2 = xynVar.c;
            xzc xzcVar = xyrVar2.J;
            if (xzcVar != null) {
                xynVar.d(xzcVar.a());
                xyrVar2.I = xzcVar;
                xyrVar2.F.a(4, "Initial Name Resolution error, using default service config");
            } else {
                xynVar.d(null);
            }
        }
        if (xyrVar.R != 3) {
            xyrVar.F.b(3, "Failed to resolve name: {0}", xtkVar);
            xyrVar.R = 3;
        }
        xyi xyiVar = this.a;
        if (xyiVar != xyrVar.t) {
            return;
        }
        xyiVar.a.b.b(xtkVar);
    }
}
