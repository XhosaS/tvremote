package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egy extends UploadDataProvider {
    private final byte[] a;
    private int b;

    public egy(byte[] bArr) {
        this.a = bArr;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.length;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        byte[] bArr = this.a;
        int iMin = Math.min(byteBuffer.remaining(), bArr.length - this.b);
        byteBuffer.put(bArr, this.b, iMin);
        this.b += iMin;
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.b = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
