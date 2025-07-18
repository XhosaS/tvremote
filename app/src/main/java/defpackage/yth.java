package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yth implements ytv {
    volatile ytv a;
    final zyu b;
    final yrn c;

    public yth() {
        throw null;
    }

    @Override // defpackage.ytv
    public final int a() {
        return 0;
    }

    @Override // defpackage.ytv
    public final yuh c() {
        return null;
    }

    @Override // defpackage.ytv
    public final Object d() {
        return zze.a(this.b);
    }

    @Override // defpackage.ytv
    public final void e(Object obj) {
        if (obj != null) {
            this.b.p(obj);
        } else {
            this.a = yug.b;
        }
    }

    @Override // defpackage.ytv
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ytv
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ytv
    public final Object get() {
        return null;
    }

    public final void h() {
        this.c.a(TimeUnit.NANOSECONDS);
    }

    public yth(ytv ytvVar) {
        this.b = new zyu();
        this.c = new yrn();
        this.a = ytvVar;
    }

    @Override // defpackage.ytv
    public final ytv b(ReferenceQueue referenceQueue, Object obj, yuh yuhVar) {
        return this;
    }
}
