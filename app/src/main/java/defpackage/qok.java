package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qok {
    public final qku a;
    public final String b;
    public final int c;
    private final qlz d;

    public qok(qlz qlzVar, int i, qku qkuVar, String str) {
        this.d = qlzVar;
        this.a = qkuVar;
        this.c = i;
        this.b = str;
    }

    public final zyd a(boolean z, String str, int i) {
        long epochMilli = Instant.now().toEpochMilli();
        zyd zydVarE = z ? this.d.e(str, i) : this.d.f(str, i);
        zxn.p(zydVarE, wyo.f(new qoj(this, i, z, epochMilli)), zwk.a);
        return zydVarE;
    }
}
