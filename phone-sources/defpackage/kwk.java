package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwk {
    public ksy a;
    public float b;
    public ImmutableList c;
    public ksy d;
    public byte e;
    private String f;
    private Uri g;
    private ieg h;
    private ImmutableList i;
    private String j;
    private String k;
    private Uri l;
    private ieg m;
    private boolean n;
    private ImmutableList o;

    public final kwl a() {
        ksy ksyVar;
        String str;
        Uri uri;
        ieg iegVar;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        String str2;
        ksy ksyVar2;
        String str3;
        Uri uri2;
        ieg iegVar2;
        ImmutableList immutableList3;
        if (this.e == 3 && (ksyVar = this.a) != null && (str = this.f) != null && (uri = this.g) != null && (iegVar = this.h) != null && (immutableList = this.c) != null && (immutableList2 = this.i) != null && (str2 = this.j) != null && (ksyVar2 = this.d) != null && (str3 = this.k) != null && (uri2 = this.l) != null && (iegVar2 = this.m) != null && (immutableList3 = this.o) != null) {
            return new ktt(ksyVar, str, uri, this.b, iegVar, immutableList, immutableList2, str2, ksyVar2, str3, uri2, iegVar2, this.n, immutableList3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" assetId");
        }
        if (this.f == null) {
            sb.append(" title");
        }
        if (this.g == null) {
            sb.append(" posterUrl");
        }
        if ((this.e & 1) == 0) {
            sb.append(" posterAspectRatio");
        }
        if (this.h == null) {
            sb.append(" offersResult");
        }
        if (this.c == null) {
            sb.append(" episodes");
        }
        if (this.i == null) {
            sb.append(" episodeIds");
        }
        if (this.j == null) {
            sb.append(" sequenceNumber");
        }
        if (this.d == null) {
            sb.append(" showId");
        }
        if (this.k == null) {
            sb.append(" showTitle");
        }
        if (this.l == null) {
            sb.append(" showBannerUrl");
        }
        if (this.m == null) {
            sb.append(" seller");
        }
        if ((this.e & 2) == 0) {
            sb.append(" includesVat");
        }
        if (this.o == null) {
            sb.append(" episodeAvailability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(List list) {
        this.o = ImmutableList.copyOf((Collection) list);
    }

    public final void c(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null episodeIds");
        }
        this.i = immutableList;
    }

    public final void d(boolean z) {
        this.n = z;
        this.e = (byte) (this.e | 2);
    }

    public final void e(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null offersResult");
        }
        this.h = iegVar;
    }

    public final void f(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.g = uri;
    }

    public final void g(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null seller");
        }
        this.m = iegVar;
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null sequenceNumber");
        }
        this.j = str;
    }

    public final void i(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null showBannerUrl");
        }
        this.l = uri;
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null showTitle");
        }
        this.k = str;
    }

    public final void k(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.f = str;
    }
}
