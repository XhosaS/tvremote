package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zdx extends zdu {
    private boolean c;

    public zdx(zdy zdyVar) {
        super(zdyVar);
    }

    @Override // defpackage.zdu, defpackage.zho
    public final long a(zgk zgkVar, long j) throws IOException {
        if (this.a) {
            throw new IllegalStateException("closed");
        }
        if (this.c) {
            return -1L;
        }
        long jA = super.a(zgkVar, 8192L);
        if (jA != -1) {
            return jA;
        }
        this.c = true;
        c();
        return -1L;
    }

    @Override // defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (!this.c) {
            c();
        }
        d();
    }
}
