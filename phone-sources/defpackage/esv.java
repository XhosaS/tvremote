package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.decoder.CryptoConfig;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class esv extends ehv {
    private static final byte[] f = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final esk A;
    private final MediaCodec.BufferInfo B;
    private final ArrayDeque C;
    private final emq D;
    private dze E;
    private dze F;
    private eox G;
    private eox H;
    private MediaCrypto I;
    private float J;
    private boolean K;
    private float L;
    private ArrayDeque M;
    private est N;
    private int O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private long T;
    private long U;
    private int V;
    private int W;
    private ByteBuffer X;
    private boolean Y;
    private boolean Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private int ad;
    private int ae;
    private int af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private long aj;
    private boolean ak;
    private boolean al;
    private esu am;
    private long an;
    private boolean ao;
    private long ap;
    private long aq;
    private final eso g;
    private final esx h;
    private final float i;
    public float j;
    public esp k;
    public dze l;
    public MediaFormat m;
    public ess n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public eii s;
    public ehw t;
    public boolean u;
    public boolean v;
    public pku w;
    private final ehk x;
    private final ehk y;
    private final ehk z;

    public esv(int i, eso esoVar, esx esxVar, float f2) {
        super(i);
        this.g = esoVar;
        esxVar.getClass();
        this.h = esxVar;
        this.i = f2;
        this.x = new ehk(0);
        this.y = new ehk(0);
        this.z = new ehk(2);
        esk eskVar = new esk();
        this.A = eskVar;
        this.B = new MediaCodec.BufferInfo();
        this.j = 1.0f;
        this.J = 1.0f;
        this.C = new ArrayDeque();
        this.am = esu.a;
        eskVar.a(0);
        eskVar.c.order(ByteOrder.nativeOrder());
        this.D = new emq();
        this.L = -1.0f;
        this.O = 0;
        this.ad = 0;
        this.V = -1;
        this.W = -1;
        this.U = -9223372036854775807L;
        this.aj = -9223372036854775807L;
        this.p = -9223372036854775807L;
        this.an = -9223372036854775807L;
        this.T = -9223372036854775807L;
        this.ae = 0;
        this.af = 0;
        this.t = new ehw();
        this.ap = -9223372036854775807L;
        this.aq = -9223372036854775807L;
    }

    protected static boolean aC(dze dzeVar) {
        int i = dzeVar.az;
        return i == 0 || i == 2;
    }

    private final void aG() {
        this.o = false;
        aL();
    }

    private final void aH() throws Throwable {
        if (!this.ag) {
            aK();
        } else {
            this.ae = 1;
            this.af = 3;
        }
    }

    private final void aI() {
        try {
            esp espVar = this.k;
            eci.e(espVar);
            espVar.h();
        } finally {
            au();
        }
    }

    private final void aJ() throws Throwable {
        int i = this.af;
        if (i == 1) {
            aI();
            return;
        }
        if (i == 2) {
            aI();
            aS();
        } else if (i == 3) {
            aK();
        } else {
            this.q = true;
            ag();
        }
    }

    private final void aK() throws Throwable {
        at();
        aq();
    }

    private final void aL() {
        aM();
        this.ab = false;
        this.A.clear();
        this.z.clear();
        this.aa = false;
        emq emqVar = this.D;
        emqVar.c = ebu.a;
        emqVar.e = 0;
        emqVar.d = 2;
    }

    private final void aM() {
        this.aj = -9223372036854775807L;
        this.p = -9223372036854775807L;
        this.an = -9223372036854775807L;
    }

    private final void aN() {
        this.V = -1;
        this.y.c = null;
    }

    private final void aO() {
        this.W = -1;
        this.X = null;
    }

    private final void aP(eox eoxVar) {
        cme.C(this.G, eoxVar);
        this.G = eoxVar;
    }

    private final void aQ(esu esuVar) {
        this.am = esuVar;
        if (esuVar.d != -9223372036854775807L) {
            this.ao = true;
        }
    }

    private final void aR(eox eoxVar) {
        cme.C(this.H, eoxVar);
        this.H = eoxVar;
    }

    private final void aS() throws MediaCryptoException, eii {
        eox eoxVar = this.H;
        eoxVar.getClass();
        CryptoConfig cryptoConfigB = eoxVar.b();
        if (cryptoConfigB instanceof epn) {
            try {
                MediaCrypto mediaCrypto = this.I;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((epn) cryptoConfigB).c);
            } catch (MediaCryptoException e) {
                throw h(e, this.E, 6006);
            }
        }
        aP(this.H);
        this.ae = 0;
        this.af = 0;
    }

    private final boolean aT() {
        if (this.k == null) {
            return false;
        }
        if (aB()) {
            at();
            return true;
        }
        if (az()) {
            aI();
            return false;
        }
        long j = this.aq;
        if (j == -9223372036854775807L || this.c > j || this.an >= j) {
            return false;
        }
        this.v = true;
        this.aq = -9223372036854775807L;
        return false;
    }

    private final boolean aU() {
        return this.W >= 0;
    }

    private final boolean aV() throws eii {
        a.ab(this.I == null);
        eox eoxVar = this.G;
        CryptoConfig cryptoConfigB = eoxVar.b();
        if (epn.a && (cryptoConfigB instanceof epn)) {
            int iA = eoxVar.a();
            if (iA == 1) {
                eow eowVarC = eoxVar.c();
                eowVarC.getClass();
                throw h(eowVarC, this.E, eowVarC.a);
            }
            if (iA != 4) {
                return false;
            }
        }
        if (cryptoConfigB == null) {
            return eoxVar.c() != null;
        }
        if (cryptoConfigB instanceof epn) {
            epn epnVar = (epn) cryptoConfigB;
            try {
                this.I = new MediaCrypto(epnVar.b, epnVar.c);
            } catch (MediaCryptoException e) {
                throw h(e, this.E, 6006);
            }
        }
        return true;
    }

    private final boolean aW(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        dze dzeVar = this.F;
        return (dzeVar != null && Objects.equals(dzeVar.Y, "audio/opus") && fki.Q(j, j2)) ? false : true;
    }

    private final boolean aX(int i) throws Throwable {
        hig higVarT = T();
        ehk ehkVar = this.x;
        ehkVar.clear();
        int iS = S(higVarT, ehkVar, i | 4);
        if (iS == -5) {
            al(higVarT);
            return true;
        }
        if (iS != -4 || !ehkVar.isEndOfStream()) {
            return false;
        }
        this.ak = true;
        aJ();
        return false;
    }

    private final void aY() throws MediaCryptoException, eii {
        if (!this.ag) {
            aS();
        } else {
            this.ae = 1;
            this.af = 2;
        }
    }

    @Override // defpackage.ehv
    protected void A() {
        try {
            aG();
            at();
        } finally {
            aR(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // defpackage.ehv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void D(defpackage.dze[] r12, long r13, long r15, defpackage.evz r17) {
        /*
            r11 = this;
            esu r12 = r11.am
            long r0 = r12.d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            esu r4 = new esu
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.aQ(r4)
            boolean r12 = r11.u
            if (r12 == 0) goto L56
            r11.af()
            return
        L24:
            java.util.ArrayDeque r12 = r11.C
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.aj
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.an
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            esu r4 = new esu
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.aQ(r4)
            esu r12 = r11.am
            long r12 = r12.d
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.af()
        L56:
            return
        L57:
            esu r0 = new esu
            long r1 = r11.aj
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esv.D(dze[], long, long, evz):void");
    }

    @Override // defpackage.ehv, defpackage.ekc
    public void K(float f2, float f3) throws Throwable {
        this.j = f2;
        this.J = f3;
        aD(this.l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x031d, code lost:
    
        r27.aa = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04c9, code lost:
    
        if (r27.S != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04cb, code lost:
    
        r27.ah = true;
        r2.o(r27.V, 0, 0, 4);
        aN();
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x04d9, code lost:
    
        r27.ae = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r27.q = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0678, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0679, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0473 A[Catch: IllegalStateException -> 0x069e, CryptoException -> 0x06ee, TryCatch #1 {CryptoException -> 0x06ee, blocks: (B:8:0x0011, B:10:0x0015, B:12:0x0019, B:14:0x001e, B:16:0x0024, B:19:0x002c, B:20:0x0031, B:22:0x003f, B:24:0x0068, B:169:0x033b, B:376:0x0696, B:25:0x0070, B:28:0x0075, B:33:0x007e, B:35:0x0082, B:37:0x008c, B:43:0x0096, B:45:0x009a, B:47:0x00a0, B:54:0x00b5, B:55:0x00c4, B:60:0x00d1, B:62:0x00d7, B:159:0x0323, B:161:0x0329, B:162:0x032c, B:164:0x0332, B:166:0x0336, B:64:0x00dd, B:66:0x00e3, B:68:0x00eb, B:70:0x00fb, B:73:0x0105, B:76:0x010b, B:78:0x011a, B:80:0x0124, B:81:0x0142, B:84:0x014c, B:86:0x0153, B:88:0x015b, B:90:0x0161, B:91:0x0168, B:93:0x0172, B:96:0x018e, B:99:0x0193, B:101:0x0199, B:103:0x01a0, B:106:0x01a8, B:109:0x01c3, B:115:0x01d1, B:117:0x01d9, B:122:0x01f0, B:125:0x01fa, B:127:0x0232, B:129:0x023a, B:131:0x0246, B:133:0x024c, B:137:0x0275, B:139:0x0282, B:138:0x027d, B:142:0x0289, B:143:0x0293, B:145:0x02a2, B:147:0x02da, B:146:0x02c1, B:126:0x022b, B:121:0x01eb, B:148:0x02fa, B:153:0x0311, B:157:0x031d, B:151:0x0301, B:72:0x0103, B:158:0x0320, B:171:0x0346, B:173:0x034a, B:174:0x0355, B:176:0x0365, B:180:0x0370, B:182:0x0380, B:184:0x038a, B:186:0x0392, B:187:0x0396, B:188:0x039c, B:190:0x03a0, B:192:0x03a4, B:196:0x03ab, B:198:0x03b0, B:266:0x049c, B:268:0x04a0, B:270:0x04a5, B:273:0x04ab, B:275:0x04af, B:277:0x04b7, B:278:0x04c2, B:281:0x04c7, B:283:0x04cb, B:284:0x04d9, B:370:0x067a, B:285:0x04dd, B:288:0x04e2, B:289:0x0500, B:292:0x0506, B:294:0x0513, B:295:0x052a, B:296:0x052c, B:297:0x053b, B:300:0x0542, B:302:0x0548, B:305:0x0551, B:307:0x0555, B:308:0x055c, B:309:0x0561, B:311:0x0569, B:313:0x0571, B:314:0x0576, B:316:0x057c, B:317:0x0581, B:319:0x0585, B:320:0x0595, B:322:0x0599, B:324:0x059f, B:326:0x05a6, B:327:0x05aa, B:329:0x05b0, B:331:0x05b6, B:334:0x05bb, B:336:0x05bf, B:337:0x05c9, B:338:0x05d0, B:340:0x05d6, B:342:0x05de, B:344:0x05fb, B:343:0x05ef, B:345:0x05fd, B:347:0x060b, B:350:0x0613, B:352:0x061c, B:353:0x061f, B:355:0x062c, B:361:0x0644, B:363:0x065a, B:362:0x064c, B:357:0x0630, B:359:0x0638, B:349:0x0611, B:365:0x066b, B:201:0x03b8, B:203:0x03c6, B:204:0x03cb, B:206:0x03d0, B:207:0x03d8, B:209:0x03dc, B:211:0x03e2, B:212:0x03e7, B:214:0x03f1, B:215:0x0400, B:217:0x0407, B:221:0x0414, B:223:0x041c, B:227:0x0425, B:229:0x042b, B:232:0x0431, B:234:0x0439, B:236:0x043f, B:238:0x0444, B:240:0x0447, B:247:0x0453, B:249:0x045d, B:251:0x046d, B:253:0x0473, B:258:0x0483, B:260:0x0487, B:262:0x048b, B:263:0x0494, B:265:0x0499, B:375:0x0686), top: B:414:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x049c A[EDGE_INSN: B:462:0x049c->B:493:? BREAK  A[LOOP:4: B:174:0x0355->B:463:0x0355], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5 A[Catch: IllegalStateException -> 0x069e, CryptoException -> 0x06ee, TRY_ENTER, TryCatch #1 {CryptoException -> 0x06ee, blocks: (B:8:0x0011, B:10:0x0015, B:12:0x0019, B:14:0x001e, B:16:0x0024, B:19:0x002c, B:20:0x0031, B:22:0x003f, B:24:0x0068, B:169:0x033b, B:376:0x0696, B:25:0x0070, B:28:0x0075, B:33:0x007e, B:35:0x0082, B:37:0x008c, B:43:0x0096, B:45:0x009a, B:47:0x00a0, B:54:0x00b5, B:55:0x00c4, B:60:0x00d1, B:62:0x00d7, B:159:0x0323, B:161:0x0329, B:162:0x032c, B:164:0x0332, B:166:0x0336, B:64:0x00dd, B:66:0x00e3, B:68:0x00eb, B:70:0x00fb, B:73:0x0105, B:76:0x010b, B:78:0x011a, B:80:0x0124, B:81:0x0142, B:84:0x014c, B:86:0x0153, B:88:0x015b, B:90:0x0161, B:91:0x0168, B:93:0x0172, B:96:0x018e, B:99:0x0193, B:101:0x0199, B:103:0x01a0, B:106:0x01a8, B:109:0x01c3, B:115:0x01d1, B:117:0x01d9, B:122:0x01f0, B:125:0x01fa, B:127:0x0232, B:129:0x023a, B:131:0x0246, B:133:0x024c, B:137:0x0275, B:139:0x0282, B:138:0x027d, B:142:0x0289, B:143:0x0293, B:145:0x02a2, B:147:0x02da, B:146:0x02c1, B:126:0x022b, B:121:0x01eb, B:148:0x02fa, B:153:0x0311, B:157:0x031d, B:151:0x0301, B:72:0x0103, B:158:0x0320, B:171:0x0346, B:173:0x034a, B:174:0x0355, B:176:0x0365, B:180:0x0370, B:182:0x0380, B:184:0x038a, B:186:0x0392, B:187:0x0396, B:188:0x039c, B:190:0x03a0, B:192:0x03a4, B:196:0x03ab, B:198:0x03b0, B:266:0x049c, B:268:0x04a0, B:270:0x04a5, B:273:0x04ab, B:275:0x04af, B:277:0x04b7, B:278:0x04c2, B:281:0x04c7, B:283:0x04cb, B:284:0x04d9, B:370:0x067a, B:285:0x04dd, B:288:0x04e2, B:289:0x0500, B:292:0x0506, B:294:0x0513, B:295:0x052a, B:296:0x052c, B:297:0x053b, B:300:0x0542, B:302:0x0548, B:305:0x0551, B:307:0x0555, B:308:0x055c, B:309:0x0561, B:311:0x0569, B:313:0x0571, B:314:0x0576, B:316:0x057c, B:317:0x0581, B:319:0x0585, B:320:0x0595, B:322:0x0599, B:324:0x059f, B:326:0x05a6, B:327:0x05aa, B:329:0x05b0, B:331:0x05b6, B:334:0x05bb, B:336:0x05bf, B:337:0x05c9, B:338:0x05d0, B:340:0x05d6, B:342:0x05de, B:344:0x05fb, B:343:0x05ef, B:345:0x05fd, B:347:0x060b, B:350:0x0613, B:352:0x061c, B:353:0x061f, B:355:0x062c, B:361:0x0644, B:363:0x065a, B:362:0x064c, B:357:0x0630, B:359:0x0638, B:349:0x0611, B:365:0x066b, B:201:0x03b8, B:203:0x03c6, B:204:0x03cb, B:206:0x03d0, B:207:0x03d8, B:209:0x03dc, B:211:0x03e2, B:212:0x03e7, B:214:0x03f1, B:215:0x0400, B:217:0x0407, B:221:0x0414, B:223:0x041c, B:227:0x0425, B:229:0x042b, B:232:0x0431, B:234:0x0439, B:236:0x043f, B:238:0x0444, B:240:0x0447, B:247:0x0453, B:249:0x045d, B:251:0x046d, B:253:0x0473, B:258:0x0483, B:260:0x0487, B:262:0x048b, B:263:0x0494, B:265:0x0499, B:375:0x0686), top: B:414:0x0011 }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [ehv, esv] */
    /* JADX WARN: Type inference failed for: r3v53, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.util.List] */
    @Override // defpackage.ekc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void V(long r28, long r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esv.V(long, long):void");
    }

    protected float W(float f2, dze dzeVar, dze[] dzeVarArr) {
        throw null;
    }

    protected abstract int X(esx esxVar, dze dzeVar);

    protected ehx Y(ess essVar, dze dzeVar, dze dzeVar2) {
        throw null;
    }

    protected abstract esn Z(ess essVar, dze dzeVar, MediaCrypto mediaCrypto, float f2);

    protected boolean aA(ess essVar) {
        return true;
    }

    protected boolean aB() throws MediaCryptoException {
        int i = this.af;
        if (i == 3 || (this.P && !this.ai)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        a.ab(true);
        try {
            aS();
            return false;
        } catch (eii e) {
            edb.f("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public final boolean aD(dze dzeVar) throws Throwable {
        if (this.k != null && this.af != 3 && this.a != 0) {
            float f2 = this.J;
            dzeVar.getClass();
            float fW = W(f2, dzeVar, R());
            float f3 = this.L;
            if (f3 != fW) {
                if (fW == -1.0f) {
                    aH();
                    return false;
                }
                if (f3 != -1.0f || fW > this.i) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fW);
                    esp espVar = this.k;
                    espVar.getClass();
                    espVar.l(bundle);
                    this.L = fW;
                }
            }
        }
        return true;
    }

    protected final void aE() throws Throwable {
        if (aT()) {
            aq();
        }
    }

    protected abstract List aa(esx esxVar, dze dzeVar, boolean z);

    protected void ab(ehk ehkVar) {
        throw null;
    }

    protected void ac(Exception exc) {
        throw null;
    }

    protected void ad(String str) {
        throw null;
    }

    protected void ae(dze dzeVar, MediaFormat mediaFormat) {
        throw null;
    }

    protected void ag() {
        throw null;
    }

    protected abstract boolean ah(long j, long j2, esp espVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, dze dzeVar);

    protected boolean ai(dze dzeVar) {
        return false;
    }

    protected long aj(long j, long j2) {
        return 10000L;
    }

    protected void ak(String str, long j, long j2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        if (r3.m(r2) != false) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [eox, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected defpackage.ehx al(defpackage.hig r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esv.al(hig):ehx");
    }

    protected int am(ehk ehkVar) {
        return 0;
    }

    protected final long an() {
        return this.am.d;
    }

    protected final long ao() {
        return this.am.c;
    }

    protected esr ap(Throwable th, ess essVar) {
        return new esr(th, essVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0222 A[Catch: all -> 0x047e, TRY_ENTER, TryCatch #14 {all -> 0x047e, blocks: (B:123:0x022b, B:124:0x024e, B:125:0x0259, B:126:0x0279, B:128:0x0280, B:130:0x0288, B:134:0x0293, B:104:0x01f0, B:119:0x0222, B:120:0x0225), top: B:313:0x022b }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0332 A[Catch: Exception -> 0x0434, TryCatch #3 {Exception -> 0x0434, blocks: (B:154:0x0321, B:156:0x0332, B:157:0x0347, B:159:0x0351, B:161:0x0359, B:163:0x0363, B:165:0x036d, B:167:0x0377, B:171:0x0385, B:173:0x038d, B:177:0x0399, B:179:0x03a1, B:205:0x03fb, B:207:0x0406, B:208:0x0412, B:183:0x03ac, B:185:0x03b0, B:187:0x03b8, B:189:0x03c0, B:191:0x03c8, B:193:0x03d0, B:195:0x03d8, B:197:0x03e0, B:199:0x03ea, B:201:0x03f4), top: B:293:0x0321 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ac A[Catch: Exception -> 0x0434, TryCatch #3 {Exception -> 0x0434, blocks: (B:154:0x0321, B:156:0x0332, B:157:0x0347, B:159:0x0351, B:161:0x0359, B:163:0x0363, B:165:0x036d, B:167:0x0377, B:171:0x0385, B:173:0x038d, B:177:0x0399, B:179:0x03a1, B:205:0x03fb, B:207:0x0406, B:208:0x0412, B:183:0x03ac, B:185:0x03b0, B:187:0x03b8, B:189:0x03c0, B:191:0x03c8, B:193:0x03d0, B:195:0x03d8, B:197:0x03e0, B:199:0x03ea, B:201:0x03f4), top: B:293:0x0321 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0406 A[Catch: Exception -> 0x0434, TryCatch #3 {Exception -> 0x0434, blocks: (B:154:0x0321, B:156:0x0332, B:157:0x0347, B:159:0x0351, B:161:0x0359, B:163:0x0363, B:165:0x036d, B:167:0x0377, B:171:0x0385, B:173:0x038d, B:177:0x0399, B:179:0x03a1, B:205:0x03fb, B:207:0x0406, B:208:0x0412, B:183:0x03ac, B:185:0x03b0, B:187:0x03b8, B:189:0x03c0, B:191:0x03c8, B:193:0x03d0, B:195:0x03d8, B:197:0x03e0, B:199:0x03ea, B:201:0x03f4), top: B:293:0x0321 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0478 A[Catch: all -> 0x047c, TryCatch #13 {all -> 0x047c, blocks: (B:237:0x0474, B:239:0x047b, B:238:0x0478), top: B:311:0x0470 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04e0 A[Catch: est -> 0x0562, TryCatch #25 {est -> 0x0562, blocks: (B:27:0x005c, B:29:0x0061, B:31:0x0068, B:33:0x0071, B:37:0x0081, B:40:0x008e, B:43:0x00a1, B:45:0x00ab, B:46:0x00cd, B:48:0x00da, B:49:0x00e5, B:54:0x00f2, B:56:0x00fa, B:57:0x00ff, B:59:0x0103, B:263:0x04ac, B:265:0x04e0, B:267:0x0500, B:269:0x050d, B:271:0x052d, B:275:0x0542, B:276:0x0544, B:270:0x0510, B:277:0x0545, B:285:0x0558, B:286:0x0561, B:52:0x00e9, B:53:0x00f1), top: B:327:0x005c, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x050d A[Catch: est -> 0x0562, TryCatch #25 {est -> 0x0562, blocks: (B:27:0x005c, B:29:0x0061, B:31:0x0068, B:33:0x0071, B:37:0x0081, B:40:0x008e, B:43:0x00a1, B:45:0x00ab, B:46:0x00cd, B:48:0x00da, B:49:0x00e5, B:54:0x00f2, B:56:0x00fa, B:57:0x00ff, B:59:0x0103, B:263:0x04ac, B:265:0x04e0, B:267:0x0500, B:269:0x050d, B:271:0x052d, B:275:0x0542, B:276:0x0544, B:270:0x0510, B:277:0x0545, B:285:0x0558, B:286:0x0561, B:52:0x00e9, B:53:0x00f1), top: B:327:0x005c, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0510 A[Catch: est -> 0x0562, TryCatch #25 {est -> 0x0562, blocks: (B:27:0x005c, B:29:0x0061, B:31:0x0068, B:33:0x0071, B:37:0x0081, B:40:0x008e, B:43:0x00a1, B:45:0x00ab, B:46:0x00cd, B:48:0x00da, B:49:0x00e5, B:54:0x00f2, B:56:0x00fa, B:57:0x00ff, B:59:0x0103, B:263:0x04ac, B:265:0x04e0, B:267:0x0500, B:269:0x050d, B:271:0x052d, B:275:0x0542, B:276:0x0544, B:270:0x0510, B:277:0x0545, B:285:0x0558, B:286:0x0561, B:52:0x00e9, B:53:0x00f1), top: B:327:0x005c, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0542 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa A[Catch: est -> 0x0562, TryCatch #25 {est -> 0x0562, blocks: (B:27:0x005c, B:29:0x0061, B:31:0x0068, B:33:0x0071, B:37:0x0081, B:40:0x008e, B:43:0x00a1, B:45:0x00ab, B:46:0x00cd, B:48:0x00da, B:49:0x00e5, B:54:0x00f2, B:56:0x00fa, B:57:0x00ff, B:59:0x0103, B:263:0x04ac, B:265:0x04e0, B:267:0x0500, B:269:0x050d, B:271:0x052d, B:275:0x0542, B:276:0x0544, B:270:0x0510, B:277:0x0545, B:285:0x0558, B:286:0x0561, B:52:0x00e9, B:53:0x00f1), top: B:327:0x005c, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void aq() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esv.aq():void");
    }

    protected void ar(long j) {
        this.an = j;
        while (true) {
            ArrayDeque arrayDeque = this.C;
            if (arrayDeque.isEmpty() || j < ((esu) arrayDeque.peek()).b) {
                return;
            }
            esu esuVar = (esu) arrayDeque.poll();
            esuVar.getClass();
            aQ(esuVar);
            af();
        }
    }

    protected final void at() {
        try {
            esp espVar = this.k;
            if (espVar != null) {
                espVar.i();
                this.t.b++;
                ess essVar = this.n;
                essVar.getClass();
                ad(essVar.a);
            }
            this.k = null;
            MediaCrypto mediaCrypto = this.I;
            if (mediaCrypto != null) {
                mediaCrypto.release();
            }
        } catch (Throwable th) {
            this.k = null;
            MediaCrypto mediaCrypto2 = this.I;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.I = null;
            aP(null);
            av();
        }
    }

    protected void au() {
        aN();
        aO();
        aM();
        this.U = -9223372036854775807L;
        this.ah = false;
        this.T = -9223372036854775807L;
        this.ag = false;
        this.Q = false;
        this.R = false;
        this.Y = false;
        this.Z = false;
        this.ae = 0;
        this.af = 0;
        this.ad = this.ac ? 1 : 0;
        this.v = false;
        this.ap = -9223372036854775807L;
        this.aq = -9223372036854775807L;
    }

    protected final void av() {
        au();
        this.s = null;
        this.M = null;
        this.n = null;
        this.l = null;
        this.m = null;
        this.K = false;
        this.ai = false;
        this.L = -1.0f;
        this.O = 0;
        this.P = false;
        this.S = false;
        this.ac = false;
        this.ad = 0;
    }

    public final void aw(long j) {
        dze dzeVar = (dze) this.am.e.d(j);
        if (dzeVar == null && this.ao && this.m != null) {
            dzeVar = (dze) this.am.e.c();
        }
        if (dzeVar != null) {
            this.F = dzeVar;
        } else if (!this.K || this.F == null) {
            return;
        }
        dze dzeVar2 = this.F;
        dzeVar2.getClass();
        ae(dzeVar2, this.m);
        this.K = false;
        this.ao = false;
    }

    protected final boolean ax(dze dzeVar) {
        return this.H == null && ai(dzeVar);
    }

    protected boolean ay(ehk ehkVar) {
        return false;
    }

    protected boolean az() {
        return true;
    }

    @Override // defpackage.ekc
    public boolean cH() {
        throw null;
    }

    @Override // defpackage.ekc
    public boolean cI() {
        if (this.E == null) {
            return false;
        }
        if (Q() || aU()) {
            return true;
        }
        if (this.U == -9223372036854775807L) {
            return false;
        }
        dm();
        return SystemClock.elapsedRealtime() < this.U;
    }

    @Override // defpackage.eke
    public final int cJ(dze dzeVar) throws eii {
        try {
            return X(this.h, dzeVar);
        } catch (etb e) {
            throw h(e, dzeVar, 4002);
        }
    }

    @Override // defpackage.ehv, defpackage.eke
    public final int dl() {
        return 8;
    }

    @Override // defpackage.ehv, defpackage.ekc
    public final long e(long j, long j2) {
        return aj(j, j2);
    }

    @Override // defpackage.ehv, defpackage.ejz
    public void s(int i, Object obj) {
        if (i == 11) {
            pku pkuVar = (pku) obj;
            pkuVar.getClass();
            this.w = pkuVar;
        }
    }

    @Override // defpackage.ehv
    protected void v() {
        this.E = null;
        aQ(esu.a);
        this.C.clear();
        if (this.o) {
            aG();
        } else {
            aT();
        }
    }

    @Override // defpackage.ehv
    protected void w(boolean z, boolean z2) {
        this.t = new ehw();
    }

    @Override // defpackage.ehv
    protected void x(long j, boolean z) throws Throwable {
        this.ak = false;
        this.q = false;
        this.r = false;
        if (this.o) {
            aL();
        } else {
            aE();
        }
        edn ednVar = this.am.e;
        if (ednVar.a() > 0) {
            this.al = true;
        }
        ednVar.f();
        this.C.clear();
    }

    protected void af() {
    }

    protected void aF(dze dzeVar) {
    }

    protected void as(ehk ehkVar) {
    }
}
