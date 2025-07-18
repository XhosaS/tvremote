package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lil implements lhz {
    public final AtomicBoolean a;
    private final Context b;
    private final iea c;
    private final String d = "com.google";
    private final xbw e;
    private final HashMap f;
    private final tdt g;
    private final String h;
    private final long i;
    private final String j;
    private final String k;
    private final String l;
    private final idf m;
    private final yfo n;
    private whb o;
    private tdv p;
    private final lfn q;

    public lil(Context context, iea ieaVar, xbw xbwVar, lxc lxcVar, String str, String str2, long j, kwy kwyVar, lfx lfxVar, yfo yfoVar, lfn lfnVar) {
        this.b = context.getApplicationContext();
        this.c = ieaVar;
        this.e = xbwVar;
        this.j = str2;
        this.h = lxcVar.a;
        this.l = krh.p(str);
        this.i = j;
        this.k = kwyVar.j();
        tdt tdtVar = new tdt();
        this.g = tdtVar;
        this.m = new ljt(lfxVar, 1);
        this.q = lfnVar;
        tdtVar.h = kwyVar.l();
        tdtVar.c = 24576L;
        tdtVar.a = "logs_v2";
        this.f = new HashMap();
        vtw vtwVarM = whb.a.m();
        if (!TextUtils.isEmpty(kwyVar.k())) {
            String strK = kwyVar.k();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            whb whbVar = (whb) vtwVarM.b;
            strK.getClass();
            whbVar.c();
            whbVar.c.add(strK);
        }
        this.o = (whb) vtwVarM.r();
        this.a = new AtomicBoolean();
        this.n = yfoVar;
    }

    private final tdv e() {
        if (this.p == null) {
            ieg iegVarA = ((ldy) this.c).a();
            Account account = iegVarA.k() ? null : new Account(((ksn) iegVarA.g()).a, this.d);
            try {
                HashMap map = this.f;
                tdv tdvVarA = (tdv) map.get(account);
                if (tdvVarA == null) {
                    nvj nvjVar = nvj.a;
                    Context context = this.b;
                    int iA = nwb.a(context);
                    tds tdsVarC = tdv.c();
                    tdsVarC.a = context;
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    String string = defaultSharedPreferences.getString("ANALYTICS_LOGGING_ID_KEY", null);
                    if (string == null) {
                        string = Long.toHexString(new SecureRandom().nextLong());
                        defaultSharedPreferences.edit().putString("ANALYTICS_LOGGING_ID_KEY", string).apply();
                    }
                    tdsVarC.b = string;
                    tdsVarC.c = (String) this.e.b();
                    tdsVarC.d = tdu.MOVIES;
                    tdsVarC.e = this.l;
                    tdsVarC.f = iA;
                    tdsVarC.b(this.i);
                    tdsVarC.g = this.h;
                    tdsVarC.h = this.j;
                    tdsVarC.i = this.k;
                    tdsVarC.j = this.g;
                    tdsVarC.k = account;
                    tdvVarA = tdsVarC.a();
                    map.put(account, tdvVarA);
                }
                this.p = tdvVarA;
            } catch (Exception e) {
                krd.d("Failed to initialize eventLogger", e);
            }
        }
        return this.p;
    }

    private final void f(wjm wjmVar, whl whlVar, uao uaoVar) throws IOException {
        if (e() == null || ksk.t()) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(sfy.T((long[]) this.m.b(((ldy) this.c).a())));
            lfn lfnVar = this.q;
            arrayList.add(Long.valueOf(true != lfnVar.cH() ? 12674900L : 12674899L));
            long[] jArrV = sfy.V(arrayList);
            if (!arrayList.equals(this.o.d)) {
                vtw vtwVarM = whb.a.m();
                vtwVarM.aE(this.o.c);
                vtwVarM.aF(arrayList);
                uir uirVarB = ((lda) this.n).b();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                whb whbVar = (whb) vtwVarM.b;
                whbVar.e = uirVarB;
                whbVar.b |= 2;
                this.o = (whb) vtwVarM.r();
            }
            vun vunVar = this.o.c;
            tdn tdnVar = new tdn((String[]) vunVar.toArray(new String[vunVar.size()]), jArrV, ((lda) this.n).b());
            if (whlVar != null) {
                tdv tdvVarE = e();
                vtw vtwVarG = tdvVarE.g(this.o, System.currentTimeMillis());
                if (!vtwVarG.b.A()) {
                    vtwVarG.u();
                }
                whj whjVar = (whj) vtwVarG.b;
                whj whjVar2 = whj.a;
                whjVar.i = whlVar;
                whjVar.b |= 8192;
                tdvVarE.c.obtainMessage(2, (whj) vtwVarG.r()).sendToTarget();
                return;
            }
            if (wjmVar == null) {
                e().h("", this.o, null, System.currentTimeMillis(), null, null);
                return;
            }
            vtw vtwVar = (vtw) wjmVar.a(5, null);
            vtwVar.x(wjmVar);
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            ((wjm) vtwVar.b).n = vud.a;
            ImmutableList immutableListOf = lfnVar.cH() ? ImmutableList.of(wio.PRIMETIME_ROLLOUT_ENABLED, wio.REPLAY_ROLLOUT_ENABLED, wio.GTV_APP_ENABLED) : ImmutableList.of(wio.PRIMETIME_ROLLOUT_ENABLED, wio.REPLAY_ROLLOUT_ENABLED);
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            wjm wjmVar2 = (wjm) vtwVar.b;
            vuj vujVar = wjmVar2.n;
            if (!vujVar.c()) {
                wjmVar2.n = vuc.q(vujVar);
            }
            Iterator<E> it = immutableListOf.iterator();
            while (it.hasNext()) {
                wjmVar2.n.g(((wio) it.next()).e);
            }
            byte[] bArrH = ((wjm) vtwVar.r()).h();
            tdm tdmVar = new tdm();
            tdmVar.b = "";
            tdmVar.c = tdnVar;
            tdmVar.a = bArrH;
            if (uaoVar != null) {
                tdmVar.d = uaoVar.h();
            }
            e().b(tdmVar);
        } catch (RuntimeException e) {
            Log.w("Failed to log event", e);
        }
    }

    @Override // defpackage.lhz
    public final void a(Runnable runnable) {
        if (this.p == null || ksk.t() || this.a.getAndSet(true)) {
            return;
        }
        e().a(new lik(this, runnable, 0));
    }

    @Override // defpackage.lhz
    public final void b(wjm wjmVar) throws IOException {
        f(wjmVar, null, null);
    }

    @Override // defpackage.lhz
    public final void c(wjm wjmVar, uao uaoVar) throws IOException {
        f(wjmVar, null, uaoVar);
    }

    @Override // defpackage.lhz
    public final void d(whl whlVar) throws IOException {
        f(null, whlVar, null);
    }
}
