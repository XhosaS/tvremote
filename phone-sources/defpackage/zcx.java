package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcx extends zgu {
    final /* synthetic */ bmd a;
    private final long c;
    private long d;
    private boolean e;
    private boolean f;
    private boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zcx(bmd bmdVar, zho zhoVar, long j) {
        super(zhoVar);
        zhoVar.getClass();
        this.a = bmdVar;
        this.c = j;
        this.e = true;
        if (j == 0) {
            c(null);
        }
    }

    @Override // defpackage.zgu, defpackage.zho
    public final long a(zgk zgkVar, long j) throws IOException {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        try {
            long jA = this.b.a(zgkVar, 8192L);
            if (this.e) {
                this.e = false;
            }
            if (jA == -1) {
                c(null);
                return -1L;
            }
            long j2 = this.d + jA;
            long j3 = this.c;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException(a.cv(j2, j3, "expected ", " bytes but received "));
            }
            this.d = j2;
            if (j2 == j3) {
                c(null);
            }
            return jA;
        } catch (IOException e) {
            throw c(e);
        }
    }

    public final IOException c(IOException iOException) {
        if (this.f) {
            return iOException;
        }
        this.f = true;
        if (iOException == null && this.e) {
            this.e = false;
        }
        bmd bmdVar = this.a;
        if (iOException != null) {
            bmdVar.g(iOException);
        }
        return ((zdc) bmdVar.c).i(bmdVar, false, true, iOException);
    }

    @Override // defpackage.zgu, defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            super.close();
        } catch (IOException e) {
            throw c(e);
        }
    }
}
