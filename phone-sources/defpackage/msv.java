package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class msv {
    public ksy a;
    private ieg b;
    private ieg c;
    private ieg d;
    private ieg e;
    private Uri f;
    private Uri g;
    private boolean h;
    private boolean i;
    private byte j;

    public final msw a() {
        ieg iegVar;
        ieg iegVar2;
        ieg iegVar3;
        ieg iegVar4;
        ksy ksyVar;
        Uri uri;
        Uri uri2;
        if (this.j == 3 && (iegVar = this.b) != null && (iegVar2 = this.c) != null && (iegVar3 = this.d) != null && (iegVar4 = this.e) != null && (ksyVar = this.a) != null && (uri = this.f) != null && (uri2 = this.g) != null) {
            return new msu(iegVar, iegVar2, iegVar3, iegVar4, ksyVar, uri, uri2, this.h, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" parentMovieId");
        }
        if (this.c == null) {
            sb.append(" seasonId");
        }
        if (this.d == null) {
            sb.append(" showId");
        }
        if (this.e == null) {
            sb.append(" initialResumeTimeMillis");
        }
        if (this.a == null) {
            sb.append(" assetId");
        }
        if (this.f == null) {
            sb.append(" screenshotUrl");
        }
        if (this.g == null) {
            sb.append(" posterUrl");
        }
        if ((this.j & 1) == 0) {
            sb.append(" trailer");
        }
        if ((this.j & 2) == 0) {
            sb.append(" hasAvodOffer");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.i = z;
        this.j = (byte) (this.j | 2);
    }

    public final void c(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null initialResumeTimeMillis");
        }
        this.e = iegVar;
    }

    public final void d(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null parentMovieId");
        }
        this.b = iegVar;
    }

    public final void e(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.g = uri;
    }

    public final void f(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null screenshotUrl");
        }
        this.f = uri;
    }

    public final void g(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null seasonId");
        }
        this.c = iegVar;
    }

    public final void h(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null showId");
        }
        this.d = iegVar;
    }

    public final void i(boolean z) {
        this.h = z;
        this.j = (byte) (this.j | 1);
    }
}
