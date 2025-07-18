package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qrf implements qri {
    private final ahtq a;
    private final boolean b;
    private final Instant c;

    public qrf(ahtq ahtqVar, boolean z, Instant instant) {
        this.a = ahtqVar;
        this.b = z;
        this.c = instant;
    }

    @Override // defpackage.qri
    public final long a() {
        int iA;
        ahtq ahtqVar = this.a;
        int i = ahtqVar.memoizedSerializedSize;
        if ((i & Integer.MIN_VALUE) != 0) {
            iA = abza.a.a(ahtqVar.getClass()).a(ahtqVar);
            if (iA < 0) {
                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
            }
        } else {
            int iA2 = i & Integer.MAX_VALUE;
            if (iA2 == Integer.MAX_VALUE) {
                iA2 = abza.a.a(ahtqVar.getClass()).a(ahtqVar);
                if (iA2 < 0) {
                    throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                }
                ahtqVar.memoizedSerializedSize = (Integer.MIN_VALUE & ahtqVar.memoizedSerializedSize) | iA2;
            }
            iA = iA2;
        }
        return iA;
    }

    @Override // defpackage.qri
    public final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        qrf qrfVar = (qrf) obj;
        boolean z = qrfVar.b;
        boolean z2 = this.b;
        return z2 != z ? !z2 ? 1 : -1 : qrfVar.c.compareTo(this.c);
    }
}
