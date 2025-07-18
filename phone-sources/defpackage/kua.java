package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kua implements Parcelable {
    public final String a;
    public final int b;

    public kua() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kua) {
            kua kuaVar = (kua) obj;
            if (this.a.equals(kuaVar.a) && this.b == kuaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        a.bw(i);
        return (iHashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "CaptionTrack{getLanguageTag=" + this.a + ", captionType=" + Integer.toString(this.b - 2) + "}";
    }

    public kua(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null getLanguageTag");
        }
        this.a = str;
        this.b = i;
    }
}
