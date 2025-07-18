package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class upn {
    final /* synthetic */ upv a;

    public upn(upv upvVar) {
        this.a = upvVar;
    }

    public final void a() {
        upv upvVar = this.a;
        synchronized (upvVar.j) {
            int i = upvVar.m;
            yqw.P(i > 0, "Refcount went negative!", i);
            upvVar.m--;
            upvVar.d();
        }
    }

    public final void b() {
        upv upvVar = this.a;
        synchronized (upvVar.j) {
            int i = upvVar.m;
            if (i == 0) {
                throw new CancellationException("database is closed");
            }
            yqw.P(i > 0, "Refcount went negative!", i);
            upvVar.m++;
        }
    }
}
