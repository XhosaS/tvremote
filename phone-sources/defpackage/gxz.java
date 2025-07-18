package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxz implements Closeable {
    public final gxy a;
    public final /* synthetic */ gyb b;
    private boolean c;

    public gxz(gyb gybVar, gxy gxyVar) {
        this.b = gybVar;
        this.a = gxyVar;
    }

    public final zhe a(int i) {
        if (this.c) {
            throw new IllegalStateException("snapshot is closed");
        }
        Object obj = this.a.c.get(i);
        obj.getClass();
        return (zhe) obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        gyb gybVar = this.b;
        synchronized (gybVar) {
            gxy gxyVar = this.a;
            int i = gxyVar.h - 1;
            gxyVar.h = i;
            if (i == 0 && gxyVar.f) {
                gybVar.h(gxyVar);
            }
        }
    }
}
