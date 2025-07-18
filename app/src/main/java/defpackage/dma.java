package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dma implements daq {
    @Override // defpackage.czt
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, dan danVar) throws Throwable {
        try {
            dpw.c(((dlz) ((ddp) obj).c()).b(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // defpackage.daq
    public final int b() {
        return 1;
    }
}
