package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class euv implements ewb {
    private Looper b;
    private eay c;
    private elk d;
    private final ArrayList a = new ArrayList(1);
    public final HashSet q = new HashSet(1);
    public final eph r = new eph(new CopyOnWriteArrayList(), (evz) null);
    public final eph s = new eph((byte[]) null);

    @Override // defpackage.ewb
    public final void A(eoz eozVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.s.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            epm epmVar = (epm) it.next();
            if (epmVar.a == eozVar) {
                copyOnWriteArrayList.remove(epmVar);
            }
        }
    }

    @Override // defpackage.ewb
    public final void B(ewg ewgVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.r.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            epm epmVar = (epm) it.next();
            if (epmVar.b == ewgVar) {
                copyOnWriteArrayList.remove(epmVar);
            }
        }
    }

    protected final eph E(evz evzVar) {
        return this.r.r(evzVar);
    }

    protected final eph F(evz evzVar) {
        return this.s.z(evzVar);
    }

    protected abstract void g(efy efyVar);

    protected abstract void j();

    @Override // defpackage.ewb
    public /* synthetic */ boolean o(dzy dzyVar) {
        return false;
    }

    protected final elk q() {
        elk elkVar = this.d;
        eci.e(elkVar);
        return elkVar;
    }

    @Override // defpackage.ewb
    public final void r(Handler handler, eoz eozVar) {
        this.s.s(handler, eozVar);
    }

    @Override // defpackage.ewb
    public final void s(Handler handler, ewg ewgVar) {
        ((CopyOnWriteArrayList) this.r.b).add(new epm(handler, ewgVar));
    }

    @Override // defpackage.ewb
    public final void t(ewa ewaVar) {
        HashSet hashSet = this.q;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(ewaVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        u();
    }

    @Override // defpackage.ewb
    public final void v(ewa ewaVar) {
        this.b.getClass();
        HashSet hashSet = this.q;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(ewaVar);
        if (zIsEmpty) {
            w();
        }
    }

    @Override // defpackage.ewb
    public final void x(ewa ewaVar, efy efyVar, elk elkVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.b;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        a.H(z);
        this.d = elkVar;
        eay eayVar = this.c;
        this.a.add(ewaVar);
        if (this.b == null) {
            this.b = looperMyLooper;
            this.q.add(ewaVar);
            g(efyVar);
        } else if (eayVar != null) {
            v(ewaVar);
            ewaVar.a(this, eayVar);
        }
    }

    protected final void y(eay eayVar) {
        this.c = eayVar;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ewa) arrayList.get(i)).a(this, eayVar);
        }
    }

    @Override // defpackage.ewb
    public final void z(ewa ewaVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(ewaVar);
        if (!arrayList.isEmpty()) {
            t(ewaVar);
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.q.clear();
        j();
    }

    @Override // defpackage.ewb
    public /* synthetic */ void C() {
    }

    @Override // defpackage.ewb
    public /* synthetic */ void D() {
    }

    protected void u() {
    }

    protected void w() {
    }

    @Override // defpackage.ewb
    public /* synthetic */ void n(dzy dzyVar) {
    }
}
