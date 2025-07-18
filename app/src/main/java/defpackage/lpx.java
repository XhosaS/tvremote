package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lpx implements lnn {
    private final Status a;
    private final ParcelFileDescriptor b;

    public lpx(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = status;
        this.b = parcelFileDescriptor;
    }

    @Override // defpackage.kez
    public final void a() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.kfc
    public final Status b() {
        return this.a;
    }

    @Override // defpackage.lnn
    public final ParcelFileDescriptor c() {
        return this.b;
    }
}
