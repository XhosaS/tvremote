package defpackage;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.AutoValue_AccountId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vik extends vha {
    public final vhg a;
    private final AccountId b;
    private final int c;

    public vik(AccountId accountId, vhg vhgVar, int i) {
        this.b = accountId;
        if (vhgVar == null) {
            throw new NullPointerException("Null info");
        }
        this.a = vhgVar;
        this.c = i;
    }

    @Override // defpackage.vha
    public final AccountId a() {
        return this.b;
    }

    @Override // defpackage.vha
    public final vhg b() {
        return this.a;
    }

    @Override // defpackage.vha
    public final int c() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
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
            boolean r1 = r7 instanceof defpackage.vha
            r2 = 0
            if (r1 == 0) goto L44
            vha r7 = (defpackage.vha) r7
            com.google.apps.tiktok.account.AccountId r1 = r6.b
            com.google.apps.tiktok.account.AccountId r3 = r7.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            vhg r1 = r6.a
            vhg r3 = r7.b()
            if (r1 != r3) goto L20
            goto L3b
        L20:
            java.lang.Class r4 = r1.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 == r5) goto L2b
            goto L44
        L2b:
            java.lang.Class r4 = r1.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r1 = r4.k(r1, r3)
            if (r1 == 0) goto L44
        L3b:
            int r1 = r6.c
            int r7 = r7.c()
            if (r1 != r7) goto L44
            return r0
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vik.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iB;
        vhg vhgVar = this.a;
        if ((vhgVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(vhgVar.getClass()).b(vhgVar);
        } else {
            int iB2 = vhgVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(vhgVar.getClass()).b(vhgVar);
                vhgVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return ((iB ^ (((AutoValue_AccountId) this.b).a * 1000003)) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.c;
        return "Account{id=" + this.b.toString() + ", info=" + this.a.toString() + ", state=" + Integer.toString(i - 1) + "}";
    }
}
