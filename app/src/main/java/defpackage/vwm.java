package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class vwm extends agvw implements agux {
    public vwm(Object obj) {
        super(1, obj, vwp.class, "asErrorPropagatingCallable", "asErrorPropagatingCallable(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Callable;", 0);
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Callable callable = (Callable) obj;
        callable.getClass();
        return ((vwp) this.c).a(callable);
    }
}
