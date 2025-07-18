package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qqt implements qql {
    final /* synthetic */ qqu a;

    public qqt(qqu qquVar) {
        this.a = qquVar;
    }

    @Override // defpackage.qql
    public final boolean a(qpw qpwVar) {
        agow agowVarF = ((qws) this.a.a.a()).f();
        if (agowVarF == null) {
            return false;
        }
        qpy qpyVar = qpy.a;
        qpx qpxVar = new qpx();
        ahqu ahquVar = (ahqu) agowVarF.a();
        if ((qpxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            qpxVar.y();
        }
        qpy qpyVar2 = (qpy) qpxVar.b;
        ahquVar.getClass();
        qpyVar2.c = ahquVar;
        qpyVar2.b = 1;
        qpwVar.a(qpxVar);
        return true;
    }
}
