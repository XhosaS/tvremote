package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uqp implements uqm {
    long a;

    uqp() {
        throw null;
    }

    @Override // defpackage.uqm
    public final aayo a() {
        aayo aayoVar = aayo.a;
        aayn aaynVar = new aayn();
        long j = this.a;
        if ((aaynVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aaynVar.y();
        }
        aayo aayoVar2 = (aayo) aaynVar.b;
        aayoVar2.b = 1;
        aayoVar2.c = Long.valueOf(j);
        return (aayo) aaynVar.v();
    }

    @Override // defpackage.uqm
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a += ((Long) obj).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uqp) && this.a == ((uqp) obj).a;
    }

    public final int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    public uqp(byte[] bArr) {
        this.a = 0L;
    }
}
