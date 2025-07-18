package defpackage;

import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class sll implements ufv {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ sll(rsz rszVar, int i, String str, String str2, int i2) {
        this.e = i2;
        this.b = rszVar;
        this.a = i;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ufv
    public final uhp a() {
        if (this.e == 0) {
            uhp uhpVarC = sfy.C(this.c);
            for (int i = 0; i < this.a; i++) {
                if (((Boolean) sfy.J((Future) this.d.get(i))).booleanValue()) {
                    uhpVarC = ufn.j(uhpVarC, trc.c(new pbb((slq) ((slm) this.b).a.get(i), 20)), ugk.a);
                }
            }
            return uhpVarC;
        }
        final rsz rszVar = (rsz) this.b;
        rsq rsqVar = (rsq) rszVar.b.b();
        Object obj = this.c;
        final int i2 = this.a;
        long jA = rsz.c(i2) ? true != rsqVar.b() ? -1L : 1000L : rszVar.c.a((String) obj);
        if (jA == -1) {
            return uhl.a;
        }
        Object obj2 = this.d;
        tst tstVar = rsqVar.a;
        uhi uhiVarV = uhi.v(sfy.C(null));
        rke rkeVar = new rke(11);
        uht uhtVar = rszVar.a;
        uhp uhpVarI = ues.i(uhiVarV, RuntimeException.class, rkeVar, uhtVar);
        final String str = (String) obj2;
        final String str2 = (String) obj;
        final long j = jA;
        return ufn.j(uhpVarI, new ufw() { // from class: rsy
            /* JADX WARN: Removed duplicated region for block: B:112:0x02bd  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x02d9  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x0315  */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0331  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x036a  */
            /* JADX WARN: Removed duplicated region for block: B:127:0x0383  */
            /* JADX WARN: Removed duplicated region for block: B:130:0x03a3  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x03bb  */
            /* JADX WARN: Removed duplicated region for block: B:139:0x03de  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x0415  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x01cf  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x020f  */
            @Override // defpackage.ufw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.uhp a(java.lang.Object r22) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 1064
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rsy.a(java.lang.Object):uhp");
            }
        }, uhtVar);
    }

    public /* synthetic */ sll(slm slmVar, vvj vvjVar, int i, List list, int i2) {
        this.e = i2;
        this.b = slmVar;
        this.c = vvjVar;
        this.a = i;
        this.d = list;
    }
}
