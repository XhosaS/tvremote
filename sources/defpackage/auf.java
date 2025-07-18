package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auf {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public auf() {
        this((byte[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[EDGE_INSN: B:164:0x00ab->B:33:0x00ab BREAK  A[LOOP:2: B:25:0x0087->B:165:?]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(defpackage.adh r20, defpackage.byo r21, defpackage.byb r22) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auf.f(adh, byo, byb):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [crv, java.lang.Object] */
    public final aue a(Executor executor, cov covVar, crv crvVar) {
        auc aucVar = (auc) this.a.a();
        aucVar.getClass();
        aqp aqpVar = (aqp) this.c.a();
        aqpVar.getClass();
        Object objA = this.d.a();
        executor.getClass();
        covVar.getClass();
        ?? r6 = this.e;
        return new aue(aucVar, this.b, aqpVar, (bfv) objA, r6, executor, covVar, crvVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    public final void b(String str, Object obj) {
        str.getClass();
        this.c.put(str, obj);
        aei aeiVar = (aei) this.a.get(str);
        if (aeiVar != null) {
            aeiVar.l(obj);
        }
        aei aeiVar2 = (aei) this.b.get(str);
        if (aeiVar2 != null) {
            aeiVar2.l(obj);
        }
    }

    public final int c() {
        return ((cve) this.c).b - ((cve) this.b).b;
    }

    public final cwc d() {
        cwc cwcVar;
        while (true) {
            Object obj = this.b;
            Object obj2 = this.c;
            cve cveVar = (cve) obj;
            int i = cveVar.b;
            if (i - ((cve) obj2).b == 0) {
                return null;
            }
            int i2 = i & 127;
            if (cveVar.a(i, i + 1) && (cwcVar = (cwc) ((AtomicReferenceArray) this.a).getAndSet(i2, null)) != null) {
                return cwcVar;
            }
        }
    }

    public final cwc e(int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
        int i2 = i & 127;
        cwc cwcVar = (cwc) atomicReferenceArray.get(i2);
        if (cwcVar != null && !z) {
            while (!atomicReferenceArray.compareAndSet(i2, cwcVar, null)) {
                if (atomicReferenceArray.get(i2) != cwcVar) {
                }
            }
            return cwcVar;
        }
        return null;
    }

    public /* synthetic */ auf(byte[] bArr) {
        this.c = new LinkedHashMap(cso.a);
        this.d = new LinkedHashMap();
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.e = new ab(this, 4);
    }

    public auf(crv crvVar, crv crvVar2, crv crvVar3, crv crvVar4, crv crvVar5) {
        crvVar.getClass();
        this.a = crvVar;
        crvVar2.getClass();
        this.b = crvVar2;
        crvVar3.getClass();
        this.c = crvVar3;
        crvVar4.getClass();
        this.d = crvVar4;
        crvVar5.getClass();
        this.e = crvVar5;
    }

    public auf(byte[] bArr, byte[] bArr2) {
        this.d = new AtomicBoolean(false);
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
    }

    public auf(char[] cArr) {
        this.a = new AtomicReferenceArray(128);
        cvh cvhVar = cvh.a;
        this.d = new cvg(null, cvhVar);
        this.c = new cve(cvhVar);
        this.b = new cve(cvhVar);
        this.e = new cve(cvhVar);
    }
}
