package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwv implements ahxq {
    final /* synthetic */ ahww a;
    final /* synthetic */ ahxq b;

    public ahwv(ahww ahwwVar, ahxq ahxqVar) {
        this.a = ahwwVar;
        this.b = ahxqVar;
    }

    @Override // defpackage.ahxq
    public final long a(ahwx ahwxVar, long j) {
        ahww ahwwVar = this.a;
        try {
            return this.b.a(ahwxVar, j);
        } catch (IOException e) {
            throw e;
        } finally {
            ahwwVar.a();
        }
    }

    @Override // defpackage.ahxq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ahxq ahxqVar = this.b;
        ahww ahwwVar = this.a;
        try {
            ((ahxc) ahxqVar).a.close();
        } catch (IOException e) {
            throw e;
        } finally {
            ahwwVar.a();
        }
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.b + ")";
    }
}
