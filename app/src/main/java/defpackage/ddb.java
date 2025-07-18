package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddb {
    final dos a;
    final Executor b;

    public ddb(dos dosVar, Executor executor) {
        this.a = dosVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ddb) {
            return this.a.equals(((ddb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
