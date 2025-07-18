package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qbk implements yqi {
    public final /* synthetic */ qbr a;

    public /* synthetic */ qbk(qbr qbrVar) {
        this.a = qbrVar;
    }

    @Override // defpackage.yqi
    public final Object apply(Object obj) {
        yqt yqtVarI;
        HashMap map = new HashMap();
        for (pyj pyjVar : (Iterable) obj) {
            qbr qbrVar = this.a;
            qbq qbqVarD = qbrVar.d(pyjVar.a());
            HashSet hashSet = new HashSet();
            pia piaVarA = pyjVar.a();
            ahwr ahwrVar = piaVarA.u;
            if (ahwrVar == null) {
                ahwrVar = ahwr.a;
            }
            int i = true != pyjVar.b().g ? 3 : 4;
            Iterator it = ahwrVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    yqtVarI = ypv.a;
                    break;
                }
                ahwo ahwoVar = (ahwo) it.next();
                int iA = ahwq.a(ahwoVar.b);
                if (iA == 0) {
                    iA = 1;
                }
                if (iA == i) {
                    yqtVarI = yqt.i(Integer.valueOf((int) ahwoVar.c));
                    break;
                }
            }
            if (yqtVarI.g()) {
                hashSet.add(yqtVarI.c());
            } else {
                int i2 = qce.a;
                zdy zdyVar = qcd.a;
                ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 157, "LogUtil.java")).x("%s", "No download stage experiment ids found even though experiment info is set.");
                ((zdv) zdyVar.d()).V();
            }
            ahwr ahwrVar2 = piaVarA.u;
            if (ahwrVar2 == null) {
                ahwrVar2 = ahwr.a;
            }
            if (ahwrVar2.c.size() < 10) {
                ahwr ahwrVar3 = piaVarA.u;
                if (ahwrVar3 == null) {
                    ahwrVar3 = ahwr.a;
                }
                hashSet.addAll(ahwrVar3.c);
            } else {
                ahwr ahwrVar4 = piaVarA.u;
                if (ahwrVar4 == null) {
                    ahwrVar4 = ahwr.a;
                }
                qce.i("Found more experiment ids than mendel experiment ids for logging than allowed. Found %d, limit is %d", Integer.valueOf(ahwrVar4.c.size()), 10);
            }
            if (!hashSet.isEmpty()) {
                qbr.g(map, qbqVarD).addAll(hashSet);
            }
        }
        return map;
    }
}
