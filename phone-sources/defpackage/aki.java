package defpackage;

import androidx.glance.session.SessionWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aki extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(akj akjVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = akjVar;
    }

    public static final void b(jbo jboVar, ysk yskVar) {
        jbm jbmVarA = jboVar.a();
        Object objB = yskVar.b(jbmVarA);
        if (objB instanceof ysc) {
            ((tug) ((tug) jbo.a.g()).i(ysd.b(objB)).j("com/google/android/apps/googletv/app/player/NetworkStatusMonitor$networkConnectivityFlow$1", "invokeSuspend$updateNetworkState", 42, "NetworkStatusMonitor.kt")).v("Failed to send value: %s", jbmVarA);
        }
        if (objB instanceof ysb) {
            ((tug) ((tug) jbo.a.g()).i(ysd.b(objB)).j("com/google/android/apps/googletv/app/player/NetworkStatusMonitor$networkConnectivityFlow$1", "invokeSuspend$updateNetworkState", 48, "NetworkStatusMonitor.kt")).v("Failed to send value (already closed): %s", jbmVarA);
        }
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((aki) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((aki) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((aki) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((aki) create((bmd) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((aki) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((aki) create((dfb) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((aki) create((dss) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((aki) create((dss) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 8:
                return ((aki) create((dti) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 9:
                return ((aki) create((gbt) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 10:
                return ((aki) create((cvi) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 11:
                return ((aki) create((gfz) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 12:
                return ((aki) create((ggd) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 13:
                return ((aki) create((ggd) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 14:
                return ((aki) create((ysk) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 15:
                return ((aki) create((yrq) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 16:
                return ((aki) create((yrq) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 17:
                return ((aki) create((yrq) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 18:
                return ((aki) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 19:
                return ((aki) create((ysk) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((aki) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.d) {
            case 0:
                aki akiVar = new aki((akj) this.b, yihVar, 0);
                akiVar.c = obj;
                return akiVar;
            case 1:
                aki akiVar2 = new aki((uu) this.b, yihVar, 1);
                akiVar2.c = obj;
                return akiVar2;
            case 2:
                aki akiVar3 = new aki((aqh) this.b, yihVar, 2);
                akiVar3.c = obj;
                return akiVar3;
            case 3:
                aki akiVar4 = new aki((cbv) this.b, yihVar, 3);
                akiVar4.c = obj;
                return akiVar4;
            case 4:
                aki akiVar5 = new aki((cny) this.b, yihVar, 4);
                akiVar5.c = obj;
                return akiVar5;
            case 5:
                aki akiVar6 = new aki((dbz) this.b, yihVar, 5);
                akiVar6.c = obj;
                return akiVar6;
            case 6:
                aki akiVar7 = new aki((djz) this.b, yihVar, 6);
                akiVar7.c = obj;
                return akiVar7;
            case 7:
                aki akiVar8 = new aki((dsn) this.b, yihVar, 7);
                akiVar8.c = obj;
                return akiVar8;
            case 8:
                aki akiVar9 = new aki((SessionWorker) this.b, yihVar, 8);
                akiVar9.c = obj;
                return akiVar9;
            case 9:
                aki akiVar10 = new aki((gag) this.b, yihVar, 9);
                akiVar10.c = obj;
                return akiVar10;
            case 10:
                aki akiVar11 = new aki((gag) this.b, yihVar, 10, (byte[]) null);
                akiVar11.c = obj;
                return akiVar11;
            case 11:
                aki akiVar12 = new aki((gft) this.b, yihVar, 11);
                akiVar12.c = obj;
                return akiVar12;
            case 12:
                aki akiVar13 = new aki((gft) this.b, yihVar, 12, (byte[]) null);
                akiVar13.c = obj;
                return akiVar13;
            case 13:
                aki akiVar14 = new aki((gft) this.b, yihVar, 13, (char[]) null);
                akiVar14.c = obj;
                return akiVar14;
            case 14:
                aki akiVar15 = new aki((gtb) this.b, yihVar, 14);
                akiVar15.c = obj;
                return akiVar15;
            case 15:
                aki akiVar16 = new aki((icl) this.b, yihVar, 15);
                akiVar16.c = obj;
                return akiVar16;
            case 16:
                aki akiVar17 = new aki((iov) this.b, yihVar, 16);
                akiVar17.c = obj;
                return akiVar17;
            case 17:
                aki akiVar18 = new aki((iqw) this.b, yihVar, 17);
                akiVar18.c = obj;
                return akiVar18;
            case 18:
                aki akiVar19 = new aki((iyd) this.b, yihVar, 18);
                akiVar19.c = obj;
                return akiVar19;
            case 19:
                aki akiVar20 = new aki((jbo) this.b, yihVar, 19);
                akiVar20.c = obj;
                return akiVar20;
            default:
                aki akiVar21 = new aki((gag) this.b, yihVar, 20, (char[]) null);
                akiVar21.c = obj;
                return akiVar21;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0298, code lost:
    
        if (r1 == r0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0427, code lost:
    
        if (r4.a() == r0) goto L217;
     */
    /* JADX WARN: Path cross not found for [B:220:0x043c, B:222:0x0440], limit reached: 285 */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111 A[Catch: all -> 0x013a, TryCatch #3 {all -> 0x013a, blocks: (B:43:0x00e2, B:50:0x00ff, B:52:0x0109, B:54:0x0111, B:56:0x0119, B:57:0x0121, B:46:0x00ea, B:49:0x00f7), top: B:287:0x00da }] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, ysx] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:262:0x0532 -> B:254:0x04e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x012d -> B:50:0x00ff). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aki.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(SessionWorker sessionWorker, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = sessionWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(aqh aqhVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = aqhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(cbv cbvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = cbvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(cny cnyVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = cnyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(dbz dbzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = dbzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(djz djzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = djzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(dsn dsnVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = dsnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(gag gagVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = gagVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(gag gagVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.d = i;
        this.b = gagVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(gag gagVar, yih yihVar, int i, char[] cArr) {
        super(2, yihVar);
        this.d = i;
        this.b = gagVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(gft gftVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = gftVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(gft gftVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.d = i;
        this.b = gftVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(gft gftVar, yih yihVar, int i, char[] cArr) {
        super(2, yihVar);
        this.d = i;
        this.b = gftVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(gtb gtbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = gtbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(icl iclVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = iclVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(iov iovVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = iovVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(iqw iqwVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = iqwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(iyd iydVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = iydVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(jbo jboVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = jboVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aki(uu uuVar, yih yihVar, int i) {
        super(2, yihVar);
        this.d = i;
        this.b = uuVar;
    }
}
