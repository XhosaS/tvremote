package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szn implements sze {
    private final float a;

    public szn(float f) {
        this.a = f;
    }

    @Override // defpackage.sze
    public final float a(RectF rectF) {
        return this.a * Math.min(rectF.width(), rectF.height());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof szn) && this.a == ((szn) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return ((int) (this.a * 100.0f)) + "%";
    }
}
