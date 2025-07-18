package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Trace;
import android.util.Pair;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import com.google.android.videos.R;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ejr implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public ejr(View view, nxb nxbVar, cxi cxiVar, ValueAnimator valueAnimator, int i) {
        this.e = i;
        this.a = view;
        this.d = nxbVar;
        this.c = cxiVar;
        this.b = valueAnimator;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, ybp] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r2v19, types: [fuj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [fuj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [fqn, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean zB;
        switch (this.e) {
            case 0:
                Pair pair = (Pair) this.b;
                ((ejs) this.a).a.j.h(((Integer) pair.first).intValue(), (evz) pair.second, (evq) this.c, (evv) this.d);
                return;
            case 1:
                cxn.f((View) this.a, (nxb) this.d, (cxi) this.c);
                ((ValueAnimator) this.b).start();
                return;
            case 2:
                Pair pair2 = (Pair) this.b;
                ((ejs) this.a).a.j.i(((Integer) pair2.first).intValue(), (evz) pair2.second, (evq) this.c, (evv) this.d);
                return;
            case 3:
                Object obj = this.c;
                Object obj2 = this.a;
                Object obj3 = this.d;
                Object obj4 = this.b;
                int i = 20;
                byte[] bArr = null;
                try {
                    ((AudioTrack) obj4).flush();
                    ((AudioTrack) obj4).release();
                    if (obj3 != null) {
                        Handler handler = (Handler) obj2;
                        if (handler.getLooper().getThread().isAlive()) {
                            handler.post(new edd(obj3, obj, i, bArr));
                        }
                    }
                    synchronized (emm.a) {
                        int i2 = emm.c - 1;
                        emm.c = i2;
                        if (i2 == 0) {
                            emm.b.shutdown();
                            emm.b = null;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (obj3 != null) {
                        Handler handler2 = (Handler) obj2;
                        if (handler2.getLooper().getThread().isAlive()) {
                            handler2.post(new edd(obj3, obj, i, bArr));
                        }
                    }
                    synchronized (emm.a) {
                        int i3 = emm.c - 1;
                        emm.c = i3;
                        if (i3 == 0) {
                            emm.b.shutdown();
                            emm.b = null;
                        }
                        throw th;
                    }
                }
            case 4:
                Object obj5 = this.d;
                Object obj6 = this.b;
                Object obj7 = this.c;
                Object obj8 = this.a;
                synchronized (((iom) obj8).a) {
                    if (((AtomicBoolean) obj7).get()) {
                        ((AtomicBoolean) obj5).set(true);
                    } else {
                        ((iom) obj8).o((fnf) obj6);
                    }
                }
                return;
            case 5:
                int iIncrementAndGet = ((AtomicInteger) this.d).incrementAndGet();
                ?? r1 = this.a;
                if (iIncrementAndGet == r1.size()) {
                    ((fpe) this.b).D(this.c, r1);
                    return;
                }
                return;
            case 6:
                foo fooVar = (foo) this.a;
                if (fooVar.s()) {
                    return;
                }
                this.c.a(fooVar.q, (fnw) this.b, this.d);
                return;
            case 7:
                this.a.a((fuk) this.c, (fug) this.b, this.d);
                return;
            case 8:
                this.a.a((fuk) this.c, (fug) this.b, this.d);
                return;
            case 9:
                Object obj9 = this.c;
                ?? r12 = this.d;
                Object obj10 = this.a;
                Object obj11 = this.b;
                boolean zO = gli.o();
                if (zO) {
                    try {
                        gli.n((String) obj9);
                    } finally {
                        if (zO) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    r12.a();
                    gpr gprVar = gps.a;
                    ((dvv) obj10).h(gprVar);
                    ((com) obj11).c(gprVar);
                } catch (Throwable th2) {
                    ((dvv) obj10).h(new gpp(th2));
                    ((com) obj11).d(th2);
                }
                if (zO) {
                    return;
                } else {
                    return;
                }
            case 10:
                ?? r0 = this.d;
                int i4 = gqv.a;
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    ((gqt) it.next()).b(((gun) this.c).a);
                }
                gqv.a((tae) this.b, (WorkDatabase) this.a, r0);
                return;
            case 11:
                kea keaVar = new kea();
                Object obj12 = this.b;
                by byVarF = hju.F((Context) obj12);
                byVarF.getClass();
                cr supportFragmentManager = byVarF.getSupportFragmentManager();
                supportFragmentManager.getClass();
                keaVar.c(supportFragmentManager, 4, new nz(this.a, this.c, obj12, this.d, 8, null));
                return;
            case 12:
                yld yldVar = (yld) this.d;
                if (yldVar.a > 0) {
                    Object obj13 = this.c;
                    Resources resources = ((View) this.a).getContext().getResources();
                    int i5 = yldVar.a;
                    ((tbb) obj13).s(resources.getQuantityString(R.plurals.fmr_playing_sound_message, i5, Integer.valueOf(i5)));
                    ((Handler) this.b).postDelayed(this, 1000L);
                } else {
                    ((taz) this.c).e();
                }
                yldVar.a--;
                return;
            case 13:
                Object obj14 = this.a;
                int i6 = obj14 != null ? ((lje) obj14).k : -1;
                Object obj15 = this.c;
                int i7 = obj15 != null ? ((lje) obj15).k : -1;
                Object obj16 = this.d;
                if (obj14 == null) {
                    ((ljg) obj16).b((lje) obj15);
                }
                if (i6 == 2) {
                    if (i7 == 2) {
                        lje ljeVar = (lje) obj14;
                        long j = ljeVar.i;
                        long j2 = ((lje) obj15).i;
                        if (j == j2 && ljeVar.j == j2) {
                            return;
                        }
                        i6 = 2;
                        i7 = 2;
                    } else {
                        i6 = 2;
                    }
                }
                isy isyVar = (isy) this.b;
                ljg ljgVar = (ljg) obj16;
                ljgVar.l(isyVar, i6);
                if (i6 != i7) {
                    ljgVar.l(isyVar, i7);
                    return;
                }
                return;
            case 14:
                Object obj17 = this.b;
                ?? r02 = this.d;
                Object obj18 = this.a;
                try {
                    oqq oqqVarB = ((oxe) this.c).b(r02);
                    ((oqq) obj18).a |= oqqVarB.a;
                    ((oqq) obj18).b = oqqVarB.b | ((oqq) obj18).b;
                    if (zB) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    oqq oqqVar = (oqq) obj18;
                    if (oqqVar.b()) {
                        oqqVar.a(((oqp) obj17).b);
                    }
                }
            case 15:
                ((tug) ((tug) rxb.a.a((Level) this.c).i((Throwable) this.a)).j("com/google/android/libraries/phenotype/client/Phlogger", "logInternal", 44, "Phlogger.java")).H((String) this.b, (Object[]) this.d);
                return;
            case 16:
                ((xul) this.c).i((xtk) this.a, (xvl) this.d, (xsm) this.b);
                return;
            case 17:
                ((xwi) this.d).a.a((xtk) this.a, (xvl) this.c, (xsm) this.b);
                return;
            case 18:
                ybb ybbVar = (ybb) this.d;
                ybbVar.A = true;
                ybbVar.w.a((xtk) this.a, (xvl) this.c, (xsm) this.b);
                return;
            default:
                synchronized (this.c) {
                    if (((ybo) this.b).b == 0) {
                        try {
                            this.a.b(this.d);
                            Object obj19 = this.c;
                            IdentityHashMap identityHashMap = ((ybq) obj19).a;
                            identityHashMap.remove(this.a);
                            if (identityHashMap.isEmpty()) {
                                ((ybq) obj19).b.shutdown();
                                ((ybq) obj19).b = null;
                            }
                        } catch (Throwable th3) {
                            Object obj20 = this.c;
                            IdentityHashMap identityHashMap2 = ((ybq) obj20).a;
                            identityHashMap2.remove(this.a);
                            if (identityHashMap2.isEmpty()) {
                                ((ybq) obj20).b.shutdown();
                                ((ybq) obj20).b = null;
                            }
                            throw th3;
                        }
                    }
                }
                return;
        }
    }

    public /* synthetic */ ejr(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ ejr(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.e = i;
        this.b = obj;
        this.d = obj2;
        this.a = obj3;
        this.c = obj4;
    }

    public /* synthetic */ ejr(Object obj, Object obj2, Object obj3, Object obj4, int i, char[] cArr) {
        this.e = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
        this.d = obj4;
    }

    public /* synthetic */ ejr(Object obj, Object obj2, Object obj3, Object obj4, int i, short[] sArr) {
        this.e = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
        this.d = obj4;
    }

    public ejr(Object obj, xtk xtkVar, xvl xvlVar, xsm xsmVar, int i) {
        this.e = i;
        this.a = xtkVar;
        this.c = xvlVar;
        this.b = xsmVar;
        this.d = obj;
    }

    public /* synthetic */ ejr(String str, yjk yjkVar, dvv dvvVar, com comVar, int i) {
        this.e = i;
        this.c = str;
        this.d = yjkVar;
        this.a = dvvVar;
        this.b = comVar;
    }

    public /* synthetic */ ejr(List list, gun gunVar, tae taeVar, WorkDatabase workDatabase, int i) {
        this.e = i;
        this.d = list;
        this.c = gunVar;
        this.b = taeVar;
        this.a = workDatabase;
    }

    public /* synthetic */ ejr(ljg ljgVar, isy isyVar, lje ljeVar, lje ljeVar2, int i) {
        this.e = i;
        this.d = ljgVar;
        this.b = isyVar;
        this.a = ljeVar;
        this.c = ljeVar2;
    }

    public /* synthetic */ ejr(oxe oxeVar, oqq oqqVar, List list, oqp oqpVar, int i) {
        this.e = i;
        this.c = oxeVar;
        this.a = oqqVar;
        this.d = list;
        this.b = oqpVar;
    }

    public ejr(xul xulVar, xtk xtkVar, xvl xvlVar, xsm xsmVar, int i) {
        this.e = i;
        this.a = xtkVar;
        this.d = xvlVar;
        this.b = xsmVar;
        this.c = xulVar;
    }

    public ejr(ybq ybqVar, ybo yboVar, ybp ybpVar, Object obj, int i) {
        this.e = i;
        this.b = yboVar;
        this.a = ybpVar;
        this.d = obj;
        this.c = ybqVar;
    }

    public ejr(yld yldVar, tbb tbbVar, View view, Handler handler, int i) {
        this.e = i;
        this.d = yldVar;
        this.c = tbbVar;
        this.a = view;
        this.b = handler;
    }
}
