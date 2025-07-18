package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Observable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sbt extends Observable implements sbj, sbm, sbo {
    private final sbq a;
    public int j = 1;
    public final aafi k;

    public sbt() {
        byte[] bArr = null;
        this.k = new aafi(bArr);
        this.a = new sbq(bArr);
    }

    protected abstract void e();

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object, java.util.Set] */
    @Override // defpackage.sbj
    public final void s() {
        boolean z = true;
        if (this.j == 1) {
            this.j = 2;
            try {
                e();
            } catch (Throwable th) {
                this.j = 1;
                throw th;
            }
        } else {
            z = false;
        }
        this.j = 3;
        if (z) {
            v(new sbr());
        }
        ?? r0 = this.k.c;
        List listAl = yfm.al(r0);
        r0.clear();
        Iterator it = listAl.iterator();
        while (it.hasNext()) {
            ((yjk) it.next()).a();
        }
    }

    @Override // defpackage.sbj
    public final void t() {
        this.j = 4;
    }

    @Override // defpackage.sbm
    public final void u() {
        t();
    }

    @Override // defpackage.sbo
    public final boolean v(sbn sbnVar) {
        if (this.j == 3) {
            return this.a.v(sbnVar);
        }
        return false;
    }

    protected final void w(ids idsVar, yjv yjvVar) {
        idsVar.getClass();
        x(idsVar, false, yjvVar);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
    protected final void x(ids idsVar, boolean z, yjv yjvVar) {
        idsVar.getClass();
        sbk sbkVar = new sbk(idsVar, z);
        if (this.j != 2) {
            throw new UnsupportedOperationException("declareDependency(...) can only be called in setup()");
        }
        aafi aafiVar = this.k;
        aafiVar.b.put(sbkVar, new qyw(aafiVar, yjvVar, 4, null));
        sbkVar.addObserver(new sbs(this));
    }

    protected final void y(Class cls, yjz yjzVar) {
        if (this.j != 2) {
            throw new UnsupportedOperationException("declareEventHandler(...) can only be called in setup()");
        }
        sbq sbqVar = this.a;
        sbqVar.b.put(cls, new qaz(sbqVar, yjzVar, 18, null));
    }

    public final void z() {
        setChanged();
        notifyObservers();
    }
}
