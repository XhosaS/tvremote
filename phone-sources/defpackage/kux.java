package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kux {
    public final Uri a;
    public final float b;

    public kux() {
        throw null;
    }

    public static kux a(Uri uri, float f) {
        if (uri != null) {
            return new kux(uri, f);
        }
        throw new NullPointerException("Null url");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kux) {
            kux kuxVar = (kux) obj;
            if (this.a.equals(kuxVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(kuxVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "ImageUri{url=" + String.valueOf(this.a) + ", aspectRatio=" + this.b + "}";
    }

    public kux(Uri uri, float f) {
        this.a = uri;
        this.b = f;
    }
}
