package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaq implements aas {
    private final float a = 174.0f;

    public aaq() {
        if (Float.compare(174.0f, 0.0f) > 0) {
            return;
        }
        wv.c("Provided min size should be larger than zero.");
    }

    @Override // defpackage.aas
    public final List a(clx clxVar, int i, int i2) {
        return d.j(i, Math.max((i + i2) / (clxVar.cu(174.0f) + i2), 1), i2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aaq)) {
            return false;
        }
        float f = ((aaq) obj).a;
        return cma.b(174.0f, 174.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(174.0f);
    }
}
