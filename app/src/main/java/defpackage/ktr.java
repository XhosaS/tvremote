package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class ktr extends lht {
    private String a;
    private Set b;
    private Map c;
    private Long d;
    private Long e;

    public ktr(lih lihVar) {
        super(lihVar);
    }

    private final ktn d(Integer num) {
        if (this.c.containsKey(num)) {
            return (ktn) this.c.get(num);
        }
        ktn ktnVar = new ktn(this, this.a);
        this.c.put(num, ktnVar);
        return ktnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f3 A[PHI: r0 r15 r16 r23
  0x03f3: PHI (r0v47 java.util.Map) = (r0v49 java.util.Map), (r0v56 java.util.Map) binds: [B:172:0x041c, B:160:0x03f1] A[DONT_GENERATE, DONT_INLINE]
  0x03f3: PHI (r15v23 android.database.Cursor) = (r15v24 android.database.Cursor), (r15v26 android.database.Cursor) binds: [B:172:0x041c, B:160:0x03f1] A[DONT_GENERATE, DONT_INLINE]
  0x03f3: PHI (r16v3 long) = (r16v4 long), (r16v8 long) binds: [B:172:0x041c, B:160:0x03f1] A[DONT_GENERATE, DONT_INLINE]
  0x03f3: PHI (r23v6 long) = (r23v7 long), (r23v10 long) binds: [B:172:0x041c, B:160:0x03f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08ae A[LOOP:3: B:188:0x0469->B:386:0x08ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x08c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013a  */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.util.ArrayList, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(java.util.List r42, boolean r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktr.e(java.util.List, boolean):void");
    }

    private final boolean f(int i, int i2) {
        ktn ktnVar = (ktn) this.c.get(Integer.valueOf(i));
        if (ktnVar == null) {
            return false;
        }
        return ktnVar.c.get(i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(1:63)(7:19|479|20|458|21|474|(13:(8:23|477|24|25|(3:27|(1:29)(1:30)|31)|32|37|(1:489)(1:42))|(1:40)|41|65|457|66|462|67|(3:69|(1:71)|72)(4:73|(6:74|471|75|76|83|(1:558)(1:88))|(1:86)|87)|104|(1:106)(6:107|(9:109|473|110|111|482|112|469|113|(6:(3:115|(1:117)|118)|(1:121)|137|(3:140|(3:143|(5:547|178|179|551|549)(2:148|(19:548|150|(1:152)|153|(1:155)|156|(4:159|(2:161|553)(1:554)|162|157)|552|163|(1:165)|166|(4:169|(2:171|556)(1:557)|172|167)|555|173|(1:175)|176|179|551|549)(4:545|177|550|549))|141)|544)|139|180)(6:122|(0)|137|(0)|139|180))(1:186)|187|(9:190|(3:195|(4:198|(5:526|200|(1:202)(1:203)|204|529)(3:525|205|528)|527|196)|524)|206|(3:211|(4:214|(1:535)(3:532|218|536)|533|212)|530)|(3:220|(6:223|(3:225|(2:227|539)|230)(1:228)|229|538|230|221)|537)|231|(1:523)(3:241|(8:244|(1:246)|247|(1:249)|250|(3:540|252|543)(1:542)|541|242)|522)|253|188)|517|254)|255|(6:257|(3:260|(6:263|(7:265|484|266|455|267|(3:(8:269|467|270|271|272|(1:274)|275|278)|(1:281)|282)(2:284|(1:286))|296)|302|(2:303|(2:305|(3:494|307|492)(4:308|(2:309|(4:311|(5:313|(1:315)(1:316)|317|(1:319)(7:320|(1:322)(1:323)|324|(1:326)|327|(1:329)|330)|331)(1:332)|333|(1:498)(2:338|(1:340)(2:499|341)))(2:500|347))|(2:349|495)(1:496)|350))(0))|351|261)|490)|352|(31:355|(1:357)|358|(1:360)|361|(3:363|(1:365)|366)|367|(1:369)(3:370|(4:373|(7:511|375|(1:377)|378|(1:380)|381|514)(1:513)|512|371)|510)|(1:383)|384|(1:386)(4:388|(6:391|(1:393)|394|(6:396|(1:398)|399|(1:401)|402|508)(1:509)|403|389)|507|404)|387|405|(1:407)|408|(1:410)|411|470|412|413|(2:415|(1:417)(3:501|418|419))(2:420|(2:423|(1:425)(3:502|440|441))(1:422))|426|427|463|428|429|465|430|(2:432|506)(1:505)|439|353)|503|445)(2:446|447))(3:43|44|(1:46)))|457|66|462|67|(0)(0)|104|(0)(0)|255|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x07e7, code lost:
    
        r11.o(r12);
        r0 = r12.f;
        r2 = defpackage.lab.b(r29.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x07f8, code lost:
    
        if ((r10.b & 1) == 0) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x07fa, code lost:
    
        r3 = java.lang.Integer.valueOf(r10.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0801, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0802, code lost:
    
        r0.c("Invalid property filter ID. appId, id", r2, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0216, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0217, code lost:
    
        r17 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x021c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021d, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0220, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0221, code lost:
    
        r17 = "audience_id";
        r18 = r4;
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b7 A[PHI: r0 r2
  0x02b7: PHI (r0v42 java.util.Map) = (r0v28 java.util.Map), (r0v44 java.util.Map), (r0v22 java.util.Map) binds: [B:135:0x02e0, B:123:0x02bd, B:120:0x02b5] A[DONT_GENERATE, DONT_INLINE]
  0x02b7: PHI (r2v21 android.database.Cursor) = (r2v19 android.database.Cursor), (r2v22 android.database.Cursor), (r2v22 android.database.Cursor) binds: [B:135:0x02e0, B:123:0x02bd, B:120:0x02b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0680 A[PHI: r0 r10
  0x0680: PHI (r0v93 java.util.Map) = (r0v91 java.util.Map), (r0v98 java.util.Map) binds: [B:294:0x069d, B:285:0x067e] A[DONT_GENERATE, DONT_INLINE]
  0x0680: PHI (r10v30 android.database.Cursor) = (r10v29 android.database.Cursor), (r10v31 android.database.Cursor) binds: [B:294:0x069d, B:285:0x067e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b A[PHI: r0 r4 r5 r16
  0x014b: PHI (r0v125 java.util.Map) = (r0v124 java.util.Map), (r0v130 java.util.Map) binds: [B:58:0x0170, B:45:0x0149] A[DONT_GENERATE, DONT_INLINE]
  0x014b: PHI (r4v51 android.database.Cursor) = (r4v50 android.database.Cursor), (r4v52 android.database.Cursor) binds: [B:58:0x0170, B:45:0x0149] A[DONT_GENERATE, DONT_INLINE]
  0x014b: PHI (r5v51 java.lang.Object) = (r5v61 java.lang.Object), (r5v62 java.lang.Object) binds: [B:58:0x0170, B:45:0x0149] A[DONT_GENERATE, DONT_INLINE]
  0x014b: PHI (r16v11 android.database.sqlite.SQLiteDatabase) = (r16v10 android.database.sqlite.SQLiteDatabase), (r16v13 android.database.sqlite.SQLiteDatabase) binds: [B:58:0x0170, B:45:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab A[Catch: SQLiteException -> 0x0216, all -> 0x0ae5, TRY_LEAVE, TryCatch #3 {all -> 0x0ae5, blocks: (B:67:0x01a5, B:69:0x01ab, B:73:0x01b7, B:74:0x01bc, B:75:0x01c6, B:76:0x01d9, B:83:0x0200, B:78:0x01e6, B:80:0x01ea, B:82:0x01f5, B:100:0x0226), top: B:457:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b7 A[Catch: SQLiteException -> 0x0216, all -> 0x0ae5, TRY_ENTER, TryCatch #3 {all -> 0x0ae5, blocks: (B:67:0x01a5, B:69:0x01ab, B:73:0x01b7, B:74:0x01bc, B:75:0x01c6, B:76:0x01d9, B:83:0x0200, B:78:0x01e6, B:80:0x01ea, B:82:0x01f5, B:100:0x0226), top: B:457:0x018f }] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v42, types: [kzz] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kzz] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ktx] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [kzf] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List a(java.lang.String r30, java.util.List r31, java.util.List r32, java.lang.Long r33, java.lang.Long r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktr.a(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }

    @Override // defpackage.lht
    protected final void b() {
    }
}
