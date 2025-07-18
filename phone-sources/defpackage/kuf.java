package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kuf implements Parcelable {
    public static final kuf a = new ktn("PlayMovies");
    private static final kuf c;
    public final String b;

    static {
        new ktn("YouTube");
        c = new ktn("CROSS_DISTRIBUTOR_ID");
    }

    public kuf() {
        throw null;
    }

    public static boolean a(kuf kufVar) {
        return c.equals(kufVar);
    }

    public static boolean b(kuf kufVar) {
        return a.equals(kufVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kuf) {
            return this.b.equals(((kuf) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DistributorId{identifier=" + this.b + "}";
    }

    public kuf(String str) {
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        this.b = str;
    }
}
