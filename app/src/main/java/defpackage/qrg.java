package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qrg implements qri {
    private final ahwf a;
    private final Comparable b;

    public qrg(ahwf ahwfVar, Comparable comparable) {
        this.a = ahwfVar;
        this.b = comparable;
    }

    @Override // defpackage.qri
    public final long a() {
        int iA;
        ahwf ahwfVar = this.a;
        int i = ahwfVar.memoizedSerializedSize;
        if ((i & Integer.MIN_VALUE) != 0) {
            iA = abza.a.a(ahwfVar.getClass()).a(ahwfVar);
            if (iA < 0) {
                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
            }
        } else {
            int iA2 = i & Integer.MAX_VALUE;
            if (iA2 == Integer.MAX_VALUE) {
                iA2 = abza.a.a(ahwfVar.getClass()).a(ahwfVar);
                if (iA2 < 0) {
                    throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                }
                ahwfVar.memoizedSerializedSize = (Integer.MIN_VALUE & ahwfVar.memoizedSerializedSize) | iA2;
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
        return this.b.compareTo(((qrg) obj).b);
    }
}
