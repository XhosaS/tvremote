package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import androidx.work.WorkerParameters;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lhx implements ufv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lhx(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, lgr] */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.Object, mcq] */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r0v182, types: [java.lang.Object, uqw] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, lmz] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lht] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, ldv] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, ldv] */
    /* JADX WARN: Type inference failed for: r3v59, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, san] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, pjk] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ufv
    public final uhp a() throws Throwable {
        int iAL;
        List listUnmodifiableList;
        uhp uhpVarB;
        uhp uhpVarB2;
        int i = 20;
        int i2 = 5;
        boolean z = true;
        int i3 = 0;
        switch (this.c) {
            case 0:
                efc efcVar = new efc(6);
                Object obj = this.a;
                if (!ktw.A(((WorkerParameters) this.b).c, obj.getClass(), efcVar)) {
                    return sfy.C(new gpj());
                }
                ((lhy) obj).a.a();
                return sfy.C(new gpl());
            case 1:
                efc efcVar2 = new efc(i2);
                Object obj2 = this.a;
                if (!ktw.A(((WorkerParameters) this.b).c, obj2.getClass(), efcVar2)) {
                    return sfy.C(new gpj());
                }
                ?? r0 = ((lhy) obj2).a;
                return (!r0.b() || r0.c()) ? sfy.C(new gpl()) : sfy.C(new gpk());
            case 2:
                efc efcVar3 = new efc(7);
                Object obj3 = this.a;
                if (!ktw.A(((WorkerParameters) this.b).c, obj3.getClass(), efcVar3)) {
                    return sfy.C(new gpj());
                }
                Semaphore semaphore = new Semaphore(0);
                lnx lnxVar = (lnx) obj3;
                lnxVar.b.d();
                lnxVar.a.b(new jlr(semaphore, i));
                try {
                    semaphore.acquire();
                    return sfy.C(new gpl());
                } catch (InterruptedException unused) {
                    return sfy.C(new gpj());
                }
            case 3:
                efc efcVar4 = new efc(8);
                Object obj4 = this.a;
                return !ktw.A(((WorkerParameters) this.b).c, obj4.getClass(), efcVar4) ? sfy.C(new gpj()) : ((lhy) obj4).a.a() ? sfy.C(new gpl()) : sfy.C(new gpk());
            case 4:
                efc efcVar5 = new efc(9);
                Object obj5 = this.a;
                if (!ktw.A(((WorkerParameters) this.b).c, obj5.getClass(), efcVar5)) {
                    return sfy.C(new gpj());
                }
                lnx lnxVar2 = (lnx) obj5;
                if (((kuw) lnxVar2.b).q() == 0) {
                    krd.e("No QoE logs to send.");
                    return sfy.C(new gpl());
                }
                krd.e("Network was available so dispatching offline QoE logs");
                ((kdj) lnxVar2.a).a();
                return sfy.C(new gpl());
            case 5:
                lsp lspVar = new lsp(14);
                Object obj6 = this.a;
                WorkerParameters workerParameters = (WorkerParameters) this.b;
                if (!ktw.A(workerParameters.c, obj6.getClass(), lspVar)) {
                    return sfy.C(new gpj());
                }
                Object obj7 = ((lhy) obj6).a;
                Object obj8 = workerParameters.b.b.get("reason");
                ((lzq) obj7).a(((Number) (true == (obj8 instanceof Integer) ? obj8 : 0)).intValue());
                return sfy.C(new gpl());
            case 6:
                lsp lspVar2 = new lsp(19);
                Object obj9 = this.a;
                if (!ktw.A(((WorkerParameters) this.b).c, obj9.getClass(), lspVar2)) {
                    return sfy.C(new gpj());
                }
                mfl mflVar = new mfl();
                mfl mflVar2 = new mfl();
                mfl mflVar3 = new mfl();
                mfl mflVar4 = new mfl();
                mfl mflVar5 = new mfl();
                mbv mbvVar = (mbv) obj9;
                mbvVar.a.a(mflVar);
                mbvVar.b.a(mflVar2);
                lys lysVar = mbvVar.e;
                lysVar.g.execute(new lyp(mflVar3, lysVar.i, lysVar.h, lysVar.k));
                mbvVar.c.a(mflVar5);
                jzs jzsVar = mbvVar.g;
                jzsVar.b.execute(new mav((ldv) jzsVar.c, (lyz) jzsVar.a, mflVar4, "search_history", "account", 1));
                mbvVar.f.a(2);
                mbvVar.d.a();
                UnmodifiableIterator it = ImmutableList.of(mflVar.a(), mflVar2.a(), mflVar3.a(), mflVar5.a(), mflVar4.a()).iterator();
                byte b = false;
                while (it.hasNext()) {
                    ieg iegVar = (ieg) it.next();
                    if (iegVar.k()) {
                        krd.g("Cleanup failed", iegVar.i());
                        b = true;
                    }
                }
                return b != false ? sfy.C(new gpj()) : sfy.C(new gpl());
            case 7:
                lsp lspVar3 = new lsp(i);
                Object obj10 = this.a;
                if (!ktw.A(((WorkerParameters) this.b).c, obj10.getClass(), lspVar3)) {
                    return sfy.C(new gpj());
                }
                mbx mbxVar = (mbx) obj10;
                ieg iegVar2 = (ieg) mbxVar.c;
                if (iegVar2.k() || !mbxVar.b.s((ksn) iegVar2.g())) {
                    return sfy.C(new gpj());
                }
                Object obj11 = mbxVar.d;
                ksn ksnVar = (ksn) iegVar2.g();
                try {
                    Object obj12 = ((lhr) obj11).a;
                    SQLiteDatabase sQLiteDatabaseA = ((lyz) obj12).a();
                    try {
                        Object obj13 = ((lhr) obj11).e;
                        ies iesVar = new ies();
                        iesVar.c(SQLiteQueryBuilder.buildQueryString(true, "user_sentiments", mby.a, "user_sentiment_account = ? AND user_sentiment_uploading = 1", null, null, null, null));
                        String str = ksnVar.a;
                        iesVar.b(str);
                        ieg iegVarB = ((ieo) obj13).b(iesVar.a());
                        if (iegVarB.k()) {
                            throw new mbz("Failed to load user sentiments from database", iegVarB.i());
                        }
                        List list = (List) iegVarB.g();
                        if (!((lhr) obj11).d.cq()) {
                            list = FluentIterable.from(list).filter(new mcp(true ? 1 : 0)).toList();
                        }
                        if (list.isEmpty()) {
                            ((lyz) obj12).f(sQLiteDatabaseA, false, 16);
                        } else {
                            Object objB = ((ltv) ((lhr) obj11).g).b(new lug(ksnVar, ImmutableList.copyOf((Collection) list), ((lhr) obj11).f.getString(krh.USER_SENTIMENTS_UPDATE_TOKEN, "")));
                            if (((ieg) objB).k()) {
                                throw new mbz("Failed to upload user sentiments to server", ((ieg) objB).i());
                            }
                            ContentValues contentValues = new ContentValues(2);
                            Object obj14 = ((lhr) obj11).c;
                            contentValues.put("user_sentiment_timestamp", Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("user_sentiment_uploading", (Boolean) false);
                            sQLiteDatabaseA.update("user_sentiments", contentValues, "user_sentiment_account = ? AND user_sentiment_uploading = 1", new String[]{str});
                            try {
                                int size = list.size();
                                ((lyz) ((lhr) obj11).a).f(sQLiteDatabaseA, true, 16);
                                if (size > 0) {
                                    ((lhr) obj11).b.run();
                                }
                            } catch (Throwable th) {
                                th = th;
                                ((lyz) ((lhr) obj11).a).f(sQLiteDatabaseA, z, 16);
                                throw th;
                            }
                        }
                        return sfy.C(new gpl());
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                    }
                } catch (mbz e) {
                    krd.d("Failed to upload user sentiments.", e);
                    return sfy.C(new gpk());
                }
                break;
            case 8:
                mcp mcpVar = new mcp(i3);
                Object obj15 = this.a;
                return !ktw.A(((WorkerParameters) this.b).c, obj15.getClass(), mcpVar) ? sfy.C(new gpj()) : ((lhy) obj15).a.a() ? sfy.C(new gpl()) : sfy.C(new gpk());
            case 9:
                pje pjeVar = (pje) this.b;
                Set set = pjeVar.b;
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((pjg) it2.next()).a(this.a));
                }
                xqr xqrVarO = sfy.O(arrayList);
                eet eetVar = new eet(arrayList, 17);
                uhs uhsVar = pjeVar.a;
                uhp uhpVarA = xqrVarO.a(eetVar, uhsVar);
                tst tstVar = pjeVar.c;
                return tstVar.g() ? ufn.j(((pjf) tstVar.c()).a(), new pbb(uhpVarA, i2), uhsVar) : uhpVarA;
            case 10:
                return sfy.C((InputStream) ((aafi) ((nsf) this.a).a).r((Uri) this.b, new skn(2)));
            case 11:
                rtk rtkVar = (rtk) this.b;
                return rtkVar.b(((rth) rtkVar.d.b()).c(this.a));
            case 12:
                rwb rwbVar = (rwb) this.b;
                if (!((rqd) rwbVar.b).c(null)) {
                    return uhl.a;
                }
                vtw vtwVar = (vtw) this.a;
                yzz yzzVar = (yzz) vtwVar.b;
                int i4 = yzzVar.s;
                int iAL2 = a.aL(i4);
                if (((iAL2 != 0 && iAL2 == 3) || ((iAL = a.aL(i4)) != 0 && iAL == 2)) && (yzzVar.b & 16) == 0) {
                    return uhl.a;
                }
                rtp rtpVar = (rtp) rwbVar.a.b();
                tst tstVar2 = rtpVar.b;
                tst tstVar3 = rtpVar.a;
                trk trkVar = trk.a;
                uhp uhpVarC = sfy.C(trkVar);
                uhp uhpVarC2 = sfy.C(trkVar);
                return sfy.N(uhpVarC, uhpVarC2).b(new sla(rwbVar, vtwVar, uhpVarC, uhpVarC2, 1), ugk.a);
            case 13:
                rva rvaVar = (rva) this.a;
                if (!((ruw) rvaVar.d.b()).b()) {
                    return uhl.a;
                }
                rvl rvlVar = rvaVar.e;
                if (rvlVar.b()) {
                    return uhl.a;
                }
                Object obj16 = this.b;
                rvlVar.a();
                int i5 = rvb.a;
                sjl.b();
                ruy ruyVar = (ruy) obj16;
                if (ruyVar.a() == 0) {
                    listUnmodifiableList = null;
                } else {
                    qbi qbiVar = new qbi(5);
                    List list2 = ruyVar.d;
                    synchronized (list2) {
                        Collections.sort(list2, qbiVar);
                        ((ruy) obj16).b.b(list2);
                    }
                    ArrayList arrayList2 = new ArrayList(ruyVar.c.keySet());
                    Collections.sort(arrayList2, qbiVar);
                    rus rusVar = ruyVar.b;
                    rusVar.b(arrayList2);
                    rut rutVar = new rut(rusVar);
                    ArrayList arrayList3 = new ArrayList();
                    rutVar.a(rutVar.a, 0L, arrayList3);
                    if (arrayList3.size() == 1) {
                        ((tug) ((tug) rnb.a.b()).j("com/google/android/libraries/performance/primes/metrics/trace/SpanProtoGenerator", "generate", 71, "SpanProtoGenerator.java")).s("No other span except for root span. Dropping trace...");
                        listUnmodifiableList = null;
                    } else {
                        listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList3);
                    }
                }
                if (listUnmodifiableList == null || listUnmodifiableList.isEmpty()) {
                    return uhl.a;
                }
                vtw vtwVarM = yzv.a.m();
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                yzv yzvVar = (yzv) vucVar;
                yzvVar.b = 1 | yzvVar.b;
                yzvVar.c = leastSignificantBits;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                yzv yzvVar2 = (yzv) vtwVarM.b;
                yzvVar2.c();
                vsf.h(listUnmodifiableList, yzvVar2.e);
                yzv yzvVar3 = (yzv) vtwVarM.r();
                String str2 = yzvVar3.e.size() > 0 ? ((yzw) yzvVar3.e.get(0)).c : null;
                rqd rqdVar = rvaVar.a;
                long jA = rqdVar.a(str2);
                if (jA == -1) {
                    return uhl.a;
                }
                vtw vtwVarM2 = zba.a.m();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                zba zbaVar = (zba) vtwVarM2.b;
                yzvVar3.getClass();
                zbaVar.m = yzvVar3;
                zbaVar.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
                zba zbaVar2 = (zba) vtwVarM2.r();
                ((tug) ((tug) rnb.a.c()).j("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "endTracingIfStarted", 195, "TraceMetricServiceImpl.java")).y("Recording trace %d: %s", yzvVar3.c, str2);
                rpz rpzVarA = rqa.a();
                rpzVarA.f(zbaVar2);
                rpzVarA.d = Long.valueOf(jA);
                return rqdVar.b(rpzVarA.a());
            case 14:
                Object obj17 = this.a;
                slk slkVar = (slk) obj17;
                Uri uri = (Uri) sfy.J(slkVar.b);
                skc skcVar = new skc((Closeable) slkVar.g.r(uri, new skm(false, false)));
                Object obj18 = this.b;
                try {
                    try {
                        ((slk) obj17).e(uri);
                        uhpVarB = uhl.a;
                    } catch (IOException e2) {
                        uhpVarB = slk.g(e2) ? sfy.B(e2) : ((ulp) obj18).as(e2, ((slk) obj17).d);
                    }
                    uhp uhpVarB3 = slk.b(uhpVarB, skcVar.a());
                    skcVar.close();
                    return uhpVarB3;
                } finally {
                }
            case 15:
                Object obj19 = this.a;
                slw slwVar = (slw) obj19;
                Uri uri2 = (Uri) sfy.J(slwVar.b);
                skc skcVar2 = new skc((Closeable) slwVar.l.r(uri2, new skm(false, false)));
                Object obj20 = this.b;
                try {
                    try {
                        ((slw) obj19).c(uri2);
                        uhpVarB2 = uhl.a;
                    } finally {
                    }
                } catch (IOException e3) {
                    uhpVarB2 = slw.d(e3) ? sfy.B(e3) : ((ulp) obj20).as(e3, ((slw) obj19).e);
                }
                uhp uhpVarB4 = slw.b(uhpVarB2, skcVar2.a(), ((slw) obj19).c);
                skcVar2.close();
                return uhpVarB4;
            default:
                ?? r02 = this.a;
                Object obj21 = this.b;
                tql tqlVarQ = szg.q("FrameworkChannel#getTransportChannel");
                try {
                    uhp uhpVarC3 = sfy.C(r02.a((uqv) obj21));
                    tqlVarQ.close();
                    return uhpVarC3;
                } finally {
                }
        }
    }

    public /* synthetic */ lhx(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
