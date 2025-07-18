package defpackage;

import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwx {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/platform/account/state/AccountsUpdateHandler");
    public final AccountManager b;
    public final ahbt c;
    public final gtu d;
    public OnAccountsUpdateListener e;
    private final fqa f;
    private final gwo g;
    private final ipx h;
    private final gwz i;
    private final fda j;
    private final gph k;
    private final ffp l;
    private final fuk m;
    private final agow n;
    private final agow o;
    private final gvb p;
    private final idl q;
    private final fcu r;

    public gwx(fqa fqaVar, AccountManager accountManager, gwo gwoVar, ahbt ahbtVar, ipx ipxVar, gwz gwzVar, fda fdaVar, gph gphVar, gtu gtuVar, ffp ffpVar, fuk fukVar, agow agowVar, fcu fcuVar, agow agowVar2, gvb gvbVar, idl idlVar) {
        ahbtVar.getClass();
        fdaVar.getClass();
        gtuVar.getClass();
        ffpVar.getClass();
        agowVar.getClass();
        fcuVar.getClass();
        agowVar2.getClass();
        idlVar.getClass();
        this.f = fqaVar;
        this.b = accountManager;
        this.g = gwoVar;
        this.c = ahbtVar;
        this.h = ipxVar;
        this.i = gwzVar;
        this.j = fdaVar;
        this.k = gphVar;
        this.d = gtuVar;
        this.l = ffpVar;
        this.m = fukVar;
        this.n = agowVar;
        this.r = fcuVar;
        this.o = agowVar2;
        this.p = gvbVar;
        this.q = idlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (((java.util.List) r9).contains(r8) == false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006e -> B:25:0x0071). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r8, defpackage.agsw r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.gwt
            if (r0 == 0) goto L13
            r0 = r9
            gwt r0 = (defpackage.gwt) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            gwt r0 = new gwt
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            agtg r1 = defpackage.agtg.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.agpl.b(r9)
            return r9
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r6 = r0.a
            defpackage.agpl.b(r9)
            goto L71
        L3d:
            defpackage.agpl.b(r9)
            agow r9 = r7.o
            java.lang.Object r9 = r9.a()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L96
            java.util.Iterator r8 = r8.iterator()
            r6 = r8
        L53:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L7a
            java.lang.Object r2 = r6.next()
            r8 = r2
            android.accounts.Account r8 = (android.accounts.Account) r8
            gtu r9 = r7.d
            r0.a = r6
            r0.b = r2
            r0.c = r8
            r0.f = r4
            java.lang.Object r9 = r9.g(r0)
            if (r9 != r1) goto L71
            goto L94
        L71:
            java.util.List r9 = (java.util.List) r9
            boolean r8 = r9.contains(r8)
            if (r8 != 0) goto L53
            goto L7b
        L7a:
            r2 = r5
        L7b:
            android.accounts.Account r2 = (android.accounts.Account) r2
            if (r2 == 0) goto L96
            gvb r8 = r7.p
            java.lang.String r9 = r2.name
            r9.getClass()
            r0.a = r5
            r0.b = r5
            r0.c = r5
            r0.f = r3
            java.lang.Object r8 = r8.b(r9, r0)
            if (r8 != r1) goto L95
        L94:
            return r1
        L95:
            return r8
        L96:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwx.a(java.util.List, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        if (r13 != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        if (r13 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
    
        if (r13.g(r11, r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0118, code lost:
    
        if (r13 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0118 -> B:42:0x011b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.List r11, boolean r12, defpackage.agsw r13) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwx.b(java.util.List, boolean, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        if (r14.f(r13, r6) != r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100 A[PHI: r13
  0x0100: PHI (r13v7 java.lang.Object) = (r13v6 java.lang.Object), (r13v15 java.lang.Object) binds: [B:40:0x00fe, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.List r13, defpackage.agsw r14) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwx.c(java.util.List, agsw):java.lang.Object");
    }
}
