package defpackage;

import android.graphics.Bitmap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzb {
    public final Bitmap a;
    public final Map b;

    public gzb(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzb)) {
            return false;
        }
        gzb gzbVar = (gzb) obj;
        return yks.e(this.a, gzbVar.a) && yks.e(this.b, gzbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Value(bitmap=" + this.a + ", extras=" + this.b + ")";
    }
}
