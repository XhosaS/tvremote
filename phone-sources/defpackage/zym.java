package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zym extends UploadDataProvider {
    private volatile FileChannel a;
    private final zyl b;
    private final Object c = new Object();

    public zym(zyl zylVar) {
        this.b = zylVar;
    }

    private final FileChannel a() {
        if (this.a == null) {
            synchronized (this.c) {
                if (this.a == null) {
                    this.a = this.b.a();
                }
            }
        }
        return this.a;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileChannel fileChannel = this.a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return a().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        int i;
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel fileChannelA = a();
        do {
            i = fileChannelA.read(byteBuffer);
            if (i == -1) {
                break;
            }
        } while (i == 0);
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
