package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ksr implements Parcelable {
    public static final ksr a = new ktg("com.google.android.videos");
    public final String b;

    public ksr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksr) {
            return this.b.equals(((ksr) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AndroidAppId{packageName=" + this.b + "}";
    }

    public ksr(String str) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.b = str;
    }
}
