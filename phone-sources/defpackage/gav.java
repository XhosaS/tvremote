package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gav {
    public final gbo a;
    public final ysx b;
    public final AtomicBoolean c;
    public final yrz d;
    public final ysx e;
    public final cvi f;
    public final cb g;
    private final Object h;
    private final yqg i;
    private final fus j;

    public gav(Object obj, gbo gboVar, fus fusVar, ysx ysxVar) {
        gboVar.getClass();
        this.h = obj;
        this.a = gboVar;
        this.j = fusVar;
        this.b = ysxVar;
        this.g = new cb(null, null, null);
        this.c = new AtomicBoolean(false);
        this.d = vyf.R(-2, 0, 6);
        this.f = new cvi(fusVar);
        yqg yqgVar = new yqg(null);
        this.i = yqgVar;
        this.e = new ipi((yjz) new gat(this, null, 2, null), gez.e(new axy(yqgVar, new gat(this, (yih) null, 0), (yih) null, 3, (byte[]) null)), 13);
    }

    private final Object i(gaw gawVar, fzx fzxVar, fzs fzsVar, yih yihVar) {
        kvw kvwVar = gawVar.k;
        if (!yks.e(kvwVar.h(fzxVar), fzsVar)) {
            kvwVar.j(fzxVar, fzsVar);
            Object objA = this.d.a(new gaa(kvwVar.i()), yihVar);
            if (objA == yio.a) {
                return objA;
            }
        }
        return ygi.a;
    }

    private final void j() {
        g();
        this.a.d();
    }

    private static final Object k(gaw gawVar, fzx fzxVar, int i, int i2) {
        int i3;
        fzxVar.getClass();
        int iOrdinal = fzxVar.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            i3 = gawVar.f;
        } else {
            if (iOrdinal != 2) {
                throw new yfu();
            }
            i3 = gawVar.g;
        }
        if (i != i3 || (gawVar.k.h(fzxVar) instanceof fzs) || i2 >= 10) {
            return null;
        }
        return fzxVar == fzx.b ? ((gbn) yfm.S(gawVar.b)).c : ((gbn) yfm.W(gawVar.b)).d;
    }

    private static final gbk l(fzx fzxVar, Object obj) {
        fzxVar.getClass();
        int iOrdinal = fzxVar.ordinal();
        if (iOrdinal == 0) {
            return new gbj(obj, 10);
        }
        if (iOrdinal == 1) {
            if (obj != null) {
                return new gbi(obj, 10);
            }
            throw new IllegalArgumentException("key cannot be null for prepend");
        }
        if (iOrdinal != 2) {
            throw new yfu();
        }
        if (obj != null) {
            return new gbh(obj, 10);
        }
        throw new IllegalArgumentException("key cannot be null for append");
    }

    private static final void m(fzx fzxVar, Object obj, gez gezVar) {
        if (gezVar == null) {
            Objects.toString(fzxVar);
            Objects.toString(obj);
        } else {
            Objects.toString(fzxVar);
            Objects.toString(obj);
            Objects.toString(gezVar);
        }
    }

    public final Object a(ysx ysxVar, fzx fzxVar, yih yihVar) {
        Object objA = vyf.G(new ysq(new axy(fzm.a(ysxVar, new gah(null, this, fzxVar)), new gai(fzxVar, null), (yih) null, 4))).a(new wp(this, fzxVar, 7), yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.gam
            if (r0 == 0) goto L13
            r0 = r6
            gam r0 = (defpackage.gam) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gam r0 = new gam
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yyk r1 = r0.d
            cvi r0 = r0.e
            defpackage.ybn.f(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.ybn.f(r6)
            cvi r6 = r5.f
            r0.e = r6
            java.lang.Object r2 = r6.b
            r4 = r2
            yyk r4 = (defpackage.yyk) r4
            r0.d = r4
            r0.c = r3
            java.lang.Object r0 = r4.b(r0)
            if (r0 == r1) goto L66
            r0 = r6
            r1 = r2
        L4b:
            java.lang.Object r6 = r0.a     // Catch: java.lang.Throwable -> L5f
            cb r0 = r5.g     // Catch: java.lang.Throwable -> L5f
            gcd r0 = r0.v()     // Catch: java.lang.Throwable -> L5f
            gaw r6 = (defpackage.gaw) r6     // Catch: java.lang.Throwable -> L5f
            gbp r6 = r6.b(r0)     // Catch: java.lang.Throwable -> L5f
            yyk r1 = (defpackage.yyk) r1
            r1.d()
            return r6
        L5f:
            r6 = move-exception
            yyk r1 = (defpackage.yyk) r1
            r1.d()
            throw r6
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gav.b(yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb A[PHI: r2
  0x00eb: PHI (r2v11 java.lang.Object) = (r2v8 java.lang.Object), (r2v16 java.lang.Object) binds: [B:42:0x00e9, B:33:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112 A[PHI: r12
  0x0112: PHI (r12v11 java.lang.Object) = (r12v9 java.lang.Object), (r12v1 java.lang.Object) binds: [B:47:0x0110, B:31:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:52:0x012e, B:54:0x014a, B:55:0x0151, B:57:0x0155), top: B:115:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155 A[Catch: all -> 0x01c4, TRY_LEAVE, TryCatch #2 {all -> 0x01c4, blocks: (B:52:0x012e, B:54:0x014a, B:55:0x0151, B:57:0x0155), top: B:115:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0214  */
    /* JADX WARN: Type inference failed for: r11v0, types: [gav] */
    /* JADX WARN: Type inference failed for: r12v8, types: [gbo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [gbk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.yih r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gav.c(yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:284:0x0302, code lost:
    
        r4 = r5;
        r8 = r6;
        r16 = r7;
        r12 = r19;
        r7 = r20;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:134:0x042b, B:136:0x0430], limit reached: 290 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04f5 A[Catch: all -> 0x06b8, TryCatch #6 {all -> 0x06b8, blocks: (B:132:0x0414, B:175:0x04f5, B:177:0x04ff, B:181:0x051f, B:183:0x0526, B:184:0x0538, B:191:0x05c3, B:198:0x0624, B:200:0x063c, B:202:0x0649, B:204:0x064d, B:206:0x0652, B:205:0x0650, B:207:0x0655, B:185:0x0562, B:186:0x0576, B:187:0x0577, B:189:0x057e, B:190:0x058b, B:194:0x05e9, B:195:0x0616, B:136:0x0430, B:139:0x043c, B:142:0x0443, B:144:0x0449, B:146:0x0458, B:148:0x045f, B:150:0x047d, B:152:0x0486, B:154:0x048b, B:156:0x0492, B:161:0x04a5, B:163:0x04ae, B:165:0x04c4, B:167:0x04cb, B:169:0x04da, B:171:0x04e1, B:173:0x04ee, B:172:0x04e8, B:168:0x04d4, B:164:0x04bd, B:153:0x0489, B:149:0x0471, B:217:0x06a5, B:218:0x06b7), top: B:281:0x0414 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x063c A[Catch: all -> 0x06b8, TryCatch #6 {all -> 0x06b8, blocks: (B:132:0x0414, B:175:0x04f5, B:177:0x04ff, B:181:0x051f, B:183:0x0526, B:184:0x0538, B:191:0x05c3, B:198:0x0624, B:200:0x063c, B:202:0x0649, B:204:0x064d, B:206:0x0652, B:205:0x0650, B:207:0x0655, B:185:0x0562, B:186:0x0576, B:187:0x0577, B:189:0x057e, B:190:0x058b, B:194:0x05e9, B:195:0x0616, B:136:0x0430, B:139:0x043c, B:142:0x0443, B:144:0x0449, B:146:0x0458, B:148:0x045f, B:150:0x047d, B:152:0x0486, B:154:0x048b, B:156:0x0492, B:161:0x04a5, B:163:0x04ae, B:165:0x04c4, B:167:0x04cb, B:169:0x04da, B:171:0x04e1, B:173:0x04ee, B:172:0x04e8, B:168:0x04d4, B:164:0x04bd, B:153:0x0489, B:149:0x0471, B:217:0x06a5, B:218:0x06b7), top: B:281:0x0414 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06a5 A[Catch: all -> 0x06b8, TRY_ENTER, TryCatch #6 {all -> 0x06b8, blocks: (B:132:0x0414, B:175:0x04f5, B:177:0x04ff, B:181:0x051f, B:183:0x0526, B:184:0x0538, B:191:0x05c3, B:198:0x0624, B:200:0x063c, B:202:0x0649, B:204:0x064d, B:206:0x0652, B:205:0x0650, B:207:0x0655, B:185:0x0562, B:186:0x0576, B:187:0x0577, B:189:0x057e, B:190:0x058b, B:194:0x05e9, B:195:0x0616, B:136:0x0430, B:139:0x043c, B:142:0x0443, B:144:0x0449, B:146:0x0458, B:148:0x045f, B:150:0x047d, B:152:0x0486, B:154:0x048b, B:156:0x0492, B:161:0x04a5, B:163:0x04ae, B:165:0x04c4, B:167:0x04cb, B:169:0x04da, B:171:0x04e1, B:173:0x04ee, B:172:0x04e8, B:168:0x04d4, B:164:0x04bd, B:153:0x0489, B:149:0x0471, B:217:0x06a5, B:218:0x06b7), top: B:281:0x0414 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d2 A[Catch: all -> 0x0782, TRY_LEAVE, TryCatch #2 {all -> 0x0782, blocks: (B:76:0x02bc, B:78:0x02d2), top: B:275:0x02bc }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0348  */
    /* JADX WARN: Type inference failed for: r25v0, types: [gav] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.fzx r26, defpackage.fzn r27, defpackage.yih r28) {
        /*
            Method dump skipped, instructions count: 1984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gav.d(fzx, fzn, yih):java.lang.Object");
    }

    public final Object e(fzx fzxVar, gcf gcfVar, yih yihVar) throws Throwable {
        if (fzxVar.ordinal() == 0) {
            Object objC = c(yihVar);
            return objC == yio.a ? objC : ygi.a;
        }
        if (gcfVar == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        cb cbVar = this.g;
        fzxVar.getClass();
        if (fzxVar == fzx.b || fzxVar == fzx.c) {
            ((gog) cbVar.a).b(null, new aaw(fzxVar, gcfVar, 7, null));
            return ygi.a;
        }
        Objects.toString(fzxVar);
        throw new IllegalArgumentException("invalid load type for reset: ".concat(fzxVar.toString()));
    }

    public final Object f(gaw gawVar, fzx fzxVar, yih yihVar) {
        kvw kvwVar = gawVar.k;
        fzv fzvVarH = kvwVar.h(fzxVar);
        fzt fztVar = fzt.a;
        if (!yks.e(fzvVarH, fztVar)) {
            kvwVar.j(fzxVar, fztVar);
            Object objA = this.d.a(new gaa(kvwVar.i()), yihVar);
            if (objA == yio.a) {
                return objA;
            }
        }
        return ygi.a;
    }

    public final void g() {
        this.i.t(null);
    }

    public final void h(yow yowVar) {
        ykr.q(yowVar, null, 0, new gau(this, null, 1, null), 3);
        ykr.q(yowVar, null, 0, new gau(this, null, 0), 3);
    }
}
