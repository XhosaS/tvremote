package com.google.common.collect;

import com.google.common.collect.ImmutableRangeMap;
import defpackage.yfw;
import defpackage.yih;
import defpackage.yiv;
import defpackage.ymw;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RangeMapExtensionsKt {

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.RangeMapExtensionsKt$toMutableRangeMap$5, reason: invalid class name */
    final class AnonymousClass5<K extends Comparable<? super K>, V> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass5(yih<? super AnonymousClass5> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RangeMapExtensionsKt.flowOfPairsToMutableRangeMap(null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.RangeMapExtensionsKt$toMutableRangeMap$7, reason: invalid class name */
    final class AnonymousClass7<K extends Comparable<? super K>, V> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass7(yih<? super AnonymousClass7> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RangeMapExtensionsKt.flowOfEntriesToMutableRangeMap(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object flowOfEntriesToImmutableRangeMapAcceptingOverlap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapAcceptingOverlap$2
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapAcceptingOverlap$2 r0 = (com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapAcceptingOverlap$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapAcceptingOverlap$2 r0 = new com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapAcceptingOverlap$2
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.ybn.f(r5)
            r0.label = r3
            java.lang.Object r5 = flowOfEntriesToMutableRangeMap(r4, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            com.google.common.collect.RangeMap r5 = (com.google.common.collect.RangeMap) r5
            com.google.common.collect.ImmutableRangeMap r4 = toImmutableRangeMap(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RangeMapExtensionsKt.flowOfEntriesToImmutableRangeMapAcceptingOverlap(ysx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object flowOfEntriesToImmutableRangeMapThrowingOnOverlap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$7
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$7 r0 = (com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$7) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$7 r0 = new com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$7
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableRangeMap$Builder r4 = (com.google.common.collect.ImmutableRangeMap.Builder) r4
            defpackage.ybn.f(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableRangeMap$Builder r5 = com.google.common.collect.ImmutableRangeMap.builder()
            com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$8 r2 = new com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$8
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L4f
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableRangeMap r4 = r4.build()
            return r4
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RangeMapExtensionsKt.flowOfEntriesToImmutableRangeMapThrowingOnOverlap(ysx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object flowOfEntriesToMutableRangeMap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.RangeMapExtensionsKt.AnonymousClass7
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.RangeMapExtensionsKt$toMutableRangeMap$7 r0 = (com.google.common.collect.RangeMapExtensionsKt.AnonymousClass7) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.RangeMapExtensionsKt$toMutableRangeMap$7 r0 = new com.google.common.collect.RangeMapExtensionsKt$toMutableRangeMap$7
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.TreeRangeMap r4 = (com.google.common.collect.TreeRangeMap) r4
            defpackage.ybn.f(r5)
            return r4
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.TreeRangeMap r5 = com.google.common.collect.TreeRangeMap.create()
            com.google.common.collect.RangeMapExtensionsKt$toMutableRangeMap$8 r2 = new com.google.common.collect.RangeMapExtensionsKt$toMutableRangeMap$8
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L4a
            return r5
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RangeMapExtensionsKt.flowOfEntriesToMutableRangeMap(ysx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object flowOfPairsToImmutableRangeMapAcceptingOverlap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapAcceptingOverlap$1
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapAcceptingOverlap$1 r0 = (com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapAcceptingOverlap$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapAcceptingOverlap$1 r0 = new com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapAcceptingOverlap$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.ybn.f(r5)
            r0.label = r3
            java.lang.Object r5 = flowOfPairsToMutableRangeMap(r4, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            com.google.common.collect.RangeMap r5 = (com.google.common.collect.RangeMap) r5
            com.google.common.collect.ImmutableRangeMap r4 = toImmutableRangeMap(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RangeMapExtensionsKt.flowOfPairsToImmutableRangeMapAcceptingOverlap(ysx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object flowOfPairsToImmutableRangeMapThrowingOnOverlap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$5
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$5 r0 = (com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$5 r0 = new com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$5
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableRangeMap$Builder r4 = (com.google.common.collect.ImmutableRangeMap.Builder) r4
            defpackage.ybn.f(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableRangeMap$Builder r5 = com.google.common.collect.ImmutableRangeMap.builder()
            com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$6 r2 = new com.google.common.collect.RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$6
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L4f
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableRangeMap r4 = r4.build()
            return r4
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RangeMapExtensionsKt.flowOfPairsToImmutableRangeMapThrowingOnOverlap(ysx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object flowOfPairsToMutableRangeMap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.RangeMapExtensionsKt.AnonymousClass5
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.RangeMapExtensionsKt$toMutableRangeMap$5 r0 = (com.google.common.collect.RangeMapExtensionsKt.AnonymousClass5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.RangeMapExtensionsKt$toMutableRangeMap$5 r0 = new com.google.common.collect.RangeMapExtensionsKt$toMutableRangeMap$5
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.TreeRangeMap r4 = (com.google.common.collect.TreeRangeMap) r4
            defpackage.ybn.f(r5)
            return r4
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.TreeRangeMap r5 = com.google.common.collect.TreeRangeMap.create()
            com.google.common.collect.RangeMapExtensionsKt$toMutableRangeMap$6 r2 = new com.google.common.collect.RangeMapExtensionsKt$toMutableRangeMap$6
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L4a
            return r5
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RangeMapExtensionsKt.flowOfPairsToMutableRangeMap(ysx, yih):java.lang.Object");
    }

    public static final /* synthetic */ ImmutableRangeMap iterableOfEntriesToImmutableRangeMapAcceptingOverlap(Iterable iterable) {
        iterable.getClass();
        return toImmutableRangeMap(iterableOfEntriesToMutableRangeMap(iterable));
    }

    public static final /* synthetic */ ImmutableRangeMap iterableOfEntriesToImmutableRangeMapThrowingOnOverlap(Iterable iterable) {
        iterable.getClass();
        ImmutableRangeMap.Builder builder = ImmutableRangeMap.builder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.put((Range) entry.getKey(), entry.getValue());
        }
        return builder.build();
    }

    public static final /* synthetic */ RangeMap iterableOfEntriesToMutableRangeMap(Iterable iterable) {
        iterable.getClass();
        TreeRangeMap treeRangeMapCreate = TreeRangeMap.create();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            treeRangeMapCreate.put((Range) entry.getKey(), entry.getValue());
        }
        return treeRangeMapCreate;
    }

    public static final /* synthetic */ ImmutableRangeMap iterableOfPairsToImmutableRangeMapAcceptingOverlap(Iterable iterable) {
        iterable.getClass();
        return toImmutableRangeMap(iterableOfPairsToMutableRangeMap(iterable));
    }

    public static final /* synthetic */ ImmutableRangeMap iterableOfPairsToImmutableRangeMapThrowingOnOverlap(Iterable iterable) {
        iterable.getClass();
        ImmutableRangeMap.Builder builder = ImmutableRangeMap.builder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yfw yfwVar = (yfw) it.next();
            builder.put((Range) yfwVar.a, yfwVar.b);
        }
        return builder.build();
    }

    public static final /* synthetic */ RangeMap iterableOfPairsToMutableRangeMap(Iterable iterable) {
        iterable.getClass();
        TreeRangeMap treeRangeMapCreate = TreeRangeMap.create();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yfw yfwVar = (yfw) it.next();
            treeRangeMapCreate.put((Range) yfwVar.a, yfwVar.b);
        }
        return treeRangeMapCreate;
    }

    public static final /* synthetic */ ImmutableRangeMap sequenceOfEntriesToImmutableRangeMapAcceptingOverlap(ymw ymwVar) {
        ymwVar.getClass();
        return toImmutableRangeMap(sequenceOfEntriesToMutableRangeMap(ymwVar));
    }

    public static final /* synthetic */ ImmutableRangeMap sequenceOfEntriesToImmutableRangeMapThrowingOnOverlap(ymw ymwVar) {
        ymwVar.getClass();
        ImmutableRangeMap.Builder builder = ImmutableRangeMap.builder();
        Iterator itA = ymwVar.a();
        while (itA.hasNext()) {
            Map.Entry entry = (Map.Entry) itA.next();
            builder.put((Range) entry.getKey(), entry.getValue());
        }
        return builder.build();
    }

    public static final /* synthetic */ RangeMap sequenceOfEntriesToMutableRangeMap(ymw ymwVar) {
        ymwVar.getClass();
        TreeRangeMap treeRangeMapCreate = TreeRangeMap.create();
        Iterator itA = ymwVar.a();
        while (itA.hasNext()) {
            Map.Entry entry = (Map.Entry) itA.next();
            treeRangeMapCreate.put((Range) entry.getKey(), entry.getValue());
        }
        return treeRangeMapCreate;
    }

    public static final /* synthetic */ ImmutableRangeMap sequenceOfPairsToImmutableRangeMapAcceptingOverlap(ymw ymwVar) {
        ymwVar.getClass();
        return toImmutableRangeMap(sequenceOfPairsToMutableRangeMap(ymwVar));
    }

    public static final /* synthetic */ ImmutableRangeMap sequenceOfPairsToImmutableRangeMapThrowingOnOverlap(ymw ymwVar) {
        ymwVar.getClass();
        ImmutableRangeMap.Builder builder = ImmutableRangeMap.builder();
        Iterator itA = ymwVar.a();
        while (itA.hasNext()) {
            yfw yfwVar = (yfw) itA.next();
            builder.put((Range) yfwVar.a, yfwVar.b);
        }
        return builder.build();
    }

    public static final /* synthetic */ RangeMap sequenceOfPairsToMutableRangeMap(ymw ymwVar) {
        ymwVar.getClass();
        TreeRangeMap treeRangeMapCreate = TreeRangeMap.create();
        Iterator itA = ymwVar.a();
        while (itA.hasNext()) {
            yfw yfwVar = (yfw) itA.next();
            treeRangeMapCreate.put((Range) yfwVar.a, yfwVar.b);
        }
        return treeRangeMapCreate;
    }

    public static final /* synthetic */ ImmutableRangeMap toImmutableRangeMap(RangeMap rangeMap) {
        rangeMap.getClass();
        ImmutableRangeMap immutableRangeMapCopyOf = ImmutableRangeMap.copyOf(rangeMap);
        immutableRangeMapCopyOf.getClass();
        return immutableRangeMapCopyOf;
    }

    public static final /* synthetic */ RangeMap toMutableRangeMap(RangeMap rangeMap) {
        rangeMap.getClass();
        return TreeRangeMap.copyOf(rangeMap);
    }
}
