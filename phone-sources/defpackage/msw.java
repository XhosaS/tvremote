package defpackage;

import android.net.Uri;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class msw implements Parcelable {
    public final ieg a;
    public final ieg b;
    public final ieg c;
    public final ieg d;
    public final ksy e;
    public final Uri f;
    public final Uri g;
    public final boolean h;
    public final boolean i;

    public msw() {
        throw null;
    }

    public static msv a(ksy ksyVar) {
        msv msvVar = new msv();
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        msvVar.a = ksyVar;
        ieg iegVar = ieg.a;
        msvVar.d(iegVar);
        msvVar.g(iegVar);
        msvVar.h(iegVar);
        msvVar.c(iegVar);
        msvVar.f(Uri.EMPTY);
        msvVar.e(Uri.EMPTY);
        msvVar.i(false);
        msvVar.b(false);
        return msvVar;
    }

    @Deprecated
    public final String b() {
        ieg iegVar = this.b;
        if (iegVar.m()) {
            return ((ksy) iegVar.g()).b;
        }
        return null;
    }

    @Deprecated
    public final String c() {
        ieg iegVar = this.c;
        if (iegVar.m()) {
            return ((ksy) iegVar.g()).b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof msw) {
            msw mswVar = (msw) obj;
            if (this.a.equals(mswVar.a) && this.b.equals(mswVar.b) && this.c.equals(mswVar.c) && this.d.equals(mswVar.d) && this.e.equals(mswVar.e) && this.f.equals(mswVar.f) && this.g.equals(mswVar.g) && this.h == mswVar.h && this.i == mswVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true == this.i ? 1231 : 1237);
    }

    public final String toString() {
        Uri uri = this.g;
        Uri uri2 = this.f;
        ksy ksyVar = this.e;
        ieg iegVar = this.d;
        ieg iegVar2 = this.c;
        ieg iegVar3 = this.b;
        return "PlaybackInfo{parentMovieId=" + this.a.toString() + ", seasonId=" + iegVar3.toString() + ", showId=" + iegVar2.toString() + ", initialResumeTimeMillis=" + iegVar.toString() + ", assetId=" + ksyVar.toString() + ", screenshotUrl=" + uri2.toString() + ", posterUrl=" + uri.toString() + ", trailer=" + this.h + ", hasAvodOffer=" + this.i + "}";
    }

    public msw(ieg iegVar, ieg iegVar2, ieg iegVar3, ieg iegVar4, ksy ksyVar, Uri uri, Uri uri2, boolean z, boolean z2) {
        if (iegVar == null) {
            throw new NullPointerException("Null parentMovieId");
        }
        this.a = iegVar;
        if (iegVar2 == null) {
            throw new NullPointerException("Null seasonId");
        }
        this.b = iegVar2;
        if (iegVar3 == null) {
            throw new NullPointerException("Null showId");
        }
        this.c = iegVar3;
        if (iegVar4 == null) {
            throw new NullPointerException("Null initialResumeTimeMillis");
        }
        this.d = iegVar4;
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.e = ksyVar;
        if (uri == null) {
            throw new NullPointerException("Null screenshotUrl");
        }
        this.f = uri;
        if (uri2 == null) {
            throw new NullPointerException("Null posterUrl");
        }
        this.g = uri2;
        this.h = z;
        this.i = z2;
    }
}
