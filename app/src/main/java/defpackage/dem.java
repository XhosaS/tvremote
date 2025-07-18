package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dem implements dek {
    int a;
    public Bitmap.Config b;
    private final den c;

    public dem(den denVar) {
        this.c = denVar;
    }

    @Override // defpackage.dek
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dem) {
            dem demVar = (dem) obj;
            if (this.a == demVar.a && dqm.g(this.b, demVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return deo.c(this.a, this.b);
    }
}
