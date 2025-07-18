package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zzb extends zyb {
    final /* synthetic */ zzc a;
    private final Callable b;

    public zzb(zzc zzcVar, Callable callable) {
        this.a = zzcVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.zyb
    public final Object a() {
        return this.b.call();
    }

    @Override // defpackage.zyb
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.zyb
    public final void d(Throwable th) {
        this.a.q(th);
    }

    @Override // defpackage.zyb
    public final void e(Object obj) {
        this.a.p(obj);
    }

    @Override // defpackage.zyb
    public final boolean g() {
        return this.a.isDone();
    }
}
