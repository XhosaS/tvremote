package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kwl implements Parcelable, kst, kwz, kvy, kvz {
    public final ksy d;
    public final String e;
    public final Uri f;
    public final float g;
    public final ieg h;
    public final ImmutableList i;
    public final ImmutableList j;
    public final String k;
    public final ksy l;
    public final String m;
    public final Uri n;
    public final ieg o;
    public final boolean p;
    public final ImmutableList q;

    public kwl() {
        throw null;
    }

    public static kwk c(ksy ksyVar, ksy ksyVar2) {
        a.H(ksy.x(ksyVar));
        a.H(ksy.y(ksyVar2));
        kwk kwkVar = new kwk();
        kwkVar.a = ksyVar;
        kwkVar.d = ksyVar2;
        kwkVar.k("");
        kwkVar.j("");
        String str = ksyVar2.b;
        kwkVar.f(kxd.f(str));
        kwkVar.b = 1.0f;
        kwkVar.e = (byte) (kwkVar.e | 1);
        kwkVar.i(kxd.e(str));
        kwkVar.h("");
        ieg iegVar = ieg.a;
        kwkVar.e(iegVar);
        kwkVar.c = ImmutableList.copyOf((Collection) Collections.EMPTY_LIST);
        kwkVar.c(ImmutableList.of());
        kwkVar.g(iegVar);
        kwkVar.d(false);
        kwkVar.b(Collections.EMPTY_LIST);
        return kwkVar;
    }

    @Override // defpackage.kwz
    public final String E() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        ieg iegVar = this.h;
        if (iegVar.m() && ((ktz) iegVar.g()).a() > 0) {
            return true;
        }
        UnmodifiableIterator it = this.q.iterator();
        while (it.hasNext()) {
            if (kuf.b(((kup) it.next()).a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kvz
    @Deprecated
    public final ktz dW() {
        return (ktz) this.h.h(ktz.a);
    }

    @Override // defpackage.kum
    public final String dX() {
        return this.d.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwl) {
            kwl kwlVar = (kwl) obj;
            if (this.d.equals(kwlVar.d) && this.e.equals(kwlVar.e) && this.f.equals(kwlVar.f)) {
                if (Float.floatToIntBits(this.g) == Float.floatToIntBits(kwlVar.g) && this.h.equals(kwlVar.h) && this.i.equals(kwlVar.i) && this.j.equals(kwlVar.j) && this.k.equals(kwlVar.k) && this.l.equals(kwlVar.l) && this.m.equals(kwlVar.m) && this.n.equals(kwlVar.n) && this.o.equals(kwlVar.o) && this.p == kwlVar.p && this.q.equals(kwlVar.q)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.kvy
    public final Uri g() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ this.q.hashCode();
    }

    @Override // defpackage.kvz
    public final ieg l() {
        return this.h;
    }

    @Override // defpackage.kst
    public final ksy o() {
        return this.d;
    }

    public final String toString() {
        ImmutableList immutableList = this.q;
        ieg iegVar = this.o;
        Uri uri = this.n;
        ksy ksyVar = this.l;
        ImmutableList immutableList2 = this.j;
        ImmutableList immutableList3 = this.i;
        ieg iegVar2 = this.h;
        Uri uri2 = this.f;
        return "Season{assetId=" + this.d.toString() + ", title=" + this.e + ", posterUrl=" + uri2.toString() + ", posterAspectRatio=" + this.g + ", offersResult=" + iegVar2.toString() + ", episodes=" + immutableList3.toString() + ", episodeIds=" + immutableList2.toString() + ", sequenceNumber=" + this.k + ", showId=" + ksyVar.toString() + ", showTitle=" + this.m + ", showBannerUrl=" + uri.toString() + ", seller=" + iegVar.toString() + ", includesVat=" + this.p + ", episodeAvailability=" + immutableList.toString() + "}";
    }

    public kwl(ksy ksyVar, String str, Uri uri, float f, ieg iegVar, ImmutableList immutableList, ImmutableList immutableList2, String str2, ksy ksyVar2, String str3, Uri uri2, ieg iegVar2, boolean z, ImmutableList immutableList3) {
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.d = ksyVar;
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.e = str;
        if (uri == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.f = uri;
        this.g = f;
        if (iegVar == null) {
            throw new NullPointerException("Null offersResult");
        }
        this.h = iegVar;
        if (immutableList == null) {
            throw new NullPointerException("Null episodes");
        }
        this.i = immutableList;
        if (immutableList2 == null) {
            throw new NullPointerException("Null episodeIds");
        }
        this.j = immutableList2;
        if (str2 == null) {
            throw new NullPointerException("Null sequenceNumber");
        }
        this.k = str2;
        if (ksyVar2 == null) {
            throw new NullPointerException("Null showId");
        }
        this.l = ksyVar2;
        if (str3 == null) {
            throw new NullPointerException("Null showTitle");
        }
        this.m = str3;
        if (uri2 == null) {
            throw new NullPointerException("Null showBannerUrl");
        }
        this.n = uri2;
        if (iegVar2 == null) {
            throw new NullPointerException("Null seller");
        }
        this.o = iegVar2;
        this.p = z;
        if (immutableList3 == null) {
            throw new NullPointerException("Null episodeAvailability");
        }
        this.q = immutableList3;
    }
}
