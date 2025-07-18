package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kul implements Parcelable {
    public static final kul a = new kto(0, ktz.a, "", trk.a, 0, "", "");
    public final int b;
    public final ktz c;
    public final String d;
    public final tst e;
    public final int f;
    public final String g;
    public final String h;

    public kul() {
        throw null;
    }

    public static kul a(String str, String str2) {
        return new kto(12, ktz.a, "", trk.a, 0, str, str2);
    }

    public static kul b(int i, ktz ktzVar, String str, ieg iegVar) {
        return new kto(i, ktzVar, str, iegVar.m() ? tst.i(iegVar.g()) : trk.a, 0, "", "");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kul) {
            kul kulVar = (kul) obj;
            if (this.b == kulVar.b && this.c.equals(kulVar.c) && this.d.equals(kulVar.d) && this.e.equals(kulVar.e) && this.f == kulVar.f && this.g.equals(kulVar.g) && this.h.equals(kulVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.b ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        tst tstVar = this.e;
        return "EntitlementAnnotation{annotationType=" + this.b + ", offers=" + this.c.toString() + ", currencySymbol=" + this.d + ", distributorId=" + tstVar.toString() + ", availableEpisodesNumber=" + this.f + ", displayText=" + this.g + ", accessibilityText=" + this.h + "}";
    }

    public kul(int i, ktz ktzVar, String str, tst tstVar, int i2, String str2, String str3) {
        this.b = i;
        if (ktzVar == null) {
            throw new NullPointerException("Null offers");
        }
        this.c = ktzVar;
        if (str == null) {
            throw new NullPointerException("Null currencySymbol");
        }
        this.d = str;
        if (tstVar == null) {
            throw new NullPointerException("Null distributorId");
        }
        this.e = tstVar;
        this.f = i2;
        if (str2 == null) {
            throw new NullPointerException("Null displayText");
        }
        this.g = str2;
        if (str3 == null) {
            throw new NullPointerException("Null accessibilityText");
        }
        this.h = str3;
    }
}
