package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.Context;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fzw implements fze {
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/homegraph/HomeGraphHandlerImpl");
    private static final long f;
    private static final abff g;
    public final BluetoothAdapter c;
    public final ContentResolver d;
    public final Context e;
    private final iax h;
    private final vxe i;
    private final fda j;
    private final oxs k;
    private final fsv l;
    private final owy m;
    private final iso n;

    static {
        long j = agzn.a;
        f = agzp.a(5, agzq.d);
        abff abffVar = abff.a;
        abfe abfeVar = new abfe();
        if ((abfeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abfeVar.y();
        }
        ((abff) abfeVar.b).b = true;
        abxd abxdVarV = abfeVar.v();
        abxdVarV.getClass();
        g = (abff) abxdVarV;
    }

    public fzw(iax iaxVar, vxe vxeVar, BluetoothAdapter bluetoothAdapter, fda fdaVar, ContentResolver contentResolver, Context context, oxs oxsVar, fsv fsvVar, owy owyVar, iso isoVar) {
        iaxVar.getClass();
        fdaVar.getClass();
        context.getClass();
        oxsVar.getClass();
        isoVar.getClass();
        this.h = iaxVar;
        this.i = vxeVar;
        this.c = bluetoothAdapter;
        this.j = fdaVar;
        this.d = contentResolver;
        this.e = context;
        this.k = oxsVar;
        this.l = fsvVar;
        this.m = owyVar;
        this.n = isoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(defpackage.fzw r4, defpackage.owx r5, defpackage.oww r6, defpackage.owj r7, defpackage.agsw r8) {
        /*
            boolean r0 = r8 instanceof defpackage.fzg
            if (r0 == 0) goto L13
            r0 = r8
            fzg r0 = (defpackage.fzg) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            fzg r0 = new fzg
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.b
            oxb r7 = r0.f
            java.lang.Object r6 = r0.a
            defpackage.agpl.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.agpl.b(r8)
            fda r4 = r4.j
            r0.a = r6
            r8 = r7
            oxb r8 = (defpackage.oxb) r8
            r0.f = r8
            r0.b = r5
            r0.e = r3
            java.lang.Object r8 = r4.e(r0)
            if (r8 == r1) goto L61
        L4b:
            java.lang.String r8 = (java.lang.String) r8
            own r4 = r5.c(r8)
            if (r4 != 0) goto L55
            r4 = 0
            return r4
        L55:
            java.util.Set r4 = java.util.Collections.singleton(r4)
            r4.getClass()
            owv r4 = r6.a(r4, r7)
            return r4
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzw.a(fzw, owx, oww, owj, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object c(defpackage.fzw r25, defpackage.owl r26, java.lang.String r27, defpackage.owj r28, java.lang.String r29, java.lang.String r30, defpackage.abhk r31, defpackage.agsw r32) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzw.c(fzw, owl, java.lang.String, owj, java.lang.String, java.lang.String, abhk, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object d(defpackage.fzw r4, defpackage.owx r5, java.lang.String r6, java.lang.String r7, defpackage.owj r8, defpackage.agsw r9) {
        /*
            boolean r0 = r9 instanceof defpackage.fzj
            if (r0 == 0) goto L13
            r0 = r9
            fzj r0 = (defpackage.fzj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            fzj r0 = new fzj
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.b
            oxb r8 = r0.h
            java.lang.String r7 = r0.g
            java.lang.String r6 = r0.f
            java.lang.Object r4 = r0.a
            defpackage.agpl.b(r9)
            goto L54
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            defpackage.agpl.b(r9)
            fda r4 = r4.j
            r0.a = r5
            r0.f = r6
            r0.g = r7
            r9 = r8
            oxb r9 = (defpackage.oxb) r9
            r0.h = r9
            r0.b = r5
            r0.e = r3
            java.lang.Object r9 = r4.e(r0)
            if (r9 == r1) goto L73
            r4 = r5
        L54:
            java.lang.String r9 = (java.lang.String) r9
            own r5 = r5.c(r9)
            r9 = 0
            if (r5 != 0) goto L5e
            return r9
        L5e:
            owl r4 = r4.b(r6)
            if (r4 == 0) goto L72
            abhk r6 = defpackage.fzd.a
            java.util.Set r5 = java.util.Collections.singleton(r5)
            r5.getClass()
            owv r4 = r4.a(r7, r6, r5, r8)
            return r4
        L72:
            return r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzw.d(fzw, owx, java.lang.String, java.lang.String, owj, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object e(defpackage.fzw r7, android.accounts.Account r8, java.lang.String r9, defpackage.agsw r10) {
        /*
            boolean r0 = r10 instanceof defpackage.fzk
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            r0 = r10
            fzk r0 = (defpackage.fzk) r0
            int r2 = r0.e
            r3 = r2 & r1
            if (r3 == 0) goto L13
            int r2 = r2 - r1
            r0.e = r2
            goto L18
        L13:
            fzk r0 = new fzk
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            agtg r2 = defpackage.agtg.a
            int r3 = r0.e
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L42
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2c
            java.lang.Object r7 = r0.a
            defpackage.agpl.b(r10)
            return r7
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r8 = r0.b
            java.lang.Object r7 = r0.a
            fzw r7 = (defpackage.fzw) r7
            defpackage.agpl.b(r10)
            agpk r10 = (defpackage.agpk) r10
            java.lang.Object r9 = r10.a
            goto L8c
        L42:
            defpackage.agpl.b(r10)
            iax r10 = r7.h     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            int r3 = defpackage.kcx.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            yme r10 = r10.d(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La6
            ymd r3 = new ymd
            r3.<init>()
            r3.B(r10)
            yld r10 = defpackage.yld.a
            ylc r10 = new ylc
            r10.<init>()
            defpackage.ylg.b(r10)
            yld r10 = defpackage.ylg.a(r10)
            abxd r6 = r3.b
            int r6 = r6.memoizedSerializedSize
            r1 = r1 & r6
            if (r1 != 0) goto L6d
            r3.y()
        L6d:
            abxd r1 = r3.b
            yme r1 = (defpackage.yme) r1
            r1.g = r10
            int r10 = r1.b
            r10 = r10 | 64
            r1.b = r10
            yme r10 = defpackage.ymj.a(r3)
            iax r1 = r7.h
            r0.a = r7
            r0.b = r8
            r0.e = r5
            java.lang.Object r9 = r1.h(r8, r10, r9, r0)
            if (r9 != r2) goto L8c
            goto La4
        L8c:
            boolean r10 = defpackage.agpk.b(r9)
            if (r10 == 0) goto La5
            r10 = r9
            ymc r10 = (defpackage.ymc) r10
            r0.a = r9
            r1 = 0
            r0.b = r1
            r0.e = r4
            android.accounts.Account r8 = (android.accounts.Account) r8
            java.lang.Object r7 = r7.g(r8, r10, r0)
            if (r7 != r2) goto La5
        La4:
            return r2
        La5:
            return r9
        La6:
            r7 = move-exception
            java.lang.Object r7 = defpackage.agpl.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzw.e(fzw, android.accounts.Account, java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x02a6, code lost:
    
        if (r1 != false) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020d A[Catch: IOException -> 0x038d, TryCatch #3 {IOException -> 0x038d, blocks: (B:73:0x0207, B:75:0x020d, B:87:0x0254, B:78:0x021e, B:79:0x0229, B:80:0x022a, B:82:0x0230, B:84:0x0240, B:85:0x0248, B:86:0x0253), top: B:137:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022a A[Catch: IOException -> 0x038d, TryCatch #3 {IOException -> 0x038d, blocks: (B:73:0x0207, B:75:0x020d, B:87:0x0254, B:78:0x021e, B:79:0x0229, B:80:0x022a, B:82:0x0230, B:84:0x0240, B:85:0x0248, B:86:0x0253), top: B:137:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object f(defpackage.fzw r26, java.lang.String r27, defpackage.agsw r28) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzw.f(fzw, java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object h(defpackage.fzw r4, defpackage.owx r5, final java.lang.String r6, defpackage.agsw r7) {
        /*
            boolean r0 = r7 instanceof defpackage.fzu
            if (r0 == 0) goto L13
            r0 = r7
            fzu r0 = (defpackage.fzu) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            fzu r0 = new fzu
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.b
            java.lang.String r6 = r0.f
            java.lang.Object r4 = r0.a
            defpackage.agpl.b(r7)
            goto L48
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.agpl.b(r7)
            fda r7 = r4.j
            r0.a = r4
            r0.f = r6
            r0.b = r5
            r0.e = r3
            java.lang.Object r7 = r7.e(r0)
            if (r7 == r1) goto L60
        L48:
            java.lang.String r7 = (java.lang.String) r7
            own r5 = r5.c(r7)
            if (r5 != 0) goto L53
            agpu r4 = defpackage.agpu.a
            return r4
        L53:
            fzf r7 = new fzf
            fzw r4 = (defpackage.fzw) r4
            r7.<init>()
            r5.i(r6, r7)
            agpu r4 = defpackage.agpu.a
            return r4
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzw.h(fzw, owx, java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object i(defpackage.fzw r9, android.accounts.Account r10, defpackage.ykx r11, java.lang.String r12, defpackage.agsw r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzw.i(fzw, android.accounts.Account, ykx, java.lang.String, agsw):java.lang.Object");
    }

    public static final void j(Status status) {
        status.getClass();
        ((zdv) b.b().q("com/google/android/apps/tvsearch/homegraph/HomeGraphHandlerImpl", "createDeviceAndRoom$lambda$7", 194, "HomeGraphHandlerImpl.kt")).x("ghgCallback status [%s]", status);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.ykx r10, java.lang.String r11, defpackage.agsw r12) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzw.b(ykx, java.lang.String, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (r8.d(r7, r9, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(android.accounts.Account r7, defpackage.ymc r8, defpackage.agsw r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.fzt
            if (r0 == 0) goto L13
            r0 = r9
            fzt r0 = (defpackage.fzt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fzt r0 = new fzt
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.agpl.b(r9)
            goto La2
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ymc r8 = r0.e
            java.lang.Object r7 = r0.a
            defpackage.agpl.b(r9)
            goto L4c
        L3b:
            defpackage.agpl.b(r9)
            fda r9 = r6.j
            r0.a = r7
            r0.e = r8
            r0.d = r4
            java.lang.Object r9 = r9.e(r0)
            if (r9 == r1) goto La5
        L4c:
            java.lang.String r9 = (java.lang.String) r9
            r8.getClass()
            r2 = 0
            if (r9 == 0) goto L84
            int r4 = r9.length()
            if (r4 != 0) goto L5b
            goto L84
        L5b:
            ylb r8 = r8.d
            if (r8 != 0) goto L61
            ylb r8 = defpackage.ylb.a
        L61:
            abxs r8 = r8.b
            r8.getClass()
            java.util.Iterator r8 = r8.iterator()
        L6a:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L80
            java.lang.Object r4 = r8.next()
            r5 = r4
            ykx r5 = (defpackage.ykx) r5
            java.lang.String r5 = r5.d
            boolean r5 = defpackage.agvy.c(r5, r9)
            if (r5 == 0) goto L6a
            goto L81
        L80:
            r4 = r2
        L81:
            ykx r4 = (defpackage.ykx) r4
            goto L85
        L84:
            r4 = r2
        L85:
            if (r4 == 0) goto La2
            fsv r8 = r6.l
            android.accounts.Account r7 = (android.accounts.Account) r7
            java.lang.String r7 = r7.name
            r7.getClass()
            java.lang.String r9 = r4.c
            r9.getClass()
            r0.a = r2
            r0.e = r2
            r0.d = r3
            java.lang.Object r7 = r8.d(r7, r9, r0)
            if (r7 != r1) goto La2
            goto La5
        La2:
            agpu r7 = defpackage.agpu.a
            return r7
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzw.g(android.accounts.Account, ymc, agsw):java.lang.Object");
    }
}
