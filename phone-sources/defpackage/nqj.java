package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nqj implements nkl {
    public static final nsf a = new nsf("RemoteMediaClient");
    public final nsk d;
    private final npx i;
    private final nph j;
    private nkn k;
    public final List e = new CopyOnWriteArrayList();
    public final List f = new CopyOnWriteArrayList();
    public final Map g = new ConcurrentHashMap();
    public final Map h = new ConcurrentHashMap();
    public final Object b = new Object();
    public final Handler c = new ogh(Looper.getMainLooper());

    static {
        String str = nsk.d;
    }

    public nqj(nsk nskVar) {
        npx npxVar = new npx(this);
        this.i = npxVar;
        this.d = nskVar;
        nskVar.g = new nqf(this, 0);
        nskVar.c(npxVar);
        this.j = new nph(this);
    }

    public static final void y(nqc nqcVar) {
        try {
            if (!nqcVar.c) {
                nqj nqjVar = nqcVar.d;
                Iterator it = nqjVar.e.iterator();
                while (it.hasNext()) {
                    ((npz) it.next()).q();
                }
                for (npj npjVar : nqjVar.f) {
                }
            }
            try {
                synchronized (nqcVar.d.b) {
                    nqcVar.b();
                }
            } catch (nsi unused) {
                nqcVar.q(new nqb(new Status(2100), 0));
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused2) {
            nqcVar.q(new nqb(new Status(2100), 0));
        }
    }

    public static final nwx z() {
        npy npyVar = new npy();
        npyVar.q(new nqb(new Status(17, null), 1));
        return npyVar;
    }

    public final void A() {
        ocv.aC();
        if (p()) {
            y(new npt(this));
        } else {
            z();
        }
    }

    public final void B() {
        ocv.aC();
        if (p()) {
            y(new npu(this));
        } else {
            z();
        }
    }

    public final void C() {
        ocv.aC();
        if (p()) {
            y(new npp(this));
        } else {
            z();
        }
    }

    public final void D() {
        ocv.aC();
        if (p()) {
            y(new npo(this));
        } else {
            z();
        }
    }

    public final void E(long[] jArr) {
        ocv.aC();
        if (p()) {
            y(new npn(this, jArr));
        } else {
            z();
        }
    }

    public final void F(nlm nlmVar) {
        ocv.aC();
        if (p()) {
            y(new npv(this, nlmVar));
        } else {
            z();
        }
    }

    public final void G(npj npjVar) {
        ocv.aC();
        if (npjVar != null) {
            this.f.add(npjVar);
        }
    }

    public final void H(npj npjVar) {
        ocv.aC();
        if (npjVar != null) {
            this.f.remove(npjVar);
        }
    }

    public final int a() {
        nll nllVarG;
        if (e() != null && q()) {
            if (r()) {
                return 6;
            }
            if (w()) {
                return 3;
            }
            if (v()) {
                return 2;
            }
            if (u() && (nllVarG = g()) != null && nllVarG.a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final int b() {
        int i;
        synchronized (this.b) {
            ocv.aC();
            nln nlnVarH = h();
            i = nlnVarH != null ? nlnVarH.e : 1;
        }
        return i;
    }

    public final long c() {
        long jG;
        synchronized (this.b) {
            ocv.aC();
            jG = this.d.g();
        }
        return jG;
    }

    public final long d() {
        long jI;
        synchronized (this.b) {
            ocv.aC();
            jI = this.d.i();
        }
        return jI;
    }

    public final MediaInfo e() {
        MediaInfo mediaInfoJ;
        synchronized (this.b) {
            ocv.aC();
            mediaInfoJ = this.d.j();
        }
        return mediaInfoJ;
    }

    @Override // defpackage.nkl
    public final void f(String str) {
        this.d.k(str);
    }

    public final nll g() {
        ocv.aC();
        nln nlnVarH = h();
        if (nlnVarH == null) {
            return null;
        }
        return nlnVarH.c(nlnVarH.l);
    }

    public final nln h() {
        nln nlnVar;
        synchronized (this.b) {
            ocv.aC();
            nlnVar = this.d.e;
        }
        return nlnVar;
    }

    public final nwx i(nlh nlhVar) {
        ocv.aC();
        if (!p()) {
            return z();
        }
        nps npsVar = new nps(this, nlhVar);
        y(npsVar);
        return npsVar;
    }

    public final String j() {
        ocv.aC();
        return this.d.b;
    }

    public final void k() {
        Object obj = this.k;
        if (obj == null) {
            return;
        }
        String strJ = j();
        nrv.h(strJ);
        Map map = ((nla) obj).q;
        synchronized (map) {
            map.put(strJ, this);
        }
        oaf oafVar = new oaf();
        oafVar.a = new nkx(obj, strJ, 1);
        oafVar.c = 8413;
        ((nwq) obj).t(oafVar.a());
        ocv.aC();
        if (p()) {
            y(new npm(this));
        } else {
            z();
        }
    }

    public final void l(nqg nqgVar) {
        ocv.aC();
        nqi nqiVar = (nqi) this.g.remove(nqgVar);
        if (nqiVar != null) {
            Set set = nqiVar.a;
            set.remove(nqgVar);
            if (set.isEmpty()) {
                this.h.remove(1000L);
                nqiVar.b();
            }
        }
    }

    public final void m(nkn nknVar) {
        nkl nklVar;
        Object obj = this.k;
        if (obj == nknVar) {
            return;
        }
        if (obj != null) {
            this.d.b();
            this.j.b();
            String strJ = j();
            if (TextUtils.isEmpty(strJ)) {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
            nla nlaVar = (nla) obj;
            Map map = nlaVar.q;
            synchronized (map) {
                nklVar = (nkl) map.remove(strJ);
            }
            oaf oafVar = new oaf();
            oafVar.a = new nkv(nlaVar, nklVar, strJ, 0);
            oafVar.c = 8414;
            ((nwq) obj).t(oafVar.a());
            this.i.a = null;
            this.c.removeCallbacksAndMessages(null);
        }
        this.k = nknVar;
        if (nknVar != null) {
            this.i.a = nknVar;
        }
    }

    public final void n() {
        ocv.aC();
        int iB = b();
        if (iB == 4 || iB == 2) {
            A();
        } else {
            B();
        }
    }

    public final void o(Set set) {
        HashSet<nqg> hashSet = new HashSet(set);
        if (w() || v() || r() || t()) {
            for (nqg nqgVar : hashSet) {
                c();
                d();
                nqgVar.ek();
            }
            return;
        }
        if (!u()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((nqg) it.next()).ek();
            }
            return;
        }
        nll nllVarG = g();
        if (nllVarG == null || nllVarG.a == null) {
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((nqg) it2.next()).ek();
        }
    }

    public final boolean p() {
        return this.k != null;
    }

    public final boolean q() {
        ocv.aC();
        return r() || t() || w() || v() || u();
    }

    public final boolean r() {
        ocv.aC();
        nln nlnVarH = h();
        return nlnVarH != null && nlnVarH.e == 4;
    }

    public final boolean s() {
        ocv.aC();
        MediaInfo mediaInfoE = e();
        return mediaInfoE != null && mediaInfoE.a == 2;
    }

    final boolean t() {
        ocv.aC();
        nln nlnVarH = h();
        return nlnVarH != null && nlnVarH.e == 5;
    }

    public final boolean u() {
        ocv.aC();
        nln nlnVarH = h();
        return (nlnVarH == null || nlnVarH.l == 0) ? false : true;
    }

    public final boolean v() {
        int i;
        ocv.aC();
        nln nlnVarH = h();
        if (nlnVarH == null) {
            return false;
        }
        if (nlnVarH.e == 3) {
            return true;
        }
        if (!s()) {
            return false;
        }
        synchronized (this.b) {
            ocv.aC();
            nln nlnVarH2 = h();
            i = nlnVarH2 != null ? nlnVarH2.f : 0;
        }
        return i == 2;
    }

    public final boolean w() {
        ocv.aC();
        nln nlnVarH = h();
        return nlnVarH != null && nlnVarH.e == 2;
    }

    public final boolean x() {
        ocv.aC();
        nln nlnVarH = h();
        return nlnVarH != null && nlnVarH.r;
    }
}
