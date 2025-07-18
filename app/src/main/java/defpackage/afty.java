package defpackage;

import io.grpc.Status;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afty extends afir {
    final aftw a;
    final afiv b;
    final /* synthetic */ afun c;

    public afty(afun afunVar, aftw aftwVar, afiv afivVar) {
        this.c = afunVar;
        this.a = aftwVar;
        afivVar.getClass();
        this.b = afivVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01db  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.grpc.Status a(defpackage.afit r20) throws defpackage.afnk {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afty.a(afit):io.grpc.Status");
    }

    public final void b(Status status) {
        Logger logger = afun.a;
        Level level = Level.WARNING;
        afun afunVar = this.c;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{afunVar.h, status});
        afuh afuhVar = afunVar.L;
        if (afuhVar.a.get() == afun.e) {
            afun afunVar2 = afuhVar.c;
            afuhVar.d(null);
        }
        if (afunVar.X != 3) {
            afunVar.J.b(3, "Failed to resolve name: {0}", status);
            afunVar.X = 3;
        }
        aftw aftwVar = this.a;
        if (aftwVar != afunVar.v) {
            return;
        }
        aftwVar.a.b.b(status);
    }
}
