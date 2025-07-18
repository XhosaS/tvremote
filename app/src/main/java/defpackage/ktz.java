package defpackage;

import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes.dex */
class ktz {
    public final EnumMap a;

    public ktz() {
        this.a = new EnumMap(lcs.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.lcs r3, int r4) {
        /*
            r2 = this;
            kty r0 = defpackage.kty.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            kty r0 = defpackage.kty.INITIALIZATION
            goto L20
        L18:
            kty r0 = defpackage.kty.MANIFEST
            goto L20
        L1b:
            kty r0 = defpackage.kty.API
            goto L20
        L1e:
            kty r0 = defpackage.kty.TCF
        L20:
            java.util.EnumMap r4 = r2.a
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktz.a(lcs, int):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (lcs lcsVar : lcs.values()) {
            kty ktyVar = (kty) this.a.get(lcsVar);
            if (ktyVar == null) {
                ktyVar = kty.UNSET;
            }
            sb.append(ktyVar.k);
        }
        return sb.toString();
    }

    public ktz(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(lcs.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
