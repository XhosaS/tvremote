package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szd implements sze {
    private final float a;

    public szd(float f) {
        this.a = f;
    }

    @Override // defpackage.sze
    public final float a(RectF rectF) {
        return cmq.k(this.a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof szd) && this.a == ((szd) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
