package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qom {
    public final qku a;
    public final String b;
    public final int c;
    private final qlz d;

    public qom(qlz qlzVar, int i, qku qkuVar, String str) {
        this.d = qlzVar;
        this.a = qkuVar;
        this.c = i;
        this.b = str;
    }

    public final zyd a(boolean z) {
        long epochMilli = Instant.now().toEpochMilli();
        zyd zydVarA = z ? this.d.a() : this.d.b();
        zxn.p(zydVarA, wyo.f(new qol(this, z, epochMilli)), zwk.a);
        return zydVarA;
    }
}
