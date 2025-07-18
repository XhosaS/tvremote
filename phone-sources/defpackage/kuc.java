package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kuc implements Parcelable {
    public final String a;
    public final boolean b;

    public kuc() {
        throw null;
    }

    public static kuc a(String str) {
        krf.c(str);
        return new ktm(str, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kuc) {
            kuc kucVar = (kuc) obj;
            if (this.a.equals(kucVar.a) && this.b == kucVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "CollectionId{id='" + this.a + "', isLocal=" + this.b + "}";
    }

    public kuc(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        this.b = z;
    }
}
