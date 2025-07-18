package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xvg extends xvx {
    final /* synthetic */ xtk a;
    final /* synthetic */ xsm b;
    final /* synthetic */ xvi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvg(xvi xviVar, xtk xtkVar, xsm xsmVar) {
        super(xviVar.b.f);
        this.a = xtkVar;
        this.b = xsmVar;
        this.c = xviVar;
    }

    @Override // defpackage.xvx
    public final void a() {
        int i = yfl.a;
        xvi xviVar = this.c;
        xviVar.b.g.b();
        xtk xtkVar = this.a;
        xsm xsmVar = this.b;
        xtk xtkVar2 = xviVar.a;
        if (xtkVar2 != null) {
            xsmVar = new xsm();
            xtkVar = xtkVar2;
        }
        try {
            try {
                xviVar.c.a(xtkVar, xsmVar);
            } catch (RuntimeException e) {
                xvj.a.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e);
            }
        } finally {
            this.c.b.e.a(xtkVar.g());
        }
    }
}
