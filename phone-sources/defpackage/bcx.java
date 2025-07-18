package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bcx extends yiz implements yka {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    Object h;
    int i;
    /* synthetic */ Object j;
    final /* synthetic */ bcy k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcx(bcy bcyVar, yih yihVar) {
        super(3, yihVar);
        this.k = bcyVar;
    }

    public static final void b(List list, bcy bcyVar) {
        list.clear();
        synchronized (bcyVar.c) {
            List list2 = bcyVar.g;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((bca) list2.get(i));
            }
            list2.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.bcy r22, java.util.List r23, java.util.List r24, java.util.List r25, defpackage.kk r26, defpackage.kk r27, defpackage.kk r28, defpackage.kk r29) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcx.c(bcy, java.util.List, java.util.List, java.util.List, kk, kk, kk, kk):void");
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bcx bcxVar = new bcx(this.k, (yih) obj3);
        bcxVar.j = (bby) obj2;
        return bcxVar.invokeSuspend(ygi.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0089 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023d A[Catch: all -> 0x02c5, LOOP:0: B:78:0x023b->B:79:0x023d, LOOP_END, TryCatch #1 {all -> 0x02c5, blocks: (B:77:0x0217, B:79:0x023d, B:80:0x0252, B:51:0x0168, B:53:0x017f, B:54:0x0184, B:56:0x018d, B:58:0x0197, B:60:0x01a2, B:70:0x01f3, B:63:0x01ae, B:65:0x01bf, B:66:0x01c2, B:67:0x01da, B:76:0x020b, B:81:0x0258), top: B:114:0x0217 }] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x02cc -> B:9:0x0082). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0123 -> B:39:0x0129). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
