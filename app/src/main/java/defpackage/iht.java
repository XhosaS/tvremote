package defpackage;

import android.accounts.Account;
import android.content.Context;
import androidx.work.WorkerParameters;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iht implements vtg {
    public static final ihl a = new ihl();
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/setup/fix/FixAssistantSettingsWorker");
    public static final Duration c;
    public final fda d;
    public final agow e;
    public final igt f;
    public final gtu g;
    public final agow h;
    public final List i;
    public boolean j;
    private final iax k;
    private final Supplier l;
    private final Context m;
    private final ahbt n;
    private final Supplier o;
    private final agow p;
    private final fjn q;
    private final fsv r;
    private final idl s;
    private final fyb t;

    static {
        Duration durationOfHours = Duration.ofHours(24L);
        durationOfHours.getClass();
        c = durationOfHours;
        Duration.ofHours(12L).getClass();
    }

    public iht(iax iaxVar, Supplier supplier, fda fdaVar, Context context, ahbt ahbtVar, Supplier supplier2, agow agowVar, agow agowVar2, fjn fjnVar, fyb fybVar, igt igtVar, fsv fsvVar, gtu gtuVar, idl idlVar, agow agowVar3) {
        iaxVar.getClass();
        fdaVar.getClass();
        context.getClass();
        ahbtVar.getClass();
        agowVar.getClass();
        agowVar2.getClass();
        fjnVar.getClass();
        gtuVar.getClass();
        idlVar.getClass();
        agowVar3.getClass();
        this.k = iaxVar;
        this.l = supplier;
        this.d = fdaVar;
        this.m = context;
        this.n = ahbtVar;
        this.o = supplier2;
        this.e = agowVar;
        this.p = agowVar2;
        this.q = fjnVar;
        this.t = fybVar;
        this.f = igtVar;
        this.r = fsvVar;
        this.g = gtuVar;
        this.s = idlVar;
        this.h = agowVar3;
        this.i = new ArrayList();
    }

    private final boolean i(Account account) {
        List list = this.i;
        list.remove(account);
        if (!list.isEmpty()) {
            return true;
        }
        if (this.j) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/setup/fix/FixAssistantSettingsWorker", "maybeFinishWorker", 282, "FixAssistantSettingsWorker.kt")).u("Retrying failing fix setting worker.");
            return false;
        }
        this.t.a(this.m);
        return true;
    }

    @Override // defpackage.vtu
    public final /* synthetic */ zyd a(WorkerParameters workerParameters) {
        return vtt.a();
    }

    @Override // defpackage.vtg, defpackage.vtu
    public final zyd b(WorkerParameters workerParameters) {
        workerParameters.getClass();
        zdy zdyVar = b;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/fix/FixAssistantSettingsWorker", "startWork", 290, "FixAssistantSettingsWorker.kt")).u("#startWork");
        igt igtVar = this.f;
        if (!igtVar.d()) {
            this.s.o();
        }
        this.i.clear();
        ArrayList arrayList = new ArrayList();
        if (((Boolean) this.l.get()).booleanValue()) {
            List<Account> listN = this.g.n();
            listN.size();
            for (Account account : listN) {
                idl idlVar = this.s;
                if (idlVar.V(account, igtVar.d())) {
                    arrayList.add(account);
                } else if (idlVar.e(account) != idj.b && !((Boolean) this.o.get()).booleanValue()) {
                    ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/fix/FixAssistantSettingsWorker", "prepareAccountsToBeFixed", 357, "FixAssistantSettingsWorker.kt")).u("No need to verify Assistant settings as user is not signed in or is not opted in to assistant.");
                } else if (((Boolean) this.p.a()).booleanValue()) {
                    ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/fix/FixAssistantSettingsWorker", "prepareAccountsToBeFixed", 362, "FixAssistantSettingsWorker.kt")).u("Skipping the guards as periodic fixer worker is enabled.");
                    arrayList.add(account);
                }
            }
        }
        List listX = agqq.x(arrayList);
        if (!listX.isEmpty()) {
            return ahkr.c(this.n, 0, new ihr(this, listX, null), 3);
        }
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/fix/FixAssistantSettingsWorker", "startWork", 301, "FixAssistantSettingsWorker.kt")).u("No need to verify Assistant settings");
        return zxn.h(new cbt(caz.b));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4 A[PHI: r11 r13
  0x00d4: PHI (r11v10 java.lang.Object) = (r11v17 java.lang.Object), (r11v18 java.lang.Object) binds: [B:43:0x00d1, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x00d4: PHI (r13v17 java.lang.Object) = (r13v16 java.lang.Object), (r13v1 java.lang.Object) binds: [B:43:0x00d1, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.accounts.Account r11, defpackage.ymc r12, defpackage.agsw r13) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iht.c(android.accounts.Account, ymc, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.accounts.Account r10, defpackage.ymg r11, defpackage.agsw r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.ihn
            if (r0 == 0) goto L13
            r0 = r12
            ihn r0 = (defpackage.ihn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ihn r0 = new ihn
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            java.lang.String r3 = "fixCurrentSettingsAndFinishWorker"
            java.lang.String r4 = "com/google/android/apps/tvsearch/setup/fix/FixAssistantSettingsWorker"
            r5 = 2
            r6 = 1
            java.lang.String r7 = "FixAssistantSettingsWorker.kt"
            if (r2 == 0) goto L42
            if (r2 == r6) goto L38
            if (r2 != r5) goto L30
            defpackage.agpl.b(r12)
            return r12
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            java.lang.Object r10 = r0.a
            defpackage.agpl.b(r12)
            agpk r12 = (defpackage.agpk) r12
            java.lang.Object r11 = r12.a
            goto L91
        L42:
            defpackage.agpl.b(r12)
            zdy r12 = defpackage.iht.b
            zeo r12 = r12.b()
            r2 = 173(0xad, float:2.42E-43)
            zeo r12 = r12.q(r4, r3, r2, r7)
            zdv r12 = (defpackage.zdv) r12
            java.lang.String r2 = "Sending Updates to fix current AssistantSettings"
            r12.u(r2)
            int r12 = r11.b
            r12 = r12 & 4
            r2 = 0
            if (r12 == 0) goto L61
            r12 = r6
            goto L62
        L61:
            r12 = r2
        L62:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r12)
            yip r12 = r11.h
            if (r12 != 0) goto L6d
            yip r12 = defpackage.yip.a
        L6d:
            abxs r12 = r12.b
            int r12 = r12.size()
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r12)
            int r12 = r11.b
            r12 = r12 & r5
            if (r12 == 0) goto L7e
            r2 = r6
        L7e:
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r2)
            iax r12 = r9.k
            r0.a = r10
            r0.d = r6
            java.lang.String r2 = "FixAssistantSettingsWorker"
            java.lang.Object r11 = r12.j(r10, r11, r2, r0)
            if (r11 == r1) goto Ld4
        L91:
            java.lang.Throwable r12 = defpackage.agpk.a(r11)
            if (r12 != 0) goto Lae
            ymi r11 = (defpackage.ymi) r11
            irk r12 = defpackage.irk.a
            boolean r11 = r12.d(r11)
            r12 = 0
            r0.a = r12
            r0.d = r5
            android.accounts.Account r10 = (android.accounts.Account) r10
            java.lang.Object r10 = r9.h(r10, r6, r11, r0)
            if (r10 != r1) goto Lad
            goto Ld4
        Lad:
            return r10
        Lae:
            zdy r11 = defpackage.iht.b
            zeo r11 = r11.d()
            zdv r11 = (defpackage.zdv) r11
            zeo r11 = r11.p(r12)
            r12 = 196(0xc4, float:2.75E-43)
            zeo r11 = r11.q(r4, r3, r12, r7)
            zdv r11 = (defpackage.zdv) r11
            java.lang.String r12 = "Error receiving UpdateSettingsUiResponse."
            r11.u(r12)
            r9.j = r6
            android.accounts.Account r10 = (android.accounts.Account) r10
            boolean r10 = r9.i(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        Ld4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iht.e(android.accounts.Account, ymg, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(android.accounts.Account r9, defpackage.agsw r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iht.f(android.accounts.Account, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(android.accounts.Account r9, defpackage.ymg r10, defpackage.agsw r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ihp
            if (r0 == 0) goto L13
            r0 = r11
            ihp r0 = (defpackage.ihp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ihp r0 = new ihp
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            java.lang.String r3 = "purgeSettingsAndFinishWorker"
            java.lang.String r4 = "com/google/android/apps/tvsearch/setup/fix/FixAssistantSettingsWorker"
            r5 = 2
            r6 = 1
            java.lang.String r7 = "FixAssistantSettingsWorker.kt"
            if (r2 == 0) goto L42
            if (r2 == r6) goto L38
            if (r2 != r5) goto L30
            defpackage.agpl.b(r11)
            return r11
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.a
            defpackage.agpl.b(r11)
            agpk r11 = (defpackage.agpk) r11
            java.lang.Object r10 = r11.a
            goto L66
        L42:
            defpackage.agpl.b(r11)
            zdy r11 = defpackage.iht.b
            zeo r11 = r11.b()
            r2 = 207(0xcf, float:2.9E-43)
            zeo r11 = r11.q(r4, r3, r2, r7)
            zdv r11 = (defpackage.zdv) r11
            java.lang.String r2 = "Sending Updates to purge AssistantSettings"
            r11.u(r2)
            iax r11 = r8.k
            r0.a = r9
            r0.d = r6
            java.lang.String r2 = "FixAssistantSettingsWorker"
            java.lang.Object r10 = r11.j(r9, r10, r2, r0)
            if (r10 == r1) goto La3
        L66:
            java.lang.Throwable r11 = defpackage.agpk.a(r10)
            if (r11 != 0) goto L7d
            ymi r10 = (defpackage.ymi) r10
            r10 = 0
            r0.a = r10
            r0.d = r5
            android.accounts.Account r9 = (android.accounts.Account) r9
            java.lang.Object r9 = r8.h(r9, r6, r6, r0)
            if (r9 != r1) goto L7c
            goto La3
        L7c:
            return r9
        L7d:
            zdy r10 = defpackage.iht.b
            zeo r10 = r10.d()
            zdv r10 = (defpackage.zdv) r10
            zeo r10 = r10.p(r11)
            r11 = 217(0xd9, float:3.04E-43)
            zeo r10 = r10.q(r4, r3, r11, r7)
            zdv r10 = (defpackage.zdv) r10
            java.lang.String r11 = "Error receiving UpdateSettingsUiResponse."
            r10.u(r11)
            r8.j = r6
            android.accounts.Account r9 = (android.accounts.Account) r9
            boolean r9 = r8.i(r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iht.g(android.accounts.Account, ymg, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r8.a(r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(android.accounts.Account r7, boolean r8, boolean r9, defpackage.agsw r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.ihs
            if (r0 == 0) goto L13
            r0 = r10
            ihs r0 = (defpackage.ihs) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ihs r0 = new ihs
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r7 = r0.a
            defpackage.agpl.b(r10)
            goto L94
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.a
            defpackage.agpl.b(r10)
            goto L72
        L3a:
            defpackage.agpl.b(r10)
            java.lang.String r10 = "wrapUpWorker"
            java.lang.String r2 = "com/google/android/apps/tvsearch/setup/fix/FixAssistantSettingsWorker"
            java.lang.String r5 = "FixAssistantSettingsWorker.kt"
            if (r8 == 0) goto L9f
            if (r9 == 0) goto L7f
            idl r8 = r6.s
            igt r9 = r6.f
            boolean r9 = r9.d()
            r8.u(r7, r9)
            zdy r8 = defpackage.iht.b
            zeo r8 = r8.b()
            r9 = 249(0xf9, float:3.49E-43)
            zeo r8 = r8.q(r2, r10, r9, r5)
            zdv r8 = (defpackage.zdv) r8
            java.lang.String r9 = "Triggering cascading home graph and FCM worker to update HomeGraph."
            r8.u(r9)
            fjn r8 = r6.q
            r0.a = r7
            r0.d = r4
            r9 = 0
            java.lang.Object r8 = r8.d(r9, r0)
            if (r8 == r1) goto L7e
        L72:
            fsv r8 = r6.r
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L94
        L7e:
            return r1
        L7f:
            zdy r8 = defpackage.iht.b
            zeo r8 = r8.b()
            r9 = 255(0xff, float:3.57E-43)
            zeo r8 = r8.q(r2, r10, r9, r5)
            zdv r8 = (defpackage.zdv) r8
            java.lang.String r9 = "Retry Fixer worker since Setting is still not in good state."
            r8.u(r9)
            r6.j = r4
        L94:
            android.accounts.Account r7 = (android.accounts.Account) r7
            boolean r7 = r6.i(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L9f:
            zdy r8 = defpackage.iht.b
            zeo r8 = r8.d()
            r9 = 262(0x106, float:3.67E-43)
            zeo r8 = r8.q(r2, r10, r9, r5)
            zdv r8 = (defpackage.zdv) r8
            java.lang.String r9 = "Rescheduling the worker as the cast info is not present."
            r8.u(r9)
            r6.j = r4
            boolean r7 = r6.i(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iht.h(android.accounts.Account, boolean, boolean, agsw):java.lang.Object");
    }

    @Override // defpackage.vtu
    public final /* synthetic */ void d(vtj vtjVar) {
    }
}
