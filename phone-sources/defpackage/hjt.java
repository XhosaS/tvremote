package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hjt {
    public hjt() {
    }

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    public static idf b(ieh iehVar, idf idfVar) {
        return new ieo(iehVar, new iep(idfVar));
    }

    @SafeVarargs
    public static idw c(idw... idwVarArr) {
        icx icxVar = icz.b;
        icx icxVar2 = icz.c;
        idw idwVar = null;
        int i = 0;
        for (idw idwVar2 : idwVarArr) {
            if (idwVar2 == icxVar2) {
                return icxVar2;
            }
            if (idwVar2 != icxVar) {
                i++;
                idwVar = idwVar2;
            }
        }
        return i == 0 ? icxVar : i != 1 ? new idx((idw[]) idwVarArr.clone()) : idwVar;
    }

    public static ids d(ids... idsVarArr) {
        return e(0, idsVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ids e(int r9, defpackage.ids... r10) {
        /*
            int r0 = r10.length
            r1 = 0
            if (r0 != 0) goto Lc
            idu r10 = new idu
            ids[] r0 = new defpackage.ids[r1]
            r10.<init>(r9, r0)
            return r10
        Lc:
            r2 = 1
            if (r0 != r2) goto L2e
            r10 = r10[r1]
            boolean r0 = r10 instanceof defpackage.idu
            if (r0 == 0) goto L24
            r0 = r10
            idu r0 = (defpackage.idu) r0
            int r3 = r0.c
            if (r3 != 0) goto L24
            idu r10 = new idu
            ids[] r0 = r0.g
            r10.<init>(r9, r0)
            return r10
        L24:
            idu r0 = new idu
            ids[] r2 = new defpackage.ids[r2]
            r2[r1] = r10
            r0.<init>(r9, r2)
            return r0
        L2e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = r1
        L34:
            if (r3 >= r0) goto L63
            r4 = r10[r3]
            boolean r5 = r4 instanceof defpackage.idu
            if (r5 == 0) goto L57
            r5 = r4
            idu r5 = (defpackage.idu) r5
            int r6 = r5.c
            if (r6 != 0) goto L57
            ids[] r4 = r5.g
            int r5 = r4.length
            r6 = r1
        L47:
            if (r6 >= r5) goto L60
            r7 = r4[r6]
            boolean r8 = r2.contains(r7)
            if (r8 != 0) goto L54
            r2.add(r7)
        L54:
            int r6 = r6 + 1
            goto L47
        L57:
            boolean r5 = r2.contains(r4)
            if (r5 != 0) goto L60
            r2.add(r4)
        L60:
            int r3 = r3 + 1
            goto L34
        L63:
            idu r10 = new idu
            int r0 = r2.size()
            ids[] r0 = new defpackage.ids[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            ids[] r0 = (defpackage.ids[]) r0
            r10.<init>(r9, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjt.e(int, ids[]):ids");
    }

    public static ids f(idb idbVar, ids... idsVarArr) {
        return new idv(d(idsVarArr), idbVar);
    }

    public static idb g(idb... idbVarArr) {
        return h(idbVarArr, icz.b, icz.c);
    }

    public static idb h(idb[] idbVarArr, idb idbVar, idb idbVar2) {
        idb idbVar3 = null;
        int i = 0;
        for (idb idbVar4 : idbVarArr) {
            if (idbVar4 == idbVar2) {
                return idbVar2;
            }
            if (idbVar4 != idbVar) {
                i++;
                idbVar3 = idbVar4;
            }
        }
        return i == 0 ? idbVar : i == 1 ? idbVar3 : new idc((idb[]) idbVarArr.clone(), ((icx) idbVar2).a);
    }

    public static idb i(idb idbVar) {
        if (idbVar instanceof idd) {
            return ((idd) idbVar).a;
        }
        icx icxVar = icz.b;
        return idbVar == icxVar ? icz.c : idbVar == icz.c ? icxVar : new idd(idbVar);
    }

    public static idb j(boolean z) {
        return z ? icz.b : icz.c;
    }

    public hjt(short[] sArr, byte[] bArr) {
    }
}
