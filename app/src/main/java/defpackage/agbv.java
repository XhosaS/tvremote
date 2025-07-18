package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agbv implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ CyclicBarrier b;
    final /* synthetic */ agbe c;
    final /* synthetic */ CountDownLatch d;
    final /* synthetic */ agca e;

    public agbv(agca agcaVar, CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier, agbe agbeVar, CountDownLatch countDownLatch2) {
        this.a = countDownLatch;
        this.b = cyclicBarrier;
        this.c = agbeVar;
        this.d = countDownLatch2;
        this.e = agcaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0292, code lost:
    
        if (r1 < 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0296, code lost:
    
        if (r1 <= 8) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02b1, code lost:
    
        throw new java.lang.IllegalArgumentException("startIndex: " + r1 + " > endIndex: 8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02c2, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected code point: 0x".concat(new java.lang.String(r10, r1, 8 - r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02dc, code lost:
    
        throw new java.lang.IndexOutOfBoundsException("startIndex: " + r1 + ", endIndex: 8, size: 8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02dd, code lost:
    
        r32 = r9;
        r29 = r11;
        r1 = r2.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e9, code lost:
    
        r2 = new defpackage.ahwx();
        r2.z(r7, 0, r8);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
    
        if (r8 >= r6) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x09c2, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f4, code lost:
    
        r3 = r7.codePointAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x09ce, code lost:
    
        defpackage.afrq.h(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
    
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fc, code lost:
    
        if (r3 != 37) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fe, code lost:
    
        r3 = r28 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0100, code lost:
    
        if (r3 >= r6) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0104, code lost:
    
        r8 = defpackage.agdw.a(r7.charAt(r28 + 1));
        r3 = defpackage.agdw.a(r7.charAt(r3));
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
    
        if (r8 == (-1)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011b, code lost:
    
        if (r3 == (-1)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011d, code lost:
    
        r2.u((r8 << 4) + r3);
        r32 = r9;
        r8 = r3;
        r3 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
    
        r3 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012f, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0131, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0132, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0134, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0135, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0137, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0138, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013a, code lost:
    
        r3 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013c, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (r3 >= 128) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0142, code lost:
    
        r2.u(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0145, code lost:
    
        r33 = r3;
        r32 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014d, code lost:
    
        if (r3 >= 2048) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0150, code lost:
    
        r8 = r2.m(2);
        r11 = r8.a;
        r11 = r8.c;
        r11[r11] = (byte) ((r3 >> 6) | 192);
        r11[r11 + 1] = (byte) (128 | (r3 & 63));
        r8.c = r11 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0173, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0174, code lost:
    
        r2.b += 2;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017e, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0183, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0189, code lost:
    
        if (r3 < 55296) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018e, code lost:
    
        if (r3 >= 57344) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        r2.u(63);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0193, code lost:
    
        r32 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0195, code lost:
    
        r33 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0199, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019d, code lost:
    
        if (r3 >= 65536) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a0, code lost:
    
        r11 = r2.m(3);
        r8 = r11.a;
        r9 = r11.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01aa, code lost:
    
        r32 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b1, code lost:
    
        r8[r9] = (byte) ((r3 >> 12) | 224);
        r8[r9 + 1] = (byte) (((r3 >> 6) & 63) | 128);
        r8[r9 + 2] = (byte) ((r3 & 63) | 128);
        r11.c = r9 + 3;
        r2.b += 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01dc, code lost:
    
        r32 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e3, code lost:
    
        if (r3 > 1114111) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e5, code lost:
    
        r8 = r2.m(4);
        r1 = r8.a;
        r9 = r8.c;
        r1[r9] = (byte) ((r3 >> 18) | 240);
        r33 = r3;
        r1[r9 + 1] = (byte) (((r3 >> 12) & 63) | 128);
        r1[r9 + 2] = (byte) (((r33 >> 6) & 63) | 128);
        r1[r9 + 3] = (byte) (128 | (r33 & 63));
        r8.c = r9 + 4;
        r2.b += 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0223, code lost:
    
        r8 = r28;
        r3 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0227, code lost:
    
        r8 = r8 + java.lang.Character.charCount(r3);
        r1 = r39;
        r11 = r29;
        r9 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0234, code lost:
    
        r33 = r3;
        r2 = defpackage.ahxv.a;
        r10 = new char[]{r2[r33 >> 28], r2[(r33 >> 24) & 15], r2[(r33 >> 20) & 15], r2[(r33 >> 16) & 15], r2[(r33 >> 12) & 15], r2[(r33 >> 8) & 15], r2[(r33 >> 4) & 15], r2[r33 & 15]};
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0287, code lost:
    
        if (r1 >= 8) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x028d, code lost:
    
        if (r10[r1] != '0') goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x028f, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0481 A[Catch: all -> 0x099c, Exception -> 0x09a1, StatusException -> 0x09a6, IOException -> 0x09ab, TRY_ENTER, TryCatch #8 {IOException -> 0x09ab, blocks: (B:93:0x0227, B:86:0x01b1, B:91:0x01e5, B:94:0x0234, B:97:0x0289, B:99:0x028f, B:103:0x0298, B:104:0x02b1, B:105:0x02b2, B:106:0x02c2, B:107:0x02c3, B:108:0x02dc, B:109:0x02dd, B:122:0x0309, B:124:0x0313, B:126:0x031b, B:188:0x0481, B:192:0x048e, B:194:0x0494, B:196:0x0498, B:199:0x04ce, B:201:0x04fe, B:202:0x0541, B:209:0x05a3, B:210:0x05ad, B:207:0x054d, B:208:0x0581, B:211:0x05b5, B:212:0x05ba, B:213:0x05bb, B:215:0x05bf, B:217:0x05f2, B:218:0x060d, B:220:0x0621, B:222:0x0629, B:224:0x0633, B:226:0x063c, B:238:0x0669, B:241:0x0671, B:242:0x0679, B:244:0x0681, B:246:0x0689, B:247:0x0692, B:248:0x069d, B:249:0x069e, B:230:0x0643, B:231:0x0646, B:232:0x0651, B:233:0x0652, B:234:0x065d, B:235:0x065e, B:237:0x0666, B:129:0x032d, B:132:0x0339, B:136:0x033f, B:138:0x0343, B:140:0x0349, B:141:0x034c, B:147:0x0356, B:148:0x035a, B:149:0x0360, B:153:0x0367, B:155:0x036d, B:157:0x0373, B:158:0x0376, B:160:0x038f, B:165:0x042f, B:161:0x039b, B:163:0x040c, B:164:0x0424, B:166:0x043d, B:167:0x0444, B:168:0x0449, B:170:0x044c, B:174:0x045e, B:176:0x0464, B:181:0x0471, B:121:0x02fe), top: B:418:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x08b6 A[Catch: all -> 0x08b8, DONT_GENERATE, TryCatch #14 {, blocks: (B:321:0x0874, B:323:0x087f, B:325:0x0888, B:328:0x088f, B:330:0x0895, B:334:0x089a, B:335:0x08b6), top: B:422:0x0874, inners: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x098c A[Catch: IOException -> 0x09bd, all -> 0x0a0a, Exception -> 0x0a0c, StatusException -> 0x0a0e, TryCatch #17 {IOException -> 0x09bd, blocks: (B:347:0x08c8, B:353:0x08f4, B:354:0x091d, B:351:0x08d9, B:358:0x0938, B:359:0x0947, B:356:0x0928, B:357:0x0937, B:360:0x0948, B:361:0x0957, B:362:0x0958, B:363:0x0963, B:364:0x0964, B:365:0x096f, B:366:0x0970, B:367:0x097b, B:368:0x097c, B:369:0x098b, B:370:0x098c, B:371:0x099b, B:380:0x09b1, B:381:0x09bc), top: B:427:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x09ce A[Catch: all -> 0x0a0a, Exception -> 0x0a0c, StatusException -> 0x0a0e, TRY_ENTER, TryCatch #28 {StatusException -> 0x0a0e, Exception -> 0x0a0c, all -> 0x0a0a, blocks: (B:259:0x06bc, B:261:0x06c2, B:263:0x06d2, B:265:0x06d8, B:267:0x06e3, B:269:0x06ee, B:271:0x0703, B:273:0x0711, B:275:0x0726, B:278:0x0734, B:280:0x0741, B:282:0x074f, B:283:0x0752, B:285:0x0758, B:287:0x075c, B:289:0x076c, B:291:0x0776, B:293:0x0780, B:296:0x078b, B:297:0x0796, B:298:0x0797, B:300:0x07c0, B:302:0x07c8, B:304:0x07d7, B:306:0x07e1, B:307:0x07ea, B:308:0x07f9, B:279:0x0738, B:276:0x072a, B:268:0x06e8, B:309:0x07fa, B:391:0x09ce, B:392:0x09d1, B:393:0x09e1, B:347:0x08c8, B:348:0x08cd, B:352:0x08f1, B:353:0x08f4, B:354:0x091d, B:351:0x08d9, B:358:0x0938, B:359:0x0947, B:356:0x0928, B:357:0x0937, B:360:0x0948, B:361:0x0957, B:362:0x0958, B:363:0x0963, B:364:0x0964, B:365:0x096f, B:366:0x0970, B:367:0x097b, B:368:0x097c, B:369:0x098b, B:370:0x098c, B:371:0x099b, B:380:0x09b1, B:381:0x09bc, B:394:0x09e2, B:395:0x0a09), top: B:447:0x004f }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [agbv] */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r3v0, types: [ahxk] */
    /* JADX WARN: Type inference failed for: r3v10, types: [agbv] */
    /* JADX WARN: Type inference failed for: r3v12, types: [agbv] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [agbv] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v85, types: [agbv] */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v90 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agbv.run():void");
    }
}
