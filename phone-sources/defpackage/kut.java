package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kut implements kst, kvy {
    private final ksy a;
    private final Uri b;
    private final float c;
    private final String d;
    private final lcc e;
    private final tst f;
    private final String g;
    private final String h;
    private final String i;
    private final tst j;

    public kut() {
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
        if (obj instanceof kut) {
            kut kutVar = (kut) obj;
            if (this.a.equals(kutVar.a) && this.b.equals(kutVar.b)) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(kutVar.c) && this.d.equals(kutVar.d) && this.e.equals(kutVar.e) && this.f.equals(kutVar.f) && this.g.equals(kutVar.g) && this.h.equals(kutVar.h) && this.i.equals(kutVar.i) && this.j.equals(kutVar.j)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.kvy
    public final Uri g() {
        return this.b;
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ this.d.hashCode();
        lcc lccVar = this.e;
        if (lccVar.A()) {
            iJ = lccVar.j();
        } else {
            int iJ2 = lccVar.M;
            if (iJ2 == 0) {
                iJ2 = lccVar.j();
                lccVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return (((((((((((iHashCode * 1000003) ^ iJ) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.kst
    public final ksy o() {
        return this.a;
    }

    public final String toString() {
        tst tstVar = this.j;
        tst tstVar2 = this.f;
        lcc lccVar = this.e;
        Uri uri = this.b;
        return "FhrBannerItem{assetId=" + String.valueOf(this.a) + ", posterUrl=" + String.valueOf(uri) + ", posterAspectRatio=" + this.c + ", title=" + this.d + ", color=" + String.valueOf(lccVar) + ", clientAction=" + String.valueOf(tstVar2) + ", ctaText=" + this.g + ", subTitle=" + this.h + ", accessibilityText=" + this.i + ", preferredProviderId=" + String.valueOf(tstVar) + "}";
    }

    public kut(ksy ksyVar, Uri uri, float f, String str, lcc lccVar, tst tstVar, String str2, String str3, String str4, tst tstVar2) {
        this.a = ksyVar;
        this.b = uri;
        this.c = f;
        this.d = str;
        this.e = lccVar;
        this.f = tstVar;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = tstVar2;
    }
}
