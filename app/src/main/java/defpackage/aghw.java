package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aghw extends CountDownLatch implements agfs, aggi {
    public Object a;
    public Throwable b;
    aggi c;
    volatile boolean d;

    public aghw() {
        super(1);
    }

    @Override // defpackage.agfs
    public final void a() {
        countDown();
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        this.c = aggiVar;
        if (this.d) {
            aggiVar.dispose();
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.d = true;
        aggi aggiVar = this.c;
        if (aggiVar != null) {
            aggiVar.dispose();
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }
}
