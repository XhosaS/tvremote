package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aftx implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ afty b;

    public aftx(afty aftyVar, Status status) {
        this.a = status;
        this.b = aftyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
