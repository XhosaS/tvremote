package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zhd implements zhm {
    public final zhq a;
    private final OutputStream b;

    public zhd(OutputStream outputStream, zhq zhqVar) {
        this.b = outputStream;
        this.a = zhqVar;
    }

    @Override // defpackage.zhm
    public final zhq b() {
        return this.a;
    }

    @Override // defpackage.zhm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    @Override // defpackage.zhm
    public final void eW(zgk zgkVar, long j) throws IOException {
        wcq.aG(zgkVar.b, 0L, j);
        while (j > 0) {
            this.a.l();
            zhj zhjVar = zgkVar.a;
            zhjVar.getClass();
            int iMin = (int) Math.min(j, zhjVar.c - zhjVar.b);
            this.b.write(zhjVar.a, zhjVar.b, iMin);
            int i = zhjVar.b + iMin;
            zhjVar.b = i;
            long j2 = iMin;
            zgkVar.b -= j2;
            j -= j2;
            if (i == zhjVar.c) {
                zgkVar.a = zhjVar.a();
                zhk.b(zhjVar);
            }
        }
    }

    @Override // defpackage.zhm, java.io.Flushable
    public final void flush() throws IOException {
        this.b.flush();
    }

    public final String toString() {
        return "sink(" + this.b + ")";
    }
}
