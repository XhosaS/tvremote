package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oxe {
    public final Object a;
    public final Object b;

    private oxe(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public static final oxe j(iea ieaVar, ieh iehVar, iea ieaVar2, tst tstVar, Executor executor, ids idsVar) {
        krz krzVar = new krz(ieg.a);
        krzVar.a = new ids[]{ieaVar, ieaVar2, idsVar};
        krzVar.b = executor;
        krzVar.d(new lxf(iehVar, ieaVar2, ieaVar, tstVar, 6));
        iea ieaVarA = krzVar.a();
        iff iffVar = new iff();
        iffVar.f(R.layout.details_familylibrary);
        iffVar.c = new mlw(4);
        iffVar.g(ksd.a());
        iffVar.d();
        return new oxe(ieaVarA, iffVar.c());
    }

    public static oxe k(ieh iehVar) {
        return new oxe(new mmm(iehVar, 16), new mmg(4));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, yow] */
    public final uhp a(uwg uwgVar, uwl uwlVar) {
        uwgVar.getClass();
        uwlVar.getClass();
        return wae.W(this.b, new ixs(this, uwgVar, uwlVar, (yih) null, 16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final oqq b(List list) throws RemoteException {
        oqm oqmVar;
        oqn oqnVar;
        oqq oqqVar = new oqq();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                oqmVar = (oqm) ((uhp) it.next()).get();
                Object obj = this.a;
                if (obj != null) {
                    try {
                        oqp oqpVar = oqmVar.c;
                        if (oqpVar == null || (oqnVar = oqmVar.b) == null) {
                            Log.e("AppDoctor", "Null CompletionResult from Fixer.");
                        } else {
                            ngl nglVar = oqnVar.c;
                            int i = oqpVar.a(nglVar).b;
                            Object obj2 = ((uoo) obj).b;
                            if (i == 5) {
                                String str = oqnVar.b;
                                Bundle bundleA = ((oqh) obj2).a();
                                bundleA.putString("com.google.android.gms.common.appdoctor.uuid", str);
                                ((oqh) obj2).b.call("mark_fix_completed", null, bundleA);
                            } else {
                                oqpVar.a(nglVar);
                                String str2 = oqnVar.b;
                                Bundle bundleA2 = ((oqh) obj2).a();
                                bundleA2.putString("com.google.android.gms.common.appdoctor.uuid", str2);
                                ((oqh) obj2).b.call("mark_fix_attempted", null, bundleA2);
                            }
                        }
                    } catch (RemoteException unused) {
                        Object obj3 = ((uoo) obj).c;
                        vtw vtwVarM = ngz.a.m();
                        oqn oqnVar2 = oqmVar.b;
                        ngl nglVar2 = oqnVar2.c;
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        ((ngz) vtwVarM.b).b = nglVar2.a();
                        String str3 = oqnVar2.b;
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        Context context = ((oqp) obj3).b;
                        Object obj4 = ((uoo) obj).a;
                        ngz ngzVar = (ngz) vtwVarM.b;
                        str3.getClass();
                        ngzVar.d = str3;
                        ((oqg) obj4).e(context, (ngz) vtwVarM.r(), ((oqp) obj3).a);
                    }
                }
                oqqVar.a |= oqmVar.b();
                oqqVar.b |= oqmVar.a();
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                Log.e("AppDoctorFixerFramework", "applyFixes future failed", e);
                Thread.currentThread().interrupt();
            }
            if (oqmVar.a() && oqmVar.c != null) {
                Context context2 = oqmVar.c.b;
                synchronized (oqs.class) {
                    Thread thread = oqs.a;
                    if (thread != null) {
                        thread.interrupt();
                    }
                    if (oqs.b == null) {
                        Thread thread2 = new Thread(new nur(context2.getApplicationContext(), 11));
                        thread2.start();
                        oqs.a = thread2;
                        oqs.b = thread2;
                    }
                }
            } else if (oqmVar.b()) {
                synchronized (oqs.class) {
                    Thread thread3 = oqs.a;
                    if (thread3 == null || !thread3.isAlive()) {
                        Thread thread4 = new Thread(new ehq(8));
                        thread4.start();
                        oqs.a = thread4;
                    } else {
                        oqs.a.getClass();
                    }
                }
            } else {
                continue;
            }
        }
        return oqqVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void c(oqn oqnVar) {
        ?? r0 = this.b;
        sij.x(!r0.contains(oqnVar), "The same fixer cannot be added twice");
        r0.add(oqnVar);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [idy, java.lang.Object] */
    public final void d(mwb mwbVar, lio lioVar) {
        lioVar.d(liq.e(513));
        mwbVar.d("Light");
        mwbVar.e();
        mwbVar.f();
        mwbVar.h();
        mwbVar.g();
        this.a.c(mwbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mwb] */
    public final void e(String str, lio lioVar) {
        d(this.b.b(str), lioVar);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final List f(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kvf kvfVar = (kvf) it.next();
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(kvfVar);
                    break;
                }
                if (!((idw) this.a.get((String) it2.next())).b(kvfVar)) {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final List g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kwn kwnVar = (kwn) it.next();
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(kwnVar);
                    break;
                }
                if (!((idw) this.b.get((String) it2.next())).b(kwnVar)) {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [iea, java.lang.Object] */
    public final void h(ntp ntpVar) {
        ntpVar.c(this.b, (ifc) this.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    public final xqr i(oqp oqpVar) throws Throwable {
        uhp uhpVarAQ;
        oqq oqqVarB;
        uhp uhpVarAQ2;
        boolean z;
        oxe oxeVar = this;
        oqq oqqVar = new oqq();
        try {
            ImmutableList<oqn> immutableListCopyOf = ImmutableList.copyOf((Collection) oxeVar.b);
            ArrayList arrayList = new ArrayList(immutableListCopyOf.size());
            try {
                Iterator<E> it = immutableListCopyOf.iterator();
                while (it.hasNext()) {
                    if (((oqn) it.next()).a(oqpVar)) {
                        Context context = oqpVar.b;
                        oxe oxeVar2 = new oxe(context);
                        boolean z2 = false;
                        boolean z3 = false;
                        for (oqn oqnVar : immutableListCopyOf) {
                            oqo oqoVar = new oqo(oqpVar);
                            oqoVar.g = oqnVar;
                            oqp oqpVarA = oqoVar.a();
                            if (oqnVar.a(oqpVarA)) {
                                oqo oqoVar2 = new oqo(oqpVarA);
                                oqk oqkVar = oqnVar.e;
                                oqoVar2.b(new oql(oqkVar.a, 3));
                                oqp oqpVarA2 = oqoVar2.a();
                                oqnVar.c(oqpVarA2, oqkVar, oxeVar2);
                                uhpVarAQ2 = oqnVar.f ? qtl.aQ(new hbn(oqnVar, oqpVarA2, oxeVar2, 7)) : sfy.C(oqnVar.b(oqpVarA2, oxeVar2, oqkVar));
                                z = true;
                            } else {
                                uhpVarAQ2 = sfy.C(oqm.a);
                                z = false;
                            }
                            z3 |= z;
                            z2 |= !uhpVarAQ2.isDone();
                            arrayList.add(uhpVarAQ2);
                        }
                        if (z2) {
                            oqq oqqVar2 = new oqq();
                            try {
                                uhpVarAQ = qtl.aQ(Executors.callable(new ejr(oxeVar, oqqVar, (List) arrayList, oqpVar, 14)));
                                oqqVarB = oqqVar2;
                            } catch (Throwable th) {
                                th = th;
                                oqqVar = oqqVar2;
                                if (oqqVar.b()) {
                                    oqqVar.a(oqpVar.b);
                                }
                                throw th;
                            }
                        } else {
                            uhpVarAQ = sfy.C(null);
                            oqqVarB = oxeVar.b(arrayList);
                        }
                        xqr xqrVar = new xqr(z3, uhpVarAQ);
                        if (oqqVarB.b()) {
                            oqqVarB.a(context);
                        }
                        return xqrVar;
                    }
                    oxeVar = this;
                }
                xqr xqrVar2 = new xqr(false, (Object) sfy.C(null));
                if (oqqVar.b()) {
                    oqqVar.a(oqpVar.b);
                }
                return xqrVar2;
            } catch (RuntimeException e) {
                qtl.aP(e, oqpVar, "AppDoctorFixerFramework");
                xqr xqrVar3 = new xqr(false, (Object) sfy.B(e));
                if (oqqVar.b()) {
                    oqqVar.a(oqpVar.b);
                }
                return xqrVar3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public oxe(Object obj, yow yowVar) {
        this.a = obj;
        this.b = yowVar;
    }

    public oxe(Context context) {
        unc uncVarAR = qtl.aR(context);
        ocv ocvVar = ogg.a;
        ExecutorService executorServiceP = ocv.p(4);
        Pattern pattern = sjt.a;
        sjs sjsVar = new sjs(context);
        sjsVar.d("app_doctor");
        sjsVar.e("AppDoctor.pb");
        Uri uriA = sjsVar.a();
        sln slnVarA = slo.a();
        slnVarA.d(uriA);
        slnVarA.c(ore.a);
        this.a = uncVarAR.c(slnVarA.a());
        this.b = executorServiceP;
    }

    public oxe(final iea ieaVar, iea ieaVar2, lhm lhmVar, final idw idwVar, idw idwVar2, final long j) {
        HashMap map = new HashMap();
        this.b = map;
        HashMap map2 = new HashMap();
        this.a = map2;
        map2.put("tag_id_unwatched", new idw() { // from class: mpv
            @Override // defpackage.idw
            public final boolean b(Object obj) {
                int i;
                kvf kvfVar = (kvf) obj;
                kvc kvcVarA = ((kva) ieaVar.a()).a(kvfVar);
                if (kvcVarA.d != 0 || (i = kvcVarA.n) == 3 || i == 2 || idwVar.b(kvfVar)) {
                    return false;
                }
                return kvcVarA.k > j || kvcVarA.e;
            }
        });
        map.put("tag_id_unwatched", new mpw(ieaVar, idwVar2, 4));
        map2.put("tag_id_downloaded", new mcb(ieaVar2, 9));
        map.put("tag_id_downloaded", new mcb(ieaVar2, 10));
        map2.put("tag_id_rented", new mcb(ieaVar, 11));
        map.put("tag_id_rented", new mcb(ieaVar, 12));
        map2.put("tag_id_family_library_sharing", new mpw(lhmVar, idwVar, 1));
        map.put("tag_id_family_library_sharing", new mpw(lhmVar, idwVar2, 0));
        map2.put("tag_id_not_family_library_sharing", new mpw(lhmVar, idwVar, 2));
        map.put("tag_id_not_family_library_sharing", new mpw(lhmVar, idwVar2, 3));
        map2.put("tag_id_content_quality_sd", new mcb(ieaVar, 13));
        map.put("tag_id_content_quality_sd", new mcb(ieaVar, 14));
        map2.put("tag_id_content_quality_hd", new mcb(ieaVar, 15));
        map.put("tag_id_content_quality_hd", new mcb(ieaVar, 16));
        map2.put("tag_id_content_quality_uhd", new mcb(ieaVar, 17));
        map.put("tag_id_content_quality_uhd", new mcb(ieaVar, 18));
        map2.put("tag_id_movies_anywhere", new meu(3));
        map2.put("tag_id_upgrade_to_4k", new mcb(ieaVar, 19));
    }

    public oxe() {
        this((uoo) null);
    }

    public oxe(uoo uooVar) {
        this.b = new ArrayList();
        this.a = uooVar;
    }

    public oxe(iea ieaVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.put("MOVIE_TITLE", new fab(14));
        byte[] bArr = null;
        map.put("MOVIE_ADDED_DATE", new acs(ieaVar, 13, bArr));
        map.put("MOVIE_RELEASE_YEAR", new fab(15));
        map.put("MOVIES_DATE_UPGRADE", new acs(ieaVar, 14, bArr));
        map2.put("SHOW_TITLE", new fab(16));
        map2.put("SHOW_ADDED_DATE", new acs(ieaVar, 15, bArr));
    }
}
