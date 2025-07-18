package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lla implements idf {
    private final idy a;
    private final llw b;
    private final String c;
    private final String d;
    private final String e;
    private final ieg f;
    private final lnu g;
    private final idb h;
    private final Runnable i;
    private final lux j;
    private final boolean k;
    private final boolean l;
    private final idr m;
    private final lkq n;
    private final tst o;
    private final lmy p;
    private final TokenData q;
    private final boolean r;
    private final isy s;
    private final jzs t;
    private final kdh u;

    public lla(isy isyVar, ldv ldvVar, lkq lkqVar, lhr lhrVar, llw llwVar, String str, String str2, String str3, boolean z, ieg iegVar, lnu lnuVar, idy idyVar, boolean z2, idr idrVar, idb idbVar, Runnable runnable, lux luxVar, jzs jzsVar, kdh kdhVar, tst tstVar, boolean z3) {
        this.a = idyVar;
        this.n = lkqVar;
        this.s = isyVar;
        this.b = llwVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.k = z;
        this.f = iegVar;
        this.g = lnuVar;
        this.h = idbVar;
        this.l = z2;
        this.m = idrVar;
        this.i = runnable;
        this.j = luxVar;
        this.t = jzsVar;
        this.u = kdhVar;
        this.o = tstVar;
        this.p = lhrVar.e(str, z, iegVar, !TextUtils.isEmpty(str2) ? ksy.h(str) : ksy.i(str));
        this.q = ldvVar.i(iegVar);
        this.r = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [idr, java.lang.Object] */
    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        String str;
        String str2;
        String str3;
        boolean z;
        lnr lnrVarI;
        llh llhVar = (llh) obj;
        llw llwVar = this.b;
        String strC = llwVar.c();
        Locale localeForLanguageTag = TextUtils.isEmpty(strC) ? null : Locale.forLanguageTag(strC);
        nag nagVar = new nag(null, null, null, null);
        ieg iegVar = this.f;
        nagVar.n(iegVar);
        String str4 = this.d;
        nagVar.o(!TextUtils.isEmpty(str4) ? ksy.h(this.c) : ksy.i(this.c));
        nagVar.a = tst.h(localeForLanguageTag);
        nagVar.p(lgm.a());
        lry lryVarM = nagVar.m();
        lkq lkqVar = this.n;
        String str5 = this.c;
        String str6 = this.e;
        boolean z2 = this.k;
        lnu lnuVar = this.g;
        idy idyVar = this.a;
        boolean z3 = this.l;
        idr idrVar = this.m;
        idb idbVar = this.h;
        isy isyVar = this.s;
        if (ksk.t()) {
            lnrVarI = ((lkt) isyVar.a).i(isyVar.b);
            str = str4;
            str2 = str5;
            str3 = str6;
            z = z2;
        } else {
            ArrayList arrayList = new ArrayList();
            str = str4;
            arrayList.add(isyVar.b);
            arrayList.add(isyVar.c);
            Object obj2 = isyVar.d;
            str2 = str5;
            lny lnyVar = (lny) obj2;
            str3 = str6;
            lnyVar.b.clear();
            lnyVar.c.clear();
            z = z2;
            lnyVar.a.execute(new lik(obj2, lryVarM, 11));
            lnrVarI = ((lkt) isyVar.a).i((lnn[]) arrayList.toArray(new lnn[0]));
        }
        lnr lnrVar = lnrVarI;
        lmy lmyVar = this.p;
        Runnable runnable = this.i;
        TokenData tokenData = this.q;
        lux luxVar = this.j;
        jzs jzsVar = this.t;
        kdh kdhVar = this.u;
        tst tstVar = this.o;
        boolean z4 = this.r;
        lfn lfnVar = (lfn) lkqVar.a.b();
        lfnVar.getClass();
        man manVar = (man) lkqVar.b.b();
        manVar.getClass();
        mem memVar = (mem) lkqVar.c.b();
        memVar.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) lkqVar.d.b();
        sharedPreferences.getClass();
        lyz lyzVar = (lyz) lkqVar.e.b();
        lyzVar.getClass();
        ExecutorService executorService = (ExecutorService) lkqVar.f.b();
        executorService.getClass();
        Executor executor = (Executor) lkqVar.g.b();
        executor.getClass();
        hfx hfxVar = (hfx) lkqVar.h.b();
        hfxVar.getClass();
        kdj kdjVar = (kdj) lkqVar.i.b();
        kdjVar.getClass();
        yfo yfoVar = lkqVar.j;
        yfo yfoVar2 = lkqVar.k;
        yfo yfoVar3 = lkqVar.l;
        Context contextA = ((rgq) yfoVar).a();
        ?? B = yfoVar2.b();
        idr idrVarA = ((kqu) yfoVar3).a();
        llhVar.getClass();
        return new lkp(lfnVar, manVar, memVar, sharedPreferences, lyzVar, executorService, executor, hfxVar, kdjVar, contextA, B, idrVarA, llhVar, llwVar, str2, str3, str, z, iegVar, lnuVar, idyVar, z3, idrVar, idbVar, lnrVar, lmyVar, runnable, tokenData, luxVar, jzsVar, kdhVar, tstVar, new lnc(), z4);
    }
}
