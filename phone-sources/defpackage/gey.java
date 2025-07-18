package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gey extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gey(Context context, yjv yjvVar, yjv yjvVar2, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = context;
        this.d = yjvVar;
        this.c = yjvVar2;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((gey) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 1) {
            return ((gey) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 2) {
            return ((gey) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 3) {
            return ((gey) create((yus) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((gey) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, yuj] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yoe] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yjv] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.f;
        if (i == 0) {
            gey geyVar = new gey((gex) this.b, (yoe) this.c, (yjz) this.d, yihVar, 0);
            geyVar.e = obj;
            return geyVar;
        }
        if (i == 1) {
            gey geyVar2 = new gey((Context) this.b, (yjv) this.d, (yjv) this.c, yihVar, 1);
            geyVar2.e = obj;
            return geyVar2;
        }
        if (i != 2) {
            if (i != 3) {
                gey geyVar3 = new gey((ysx) this.d, (yuj) this.c, this.b, yihVar, 4);
                geyVar3.e = obj;
                return geyVar3;
            }
            gey geyVar4 = new gey(this.c, this.b, yihVar, 3);
            geyVar4.e = obj;
            return geyVar4;
        }
        Object obj2 = this.b;
        gft gftVar = (gft) obj2;
        gey geyVar5 = new gey(gftVar, (int[]) this.d, (String[]) this.c, yihVar, 2);
        geyVar5.e = obj;
        return geyVar5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0133, code lost:
    
        if (r3.s(r4, r9) == r0) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113 A[Catch: all -> 0x00c8, PHI: r1
  0x0113: PHI (r1v12 ysy) = (r1v7 ysy), (r1v11 ysy), (r1v16 ysy) binds: [B:57:0x0112, B:55:0x010f, B:43:0x00bb] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00c8, blocks: (B:58:0x0113, B:61:0x0136, B:62:0x013b, B:44:0x00c3), top: B:96:0x00b5 }] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, yuj] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v3, types: [yih] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r10v46, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r10v50, types: [java.lang.Object, yuj] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, ysx] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gey.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gey(gex gexVar, yoe yoeVar, yjz yjzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = gexVar;
        this.c = yoeVar;
        this.d = yjzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gey(gft gftVar, int[] iArr, String[] strArr, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = gftVar;
        this.d = iArr;
        this.c = strArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gey(ysx ysxVar, Object obj, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = ysxVar;
        this.d = "request";
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gey(ysx ysxVar, yuj yujVar, Object obj, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = ysxVar;
        this.c = yujVar;
        this.b = obj;
    }
}
