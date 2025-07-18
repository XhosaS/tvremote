package defpackage;

import android.os.Build;
import androidx.media3.decoder.CryptoConfig;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epn implements CryptoConfig {
    public static final boolean a;
    public final UUID b;
    public final byte[] c;

    static {
        boolean z = false;
        if ("Amazon".equals(Build.MANUFACTURER) && ("AFTM".equals(Build.MODEL) || "AFTB".equals(Build.MODEL))) {
            z = true;
        }
        a = z;
    }

    public epn(UUID uuid, byte[] bArr) {
        this.b = uuid;
        this.c = bArr;
    }
}
