package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afqs implements Runnable {
    public final afir a;
    final /* synthetic */ afqv b;

    public afqs(afqv afqvVar, afir afirVar) {
        this.b = afqvVar;
        afirVar.getClass();
        this.a = afirVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x028b, code lost:
    
        r9 = new java.lang.Object[2];
        r9[r16 ? 1 : 0] = r5;
        r9[1] = "serviceConfig";
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x029d, code lost:
    
        throw new defpackage.yrz(java.lang.String.format("key '%s' missing in '%s'", r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023a A[Catch: RuntimeException -> 0x02a6, all -> 0x0613, IOException -> 0x0617, TRY_LEAVE, TryCatch #1 {IOException -> 0x0617, blocks: (B:6:0x0028, B:11:0x0042, B:13:0x004f, B:15:0x0056, B:17:0x005e, B:18:0x0069, B:19:0x0078, B:26:0x00c0, B:29:0x00c8, B:65:0x0133, B:67:0x0139, B:94:0x01d2, B:95:0x01d7, B:97:0x01dd, B:98:0x01e3, B:99:0x01eb, B:101:0x01f1, B:102:0x0207, B:104:0x020f, B:106:0x0215, B:107:0x0219, B:109:0x021f, B:114:0x0232, B:116:0x023a, B:64:0x0126, B:32:0x00d4, B:54:0x010a, B:56:0x0114, B:58:0x0118, B:36:0x00df, B:40:0x00ea, B:42:0x00f0, B:50:0x0103, B:51:0x0104, B:9:0x003a), top: B:333:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0271 A[Catch: all -> 0x029e, IOException -> 0x02a1, RuntimeException -> 0x02a4, TryCatch #14 {RuntimeException -> 0x02a4, blocks: (B:122:0x024b, B:126:0x0259, B:128:0x0261, B:130:0x0267, B:131:0x026b, B:133:0x0271, B:135:0x027d, B:141:0x028b, B:142:0x029d), top: B:346:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0287 A[LOOP:2: B:95:0x01d7->B:140:0x0287, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02df A[Catch: all -> 0x029e, IOException -> 0x02a1, TryCatch #17 {IOException -> 0x02a1, blocks: (B:303:0x05ef, B:161:0x02df, B:163:0x02e3, B:269:0x0571, B:164:0x02ea, B:165:0x02f1, B:167:0x02f8, B:169:0x0305, B:170:0x030c, B:172:0x0312, B:174:0x031a, B:175:0x0329, B:178:0x0330, B:179:0x0339, B:181:0x033f, B:183:0x034b, B:184:0x036c, B:185:0x0392, B:186:0x0393, B:191:0x039e, B:193:0x03a4, B:194:0x03af, B:196:0x03b5, B:198:0x03c3, B:199:0x03c7, B:201:0x03cd, B:202:0x03e4, B:204:0x03ee, B:216:0x0438, B:220:0x0441, B:223:0x044a, B:227:0x0467, B:231:0x0474, B:233:0x0483, B:237:0x049a, B:239:0x04a2, B:263:0x0540, B:241:0x04ad, B:242:0x04b7, B:244:0x04bd, B:246:0x04d0, B:248:0x04d6, B:249:0x04da, B:251:0x04e0, B:253:0x04f8, B:257:0x0507, B:258:0x050f, B:260:0x0515, B:261:0x0523, B:262:0x0535, B:236:0x0492, B:212:0x0429, B:214:0x042d, B:215:0x0434, B:205:0x03fb, B:207:0x0410, B:266:0x0547, B:155:0x02c1, B:122:0x024b, B:126:0x0259, B:128:0x0261, B:130:0x0267, B:131:0x026b, B:133:0x0271, B:135:0x027d, B:141:0x028b, B:142:0x029d, B:151:0x02a9, B:159:0x02ca, B:267:0x0559, B:285:0x059f), top: B:350:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x039e A[Catch: all -> 0x029e, IOException -> 0x02a1, RuntimeException -> 0x0398, TryCatch #0 {RuntimeException -> 0x0398, blocks: (B:167:0x02f8, B:169:0x0305, B:170:0x030c, B:172:0x0312, B:174:0x031a, B:175:0x0329, B:178:0x0330, B:179:0x0339, B:181:0x033f, B:183:0x034b, B:184:0x036c, B:185:0x0392, B:186:0x0393, B:191:0x039e, B:193:0x03a4, B:194:0x03af, B:196:0x03b5, B:198:0x03c3, B:199:0x03c7, B:201:0x03cd, B:202:0x03e4, B:204:0x03ee, B:205:0x03fb), top: B:332:0x02f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0429 A[Catch: all -> 0x029e, IOException -> 0x02a1, RuntimeException -> 0x0546, TryCatch #6 {RuntimeException -> 0x0546, blocks: (B:165:0x02f1, B:216:0x0438, B:220:0x0441, B:223:0x044a, B:227:0x0467, B:231:0x0474, B:233:0x0483, B:237:0x049a, B:239:0x04a2, B:263:0x0540, B:241:0x04ad, B:242:0x04b7, B:244:0x04bd, B:246:0x04d0, B:248:0x04d6, B:249:0x04da, B:251:0x04e0, B:253:0x04f8, B:257:0x0507, B:258:0x050f, B:260:0x0515, B:261:0x0523, B:262:0x0535, B:236:0x0492, B:212:0x0429, B:214:0x042d, B:215:0x0434, B:207:0x0410), top: B:338:0x02f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0492 A[Catch: all -> 0x029e, IOException -> 0x02a1, RuntimeException -> 0x0546, TryCatch #6 {RuntimeException -> 0x0546, blocks: (B:165:0x02f1, B:216:0x0438, B:220:0x0441, B:223:0x044a, B:227:0x0467, B:231:0x0474, B:233:0x0483, B:237:0x049a, B:239:0x04a2, B:263:0x0540, B:241:0x04ad, B:242:0x04b7, B:244:0x04bd, B:246:0x04d0, B:248:0x04d6, B:249:0x04da, B:251:0x04e0, B:253:0x04f8, B:257:0x0507, B:258:0x050f, B:260:0x0515, B:261:0x0523, B:262:0x0535, B:236:0x0492, B:212:0x0429, B:214:0x042d, B:215:0x0434, B:207:0x0410), top: B:338:0x02f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04a2 A[Catch: all -> 0x029e, IOException -> 0x02a1, RuntimeException -> 0x0546, TryCatch #6 {RuntimeException -> 0x0546, blocks: (B:165:0x02f1, B:216:0x0438, B:220:0x0441, B:223:0x044a, B:227:0x0467, B:231:0x0474, B:233:0x0483, B:237:0x049a, B:239:0x04a2, B:263:0x0540, B:241:0x04ad, B:242:0x04b7, B:244:0x04bd, B:246:0x04d0, B:248:0x04d6, B:249:0x04da, B:251:0x04e0, B:253:0x04f8, B:257:0x0507, B:258:0x050f, B:260:0x0515, B:261:0x0523, B:262:0x0535, B:236:0x0492, B:212:0x0429, B:214:0x042d, B:215:0x0434, B:207:0x0410), top: B:338:0x02f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04ad A[Catch: all -> 0x029e, IOException -> 0x02a1, RuntimeException -> 0x0546, TryCatch #6 {RuntimeException -> 0x0546, blocks: (B:165:0x02f1, B:216:0x0438, B:220:0x0441, B:223:0x044a, B:227:0x0467, B:231:0x0474, B:233:0x0483, B:237:0x049a, B:239:0x04a2, B:263:0x0540, B:241:0x04ad, B:242:0x04b7, B:244:0x04bd, B:246:0x04d0, B:248:0x04d6, B:249:0x04da, B:251:0x04e0, B:253:0x04f8, B:257:0x0507, B:258:0x050f, B:260:0x0515, B:261:0x0523, B:262:0x0535, B:236:0x0492, B:212:0x0429, B:214:0x042d, B:215:0x0434, B:207:0x0410), top: B:338:0x02f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0559 A[Catch: all -> 0x029e, IOException -> 0x02a1, TryCatch #17 {IOException -> 0x02a1, blocks: (B:303:0x05ef, B:161:0x02df, B:163:0x02e3, B:269:0x0571, B:164:0x02ea, B:165:0x02f1, B:167:0x02f8, B:169:0x0305, B:170:0x030c, B:172:0x0312, B:174:0x031a, B:175:0x0329, B:178:0x0330, B:179:0x0339, B:181:0x033f, B:183:0x034b, B:184:0x036c, B:185:0x0392, B:186:0x0393, B:191:0x039e, B:193:0x03a4, B:194:0x03af, B:196:0x03b5, B:198:0x03c3, B:199:0x03c7, B:201:0x03cd, B:202:0x03e4, B:204:0x03ee, B:216:0x0438, B:220:0x0441, B:223:0x044a, B:227:0x0467, B:231:0x0474, B:233:0x0483, B:237:0x049a, B:239:0x04a2, B:263:0x0540, B:241:0x04ad, B:242:0x04b7, B:244:0x04bd, B:246:0x04d0, B:248:0x04d6, B:249:0x04da, B:251:0x04e0, B:253:0x04f8, B:257:0x0507, B:258:0x050f, B:260:0x0515, B:261:0x0523, B:262:0x0535, B:236:0x0492, B:212:0x0429, B:214:0x042d, B:215:0x0434, B:205:0x03fb, B:207:0x0410, B:266:0x0547, B:155:0x02c1, B:122:0x024b, B:126:0x0259, B:128:0x0261, B:130:0x0267, B:131:0x026b, B:133:0x0271, B:135:0x027d, B:141:0x028b, B:142:0x029d, B:151:0x02a9, B:159:0x02ca, B:267:0x0559, B:285:0x059f), top: B:350:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0570 A[PHI: r16
  0x0570: PHI (r16v12 boolean) = (r16v11 boolean), (r16v15 boolean) binds: [B:267:0x0559, B:160:0x02dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05bb A[Catch: all -> 0x060d, IOException -> 0x0610, TRY_LEAVE, TryCatch #21 {IOException -> 0x0610, all -> 0x060d, blocks: (B:286:0x05b7, B:288:0x05bb, B:296:0x05dd, B:298:0x05e1, B:299:0x05e8, B:301:0x05ec), top: B:356:0x05b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05dd A[Catch: all -> 0x060d, IOException -> 0x0610, TRY_ENTER, TryCatch #21 {IOException -> 0x0610, all -> 0x060d, blocks: (B:286:0x05b7, B:288:0x05bb, B:296:0x05dd, B:298:0x05e1, B:299:0x05e8, B:301:0x05ec), top: B:356:0x05b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0590 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x028b A[EDGE_INSN: B:367:0x028b->B:141:0x028b BREAK  A[LOOP:2: B:95:0x01d7->B:140:0x0287], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139 A[Catch: all -> 0x0613, IOException -> 0x0617, TRY_LEAVE, TryCatch #1 {IOException -> 0x0617, blocks: (B:6:0x0028, B:11:0x0042, B:13:0x004f, B:15:0x0056, B:17:0x005e, B:18:0x0069, B:19:0x0078, B:26:0x00c0, B:29:0x00c8, B:65:0x0133, B:67:0x0139, B:94:0x01d2, B:95:0x01d7, B:97:0x01dd, B:98:0x01e3, B:99:0x01eb, B:101:0x01f1, B:102:0x0207, B:104:0x020f, B:106:0x0215, B:107:0x0219, B:109:0x021f, B:114:0x0232, B:116:0x023a, B:64:0x0126, B:32:0x00d4, B:54:0x010a, B:56:0x0114, B:58:0x0118, B:36:0x00df, B:40:0x00ea, B:42:0x00f0, B:50:0x0103, B:51:0x0104, B:9:0x003a), top: B:333:0x0028 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afqs.run():void");
    }
}
