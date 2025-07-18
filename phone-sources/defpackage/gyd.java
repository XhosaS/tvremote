package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyd implements Closeable {
    public final gxz a;

    public gyd(gxz gxzVar) {
        this.a = gxzVar;
    }

    public final zhe a() {
        return this.a.a(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
