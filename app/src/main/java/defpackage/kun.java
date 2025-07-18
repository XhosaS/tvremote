package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class kun {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;

    public kun(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        kkk.h(str);
        kkk.h(str2);
        kkk.a(j >= 0);
        kkk.a(j2 >= 0);
        kkk.a(j3 >= 0);
        kkk.a(j5 >= 0);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    final kun a(Long l, Long l2, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new kun(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, bool);
    }

    final kun b(long j, long j2) {
        return new kun(this.a, this.b, this.c, this.d, this.e, this.f, j, Long.valueOf(j2), this.i, this.j, this.k);
    }

    final kun c(long j) {
        return new kun(this.a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }
}
