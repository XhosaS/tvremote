package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahc implements agc, agd {
    public final afx b;
    public final agr c;
    public final int e;
    public boolean f;
    public final /* synthetic */ ahf i;
    public final awy j;
    private final ahp l;
    public final Queue a = new LinkedList();
    private final Set k = new HashSet();
    public final Map d = new HashMap();
    public final List g = new ArrayList();
    private aeq m = null;
    public int h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public ahc(ahf ahfVar, agb agbVar) {
        this.i = ahfVar;
        Looper looper = ahfVar.k.getLooper();
        aid aidVarA = agbVar.b().a();
        afx afxVarF = ((qn) agbVar.k.b).f(agbVar.b, looper, aidVarA, agbVar.d, this, this);
        adx adxVar = agbVar.j;
        if (adxVar != null) {
            ((aib) afxVarF).p = adxVar;
        } else {
            String str = agbVar.c;
            if (str != null) {
                ((aib) afxVarF).j = str;
            }
        }
        this.b = afxVarF;
        this.c = agbVar.e;
        this.j = new awy((char[]) null);
        this.e = agbVar.g;
        if (afxVarF.l()) {
            this.l = new ahp(ahfVar.f, ahfVar.k, agbVar.b().a());
        } else {
            this.l = null;
        }
    }

    private final aes q(aes[] aesVarArr) {
        if (aesVarArr != null) {
            aes[] aesVarArrM = this.b.m();
            if (aesVarArrM == null) {
                aesVarArrM = new aes[0];
            }
            lz lzVar = new lz(aesVarArrM.length);
            for (aes aesVar : aesVarArrM) {
                lzVar.put(aesVar.a, Long.valueOf(aesVar.a()));
            }
            for (int i = 0; i <= 0; i++) {
                aes aesVar2 = aesVarArr[i];
                Long l = (Long) lzVar.get(aesVar2.a);
                if (l == null || l.longValue() < aesVar2.a()) {
                    return aesVar2;
                }
            }
        }
        return null;
    }

    private final Status r(aeq aeqVar) {
        return ahf.a(this.c, aeqVar);
    }

    private final void s(aeq aeqVar) {
        Set set = this.k;
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            set.clear();
            return;
        }
        if (ii.X(aeqVar, aeq.a)) {
            this.b.n();
        }
        throw null;
    }

    private final void t(Status status, Exception exc, boolean z) {
        qp.l(this.i.k);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            agq agqVar = (agq) it.next();
            if (!z || agqVar.c == 2) {
                if (status != null) {
                    agqVar.d(status);
                } else {
                    agqVar.e(exc);
                }
                it.remove();
            }
        }
    }

    private final void u(agq agqVar) {
        agqVar.g(this.j, p());
        try {
            agqVar.f(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.b.i("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean v(agq agqVar) {
        if (!(agqVar instanceof agk)) {
            u(agqVar);
            return true;
        }
        agk agkVar = (agk) agqVar;
        aes aesVarQ = q(agkVar.b(this));
        if (aesVarQ == null) {
            u(agqVar);
            return true;
        }
        String name = this.b.getClass().getName();
        long jA = aesVarQ.a();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        String str = aesVarQ.a;
        sb.append(str);
        sb.append(", ");
        sb.append(jA);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        ahf ahfVar = this.i;
        if (!ahfVar.l || !agkVar.a(this)) {
            agkVar.e(new agj(aesVarQ));
            return true;
        }
        ahd ahdVar = new ahd(this.c, aesVarQ);
        List list = this.g;
        int iIndexOf = list.indexOf(ahdVar);
        if (iIndexOf >= 0) {
            ahd ahdVar2 = (ahd) list.get(iIndexOf);
            Handler handler = ahfVar.k;
            handler.removeMessages(15, ahdVar2);
            handler.sendMessageDelayed(Message.obtain(handler, 15, ahdVar2), 5000L);
            return false;
        }
        list.add(ahdVar);
        Handler handler2 = ahfVar.k;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, ahdVar), 5000L);
        handler2.sendMessageDelayed(Message.obtain(handler2, 16, ahdVar), 120000L);
        aeq aeqVar = new aeq(2, null);
        w();
        if (!ahfVar.f(aeqVar, this.e)) {
            return false;
        }
        Log.w("GoogleApiManager", "Notification displayed for missing feature: " + str + ", version: " + aesVarQ.a());
        return false;
    }

    private static final void w() {
        synchronized (ahf.c) {
        }
    }

    @Override // defpackage.agx
    public final void a(int i) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.i.k;
        if (looperMyLooper == handler.getLooper()) {
            k(i);
        } else {
            handler.post(new ahb(this, i));
        }
    }

    @Override // defpackage.agx
    public final void b() {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.i.k;
        if (looperMyLooper == handler.getLooper()) {
            h();
        } else {
            handler.post(new ki(this, 19, null));
        }
    }

    public final void c() {
        qp.l(this.i.k);
        this.m = null;
    }

    public final void d() {
        int iC;
        ahf ahfVar = this.i;
        qp.l(ahfVar.k);
        afx afxVar = this.b;
        if (afxVar.j() || afxVar.k()) {
            return;
        }
        try {
            cih cihVar = ahfVar.m;
            Context context = ahfVar.f;
            qp.p(context);
            qp.p(afxVar);
            afxVar.o();
            int iA = afxVar.a();
            int iE = cihVar.e(iA);
            if (iE == -1) {
                Object obj = cihVar.a;
                synchronized (obj) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= ((SparseIntArray) obj).size()) {
                            i = -1;
                            break;
                        }
                        int iKeyAt = ((SparseIntArray) obj).keyAt(i2);
                        if (iKeyAt > iA && ((SparseIntArray) obj).get(iKeyAt) == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    iC = i == -1 ? ((aev) cihVar.b).c(context, iA) : i;
                    ((SparseIntArray) obj).put(iA, iC);
                }
                iE = iC;
            }
            if (iE != 0) {
                aeq aeqVar = new aeq(iE, null);
                Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + aeqVar.toString());
                i(aeqVar);
                return;
            }
            ahf ahfVar2 = this.i;
            afx afxVar2 = this.b;
            ahe aheVar = new ahe(ahfVar2, afxVar2, this.c);
            if (afxVar2.l()) {
                ahp ahpVar = this.l;
                qp.p(ahpVar);
                alt altVar = ahpVar.e;
                if (altVar != null) {
                    altVar.u();
                }
                aid aidVar = ahpVar.d;
                aidVar.g = Integer.valueOf(System.identityHashCode(ahpVar));
                qn qnVar = ahpVar.g;
                Context context2 = ahpVar.a;
                Handler handler = ahpVar.b;
                ahpVar.e = (alt) qnVar.f(context2, handler.getLooper(), aidVar, aidVar.f, ahpVar, ahpVar);
                ahpVar.f = aheVar;
                Set set = ahpVar.c;
                if (set == null || set.isEmpty()) {
                    handler.post(new ama(ahpVar, 1));
                } else {
                    alt altVar2 = ahpVar.e;
                    altVar2.h(new ahy(altVar2));
                }
            }
            try {
                afxVar2.h(aheVar);
            } catch (SecurityException e) {
                j(new aeq(10), e);
            }
        } catch (IllegalStateException e2) {
            j(new aeq(10), e2);
        }
    }

    public final void e(agq agqVar) {
        qp.l(this.i.k);
        if (this.b.j()) {
            if (v(agqVar)) {
                m();
                return;
            } else {
                this.a.add(agqVar);
                return;
            }
        }
        this.a.add(agqVar);
        aeq aeqVar = this.m;
        if (aeqVar == null || !aeqVar.b()) {
            d();
        } else {
            i(aeqVar);
        }
    }

    public final void f(Status status) {
        qp.l(this.i.k);
        t(status, null, false);
    }

    public final void g() {
        Queue queue = this.a;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            agq agqVar = (agq) arrayList.get(i);
            if (!this.b.j()) {
                return;
            }
            if (v(agqVar)) {
                queue.remove(agqVar);
            }
        }
    }

    public final void h() {
        c();
        s(aeq.a);
        o();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            Object obj = ((bzt) it.next()).b;
            if (q(((ahm) obj).b) != null) {
                it.remove();
            } else {
                try {
                    ((ahm) obj).b(this.b, new adx((byte[]) null));
                } catch (DeadObjectException unused) {
                    a(3);
                    this.b.i("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        m();
    }

    @Override // defpackage.ahl
    public final void i(aeq aeqVar) {
        j(aeqVar, null);
    }

    public final void j(aeq aeqVar, Exception exc) {
        alt altVar;
        ahf ahfVar = this.i;
        Handler handler = ahfVar.k;
        qp.l(handler);
        ahp ahpVar = this.l;
        if (ahpVar != null && (altVar = ahpVar.e) != null) {
            altVar.u();
        }
        c();
        ahfVar.m.d();
        s(aeqVar);
        if ((this.b instanceof ajn) && aeqVar.c != 24) {
            ahfVar.e = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = aeqVar.c;
        if (i == 4) {
            f(ahf.b);
            return;
        }
        if (i == 25) {
            f(r(aeqVar));
            return;
        }
        Queue queue = this.a;
        if (queue.isEmpty()) {
            this.m = aeqVar;
            return;
        }
        if (exc != null) {
            qp.l(handler);
            t(null, exc, false);
            return;
        }
        if (!ahfVar.l) {
            f(r(aeqVar));
            return;
        }
        t(r(aeqVar), null, true);
        if (queue.isEmpty()) {
            return;
        }
        w();
        if (ahfVar.f(aeqVar, this.e)) {
            return;
        }
        if (i == 18) {
            this.f = true;
        }
        if (this.f) {
            handler.sendMessageDelayed(Message.obtain(handler, 9, this.c), 5000L);
        } else {
            f(r(aeqVar));
        }
    }

    public final void k(int i) {
        c();
        this.f = true;
        String strF = this.b.f();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strF != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strF);
        }
        this.j.i(true, new Status(20, sb.toString()));
        ahf ahfVar = this.i;
        agr agrVar = this.c;
        Handler handler = ahfVar.k;
        handler.sendMessageDelayed(Message.obtain(handler, 9, agrVar), 5000L);
        handler.sendMessageDelayed(Message.obtain(handler, 11, agrVar), 120000L);
        ahfVar.m.d();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            Object obj = ((bzt) it.next()).a;
        }
    }

    public final void l(aeq aeqVar) {
        qp.l(this.i.k);
        afx afxVar = this.b;
        afxVar.i("onSignInFailed for " + afxVar.getClass().getName() + " with " + String.valueOf(aeqVar));
        i(aeqVar);
    }

    public final void m() {
        ahf ahfVar = this.i;
        Handler handler = ahfVar.k;
        agr agrVar = this.c;
        handler.removeMessages(12, agrVar);
        handler.sendMessageDelayed(handler.obtainMessage(12, agrVar), ahfVar.d);
    }

    public final void n() {
        qp.l(this.i.k);
        Status status = ahf.a;
        f(status);
        this.j.i(false, status);
        for (ahg ahgVar : (ahg[]) this.d.keySet().toArray(new ahg[0])) {
            e(new agp(ahgVar, new adx((byte[]) null)));
        }
        s(new aeq(4));
        afx afxVar = this.b;
        if (afxVar.j()) {
            afxVar.q(new byj(this, null));
        }
    }

    public final void o() {
        if (this.f) {
            ahf ahfVar = this.i;
            agr agrVar = this.c;
            Handler handler = ahfVar.k;
            handler.removeMessages(11, agrVar);
            handler.removeMessages(9, agrVar);
            this.f = false;
        }
    }

    public final boolean p() {
        return this.b.l();
    }
}
