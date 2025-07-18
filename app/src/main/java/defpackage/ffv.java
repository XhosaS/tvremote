package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffv extends agtu implements agvb {
    int a;
    final /* synthetic */ ffx b;
    final /* synthetic */ Bundle c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffv(ffx ffxVar, Bundle bundle, agsw agswVar) {
        super(2, agswVar);
        this.b = ffxVar;
        this.c = bundle;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ffv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r7.a
            defpackage.agpl.b(r8)
            if (r1 == 0) goto La
            goto L5f
        La:
            ffx r8 = r7.b
            android.os.Bundle r1 = r7.c
            r1.getClass()
            r2 = 1
            r7.a = r2
            java.lang.String r2 = "kids_mode_account_list"
            java.util.ArrayList r2 = r1.getStringArrayList(r2)
            if (r2 == 0) goto L5a
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
            r2.getClass()
        L28:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "parent_allowed_kids_mode_packages:"
            java.lang.String r5 = r6.concat(r5)
            java.util.ArrayList r5 = r1.getStringArrayList(r5)
            if (r5 != 0) goto L46
            agrd r5 = defpackage.agrd.a
        L46:
            r3.put(r4, r5)
            goto L28
        L4a:
            fga r8 = r8.a
            agow r8 = r8.k
            java.lang.Object r8 = r8.a()
            fth r8 = (defpackage.fth) r8
            java.lang.Object r8 = r8.c(r3, r7)
            if (r8 == r0) goto L5c
        L5a:
            agpu r8 = defpackage.agpu.a
        L5c:
            if (r8 != r0) goto L5f
            return r0
        L5f:
            agpu r8 = defpackage.agpu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ffv(this.b, this.c, agswVar);
    }
}
