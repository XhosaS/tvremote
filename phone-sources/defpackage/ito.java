package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ito extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ito(ahi ahiVar, aho ahoVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.d = ahiVar;
        this.c = ahoVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((ito) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 1) {
            return ((ito) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 2) {
            return ((ito) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 3) {
            return ((ito) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((ito) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aho, java.lang.Object] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.e;
        if (i == 0) {
            return new ito((itq) this.c, (Context) this.d, yihVar, 0);
        }
        if (i == 1) {
            return new ito((ahi) this.d, (aho) this.c, yihVar, 1);
        }
        if (i == 2) {
            return new ito((wxd) this.c, (mdw) this.d, yihVar, 2);
        }
        if (i != 3) {
            return new ito((qtf) this.c, (qdo) this.d, yihVar, 4);
        }
        return new ito((vlo) this.c, (pfh) this.d, yihVar, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0273, code lost:
    
        if (((defpackage.ahi) r0).b.a(r16) == r5) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0287, code lost:
    
        if (((defpackage.ahi) r2).b.a(r16) != r5) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r2 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r2.c.b(r6, r3, (defpackage.qdo) r7, r16) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bc, code lost:
    
        if (r2 == r0) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Type inference failed for: r0v19, types: [aho, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [ahn, java.lang.Object] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ito.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ito(itq itqVar, Context context, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = itqVar;
        this.d = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ito(qtf qtfVar, qdo qdoVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = qtfVar;
        this.d = qdoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ito(vlo vloVar, pfh pfhVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = vloVar;
        this.d = pfhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ito(wxd wxdVar, mdw mdwVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = wxdVar;
        this.d = mdwVar;
    }
}
