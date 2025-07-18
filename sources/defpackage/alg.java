package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alg implements ahh {
    final /* synthetic */ byte[] a;

    public alg(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.ahh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bcx bcxVar = (bcx) obj;
        try {
            byte[] bArr = this.a;
            cli cliVar = cli.a;
            cni cniVar = cni.a;
            clt cltVarQ = clt.q(bcs.a, bArr, 0, bArr.length, cli.a);
            clt.B(cltVarQ);
            bcs bcsVar = (bcs) cltVarQ;
            Iterator it = bcxVar.a.f.iterator();
            boolean z = false;
            while (it.hasNext()) {
                cme cmeVar = bcsVar.b;
                cih cihVar = bcn.h;
                if (cmeVar != null && !cmeVar.isEmpty()) {
                    Iterator<E> it2 = cmeVar.iterator();
                    boolean z2 = false;
                    while (it2.hasNext()) {
                        bcn[] bcnVarArrB = cihVar.b((String) it2.next());
                        if (bcnVarArrB != null) {
                            int i = 0;
                            while (i < bcnVarArrB.length) {
                                boolean z3 = bcnVarArrB[i].f;
                                i++;
                                z2 = true;
                            }
                        }
                    }
                    if (z2 && !z) {
                        bcxVar.b.a();
                        z = true;
                    }
                }
            }
        } catch (cmh unused) {
        }
    }
}
