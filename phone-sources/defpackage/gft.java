package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gft {
    public static final /* synthetic */ int f = 0;
    private static final String[] g = {"INSERT", "UPDATE", "DELETE"};
    public final gex a;
    public final boolean b;
    public final mma d;
    public final cb e;
    private final Map h;
    private final Map i;
    private final yjv j;
    private final String[] l;
    private final AtomicBoolean m = new AtomicBoolean(false);
    public yjk c = new gel(2);
    private final Map k = new LinkedHashMap();

    public gft(gex gexVar, Map map, Map map2, String[] strArr, boolean z, yjv yjvVar) {
        String lowerCase;
        this.a = gexVar;
        this.h = map;
        this.i = map2;
        this.b = z;
        this.j = yjvVar;
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
                map3.put(lowerCase4, yfm.g(map3, lowerCase3));
            }
        }
        this.d = new mma(this.l.length);
        this.e = new cb(this.l.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ges r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.gfl
            if (r0 == 0) goto L13
            r0 = r7
            gfl r0 = (defpackage.gfl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gfl r0 = new gfl
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.a
            java.util.Set r6 = (java.util.Set) r6
            defpackage.ybn.f(r7)
            return r6
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.a
            ges r6 = (defpackage.ges) r6
            defpackage.ybn.f(r7)
            goto L54
        L3e:
            defpackage.ybn.f(r7)
            fyh r7 = new fyh
            r2 = 14
            r7.<init>(r2)
            r0.a = r6
            r0.d = r4
            java.lang.String r2 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r7 = r6.a(r2, r7, r0)
            if (r7 == r1) goto L69
        L54:
            java.util.Set r7 = (java.util.Set) r7
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L68
            r0.a = r7
            r0.d = r3
            java.lang.String r2 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r6 = defpackage.gez.r(r6, r2, r0)
            if (r6 == r1) goto L69
        L68:
            return r7
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gft.a(ges, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.gfo
            if (r0 == 0) goto L13
            r0 = r11
            gfo r0 = (defpackage.gfo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gfo r0 = new gfo
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            cvi r0 = r0.d
            defpackage.ybn.f(r11)     // Catch: java.lang.Throwable -> L2a
            goto L77
        L2a:
            r11 = move-exception
            goto Lc7
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            defpackage.ybn.f(r11)
            gex r11 = r10.a
            cvi r2 = r11.k
            boolean r5 = r2.I()
            if (r5 == 0) goto Lcb
            java.util.concurrent.atomic.AtomicBoolean r5 = r10.m     // Catch: java.lang.Throwable -> Lc5
            boolean r5 = r5.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> Lc5
            if (r5 != 0) goto L50
            yhd r11 = defpackage.yhd.a     // Catch: java.lang.Throwable -> Lc5
            r2.H()
            return r11
        L50:
            yjk r5 = r10.c     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Throwable -> Lc5
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Lc5
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Lc5
            if (r5 != 0) goto L64
            yhd r11 = defpackage.yhd.a     // Catch: java.lang.Throwable -> Lc5
            r2.H()
            return r11
        L64:
            aki r5 = new aki     // Catch: java.lang.Throwable -> Lc5
            r6 = 12
            r7 = 0
            r5.<init>(r10, r7, r6, r7)     // Catch: java.lang.Throwable -> Lc5
            r0.d = r2     // Catch: java.lang.Throwable -> Lc5
            r0.c = r4     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r11 = r11.x(r5, r0)     // Catch: java.lang.Throwable -> Lc5
            if (r11 == r1) goto Lc4
            r0 = r2
        L77:
            java.util.Set r11 = (java.util.Set) r11     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r11.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto Lc0
            cb r1 = r10.e     // Catch: java.lang.Throwable -> L2a
            r11.getClass()     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r11.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L8b
            goto Lbb
        L8b:
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> L2a
        L8d:
            r2 = r1
            yvc r2 = (defpackage.yvc) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.d()     // Catch: java.lang.Throwable -> L2a
            r5 = r2
            int[] r5 = (int[]) r5     // Catch: java.lang.Throwable -> L2a
            int r6 = r5.length     // Catch: java.lang.Throwable -> L2a
            int[] r7 = new int[r6]     // Catch: java.lang.Throwable -> L2a
            r8 = r3
        L9b:
            if (r8 >= r6) goto Lb2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L2a
            boolean r9 = r11.contains(r9)     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto Lab
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L2a
            int r9 = r9 + r4
            goto Lad
        Lab:
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L2a
        Lad:
            r7[r8] = r9     // Catch: java.lang.Throwable -> L2a
            int r8 = r8 + 1
            goto L9b
        Lb2:
            r5 = r1
            yvc r5 = (defpackage.yvc) r5     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r5.f(r2, r7)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L8d
        Lbb:
            yjv r1 = r10.j     // Catch: java.lang.Throwable -> L2a
            r1.a(r11)     // Catch: java.lang.Throwable -> L2a
        Lc0:
            r0.H()
            return r11
        Lc4:
            return r1
        Lc5:
            r11 = move-exception
            r0 = r2
        Lc7:
            r0.H()
            throw r11
        Lcb:
            yhd r11 = defpackage.yhd.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gft.b(yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (defpackage.gez.r(r13, r15, r0) != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        if (defpackage.gez.r(r7, r15, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c8 -> B:27:0x00cb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.ges r13, int r14, defpackage.yih r15) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gft.c(ges, int, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007b -> B:20:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.ges r10, int r11, defpackage.yih r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.gfq
            if (r0 == 0) goto L13
            r0 = r12
            gfq r0 = (defpackage.gfq) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            gfq r0 = new gfq
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r10 = r0.b
            int r11 = r0.a
            java.lang.String[] r2 = r0.g
            java.lang.String r4 = r0.f
            ggd r5 = r0.h
            defpackage.ybn.f(r12)
            r12 = r4
            goto L7d
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            defpackage.ybn.f(r12)
            java.lang.String[] r12 = r9.l
            r11 = r12[r11]
            java.lang.String[] r12 = defpackage.gft.g
            r2 = 3
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L4a:
            if (r4 >= r10) goto L81
            r5 = r2[r4]
            java.lang.String r5 = defpackage.gez.q(r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.<init>(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = r11
            ggd r6 = (defpackage.ggd) r6
            r0.h = r6
            r0.f = r12
            r0.g = r2
            r0.a = r4
            r0.b = r10
            r0.e = r3
            java.lang.Object r5 = defpackage.gez.r(r11, r5, r0)
            if (r5 != r1) goto L7b
            return r1
        L7b:
            r5 = r11
            r11 = r4
        L7d:
            int r4 = r11 + 1
            r11 = r5
            goto L4a
        L81:
            ygi r10 = defpackage.ygi.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gft.d(ges, int, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.yih r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.gfr
            if (r0 == 0) goto L13
            r0 = r8
            gfr r0 = (defpackage.gfr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gfr r0 = new gfr
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cvi r0 = r0.d
            defpackage.ybn.f(r8)     // Catch: java.lang.Throwable -> L29
            goto L53
        L29:
            r8 = move-exception
            goto L5a
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            defpackage.ybn.f(r8)
            gex r8 = r7.a
            cvi r2 = r8.k
            boolean r4 = r2.I()
            if (r4 == 0) goto L5e
            aki r4 = new aki     // Catch: java.lang.Throwable -> L58
            r5 = 13
            r6 = 0
            r4.<init>(r7, r6, r5, r6)     // Catch: java.lang.Throwable -> L58
            r0.d = r2     // Catch: java.lang.Throwable -> L58
            r0.c = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r8 = r8.x(r4, r0)     // Catch: java.lang.Throwable -> L58
            if (r8 == r1) goto L57
            r0 = r2
        L53:
            r0.H()
            goto L5e
        L57:
            return r1
        L58:
            r8 = move-exception
            r0 = r2
        L5a:
            r0.H()
            throw r8
        L5e:
            ygi r8 = defpackage.ygi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gft.e(yih):java.lang.Object");
    }

    public final yfw f(String[] strArr) {
        yia yiaVar = new yia();
        for (String str : strArr) {
            Map map = this.i;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                yiaVar.addAll(set);
            } else {
                yiaVar.add(str);
            }
        }
        String[] strArr2 = (String[]) wcq.ai(yiaVar).toArray(new String[0]);
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
        return new yfw(strArr2, iArr);
    }

    public final void g(yjk yjkVar, yjk yjkVar2) {
        yjkVar.getClass();
        yjkVar2.getClass();
        if (this.m.compareAndSet(false, true)) {
            ykr.q(this.a.l(), new yov("Room Invalidation Tracker Refresh"), 0, new dbv(this, yjkVar2, (yih) null, 12), 2);
        }
    }
}
