package defpackage;

import android.os.ParcelFileDescriptor;
import android.view.contentcapture.DataShareWriteAdapter;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sie implements DataShareWriteAdapter {
    final /* synthetic */ sit a;

    public sie(sit sitVar) {
        this.a = sitVar;
    }

    public final void onWrite(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        try {
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
            try {
                this.a.f(autoCloseOutputStream);
                autoCloseOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public final void onRejected() {
    }

    public final void onError(int i) {
    }
}
