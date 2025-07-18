package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evd extends exk {
    private final long a;
    private final long c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final ArrayList h;
    private final eax i;
    private evb j;
    private evc k;
    private long l;
    private long m;

    public evd(eva evaVar) {
        super(evaVar.a);
        this.a = evaVar.b;
        this.c = evaVar.c;
        this.d = evaVar.d;
        this.e = evaVar.e;
        this.f = evaVar.f;
        this.g = evaVar.g;
        this.h = new ArrayList();
        this.i = new eax();
    }

    private final void G(eay eayVar) {
        long j;
        long j2;
        eax eaxVar = this.i;
        eayVar.p(0, eaxVar);
        long j3 = eaxVar.D;
        if (this.j == null || this.h.isEmpty() || this.e) {
            j = this.a;
            long j4 = this.c;
            if (this.f) {
                long j5 = eaxVar.z;
                j += j5;
                j2 = j5 + j4;
            } else {
                j2 = j4;
            }
            this.l = j3 + j;
            this.m = j4 != Long.MIN_VALUE ? j3 + j2 : Long.MIN_VALUE;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((euz) arrayList.get(i)).k(this.l, this.m);
            }
            j = j2;
        } else {
            j = this.l - j3;
            if (this.c != Long.MIN_VALUE) {
                j = this.m - j3;
            }
        }
        try {
            evb evbVar = new evb(eayVar, j, j, this.g);
            this.j = evbVar;
            y(evbVar);
        } catch (evc e) {
            this.k = e;
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.h;
                if (i2 >= arrayList2.size()) {
                    return;
                }
                ((euz) arrayList2.get(i2)).d = this.k;
                i2++;
            }
        }
    }

    @Override // defpackage.exk
    protected final void b(eay eayVar) {
        if (this.k != null) {
            return;
        }
        G(eayVar);
    }

    @Override // defpackage.evg, defpackage.ewb
    public final void c() throws evc {
        evc evcVar = this.k;
        if (evcVar != null) {
            throw evcVar;
        }
        super.c();
    }

    @Override // defpackage.exk, defpackage.ewb
    public final void i(evx evxVar) {
        ArrayList arrayList = this.h;
        a.ab(arrayList.remove(evxVar));
        this.b.i(((euz) evxVar).a);
        if (!arrayList.isEmpty() || this.e) {
            return;
        }
        evb evbVar = this.j;
        evbVar.getClass();
        G(evbVar.e);
    }

    @Override // defpackage.evg, defpackage.euv
    protected final void j() {
        super.j();
        this.k = null;
        this.j = null;
    }

    @Override // defpackage.exk, defpackage.euv, defpackage.ewb
    public final boolean o(dzy dzyVar) {
        return a().f.equals(dzyVar.f) && this.b.o(dzyVar);
    }

    @Override // defpackage.exk, defpackage.ewb
    public final evx p(evz evzVar, ezp ezpVar, long j) {
        euz euzVar = new euz(this.b.p(evzVar, ezpVar, j), this.d, this.l, this.m);
        this.h.add(euzVar);
        return euzVar;
    }
}
