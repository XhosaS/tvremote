package defpackage;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.apps.tvsearch.setup.fragment.homegraph.HomeGraphSetupActivity;
import com.google.android.katniss.R;
import io.grpc.Status;
import j$.time.Duration;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ind extends ine implements ioz, owu, ezc {
    private static final long K;
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer");
    public static final long b;
    public Account A;
    public ybo B;
    public String C;
    public oxe D;
    public irg E;
    public yrn F;
    public int G;
    public int H;
    public final ewo I;
    private final agow L;
    private final Executor M;
    private final owy N;
    private final agow O;
    private final agow P;
    private final ghr Q;
    private final beg R;
    private boolean S;
    private boolean T;
    private Set U;
    private boolean V;
    private Set W;
    private final AtomicInteger X;
    private final String Y;
    private int Z;
    private final fdy aa;
    public final HomeGraphSetupActivity c;
    public final ahbt d;
    public final fda e;
    public final agow f;
    public final fze g;
    public final jrs h;
    public final gfr i;
    public final gmd j;
    public final gte k;
    public final ipg l;
    public final gyy m;
    public final irh n;
    public final gta o;
    public final yrx p;
    public fcy q;
    public boolean r;
    public owl s;
    public oww t;
    public boolean u;
    public final Set v;
    public owx w;
    public final ewm x;
    public ygm y;
    public Duration z;

    static {
        long j = agzn.a;
        b = agzp.a(5, agzq.d);
        K = agzp.a(5, agzq.d);
    }

    public ind(HomeGraphSetupActivity homeGraphSetupActivity, agow agowVar, agow agowVar2, ahbt ahbtVar, fda fdaVar, agow agowVar3, Executor executor, owy owyVar, fze fzeVar, ewo ewoVar, jrs jrsVar, gtu gtuVar, gfr gfrVar, gmd gmdVar, gte gteVar, agow agowVar4, agow agowVar5, ipg ipgVar, gyy gyyVar, irh irhVar, gta gtaVar, yrx yrxVar, ghr ghrVar, beg begVar) {
        agowVar.getClass();
        agowVar2.getClass();
        ahbtVar.getClass();
        fdaVar.getClass();
        executor.getClass();
        gtuVar.getClass();
        gfrVar.getClass();
        gmdVar.getClass();
        gteVar.getClass();
        agowVar4.getClass();
        agowVar5.getClass();
        ipgVar.getClass();
        gyyVar.getClass();
        irhVar.getClass();
        ghrVar.getClass();
        this.c = homeGraphSetupActivity;
        this.L = agowVar2;
        this.d = ahbtVar;
        this.e = fdaVar;
        this.f = agowVar3;
        this.M = executor;
        this.N = owyVar;
        this.g = fzeVar;
        this.I = ewoVar;
        this.h = jrsVar;
        this.i = gfrVar;
        this.j = gmdVar;
        this.k = gteVar;
        this.O = agowVar4;
        this.P = agowVar5;
        this.l = ipgVar;
        this.m = gyyVar;
        this.n = irhVar;
        this.o = gtaVar;
        this.p = yrxVar;
        this.Q = ghrVar;
        this.R = begVar;
        this.G = 4;
        this.v = new LinkedHashSet();
        Object objA = agowVar.a();
        objA.getClass();
        this.aa = (fdy) objA;
        this.x = new ewm() { // from class: imm
            @Override // defpackage.ewm
            public final void a() {
                ind indVar = this.a;
                if (indVar.G != 2) {
                    ((zdv) ind.a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "homeKeyPressedListener$lambda$0", 216, "HomeGraphSetupActivityPeer.kt")).u("Canceling HomeGraphSetup on Home Button pressed.");
                    indVar.B = ybo.CANCELED;
                    indVar.n(irg.u);
                }
            }
        };
        agrf agrfVar = agrf.a;
        this.U = agrfVar;
        ygm ygmVar = ygm.a;
        this.y = yhh.a(new ygl());
        this.W = agrfVar;
        Duration durationOfSeconds = Duration.ofSeconds(0L);
        durationOfSeconds.getClass();
        this.z = durationOfSeconds;
        this.X = new AtomicInteger(0);
        this.H = 1;
        this.C = "";
        this.Y = "assistantHomegraphSetupActivityKey";
    }

    private final List u() {
        Set<owl> set = this.U;
        ArrayList arrayList = new ArrayList(agqq.i(set, 10));
        for (owl owlVar : set) {
            ino inoVar = ino.a;
            inn innVar = new inn();
            String strC = owlVar.c();
            if ((innVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                innVar.y();
            }
            ((ino) innVar.b).c = strC;
            String strB = owlVar.b();
            if ((innVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                innVar.y();
            }
            ((ino) innVar.b).b = strB;
            abxd abxdVarV = innVar.v();
            abxdVarV.getClass();
            arrayList.add((ino) abxdVarV);
        }
        return arrayList;
    }

    private final List v() {
        Set<oww> set = this.W;
        ArrayList arrayList = new ArrayList(agqq.i(set, 10));
        for (oww owwVar : set) {
            inq inqVar = inq.a;
            inp inpVar = new inp();
            String strD = owwVar.d();
            if ((inpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                inpVar.y();
            }
            ((inq) inpVar.b).c = strD;
            String strC = owwVar.c();
            if ((inpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                inpVar.y();
            }
            ((inq) inpVar.b).b = strC;
            abxd abxdVarV = inpVar.v();
            abxdVarV.getClass();
            arrayList.add((inq) abxdVarV);
        }
        return arrayList;
    }

    private final void w(String str, Set set) throws Resources.NotFoundException {
        Resources resources = this.c.getResources();
        resources.getClass();
        ArrayList arrayList = new ArrayList(agqq.i(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((own) it.next()).g());
        }
        HashSet hashSet = new HashSet(agrj.b(agqq.i(arrayList, 12)));
        agqq.H(arrayList, hashSet);
        String string = resources.getString(R.string.homegraph_new_device_name, str);
        string.getClass();
        int i = 2;
        while (hashSet.contains(string) && i <= 10000) {
            int i2 = i + 1;
            String string2 = resources.getString(R.string.homegraph_new_device_name_with_number, str, Integer.valueOf(i));
            string2.getClass();
            i = i2;
            string = string2;
        }
        if (true == hashSet.contains(string)) {
            string = null;
        }
        if (string != null) {
            ahal.e(this.d, null, 0, new ims(this, string, null), 3).w(new agux() { // from class: imq
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    Throwable th = (Throwable) obj;
                    zdy zdyVar = ind.a;
                    if (th != null && !(th instanceof CancellationException)) {
                        ((zdv) ((zdv) ind.a.d()).p(th).q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "computeAndUpdateDeviceNameWithRoomName$lambda$32$lambda$31", 914, "HomeGraphSetupActivityPeer.kt")).u("Failed to update device name.");
                    }
                    return agpu.a;
                }
            });
        }
        ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "computeAndUpdateDeviceNameWithRoomName", 918, "HomeGraphSetupActivityPeer.kt")).u("HomeGraph setup successful.");
    }

    private final void x() {
        if (!this.z.isZero() && this.X.incrementAndGet() == 1) {
            this.aa.b(this.z, new agum() { // from class: imn
                @Override // defpackage.agum
                public final Object a() {
                    zdv zdvVar = (zdv) ind.a.d().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "handleTimeout", 1076, "HomeGraphSetupActivityPeer.kt");
                    ind indVar = this.a;
                    zdvVar.w("Failed to show first screen within %s seconds.", indVar.z.getSeconds());
                    indVar.u = true;
                    indVar.B = ybo.SKIPPED;
                    indVar.v.add(ybl.FIRST_SCREEN_LOADING_TIMEOUT);
                    ygm ygmVar = ygm.a;
                    ygl yglVar = new ygl();
                    yhh.b(adzh.HOMEGRAPH_LOAD_LATENCY, yglVar);
                    yrn yrnVar = indVar.F;
                    if (yrnVar == null) {
                        agvy.b("stopwatch");
                        yrnVar = null;
                    }
                    int millis = (int) Duration.ofNanos(yrnVar.b()).toMillis();
                    if ((yglVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        yglVar.y();
                    }
                    ygm ygmVar2 = (ygm) yglVar.b;
                    ygmVar2.b |= 2;
                    ygmVar2.d = millis;
                    indVar.y = yhh.a(yglVar);
                    indVar.n(irg.u);
                    return agpu.a;
                }
            });
        }
        owx owxVar = this.w;
        if (owxVar != null) {
            this.T = false;
            owxVar.d(oxg.SYNC_DEVICES, new owj() { // from class: imo
                @Override // defpackage.owj
                public final void a(Status status, Object obj) {
                    zdy zdyVar = ind.a;
                    status.getClass();
                    if (status.e()) {
                        ((zdv) ind.a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "refreshAndLoadHomeGraph$lambda$5$lambda$4", 408, "HomeGraphSetupActivityPeer.kt")).u("New HomeGraph refresh completed successfully.");
                    } else {
                        ((zdv) ind.a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "refreshAndLoadHomeGraph$lambda$5$lambda$4", 410, "HomeGraphSetupActivityPeer.kt")).x("Retry refresh failed with status: %s.", status);
                    }
                }
            });
        }
    }

    private final void y(bq bqVar, boolean z) {
        HomeGraphSetupActivity homeGraphSetupActivity = this.c;
        ab abVar = new ab(((bw) homeGraphSetupActivity).a.a.e);
        if (z) {
            abVar.r(R.animator.setup_open_enter, R.animator.setup_open_exit, 0, 0);
        } else {
            abVar.r(R.animator.setup_close_enter, R.animator.setup_close_exit, 0, 0);
        }
        abVar.q(R.id.assistant_container, bqVar, "HGSetupActivity");
        if (homeGraphSetupActivity.isFinishing()) {
            return;
        }
        abVar.e();
    }

    public final irg a() {
        irg irgVar = this.E;
        if (irgVar != null) {
            return irgVar;
        }
        agvy.b("state");
        return null;
    }

    public final owl b() {
        owl owlVar = this.s;
        if (owlVar != null) {
            return owlVar;
        }
        agvy.b("currentHome");
        return null;
    }

    @Override // defpackage.ezc
    public final String c() {
        return this.Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.agsw r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.inb
            if (r0 == 0) goto L13
            r0 = r11
            inb r0 = (defpackage.inb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            inb r0 = new inb
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            java.lang.String r5 = "waitForSetupAccountAndStartInitialization"
            java.lang.String r6 = "com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer"
            java.lang.String r7 = "HomeGraphSetupActivityPeer.kt"
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            defpackage.agpl.b(r11)     // Catch: defpackage.ahem -> L2e
            goto L62
        L2e:
            r11 = move-exception
            goto Lb0
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            defpackage.agpl.b(r11)
            zdy r11 = defpackage.ind.a     // Catch: defpackage.ahem -> L2e
            zeo r11 = r11.b()     // Catch: defpackage.ahem -> L2e
            r2 = 274(0x112, float:3.84E-43)
            zeo r11 = r11.q(r6, r5, r2, r7)     // Catch: defpackage.ahem -> L2e
            zdv r11 = (defpackage.zdv) r11     // Catch: defpackage.ahem -> L2e
            java.lang.String r2 = "Waiting for setup account."
            r11.u(r2)     // Catch: defpackage.ahem -> L2e
            long r8 = defpackage.ind.K     // Catch: defpackage.ahem -> L2e
            inc r11 = new inc     // Catch: defpackage.ahem -> L2e
            r11.<init>(r10, r3)     // Catch: defpackage.ahem -> L2e
            r0.c = r4     // Catch: defpackage.ahem -> L2e
            long r8 = defpackage.ahce.a(r8)     // Catch: defpackage.ahem -> L2e
            java.lang.Object r11 = defpackage.ahep.a(r8, r11, r0)     // Catch: defpackage.ahem -> L2e
            if (r11 == r1) goto Laf
        L62:
            irh r11 = r10.n
            com.google.android.apps.tvsearch.setup.fragment.homegraph.HomeGraphSetupActivity r0 = r10.c
            android.content.Intent r0 = r0.getIntent()
            android.accounts.Account r11 = r11.a(r0)
            r10.A = r11
            if (r11 == 0) goto L74
            java.lang.String r3 = r11.name
        L74:
            if (r3 == 0) goto L96
            int r11 = r3.length()
            if (r11 != 0) goto L7d
            goto L96
        L7d:
            zdy r11 = defpackage.ind.a
            zeo r11 = r11.b()
            r0 = 293(0x125, float:4.1E-43)
            zeo r11 = r11.q(r6, r5, r0, r7)
            zdv r11 = (defpackage.zdv) r11
            java.lang.String r0 = "Setup account is ready."
            r11.u(r0)
            r10.l()
            agpu r11 = defpackage.agpu.a
            return r11
        L96:
            zdy r11 = defpackage.ind.a
            zeo r11 = r11.d()
            r0 = 288(0x120, float:4.04E-43)
            zeo r11 = r11.q(r6, r5, r0, r7)
            zdv r11 = (defpackage.zdv) r11
            java.lang.String r0 = "No setup account found after KAM initialization finished."
            r11.u(r0)
            r10.g()
            agpu r11 = defpackage.agpu.a
            return r11
        Laf:
            return r1
        Lb0:
            zdy r0 = defpackage.ind.a
            zeo r0 = r0.d()
            zdv r0 = (defpackage.zdv) r0
            zeo r11 = r0.p(r11)
            r0 = 282(0x11a, float:3.95E-43)
            zeo r11 = r11.q(r6, r5, r0, r7)
            zdv r11 = (defpackage.zdv) r11
            java.lang.String r0 = "Execution timed out before KAM initialization could finish."
            r11.u(r0)
            ybo r11 = defpackage.ybo.FAILURE
            r10.B = r11
            java.util.Set r11 = r10.v
            ybl r0 = defpackage.ybl.KATNISS_ACCOUNT_MANAGER_INITIALIZATION_TIMEOUT
            r11.add(r0)
            irg r11 = defpackage.irg.u
            r10.n(r11)
            agpu r11 = defpackage.agpu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ind.d(agsw):java.lang.Object");
    }

    public final void e(final String str) {
        y(new ikt(), true);
        final owx owxVar = this.w;
        if (owxVar != null) {
            owxVar.d(oxg.SYNC_DEVICES, new owj() { // from class: imk
                @Override // defpackage.owj
                public final void a(Status status, Object obj) {
                    status.getClass();
                    ind indVar = this;
                    if (!status.e()) {
                        ((zdv) ind.a.c().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "createRoomAndAssignDeviceToThisRoom$lambda$29$lambda$28", 857, "HomeGraphSetupActivityPeer.kt")).u("Failed to refresh the homegraph. Room couldn't be created.");
                        indVar.B = ybo.FAILURE;
                        indVar.v.add(ybl.CREATE_ROOM_FAILURE);
                        indVar.n(irg.u);
                        return;
                    }
                    fcy fcyVar = indVar.q;
                    String str2 = fcyVar != null ? fcyVar.a : null;
                    String str3 = str;
                    owx owxVar2 = owxVar;
                    ahal.e(indVar.d, null, 0, new imt(indVar, str3, owxVar2.c(str2) != null, owxVar2, null), 3).w(new agux() { // from class: imj
                        @Override // defpackage.agux
                        public final Object a(Object obj2) {
                            Throwable th = (Throwable) obj2;
                            zdy zdyVar = ind.a;
                            if (th != null && !(th instanceof CancellationException)) {
                                ((zdv) ((zdv) ind.a.d()).p(th).q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "createRoomAndAssignDeviceToThisRoom$lambda$29$lambda$28$lambda$27", 853, "HomeGraphSetupActivityPeer.kt")).u("Failed to create room.");
                            }
                            return agpu.a;
                        }
                    });
                }
            });
        }
    }

    public final void f() {
        this.B = ybo.SKIPPED;
        this.v.add(ybl.INVALID_CAST_INFO);
        n(irg.u);
    }

    public final void g() {
        ((zdv) a.c().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "handleInvalidAccountFailure", 328, "HomeGraphSetupActivityPeer.kt")).u("Unexpected empty setup account! Skipping the homegraph setup.");
        this.B = ybo.FAILURE;
        this.v.add(ybl.UNEXPECTED_SETUP_ACCOUNT);
        n(irg.u);
    }

    public final void h(Status status, oww owwVar) throws Resources.NotFoundException {
        owx owxVar;
        if (status.e()) {
            if (owwVar != null) {
                this.t = owwVar;
                w(owwVar.d(), owwVar.e());
            } else {
                int i = this.H;
                if ((i == 3 || i == 4) && (owxVar = this.w) != null) {
                    fcy fcyVar = this.q;
                    own ownVarC = owxVar.c(fcyVar != null ? fcyVar.a : null);
                    if (ownVarC != null) {
                        String str = this.C;
                        Set setSingleton = Collections.singleton(ownVarC);
                        setSingleton.getClass();
                        w(str, setSingleton);
                    }
                }
            }
            this.B = ybo.SUCCESS;
        } else {
            this.h.c(R.string.homegraph_setup_error);
            ((zdv) a.c().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "handleRoomUpdateCallback", 897, "HomeGraphSetupActivityPeer.kt")).u("Room modification failed. Device couldn't be assigned in the homegraph");
            this.B = ybo.FAILURE;
            this.v.add(ybl.ROOM_UPDATE_FAILURE);
        }
        n(irg.u);
    }

    @Override // defpackage.owu
    public final void i(boolean z) throws CertificateException {
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "onHomeGraphUpdated", 418, "HomeGraphSetupActivityPeer.kt")).x("onHomeGraphUpdated %s", a());
        if (a() != irg.p) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "onHomeGraphUpdated", 422, "HomeGraphSetupActivityPeer.kt")).u("onHomeGraphUpdated called after initial HG load. Ignoring the invocation");
        } else {
            this.T = true;
            k();
        }
    }

    public final void j() {
        this.S = true;
        Object objA = this.P.a();
        objA.getClass();
        Duration durationB = acbh.b((abwf) objA);
        durationB.getClass();
        this.z = durationB;
        this.M.execute(wyo.h(new Runnable() { // from class: imr
            @Override // java.lang.Runnable
            public final void run() throws CertificateException {
                this.a.k();
            }
        }));
    }

    public final void k() throws CertificateException {
        yrn yrnVar;
        yrn yrnVar2;
        yrn yrnVar3;
        if (this.u) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "performEligibilityCheckAndEnterSetup", 476, "HomeGraphSetupActivityPeer.kt")).u("Eligibility check already completed.");
            return;
        }
        if (!this.T) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "performEligibilityCheckAndEnterSetup", 480, "HomeGraphSetupActivityPeer.kt")).u("HG info not loaded yet.");
            return;
        }
        if (!this.S) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "performEligibilityCheckAndEnterSetup", 484, "HomeGraphSetupActivityPeer.kt")).u("Heterodyne sync not completed yet.");
            return;
        }
        fcy fcyVar = this.q;
        if ((fcyVar != null ? fcyVar.a : null) == null) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "performEligibilityCheckAndEnterSetup", 488, "HomeGraphSetupActivityPeer.kt")).u("Cast info not loaded yet.");
            return;
        }
        owx owxVar = this.w;
        own ownVarC = owxVar != null ? owxVar.c(fcyVar.a) : null;
        if (ownVarC == null) {
            if (!((Boolean) this.L.a()).booleanValue() && !this.r) {
                if (!this.z.isZero() && this.X.get() < ((Number) this.O.a()).longValue()) {
                    ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "performEligibilityCheckAndEnterSetup", 507, "HomeGraphSetupActivityPeer.kt")).u("Refreshing and reloading the user's home graph.");
                    x();
                    return;
                }
                ((zdv) a.c().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "performEligibilityCheckAndEnterSetup", 512, "HomeGraphSetupActivityPeer.kt")).u("Legacy linking incomplete thus skipping HomeGraph setup.");
                ygm ygmVar = ygm.a;
                ygl yglVar = new ygl();
                yhh.b(adzh.HOMEGRAPH_LOAD_LATENCY, yglVar);
                yrn yrnVar4 = this.F;
                if (yrnVar4 == null) {
                    agvy.b("stopwatch");
                    yrnVar3 = null;
                } else {
                    yrnVar3 = yrnVar4;
                }
                int millis = (int) Duration.ofNanos(yrnVar3.b()).toMillis();
                if ((yglVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    yglVar.y();
                }
                ygm ygmVar2 = (ygm) yglVar.b;
                ygmVar2.b |= 2;
                ygmVar2.d = millis;
                this.y = yhh.a(yglVar);
                this.u = true;
                this.B = ybo.SKIPPED;
                this.v.add(ybl.DEVICE_NOT_IN_HOME_GRAPH);
                n(irg.u);
                return;
            }
            zdy zdyVar = a;
            zdv zdvVar = (zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "performEligibilityCheckAndEnterSetup", 494, "HomeGraphSetupActivityPeer.kt");
            fcy fcyVar2 = this.q;
            zdvVar.x("Checking certificate validity. Source is %s", fcyVar2 != null ? fcyVar2.c : null);
            fcy fcyVar3 = this.q;
            if (fcyVar3 != null) {
                String str = fcyVar3.b;
                try {
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                    byte[] bArrDecode = Base64.decode(str, 0);
                    bArrDecode.getClass();
                    Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bArrDecode));
                    if (certificateGenerateCertificate instanceof X509Certificate) {
                        X509Certificate x509Certificate = (X509Certificate) certificateGenerateCertificate;
                        String string = x509Certificate.getIssuerX500Principal().toString();
                        string.getClass();
                        if (!agyv.o(string, "T=TEE")) {
                            String string2 = x509Certificate.toString();
                            string2.getClass();
                            if (!agyv.o(string2, "CN=Android Keystore Key")) {
                                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "performEligibilityCheckAndEnterSetup", 501, "HomeGraphSetupActivityPeer.kt")).u("Legacy linking incomplete, run structure linking to create the device.");
                                this.r = true;
                            }
                        }
                        zdv zdvVar2 = (zdv) fcz.a.d().q("com/google/android/apps/tvsearch/cast/info/CastInfoUtilsKt", "isValidCertificate", 66, "CastInfoUtils.kt");
                        String string3 = x509Certificate.getIssuerX500Principal().toString();
                        string3.getClass();
                        boolean zO = agyv.o(string3, "T=TEE");
                        String string4 = x509Certificate.toString();
                        string4.getClass();
                        zdvVar2.H("Invalid certificate: invalid title %b and/or invalid issuer subject %b indicates cert not correctly signed.", zO, agyv.o(string4, "CN=Android Keystore Key"));
                    } else {
                        ((zdv) fcz.a.d().q("com/google/android/apps/tvsearch/cast/info/CastInfoUtilsKt", "isValidCertificate", 59, "CastInfoUtils.kt")).x("Invalid certificate: %s is incorrect format.", certificateGenerateCertificate);
                    }
                } catch (Exception e) {
                    ((zdv) ((zdv) fcz.a.d()).p(e).q("com/google/android/apps/tvsearch/cast/info/CastInfoUtilsKt", "isValidCertificate", 76, "CastInfoUtils.kt")).u("Invalid certificate: could not be parsed.");
                }
            }
            fcy fcyVar4 = this.q;
            String str2 = fcyVar4 != null ? fcyVar4.c : "";
            ybl yblVar = agvy.c(str2, "cast_service") ? ybl.INVALID_CERTIFICATE_FROM_CAST_SERVICE : agvy.c(str2, "content_provider") ? ybl.INVALID_CERTIFICATE_FROM_CONTENT_PROVIDER : ybl.INVALID_CERTIFICATE;
            this.B = ybo.SKIPPED;
            this.v.add(yblVar);
            ygm ygmVar3 = ygm.a;
            ygl yglVar2 = new ygl();
            yhh.b(adzh.LATENCY_SETUP_FIRST_SCREEN, yglVar2);
            yrn yrnVar5 = this.F;
            if (yrnVar5 == null) {
                agvy.b("stopwatch");
                yrnVar2 = null;
            } else {
                yrnVar2 = yrnVar5;
            }
            int millis2 = (int) Duration.ofNanos(yrnVar2.b()).toMillis();
            if ((yglVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yglVar2.y();
            }
            ygm ygmVar4 = (ygm) yglVar2.b;
            ygmVar4.b |= 2;
            ygmVar4.d = millis2;
            this.y = yhh.a(yglVar2);
            n(irg.u);
            return;
        }
        if (!this.z.isZero()) {
            this.aa.a();
            zdv zdvVar3 = (zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "performEligibilityCheckAndEnterSetup", 528, "HomeGraphSetupActivityPeer.kt");
            yrn yrnVar6 = this.F;
            if (yrnVar6 == null) {
                agvy.b("stopwatch");
                yrnVar6 = null;
            }
            zdvVar3.v("Device found. Cancelling timeout. Total time to load was %dms", (int) Duration.ofNanos(yrnVar6.b()).toMillis());
        }
        this.u = true;
        if ((ownVarC != null ? ownVarC.c() : null) != null) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "performEligibilityCheckAndEnterSetup", 535, "HomeGraphSetupActivityPeer.kt")).u("Device is already assigned to a room, thus skipping HomeGraph setup.");
            this.B = ybo.SKIPPED;
            this.v.add(ybl.DEVICE_ALREADY_ASSIGNED_TO_ROOM);
            n(irg.u);
            return;
        }
        ygm ygmVar5 = ygm.a;
        ygl yglVar3 = new ygl();
        yhh.b(adzh.LATENCY_SETUP_FIRST_SCREEN, yglVar3);
        yrn yrnVar7 = this.F;
        if (yrnVar7 == null) {
            agvy.b("stopwatch");
            yrnVar = null;
        } else {
            yrnVar = yrnVar7;
        }
        int millis3 = (int) Duration.ofNanos(yrnVar.b()).toMillis();
        if ((yglVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yglVar3.y();
        }
        ygm ygmVar6 = (ygm) yglVar3.b;
        ygmVar6.b |= 2;
        ygmVar6.d = millis3;
        this.y = yhh.a(yglVar3);
        n(a());
    }

    public final void l() {
        imv imvVar = new imv(this, null);
        ahbt ahbtVar = this.d;
        ahal.e(ahbtVar, null, 0, imvVar, 3);
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "startHeterodyneSync", 1041, "HomeGraphSetupActivityPeer.kt")).u("startHeterodyneSync");
        ahal.e(ahbtVar, null, 0, new ina(this, null), 3);
        HomeGraphSetupActivity homeGraphSetupActivity = this.c;
        bek bekVar = new bek(homeGraphSetupActivity, this.R);
        agwj agwjVar = agwi.a;
        oxe oxeVar = (oxe) bekVar.a(new agvq(oxe.class));
        this.D = oxeVar;
        if (oxeVar == null) {
            agvy.b("operationsViewModel");
            oxeVar = null;
        }
        oxeVar.b("create-home-operation-id", owl.class).a.c(homeGraphSetupActivity, new imx(new agux() { // from class: imf
            @Override // defpackage.agux
            public final Object a(Object obj) {
                oxc oxcVar = (oxc) obj;
                oxcVar.getClass();
                Status status = oxcVar.a;
                status.getClass();
                Object obj2 = oxcVar.b;
                ind indVar = this.a;
                owl owlVar = (owl) obj2;
                if (status.e()) {
                    if (owlVar != null) {
                        indVar.s = owlVar;
                    }
                    indVar.n(irg.s);
                } else {
                    ((zdv) ind.a.c().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "handleCreateHomeCallback", 874, "HomeGraphSetupActivityPeer.kt")).u("Home creation failed. Device couldn't be assigned in the homegraph");
                    indVar.B = ybo.FAILURE;
                    indVar.v.add(ybl.CREATE_HOME_FAILURE);
                    indVar.n(irg.u);
                }
                return agpu.a;
            }
        }));
        oxe oxeVar2 = this.D;
        if (oxeVar2 == null) {
            agvy.b("operationsViewModel");
            oxeVar2 = null;
        }
        oxeVar2.b("create-room-assign-device-operation-id", oww.class).a.c(homeGraphSetupActivity, new imx(new agux() { // from class: img
            @Override // defpackage.agux
            public final Object a(Object obj) throws Resources.NotFoundException {
                oxc oxcVar = (oxc) obj;
                oxcVar.getClass();
                Status status = oxcVar.a;
                status.getClass();
                this.a.h(status, (oww) oxcVar.b);
                return agpu.a;
            }
        }));
        oxe oxeVar3 = this.D;
        if (oxeVar3 == null) {
            agvy.b("operationsViewModel");
            oxeVar3 = null;
        }
        oxeVar3.b("assign-device-operation-id", Void.class).a.c(homeGraphSetupActivity, new imx(new agux() { // from class: imh
            @Override // defpackage.agux
            public final Object a(Object obj) throws Resources.NotFoundException {
                oxc oxcVar = (oxc) obj;
                oxcVar.getClass();
                Status status = oxcVar.a;
                status.getClass();
                ind indVar = this.a;
                indVar.h(status, indVar.t);
                return agpu.a;
            }
        }));
        oxe oxeVar4 = this.D;
        if (oxeVar4 == null) {
            agvy.b("operationsViewModel");
            oxeVar4 = null;
        }
        oxeVar4.b("create-device-operation-id", owk.class).a.c(homeGraphSetupActivity, new imx(new agux() { // from class: imi
            @Override // defpackage.agux
            public final Object a(Object obj) throws Resources.NotFoundException {
                oxc oxcVar = (oxc) obj;
                oxcVar.getClass();
                Status status = oxcVar.a;
                status.getClass();
                owk owkVar = (owk) oxcVar.b;
                this.a.h(status, owkVar != null ? owkVar.a : null);
                return agpu.a;
            }
        }));
        irg irgVar = irg.p;
        irgVar.getClass();
        this.E = irgVar;
        y(new ikt(), true);
        owy owyVar = this.N;
        Account account = this.A;
        String str = account != null ? account.name : null;
        if (str == null) {
            str = "";
        }
        owx owxVarA = owyVar.a(str);
        this.w = owxVarA;
        if (owxVarA != null) {
            owxVarA.i(this);
        }
        zdv zdvVar = (zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "loadHomeGraph", 393, "HomeGraphSetupActivityPeer.kt");
        owx owxVar = this.w;
        zdvVar.x("HomeGraph loaded? : %s", owxVar != null ? Boolean.valueOf(owxVar.m()) : null);
        owx owxVar2 = this.w;
        if (owxVar2 != null) {
            owxVar2.j(oxg.OOBE_DEVICE_SYNC);
        }
    }

    public final void m(owv owvVar) {
        if (owvVar != null) {
            oxe oxeVar = this.D;
            if (oxeVar == null) {
                agvy.b("operationsViewModel");
                oxeVar = null;
            }
            oxeVar.d(owvVar);
            return;
        }
        this.M.execute(wyo.h(new Runnable() { // from class: iml
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h.c(R.string.homegraph_setup_error);
            }
        }));
        ((zdv) a.c().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "trackOperationOrEnd", 956, "HomeGraphSetupActivityPeer.kt")).u("Operation is null, homegraph setup failed.");
        this.B = ybo.FAILURE;
        this.v.add(ybl.NULL_OPERATION);
        n(irg.u);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(defpackage.irg r22) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ind.n(irg):void");
    }

    @Override // defpackage.ioz
    public final void o(int i, Bundle bundle) {
        owx owxVar;
        bundle.getClass();
        this.Z = i;
        int i2 = i - 1;
        oxe oxeVar = null;
        Object obj = null;
        Object obj2 = null;
        if (i2 == 0) {
            y(new ikt(), true);
            String string = bundle.getString("home_name");
            if (string == null || (owxVar = this.w) == null) {
                return;
            }
            oxe oxeVar2 = this.D;
            if (oxeVar2 == null) {
                agvy.b("operationsViewModel");
                oxeVar2 = null;
            }
            oxe oxeVar3 = this.D;
            if (oxeVar3 == null) {
                agvy.b("operationsViewModel");
            } else {
                oxeVar = oxeVar3;
            }
            oxeVar2.d(owxVar.n(string, oxeVar.a("create-home-operation-id", owl.class)));
            return;
        }
        if (i2 == 1) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "handleSetupEvent", 677, "HomeGraphSetupActivityPeer.kt")).u("User created a custom room.");
            this.H = 3;
            String string2 = bundle.getString("room_name");
            if (string2 != null) {
                e(string2);
                return;
            }
            return;
        }
        if (i2 == 2) {
            n(irg.r);
            return;
        }
        if (i2 == 3) {
            n(irg.t);
            return;
        }
        if (i2 == 4) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "handleSetupEvent", 682, "HomeGraphSetupActivityPeer.kt")).u("User selected a provided room.");
            this.H = 4;
            String string3 = bundle.getString("room_name");
            if (string3 != null) {
                e(string3);
                return;
            }
            return;
        }
        if (i2 == 6) {
            Iterator it = this.U.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (agvy.c(((owl) next).b(), bundle.getString("home_id"))) {
                    obj2 = next;
                    break;
                }
            }
            owl owlVar = (owl) obj2;
            if (owlVar == null) {
                ((zdv) a.c().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "handleSetupEvent", 649, "HomeGraphSetupActivityPeer.kt")).u("User selected a nonexistent home.");
                return;
            } else {
                this.s = owlVar;
                n(irg.s);
                return;
            }
        }
        if (i2 != 7) {
            irg irgVarA = a();
            switch (irgVarA.ordinal()) {
                case 15:
                case 16:
                case 20:
                    if (this.G != 2) {
                        ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "processBackAction", 774, "HomeGraphSetupActivityPeer.kt")).u("Canceling HomeGraphSetup on back button pressed.");
                        this.B = ybo.CANCELED;
                        n(irg.u);
                        break;
                    }
                    break;
                case 17:
                case 18:
                    n(irg.q);
                    break;
                case 19:
                    n(irg.s);
                    break;
                default:
                    ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "processBackAction", 780, "HomeGraphSetupActivityPeer.kt")).x("Invalid Setup State [%s]", irgVarA);
                    break;
            }
            return;
        }
        Iterator it2 = this.W.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (agvy.c(((oww) next2).c(), bundle.getString("room_id"))) {
                obj = next2;
                break;
            }
        }
        final oww owwVar = (oww) obj;
        if (owwVar == null) {
            ((zdv) a.c().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "selectRoom", 693, "HomeGraphSetupActivityPeer.kt")).u("User selected a nonexistent room.");
            return;
        }
        this.t = owwVar;
        y(new ikt(), true);
        final owx owxVar2 = this.w;
        if (owxVar2 != null) {
            owxVar2.d(oxg.SYNC_DEVICES, new owj() { // from class: imp
                @Override // defpackage.owj
                public final void a(Status status, Object obj3) {
                    status.getClass();
                    ind indVar = this;
                    if (!status.e()) {
                        ((zdv) ind.a.c().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "selectRoom$lambda$26$lambda$25", 752, "HomeGraphSetupActivityPeer.kt")).u("Failed to refresh the homegraph. Device couldn't be assigned to the room.");
                        indVar.B = ybo.FAILURE;
                        indVar.v.add(ybl.SELECT_ROOM_HOMEGRAPH_REFRESH_FAILURE);
                        indVar.n(irg.u);
                        return;
                    }
                    fcy fcyVar = indVar.q;
                    String str = fcyVar != null ? fcyVar.a : null;
                    oww owwVar2 = owwVar;
                    owx owxVar3 = owxVar2;
                    boolean z = owxVar3.c(str) != null;
                    indVar.H = 2;
                    ahal.e(indVar.d, null, 0, new imy(indVar, z, owxVar3, owwVar2, null), 3).w(new agux() { // from class: ime
                        @Override // defpackage.agux
                        public final Object a(Object obj4) {
                            Throwable th = (Throwable) obj4;
                            zdy zdyVar = ind.a;
                            if (th != null && !(th instanceof CancellationException)) {
                                ((zdv) ((zdv) ind.a.d()).p(th).q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "selectRoom$lambda$26$lambda$25$lambda$24", 746, "HomeGraphSetupActivityPeer.kt")).u("Failed to assign device to room.");
                            }
                            return agpu.a;
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.owu
    public final void q(int i, long j, Status status) {
        ((zdv) a.c().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "onHomeGraphLoadFailed", 454, "HomeGraphSetupActivityPeer.kt")).u("HomeGraph load failed. Skipping the homegraph setup.");
        this.B = ybo.FAILURE;
        this.v.add(ybl.HOMEGRAPH_LOAD_FAILURE);
        ygm ygmVar = ygm.a;
        ygl yglVar = new ygl();
        yhh.b(adzh.HOMEGRAPH_LOAD_LATENCY, yglVar);
        yrn yrnVar = this.F;
        if (yrnVar == null) {
            agvy.b("stopwatch");
            yrnVar = null;
        }
        int millis = (int) Duration.ofNanos(yrnVar.b()).toMillis();
        if ((yglVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yglVar.y();
        }
        ygm ygmVar2 = (ygm) yglVar.b;
        ygmVar2.b |= 2;
        ygmVar2.d = millis;
        this.y = yhh.a(yglVar);
        n(irg.u);
    }

    @Override // defpackage.owu
    public final /* synthetic */ void r(ypn ypnVar) {
        ypnVar.getClass();
    }

    @Override // defpackage.owu
    public final void s() {
        zdy zdyVar = a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "onHomeGraphRefresh", 434, "HomeGraphSetupActivityPeer.kt")).u("onHomeGraphRefresh.");
        if (this.S) {
            if (a() != irg.p || this.u) {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "onHomeGraphRefresh", 441, "HomeGraphSetupActivityPeer.kt")).u("onHomeGraphRefresh called after initial HG load. Ignoring the invocation");
                return;
            }
            owx owxVar = this.w;
            own ownVarC = null;
            if (owxVar != null) {
                fcy fcyVar = this.q;
                ownVarC = owxVar.c(fcyVar != null ? fcyVar.a : null);
            }
            if (ownVarC != null || this.z.isZero() || this.X.get() >= ((Number) this.O.a()).longValue()) {
                return;
            }
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer", "onHomeGraphRefresh", 447, "HomeGraphSetupActivityPeer.kt")).u("Refreshing and reloading the user's home graph.");
            x();
        }
    }

    @Override // defpackage.owu
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.owu
    public final /* synthetic */ void t(Status status) {
    }
}
