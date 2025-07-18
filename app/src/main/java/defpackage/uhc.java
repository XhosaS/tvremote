package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhc implements uef {
    @Override // defpackage.uef
    public final /* bridge */ /* synthetic */ Object a(uee ueeVar) throws IOException {
        uhg uhgVar = new uhg();
        uhgVar.a = true;
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) ueeVar.a.c(ueeVar.f, uhgVar), 805306368);
        try {
            parcelFileDescriptorOpen.getFd();
            if (parcelFileDescriptorOpen == null) {
                return null;
            }
            parcelFileDescriptorOpen.close();
            return null;
        } catch (Throwable th) {
            if (parcelFileDescriptorOpen != null) {
                try {
                    parcelFileDescriptorOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
