package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qrh implements qri {
    private final ahwl a;
    private final boolean b;
    private final Instant c;

    public qrh(ahwl ahwlVar, boolean z, Instant instant) {
        this.a = ahwlVar;
        this.b = z;
        this.c = instant;
    }

    @Override // defpackage.qri
    public final long a() {
        int iA;
        ahwl ahwlVar = this.a;
        int i = ahwlVar.memoizedSerializedSize;
        if ((i & Integer.MIN_VALUE) != 0) {
            iA = abza.a.a(ahwlVar.getClass()).a(ahwlVar);
            if (iA < 0) {
                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
            }
        } else {
            int iA2 = i & Integer.MAX_VALUE;
            if (iA2 == Integer.MAX_VALUE) {
                iA2 = abza.a.a(ahwlVar.getClass()).a(ahwlVar);
                if (iA2 < 0) {
                    throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                }
                ahwlVar.memoizedSerializedSize = (Integer.MIN_VALUE & ahwlVar.memoizedSerializedSize) | iA2;
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
        qrh qrhVar = (qrh) obj;
        boolean z = qrhVar.b;
        boolean z2 = this.b;
        return z2 != z ? !z2 ? 1 : -1 : qrhVar.c.compareTo(this.c);
    }
}
