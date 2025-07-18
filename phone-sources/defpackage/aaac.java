package defpackage;

import android.support.v7.widget.RecyclerView;
import j$.nio.channels.DesugarChannels;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aaac implements ReadableByteChannel {
    private final InputStream a;
    private final AtomicBoolean b = new AtomicBoolean(true);

    private aaac(InputStream inputStream) {
        this.a = inputStream;
    }

    static ReadableByteChannel a(InputStream inputStream) {
        return inputStream instanceof FileInputStream ? DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) inputStream).getChannel()) : new aaac(inputStream);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.b.get();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            int i = this.a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (i > 0) {
            }
            return i;
        }
        InputStream inputStream = this.a;
        byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(inputStream.available(), RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT), byteBuffer.remaining()))];
        int i2 = inputStream.read(bArr);
        if (i2 <= 0) {
            return i2;
        }
        byteBuffer.put(bArr, 0, i2);
        return i2;
    }
}
