package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SyncFailedException;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ogw extends FileOutputStream implements skd, sjv {
    private final ParcelFileDescriptor a;

    public ogw(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.sjv
    public final FileChannel a() {
        return getChannel();
    }

    @Override // defpackage.skd
    public final void b() throws SyncFailedException {
        getFD().sync();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            super.close();
        } finally {
            this.a.close();
        }
    }
}
