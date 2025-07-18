package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsv {
    public final fpg a;

    public fsv(fpg fpgVar) {
        fpgVar.getClass();
        this.a = fpgVar;
    }

    public final Object a(agsw agswVar) {
        Object objB = this.a.b(new agux() { // from class: fss
            @Override // defpackage.agux
            public final Object a(Object obj) {
                fxg fxgVar = (fxg) obj;
                fxgVar.getClass();
                Collection collectionValues = DesugarCollections.unmodifiableMap(fxgVar.b).values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    return fxgVar;
                }
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    fwi fwiVar = ((fxe) it.next()).i;
                    if (fwiVar == null) {
                        fwiVar = fwi.a;
                    }
                    if (fwiVar.c) {
                        fxc fxcVar = new fxc();
                        fxcVar.B(fxgVar);
                        for (Map.Entry entry : DesugarCollections.unmodifiableMap(fxgVar.b).entrySet()) {
                            String str = (String) entry.getKey();
                            fxe fxeVar = (fxe) entry.getValue();
                            fxh.b(fxcVar);
                            str.getClass();
                            fxeVar.getClass();
                            fxd fxdVar = new fxd();
                            fxdVar.B(fxeVar);
                            fwi fwiVarD = fxi.d(fxdVar);
                            fwh fwhVar = new fwh();
                            fwhVar.B(fwiVarD);
                            if ((fwhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                fwhVar.y();
                            }
                            ((fwi) fwhVar.b).c = false;
                            fwi fwiVarA = fwj.a(fwhVar);
                            if ((fxdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                fxdVar.y();
                            }
                            fxe fxeVar2 = (fxe) fxdVar.b;
                            fxeVar2.i = fwiVarA;
                            fxeVar2.b |= 16;
                            fxh.f(str, fxi.h(fxdVar), fxcVar);
                        }
                        return fxh.a(fxcVar);
                    }
                }
                return fxgVar;
            }
        }, agswVar);
        return objB == agtg.a ? objB : agpu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r5, defpackage.agsw r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fst
            if (r0 == 0) goto L13
            r0 = r6
            fst r0 = (defpackage.fst) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fst r0 = new fst
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.agpl.b(r6)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.agpl.b(r6)
            fpg r6 = r4.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L60
        L40:
            fxg r6 = (defpackage.fxg) r6
            abyl r6 = r6.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            java.lang.Object r5 = r6.get(r5)
            fxe r5 = (defpackage.fxe) r5
            r6 = 0
            if (r5 == 0) goto L5b
            fwi r5 = r5.i
            if (r5 != 0) goto L57
            fwi r5 = defpackage.fwi.a
        L57:
            if (r5 == 0) goto L5b
            boolean r6 = r5.c
        L5b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            return r5
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsv.b(java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r5, defpackage.agsw r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fsu
            if (r0 == 0) goto L13
            r0 = r6
            fsu r0 = (defpackage.fsu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fsu r0 = new fsu
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.agpl.b(r6)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.agpl.b(r6)
            fpg r6 = r4.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L61
        L40:
            fxg r6 = (defpackage.fxg) r6
            abyl r6 = r6.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            java.lang.Object r5 = r6.get(r5)
            fxe r5 = (defpackage.fxe) r5
            if (r5 == 0) goto L5e
            fwi r5 = r5.i
            if (r5 != 0) goto L56
            fwi r5 = defpackage.fwi.a
        L56:
            if (r5 == 0) goto L5e
            java.lang.String r5 = r5.b
            if (r5 != 0) goto L5d
            goto L5e
        L5d:
            return r5
        L5e:
            java.lang.String r5 = ""
            return r5
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsv.c(java.lang.String, agsw):java.lang.Object");
    }

    public final Object d(final String str, final String str2, agsw agswVar) {
        Object objB = this.a.b(new agux() { // from class: fsr
            @Override // defpackage.agux
            public final Object a(Object obj) {
                fxg fxgVar = (fxg) obj;
                fxgVar.getClass();
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(fxgVar.b);
                String str3 = str;
                fxe fxeVar = (fxe) mapUnmodifiableMap.get(str3);
                String str4 = null;
                if (fxeVar != null) {
                    fwi fwiVar = fxeVar.i;
                    if (fwiVar == null) {
                        fwiVar = fwi.a;
                    }
                    if (fwiVar != null) {
                        str4 = fwiVar.b;
                    }
                }
                String str5 = str2;
                if (agvy.c(str4, str5)) {
                    return fxgVar;
                }
                fxc fxcVar = new fxc();
                fxcVar.B(fxgVar);
                fxh.b(fxcVar);
                Object objH = fxh.b(fxcVar).get(str3);
                if (objH == null) {
                    fxe fxeVar2 = fxe.a;
                    objH = fxi.h(new fxd());
                }
                fxd fxdVar = new fxd();
                fxdVar.B((fxe) objH);
                fwi fwiVarD = fxi.d(fxdVar);
                fwh fwhVar = new fwh();
                fwhVar.B(fwiVarD);
                fwj.b(str5, fwhVar);
                fwi fwiVarA = fwj.a(fwhVar);
                if ((fxdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    fxdVar.y();
                }
                fxe fxeVar3 = (fxe) fxdVar.b;
                fxeVar3.i = fwiVarA;
                fxeVar3.b |= 16;
                fxh.f(str3, fxi.h(fxdVar), fxcVar);
                return fxh.a(fxcVar);
            }
        }, agswVar);
        return objB == agtg.a ? objB : agpu.a;
    }
}
