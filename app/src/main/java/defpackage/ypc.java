package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ypc implements Callable {
    final /* synthetic */ ypk a;

    public ypc(ypk ypkVar) {
        this.a = ypkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return ypg.a(this.a.a(), ypk.d);
    }
}
