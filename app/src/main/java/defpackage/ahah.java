package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahah {
    public static final Object a(Collection collection, agsw agswVar) {
        if (collection.isEmpty()) {
            return agrd.a;
        }
        ahaf ahafVar = new ahaf((ahcb[]) collection.toArray(new ahcb[0]));
        ahar aharVar = new ahar(agth.c(agswVar), 1);
        aharVar.z();
        ahcb[] ahcbVarArr = ahafVar.a;
        int length = ahcbVarArr.length;
        ahad[] ahadVarArr = new ahad[length];
        for (int i = 0; i < length; i++) {
            ahcb ahcbVar = ahcbVarArr[i];
            ahcbVar.x();
            ahad ahadVar = new ahad(ahafVar, aharVar);
            ahadVar.a = ahdp.b(ahcbVar, true, ahadVar);
            ahadVarArr[i] = ahadVar;
        }
        ahae ahaeVar = new ahae(ahadVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            ahadVarArr[i2].b.c(ahaeVar);
        }
        if (aharVar.g()) {
            ahaeVar.a();
        } else {
            aharVar.B(ahaeVar);
        }
        return aharVar.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.util.Collection r4, defpackage.agsw r5) {
        /*
            boolean r0 = r5 instanceof defpackage.ahag
            if (r0 == 0) goto L13
            r0 = r5
            ahag r0 = (defpackage.ahag) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahag r0 = new ahag
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r4 = r0.a
            defpackage.agpl.b(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.agpl.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            ahdl r5 = (defpackage.ahdl) r5
            r0.a = r4
            r0.c = r3
            java.lang.Object r5 = r5.fz(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            agpu r4 = defpackage.agpu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahah.b(java.util.Collection, agsw):java.lang.Object");
    }
}
