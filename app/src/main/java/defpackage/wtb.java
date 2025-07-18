package defpackage;

import android.util.SparseArray;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wtb extends wyv {
    public final String a;
    public final UUID b;
    public final wyr c;
    public final SparseArray d;
    public final int e;

    public wtb(String str, UUID uuid, wyr wyrVar, SparseArray sparseArray, int i) {
        this.a = str;
        this.b = uuid;
        this.c = wyrVar;
        this.d = sparseArray;
        this.e = i;
    }

    @Override // defpackage.wyv
    public final int a() {
        return this.e;
    }

    @Override // defpackage.wyv
    public final SparseArray b() {
        return this.d;
    }

    @Override // defpackage.wyv
    public final wyr c() {
        return this.c;
    }

    @Override // defpackage.wyv
    public final String d() {
        return this.a;
    }

    @Override // defpackage.wyv
    public final UUID e() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.wyv
            r2 = 0
            if (r1 == 0) goto L5c
            wyv r7 = (defpackage.wyv) r7
            java.lang.String r1 = r6.a
            java.lang.String r3 = r7.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5c
            java.util.UUID r1 = r6.b
            java.util.UUID r3 = r7.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5c
            wyr r1 = r6.c
            wyr r3 = r7.c()
            if (r1 != r3) goto L2c
            goto L47
        L2c:
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 == r5) goto L37
            goto L5c
        L37:
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto L5c
        L47:
            android.util.SparseArray r1 = r6.d
            android.util.SparseArray r3 = r7.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5c
            int r1 = r6.e
            int r7 = r7.a()
            if (r1 != r7) goto L5c
            return r0
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iB;
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        wyr wyrVar = this.c;
        if ((wyrVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(wyrVar.getClass()).b(wyrVar);
        } else {
            int iB2 = wyrVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(wyrVar.getClass()).b(wyrVar);
                wyrVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return (((((iHashCode * 1000003) ^ iB) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        SparseArray sparseArray = this.d;
        wyr wyrVar = this.c;
        return "TraceSnapshot{name=" + this.a + ", rootTraceId=" + this.b.toString() + ", record=" + wyrVar.toString() + ", spanExtrasSparseArray=" + sparseArray.toString() + ", numUnfinishedSpans=" + this.e + "}";
    }
}
