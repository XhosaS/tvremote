package defpackage;

import android.util.Log;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pbr {
    public final pcb a;
    public pbv b = null;
    private final zpj c;

    protected pbr(pbu pbuVar) {
        pcc pccVar = pcc.a;
        this.a = new pcb();
        this.c = pbuVar.a;
        e(((zpk) pbuVar.a.b).d);
    }

    private final void e(int i) {
        pcb pcbVar = this.a;
        long j = ((pcc) pcbVar.b).g + i;
        if ((pcbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pcbVar.y();
        }
        pcc pccVar = (pcc) pcbVar.b;
        pccVar.b |= 8;
        pccVar.g = j;
    }

    public abstract pbr a();

    public final pbr b(pbs pbsVar) {
        pbv pbvVar = this.b;
        yqw.R(pbvVar == null, "CVE %s has already been built.", pbvVar);
        pcb pcbVar = this.a;
        zpk zpkVar = ((pcc) pcbVar.b).d;
        if (zpkVar == null) {
            zpkVar = zpk.a;
        }
        yqw.L(!((zpkVar.b & 2048) != 0));
        abwk abwkVar = pbsVar.a;
        if (!pcbVar.d(abwkVar)) {
            int i = ((abxc) abwkVar).d.b;
            if ((pcbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                pcbVar.y();
            }
            pcc pccVar = (pcc) pcbVar.b;
            abxj abxjVar = pccVar.c;
            if (!abxjVar.c()) {
                int size = abxjVar.size();
                pccVar.c = abxjVar.d(size + size);
            }
            pccVar.c.h(i);
        }
        Object obj = pbsVar.b;
        pcbVar.f(abwkVar, obj);
        e(((abxc) abwkVar).d.b);
        e(abwkVar.hashCode());
        e(obj.hashCode());
        return a();
    }

    public final pbv c(pcn pcnVar) {
        yqw.M(this.b == null, "Cannot create CVE twice.");
        pcb pcbVar = this.a;
        if ((pcbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pcbVar.y();
        }
        zpj zpjVar = this.c;
        pcc pccVar = (pcc) pcbVar.b;
        zpk zpkVar = (zpk) zpjVar.v();
        pcc pccVar2 = pcc.a;
        zpkVar.getClass();
        pccVar.d = zpkVar;
        pccVar.b = 1 | pccVar.b;
        pcc pccVar3 = (pcc) pcbVar.v();
        pcb pcbVar2 = new pcb();
        pcbVar2.B(pccVar3);
        pbv pbvVar = new pbv(pcbVar2, pcnVar);
        this.b = pbvVar;
        Set set = pbvVar.b.a;
        if (!set.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "Instrumented: ".concat(String.valueOf(String.valueOf(pbvVar))));
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((pcl) it.next()).e();
            }
        }
        return this.b;
    }

    public final void d(int i) {
        pcb pcbVar = this.a;
        long j = ((pcc) pcbVar.b).h + i;
        if ((pcbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pcbVar.y();
        }
        pcc pccVar = (pcc) pcbVar.b;
        pccVar.b |= 16;
        pccVar.h = j;
    }
}
