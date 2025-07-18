package defpackage;

import android.content.pm.PackageManager;
import android.view.WindowManager;
import java.io.IOException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fal implements fae {
    private static final xgp a;
    private final fiu b;
    private final Supplier c;
    private final fda d;
    private final vrs e;
    private final ahbt f;
    private final Supplier g;
    private final gph h;
    private final gzu i;
    private final gtu j;
    private final icj k;
    private final fth l;
    private final hab m;
    private final jbc n;
    private final PackageManager o;
    private final WindowManager p;
    private final gyh q;

    static {
        int iA;
        xgp xgpVar = xgp.a;
        xgo xgoVar = new xgo();
        String strA = fbo.ab.a();
        if ((xgoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xgoVar.y();
        }
        xgp xgpVar2 = (xgp) xgoVar.b;
        xgpVar2.b |= 1;
        xgpVar2.c = strA;
        int i = fbo.ab.ag;
        if ((xgoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xgoVar.y();
        }
        xgp xgpVar3 = (xgp) xgoVar.b;
        xgpVar3.b |= 2;
        xgpVar3.d = i;
        xjp xjpVar = xjp.a;
        xnu xnuVar = new xnu(new xjo());
        xjo xjoVar = xnuVar.a;
        if ((xjoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xjoVar.y();
        }
        xjp xjpVar2 = (xjp) xjoVar.b;
        xjpVar2.b |= 1;
        xjpVar2.c = "assistant.api.client_op.ShowSuggestionsProperties";
        abxk abxkVar = xot.a;
        xoq xoqVar = new xoq();
        xou.c(xoqVar);
        xou.b(xos.ANDROID_TV, xoqVar);
        xot xotVarA = xou.a(xoqVar);
        try {
            int i2 = xotVarA.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xotVarA.getClass()).a(xotVarA);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xotVarA.getClass()).a(xotVarA);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xotVarA.memoizedSerializedSize = (xotVarA.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            abvo abvoVar = abvo.b;
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xotVarA.getClass()).m(xotVarA, abwa.a(abvwVar));
            xnuVar.b(abvk.a(abvwVar, bArr));
            xjp xjpVarA = xnuVar.a();
            if ((xgoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xgoVar.y();
            }
            xgp xgpVar4 = (xgp) xgoVar.b;
            xgpVar4.e = xjpVarA;
            xgpVar4.b |= 4;
            abxd abxdVarV = xgoVar.v();
            abxdVarV.getClass();
            a = (xgp) abxdVarV;
        } catch (IOException e) {
            throw new RuntimeException(a.x(xotVarA, "Serializing ", " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public fal(fiu fiuVar, Supplier supplier, fda fdaVar, vrs vrsVar, ahbt ahbtVar, Supplier supplier2, gph gphVar, gzu gzuVar, gyh gyhVar, gtu gtuVar, icj icjVar, fth fthVar, hab habVar, jbc jbcVar, PackageManager packageManager, WindowManager windowManager) {
        fiuVar.getClass();
        fdaVar.getClass();
        ahbtVar.getClass();
        gzuVar.getClass();
        gtuVar.getClass();
        fthVar.getClass();
        habVar.getClass();
        windowManager.getClass();
        this.b = fiuVar;
        this.c = supplier;
        this.d = fdaVar;
        this.e = vrsVar;
        this.f = ahbtVar;
        this.g = supplier2;
        this.h = gphVar;
        this.i = gzuVar;
        this.q = gyhVar;
        this.j = gtuVar;
        this.k = icjVar;
        this.l = fthVar;
        this.m = habVar;
        this.n = jbcVar;
        this.o = packageManager;
        this.p = windowManager;
    }

    private final int g(String str) {
        try {
            return this.o.getPackageInfo(str, 128).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @Override // defpackage.fae
    public final zyd a() {
        return ahkr.c(this.f, 0, new faj(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0330  */
    @Override // defpackage.fae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r15) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fal.b(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r1 != r4) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x02fa -> B:109:0x02fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0137 -> B:51:0x0139). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agsw r21) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fal.c(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (r1 == r4) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d5 -> B:41:0x00d9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.agsw r20) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fal.d(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fah
            if (r0 == 0) goto L13
            r0 = r5
            fah r0 = (defpackage.fah) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fah r0 = new fah
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            gtu r5 = r4.j
            r0.c = r3
            java.lang.Object r5 = r5.j(r0)
            if (r5 == r1) goto L7a
        L3c:
            android.accounts.Account r5 = (android.accounts.Account) r5
            if (r5 == 0) goto L43
            java.lang.String r5 = r5.name
            goto L44
        L43:
            r5 = 0
        L44:
            icj r0 = r4.k
            icg r1 = defpackage.icg.p
            java.util.Collection r1 = r0.c(r1)
            if (r5 != 0) goto L50
            java.lang.String r5 = ""
        L50:
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L59
            xfn r5 = defpackage.xfn.DEFAULT_NO_DATA_SHARING_RESTRICTION
            return r5
        L59:
            icg r1 = defpackage.icg.n
            java.util.Collection r1 = r0.c(r1)
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L68
            xfn r5 = defpackage.xfn.NO_SHARING_ALLOWED_WITH_THIRD_PARTY
            return r5
        L68:
            icg r1 = defpackage.icg.o
            java.util.Collection r0 = r0.c(r1)
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L77
            xfn r5 = defpackage.xfn.NO_SHARING_ALLOWED_WITH_THIRD_PARTY_FROM_OOBE
            return r5
        L77:
            xfn r5 = defpackage.xfn.SHARING_STATUS_NOT_SET
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fal.e(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:
    
        if (r12 != r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
    
        if (r12 != r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.agsw r12) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fal.f(agsw):java.lang.Object");
    }
}
