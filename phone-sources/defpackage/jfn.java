package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfn {
    public final int a;
    public final int b;
    public final Integer c;

    public jfn(int i, int i2, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfn)) {
            return false;
        }
        jfn jfnVar = (jfn) obj;
        return this.a == jfnVar.a && this.b == jfnVar.b && yks.e(this.c, jfnVar.c);
    }

    public final int hashCode() {
        Integer num = this.c;
        return (((this.a * 31) + this.b) * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ApplyDynamicColorConfig(activeSlideIndex=" + this.a + ", carouselSize=" + this.b + ", dynamicSeedColor=" + this.c + ")";
    }
}
