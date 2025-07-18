package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekl {
    public final long a;
    public final eay b;
    public final int c;
    public final evz d;
    public final long e;
    public final eay f;
    public final int g;
    public final evz h;
    public final long i;
    public final long j;

    public ekl(long j, eay eayVar, int i, evz evzVar, long j2, eay eayVar2, int i2, evz evzVar2, long j3, long j4) {
        this.a = j;
        this.b = eayVar;
        this.c = i;
        this.d = evzVar;
        this.e = j2;
        this.f = eayVar2;
        this.g = i2;
        this.h = evzVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ekl eklVar = (ekl) obj;
            if (this.a == eklVar.a && this.c == eklVar.c && this.e == eklVar.e && this.g == eklVar.g && this.i == eklVar.i && this.j == eklVar.j && Objects.equals(this.b, eklVar.b) && Objects.equals(this.d, eklVar.d) && Objects.equals(this.f, eklVar.f) && Objects.equals(this.h, eklVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
