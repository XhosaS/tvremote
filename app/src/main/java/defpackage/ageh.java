package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ageh extends ageg {
    public boolean a;
    public final afeq b;
    public final boolean c;
    public Runnable d;
    private boolean e = false;
    private boolean f = false;

    public ageh(afeq afeqVar, boolean z) {
        this.b = afeqVar;
        this.c = z;
    }

    public final void a() {
        if (this.c) {
            this.b.d(1);
        } else {
            this.b.d(2);
        }
    }

    @Override // defpackage.ager
    public final void e() {
        this.b.c();
        this.f = true;
    }

    @Override // defpackage.ager
    public final void f(Throwable th) {
        this.b.b("Cancelled by client with StreamObserver.onError()", th);
        this.e = true;
    }

    @Override // defpackage.ager
    public final void g(Object obj) {
        yqw.M(!this.e, "Stream was terminated by error, no further calls are allowed");
        yqw.M(!this.f, "Stream is already completed, no further calls are allowed");
        this.b.e(obj);
    }
}
