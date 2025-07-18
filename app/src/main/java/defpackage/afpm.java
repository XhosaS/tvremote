package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afpm extends afep {
    public final afep a;
    public volatile boolean b;
    public List c = new ArrayList();

    public afpm(afep afepVar) {
        this.a = afepVar;
    }

    private final void e(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.afep
    public final void a(Status status, afih afihVar) {
        e(new afpk(this, status, afihVar));
    }

    @Override // defpackage.afep
    public final void b(afih afihVar) {
        if (this.b) {
            this.a.b(afihVar);
        } else {
            e(new afpi(this, afihVar));
        }
    }

    @Override // defpackage.afep
    public final void c(Object obj) {
        if (this.b) {
            this.a.c(obj);
        } else {
            e(new afpj(this, obj));
        }
    }

    @Override // defpackage.afep
    public final void d() {
        if (this.b) {
            this.a.d();
        } else {
            e(new afpl(this));
        }
    }
}
