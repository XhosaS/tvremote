package defpackage;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zze extends UploadDataProvider {
    private final org.chromium.net.UploadDataProvider a;

    public zze(org.chromium.net.UploadDataProvider uploadDataProvider) {
        this.a = uploadDataProvider;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final long getLength() {
        return this.a.getLength();
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        this.a.read(new zzf(uploadDataSink), byteBuffer);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.rewind(new zzf(uploadDataSink));
    }
}
