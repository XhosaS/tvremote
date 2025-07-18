package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zgh implements zho {
    final /* synthetic */ zgi a;
    final /* synthetic */ zho b;

    public zgh(zgi zgiVar, zho zhoVar) {
        this.a = zgiVar;
        this.b = zhoVar;
    }

    @Override // defpackage.zho
    public final long a(zgk zgkVar, long j) throws IOException {
        zgi zgiVar = this.a;
        zgiVar.e();
        try {
            long jA = this.b.a(zgkVar, j);
            if (zgiVar.f()) {
                throw zgiVar.d(null);
            }
            return jA;
        } catch (IOException e) {
            if (zgiVar.f()) {
                throw zgiVar.d(e);
            }
            throw e;
        } finally {
            zgiVar.f();
        }
    }

    @Override // defpackage.zho
    public final /* synthetic */ zhq b() {
        return this.a;
    }

    @Override // defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
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

    public final String toString() {
        return "AsyncTimeout.source(" + this.b + ")";
    }
}
