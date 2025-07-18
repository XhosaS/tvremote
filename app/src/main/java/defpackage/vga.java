package defpackage;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vga implements vft {
    public static final zdy a = zdy.h("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl");
    public final List b = new ArrayList();
    private final vfo c;
    private final zyg d;

    public vga(vfo vfoVar, zyg zygVar) {
        this.c = vfoVar;
        this.d = zygVar;
    }

    static /* synthetic */ boolean d(ValidationResult validationResult) {
        return !validationResult.c();
    }

    @Override // defpackage.vft
    public final zyd a(AccountId accountId) {
        int i = yyk.e;
        return e(accountId, zcg.b);
    }

    @Override // defpackage.vft
    public final void b() {
        zxn.l(wyo.b(new zvh() { // from class: vfv
            @Override // defpackage.zvh
            public final zyd a() {
                yyk yykVarJ;
                zyd zydVarA;
                List list = this.a.b;
                synchronized (list) {
                    yykVarJ = yyk.j(list);
                }
                ArrayList arrayList = new ArrayList(yykVarJ.size());
                int size = yykVarJ.size();
                for (int i = 0; i < size; i++) {
                    try {
                        zydVarA = ((vfs) yykVarJ.get(i)).a();
                    } catch (Throwable th) {
                        ((zdv) ((zdv) ((zdv) vga.a.c()).p(th)).q("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl", "notifyRequirementStateChanged", (char) 198, "AccountRequirementManagerImpl.java")).u("OnRequirementStateChanged observer failed.");
                        zydVarA = zxy.a;
                    }
                    arrayList.add(zydVarA);
                }
                return zxn.a(arrayList).a(new zvk(), zwk.a);
            }
        }), this.d);
    }

    @Override // defpackage.vft
    public final zyd c(AccountId accountId, yyk yykVar) {
        return e(accountId, yykVar);
    }

    public final zyd e(final AccountId accountId, final yyk yykVar) {
        yykVar.getClass();
        wvx wvxVarF = wzg.f("Validate Requirements", wwb.a, true);
        try {
            zyd zydVarH = zuz.h(this.c.a(accountId), wyo.c(new zvi() { // from class: vfu
                /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
                @Override // defpackage.zvi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final defpackage.zyd a(java.lang.Object r6) {
                    /*
                        r5 = this;
                        com.google.apps.tiktok.account.api.controller.ValidationResult r6 = (com.google.apps.tiktok.account.api.controller.ValidationResult) r6
                        java.util.List r6 = r1
                        java.util.ArrayList r0 = new java.util.ArrayList
                        int r1 = r6.size()
                        r0.<init>(r1)
                        java.util.Iterator r6 = r6.iterator()
                    L11:
                        boolean r1 = r6.hasNext()
                        if (r1 == 0) goto L28
                        com.google.apps.tiktok.account.AccountId r1 = r2
                        java.lang.Object r2 = r6.next()
                        vfo r2 = (defpackage.vfo) r2
                        vfw r3 = new vfw
                        r3.<init>()
                        r0.add(r3)
                        goto L11
                    L28:
                        zwk r6 = defpackage.zwk.a
                        java.util.ArrayList r1 = new java.util.ArrayList
                        int r2 = r0.size()
                        r1.<init>(r2)
                        java.util.Iterator r0 = r0.iterator()
                    L37:
                        boolean r2 = r0.hasNext()
                        if (r2 == 0) goto L88
                        java.lang.Object r2 = r0.next()
                        zvh r2 = (defpackage.zvh) r2
                        zyd r2 = r2.a()     // Catch: java.lang.Exception -> L79
                        boolean r3 = r2.isDone()     // Catch: java.lang.Exception -> L79
                        if (r3 == 0) goto L75
                        java.lang.Object r3 = defpackage.zxn.o(r2)     // Catch: java.util.concurrent.ExecutionException -> L6a java.lang.Exception -> L79
                        boolean r4 = r2.isCancelled()     // Catch: java.util.concurrent.ExecutionException -> L6a java.lang.Exception -> L79
                        if (r4 != 0) goto L5f
                        com.google.apps.tiktok.account.api.controller.ValidationResult r3 = (com.google.apps.tiktok.account.api.controller.ValidationResult) r3     // Catch: java.util.concurrent.ExecutionException -> L6a java.lang.Exception -> L79
                        boolean r3 = defpackage.vga.d(r3)     // Catch: java.util.concurrent.ExecutionException -> L6a java.lang.Exception -> L79
                        if (r3 == 0) goto L37
                    L5f:
                        boolean r0 = r1.isEmpty()     // Catch: java.util.concurrent.ExecutionException -> L6a java.lang.Exception -> L79
                        if (r0 == 0) goto L66
                        goto La6
                    L66:
                        r1.add(r2)     // Catch: java.util.concurrent.ExecutionException -> L6a java.lang.Exception -> L79
                        goto L88
                    L6a:
                        boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L79
                        if (r0 == 0) goto L71
                        goto La6
                    L71:
                        r1.add(r2)     // Catch: java.lang.Exception -> L79
                        goto L88
                    L75:
                        r1.add(r2)     // Catch: java.lang.Exception -> L79
                        goto L37
                    L79:
                        r0 = move-exception
                        zyd r2 = defpackage.zxn.g(r0)
                        boolean r0 = r1.isEmpty()
                        if (r0 == 0) goto L85
                        goto La6
                    L85:
                        r1.add(r2)
                    L88:
                        vgs r0 = new vgs
                        r0.<init>(r1, r6)
                        int r6 = r0.d
                        r1 = -1
                        if (r6 != r1) goto L94
                        r6 = 1
                        goto L95
                    L94:
                        r6 = 0
                    L95:
                        defpackage.yqw.L(r6)
                        zyd r2 = r0.b()
                        vgr r6 = new vgr
                        r6.<init>()
                        java.util.concurrent.Executor r0 = r0.c
                        r2.d(r6, r0)
                    La6:
                        vfx r6 = new vfx
                        r6.<init>()
                        yqi r6 = defpackage.wyo.a(r6)
                        zwk r0 = defpackage.zwk.a
                        zyd r6 = defpackage.zuz.g(r2, r6, r0)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.vfu.a(java.lang.Object):zyd");
                }
            }), zwk.a);
            wvxVarF.a(zydVarH);
            wvxVarF.close();
            yqi yqiVarA = wyo.a(new yqi() { // from class: vfy
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    throw new vio((Throwable) obj);
                }
            });
            zwk zwkVar = zwk.a;
            return zuz.g(zud.g(zydVarH, Throwable.class, yqiVarA, zwkVar), wyo.a(new yqi() { // from class: vfz
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    if (((ValidationResult) obj).c()) {
                        return accountId;
                    }
                    throw new vio((byte[]) null);
                }
            }), zwkVar);
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
