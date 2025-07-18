package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bji {
    public final yjv a;
    public boolean c;
    public bjh f;
    private biq i;
    public final AtomicReference b = new AtomicReference(null);
    private final yjz g = new xa(this, 15);
    private final yjv h = new bap(this, 12);
    public final bfz d = new bfz(new bjh[16], 0);
    public final Object e = new Object();
    private long j = -1;

    public bji(yjv yjvVar) {
        this.a = yjvVar;
    }

    public static final void g() {
        bau.g("Unexpected notification");
        throw new yfs();
    }

    public final void a() {
        synchronized (this.e) {
            bfz bfzVar = this.d;
            Object[] objArr = bfzVar.a;
            int i = bfzVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                bjh bjhVar = (bjh) objArr[i2];
                bjhVar.i.i();
                bjhVar.j.i();
                bjhVar.l.i();
                bjhVar.g.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            java.lang.Object r2 = r1.e
            monitor-enter(r2)
            bfz r3 = r1.d     // Catch: java.lang.Throwable -> L9e
            int r4 = r3.b     // Catch: java.lang.Throwable -> L9e
            r6 = 0
            r7 = 0
        Ld:
            if (r6 >= r4) goto L92
            java.lang.Object[] r8 = r3.a     // Catch: java.lang.Throwable -> L9e
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L9e
            bjh r8 = (defpackage.bjh) r8     // Catch: java.lang.Throwable -> L9e
            ki r9 = r8.j     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r9 = r9.g(r0)     // Catch: java.lang.Throwable -> L9e
            jz r9 = (defpackage.jz) r9     // Catch: java.lang.Throwable -> L9e
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L79
        L22:
            java.lang.Object[] r10 = r9.b     // Catch: java.lang.Throwable -> L9e
            int[] r11 = r9.c     // Catch: java.lang.Throwable -> L9e
            long[] r9 = r9.a     // Catch: java.lang.Throwable -> L9e
            int r12 = r9.length     // Catch: java.lang.Throwable -> L9e
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L9e
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L9e
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L70
            int r5 = r13 - r12
            r6 = 0
        L46:
            int r1 = ~r5     // Catch: java.lang.Throwable -> L9e
            int r1 = r1 >>> 31
            r17 = r1
            r18 = 8
            int r1 = 8 - r17
            if (r6 >= r1) goto L6c
            r19 = 255(0xff, double:1.26E-321)
            long r19 = r14 & r19
            r21 = 128(0x80, double:6.3E-322)
            int r1 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r1 >= 0) goto L67
            int r1 = r13 << 3
            int r1 = r1 + r6
            r17 = r1
            r1 = r10[r17]     // Catch: java.lang.Throwable -> L9e
            r17 = r11[r17]     // Catch: java.lang.Throwable -> L9e
            r8.a(r0, r1)     // Catch: java.lang.Throwable -> L9e
        L67:
            long r14 = r14 >> r18
            int r6 = r6 + 1
            goto L46
        L6c:
            r6 = r18
            if (r1 != r6) goto L79
        L70:
            if (r13 == r12) goto L79
            int r13 = r13 + 1
            r1 = r23
            r6 = r16
            goto L2e
        L79:
            boolean r1 = r8.b()     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L82
            int r7 = r7 + 1
            goto L8c
        L82:
            if (r7 <= 0) goto L8c
            java.lang.Object[] r1 = r3.a     // Catch: java.lang.Throwable -> L9e
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L9e
            r1[r6] = r5     // Catch: java.lang.Throwable -> L9e
        L8c:
            int r6 = r16 + 1
            r1 = r23
            goto Ld
        L92:
            java.lang.Object[] r0 = r3.a     // Catch: java.lang.Throwable -> L9e
            int r1 = r4 - r7
            r5 = 0
            defpackage.yfm.aD(r0, r5, r1, r4)     // Catch: java.lang.Throwable -> L9e
            r3.b = r1     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r2)
            return
        L9e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bji.b(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r23, defpackage.yjv r24, defpackage.yjk r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bji.c(java.lang.Object, yjv, yjk):void");
    }

    public final void d() {
        this.i = bcm.x(this.g);
    }

    public final void e() {
        biq biqVar = this.i;
        if (biqVar != null) {
            biqVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0282 A[PHI: r25
  0x0282: PHI (r25v48 int) = (r25v47 int), (r25v49 int) binds: [B:120:0x0259, B:128:0x0280] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a8 A[Catch: all -> 0x06bc, TryCatch #2 {all -> 0x06bc, blocks: (B:45:0x00b7, B:47:0x00bd, B:159:0x0311, B:51:0x00cd, B:53:0x00d3, B:55:0x00d9, B:57:0x00dd, B:60:0x00f2, B:62:0x0102, B:64:0x010d, B:66:0x0113, B:68:0x012e, B:69:0x0130, B:71:0x013c, B:73:0x0142, B:75:0x0146, B:78:0x0157, B:80:0x0167, B:82:0x0172, B:84:0x0178, B:86:0x0188, B:99:0x01d0, B:92:0x019a, B:93:0x01a5, B:95:0x01b6, B:134:0x02a2, B:136:0x02a8, B:138:0x02ac, B:141:0x02b9, B:143:0x02c5, B:145:0x02d2, B:147:0x02d8, B:148:0x02e2, B:154:0x02f1, B:155:0x02f4, B:105:0x01f8, B:107:0x020e, B:109:0x022a, B:110:0x022c, B:112:0x0238, B:114:0x023e, B:116:0x0242, B:119:0x024f, B:121:0x025b, B:123:0x0268, B:125:0x026e, B:126:0x0278, B:130:0x0284, B:131:0x0287, B:132:0x028d, B:280:0x05bb, B:282:0x05c1, B:284:0x05c7, B:286:0x05df, B:288:0x05e3, B:291:0x05f0, B:293:0x05ff, B:295:0x060c, B:297:0x0612, B:299:0x0622, B:301:0x0636, B:303:0x0640, B:309:0x065c, B:317:0x0690, B:310:0x0666, B:312:0x0677, B:314:0x0682, B:318:0x069a, B:166:0x0351, B:168:0x0376, B:169:0x0389, B:171:0x038f, B:173:0x0397, B:177:0x03a3, B:179:0x03ab, B:181:0x03b1, B:183:0x03b5, B:186:0x03c2, B:188:0x03cf, B:190:0x03dc, B:192:0x03e2, B:194:0x03fd, B:195:0x03ff, B:197:0x040d, B:199:0x0413, B:201:0x0417, B:204:0x0428, B:206:0x0436, B:208:0x0443, B:210:0x0449, B:212:0x0459, B:224:0x049e, B:218:0x046d, B:219:0x0474, B:220:0x0482, B:258:0x0559, B:260:0x055f, B:262:0x0563, B:265:0x0570, B:267:0x057c, B:269:0x0589, B:271:0x058f, B:272:0x0599, B:276:0x05a5, B:277:0x05a8, B:230:0x04cb, B:231:0x04da, B:233:0x04ea, B:234:0x04ec, B:236:0x04f8, B:238:0x04fe, B:240:0x0502, B:243:0x050f, B:245:0x051b, B:247:0x0528, B:249:0x052e, B:250:0x0538, B:254:0x0544, B:255:0x0547, B:256:0x054d), top: B:348:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x030f A[EDGE_INSN: B:375:0x030f->B:158:0x030f BREAK  A[LOOP:8: B:141:0x02b9->B:154:0x02f1], PHI: r3 r25 r29 r30 r34 r35 r36 r37 r38 r42 r44
  0x030f: PHI (r3v28 java.util.HashMap) = (r3v29 java.util.HashMap), (r3v31 java.util.HashMap), (r3v31 java.util.HashMap), (r3v31 java.util.HashMap) binds: [B:157:0x0300, B:135:0x02a6, B:139:0x02b5, B:375:0x030f] A[DONT_GENERATE, DONT_INLINE]
  0x030f: PHI (r25v38 int) = (r25v36 int), (r25v39 int), (r25v39 int), (r25v42 int) binds: [B:157:0x0300, B:135:0x02a6, B:139:0x02b5, B:375:0x030f] A[DONT_GENERATE, DONT_INLINE]
  0x030f: PHI (r29v21 int) = (r29v22 int), (r29v26 int), (r29v26 int), (r29v26 int) binds: [B:157:0x0300, B:135:0x02a6, B:139:0x02b5, B:375:0x030f] A[DONT_GENERATE, DONT_INLINE]
  0x030f: PHI (r30v13 long) = (r30v14 long), (r30v15 long), (r30v15 long), (r30v15 long) binds: [B:157:0x0300, B:135:0x02a6, B:139:0x02b5, B:375:0x030f] A[DONT_GENERATE, DONT_INLINE]
  0x030f: PHI (r34v8 java.util.Set) = (r34v9 java.util.Set), (r34v11 java.util.Set), (r34v11 java.util.Set), (r34v11 java.util.Set) binds: [B:157:0x0300, B:135:0x02a6, B:139:0x02b5, B:375:0x030f] A[DONT_GENERATE, DONT_INLINE]
  0x030f: PHI (r35v8 java.lang.Object[]) = (r35v9 java.lang.Object[]), (r35v11 java.lang.Object[]), (r35v11 java.lang.Object[]), (r35v11 java.lang.Object[]) binds: [B:157:0x0300, B:135:0x02a6, B:139:0x02b5, B:375:0x030f] A[DONT_GENERATE, DONT_INLINE]
  0x030f: PHI (r36v8 int) = (r36v9 int), (r36v11 int), (r36v11 int), (r36v11 int) binds: [B:157:0x0300, B:135:0x02a6, B:139:0x02b5, B:375:0x030f] A[DONT_GENERATE, DONT_INLINE]
  0x030f: PHI (r37v8 int) = (r37v9 int), (r37v11 int), (r37v11 int), (r37v11 int) binds: [B:157:0x0300, B:135:0x02a6, B:139:0x02b5, B:375:0x030f] A[DONT_GENERATE, DONT_INLINE]
  0x030f: PHI (r38v4 java.lang.Object[]) = (r38v5 java.lang.Object[]), (r38v7 java.lang.Object[]), (r38v7 java.lang.Object[]), (r38v7 java.lang.Object[]) binds: [B:157:0x0300, B:135:0x02a6, B:139:0x02b5, B:375:0x030f] A[DONT_GENERATE, DONT_INLINE]
  0x030f: PHI (r42v2 int) = (r42v3 int), (r42v5 int), (r42v5 int), (r42v5 int) binds: [B:157:0x0300, B:135:0x02a6, B:139:0x02b5, B:375:0x030f] A[DONT_GENERATE, DONT_INLINE]
  0x030f: PHI (r44v18 ki) = (r44v19 ki), (r44v21 ki), (r44v21 ki), (r44v21 ki) binds: [B:157:0x0300, B:135:0x02a6, B:139:0x02b5, B:375:0x030f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0542 A[PHI: r25
  0x0542: PHI (r25v13 int) = (r25v12 int), (r25v14 int) binds: [B:244:0x0519, B:252:0x0540] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x055f A[Catch: all -> 0x06bc, TryCatch #2 {all -> 0x06bc, blocks: (B:45:0x00b7, B:47:0x00bd, B:159:0x0311, B:51:0x00cd, B:53:0x00d3, B:55:0x00d9, B:57:0x00dd, B:60:0x00f2, B:62:0x0102, B:64:0x010d, B:66:0x0113, B:68:0x012e, B:69:0x0130, B:71:0x013c, B:73:0x0142, B:75:0x0146, B:78:0x0157, B:80:0x0167, B:82:0x0172, B:84:0x0178, B:86:0x0188, B:99:0x01d0, B:92:0x019a, B:93:0x01a5, B:95:0x01b6, B:134:0x02a2, B:136:0x02a8, B:138:0x02ac, B:141:0x02b9, B:143:0x02c5, B:145:0x02d2, B:147:0x02d8, B:148:0x02e2, B:154:0x02f1, B:155:0x02f4, B:105:0x01f8, B:107:0x020e, B:109:0x022a, B:110:0x022c, B:112:0x0238, B:114:0x023e, B:116:0x0242, B:119:0x024f, B:121:0x025b, B:123:0x0268, B:125:0x026e, B:126:0x0278, B:130:0x0284, B:131:0x0287, B:132:0x028d, B:280:0x05bb, B:282:0x05c1, B:284:0x05c7, B:286:0x05df, B:288:0x05e3, B:291:0x05f0, B:293:0x05ff, B:295:0x060c, B:297:0x0612, B:299:0x0622, B:301:0x0636, B:303:0x0640, B:309:0x065c, B:317:0x0690, B:310:0x0666, B:312:0x0677, B:314:0x0682, B:318:0x069a, B:166:0x0351, B:168:0x0376, B:169:0x0389, B:171:0x038f, B:173:0x0397, B:177:0x03a3, B:179:0x03ab, B:181:0x03b1, B:183:0x03b5, B:186:0x03c2, B:188:0x03cf, B:190:0x03dc, B:192:0x03e2, B:194:0x03fd, B:195:0x03ff, B:197:0x040d, B:199:0x0413, B:201:0x0417, B:204:0x0428, B:206:0x0436, B:208:0x0443, B:210:0x0449, B:212:0x0459, B:224:0x049e, B:218:0x046d, B:219:0x0474, B:220:0x0482, B:258:0x0559, B:260:0x055f, B:262:0x0563, B:265:0x0570, B:267:0x057c, B:269:0x0589, B:271:0x058f, B:272:0x0599, B:276:0x05a5, B:277:0x05a8, B:230:0x04cb, B:231:0x04da, B:233:0x04ea, B:234:0x04ec, B:236:0x04f8, B:238:0x04fe, B:240:0x0502, B:243:0x050f, B:245:0x051b, B:247:0x0528, B:249:0x052e, B:250:0x0538, B:254:0x0544, B:255:0x0547, B:256:0x054d), top: B:348:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05a3 A[PHI: r25
  0x05a3: PHI (r25v7 int) = (r25v6 int), (r25v8 int) binds: [B:266:0x057a, B:274:0x05a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05c1 A[Catch: all -> 0x06bc, TryCatch #2 {all -> 0x06bc, blocks: (B:45:0x00b7, B:47:0x00bd, B:159:0x0311, B:51:0x00cd, B:53:0x00d3, B:55:0x00d9, B:57:0x00dd, B:60:0x00f2, B:62:0x0102, B:64:0x010d, B:66:0x0113, B:68:0x012e, B:69:0x0130, B:71:0x013c, B:73:0x0142, B:75:0x0146, B:78:0x0157, B:80:0x0167, B:82:0x0172, B:84:0x0178, B:86:0x0188, B:99:0x01d0, B:92:0x019a, B:93:0x01a5, B:95:0x01b6, B:134:0x02a2, B:136:0x02a8, B:138:0x02ac, B:141:0x02b9, B:143:0x02c5, B:145:0x02d2, B:147:0x02d8, B:148:0x02e2, B:154:0x02f1, B:155:0x02f4, B:105:0x01f8, B:107:0x020e, B:109:0x022a, B:110:0x022c, B:112:0x0238, B:114:0x023e, B:116:0x0242, B:119:0x024f, B:121:0x025b, B:123:0x0268, B:125:0x026e, B:126:0x0278, B:130:0x0284, B:131:0x0287, B:132:0x028d, B:280:0x05bb, B:282:0x05c1, B:284:0x05c7, B:286:0x05df, B:288:0x05e3, B:291:0x05f0, B:293:0x05ff, B:295:0x060c, B:297:0x0612, B:299:0x0622, B:301:0x0636, B:303:0x0640, B:309:0x065c, B:317:0x0690, B:310:0x0666, B:312:0x0677, B:314:0x0682, B:318:0x069a, B:166:0x0351, B:168:0x0376, B:169:0x0389, B:171:0x038f, B:173:0x0397, B:177:0x03a3, B:179:0x03ab, B:181:0x03b1, B:183:0x03b5, B:186:0x03c2, B:188:0x03cf, B:190:0x03dc, B:192:0x03e2, B:194:0x03fd, B:195:0x03ff, B:197:0x040d, B:199:0x0413, B:201:0x0417, B:204:0x0428, B:206:0x0436, B:208:0x0443, B:210:0x0449, B:212:0x0459, B:224:0x049e, B:218:0x046d, B:219:0x0474, B:220:0x0482, B:258:0x0559, B:260:0x055f, B:262:0x0563, B:265:0x0570, B:267:0x057c, B:269:0x0589, B:271:0x058f, B:272:0x0599, B:276:0x05a5, B:277:0x05a8, B:230:0x04cb, B:231:0x04da, B:233:0x04ea, B:234:0x04ec, B:236:0x04f8, B:238:0x04fe, B:240:0x0502, B:243:0x050f, B:245:0x051b, B:247:0x0528, B:249:0x052e, B:250:0x0538, B:254:0x0544, B:255:0x0547, B:256:0x054d), top: B:348:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x06cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x05b3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bji.f():boolean");
    }
}
