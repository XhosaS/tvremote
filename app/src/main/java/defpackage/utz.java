package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class utz extends uuh {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final boolean g;

    public utz(int i, int i2, float f, float f2, float f3, float f4, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = z;
    }

    @Override // defpackage.uuh
    public final float a() {
        return this.f;
    }

    @Override // defpackage.uuh
    public final float b() {
        return this.d;
    }

    @Override // defpackage.uuh
    public final float c() {
        return this.e;
    }

    @Override // defpackage.uuh
    public final float d() {
        return this.c;
    }

    @Override // defpackage.uuh
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uuh) {
            uuh uuhVar = (uuh) obj;
            if (this.a == uuhVar.f()) {
                uuhVar.m();
                uuhVar.k();
                if (this.b == uuhVar.e() && Float.floatToIntBits(this.c) == Float.floatToIntBits(uuhVar.d()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(uuhVar.b()) && Float.floatToIntBits(this.e) == Float.floatToIntBits(uuhVar.c())) {
                    uuhVar.l();
                    if (Float.floatToIntBits(this.f) == Float.floatToIntBits(uuhVar.a())) {
                        uuhVar.h();
                        uuhVar.j();
                        uuhVar.i();
                        if (this.g == uuhVar.g()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.uuh
    public final int f() {
        return this.a;
    }

    @Override // defpackage.uuh
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a ^ 1000003) * (-721379959)) ^ 1237) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d)) * 1000003) ^ Float.floatToIntBits(this.e)) * (-721379959)) ^ Float.floatToIntBits(this.f)) * (-721379959)) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.g ? 1237 : 1231);
    }

    public final String toString() {
        return "ItemTransformFacet{extraSpaceBeforeKeyLine=" + this.a + ", extraSpace=0, showTitleWhenExtraSpaceSpecified=false, extraSpaceAfterKeyLine=" + this.b + ", titleViewUnselectedScale=" + this.c + ", titleViewSelectedScale=" + this.d + ", titleViewTranslationY=" + this.e + ", titleViewCollapsedTranslationY=0, titleViewCollapsedScale=" + this.f + ", collapsedTranslationY=0, forceExtraSpaceOnGridUnFocused=false, forceExtraSpaceAfterKeyLineOnGridUnFocused=false, avoidOverlappingExtraSpace=" + this.g + "}";
    }

    @Override // defpackage.uuh
    public final void h() {
    }

    @Override // defpackage.uuh
    public final void i() {
    }

    @Override // defpackage.uuh
    public final void j() {
    }

    @Override // defpackage.uuh
    public final void k() {
    }

    @Override // defpackage.uuh
    public final void l() {
    }

    @Override // defpackage.uuh
    public final void m() {
    }
}
