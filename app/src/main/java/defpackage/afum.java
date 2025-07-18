package defpackage;

import io.grpc.Status;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afum {
    final Object a = new Object();
    Collection b = new HashSet();
    Status c;
    final /* synthetic */ afun d;

    public afum(afun afunVar) {
        this.d = afunVar;
    }

    final void a(Status status) {
        synchronized (this.a) {
            if (this.c != null) {
                return;
            }
            this.c = status;
            boolean zIsEmpty = this.b.isEmpty();
            if (zIsEmpty) {
                this.d.A.f(status);
            }
        }
    }
}
