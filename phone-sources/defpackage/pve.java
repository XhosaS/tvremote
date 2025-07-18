package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pve implements pva {
    private final qnr a;

    static {
        tvn.n("GnpSdk");
    }

    public pve(qnr qnrVar) {
        this.a = qnrVar;
    }

    @Override // defpackage.pva
    public final qen a(qpv qpvVar) throws qnq {
        try {
            return this.a.a(qpvVar);
        } catch (qek unused) {
            qem qemVarA = qen.a();
            qemVarA.b(qpvVar);
            qemVarA.e = ImmutableSet.of(qqj.a);
            qen qenVarA = qemVarA.a();
            qnr qnrVar = this.a;
            ImmutableList immutableListOf = ImmutableList.of(qenVarA);
            immutableListOf.getClass();
            try {
                qnt qntVar = ((qnx) qnrVar).b;
                Long[] lArr = (Long[]) gez.j(((qnw) qntVar).a, false, true, new qaz(qntVar, immutableListOf, 5, null));
                if (lArr.length != 1) {
                    throw new qnq();
                }
                qem qemVar = new qem(qenVarA);
                qemVar.f(lArr[0].longValue());
                return qemVar.a();
            } catch (Exception e) {
                throw new qnq(e);
            }
        }
    }

    @Override // defpackage.pva
    public final void b(String str) {
        str.getClass();
        qnr qnrVar = this.a;
        synchronized (qnrVar) {
            try {
                qem qemVar = new qem(qnrVar.a(new qpz(str)));
                qemVar.i(2);
                ImmutableList immutableListOf = ImmutableList.of(qemVar.a());
                immutableListOf.getClass();
                try {
                    qnt qntVar = ((qnx) qnrVar).b;
                    ((Integer) gez.j(((qnw) qntVar).a, false, true, new qaz(qntVar, immutableListOf, 7, null))).intValue();
                } catch (Exception e) {
                    ((tvk) ((tvk) qnx.a.g()).i(e)).r();
                }
            } catch (qek unused) {
            }
        }
    }
}
