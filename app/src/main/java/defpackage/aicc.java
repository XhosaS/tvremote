package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aicc extends aiay {
    public final HttpURLConnection h;
    final /* synthetic */ aicf i;
    private final AtomicBoolean j;
    private WritableByteChannel k;
    private OutputStream l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aicc(aicf aicfVar, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, aict aictVar) {
        super(executor, executor2, aictVar);
        this.i = aicfVar;
        this.j = new AtomicBoolean(false);
        this.h = httpURLConnection;
    }

    @Override // defpackage.aiay
    protected final int a(ByteBuffer byteBuffer) throws IOException {
        int iWrite = 0;
        while (byteBuffer.hasRemaining()) {
            iWrite += this.k.write(byteBuffer);
        }
        this.l.flush();
        return iWrite;
    }

    @Override // defpackage.aiay
    protected final Runnable b(aicg aicgVar) {
        return new aibc(this.i, aicgVar);
    }

    @Override // defpackage.aiay
    protected final Runnable c(aicg aicgVar) {
        return new aibg(this.i, aicgVar);
    }

    @Override // defpackage.aiay
    protected final void e() {
        j();
        this.i.g();
    }

    @Override // defpackage.aiay
    protected final void f() {
        if (this.k == null) {
            aicf aicfVar = this.i;
            aicfVar.l = 10;
            HttpURLConnection httpURLConnection = this.h;
            httpURLConnection.setDoOutput(true);
            httpURLConnection.connect();
            aicfVar.l = 12;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            this.l = outputStream;
            this.k = Channels.newChannel(outputStream);
        }
    }

    @Override // defpackage.aiay
    protected final void g(Throwable th) {
        this.i.c(th);
    }

    final void j() {
        if (this.k == null || !this.j.compareAndSet(false, true)) {
            return;
        }
        this.k.close();
    }
}
