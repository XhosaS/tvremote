package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public class czt {
    public czt() {
    }

    public static void a(EdgeEffect edgeEffect, float f, float f2) {
        edgeEffect.onPull(f, f2);
    }

    public static Object b(byte[] bArr, yjv yjvVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.getClass();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return yjvVar.a(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.text.Editable r6, android.view.KeyEvent r7, boolean r8) {
        /*
            int r7 = r7.getMetaState()
            boolean r7 = android.view.KeyEvent.metaStateHasNoModifiers(r7)
            r0 = 0
            if (r7 != 0) goto Lc
            goto L47
        Lc:
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            boolean r2 = i(r7, r1)
            if (r2 != 0) goto L47
            java.lang.Class<dhh> r2 = defpackage.dhh.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            dhh[] r1 = (defpackage.dhh[]) r1
            if (r1 == 0) goto L47
            int r2 = r1.length
            if (r2 <= 0) goto L47
            r3 = r0
        L28:
            if (r3 >= r2) goto L47
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L39
            if (r5 == r7) goto L42
            goto L3b
        L39:
            if (r4 == r7) goto L42
        L3b:
            if (r7 <= r5) goto L3f
            if (r7 < r4) goto L42
        L3f:
            int r3 = r3 + 1
            goto L28
        L42:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czt.c(android.text.Editable, android.view.KeyEvent, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007c, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c A[EDGE_INSN: B:90:0x009c->B:63:0x009c BREAK  A[LOOP:2: B:44:0x006a->B:54:0x007f], EDGE_INSN: B:91:0x009c->B:63:0x009c BREAK  A[LOOP:2: B:44:0x006a->B:54:0x007f, LOOP_LABEL: LOOP:2: B:44:0x006a->B:54:0x007f]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czt.d(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(5:(2:67|(1:(4:12|13|42|43)(2:15|16))(3:17|18|19))(17:22|(1:24)|25|72|26|27|68|28|29|65|30|31|63|32|33|(1:35)|49)|70|38|(3:41|42|43)|49)|74|36|37|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016c, code lost:
    
        r14 = r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v7, types: [bav] */
    /* JADX WARN: Type inference failed for: r1v8, types: [bav] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [dsn] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5, types: [bcy] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v5, types: [yqe] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [yqe] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v20, types: [int] */
    /* JADX WARN: Type inference failed for: r4v21, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object f(defpackage.dti r23, android.content.Context r24, defpackage.dsn r25, defpackage.dtg r26, defpackage.yih r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czt.f(dti, android.content.Context, dsn, dtg, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object g(defpackage.czt r5, defpackage.yjz r6, defpackage.yih r7) {
        /*
            boolean r0 = r7 instanceof defpackage.dtk
            if (r0 == 0) goto L13
            r0 = r7
            dtk r0 = (defpackage.dtk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dtk r0 = new dtk
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            aki r6 = r0.c
            defpackage.ybn.f(r7)     // Catch: defpackage.dtf -> L2a
            return r7
        L2a:
            r5 = move-exception
            goto L4d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.ybn.f(r7)
            r7 = r6
            aki r7 = (defpackage.aki) r7     // Catch: defpackage.dtf -> L2a
            r0.c = r7     // Catch: defpackage.dtf -> L2a
            r0.b = r4     // Catch: defpackage.dtf -> L2a
            uc r7 = new uc     // Catch: defpackage.dtf -> L2a
            r2 = 11
            r7.<init>(r6, r5, r3, r2)     // Catch: defpackage.dtf -> L2a
            java.lang.Object r5 = defpackage.yoz.k(r7, r0)     // Catch: defpackage.dtf -> L2a
            if (r5 != r1) goto L4c
            return r1
        L4c:
            return r5
        L4d:
            int r7 = r5.a
            int r6 = r6.hashCode()
            if (r7 != r6) goto L56
            return r3
        L56:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czt.g(czt, yjz, yih):java.lang.Object");
    }

    public static Object h(Context context, String str, int i, cvi cviVar, yih yihVar) throws Throwable {
        Object objS = cme.s(((gpt) fki.aV(context).g(str, i, cviVar)).c, yihVar);
        return objS == yio.a ? objS : ygi.a;
    }

    private static boolean i(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.content.Context r6, java.lang.String r7, defpackage.yih r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dtl
            if (r0 == 0) goto L13
            r0 = r8
            dtl r0 = (defpackage.dtl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dtl r0 = new dtl
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r8)
            goto L42
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ybn.f(r8)
            gpz r6 = defpackage.fki.aV(r6)
            uhp r6 = r6.b(r7)
            r0.b = r3
            java.lang.Object r8 = defpackage.cme.s(r6, r0)
            if (r8 == r1) goto L73
        L42:
            java.util.List r8 = (java.util.List) r8
            int r6 = r8.size()
            r7 = 0
            r0 = r7
        L4a:
            if (r0 >= r6) goto L6d
            java.lang.Object r1 = r8.get(r0)
            gpy r1 = (defpackage.gpy) r1
            r2 = 2
            gpx[] r2 = new defpackage.gpx[r2]
            gpx r4 = defpackage.gpx.b
            r2[r7] = r4
            gpx r4 = defpackage.gpx.a
            r2[r3] = r4
            java.util.List r2 = defpackage.yfm.s(r2)
            gpx r1 = r1.a
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L6a
            goto L6e
        L6a:
            int r0 = r0 + 1
            goto L4a
        L6d:
            r3 = r7
        L6e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czt.e(android.content.Context, java.lang.String, yih):java.lang.Object");
    }

    public czt(byte[] bArr) {
    }
}
