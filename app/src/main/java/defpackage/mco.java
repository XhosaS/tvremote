package defpackage;

import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mco implements mcr, ageo {
    public static final zdy a = zdy.h("com/google/android/libraries/assistant/soda/s3client/SodaGrpcTransport");
    public final Object b = new Object();
    public final Callable c;
    public final wxc d;
    public ArrayDeque e;
    public ageg f;
    public adkp g;
    public mcs h;

    public mco(Callable callable, wxc wxcVar) {
        this.c = callable;
        this.d = wxcVar;
    }

    @Override // defpackage.ageo
    public final void a(ageg agegVar) {
        mcn mcnVar = new mcn(this);
        ageh agehVar = (ageh) agegVar;
        if (agehVar.a) {
            throw new IllegalStateException("Cannot alter onReadyHandler after call started. Use ClientResponseObserver");
        }
        agehVar.d = mcnVar;
    }

    public final void b(adkb adkbVar) {
        ageg agegVar = this.f;
        if (agegVar == null) {
            return;
        }
        if (!((ageh) agegVar).b.k()) {
            ((zdv) ((zdv) a.d()).q("com/google/android/libraries/assistant/soda/s3client/SodaGrpcTransport", "enqueueRequest", 186, "SodaGrpcTransport.java")).u("Enqueuing request before stream is ready");
        }
        this.f.g(adkbVar);
    }

    public final void c(String str) {
        ((zdv) ((zdv) a.c()).q("com/google/android/libraries/assistant/soda/s3client/SodaGrpcTransport", "handleError", 217, "SodaGrpcTransport.java")).x("handleError(): %s", str);
        synchronized (this.b) {
            mcs mcsVar = this.h;
            if (mcsVar != null) {
                mcsVar.a(str);
            }
        }
    }

    public final /* synthetic */ void d() {
        synchronized (this.b) {
            mcs mcsVar = this.h;
            if (mcsVar != null) {
                mcsVar.c(2);
            }
        }
        synchronized (this.b) {
            while (!this.e.isEmpty()) {
                b((adkb) this.e.removeFirst());
            }
        }
    }

    @Override // defpackage.ager
    public final void e() {
        h();
    }

    @Override // defpackage.ager
    public final void f(Throwable th) {
        Status statusB = Status.b(th);
        ((zdv) ((zdv) ((zdv) a.c()).p(th)).q("com/google/android/libraries/assistant/soda/s3client/SodaGrpcTransport", "onError", 165, "SodaGrpcTransport.java")).x("onError() %s", statusB);
        c(statusB.getCode().name());
        h();
    }

    @Override // defpackage.ager
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        adkf adkfVar = (adkf) obj;
        synchronized (this.b) {
            mcs mcsVar = this.h;
            if (mcsVar != null) {
                mcsVar.b(adkfVar);
            }
        }
    }

    @Override // defpackage.mcr
    public final void h() {
        synchronized (this.b) {
            ageg agegVar = this.f;
            if (agegVar != null) {
                agegVar.e();
                this.f = null;
            }
            mcs mcsVar = this.h;
            if (mcsVar != null) {
                mcsVar.c(3);
                this.h = null;
            }
        }
    }
}
