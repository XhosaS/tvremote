package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pbh extends pbj {
    public final String a;
    public final MessageLite b;
    public final zlv c;
    public final Integer d;
    public final aece e;
    public final int[] f;
    public final int[] g;

    public pbh(String str, MessageLite messageLite, zlv zlvVar, Integer num, aece aeceVar, int[] iArr, int[] iArr2) {
        this.a = str;
        this.b = messageLite;
        this.c = zlvVar;
        this.d = num;
        this.e = aeceVar;
        this.f = iArr;
        this.g = iArr2;
    }

    @Override // defpackage.pbj
    public final zlv a() {
        return this.c;
    }

    @Override // defpackage.pbj
    public final MessageLite b() {
        return this.b;
    }

    @Override // defpackage.pbj
    public final aece c() {
        return this.e;
    }

    @Override // defpackage.pbj
    public final Integer d() {
        return this.d;
    }

    @Override // defpackage.pbj
    public final String e() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
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
            boolean r1 = r7 instanceof defpackage.pbj
            r2 = 0
            if (r1 == 0) goto La9
            pbj r7 = (defpackage.pbj) r7
            java.lang.String r1 = r6.a
            java.lang.String r3 = r7.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La9
            com.google.protobuf.MessageLite r1 = r6.b
            com.google.protobuf.MessageLite r3 = r7.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La9
            zlv r1 = r6.c
            if (r1 != 0) goto L2e
            zlv r1 = r7.a()
            if (r1 != 0) goto La9
            goto L50
        L2e:
            zlv r3 = r7.a()
            if (r1 == r3) goto L50
            if (r3 == 0) goto La9
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 != r5) goto La9
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto La9
        L50:
            java.lang.Integer r1 = r6.d
            if (r1 != 0) goto L5b
            java.lang.Integer r1 = r7.d()
            if (r1 != 0) goto La9
            goto L66
        L5b:
            java.lang.Integer r3 = r7.d()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L66
            goto La9
        L66:
            r7.i()
            r7.h()
            aece r1 = r6.e
            aece r3 = r7.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La9
            r7.k()
            int[] r1 = r6.f
            boolean r3 = r7 instanceof defpackage.pbh
            if (r3 == 0) goto L87
            r4 = r7
            pbh r4 = (defpackage.pbh) r4
            int[] r4 = r4.f
            goto L8b
        L87:
            int[] r4 = r7.f()
        L8b:
            boolean r1 = java.util.Arrays.equals(r1, r4)
            if (r1 == 0) goto La9
            int[] r1 = r6.g
            if (r3 == 0) goto L9b
            r3 = r7
            pbh r3 = (defpackage.pbh) r3
            int[] r3 = r3.g
            goto L9f
        L9b:
            int[] r3 = r7.g()
        L9f:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto La9
            r7.j()
            return r0
        La9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbh.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.pbj
    public final int[] f() {
        return this.f;
    }

    @Override // defpackage.pbj
    public final int[] g() {
        return this.g;
    }

    public final int hashCode() {
        int iB;
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        zlv zlvVar = this.c;
        if (zlvVar == null) {
            iB = 0;
        } else if ((zlvVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(zlvVar.getClass()).b(zlvVar);
        } else {
            int iB2 = zlvVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(zlvVar.getClass()).b(zlvVar);
                zlvVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        int i = ((iHashCode * 1000003) ^ iB) * 1000003;
        Integer num = this.d;
        return (((((((i ^ (num != null ? num.hashCode() : 0)) * 583896283) ^ this.e.hashCode()) * (-721379959)) ^ Arrays.hashCode(this.f)) * 1000003) ^ Arrays.hashCode(this.g)) * 1000003;
    }

    public final String toString() {
        int[] iArr = this.f;
        int i = this.e.f;
        return "ClearcutData{logSource=" + this.a + ", message=" + this.b.toString() + ", visualElements=" + String.valueOf(this.c) + ", eventCode=" + this.d + ", wallTime=null, elapsedTime=null, qosTier=" + Integer.toString(i) + ", logVerifier=null, experimentIds=" + Arrays.toString(iArr) + ", testCodes=" + Arrays.toString(this.g) + ", complianceProductData=null}";
    }

    @Override // defpackage.pbj
    public final void h() {
    }

    @Override // defpackage.pbj
    public final void i() {
    }

    @Override // defpackage.pbj
    public final void j() {
    }

    @Override // defpackage.pbj
    public final void k() {
    }
}
