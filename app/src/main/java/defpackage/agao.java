package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agao extends afep {
    final /* synthetic */ ahfn a;
    final /* synthetic */ agay b;

    public agao(ahfn ahfnVar, agay agayVar) {
        this.a = ahfnVar;
        this.b = agayVar;
    }

    @Override // defpackage.afep
    public final void a(Status status, afih afihVar) {
        status.getClass();
        afihVar.getClass();
        this.a.u(status.e() ? null : new StatusException(status, afihVar));
    }

    @Override // defpackage.afep
    public final void c(Object obj) throws Throwable {
        Object objI = this.a.i(obj);
        if (objI instanceof ahfs) {
            Throwable thB = ahft.b(objI);
            if (thB != null) {
                throw thB;
            }
            throw new AssertionError("onMessage should never be called until responses is ready");
        }
    }

    @Override // defpackage.afep
    public final void d() throws Throwable {
        Object objI = this.b.a.i(agpu.a);
        if (objI instanceof ahfs) {
            Throwable thB = ahft.b(objI);
            if (thB != null) {
                throw thB;
            }
            throw new AssertionError("Should be impossible; a CONFLATED channel should never return false on offer");
        }
    }
}
