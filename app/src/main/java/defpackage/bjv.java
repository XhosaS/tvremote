package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjv {
    public static final zyd a(final ahcb ahcbVar) {
        return xt.a(new xq() { // from class: bju
            public final /* synthetic */ Object b = "Deferred.asListenableFuture";

            @Override // defpackage.xq
            public final Object a(final xo xoVar) {
                final ahcb ahcbVar2 = ahcbVar;
                ahcbVar2.w(new agux() { // from class: bjt
                    @Override // defpackage.agux
                    public final Object a(Object obj) {
                        xo xoVar2 = xoVar;
                        Throwable th = (Throwable) obj;
                        if (th == null) {
                            xoVar2.b(ahcbVar2.d());
                        } else if (th instanceof CancellationException) {
                            xoVar2.c();
                        } else {
                            xoVar2.d(th);
                        }
                        return agpu.a;
                    }
                });
                return this.b;
            }
        });
    }
}
