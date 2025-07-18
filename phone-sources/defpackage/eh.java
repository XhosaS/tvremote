package defpackage;

import android.os.Build;
import androidx.media.AudioAttributesCompat;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class eh {
    public eh() {
    }

    public eh(byte[] bArr) {
    }

    public eh(int i) {
        dye dyeVar;
        int i2 = AudioAttributesCompat.b;
        if (Build.VERSION.SDK_INT >= 26) {
            dyeVar = new dyf();
        } else {
            dyeVar = new dye();
        }
        dyeVar.a.setLegacyStreamType(i);
        dyeVar.a();
    }
}
