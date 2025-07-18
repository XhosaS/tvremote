package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zgg implements zhm {
    final /* synthetic */ zgi a;
    final /* synthetic */ zhm b;

    public zgg(zgi zgiVar, zhm zhmVar) {
        this.a = zgiVar;
        this.b = zhmVar;
    }

    @Override // defpackage.zhm
    public final /* synthetic */ zhq b() {
        return this.a;
    }

    @Override // defpackage.zhm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        zgi zgiVar = this.a;
        zgiVar.e();
        try {
            this.b.close();
            if (zgiVar.f()) {
                throw zgiVar.d(null);
            }
        } catch (IOException e) {
            if (!zgiVar.f()) {
                throw e;
            }
            throw zgiVar.d(e);
        } finally {
            zgiVar.f();
        }
    }

    @Override // defpackage.zhm
    public final void eW(zgk zgkVar, long j) throws IOException {
        wcq.aG(zgkVar.b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            zhj zhjVar = zgkVar.a;
            zhjVar.getClass();
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += zhjVar.c - zhjVar.b;
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    zhjVar = zhjVar.f;
                    zhjVar.getClass();
                }
            }
            zgi zgiVar = this.a;
            zhm zhmVar = this.b;
            zgiVar.e();
            try {
                try {
                    zhmVar.eW(zgkVar, j2);
                    if (zgiVar.f()) {
                        throw zgiVar.d(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!zgiVar.f()) {
                        throw e;
                    }
                    throw zgiVar.d(e);
                }
            } catch (Throwable th) {
                zgiVar.f();
                throw th;
            }
        }
    }

    @Override // defpackage.zhm, java.io.Flushable
    public final void flush() throws IOException {
        zgi zgiVar = this.a;
        zgiVar.e();
        try {
            this.b.flush();
            if (zgiVar.f()) {
                throw zgiVar.d(null);
            }
        } catch (IOException e) {
            if (!zgiVar.f()) {
                throw e;
            }
            throw zgiVar.d(e);
        } finally {
            zgiVar.f();
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.b + ")";
    }
}
