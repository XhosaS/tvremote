package defpackage;

import android.os.ParcelFileDescriptor;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sew extends ParcelFileDescriptor.AutoCloseInputStream implements InputStreamRetargetInterface, sdt {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiosource/impl/audiostream/AudioPfdStream");
    private final AtomicBoolean b;

    public sew(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor);
        this.b = new AtomicBoolean(false);
    }

    @Override // defpackage.sdt
    public final /* synthetic */ sdx a(byte[] bArr, int i) {
        return new sdx(read(bArr, 0, i), 0L, 6, null);
    }

    public final void b() throws IOException {
        this.b.set(true);
        super.close();
    }

    @Override // android.os.ParcelFileDescriptor.AutoCloseInputStream, java.io.FileInputStream, java.io.InputStream, defpackage.sdt
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 >= 0) {
                return i3;
            }
            return -1;
        } catch (IOException e) {
            if (!this.b.get()) {
                throw e;
            }
            ((zdv) ((zdv) a.b()).q("com/google/android/libraries/search/audio/audiosource/impl/audiostream/AudioPfdStream", "read", 28, "AudioPfdStream.java")).u("#audio# IOException is ignored as the AudioPfdStream has been closed intentionally.");
            return -1;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
