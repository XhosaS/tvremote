package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htj implements hlo {
    @Override // defpackage.hkw
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, hll hllVar) throws Throwable {
        try {
            hwc.c(((hti) ((hnv) obj).c()).b(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // defpackage.hlo
    public final int b() {
        return 1;
    }
}
