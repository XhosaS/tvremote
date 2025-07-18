package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afql implements afog {
    public final afog a;
    public volatile boolean b;
    public List c = new ArrayList();

    public afql(afog afogVar) {
        this.a = afogVar;
    }

    private final void b(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.afog
    public final void a(Status status, afof afofVar, afih afihVar) {
        b(new afqk(this, status, afofVar, afihVar));
    }

    @Override // defpackage.afog
    public final void c(afih afihVar) {
        b(new afqj(this, afihVar));
    }

    @Override // defpackage.afzz
    public final void d(afzy afzyVar) {
        if (this.b) {
            this.a.d(afzyVar);
        } else {
            b(new afqh(this, afzyVar));
        }
    }

    @Override // defpackage.afzz
    public final void e() {
        if (this.b) {
            this.a.e();
        } else {
            b(new afqi(this));
        }
    }
}
