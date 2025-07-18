package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqx extends FileOutputStream {
    private final ParcelFileDescriptor a;

    public bqx(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    public final void a(boolean z) throws IOException {
        try {
            if (!z) {
                close();
                return;
            }
            try {
                this.a.closeWithError("Recording interrupted.");
            } finally {
                super.close();
            }
        } catch (IOException unused) {
        }
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.a.close();
        } finally {
            super.close();
        }
    }
}
