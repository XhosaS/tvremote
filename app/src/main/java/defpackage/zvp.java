package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zvp implements Callable {
    final /* synthetic */ zvx a;
    final /* synthetic */ zvw b;

    public zvp(zvx zvxVar, zvw zvwVar) {
        this.a = zvxVar;
        this.b = zvwVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(this.b.a);
    }

    public final String toString() {
        return this.a.toString();
    }
}
