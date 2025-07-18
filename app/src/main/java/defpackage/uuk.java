package defpackage;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uuk {
    public static final uuk a = new uuk();
    private final ColorMatrixColorFilter[] b = new ColorMatrixColorFilter[256];

    private uuk() {
        for (int i = 0; i < 256; i++) {
            this.b[i] = new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, i / 255.0f, 0.0f});
        }
    }

    public final ColorFilter a(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        yqw.L(z);
        return this.b[(int) (f * 255.0f)];
    }
}
