package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ola implements ojf {
    private final Status a;
    private final ParcelFileDescriptor b;

    public ola(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = status;
        this.b = parcelFileDescriptor;
    }

    @Override // defpackage.nwz
    public final void a() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            ocs.a(parcelFileDescriptor);
        }
    }

    @Override // defpackage.ojf
    public final ParcelFileDescriptor b() {
        return this.b;
    }

    @Override // defpackage.nxc
    public final Status e() {
        return this.a;
    }
}
