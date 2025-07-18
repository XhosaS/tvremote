package defpackage;

import android.os.ParcelFileDescriptor;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ogv extends FileInputStream implements InputStreamRetargetInterface, sjv {
    private final ParcelFileDescriptor a;

    public ogv(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.sjv
    public final FileChannel a() {
        return getChannel();
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            super.close();
        } finally {
            this.a.close();
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
