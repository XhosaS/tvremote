package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvi {
    public ieg A;
    public short B;
    public ksy a;
    public String b;
    public Uri c;
    public Uri d;
    public String e;
    public int f;
    public ImmutableList g;
    public float h;
    public float i;
    public lcu j;
    public String k;
    public ieg l;
    public ieg m;
    public boolean n;
    public String o;
    public String p;
    public ImmutableList q;
    public ImmutableList r;
    public ImmutableList s;
    public ImmutableList t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public ieg z;

    public final kvj a() {
        ksy ksyVar;
        String str;
        Uri uri;
        Uri uri2;
        String str2;
        ImmutableList immutableList;
        lcu lcuVar;
        String str3;
        ieg iegVar;
        ieg iegVar2;
        String str4;
        String str5;
        ImmutableList immutableList2;
        ImmutableList immutableList3;
        ImmutableList immutableList4;
        ImmutableList immutableList5;
        ieg iegVar3;
        ieg iegVar4;
        if (this.B == 511 && (ksyVar = this.a) != null && (str = this.b) != null && (uri = this.c) != null && (uri2 = this.d) != null && (str2 = this.e) != null && (immutableList = this.g) != null && (lcuVar = this.j) != null && (str3 = this.k) != null && (iegVar = this.l) != null && (iegVar2 = this.m) != null && (str4 = this.o) != null && (str5 = this.p) != null && (immutableList2 = this.q) != null && (immutableList3 = this.r) != null && (immutableList4 = this.s) != null && (immutableList5 = this.t) != null && (iegVar3 = this.z) != null && (iegVar4 = this.A) != null) {
            return new ktr(ksyVar, str, uri, uri2, str2, this.f, immutableList, this.h, this.i, lcuVar, str3, iegVar, iegVar2, this.n, str4, str5, immutableList2, immutableList3, immutableList4, immutableList5, this.u, this.v, this.w, this.x, this.y, iegVar3, iegVar4);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" assetId");
        }
        if (this.b == null) {
            sb.append(" title");
        }
        if (this.c == null) {
            sb.append(" posterUrl");
        }
        if (this.d == null) {
            sb.append(" screenshotUrl");
        }
        if (this.e == null) {
            sb.append(" description");
        }
        if ((this.B & 1) == 0) {
            sb.append(" releaseYear");
        }
        if (this.g == null) {
            sb.append(" categoryIdList");
        }
        if ((this.B & 2) == 0) {
            sb.append(" starRating");
        }
        if ((this.B & 4) == 0) {
            sb.append(" tomatoRating");
        }
        if (this.j == null) {
            sb.append(" tomatometerRating");
        }
        if (this.k == null) {
            sb.append(" tomatometerRatingSourceUrl");
        }
        if (this.l == null) {
            sb.append(" offersResult");
        }
        if (this.m == null) {
            sb.append(" sellerStringResult");
        }
        if ((this.B & 8) == 0) {
            sb.append(" includesVat");
        }
        if (this.o == null) {
            sb.append(" ratingId");
        }
        if (this.p == null) {
            sb.append(" contentRating");
        }
        if (this.q == null) {
            sb.append(" bundleItemIds");
        }
        if (this.r == null) {
            sb.append(" trailers");
        }
        if (this.s == null) {
            sb.append(" audioTracks");
        }
        if (this.t == null) {
            sb.append(" captionTracks");
        }
        if ((this.B & 16) == 0) {
            sb.append(" hasKnowledge");
        }
        if ((this.B & 32) == 0) {
            sb.append(" has4kBadge");
        }
        if ((this.B & 64) == 0) {
            sb.append(" hasHdrBadge");
        }
        if ((this.B & 128) == 0) {
            sb.append(" hasMoviesAnywhereBadge");
        }
        if ((this.B & 256) == 0) {
            sb.append(" hasDolbyVisionHdrBadge");
        }
        if (this.z == null) {
            sb.append(" assetRestrictionListResult");
        }
        if (this.A == null) {
            sb.append(" entitlementAnnotation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
