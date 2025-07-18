package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hop implements hon {
    int a;
    public Bitmap.Config b;
    private final hoq c;

    public hop(hoq hoqVar) {
        this.c = hoqVar;
    }

    @Override // defpackage.hon
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hop) {
            hop hopVar = (hop) obj;
            if (this.a == hopVar.a) {
                Bitmap.Config config = this.b;
                Bitmap.Config config2 = hopVar.b;
                char[] cArr = hwp.a;
                if (a.au(config, config2)) {
                    return true;
                }
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
        return hor.a(this.a, this.b);
    }
}
