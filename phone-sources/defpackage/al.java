package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class al {
    final am a;
    al b;
    public ak f;
    final int g;
    public int c = 0;
    int d = -1;
    public int h = 1;
    public int i = 1;
    public int e = 0;

    public al(am amVar, int i) {
        this.a = amVar;
        this.g = i;
    }

    private final String f(HashSet hashSet) {
        if (!hashSet.add(this)) {
            return "<-";
        }
        StringBuilder sb = new StringBuilder("null:");
        sb.append(a.e(this.g));
        al alVar = this.b;
        sb.append(alVar != null ? " connected to ".concat(alVar.f(hashSet)) : "");
        return sb.toString();
    }

    public final int a() {
        al alVar;
        if (this.a.K == 8) {
            return 0;
        }
        int i = this.d;
        return (i < 0 || (alVar = this.b) == null || alVar.a.K != 8) ? this.c : i;
    }

    public final void b() {
        this.b = null;
        this.c = 0;
        this.d = -1;
        this.h = 2;
        this.e = 0;
        this.i = 1;
    }

    public final boolean c() {
        return this.b != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.al r10, int r11, int r12, int r13, int r14, boolean r15) {
        /*
            r9 = this;
            r0 = -1
            r1 = 2
            r2 = 0
            r3 = 1
            if (r10 != 0) goto L12
            r10 = 0
            r9.b = r10
            r9.c = r2
            r9.d = r0
            r9.h = r3
            r9.e = r1
            return
        L12:
            if (r15 != 0) goto L7f
            int r15 = r10.g
            int r4 = r9.g
            r5 = 6
            if (r15 != r4) goto L34
            r15 = 7
            if (r4 != r15) goto L20
            goto L7e
        L20:
            if (r4 != r5) goto L7f
            am r15 = r10.a
            boolean r15 = r15.r()
            if (r15 == 0) goto L7e
            am r15 = r9.a
            boolean r15 = r15.r()
            if (r15 == 0) goto L7e
            goto L7f
        L34:
            int r4 = r4 + r0
            r0 = 8
            r6 = 4
            if (r4 == r3) goto L64
            r7 = 9
            r8 = 3
            if (r4 == r1) goto L4d
            if (r4 == r8) goto L64
            if (r4 == r6) goto L4d
            if (r4 == r5) goto L46
            goto L7e
        L46:
            if (r15 == r5) goto L7e
            if (r15 == r0) goto L7e
            if (r15 == r7) goto L7e
            goto L7f
        L4d:
            if (r15 == r8) goto L56
            r0 = 5
            if (r15 != r0) goto L54
            r15 = r0
            goto L56
        L54:
            r0 = r2
            goto L57
        L56:
            r0 = r3
        L57:
            am r1 = r10.a
            boolean r1 = r1 instanceof defpackage.ao
            if (r1 == 0) goto L62
            if (r0 != 0) goto L7c
            if (r15 != r7) goto L79
            goto L7c
        L62:
            r3 = r0
            goto L7c
        L64:
            if (r15 == r1) goto L6d
            if (r15 != r6) goto L6b
            r1 = r3
            r15 = r6
            goto L6e
        L6b:
            r1 = r2
            goto L6e
        L6d:
            r1 = r3
        L6e:
            am r4 = r10.a
            boolean r4 = r4 instanceof defpackage.ao
            if (r4 == 0) goto L7b
            if (r1 != 0) goto L7c
            if (r15 != r0) goto L79
            goto L7c
        L79:
            r3 = r2
            goto L7c
        L7b:
            r3 = r1
        L7c:
            if (r3 != 0) goto L7f
        L7e:
            return
        L7f:
            r9.b = r10
            if (r11 <= 0) goto L86
            r9.c = r11
            goto L88
        L86:
            r9.c = r2
        L88:
            r9.d = r12
            r9.h = r13
            r9.e = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al.d(al, int, int, int, int, boolean):void");
    }

    public final void e() {
        ak akVar = this.f;
        if (akVar == null) {
            this.f = new ak(1);
        } else {
            akVar.b();
        }
    }

    public final String toString() {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder("null:");
        sb.append(a.e(this.g));
        al alVar = this.b;
        sb.append(alVar != null ? " connected to ".concat(alVar.f(hashSet)) : "");
        return sb.toString();
    }
}
