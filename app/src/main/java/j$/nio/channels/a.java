package j$.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final /* synthetic */ class a extends c {
    public final /* synthetic */ AsynchronousFileChannel a;

    public a(AsynchronousFileChannel asynchronousFileChannel) {
        this.a = asynchronousFileChannel;
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void a(boolean z) throws IOException {
        this.a.force(z);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ Future b(long j, long j2, boolean z) {
        return this.a.lock(j, j2, z);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void c(long j, long j2, boolean z, Object obj, f fVar) {
        this.a.lock(j, j2, z, obj, e.a(fVar));
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ Future d(ByteBuffer byteBuffer, long j) {
        return this.a.read(byteBuffer, j);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void e(ByteBuffer byteBuffer, long j, Object obj, f fVar) {
        this.a.read(byteBuffer, j, obj, e.a(fVar));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AsynchronousFileChannel asynchronousFileChannel = this.a;
        if (obj instanceof a) {
            obj = ((a) obj).a;
        }
        return asynchronousFileChannel.equals(obj);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ c f(long j) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelTruncate = this.a.truncate(j);
        if (asynchronousFileChannelTruncate == null) {
            return null;
        }
        return asynchronousFileChannelTruncate instanceof b ? ((b) asynchronousFileChannelTruncate).a : new a(asynchronousFileChannelTruncate);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ FileLock g(long j, long j2, boolean z) {
        return this.a.tryLock(j, j2, z);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ Future h(ByteBuffer byteBuffer, long j) {
        return this.a.write(byteBuffer, j);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void i(ByteBuffer byteBuffer, long j, Object obj, f fVar) {
        this.a.write(byteBuffer, j, obj, e.a(fVar));
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
