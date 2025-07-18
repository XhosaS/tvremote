package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahfu extends ahmd {
    public final ahfj a;
    private final agzu e;

    public ahfu(long j, ahfu ahfuVar, ahfj ahfjVar, int i) {
        super(j, ahfuVar, i);
        this.a = ahfjVar;
        int i2 = ahfl.b;
        this.e = new agzu(i2 + i2);
    }

    @Override // defpackage.ahmd
    public final int a() {
        return ahfl.b;
    }

    public final Object b(int i, Object obj) {
        return this.e.a[i + i + 1].a(obj);
    }

    public final Object c(int i) {
        return this.e.a[i + i].a;
    }

    public final Object d(int i) {
        return this.e.a[i + i + 1].a;
    }

    public final void e(int i, boolean z) {
        if (z) {
            ahfj ahfjVar = this.a;
            ahfjVar.getClass();
            ahfjVar.t((this.d * ahfl.b) + i);
        }
        o();
    }

    public final void f(int i, Object obj) {
        this.e.a[i + i].b(obj);
    }

    public final void g(int i, Object obj) {
        this.e.a[i + i + 1].c(obj);
    }

    public final boolean h(int i, Object obj, Object obj2) {
        return this.e.a[i + i + 1].d(obj, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        f(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r1 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        r4.a.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    @Override // defpackage.ahmd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r5) {
        /*
            r4 = this;
            int r0 = defpackage.ahfl.b
            if (r5 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r5 = r5 - r0
        La:
            r4.c(r5)
        Ld:
            java.lang.Object r0 = r4.d(r5)
            boolean r2 = r0 instanceof defpackage.ahet
            r3 = 0
            if (r2 != 0) goto L57
            boolean r2 = r0 instanceof defpackage.ahgi
            if (r2 == 0) goto L1b
            goto L57
        L1b:
            ahmg r2 = defpackage.ahfl.j
            if (r0 == r2) goto L4c
            ahmg r2 = defpackage.ahfl.k
            if (r0 != r2) goto L24
            goto L4c
        L24:
            ahmg r2 = defpackage.ahfl.g
            if (r0 == r2) goto Ld
            ahmg r2 = defpackage.ahfl.f
            if (r0 == r2) goto Ld
            ahmg r5 = defpackage.ahfl.i
            if (r0 == r5) goto L73
            ahmg r5 = defpackage.ahfl.d
            if (r0 == r5) goto L73
            ahmg r5 = defpackage.ahfl.l
            if (r0 != r5) goto L39
            goto L73
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.util.Objects.toString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "unexpected state: "
            java.lang.String r0 = r1.concat(r0)
            r5.<init>(r0)
            throw r5
        L4c:
            r4.f(r5, r3)
            if (r1 == 0) goto L73
            ahfj r5 = r4.a
            r5.getClass()
            return
        L57:
            if (r1 == 0) goto L5c
            ahmg r2 = defpackage.ahfl.j
            goto L5e
        L5c:
            ahmg r2 = defpackage.ahfl.k
        L5e:
            boolean r0 = r4.h(r5, r0, r2)
            if (r0 == 0) goto Ld
            r4.f(r5, r3)
            r0 = r1 ^ 1
            r4.e(r5, r0)
            if (r1 == 0) goto L73
            ahfj r5 = r4.a
            r5.getClass()
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahfu.i(int):void");
    }
}
