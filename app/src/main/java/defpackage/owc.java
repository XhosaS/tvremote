package defpackage;

import android.os.SystemClock;
import com.google.protobuf.MessageLite;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
class owc implements ager {
    final /* synthetic */ owf a;
    final /* synthetic */ ager b;
    final /* synthetic */ owe c;

    public owc(owe oweVar, owf owfVar, ager agerVar) {
        this.a = owfVar;
        this.b = agerVar;
        this.c = oweVar;
    }

    @Override // defpackage.ager
    public final void e() {
        owf owfVar = this.a;
        owfVar.j().execute(new Runnable() { // from class: ovy
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        owfVar.h().d = true;
    }

    @Override // defpackage.ager
    public final void f(final Throwable th) {
        String strC;
        final owf owfVar = this.a;
        owg owgVarH = owfVar.h();
        String str = owfVar.i().b;
        long j = owgVarH.c;
        owe oweVar = this.c;
        boolean z = false;
        if (j != 4 && (owfVar.f() == 0 || (SystemClock.elapsedRealtime() - owgVarH.a) + 1000 <= owfVar.f())) {
            if (Status.Code.UNAVAILABLE.equals(Status.b(th).getCode())) {
                z = true;
            } else if (Status.Code.UNAUTHENTICATED.equals(Status.b(th).getCode())) {
                oweVar.m.a.b(owfVar.c());
                z = true;
            }
        }
        if (!z) {
            owfVar.h().d = true;
        }
        String str2 = owfVar.i().b;
        Status.b(th);
        SystemClock.elapsedRealtime();
        long j2 = owfVar.h().b;
        Collection.EL.stream(oweVar.e).forEach(new Consumer() { // from class: ovr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ovn) obj).d();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (aern.c()) {
            oweVar.i.get();
            ((zdv) ((zdv) ((zdv) owe.a.c()).p(th)).q("com/google/android/libraries/home/grpc/GrpcServerImpl", "logGrpcResponse", 401, "GrpcServerImpl.java")).x("Error in request %s", owfVar.i().b);
            if (Status.Code.UNAUTHENTICATED.equals(Status.b(th).getCode()) && (strC = owfVar.c()) != null) {
                strC.hashCode();
            }
        }
        if (z) {
            ((zdv) ((zdv) owe.a.b()).q("com/google/android/libraries/home/grpc/GrpcServerImpl$4", "onError", 332, "GrpcServerImpl.java")).x("RPC unavailable for %s, will retry.", owfVar.i().b);
            oweVar.j.postDelayed(new Runnable() { // from class: ovz
                @Override // java.lang.Runnable
                public final void run() {
                    owf owfVar2 = owfVar;
                    if (owfVar2.f() > 0) {
                        owfVar2.m((owfVar2.h().a - SystemClock.elapsedRealtime()) + owfVar2.f());
                    }
                    this.a.c.b(owfVar2);
                }
            }, paj.a(1000L));
        } else {
            Executor executorJ = owfVar.j();
            final ager agerVar = this.b;
            executorJ.execute(new Runnable() { // from class: owa
                @Override // java.lang.Runnable
                public final void run() {
                    agerVar.f(th);
                }
            });
        }
    }

    @Override // defpackage.ager
    public final /* synthetic */ void g(Object obj) {
        owf owfVar = this.a;
        final MessageLite messageLite = (MessageLite) obj;
        String str = owfVar.i().b;
        SystemClock.elapsedRealtime();
        long j = owfVar.h().b;
        Collection.EL.stream(this.c.e).forEach(new Consumer() { // from class: ovs
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                ((ovn) obj2).e();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        aern.c();
        Executor executorJ = owfVar.j();
        final ager agerVar = this.b;
        executorJ.execute(new Runnable() { // from class: owb
            @Override // java.lang.Runnable
            public final void run() {
                ((oyc) agerVar).g(messageLite);
            }
        });
    }
}
