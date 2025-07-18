package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdu {
    public final String a;
    public final Bitmap b;

    public jdu(String str, Bitmap bitmap) {
        this.a = str;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdu)) {
            return false;
        }
        jdu jduVar = (jdu) obj;
        return yks.e(this.a, jduVar.a) && yks.e(this.b, jduVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Bitmap bitmap = this.b;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        return "CachedDownloadData(title=" + this.a + ", poster=" + this.b + ")";
    }
}
