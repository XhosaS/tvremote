package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuj {
    public static final kuj a;
    public final float b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final int h;

    static {
        kui kuiVarA = a();
        kuiVarA.h(4);
        a = kuiVarA.a();
    }

    public kuj() {
        throw null;
    }

    public static kui a() {
        kui kuiVar = new kui();
        kuiVar.c(0.0f);
        kuiVar.d(0L);
        kuiVar.b(0L);
        kuiVar.e(0);
        kuiVar.g(0);
        kuiVar.f(0);
        return kuiVar;
    }

    public static kuj b(float f, int i, int i2, long j, long j2, int i3) {
        kui kuiVarA = a();
        kuiVarA.c(f);
        kuiVarA.h(1);
        kuiVarA.d(j);
        kuiVarA.b(j2);
        kuiVarA.e(i2);
        kuiVarA.g(i);
        kuiVarA.f(i3);
        return kuiVarA.a();
    }

    public static kuj c(float f, long j, long j2, int i, int i2) {
        kui kuiVarA = a();
        kuiVarA.c(f);
        kuiVarA.h(0);
        kuiVarA.d(j);
        kuiVarA.b(j2);
        kuiVarA.g(i);
        kuiVarA.f(i2);
        return kuiVarA.a();
    }

    public static kuj d(long j, int i) {
        kui kuiVarA = a();
        kuiVarA.c(1.0f);
        kuiVarA.h(2);
        kuiVarA.d(j);
        kuiVarA.b(j);
        kuiVarA.f(i);
        return kuiVarA.a();
    }

    public static kuj e(float f, long j, long j2, int i) {
        kui kuiVarA = a();
        kuiVarA.c(f);
        kuiVarA.h(3);
        kuiVarA.d(j);
        kuiVarA.b(j2);
        kuiVarA.f(i);
        return kuiVarA.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kuj) {
            kuj kujVar = (kuj) obj;
            if (Float.floatToIntBits(this.b) == Float.floatToIntBits(kujVar.b) && this.c == kujVar.c && this.d == kujVar.d && this.e == kujVar.e && this.f == kujVar.f && this.g == kujVar.g && this.h == kujVar.h) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.c == 2;
    }

    public final boolean g() {
        return this.c != 4;
    }

    public final boolean h() {
        return this.c == 3;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.b) ^ 1000003;
        long j = this.e;
        long j2 = j ^ (j >>> 32);
        long j3 = this.d;
        return (((((((((((iFloatToIntBits * 1000003) ^ this.c) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) j2)) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h;
    }

    public final boolean i() {
        return this.c == 1;
    }

    public final boolean j() {
        return this.c == 5;
    }

    public final boolean k() {
        return this.c == 0;
    }

    public final String toString() {
        return "DownloadStatus{downloadFraction=" + this.b + ", state=" + this.c + ", downloadSize=" + this.d + ", bytesDownloaded=" + this.e + ", drmErrorCode=" + this.f + ", reason=" + this.g + ", pinningStatus=" + this.h + "}";
    }

    public kuj(float f, int i, long j, long j2, int i2, int i3, int i4) {
        this.b = f;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }
}
