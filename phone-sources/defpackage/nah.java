package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nah {
    public final Uri a;
    public final String b;
    public final String c;
    public final lio d;

    public nah() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nah) {
            nah nahVar = (nah) obj;
            if (this.a.equals(nahVar.a) && this.b.equals(nahVar.b) && this.c.equals(nahVar.c) && this.d.equals(nahVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        lio lioVar = this.d;
        return "TrailerItemViewModel{imageUrl=" + String.valueOf(this.a) + ", title=" + this.b + ", trailerAssetId=" + this.c + ", uiElementNode=" + String.valueOf(lioVar) + "}";
    }

    public nah(Uri uri, String str, String str2, lio lioVar) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = lioVar;
    }
}
