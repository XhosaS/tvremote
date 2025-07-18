package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qqw implements qql {
    final /* synthetic */ qqx a;

    public qqw(qqx qqxVar) {
        this.a = qqxVar;
    }

    @Override // defpackage.qql
    public final boolean a(qpw qpwVar) {
        qqx qqxVar = this.a;
        if (!((Boolean) qqxVar.d.a()).booleanValue()) {
            return false;
        }
        qqg qqgVar = qqg.a;
        qqf qqfVar = new qqf();
        agow agowVar = qqxVar.a;
        if (agowVar.a() != null) {
            String str = (String) agowVar.a();
            if ((qqfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                qqfVar.y();
            }
            qqg qqgVar2 = (qqg) qqfVar.b;
            str.getClass();
            qqgVar2.b |= 1;
            qqgVar2.c = str;
        }
        agow agowVar2 = qqxVar.b;
        if (((Integer) agowVar2.a()).intValue() > 0) {
            int iIntValue = ((Integer) agowVar2.a()).intValue();
            if ((qqfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                qqfVar.y();
            }
            qqg qqgVar3 = (qqg) qqfVar.b;
            qqgVar3.b |= 2;
            qqgVar3.d = iIntValue;
        }
        agow agowVar3 = qqxVar.c;
        if (((Integer) agowVar3.a()).intValue() > 0) {
            int iIntValue2 = ((Integer) agowVar3.a()).intValue();
            if ((qqfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                qqfVar.y();
            }
            qqg qqgVar4 = (qqg) qqfVar.b;
            qqgVar4.b |= 4;
            qqgVar4.e = iIntValue2;
        }
        int i = Build.VERSION.SDK_INT;
        if ((qqfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            qqfVar.y();
        }
        qqg qqgVar5 = (qqg) qqfVar.b;
        qqgVar5.b |= 8;
        qqgVar5.f = i;
        qpy qpyVar = qpy.a;
        qpx qpxVar = new qpx();
        if ((qpxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            qpxVar.y();
        }
        qpy qpyVar2 = (qpy) qpxVar.b;
        qqg qqgVar6 = (qqg) qqfVar.v();
        qqgVar6.getClass();
        qpyVar2.c = qqgVar6;
        qpyVar2.b = 4;
        qpy qpyVar3 = (qpy) qpxVar.v();
        if ((qpwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            qpwVar.y();
        }
        qqh qqhVar = (qqh) qpwVar.b;
        qqh qqhVar2 = qqh.a;
        qpyVar3.getClass();
        abxs abxsVar = qqhVar.e;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            qqhVar.e = abxsVar.d(size + size);
        }
        qqhVar.e.add(qpyVar3);
        return true;
    }
}
