package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.ArrayMap;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqf {
    public static final int a = Math.max(1, Runtime.getRuntime().availableProcessors() / 2);
    public final Context b;
    public final idr c;
    public final idb d;
    public final idr e;
    public final idr f;
    public final idr g;
    public final idr h;
    public final idr i;
    public final String j;
    public final long k;
    public SharedPreferences.OnSharedPreferenceChangeListener l;
    public lfz m;
    private lzz n;
    private lys o;

    public kqf(Context context) {
        new idt(null);
        this.c = new idz(1);
        this.d = new krk(this, 1);
        this.e = new idz(false);
        this.f = new idz(false);
        this.g = new idz("");
        ieg iegVar = ieg.a;
        this.h = new idz(iegVar);
        this.i = new idz(iegVar);
        this.j = lnz.a();
        this.k = SystemClock.elapsedRealtime();
        krf.b();
        this.b = context.getApplicationContext();
    }

    final synchronized Executor A(jzs jzsVar) {
        return jzsVar.h(3000);
    }

    final synchronized Executor B(jzs jzsVar) {
        return jzsVar.h(2000);
    }

    public final synchronized kwy C(kwy kwyVar, Context context) {
        return new kwy(context, kwyVar, new llu(context.getResources()));
    }

    public final synchronized idy D(hfx hfxVar, mab mabVar) {
        return hfxVar.q(mabVar, "com.google.android.videos.PURCHASE_SYNC_COMPLETED", "com.google.android.videos.PURCHASE_SYNC_ERROR");
    }

    final synchronized idy E(hfx hfxVar, mcw mcwVar) {
        return hfxVar.q(mcwVar, "com.google.android.videos.WISHLIST_SYNC_COMPLETED", "com.google.android.videos.WISHLIST_SYNC_ERROR");
    }

    final synchronized idr a(SharedPreferences sharedPreferences) {
        idz idzVar;
        idzVar = new idz(Long.valueOf(sharedPreferences.getLong(krh.STALENESS_TIME, 0L)));
        idzVar.ea(new kde(idzVar, sharedPreferences, 3));
        return idzVar;
    }

    final synchronized ids b() {
        return new iem(this.b, "android.intent.action.TIME_SET");
    }

    public final synchronized idy c(Context context) {
        return new lyl(dyd.a(context), 3);
    }

    public final iea d(ldv ldvVar) {
        return ldvVar.f();
    }

    public final synchronized iea e(iea ieaVar) {
        iea ieaVarA;
        krz krzVar = new krz(kva.a);
        krzVar.a = new ids[]{ieaVar};
        krzVar.d(new kqd(ieaVar, 1));
        ieaVarA = krzVar.a();
        ieaVarA.ea(new krt());
        return ieaVarA;
    }

    public final yow f(Executor executor) {
        return yoz.l(ylh.ai(executor));
    }

    public final void g(lfn lfnVar, lxc lxcVar) {
        if (lfnVar.cR()) {
            this.c.c(3);
            return;
        }
        int iAb = lfnVar.ab();
        String strBf = lfnVar.bf();
        int i = lxcVar.b;
        if (i != -1 && (iAb > i || Pattern.matches(strBf, String.valueOf(i)))) {
            this.c.c(4);
        } else if (System.currentTimeMillis() < 1412121600000L) {
            this.c.c(2);
        } else {
            this.c.c(1);
        }
    }

    public final synchronized iea h(lfn lfnVar, iea ieaVar, lzz lzzVar, lyz lyzVar, ExecutorService executorService) {
        iea ieaVarA;
        long jAx = lfnVar.ax();
        jxt jxtVar = new jxt(lzzVar, 3);
        idh idhVarD = idh.d();
        idhVarD.e(lyx.b);
        idhVarD.e(jxtVar);
        idf idfVarB = idhVarD.b(new jxt(new lyv(jAx), 7));
        krz krzVar = new krz(ieg.a);
        krzVar.a = new ids[]{ieaVar, lyzVar.c(0, 11)};
        krzVar.b = executorService;
        krzVar.d(new ldj(ieaVar, idfVarB, 1));
        ieaVarA = krzVar.a();
        ieaVarA.ea(new krt());
        return ieaVarA;
    }

    final synchronized lzz i(ExecutorService executorService, lyz lyzVar, iej iejVar) {
        if (this.n == null) {
            this.n = new maa(executorService, lyzVar);
            iejVar.dM();
        }
        return this.n;
    }

    final synchronized man j(idf idfVar, Context context) {
        return new man(context, idfVar, new mfa(mfa.b));
    }

    final synchronized void k(maz mazVar) {
        mazVar.f(mazVar.a);
    }

    final synchronized void l() {
    }

    final synchronized void m() {
    }

    public final synchronized void n() {
    }

    final synchronized void o() {
    }

    public final synchronized void p() {
    }

    public final synchronized void q() {
    }

    public final synchronized void r() {
    }

    public final lys s(ExecutorService executorService, Executor executor, lfn lfnVar, ldv ldvVar, lyz lyzVar, yfo yfoVar, lfz lfzVar, SharedPreferences sharedPreferences, lie lieVar) {
        if (this.o == null) {
            this.o = new lys(executorService, executor, lfnVar, ldvVar, lyzVar, yfoVar, lfzVar, sharedPreferences, lieVar);
        }
        return this.o;
    }

    final synchronized luq t(Context context, mef mefVar) {
        return new luq(new File(context.getFilesDir(), "screenshots"), mefVar, 5);
    }

    final synchronized luq u(Context context, mef mefVar) {
        return new luq(new File(context.getFilesDir(), "show_banners"), mefVar, 5);
    }

    final synchronized luq v(Context context, mef mefVar) {
        return new luq(new File(context.getFilesDir(), "show_posters"), mefVar, 5);
    }

    final synchronized luq w(Context context, mef mefVar) {
        return new luq(new File(context.getFilesDir(), "posters"), mefVar, 5);
    }

    final synchronized nuh x() {
        return new nuh((char[]) null);
    }

    public final synchronized kuw y(leu leuVar, leu leuVar2, leu leuVar3, leu leuVar4, leu leuVar5) {
        ArrayMap arrayMap;
        arrayMap = new ArrayMap();
        arrayMap.put(2, leuVar);
        arrayMap.put(16, leuVar2);
        arrayMap.put(4, leuVar3);
        arrayMap.put(32, leuVar4);
        arrayMap.put(64, leuVar5);
        return new kuw(arrayMap);
    }

    final synchronized jzs z() {
        return new jzs();
    }
}
