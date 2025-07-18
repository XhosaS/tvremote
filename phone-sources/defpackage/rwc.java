package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rwc implements ufw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ rwc(ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter, Context context, zba zbaVar, rwa rwaVar, int i) {
        this.e = i;
        this.a = clearcutMetricSnapshotTransmitter;
        this.b = context;
        this.c = zbaVar;
        this.d = rwaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, vvj] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.ufw
    public final uhp a(Object obj) {
        nsz nszVar;
        nsz nszVar2;
        nsz nszVar3;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                if (!((Boolean) sfy.J(this.a)).booleanValue()) {
                    return sfy.C(false);
                }
                return ((pao) ((oyz) this.d).b.b()).a((oyh) this.b, (String) this.c);
            }
            if (i != 2) {
                Object obj2 = this.c;
                if (!((String) obj).equals(obj2)) {
                    return uhl.a;
                }
                zft zftVar = rzc.a;
                if (zftVar != null && zftVar.q(((ryw) this.d).a, (String) obj2)) {
                    return uhl.a;
                }
                return ((rwv) this.b).f().aD(((rzi) this.a).c);
            }
            rzi rziVar = (rzi) sfy.J(this.a);
            if (rziVar.c.isEmpty()) {
                return uhl.a;
            }
            Object obj3 = this.c;
            Object obj4 = this.d;
            rwv rwvVar = (rwv) this.b;
            ryw rywVar = (ryw) obj4;
            return ufn.j(uhi.v(ufn.i(uhi.v(ryy.b(rwvVar).a()), new pgc(rywVar.a, 15), rwvVar.b())), new rwc((String) obj3, rywVar, rwvVar, rziVar, 3), rwvVar.b());
        }
        if (!((Boolean) obj).booleanValue()) {
            return uhl.a;
        }
        Object obj5 = this.d;
        Object obj6 = this.b;
        Object obj7 = this.a;
        rwa rwaVar = (rwa) obj5;
        String str = rwaVar.c;
        if (rwaVar.d) {
            nsz nszVar4 = ((ClearcutMetricSnapshotTransmitter) obj7).c;
            nszVar2 = nszVar4;
            if (nszVar4 == null) {
                synchronized (obj7) {
                    nsz nszVar5 = ((ClearcutMetricSnapshotTransmitter) obj7).c;
                    nszVar3 = nszVar5;
                    if (nszVar5 == null) {
                        nsz nszVarI = nsz.i((Context) obj6, str);
                        ((ClearcutMetricSnapshotTransmitter) obj7).c = nszVarI;
                        nszVar3 = nszVarI;
                    }
                }
                nszVar2 = nszVar3;
            }
        } else {
            nsz nszVar6 = ((ClearcutMetricSnapshotTransmitter) obj7).b;
            nszVar2 = nszVar6;
            if (nszVar6 == null) {
                synchronized (obj7) {
                    nsz nszVar7 = ((ClearcutMetricSnapshotTransmitter) obj7).b;
                    nszVar = nszVar7;
                    if (nszVar7 == null) {
                        List list = nsz.l;
                        nsz nszVarA = new nsu((Context) obj6, str).a();
                        ((ClearcutMetricSnapshotTransmitter) obj7).b = nszVarA;
                        nszVar = nszVarA;
                    }
                }
                nszVar2 = nszVar;
            }
        }
        nsy nsyVarG = nszVar2.g(this.c);
        Context context = (Context) obj6;
        if (xov.a.get().a(context)) {
            nsyVarG.q = osr.b(context, (osf) ClearcutMetricSnapshotTransmitter.a.get());
        }
        if (!rwaVar.d) {
            String str2 = rwaVar.e;
            if (!sij.F(str2)) {
                if (nsyVarG.a.e()) {
                    throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
                }
                vty vtyVar = nsyVarG.p;
                if (!vtyVar.b.A()) {
                    vtyVar.u();
                }
                whm whmVar = (whm) vtyVar.b;
                whm whmVar2 = whm.a;
                str2.getClass();
                whmVar.b |= 16777216;
                whmVar.j = str2;
            }
            Iterator<E> it = rwaVar.i.iterator();
            while (it.hasNext()) {
                nsyVarG.f((String) it.next());
            }
            if ((rwaVar.b & 8) != 0) {
                nsyVarG.g(rwaVar.f);
            }
            vuj vujVar = rwaVar.g;
            if (!vujVar.isEmpty()) {
                nsyVarG.e(sfy.ae(vujVar));
            }
        }
        return qtl.aH(nsyVarG.c());
    }

    public /* synthetic */ rwc(String str, ryw rywVar, rwv rwvVar, rzi rziVar, int i) {
        this.e = i;
        this.c = str;
        this.d = rywVar;
        this.b = rwvVar;
        this.a = rziVar;
    }

    public /* synthetic */ rwc(oyz oyzVar, uhp uhpVar, oyh oyhVar, String str, int i) {
        this.e = i;
        this.d = oyzVar;
        this.a = uhpVar;
        this.b = oyhVar;
        this.c = str;
    }

    public /* synthetic */ rwc(rwv rwvVar, uhp uhpVar, ryw rywVar, String str, int i) {
        this.e = i;
        this.b = rwvVar;
        this.a = uhpVar;
        this.d = rywVar;
        this.c = str;
    }
}
