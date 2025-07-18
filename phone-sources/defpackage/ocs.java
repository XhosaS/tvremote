package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class ocs {
    public static void a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
