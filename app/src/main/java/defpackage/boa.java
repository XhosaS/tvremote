package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boa {
    public static final bnl a = new bnl();
    private static final String[] g = {"INSERT", "UPDATE", "DELETE"};
    public final bmn b;
    public final boolean c;
    public final blt d;
    public final blv e;
    private final Map h;
    private final Map i;
    private final agux j;
    private final String[] l;
    private final AtomicBoolean m = new AtomicBoolean(false);
    public agum f = new agum() { // from class: bnk
        @Override // defpackage.agum
        public final Object a() {
            bnl bnlVar = boa.a;
            return true;
        }
    };
    private final Map k = new LinkedHashMap();

    public boa(bmn bmnVar, Map map, Map map2, String[] strArr, boolean z, agux aguxVar) {
        String lowerCase;
        this.b = bmnVar;
        this.h = map;
        this.i = map2;
        this.c = z;
        this.j = aguxVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase2 = strArr[i].toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            this.k.put(lowerCase2, Integer.valueOf(i));
            String str = (String) this.h.get(strArr[i]);
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.l = strArr2;
        for (Map.Entry entry : this.h.entrySet()) {
            String lowerCase3 = ((String) entry.getValue()).toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            if (this.k.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                lowerCase4.getClass();
                Map map3 = this.k;
                map3.put(lowerCase4, agrj.a(map3, lowerCase3));
            }
        }
        this.d = new blt(this.l.length);
        this.e = new blv(this.l.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.blx r6, defpackage.agsw r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.bnm
            if (r0 == 0) goto L13
            r0 = r7
            bnm r0 = (defpackage.bnm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bnm r0 = new bnm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.a
            java.util.Set r6 = (java.util.Set) r6
            defpackage.agpl.b(r7)
            return r6
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.a
            blx r6 = (defpackage.blx) r6
            defpackage.agpl.b(r7)
            goto L57
        L3e:
            defpackage.agpl.b(r7)
            bnj r7 = new bnj
            r7.<init>()
            r0.a = r6
            r0.d = r4
            r2 = r6
            bog r2 = (defpackage.bog) r2
            bol r2 = r2.a
            java.lang.String r4 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r7 = r2.a(r4, r7, r0)
            if (r7 == r1) goto L6c
        L57:
            java.util.Set r7 = (java.util.Set) r7
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L6b
            r0.a = r7
            r0.d = r3
            java.lang.String r2 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r6 = defpackage.bni.a(r6, r2, r0)
            if (r6 == r1) goto L6c
        L6b:
            return r7
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boa.a(blx, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.bnr
            if (r0 == 0) goto L13
            r0 = r11
            bnr r0 = (defpackage.bnr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bnr r0 = new bnr
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            bob r0 = r0.d
            defpackage.agpl.b(r11)     // Catch: java.lang.Throwable -> L2a
            goto L75
        L2a:
            r11 = move-exception
            goto Lbf
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            defpackage.agpl.b(r11)
            bmn r11 = r10.b
            bob r2 = r11.g
            boolean r5 = r2.b()
            if (r5 == 0) goto Lc3
            java.util.concurrent.atomic.AtomicBoolean r5 = r10.m     // Catch: java.lang.Throwable -> Lbd
            boolean r5 = r5.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> Lbd
            if (r5 != 0) goto L50
            agrf r11 = defpackage.agrf.a     // Catch: java.lang.Throwable -> Lbd
            r2.a()
            return r11
        L50:
            agum r5 = r10.f     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Throwable -> Lbd
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Lbd
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Lbd
            if (r5 != 0) goto L64
            agrf r11 = defpackage.agrf.a     // Catch: java.lang.Throwable -> Lbd
            r2.a()
            return r11
        L64:
            bnt r5 = new bnt     // Catch: java.lang.Throwable -> Lbd
            r6 = 0
            r5.<init>(r10, r6)     // Catch: java.lang.Throwable -> Lbd
            r0.d = r2     // Catch: java.lang.Throwable -> Lbd
            r0.c = r4     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r11 = r11.w(r5, r0)     // Catch: java.lang.Throwable -> Lbd
            if (r11 == r1) goto Lbc
            r0 = r2
        L75:
            java.util.Set r11 = (java.util.Set) r11     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r11.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto Lb8
            blv r1 = r10.e     // Catch: java.lang.Throwable -> L2a
            r11.getClass()     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r11.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L89
            goto Lb3
        L89:
            ahin r1 = r1.a     // Catch: java.lang.Throwable -> L2a
        L8b:
            java.lang.Object r2 = r1.b()     // Catch: java.lang.Throwable -> L2a
            r5 = r2
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L2a
            int r6 = r5.length     // Catch: java.lang.Throwable -> L2a
            int[] r7 = new int[r6]     // Catch: java.lang.Throwable -> L2a
            r8 = r3
        L96:
            if (r8 >= r6) goto Lad
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L2a
            boolean r9 = r11.contains(r9)     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto La6
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L2a
            int r9 = r9 + r4
            goto La8
        La6:
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L2a
        La8:
            r7[r8] = r9     // Catch: java.lang.Throwable -> L2a
            int r8 = r8 + 1
            goto L96
        Lad:
            boolean r2 = r1.fE(r2, r7)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L8b
        Lb3:
            agux r1 = r10.j     // Catch: java.lang.Throwable -> L2a
            r1.a(r11)     // Catch: java.lang.Throwable -> L2a
        Lb8:
            r0.a()
            return r11
        Lbc:
            return r1
        Lbd:
            r11 = move-exception
            r0 = r2
        Lbf:
            r0.a()
            throw r11
        Lc3:
            agrf r11 = defpackage.agrf.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boa.b(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r15 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
    
        if (r15 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c4 -> B:27:0x00c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.blx r13, int r14, defpackage.agsw r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.bnv
            if (r0 == 0) goto L13
            r0 = r15
            bnv r0 = (defpackage.bnv) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            bnv r0 = new bnv
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.e
            agtg r1 = defpackage.agtg.a
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            int r13 = r0.d
            int r14 = r0.c
            int r2 = r0.b
            java.lang.String[] r5 = r0.i
            java.lang.String r6 = r0.h
            java.lang.Object r7 = r0.a
            defpackage.agpl.b(r15)
            goto Lc7
        L37:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3f:
            int r14 = r0.b
            java.lang.Object r13 = r0.a
            defpackage.agpl.b(r15)
            goto L5e
        L47:
            defpackage.agpl.b(r15)
            java.lang.String r15 = "INSERT OR IGNORE INTO room_table_modification_log VALUES("
            java.lang.String r2 = ", 0)"
            java.lang.String r15 = defpackage.a.a(r14, r15, r2)
            r0.a = r13
            r0.b = r14
            r0.g = r4
            java.lang.Object r15 = defpackage.bni.a(r13, r15, r0)
            if (r15 == r1) goto Lcc
        L5e:
            java.lang.String[] r15 = r12.l
            r15 = r15[r14]
            java.lang.String[] r2 = defpackage.boa.g
            r5 = 3
            r6 = 0
            r7 = r13
            r13 = r5
            r5 = r2
            r2 = r14
            r14 = r6
            r6 = r15
        L6c:
            if (r14 >= r13) goto Lc9
            r15 = r5[r14]
            boolean r8 = r12.c
            bnl r9 = defpackage.boa.a
            java.lang.String r9 = r9.a(r6, r15)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "CREATE "
            r10.<init>(r11)
            if (r4 == r8) goto L84
            java.lang.String r8 = ""
            goto L86
        L84:
            java.lang.String r8 = "TEMP"
        L86:
            r10.append(r8)
            java.lang.String r8 = " TRIGGER IF NOT EXISTS `"
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = "` AFTER "
            r10.append(r8)
            r10.append(r15)
            java.lang.String r15 = " ON `"
            r10.append(r15)
            r10.append(r6)
            java.lang.String r15 = "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "
            r10.append(r15)
            r10.append(r2)
            java.lang.String r15 = " AND invalidated = 0; END"
            r10.append(r15)
            java.lang.String r15 = r10.toString()
            r0.a = r7
            r0.h = r6
            r0.i = r5
            r0.b = r2
            r0.c = r14
            r0.d = r13
            r0.g = r3
            java.lang.Object r15 = defpackage.bni.a(r7, r15, r0)
            if (r15 != r1) goto Lc7
            goto Lcc
        Lc7:
            int r14 = r14 + r4
            goto L6c
        Lc9:
            agpu r13 = defpackage.agpu.a
            return r13
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boa.c(blx, int, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007a -> B:20:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.blx r10, int r11, defpackage.agsw r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.bnw
            if (r0 == 0) goto L13
            r0 = r12
            bnw r0 = (defpackage.bnw) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            bnw r0 = new bnw
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.d
            agtg r1 = defpackage.agtg.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r10 = r0.c
            int r11 = r0.b
            java.lang.String[] r2 = r0.h
            java.lang.String r4 = r0.g
            java.lang.Object r5 = r0.a
            defpackage.agpl.b(r12)
            r12 = r4
            goto L7c
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            defpackage.agpl.b(r12)
            java.lang.String[] r12 = r9.l
            r11 = r12[r11]
            java.lang.String[] r12 = defpackage.boa.g
            r2 = 3
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L4a:
            if (r4 >= r10) goto L80
            r5 = r2[r4]
            bnl r6 = defpackage.boa.a
            java.lang.String r5 = r6.a(r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.<init>(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.a = r11
            r0.g = r12
            r0.h = r2
            r0.b = r4
            r0.c = r10
            r0.f = r3
            java.lang.Object r5 = defpackage.bni.a(r11, r5, r0)
            if (r5 != r1) goto L7a
            return r1
        L7a:
            r5 = r11
            r11 = r4
        L7c:
            int r4 = r11 + 1
            r11 = r5
            goto L4a
        L80:
            agpu r10 = defpackage.agpu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boa.d(blx, int, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.bnx
            if (r0 == 0) goto L13
            r0 = r7
            bnx r0 = (defpackage.bnx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bnx r0 = new bnx
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            bob r0 = r0.d
            defpackage.agpl.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L51
        L29:
            r7 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            defpackage.agpl.b(r7)
            bmn r7 = r6.b
            bob r2 = r7.g
            boolean r4 = r2.b()
            if (r4 == 0) goto L5c
            bnz r4 = new bnz     // Catch: java.lang.Throwable -> L56
            r5 = 0
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L56
            r0.d = r2     // Catch: java.lang.Throwable -> L56
            r0.c = r3     // Catch: java.lang.Throwable -> L56
            java.lang.Object r7 = r7.w(r4, r0)     // Catch: java.lang.Throwable -> L56
            if (r7 == r1) goto L55
            r0 = r2
        L51:
            r0.a()
            goto L5c
        L55:
            return r1
        L56:
            r7 = move-exception
            r0 = r2
        L58:
            r0.a()
            throw r7
        L5c:
            agpu r7 = defpackage.agpu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boa.e(agsw):java.lang.Object");
    }

    public final agpi f(String[] strArr) {
        agsl agslVar = new agsl();
        for (String str : strArr) {
            Map map = this.i;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                agslVar.addAll(set);
            } else {
                agslVar.add(str);
            }
        }
        String[] strArr2 = (String[]) agrp.a(agslVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Map map2 = this.k;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) map2.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(str2)));
            }
            iArr[i] = num.intValue();
        }
        return new agpi(strArr2, iArr);
    }

    public final void g(agum agumVar, agum agumVar2) {
        agumVar.getClass();
        agumVar2.getClass();
        if (this.m.compareAndSet(false, true)) {
            ahal.e(this.b.l(), new ahbs("Room Invalidation Tracker Refresh"), 0, new bnu(this, agumVar2, null), 2);
        }
    }
}
