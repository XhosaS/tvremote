package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtu implements kum {
    public final ksy a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;
    public final int h;
    public final String i;
    public final boolean j;
    public final idy k;
    public final mit l;
    public final lio m;
    public final String n;
    public final Uri o;
    public final int p;
    public final int q;
    public final ieg r;
    public final ieg s;
    private final String t;
    private final String u;
    private final boolean v;
    private final ieg w;

    public mtu() {
        throw null;
    }

    @Override // defpackage.kum
    public final String dX() {
        return this.a.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtu.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode()) * 1000003) ^ 1237) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k.hashCode();
        mit mitVar = this.l;
        int iHashCode2 = ((iHashCode * 1000003) ^ (mitVar == null ? 0 : mitVar.hashCode())) * 1000003;
        lio lioVar = this.m;
        return ((((((((((((((((((iHashCode2 ^ (lioVar != null ? ((lif) lioVar).a() : 0)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p) * 1000003) ^ this.q) * 1000003) ^ 1237) * 1000003) ^ (true == this.v ? 1231 : 1237)) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.w.hashCode()) * 1000003) ^ this.s.hashCode();
    }

    public final String toString() {
        ieg iegVar = this.s;
        ieg iegVar2 = this.w;
        ieg iegVar3 = this.r;
        Uri uri = this.o;
        lio lioVar = this.m;
        mit mitVar = this.l;
        idy idyVar = this.k;
        return "MiniDetailsViewModel{assetId=" + String.valueOf(this.a) + ", cardWidth=" + this.b + ", title=" + this.c + ", hasContentRating=false, contentRating=" + this.t + ", contentRatingContentDescription=" + this.u + ", subtitle=" + this.d + ", subtitleContentDescription=" + this.e + ", hasTomatoRating=" + this.f + ", tomatoRating=" + this.g + ", tomatometerRatingDrawableRes=" + this.h + ", starRating=" + this.i + ", has4kBadge=false, canDownloadContent=" + this.j + ", downloadOnBindListener=" + String.valueOf(idyVar) + ", directPlayButtonViewModel=" + String.valueOf(mitVar) + ", directPlayButtonUiElementNode=" + String.valueOf(lioVar) + ", directPlayButtonContentDescription=" + this.n + ", posterUrl=" + String.valueOf(uri) + ", posterWidth=" + this.p + ", posterHeight=" + this.q + ", isOwned=false, isBundle=" + this.v + ", uiElementNodeResult=" + String.valueOf(iegVar3) + ", annotationData=" + String.valueOf(iegVar2) + ", detailsPageSelection=" + String.valueOf(iegVar) + "}";
    }

    public mtu(ksy ksyVar, int i, String str, String str2, String str3, String str4, String str5, boolean z, int i2, int i3, String str6, boolean z2, idy idyVar, mit mitVar, lio lioVar, String str7, Uri uri, int i4, int i5, boolean z3, ieg iegVar, ieg iegVar2, ieg iegVar3) {
        this.a = ksyVar;
        this.b = i;
        this.c = str;
        this.t = str2;
        this.u = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = str6;
        this.j = z2;
        this.k = idyVar;
        this.l = mitVar;
        this.m = lioVar;
        this.n = str7;
        this.o = uri;
        this.p = i4;
        this.q = i5;
        this.v = z3;
        this.r = iegVar;
        this.w = iegVar2;
        this.s = iegVar3;
    }
}
