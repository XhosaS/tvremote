package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuv {
    public final Uri a;
    public final kuu b;
    public final boolean c;
    public final tst d;
    public final tst e;
    public final tst f;

    public kuv() {
        throw null;
    }

    public static nbh b() {
        nbh nbhVar = new nbh(null, null);
        nbhVar.e(Uri.EMPTY);
        nbhVar.d(kuu.TYPE_UNSPECIFIED);
        nbhVar.c(false);
        trk trkVar = trk.a;
        nbhVar.b = trkVar;
        nbhVar.e = trkVar;
        nbhVar.d = trkVar;
        return nbhVar;
    }

    public final boolean a() {
        return !Uri.EMPTY.equals(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kuv) {
            kuv kuvVar = (kuv) obj;
            if (this.a.equals(kuvVar.a) && this.b.equals(kuvVar.b) && this.c == kuvVar.c && this.d.equals(kuvVar.d) && this.e.equals(kuvVar.e) && this.f.equals(kuvVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        tst tstVar = this.f;
        tst tstVar2 = this.e;
        tst tstVar3 = this.d;
        kuu kuuVar = this.b;
        return "Image{uri=" + String.valueOf(this.a) + ", type=" + String.valueOf(kuuVar) + ", fife=" + this.c + ", aspectRatio=" + String.valueOf(tstVar3) + ", width=" + String.valueOf(tstVar2) + ", height=" + String.valueOf(tstVar) + "}";
    }

    public kuv(Uri uri, kuu kuuVar, boolean z, tst tstVar, tst tstVar2, tst tstVar3) {
        this.a = uri;
        this.b = kuuVar;
        this.c = z;
        this.d = tstVar;
        this.e = tstVar2;
        this.f = tstVar3;
    }
}
