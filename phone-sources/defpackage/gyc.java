package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyc extends zgt {
    private final yjv b;
    private boolean c;

    public gyc(zhm zhmVar, yjv yjvVar) {
        super(zhmVar);
        this.b = yjvVar;
    }

    @Override // defpackage.zgt, defpackage.zhm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.close();
        } catch (IOException e) {
            this.c = true;
            this.b.a(e);
        }
    }

    @Override // defpackage.zgt, defpackage.zhm
    public final void eW(zgk zgkVar, long j) {
        if (this.c) {
            zgkVar.B(j);
            return;
        }
        try {
            this.a.eW(zgkVar, j);
        } catch (IOException e) {
            this.c = true;
            this.b.a(e);
        }
    }

    @Override // defpackage.zgt, defpackage.zhm, java.io.Flushable
    public final void flush() {
        try {
            this.a.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.a(e);
        }
    }
}
