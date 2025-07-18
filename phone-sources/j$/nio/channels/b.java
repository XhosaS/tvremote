package j$.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.channels.FileLock;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final /* synthetic */ class b extends AsynchronousFileChannel {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // java.nio.channels.AsynchronousChannel, java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        ((a) this.a).close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c cVar = this.a;
        if (obj instanceof b) {
            obj = ((b) obj).a;
        }
        return cVar.equals(obj);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void force(boolean z) {
        this.a.a(z);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return ((a) this.a).isOpen();
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ Future lock(long j, long j2, boolean z) {
        return this.a.b(j, j2, z);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ Future read(ByteBuffer byteBuffer, long j) {
        return this.a.d(byteBuffer, j);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ long size() {
        return this.a.size();
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ AsynchronousFileChannel truncate(long j) {
        c cVarF = this.a.f(j);
        if (cVarF == null) {
            return null;
        }
        return cVarF instanceof a ? ((a) cVarF).a : new b(cVarF);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ FileLock tryLock(long j, long j2, boolean z) {
        return this.a.g(j, j2, z);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ Future write(ByteBuffer byteBuffer, long j) {
        return this.a.h(byteBuffer, j);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void lock(long j, long j2, boolean z, Object obj, CompletionHandler completionHandler) {
        this.a.c(j, j2, z, obj, d.b(completionHandler));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void read(ByteBuffer byteBuffer, long j, Object obj, CompletionHandler completionHandler) {
        this.a.e(byteBuffer, j, obj, d.b(completionHandler));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void write(ByteBuffer byteBuffer, long j, Object obj, CompletionHandler completionHandler) {
        this.a.i(byteBuffer, j, obj, d.b(completionHandler));
    }
}
