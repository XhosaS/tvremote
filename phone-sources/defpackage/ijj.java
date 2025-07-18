package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ijj implements ijf {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object n(defpackage.ijj r18, defpackage.ink r19, java.lang.String r20, defpackage.inl r21, long r22, long r24, java.util.List r26, defpackage.yih r27) throws java.lang.Throwable {
        /*
            r0 = r18
            r1 = r27
            boolean r2 = r1 instanceof defpackage.iji
            if (r2 == 0) goto L17
            r2 = r1
            iji r2 = (defpackage.iji) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            iji r2 = new iji
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.c
            yio r3 = defpackage.yio.a
            int r4 = r2.d
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L4b
            if (r4 == r7) goto L3c
            if (r4 != r5) goto L34
            java.lang.Object r0 = r2.a
            java.util.List r0 = (java.util.List) r0
            defpackage.ybn.f(r1)
            goto Lbe
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            java.lang.Object r0 = r2.b
            java.lang.Object r4 = r2.a
            ijj r4 = (defpackage.ijj) r4
            defpackage.ybn.f(r1)
            r17 = r4
            r4 = r0
            r0 = r17
            goto L80
        L4b:
            defpackage.ybn.f(r1)
            ilz r8 = new ilz
            byte[] r1 = r21.h()
            int r1 = r1.length
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = r22
            r14 = r24
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r14, r16)
            ilz[] r1 = new defpackage.ilz[r7]
            r1[r6] = r8
            r2.a = r0
            r4 = r26
            r2.b = r4
            r2.d = r7
            r8 = r0
            ijn r8 = (defpackage.ijn) r8
            gex r8 = r8.a
            ijr r9 = new ijr
            r9.<init>(r0, r1, r7)
            java.lang.Object r1 = defpackage.gez.l(r8, r6, r7, r9, r2)
            if (r1 == r3) goto Lc3
        L80:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.yfm.z(r4, r8)
            r7.<init>(r8)
            java.util.Iterator r4 = r4.iterator()
        L91:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r4.next()
            wlh r8 = (defpackage.wlh) r8
            ily r9 = new ily
            java.lang.Object r10 = r1.get(r6)
            java.lang.Number r10 = (java.lang.Number) r10
            long r10 = r10.longValue()
            r9.<init>(r10, r8)
            r7.add(r9)
            goto L91
        Lb0:
            r2.a = r1
            r4 = 0
            r2.b = r4
            r2.d = r5
            java.lang.Object r0 = r0.k(r7, r2)
            if (r0 == r3) goto Lc3
            r0 = r1
        Lbe:
            java.lang.Object r0 = r0.get(r6)
            return r0
        Lc3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijj.n(ijj, ink, java.lang.String, inl, long, long, java.util.List, yih):java.lang.Object");
    }

    public abstract Object c(yih yihVar);

    public abstract Object d(long j, yih yihVar);

    public Object e(List list, String str, yih yihVar) {
        throw null;
    }

    public abstract Object f(long j, yih yihVar);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.ink r9, java.lang.String r10, long r11, defpackage.yih r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.ijh
            if (r0 == 0) goto L13
            r0 = r13
            ijh r0 = (defpackage.ijh) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ijh r0 = new ijh
            r0.<init>(r8, r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.c
            yio r0 = defpackage.yio.a
            int r1 = r6.e
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L46
            if (r1 == r2) goto L37
            if (r1 != r7) goto L2f
            java.lang.Object r9 = r6.a
            inl r9 = (defpackage.inl) r9
            defpackage.ybn.f(r13)
            return r9
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            long r11 = r6.b
            java.lang.String r10 = r6.f
            java.lang.Object r9 = r6.a
            ink r9 = (defpackage.ink) r9
            defpackage.ybn.f(r13)
            r2 = r9
            r3 = r10
            r4 = r11
            goto L5b
        L46:
            defpackage.ybn.f(r13)
            r6.a = r9
            r6.f = r10
            r6.b = r11
            r6.e = r2
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            java.lang.Object r13 = r1.i(r2, r3, r4, r6)
            if (r13 == r0) goto L6e
        L5b:
            inl r13 = (defpackage.inl) r13
            if (r13 == 0) goto L6d
            r6.a = r13
            r9 = 0
            r6.f = r9
            r6.e = r7
            r1 = r8
            java.lang.Object r9 = r1.l(r2, r3, r4, r6)
            if (r9 == r0) goto L6e
        L6d:
            return r13
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijj.g(ink, java.lang.String, long, yih):java.lang.Object");
    }

    public abstract Object h(yih yihVar);

    protected abstract Object i(ink inkVar, String str, long j, yih yihVar);

    public abstract Object j(yih yihVar);

    public abstract Object k(List list, yih yihVar);

    protected abstract Object l(ink inkVar, String str, long j, yih yihVar);

    public Object m(ink inkVar, String str, inl inlVar, long j, long j2, List list, yih yihVar) {
        throw null;
    }
}
