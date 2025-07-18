package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pfy {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;

    public pfy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pfy) {
            pfy pfyVar = (pfy) obj;
            if (this.a == pfyVar.a && this.b == pfyVar.b && this.h == pfyVar.h && this.i == pfyVar.i && this.j == pfyVar.j && this.k == pfyVar.k && this.c == pfyVar.c && this.d == pfyVar.d && this.l == pfyVar.l && this.e == pfyVar.e && this.f == pfyVar.f && this.m == pfyVar.m && this.g == pfyVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.l) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.m) * 1000003) ^ this.g;
    }

    public final String toString() {
        return "PaletteColors{primaryColor=" + this.a + ", onPrimaryColor=" + this.b + ", secondaryColor=" + this.h + ", surfaceColor=" + this.i + ", surfaceColor1=" + this.j + ", surfaceColor2=" + this.k + ", surfaceColor3=" + this.c + ", surfaceColor4=" + this.d + ", surfaceColor5=" + this.l + ", onSurfaceColor=" + this.e + ", onSurfaceVariantColor=" + this.f + ", backgroundColor=" + this.m + ", outlineColor=" + this.g + "}";
    }

    public pfy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.a = i;
        this.b = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.c = i7;
        this.d = i8;
        this.l = i9;
        this.e = i10;
        this.f = i11;
        this.m = i12;
        this.g = i13;
    }
}
