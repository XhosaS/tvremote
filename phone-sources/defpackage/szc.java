package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szc implements sze {
    private final sze a;
    private final float b;

    public szc(float f, sze szeVar) {
        while (szeVar instanceof szc) {
            szeVar = ((szc) szeVar).a;
            f += ((szc) szeVar).b;
        }
        this.a = szeVar;
        this.b = f;
    }

    @Override // defpackage.sze
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szc)) {
            return false;
        }
        szc szcVar = (szc) obj;
        return this.a.equals(szcVar.a) && this.b == szcVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
