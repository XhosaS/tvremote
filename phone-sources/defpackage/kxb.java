package defpackage;

import android.net.Uri;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kxb implements Parcelable, kst, kvy {
    public final String a;
    public final ksy b;
    public final Uri c;
    public final Uri d;

    public kxb() {
        throw null;
    }

    public static kxb b(String str, Uri uri, Uri uri2) {
        krf.c(str);
        return new ktx(str, ksy.i(str), uri, uri2);
    }

    @Override // defpackage.kum
    public final String dX() {
        return "trailer:".concat(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kxb) {
            kxb kxbVar = (kxb) obj;
            if (this.a.equals(kxbVar.a) && this.b.equals(kxbVar.b) && this.c.equals(kxbVar.c) && this.d.equals(kxbVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kvy
    public final Uri g() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    @Override // defpackage.kst
    public final ksy o() {
        return this.b;
    }

    public final String toString() {
        return "Trailer{trailerVideoId='" + this.a + "', assetId=" + this.b.toString() + ", screenshotUrl=" + this.c.toString() + ", posterUrl=" + this.d.toString() + "}";
    }

    public kxb(String str, ksy ksyVar, Uri uri, Uri uri2) {
        if (str == null) {
            throw new NullPointerException("Null trailerVideoId");
        }
        this.a = str;
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.b = ksyVar;
        if (uri == null) {
            throw new NullPointerException("Null screenshotUrl");
        }
        this.c = uri;
        if (uri2 == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.d = uri2;
    }
}
