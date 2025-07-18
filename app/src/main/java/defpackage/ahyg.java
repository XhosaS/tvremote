package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahyg implements ahyi {
    final /* synthetic */ ParcelFileDescriptor a;

    public ahyg(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.ahyi
    public final FileChannel a() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: ".concat(String.valueOf(String.valueOf(parcelFileDescriptor))));
    }
}
