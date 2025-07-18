package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aar implements aas {
    private final int a;

    public aar(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        wv.c("Provided count should be larger than zero");
    }

    @Override // defpackage.aas
    public final List a(clx clxVar, int i, int i2) {
        return d.j(i, this.a, i2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aar) && this.a == ((aar) obj).a;
    }

    public final int hashCode() {
        return -this.a;
    }
}
