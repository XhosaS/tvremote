package com.google.protos.youtube.elements;

import defpackage.abwx;
import defpackage.abxd;
import defpackage.abyr;
import defpackage.abyy;
import defpackage.abzc;
import defpackage.acxe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class IntersectionPropertiesOuterClass$CommandIntersectionObserver extends abxd implements abyr {
    public static final IntersectionPropertiesOuterClass$CommandIntersectionObserver a;
    private static volatile abyy b;
    private byte c = 2;

    static {
        IntersectionPropertiesOuterClass$CommandIntersectionObserver intersectionPropertiesOuterClass$CommandIntersectionObserver = new IntersectionPropertiesOuterClass$CommandIntersectionObserver();
        a = intersectionPropertiesOuterClass$CommandIntersectionObserver;
        intersectionPropertiesOuterClass$CommandIntersectionObserver.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(IntersectionPropertiesOuterClass$CommandIntersectionObserver.class, intersectionPropertiesOuterClass$CommandIntersectionObserver);
    }

    private IntersectionPropertiesOuterClass$CommandIntersectionObserver() {
    }

    public static IntersectionPropertiesOuterClass$CommandIntersectionObserver getDefaultInstance() {
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r4 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$CommandIntersectionObserver parseFrom(java.nio.ByteBuffer r4, com.google.protobuf.ExtensionRegistryLite r5) throws defpackage.abxv {
        /*
            abvt r4 = defpackage.abvt.Q(r4)
            com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$CommandIntersectionObserver r0 = new com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$CommandIntersectionObserver
            r0.<init>()
            abza r1 = defpackage.abza.a     // Catch: java.lang.RuntimeException -> L87 java.io.IOException -> L98 defpackage.abzz -> Lae defpackage.abxv -> Lb4
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.RuntimeException -> L87 java.io.IOException -> L98 defpackage.abzz -> Lae defpackage.abxv -> Lb4
            abzj r1 = r1.a(r2)     // Catch: java.lang.RuntimeException -> L87 java.io.IOException -> L98 defpackage.abzz -> Lae defpackage.abxv -> Lb4
            abvu r4 = defpackage.abvu.p(r4)     // Catch: java.lang.RuntimeException -> L87 java.io.IOException -> L98 defpackage.abzz -> Lae defpackage.abxv -> Lb4
            r1.i(r0, r4, r5)     // Catch: java.lang.RuntimeException -> L87 java.io.IOException -> L98 defpackage.abzz -> Lae defpackage.abxv -> Lb4
            r1.g(r0)     // Catch: java.lang.RuntimeException -> L87 java.io.IOException -> L98 defpackage.abzz -> Lae defpackage.abxv -> Lb4
            byte r4 = r0.c
            java.lang.Byte r5 = java.lang.Byte.valueOf(r4)
            r5.getClass()
            r5 = 0
            r1 = 0
            r2 = 1
            if (r4 != r2) goto L2c
            goto L4a
        L2c:
            if (r4 == 0) goto L7d
            abza r4 = defpackage.abza.a
            java.lang.Class r3 = r0.getClass()
            abzj r4 = r4.a(r3)
            boolean r4 = r4.l(r0)
            if (r2 == r4) goto L40
            r3 = r1
            goto L41
        L40:
            r3 = r0
        L41:
            if (r3 != 0) goto L45
            r3 = r5
            goto L46
        L45:
            r3 = r2
        L46:
            r0.c = r3
            if (r4 == 0) goto L7d
        L4a:
            byte r4 = r0.c
            java.lang.Byte r3 = java.lang.Byte.valueOf(r4)
            r3.getClass()
            if (r4 != r2) goto L56
            goto L72
        L56:
            if (r4 == 0) goto L73
            abza r4 = defpackage.abza.a
            java.lang.Class r3 = r0.getClass()
            abzj r4 = r4.a(r3)
            boolean r4 = r4.l(r0)
            if (r2 == r4) goto L69
            goto L6a
        L69:
            r1 = r0
        L6a:
            if (r1 != 0) goto L6d
            goto L6e
        L6d:
            r5 = r2
        L6e:
            r0.c = r5
            if (r4 == 0) goto L73
        L72:
            return r0
        L73:
            abzz r4 = new abzz
            r4.<init>()
            abxv r4 = r4.a()
            throw r4
        L7d:
            abzz r4 = new abzz
            r4.<init>()
            abxv r4 = r4.a()
            throw r4
        L87:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            boolean r5 = r5 instanceof defpackage.abxv
            if (r5 == 0) goto L97
            java.lang.Throwable r4 = r4.getCause()
            abxv r4 = (defpackage.abxv) r4
            throw r4
        L97:
            throw r4
        L98:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            boolean r5 = r5 instanceof defpackage.abxv
            if (r5 == 0) goto La8
            java.lang.Throwable r4 = r4.getCause()
            abxv r4 = (defpackage.abxv) r4
            throw r4
        La8:
            abxv r5 = new abxv
            r5.<init>(r4)
            throw r5
        Lae:
            r4 = move-exception
            abxv r4 = r4.a()
            throw r4
        Lb4:
            r4 = move-exception
            boolean r5 = r4.a
            if (r5 == 0) goto Lbf
            abxv r5 = new abxv
            r5.<init>(r4)
            throw r5
        Lbf:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$CommandIntersectionObserver.parseFrom(java.nio.ByteBuffer, com.google.protobuf.ExtensionRegistryLite):com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$CommandIntersectionObserver");
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new IntersectionPropertiesOuterClass$CommandIntersectionObserver();
        }
        if (i2 == 4) {
            return new acxe();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.c = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (IntersectionPropertiesOuterClass$CommandIntersectionObserver.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
