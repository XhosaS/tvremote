package defpackage;

import android.net.Uri;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kxg implements Parcelable {
    public static final kxg a = a(kuf.a, ksr.a, Uri.EMPTY, 0, Long.MAX_VALUE);
    public final vsz b;
    public final kuf c;
    public final ksr d;
    public final Uri e;
    public final int f;
    public final long g;
    public final boolean h;

    public kxg() {
        throw null;
    }

    public static kxg a(kuf kufVar, ksr ksrVar, Uri uri, int i, long j) {
        return b(vsz.b, kufVar, ksrVar, uri, i, j);
    }

    public static kxg b(vsz vszVar, kuf kufVar, ksr ksrVar, Uri uri, int i, long j) {
        return new kty(vszVar, kufVar, ksrVar, uri, i, j, i == 2);
    }

    public static boolean c(kxg kxgVar) {
        return kxgVar.equals(a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kxg) {
            kxg kxgVar = (kxg) obj;
            if (this.b.equals(kxgVar.b) && this.c.equals(kxgVar.c) && this.d.equals(kxgVar.d) && this.e.equals(kxgVar.e) && this.f == kxgVar.f && this.g == kxgVar.g && this.h == kxgVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        int i = true != this.h ? 1237 : 1231;
        long j = this.g;
        return (((((iHashCode * 1000003) ^ this.f) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i;
    }

    public final String toString() {
        Uri uri = this.e;
        ksr ksrVar = this.d;
        kuf kufVar = this.c;
        return "WatchAction{watchActionId=" + this.b.toString() + ", distributor=" + kufVar.toString() + ", supportedApp=" + ksrVar.toString() + ", deeplinkUri=" + uri.toString() + ", restriction=" + this.f + ", availabilityEndDateSecond=" + this.g + ", free=" + this.h + "}";
    }

    public kxg(vsz vszVar, kuf kufVar, ksr ksrVar, Uri uri, int i, long j, boolean z) {
        if (vszVar == null) {
            throw new NullPointerException("Null watchActionId");
        }
        this.b = vszVar;
        if (kufVar == null) {
            throw new NullPointerException("Null distributor");
        }
        this.c = kufVar;
        if (ksrVar == null) {
            throw new NullPointerException("Null supportedApp");
        }
        this.d = ksrVar;
        if (uri == null) {
            throw new NullPointerException("Null deeplinkUri");
        }
        this.e = uri;
        this.f = i;
        this.g = j;
        this.h = z;
    }
}
