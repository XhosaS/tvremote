package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sek {
    final String a;
    boolean b = true;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;
    float k;
    int l;
    int m;
    int n;
    int o;

    public sek(String str, boolean z, float f, float f2, float f3, float f4, float f5, int i) {
        this.a = str;
        float f6 = true != z ? f : f2;
        this.c = f6;
        f = true != z ? f2 : f;
        this.d = f;
        this.j = f3;
        this.k = f4;
        this.f = f3 - f6;
        this.g = f4 - f;
        this.h = f6;
        this.i = f;
        this.l = (int) (f5 * 255.0f);
        this.n = i;
        this.m = i;
        this.o = i;
        this.e = 0.0f;
    }

    public final String toString() {
        return "OutlineInfo{groupId=" + this.a + ", finalLeft=" + this.c + ", finalRight=" + this.d + ", leftTranslation=" + this.f + ", rightTranslation =" + this.g + ", currentLeft=" + this.h + ", currentRight=" + this.i + ", alpha=" + this.l + ", currentColor=" + Integer.toHexString(this.m) + ", initialColor=" + Integer.toHexString(this.n) + ", finalColor=" + Integer.toHexString(this.o) + "}";
    }
}
