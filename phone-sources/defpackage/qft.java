package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qft extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qft(qfx qfxVar, qen qenVar, vku vkuVar, qdo qdoVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = qfxVar;
        this.c = qenVar;
        this.d = vkuVar;
        this.e = qdoVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((qft) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 1) {
            return ((qft) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 2) {
            return ((qft) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 3) {
            return ((qft) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((qft) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, yuu] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, qpv] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, yuj] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.f;
        if (i == 0) {
            Object obj2 = this.b;
            Object obj3 = this.c;
            return new qft((qfx) obj2, (qen) obj3, (vku) this.d, (qdo) this.e, yihVar, 0);
        }
        if (i == 1) {
            Object obj4 = this.d;
            Object obj5 = this.c;
            return new qft((tst) obj4, (pxg) obj5, (ptn) this.e, (qis) this.b, yihVar, 1);
        }
        if (i == 2) {
            Object obj6 = this.e;
            return new qft((qnf) obj6, (List) this.d, (String) this.b, (vjj) this.c, yihVar, 2);
        }
        if (i != 3) {
            return new qft((yuu) this.d, (ysx) this.c, (yuj) this.b, this.e, yihVar, 4);
        }
        Object obj7 = this.e;
        return new qft((qnf) obj7, (qpv) this.c, (String) this.d, (vjs) this.b, yihVar, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r11.a(r2, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r11.a(r1, r10) != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (defpackage.vyf.J(r11, r1, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0104, code lost:
    
        if (r11 == r0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.lang.Object, yuu] */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.lang.Object, yuj] */
    /* JADX WARN: Type inference failed for: r11v40, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r11v43, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, qpv] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, yuj] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, vvj] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qft.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qft(qnf qnfVar, List list, String str, vjj vjjVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.e = qnfVar;
        this.d = list;
        this.b = str;
        this.c = vjjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qft(qnf qnfVar, qpv qpvVar, String str, vjs vjsVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.e = qnfVar;
        this.c = qpvVar;
        this.d = str;
        this.b = vjsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qft(tst tstVar, pxg pxgVar, ptn ptnVar, qis qisVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = tstVar;
        this.c = pxgVar;
        this.e = ptnVar;
        this.b = qisVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qft(yuu yuuVar, ysx ysxVar, yuj yujVar, Object obj, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = yuuVar;
        this.c = ysxVar;
        this.b = yujVar;
        this.e = obj;
    }
}
