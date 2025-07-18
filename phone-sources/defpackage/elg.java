package defpackage;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elg implements elj {
    public static final ttm a = new eik(2);
    private static final Random e = new Random();
    public final eax b;
    public final eav c;
    public eli d;
    private final HashMap f;
    private final ttm g;
    private eay h;
    private String i;
    private long j;

    public elg() {
        this(a);
    }

    public static String b() {
        byte[] bArr = new byte[12];
        e.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final elf j(int i, evz evzVar) {
        HashMap map = this.f;
        long j = Long.MAX_VALUE;
        elf elfVar = null;
        for (elf elfVar2 : map.values()) {
            elfVar2.a(i, evzVar);
            if (elfVar2.b(i, evzVar)) {
                long j2 = elfVar2.c;
                if (j2 == -1 || j2 < j) {
                    elfVar = elfVar2;
                    j = j2;
                } else if (j2 == j) {
                    String str = edt.a;
                    if (elfVar.d != null && elfVar2.d != null) {
                        elfVar = elfVar2;
                    }
                }
            }
        }
        if (elfVar != null) {
            return elfVar;
        }
        String str2 = (String) this.g.get();
        elf elfVar3 = new elf(this, str2, i, evzVar);
        map.put(str2, elfVar3);
        return elfVar3;
    }

    private final void k(elf elfVar) {
        long j = elfVar.c;
        if (j != -1) {
            this.j = j;
        }
        this.i = null;
    }

    private final void l(ekl eklVar) {
        evz evzVar;
        if (eklVar.b.q()) {
            String str = this.i;
            if (str != null) {
                elf elfVar = (elf) this.f.get(str);
                elfVar.getClass();
                k(elfVar);
                return;
            }
            return;
        }
        elf elfVar2 = (elf) this.f.get(this.i);
        int i = eklVar.c;
        evz evzVar2 = eklVar.d;
        String str2 = j(i, evzVar2).a;
        this.i = str2;
        f(eklVar);
        if (evzVar2 == null || !evzVar2.b()) {
            return;
        }
        if (elfVar2 != null) {
            if (elfVar2.c == evzVar2.d && (evzVar = elfVar2.d) != null) {
                if (evzVar.b == evzVar2.b && evzVar.c == evzVar2.c) {
                    return;
                }
            }
        }
        this.d.au(eklVar, j(i, new evz(evzVar2.a, evzVar2.d)).a, str2);
    }

    public final long a() {
        elf elfVar = (elf) this.f.get(this.i);
        if (elfVar != null) {
            long j = elfVar.c;
            if (j != -1) {
                return j;
            }
        }
        return this.j + 1;
    }

    @Override // defpackage.elj
    public final synchronized String c() {
        return this.i;
    }

    @Override // defpackage.elj
    public final synchronized String d(eay eayVar, evz evzVar) {
        return j(eayVar.o(evzVar.a, this.c).h, evzVar).a;
    }

    @Override // defpackage.elj
    public final synchronized void e(ekl eklVar) {
        eli eliVar;
        String str = this.i;
        if (str != null) {
            elf elfVar = (elf) this.f.get(str);
            elfVar.getClass();
            k(elfVar);
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            elf elfVar2 = (elf) it.next();
            it.remove();
            if (elfVar2.e && (eliVar = this.d) != null) {
                eliVar.ax(eklVar, elfVar2.a, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad A[Catch: all -> 0x00d6, TryCatch #0 {, blocks: (B:4:0x0005, B:7:0x0014, B:9:0x0018, B:11:0x0022, B:13:0x002e, B:15:0x0036, B:17:0x003c, B:19:0x0046, B:21:0x004c, B:23:0x0052, B:25:0x0065, B:27:0x00a9, B:29:0x00ad, B:31:0x00bc, B:33:0x00c6, B:35:0x00ca), top: B:43:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    @Override // defpackage.elj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f(defpackage.ekl r22) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elg.f(ekl):void");
    }

    @Override // defpackage.elj
    public final synchronized void g(ekl eklVar, int i) {
        this.d.getClass();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            elf elfVar = (elf) it.next();
            if (elfVar.c(eklVar)) {
                it.remove();
                if (elfVar.e) {
                    String str = elfVar.a;
                    boolean zEquals = str.equals(this.i);
                    boolean z = false;
                    if (i == 0 && zEquals && elfVar.f) {
                        z = true;
                    }
                    if (zEquals) {
                        k(elfVar);
                    }
                    this.d.ax(eklVar, str, z);
                }
            }
        }
        l(eklVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0016 A[SYNTHETIC] */
    @Override // defpackage.elj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h(defpackage.ekl r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            eli r0 = r9.d     // Catch: java.lang.Throwable -> L90
            defpackage.a.aq(r0)     // Catch: java.lang.Throwable -> L90
            eay r0 = r9.h     // Catch: java.lang.Throwable -> L90
            eay r1 = r10.b     // Catch: java.lang.Throwable -> L90
            r9.h = r1     // Catch: java.lang.Throwable -> L90
            java.util.HashMap r1 = r9.f     // Catch: java.lang.Throwable -> L90
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L90
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L90
        L16:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L90
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L90
            elf r2 = (defpackage.elf) r2     // Catch: java.lang.Throwable -> L90
            eay r3 = r9.h     // Catch: java.lang.Throwable -> L90
            int r4 = r2.b     // Catch: java.lang.Throwable -> L90
            int r5 = r0.c()     // Catch: java.lang.Throwable -> L90
            r6 = -1
            if (r4 < r5) goto L35
            int r5 = r3.c()     // Catch: java.lang.Throwable -> L90
            if (r4 < r5) goto L58
        L33:
            r4 = r6
            goto L58
        L35:
            elg r5 = r2.g     // Catch: java.lang.Throwable -> L90
            eax r7 = r5.b     // Catch: java.lang.Throwable -> L90
            r0.p(r4, r7)     // Catch: java.lang.Throwable -> L90
            int r4 = r7.B     // Catch: java.lang.Throwable -> L90
        L3e:
            int r8 = r7.C     // Catch: java.lang.Throwable -> L90
            if (r4 > r8) goto L33
            java.lang.Object r8 = r0.f(r4)     // Catch: java.lang.Throwable -> L90
            int r8 = r3.a(r8)     // Catch: java.lang.Throwable -> L90
            if (r8 == r6) goto L55
            eav r4 = r5.c     // Catch: java.lang.Throwable -> L90
            eav r4 = r3.n(r8, r4)     // Catch: java.lang.Throwable -> L90
            int r4 = r4.h     // Catch: java.lang.Throwable -> L90
            goto L58
        L55:
            int r4 = r4 + 1
            goto L3e
        L58:
            r2.b = r4     // Catch: java.lang.Throwable -> L90
            if (r4 != r6) goto L5d
            goto L70
        L5d:
            evz r4 = r2.d     // Catch: java.lang.Throwable -> L90
            if (r4 != 0) goto L62
            goto L6a
        L62:
            java.lang.Object r4 = r4.a     // Catch: java.lang.Throwable -> L90
            int r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L90
            if (r3 == r6) goto L70
        L6a:
            boolean r3 = r2.c(r10)     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L16
        L70:
            r1.remove()     // Catch: java.lang.Throwable -> L90
            boolean r3 = r2.e     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L16
            java.lang.String r3 = r2.a     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = r9.i     // Catch: java.lang.Throwable -> L90
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L84
            r9.k(r2)     // Catch: java.lang.Throwable -> L90
        L84:
            eli r2 = r9.d     // Catch: java.lang.Throwable -> L90
            r4 = 0
            r2.ax(r10, r3, r4)     // Catch: java.lang.Throwable -> L90
            goto L16
        L8b:
            r9.l(r10)     // Catch: java.lang.Throwable -> L90
            monitor-exit(r9)
            return
        L90:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L90
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elg.h(ekl):void");
    }

    @Override // defpackage.elj
    public final synchronized boolean i(ekl eklVar, String str) {
        elf elfVar = (elf) this.f.get(str);
        if (elfVar == null) {
            return false;
        }
        int i = eklVar.c;
        evz evzVar = eklVar.d;
        elfVar.a(i, evzVar);
        return elfVar.b(i, evzVar);
    }

    public elg(ttm ttmVar) {
        this.g = ttmVar;
        this.b = new eax();
        this.c = new eav();
        this.f = new HashMap();
        this.h = eay.a;
        this.j = -1L;
    }
}
