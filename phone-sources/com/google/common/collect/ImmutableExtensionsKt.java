package com.google.common.collect;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableTable;
import defpackage.yfm;
import defpackage.yfp;
import defpackage.yfw;
import defpackage.ygy;
import defpackage.yih;
import defpackage.yiv;
import defpackage.yjv;
import defpackage.ymw;
import defpackage.ymz;
import defpackage.ysx;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ImmutableExtensionsKt {
    private static final String WRONG_IMMUTABLE_SORTED_SET_BOUNDS = "Don't call toImmutableSortedSet() on Iterable<E> without passing a Comparator if E does not extend Comparable<E>.";

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableBiMap$1, reason: invalid class name */
    final class AnonymousClass1<K, V> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(yih<? super AnonymousClass1> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.toImmutableBiMap(null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableBiMap$3, reason: invalid class name */
    final class AnonymousClass3<K, V> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(yih<? super AnonymousClass3> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.flowOfPairsToImmutableBiMap(null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableList$1, reason: invalid class name and case insensitive filesystem */
    final class C00121<E> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00121(yih<? super C00121> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.toImmutableList(null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableListMultimap$1, reason: invalid class name and case insensitive filesystem */
    final class C00141<K, V> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00141(yih<? super C00141> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.toImmutableListMultimap(null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableListMultimap$3, reason: invalid class name and case insensitive filesystem */
    final class C00163<K, V> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00163(yih<? super C00163> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.flowOfPairsToImmutableListMultimap(null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableMap$1, reason: invalid class name and case insensitive filesystem */
    final class C00181<K, V> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00181(yih<? super C00181> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.toImmutableMap(null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableMap$3, reason: invalid class name and case insensitive filesystem */
    final class C00203<K, V> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00203(yih<? super C00203> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.flowOfPairsToImmutableMap(null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableMultiset$1, reason: invalid class name and case insensitive filesystem */
    final class C00221<E> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00221(yih<? super C00221> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.toImmutableMultiset(null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableSet$1, reason: invalid class name and case insensitive filesystem */
    final class C00241<E> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00241(yih<? super C00241> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.toImmutableSet(null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableSetMultimap$1, reason: invalid class name and case insensitive filesystem */
    final class C00261<K, V> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00261(yih<? super C00261> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.toImmutableSetMultimap(null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableSetMultimap$3, reason: invalid class name and case insensitive filesystem */
    final class C00283<K, V> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00283(yih<? super C00283> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.flowOfPairsToImmutableSetMultimap(null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$1, reason: invalid class name and case insensitive filesystem */
    final class C00301<K extends Comparable<? super K>, V> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00301(yih<? super C00301> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.toImmutableSortedMap((ysx) null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$3, reason: invalid class name and case insensitive filesystem */
    final class C00323<K, V> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00323(yih<? super C00323> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.toImmutableSortedMap(null, null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$5, reason: invalid class name */
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
            return ImmutableExtensionsKt.flowOfPairsToImmutableSortedMap(null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$7, reason: invalid class name */
    final class AnonymousClass7<K, V> extends yiv {
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
            return ImmutableExtensionsKt.flowOfPairsToImmutableSortedMap(null, null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedSet$1, reason: invalid class name and case insensitive filesystem */
    final class C00341<E extends Comparable<? super E>> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00341(yih<? super C00341> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.toImmutableSortedSet((ysx) null, this);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedSet$3, reason: invalid class name and case insensitive filesystem */
    final class C00363<E> extends yiv {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00363(yih<? super C00363> yihVar) {
            super(yihVar);
        }

        @Override // defpackage.yit
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImmutableExtensionsKt.toImmutableSortedSet(null, null, this);
        }
    }

    public static final /* synthetic */ ImmutableBiMap.Builder associateSequenceToImmutableBiMapBuilder(ymw ymwVar, ImmutableBiMap.Builder builder, yjv yjvVar) {
        ymwVar.getClass();
        builder.getClass();
        yjvVar.getClass();
        Iterator itA = ymwVar.a();
        while (itA.hasNext()) {
            Object next = itA.next();
            set(builder, next, yjvVar.a(next));
        }
        return builder;
    }

    public static final /* synthetic */ ImmutableMap.Builder associateSequenceToImmutableMapBuilder(ymw ymwVar, ImmutableMap.Builder builder, yjv yjvVar) {
        ymwVar.getClass();
        builder.getClass();
        yjvVar.getClass();
        Iterator itA = ymwVar.a();
        while (itA.hasNext()) {
            Object next = itA.next();
            set(builder, next, yjvVar.a(next));
        }
        return builder;
    }

    public static final /* synthetic */ ImmutableBiMap.Builder associateWithTo(Iterable iterable, ImmutableBiMap.Builder builder, yjv yjvVar) {
        iterable.getClass();
        builder.getClass();
        yjvVar.getClass();
        associateSequenceToImmutableBiMapBuilder(yfm.ar(iterable), builder, yjvVar);
        return builder;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object flowOfPairsToImmutableBiMap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableBiMap$3 r0 = (com.google.common.collect.ImmutableExtensionsKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableBiMap$3 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableBiMap$3
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableBiMap$Builder r4 = (com.google.common.collect.ImmutableBiMap.Builder) r4
            defpackage.ybn.f(r5)
            goto L4b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableBiMap$Builder r5 = new com.google.common.collect.ImmutableBiMap$Builder
            r5.<init>()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableBiMap$4 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableBiMap$4
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L53
            r4 = r5
        L4b:
            com.google.common.collect.ImmutableBiMap r4 = r4.buildOrThrow()
            r4.getClass()
            return r4
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.flowOfPairsToImmutableBiMap(ysx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object flowOfPairsToImmutableListMultimap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.C00163
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableListMultimap$3 r0 = (com.google.common.collect.ImmutableExtensionsKt.C00163) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableListMultimap$3 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableListMultimap$3
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableListMultimap$Builder r4 = (com.google.common.collect.ImmutableListMultimap.Builder) r4
            defpackage.ybn.f(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableListMultimap$Builder r5 = com.google.common.collect.ImmutableListMultimap.builder()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableListMultimap$4 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableListMultimap$4
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L52
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableListMultimap r4 = r4.build()
            r4.getClass()
            return r4
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.flowOfPairsToImmutableListMultimap(ysx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object flowOfPairsToImmutableMap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.C00203
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableMap$3 r0 = (com.google.common.collect.ImmutableExtensionsKt.C00203) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableMap$3 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableMap$3
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableMap$Builder r4 = (com.google.common.collect.ImmutableMap.Builder) r4
            defpackage.ybn.f(r5)
            goto L4b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableMap$Builder r5 = new com.google.common.collect.ImmutableMap$Builder
            r5.<init>()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableMap$4 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableMap$4
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L53
            r4 = r5
        L4b:
            com.google.common.collect.ImmutableMap r4 = r4.buildOrThrow()
            r4.getClass()
            return r4
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.flowOfPairsToImmutableMap(ysx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object flowOfPairsToImmutableSetMultimap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.C00283
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSetMultimap$3 r0 = (com.google.common.collect.ImmutableExtensionsKt.C00283) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSetMultimap$3 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSetMultimap$3
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableSetMultimap$Builder r4 = (com.google.common.collect.ImmutableSetMultimap.Builder) r4
            defpackage.ybn.f(r5)
            goto L4b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableSetMultimap$Builder r5 = new com.google.common.collect.ImmutableSetMultimap$Builder
            r5.<init>()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSetMultimap$4 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSetMultimap$4
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L53
            r4 = r5
        L4b:
            com.google.common.collect.ImmutableSetMultimap r4 = r4.build()
            r4.getClass()
            return r4
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.flowOfPairsToImmutableSetMultimap(ysx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object flowOfPairsToImmutableSortedMap(defpackage.ysx r4, java.util.Comparator r5, defpackage.yih r6) {
        /*
            boolean r0 = r6 instanceof com.google.common.collect.ImmutableExtensionsKt.AnonymousClass7
            if (r0 == 0) goto L13
            r0 = r6
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$7 r0 = (com.google.common.collect.ImmutableExtensionsKt.AnonymousClass7) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$7 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$7
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableSortedMap$Builder r4 = (com.google.common.collect.ImmutableSortedMap.Builder) r4
            defpackage.ybn.f(r6)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r6)
            com.google.common.collect.ImmutableSortedMap$Builder r5 = com.google.common.collect.ImmutableSortedMap.orderedBy(r5)
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$8 r6 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$8
            r6.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 == r1) goto L52
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableSortedMap r4 = r4.buildOrThrow()
            r4.getClass()
            return r4
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.flowOfPairsToImmutableSortedMap(ysx, java.util.Comparator, yih):java.lang.Object");
    }

    public static final /* synthetic */ ImmutableBiMap iterableOfPairsToImmutableBiMap(Iterable iterable) {
        iterable.getClass();
        ImmutableBiMap.Builder builder = new ImmutableBiMap.Builder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yfw yfwVar = (yfw) it.next();
            set(builder, yfwVar.a, yfwVar.b);
        }
        ImmutableBiMap immutableBiMapBuildOrThrow = builder.buildOrThrow();
        immutableBiMapBuildOrThrow.getClass();
        return immutableBiMapBuildOrThrow;
    }

    public static final /* synthetic */ ImmutableListMultimap iterableOfPairsToImmutableListMultimap(Iterable iterable) {
        iterable.getClass();
        ImmutableListMultimap.Builder builder = new ImmutableListMultimap.Builder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yfw yfwVar = (yfw) it.next();
            set(builder, yfwVar.a, yfwVar.b);
        }
        ImmutableListMultimap immutableListMultimapBuild = builder.build();
        immutableListMultimapBuild.getClass();
        return immutableListMultimapBuild;
    }

    public static final /* synthetic */ ImmutableMap iterableOfPairsToImmutableMap(Iterable iterable) {
        iterable.getClass();
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yfw yfwVar = (yfw) it.next();
            set(builder, yfwVar.a, yfwVar.b);
        }
        ImmutableMap immutableMapBuildOrThrow = builder.buildOrThrow();
        immutableMapBuildOrThrow.getClass();
        return immutableMapBuildOrThrow;
    }

    public static final /* synthetic */ ImmutableSetMultimap iterableOfPairsToImmutableSetMultimap(Iterable iterable) {
        iterable.getClass();
        ImmutableSetMultimap.Builder builder = new ImmutableSetMultimap.Builder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yfw yfwVar = (yfw) it.next();
            set(builder, yfwVar.a, yfwVar.b);
        }
        ImmutableSetMultimap immutableSetMultimapBuild = builder.build();
        immutableSetMultimapBuild.getClass();
        return immutableSetMultimapBuild;
    }

    public static final /* synthetic */ ImmutableSortedMap iterableOfPairsToImmutableSortedMap(Iterable iterable) {
        iterable.getClass();
        ImmutableSortedMap.Builder builderNaturalOrder = ImmutableSortedMap.naturalOrder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yfw yfwVar = (yfw) it.next();
            set(builderNaturalOrder, (Comparable) yfwVar.a, yfwVar.b);
        }
        ImmutableSortedMap immutableSortedMapBuildOrThrow = builderNaturalOrder.buildOrThrow();
        immutableSortedMapBuildOrThrow.getClass();
        return immutableSortedMapBuildOrThrow;
    }

    public static final /* synthetic */ ImmutableBiMap sequenceOfPairsToImmutableBiMap(ymw ymwVar) {
        ymwVar.getClass();
        return iterableOfPairsToImmutableBiMap(new ymz(ymwVar, 0));
    }

    public static final /* synthetic */ ImmutableListMultimap sequenceOfPairsToImmutableListMultimap(ymw ymwVar) {
        ymwVar.getClass();
        return iterableOfPairsToImmutableListMultimap(new ymz(ymwVar, 0));
    }

    public static final /* synthetic */ ImmutableMap sequenceOfPairsToImmutableMap(ymw ymwVar) {
        ymwVar.getClass();
        return iterableOfPairsToImmutableMap(new ymz(ymwVar, 0));
    }

    public static final /* synthetic */ ImmutableSetMultimap sequenceOfPairsToImmutableSetMultimap(ymw ymwVar) {
        ymwVar.getClass();
        return iterableOfPairsToImmutableSetMultimap(new ymz(ymwVar, 0));
    }

    public static final /* synthetic */ ImmutableSortedMap sequenceOfPairsToImmutableSortedMap(ymw ymwVar) {
        ymwVar.getClass();
        return iterableOfPairsToImmutableSortedMap(new ymz(ymwVar, 0));
    }

    public static final /* synthetic */ void set(ImmutableBiMap.Builder builder, Object obj, Object obj2) {
        builder.getClass();
        obj.getClass();
        obj2.getClass();
        builder.put((ImmutableBiMap.Builder) obj, obj2);
    }

    public static final /* synthetic */ ImmutableBiMap toImmutableBiMap(Iterable iterable) {
        iterable.getClass();
        ImmutableBiMap immutableBiMapCopyOf = ImmutableBiMap.copyOf(iterable);
        immutableBiMapCopyOf.getClass();
        return immutableBiMapCopyOf;
    }

    public static final /* synthetic */ ImmutableList toImmutableList(Iterable iterable) {
        iterable.getClass();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(iterable);
        immutableListCopyOf.getClass();
        return immutableListCopyOf;
    }

    public static final /* synthetic */ ImmutableListMultimap toImmutableListMultimap(Multimap multimap) {
        multimap.getClass();
        ImmutableListMultimap immutableListMultimapCopyOf = ImmutableListMultimap.copyOf(multimap);
        immutableListMultimapCopyOf.getClass();
        return immutableListMultimapCopyOf;
    }

    public static final /* synthetic */ ImmutableMap toImmutableMap(Iterable iterable) {
        iterable.getClass();
        ImmutableMap immutableMapCopyOf = ImmutableMap.copyOf(iterable);
        immutableMapCopyOf.getClass();
        return immutableMapCopyOf;
    }

    public static final /* synthetic */ ImmutableMultiset toImmutableMultiset(Iterable iterable) {
        iterable.getClass();
        ImmutableMultiset immutableMultisetCopyOf = ImmutableMultiset.copyOf(iterable);
        immutableMultisetCopyOf.getClass();
        return immutableMultisetCopyOf;
    }

    public static final /* synthetic */ ImmutableSet toImmutableSet(Iterable iterable) {
        iterable.getClass();
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf(iterable);
        immutableSetCopyOf.getClass();
        return immutableSetCopyOf;
    }

    public static final /* synthetic */ ImmutableSetMultimap toImmutableSetMultimap(Multimap multimap) {
        multimap.getClass();
        ImmutableSetMultimap immutableSetMultimapCopyOf = ImmutableSetMultimap.copyOf(multimap);
        immutableSetMultimapCopyOf.getClass();
        return immutableSetMultimapCopyOf;
    }

    public static final /* synthetic */ ImmutableSortedMap toImmutableSortedMap(Iterable iterable) {
        iterable.getClass();
        ImmutableSortedMap immutableSortedMapCopyOf = ImmutableSortedMap.copyOf(iterable);
        immutableSortedMapCopyOf.getClass();
        return immutableSortedMapCopyOf;
    }

    public static final /* synthetic */ ImmutableSortedSet toImmutableSortedSet(Iterable iterable) {
        iterable.getClass();
        ImmutableSortedSet immutableSortedSetCopyOf = ImmutableSortedSet.copyOf(iterable);
        immutableSortedSetCopyOf.getClass();
        return immutableSortedSetCopyOf;
    }

    @yfp
    public static final /* synthetic */ ImmutableSortedSet wrongBoundsImmutableSortedSetCopyOf(Iterable iterable) {
        iterable.getClass();
        ImmutableSortedSet immutableSortedSetCopyOf = ImmutableSortedSet.copyOf(iterable);
        immutableSortedSetCopyOf.getClass();
        return immutableSortedSetCopyOf;
    }

    public static final /* synthetic */ ImmutableMap.Builder associateWithTo(Iterable iterable, ImmutableMap.Builder builder, yjv yjvVar) {
        iterable.getClass();
        builder.getClass();
        yjvVar.getClass();
        associateSequenceToImmutableMapBuilder(yfm.ar(iterable), builder, yjvVar);
        return builder;
    }

    public static final /* synthetic */ ImmutableSortedMap sequenceOfPairsToImmutableSortedMap(ymw ymwVar, Comparator comparator) {
        ymwVar.getClass();
        comparator.getClass();
        return iterableOfPairsToImmutableSortedMap(new ymz(ymwVar, 0), comparator);
    }

    public static final /* synthetic */ void set(ImmutableMap.Builder builder, Object obj, Object obj2) {
        builder.getClass();
        obj.getClass();
        obj2.getClass();
        builder.put(obj, obj2);
    }

    public static final /* synthetic */ ImmutableBiMap toImmutableBiMap(Map map) {
        map.getClass();
        ImmutableBiMap immutableBiMapCopyOf = ImmutableBiMap.copyOf(map);
        immutableBiMapCopyOf.getClass();
        return immutableBiMapCopyOf;
    }

    public static final /* synthetic */ ImmutableList toImmutableList(Collection collection) {
        collection.getClass();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(collection);
        immutableListCopyOf.getClass();
        return immutableListCopyOf;
    }

    public static final /* synthetic */ ImmutableListMultimap toImmutableListMultimap(Iterable iterable) {
        iterable.getClass();
        ImmutableListMultimap immutableListMultimapCopyOf = ImmutableListMultimap.copyOf(iterable);
        immutableListMultimapCopyOf.getClass();
        return immutableListMultimapCopyOf;
    }

    public static final /* synthetic */ ImmutableMap toImmutableMap(Map map) {
        map.getClass();
        ImmutableMap immutableMapCopyOf = ImmutableMap.copyOf(map);
        immutableMapCopyOf.getClass();
        return immutableMapCopyOf;
    }

    public static final /* synthetic */ ImmutableMultiset toImmutableMultiset(ymw ymwVar) {
        ymwVar.getClass();
        ImmutableMultiset immutableMultisetCopyOf = ImmutableMultiset.copyOf(ymwVar.a());
        immutableMultisetCopyOf.getClass();
        return immutableMultisetCopyOf;
    }

    public static final /* synthetic */ ImmutableSet toImmutableSet(Collection collection) {
        collection.getClass();
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf(collection);
        immutableSetCopyOf.getClass();
        return immutableSetCopyOf;
    }

    public static final /* synthetic */ ImmutableSetMultimap toImmutableSetMultimap(Iterable iterable) {
        iterable.getClass();
        ImmutableSetMultimap immutableSetMultimapCopyOf = ImmutableSetMultimap.copyOf(iterable);
        immutableSetMultimapCopyOf.getClass();
        return immutableSetMultimapCopyOf;
    }

    public static final /* synthetic */ ImmutableSortedMap toImmutableSortedMap(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        ImmutableSortedMap immutableSortedMapCopyOf = ImmutableSortedMap.copyOf(iterable, comparator);
        immutableSortedMapCopyOf.getClass();
        return immutableSortedMapCopyOf;
    }

    public static final /* synthetic */ ImmutableSortedSet toImmutableSortedSet(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        ImmutableSortedSet immutableSortedSetCopyOf = ImmutableSortedSet.copyOf(comparator, iterable);
        immutableSortedSetCopyOf.getClass();
        return immutableSortedSetCopyOf;
    }

    public static final /* synthetic */ void set(ImmutableMultimap.Builder builder, Object obj, Object obj2) {
        builder.getClass();
        obj.getClass();
        obj2.getClass();
        builder.put(obj, obj2);
    }

    public static final /* synthetic */ ImmutableSortedMap iterableOfPairsToImmutableSortedMap(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        ImmutableSortedMap.Builder builderOrderedBy = ImmutableSortedMap.orderedBy(comparator);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yfw yfwVar = (yfw) it.next();
            set(builderOrderedBy, yfwVar.a, yfwVar.b);
        }
        ImmutableSortedMap immutableSortedMapBuildOrThrow = builderOrderedBy.buildOrThrow();
        immutableSortedMapBuildOrThrow.getClass();
        return immutableSortedMapBuildOrThrow;
    }

    public static final <E> void set(ImmutableMultiset.Builder<E> builder, E e, int i) {
        builder.getClass();
        e.getClass();
        builder.setCount(e, i);
    }

    public static final /* synthetic */ ImmutableBiMap toImmutableBiMap(ymw ymwVar) {
        ymwVar.getClass();
        return toImmutableBiMap(new ymz(ymwVar, 0));
    }

    public static final /* synthetic */ ImmutableList toImmutableList(ymw ymwVar) {
        ymwVar.getClass();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(ymwVar.a());
        immutableListCopyOf.getClass();
        return immutableListCopyOf;
    }

    public static final /* synthetic */ ImmutableListMultimap toImmutableListMultimap(ymw ymwVar) {
        ymwVar.getClass();
        return toImmutableListMultimap(new ymz(ymwVar, 0));
    }

    public static final /* synthetic */ ImmutableMap toImmutableMap(Properties properties) {
        properties.getClass();
        ImmutableMap<String, String> immutableMapFromProperties = Maps.fromProperties(properties);
        immutableMapFromProperties.getClass();
        return immutableMapFromProperties;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object toImmutableMultiset(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.C00221
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableMultiset$1 r0 = (com.google.common.collect.ImmutableExtensionsKt.C00221) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableMultiset$1 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableMultiset$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableMultiset$Builder r4 = (com.google.common.collect.ImmutableMultiset.Builder) r4
            defpackage.ybn.f(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableMultiset$Builder r5 = com.google.common.collect.ImmutableMultiset.builder()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableMultiset$2 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableMultiset$2
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L52
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableMultiset r4 = r4.build()
            r4.getClass()
            return r4
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.toImmutableMultiset(ysx, yih):java.lang.Object");
    }

    public static final /* synthetic */ ImmutableSet toImmutableSet(ymw ymwVar) {
        ymwVar.getClass();
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf(ymwVar.a());
        immutableSetCopyOf.getClass();
        return immutableSetCopyOf;
    }

    public static final /* synthetic */ ImmutableSetMultimap toImmutableSetMultimap(ymw ymwVar) {
        ymwVar.getClass();
        return toImmutableSetMultimap(new ymz(ymwVar, 0));
    }

    public static final /* synthetic */ ImmutableSortedMap toImmutableSortedMap(Map map) {
        map.getClass();
        ImmutableSortedMap immutableSortedMapCopyOf = ImmutableSortedMap.copyOf(map);
        immutableSortedMapCopyOf.getClass();
        return immutableSortedMapCopyOf;
    }

    public static final /* synthetic */ ImmutableSortedSet toImmutableSortedSet(ymw ymwVar) {
        ymwVar.getClass();
        return toImmutableSortedSet(new ymz(ymwVar, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object flowOfPairsToImmutableSortedMap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.AnonymousClass5
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$5 r0 = (com.google.common.collect.ImmutableExtensionsKt.AnonymousClass5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$5 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$5
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableSortedMap$Builder r4 = (com.google.common.collect.ImmutableSortedMap.Builder) r4
            defpackage.ybn.f(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableSortedMap$Builder r5 = com.google.common.collect.ImmutableSortedMap.naturalOrder()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$6 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$6
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L52
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableSortedMap r4 = r4.buildOrThrow()
            r4.getClass()
            return r4
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.flowOfPairsToImmutableSortedMap(ysx, yih):java.lang.Object");
    }

    public static final <R, C, V> void set(ImmutableTable.Builder<R, C, V> builder, R r, C c, V v) {
        builder.getClass();
        r.getClass();
        c.getClass();
        v.getClass();
        builder.put(r, c, v);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object toImmutableBiMap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableBiMap$1 r0 = (com.google.common.collect.ImmutableExtensionsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableBiMap$1 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableBiMap$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableBiMap$Builder r4 = (com.google.common.collect.ImmutableBiMap.Builder) r4
            defpackage.ybn.f(r5)
            goto L4b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableBiMap$Builder r5 = new com.google.common.collect.ImmutableBiMap$Builder
            r5.<init>()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableBiMap$2 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableBiMap$2
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L53
            r4 = r5
        L4b:
            com.google.common.collect.ImmutableBiMap r4 = r4.buildOrThrow()
            r4.getClass()
            return r4
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.toImmutableBiMap(ysx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object toImmutableListMultimap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.C00141
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableListMultimap$1 r0 = (com.google.common.collect.ImmutableExtensionsKt.C00141) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableListMultimap$1 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableListMultimap$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableListMultimap$Builder r4 = (com.google.common.collect.ImmutableListMultimap.Builder) r4
            defpackage.ybn.f(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableListMultimap$Builder r5 = com.google.common.collect.ImmutableListMultimap.builder()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableListMultimap$2 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableListMultimap$2
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L52
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableListMultimap r4 = r4.build()
            r4.getClass()
            return r4
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.toImmutableListMultimap(ysx, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object toImmutableSetMultimap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.C00261
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSetMultimap$1 r0 = (com.google.common.collect.ImmutableExtensionsKt.C00261) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSetMultimap$1 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSetMultimap$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableSetMultimap$Builder r4 = (com.google.common.collect.ImmutableSetMultimap.Builder) r4
            defpackage.ybn.f(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableSetMultimap$Builder r5 = com.google.common.collect.ImmutableSetMultimap.builder()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSetMultimap$2 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSetMultimap$2
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L52
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableSetMultimap r4 = r4.build()
            r4.getClass()
            return r4
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.toImmutableSetMultimap(ysx, yih):java.lang.Object");
    }

    public static final /* synthetic */ ImmutableSortedSet toImmutableSortedSet(ymw ymwVar, Comparator comparator) {
        ymwVar.getClass();
        comparator.getClass();
        return toImmutableSortedSet(new ymz(ymwVar, 0), comparator);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object toImmutableList(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.C00121
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableList$1 r0 = (com.google.common.collect.ImmutableExtensionsKt.C00121) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableList$1 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableList$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableList$Builder r4 = (com.google.common.collect.ImmutableList.Builder) r4
            defpackage.ybn.f(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableList$Builder r5 = com.google.common.collect.ImmutableList.builder()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableList$2 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableList$2
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L52
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableList r4 = r4.build()
            r4.getClass()
            return r4
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.toImmutableList(ysx, yih):java.lang.Object");
    }

    public static final /* synthetic */ ImmutableMap toImmutableMap(ymw ymwVar) {
        ymwVar.getClass();
        return toImmutableMap(new ymz(ymwVar, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object toImmutableSet(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.C00241
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSet$1 r0 = (com.google.common.collect.ImmutableExtensionsKt.C00241) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSet$1 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSet$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableSet$Builder r4 = (com.google.common.collect.ImmutableSet.Builder) r4
            defpackage.ybn.f(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableSet$Builder r5 = com.google.common.collect.ImmutableSet.builder()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSet$2 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSet$2
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L52
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableSet r4 = r4.build()
            r4.getClass()
            return r4
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.toImmutableSet(ysx, yih):java.lang.Object");
    }

    public static final /* synthetic */ ImmutableSortedMap toImmutableSortedMap(Map map, Comparator comparator) {
        map.getClass();
        comparator.getClass();
        ImmutableSortedMap immutableSortedMapCopyOf = ImmutableSortedMap.copyOf(map, comparator);
        immutableSortedMapCopyOf.getClass();
        return immutableSortedMapCopyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object toImmutableSortedSet(defpackage.ysx r4, java.util.Comparator r5, defpackage.yih r6) {
        /*
            boolean r0 = r6 instanceof com.google.common.collect.ImmutableExtensionsKt.C00363
            if (r0 == 0) goto L13
            r0 = r6
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedSet$3 r0 = (com.google.common.collect.ImmutableExtensionsKt.C00363) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedSet$3 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedSet$3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableSortedSet$Builder r4 = (com.google.common.collect.ImmutableSortedSet.Builder) r4
            defpackage.ybn.f(r6)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r6)
            com.google.common.collect.ImmutableSortedSet$Builder r5 = com.google.common.collect.ImmutableSortedSet.orderedBy(r5)
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedSet$4 r6 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedSet$4
            r6.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 == r1) goto L52
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableSortedSet r4 = r4.build()
            r4.getClass()
            return r4
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.toImmutableSortedSet(ysx, java.util.Comparator, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object toImmutableMap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.C00181
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableMap$1 r0 = (com.google.common.collect.ImmutableExtensionsKt.C00181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableMap$1 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableMap$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableMap$Builder r4 = (com.google.common.collect.ImmutableMap.Builder) r4
            defpackage.ybn.f(r5)
            goto L4b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableMap$Builder r5 = new com.google.common.collect.ImmutableMap$Builder
            r5.<init>()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableMap$2 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableMap$2
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L53
            r4 = r5
        L4b:
            com.google.common.collect.ImmutableMap r4 = r4.buildOrThrow()
            r4.getClass()
            return r4
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.toImmutableMap(ysx, yih):java.lang.Object");
    }

    public static final /* synthetic */ ImmutableSortedMap toImmutableSortedMap(ymw ymwVar) {
        ymwVar.getClass();
        return toImmutableSortedMap(new ymz(ymwVar, 0));
    }

    public static final /* synthetic */ ImmutableMultiset toImmutableMultiset(byte[] bArr) {
        bArr.getClass();
        ImmutableMultiset immutableMultisetCopyOf = ImmutableMultiset.copyOf(new ygy(bArr, 1));
        immutableMultisetCopyOf.getClass();
        return immutableMultisetCopyOf;
    }

    public static final /* synthetic */ ImmutableSortedMap toImmutableSortedMap(ymw ymwVar, Comparator comparator) {
        ymwVar.getClass();
        comparator.getClass();
        return toImmutableSortedMap(new ymz(ymwVar, 0), comparator);
    }

    public static final /* synthetic */ ImmutableList toImmutableList(byte[] bArr) {
        bArr.getClass();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) new ygy(bArr, 1));
        immutableListCopyOf.getClass();
        return immutableListCopyOf;
    }

    public static final /* synthetic */ ImmutableMultiset toImmutableMultiset(char[] cArr) {
        cArr.getClass();
        ImmutableMultiset immutableMultisetCopyOf = ImmutableMultiset.copyOf(new ygy(cArr, 6));
        immutableMultisetCopyOf.getClass();
        return immutableMultisetCopyOf;
    }

    public static final /* synthetic */ ImmutableSet toImmutableSet(byte[] bArr) {
        bArr.getClass();
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) new ygy(bArr, 1));
        immutableSetCopyOf.getClass();
        return immutableSetCopyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object toImmutableSortedMap(defpackage.ysx r4, java.util.Comparator r5, defpackage.yih r6) {
        /*
            boolean r0 = r6 instanceof com.google.common.collect.ImmutableExtensionsKt.C00323
            if (r0 == 0) goto L13
            r0 = r6
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$3 r0 = (com.google.common.collect.ImmutableExtensionsKt.C00323) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$3 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableSortedMap$Builder r4 = (com.google.common.collect.ImmutableSortedMap.Builder) r4
            defpackage.ybn.f(r6)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r6)
            com.google.common.collect.ImmutableSortedMap$Builder r5 = com.google.common.collect.ImmutableSortedMap.orderedBy(r5)
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$4 r6 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$4
            r6.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 == r1) goto L52
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableSortedMap r4 = r4.buildOrThrow()
            r4.getClass()
            return r4
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.toImmutableSortedMap(ysx, java.util.Comparator, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object toImmutableSortedSet(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.C00341
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedSet$1 r0 = (com.google.common.collect.ImmutableExtensionsKt.C00341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedSet$1 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedSet$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableSortedSet$Builder r4 = (com.google.common.collect.ImmutableSortedSet.Builder) r4
            defpackage.ybn.f(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableSortedSet$Builder r5 = com.google.common.collect.ImmutableSortedSet.naturalOrder()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedSet$2 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedSet$2
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L52
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableSortedSet r4 = r4.build()
            r4.getClass()
            return r4
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.toImmutableSortedSet(ysx, yih):java.lang.Object");
    }

    public static final /* synthetic */ ImmutableList toImmutableList(char[] cArr) {
        cArr.getClass();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) new ygy(cArr, 6));
        immutableListCopyOf.getClass();
        return immutableListCopyOf;
    }

    public static final /* synthetic */ ImmutableMultiset toImmutableMultiset(double[] dArr) {
        dArr.getClass();
        ImmutableMultiset immutableMultisetCopyOf = ImmutableMultiset.copyOf(new ygy(dArr, 5));
        immutableMultisetCopyOf.getClass();
        return immutableMultisetCopyOf;
    }

    public static final /* synthetic */ ImmutableSet toImmutableSet(char[] cArr) {
        cArr.getClass();
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) new ygy(cArr, 6));
        immutableSetCopyOf.getClass();
        return immutableSetCopyOf;
    }

    public static final /* synthetic */ ImmutableList toImmutableList(double[] dArr) {
        dArr.getClass();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) new ygy(dArr, 5));
        immutableListCopyOf.getClass();
        return immutableListCopyOf;
    }

    public static final /* synthetic */ ImmutableMultiset toImmutableMultiset(float[] fArr) {
        fArr.getClass();
        ImmutableMultiset immutableMultisetCopyOf = ImmutableMultiset.copyOf(new ygy(fArr, 4));
        immutableMultisetCopyOf.getClass();
        return immutableMultisetCopyOf;
    }

    public static final /* synthetic */ ImmutableSet toImmutableSet(double[] dArr) {
        dArr.getClass();
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) new ygy(dArr, 5));
        immutableSetCopyOf.getClass();
        return immutableSetCopyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object toImmutableSortedMap(defpackage.ysx r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableExtensionsKt.C00301
            if (r0 == 0) goto L13
            r0 = r5
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$1 r0 = (com.google.common.collect.ImmutableExtensionsKt.C00301) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$1 r0 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            yio r1 = defpackage.yio.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.google.common.collect.ImmutableSortedMap$Builder r4 = (com.google.common.collect.ImmutableSortedMap.Builder) r4
            defpackage.ybn.f(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.ybn.f(r5)
            com.google.common.collect.ImmutableSortedMap$Builder r5 = com.google.common.collect.ImmutableSortedMap.naturalOrder()
            com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$2 r2 = new com.google.common.collect.ImmutableExtensionsKt$toImmutableSortedMap$2
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L52
            r4 = r5
        L4a:
            com.google.common.collect.ImmutableSortedMap r4 = r4.buildOrThrow()
            r4.getClass()
            return r4
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableExtensionsKt.toImmutableSortedMap(ysx, yih):java.lang.Object");
    }

    public static final /* synthetic */ ImmutableSortedSet toImmutableSortedSet(byte[] bArr) {
        bArr.getClass();
        return toImmutableSortedSet(new ygy(bArr, 1));
    }

    public static final /* synthetic */ ImmutableList toImmutableList(float[] fArr) {
        fArr.getClass();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) new ygy(fArr, 4));
        immutableListCopyOf.getClass();
        return immutableListCopyOf;
    }

    public static final /* synthetic */ ImmutableMultiset toImmutableMultiset(int[] iArr) {
        iArr.getClass();
        ImmutableMultiset immutableMultisetCopyOf = ImmutableMultiset.copyOf(new ygy(iArr, 2));
        immutableMultisetCopyOf.getClass();
        return immutableMultisetCopyOf;
    }

    public static final /* synthetic */ ImmutableSet toImmutableSet(float[] fArr) {
        fArr.getClass();
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) new ygy(fArr, 4));
        immutableSetCopyOf.getClass();
        return immutableSetCopyOf;
    }

    public static final /* synthetic */ ImmutableSortedSet toImmutableSortedSet(char[] cArr) {
        cArr.getClass();
        return toImmutableSortedSet(new ygy(cArr, 6));
    }

    public static final /* synthetic */ ImmutableList toImmutableList(int[] iArr) {
        iArr.getClass();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) new ygy(iArr, 2));
        immutableListCopyOf.getClass();
        return immutableListCopyOf;
    }

    public static final /* synthetic */ ImmutableMultiset toImmutableMultiset(long[] jArr) {
        jArr.getClass();
        ImmutableMultiset immutableMultisetCopyOf = ImmutableMultiset.copyOf(new ygy(jArr, 3));
        immutableMultisetCopyOf.getClass();
        return immutableMultisetCopyOf;
    }

    public static final /* synthetic */ ImmutableSet toImmutableSet(int[] iArr) {
        iArr.getClass();
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) new ygy(iArr, 2));
        immutableSetCopyOf.getClass();
        return immutableSetCopyOf;
    }

    public static final /* synthetic */ ImmutableSortedSet toImmutableSortedSet(double[] dArr) {
        dArr.getClass();
        return toImmutableSortedSet(new ygy(dArr, 5));
    }

    public static final /* synthetic */ ImmutableSortedSet toImmutableSortedSet(float[] fArr) {
        fArr.getClass();
        return toImmutableSortedSet(new ygy(fArr, 4));
    }

    public static final /* synthetic */ ImmutableList toImmutableList(long[] jArr) {
        jArr.getClass();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) new ygy(jArr, 3));
        immutableListCopyOf.getClass();
        return immutableListCopyOf;
    }

    public static final /* synthetic */ ImmutableMultiset toImmutableMultiset(Object[] objArr) {
        objArr.getClass();
        ImmutableMultiset immutableMultisetCopyOf = ImmutableMultiset.copyOf(objArr);
        immutableMultisetCopyOf.getClass();
        return immutableMultisetCopyOf;
    }

    public static final /* synthetic */ ImmutableSet toImmutableSet(long[] jArr) {
        jArr.getClass();
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) new ygy(jArr, 3));
        immutableSetCopyOf.getClass();
        return immutableSetCopyOf;
    }

    public static final /* synthetic */ ImmutableSortedSet toImmutableSortedSet(int[] iArr) {
        iArr.getClass();
        return toImmutableSortedSet(new ygy(iArr, 2));
    }

    public static final /* synthetic */ ImmutableList toImmutableList(Object[] objArr) {
        objArr.getClass();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(objArr);
        immutableListCopyOf.getClass();
        return immutableListCopyOf;
    }

    public static final /* synthetic */ ImmutableMultiset toImmutableMultiset(short[] sArr) {
        sArr.getClass();
        ImmutableMultiset immutableMultisetCopyOf = ImmutableMultiset.copyOf(new ygy(sArr, 0));
        immutableMultisetCopyOf.getClass();
        return immutableMultisetCopyOf;
    }

    public static final /* synthetic */ ImmutableSet toImmutableSet(Object[] objArr) {
        objArr.getClass();
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf(objArr);
        immutableSetCopyOf.getClass();
        return immutableSetCopyOf;
    }

    public static final /* synthetic */ ImmutableSortedSet toImmutableSortedSet(long[] jArr) {
        jArr.getClass();
        return toImmutableSortedSet(new ygy(jArr, 3));
    }

    public static final /* synthetic */ ImmutableSortedSet toImmutableSortedSet(Comparable[] comparableArr) {
        comparableArr.getClass();
        ImmutableSortedSet immutableSortedSetCopyOf = ImmutableSortedSet.copyOf(comparableArr);
        immutableSortedSetCopyOf.getClass();
        return immutableSortedSetCopyOf;
    }

    public static final /* synthetic */ ImmutableList toImmutableList(short[] sArr) {
        sArr.getClass();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) new ygy(sArr, 0));
        immutableListCopyOf.getClass();
        return immutableListCopyOf;
    }

    public static final /* synthetic */ ImmutableSet toImmutableSet(short[] sArr) {
        sArr.getClass();
        ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) new ygy(sArr, 0));
        immutableSetCopyOf.getClass();
        return immutableSetCopyOf;
    }

    public static final /* synthetic */ ImmutableSortedSet toImmutableSortedSet(Object[] objArr, Comparator comparator) {
        objArr.getClass();
        comparator.getClass();
        return toImmutableSortedSet(yfm.aC(objArr), comparator);
    }

    public static final /* synthetic */ ImmutableSortedSet toImmutableSortedSet(short[] sArr) {
        sArr.getClass();
        return toImmutableSortedSet(new ygy(sArr, 0));
    }
}
