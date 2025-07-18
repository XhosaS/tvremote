package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayg extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayg(gex gexVar, yih yihVar, yjv yjvVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = gexVar;
        this.c = yjvVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((ayg) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i == 1) {
            return ((ayg) create((yjv) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 2) {
            return ((ayg) create((ggd) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((ayg) create((ggd) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yjv] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.f;
        if (i == 0) {
            ayg aygVar = new ayg((yrz) this.c, (ayh) this.d, yihVar, 0);
            aygVar.e = obj;
            return aygVar;
        }
        if (i == 1) {
            ayg aygVar2 = new ayg((ylf) this.c, (ty) this.d, yihVar, 1);
            aygVar2.e = obj;
            return aygVar2;
        }
        if (i != 2) {
            ayg aygVar3 = new ayg((gex) this.d, yihVar, this.c, 3, null);
            aygVar3.e = obj;
            return aygVar3;
        }
        ayg aygVar4 = new ayg((gex) this.d, yihVar, (yjv) this.c, 2);
        aygVar4.e = obj;
        return aygVar4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r11.a(r10) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0112, code lost:
    
        if (r11.a(r10) == r0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d1 A[RETURN] */
    /* JADX WARN: Type inference failed for: r11v44, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r11v64, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yrz] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0195 -> B:87:0x0197). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x019b -> B:90:0x019c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01cf -> B:100:0x01d2). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayg(gex gexVar, yih yihVar, yjv yjvVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.f = i;
        this.d = gexVar;
        this.c = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayg(ylf ylfVar, ty tyVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = ylfVar;
        this.d = tyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayg(yrz yrzVar, ayh ayhVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = yrzVar;
        this.d = ayhVar;
    }
}
