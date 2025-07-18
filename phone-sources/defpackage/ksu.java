package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksu implements kst {
    public final ksy a;
    public final ieg b;
    public final kys c;
    public final ieg d;
    private final ieg e;
    private final String f;
    private final Uri g;
    private final float h;

    public ksu() {
        throw null;
    }

    @Override // defpackage.kum
    public final String dX() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksu) {
            ksu ksuVar = (ksu) obj;
            if (this.a.equals(ksuVar.a) && this.b.equals(ksuVar.b) && this.c.equals(ksuVar.c) && this.d.equals(ksuVar.d) && this.e.equals(ksuVar.e) && this.f.equals(ksuVar.f) && this.g.equals(ksuVar.g)) {
                if (Float.floatToIntBits(this.h) == Float.floatToIntBits(ksuVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ Float.floatToIntBits(this.h);
    }

    @Override // defpackage.kst
    public final ksy o() {
        return this.a;
    }

    public final String toString() {
        Uri uri = this.g;
        ieg iegVar = this.e;
        ieg iegVar2 = this.d;
        kys kysVar = this.c;
        ieg iegVar3 = this.b;
        return "AssetContainer{assetId=" + String.valueOf(this.a) + ", entitlementAnnotation=" + String.valueOf(iegVar3) + ", serverCookie=" + String.valueOf(kysVar) + ", detailsPageSelection=" + String.valueOf(iegVar2) + ", initialDistributorId=" + String.valueOf(iegVar) + ", title=" + this.f + ", posterUrl=" + String.valueOf(uri) + ", aspectRatio=" + this.h + "}";
    }

    public ksu(ksy ksyVar, ieg iegVar, kys kysVar, ieg iegVar2, ieg iegVar3, Uri uri) {
        this.a = ksyVar;
        this.b = iegVar;
        this.c = kysVar;
        this.d = iegVar2;
        this.e = iegVar3;
        this.f = "";
        this.g = uri;
        this.h = 0.6939625f;
    }
}
