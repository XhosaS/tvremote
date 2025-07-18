package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zdw extends zdu {
    final /* synthetic */ zdy c;
    private long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdw(zdy zdyVar, long j) {
        super(zdyVar);
        this.c = zdyVar;
        this.d = j;
        if (j == 0) {
            c();
        }
    }

    @Override // defpackage.zdu, defpackage.zho
    public final long a(zgk zgkVar, long j) throws IOException {
        if (this.a) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.d;
        if (j2 == 0) {
            return -1L;
        }
        long jA = super.a(zgkVar, Math.min(j2, 8192L));
        if (jA == -1) {
            this.c.b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c();
            throw protocolException;
        }
        long j3 = this.d - jA;
        this.d = j3;
        if (j3 == 0) {
            c();
        }
        return jA;
    }

    @Override // defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.d != 0 && !zcr.z(this, TimeUnit.MILLISECONDS)) {
            this.c.b.e();
            c();
        }
        d();
    }
}
