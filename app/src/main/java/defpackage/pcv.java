package defpackage;

import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pcv {
    public final List c;
    public final SparseIntArray d;
    private final int g;
    public final zpn a = pal.a();
    public final List b = new ArrayList();
    public final List e = new ArrayList();
    public final SparseIntArray f = new SparseIntArray();

    public pcv(int i, int i2) {
        this.g = i;
        this.c = new ArrayList(i2);
        this.d = new SparseIntArray(i2);
    }

    final pcc a(pbv pbvVar, int i) {
        pbvVar.d = this.g;
        if (i == -1) {
            i = -1;
        }
        List list = this.c;
        int size = list.size();
        pcb pcbVar = pbvVar.a;
        int i2 = ((pft) pbvVar.c).f;
        if ((pcbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pcbVar.y();
        }
        pcc pccVar = (pcc) pcbVar.b;
        pcc pccVar2 = pcc.a;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        pccVar.e = i3;
        pccVar.b |= 2;
        zpn zpnVar = this.a;
        zpk zpkVar = ((pcc) pcbVar.b).d;
        if (zpkVar == null) {
            zpkVar = zpk.a;
        }
        zpj zpjVar = new zpj();
        zpjVar.B(zpkVar);
        if ((zpjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpjVar.y();
        }
        zpk zpkVar2 = (zpk) zpjVar.b;
        zpnVar.getClass();
        zpkVar2.f = zpnVar;
        zpkVar2.b |= 2048;
        if ((zpjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpjVar.y();
        }
        zpk zpkVar3 = (zpk) zpjVar.b;
        zpkVar3.b |= 1;
        zpkVar3.c = size;
        zpk zpkVar4 = (zpk) zpjVar.v();
        if ((pcbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pcbVar.y();
        }
        pcc pccVar3 = (pcc) pcbVar.b;
        zpkVar4.getClass();
        pccVar3.d = zpkVar4;
        pccVar3.b |= 1;
        Set set = pbvVar.b.a;
        if (!set.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "ImpressionSet: ".concat(pbvVar.toString()));
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((pcl) it.next()).d();
            }
        }
        pcc pccVarA = pbvVar.a();
        list.add(pccVarA);
        this.d.append(size, i);
        return pccVarA;
    }

    final void b(pdh pdhVar) {
        if (pdhVar.b == 1) {
            yqw.A(this.d.valueAt(pdhVar.c()) == -1);
        }
        this.b.add(pdhVar);
    }
}
