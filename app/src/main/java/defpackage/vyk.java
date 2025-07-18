package defpackage;

import j$.time.Instant;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vyk implements zxe {
    final /* synthetic */ Object a;
    final /* synthetic */ vyo b;
    final /* synthetic */ yqt c;
    final /* synthetic */ vyl d;

    public vyk(vyl vylVar, Object obj, vyo vyoVar, yqt yqtVar) {
        this.a = obj;
        this.b = vyoVar;
        this.c = yqtVar;
        this.d = vylVar;
    }

    @Override // defpackage.zxe
    public final void b(Object obj) {
        yzq yzqVarI;
        boolean zA;
        Object obj2 = this.a;
        obj2.getClass();
        vyl vylVar = this.d;
        synchronized (vylVar.a) {
            yzg yzgVar = new yzg(4);
            if (obj2 instanceof vyi) {
                yzj yzjVar = (yzj) vylVar.b.get(obj2);
                if (yzjVar != null) {
                    yzgVar.b(yzjVar);
                }
            } else if (obj2 instanceof vxq) {
                zdl it = ((vxq) obj2).d().iterator();
                while (it.hasNext()) {
                    yzj yzjVar2 = (yzj) vylVar.b.get(it.next());
                    if (yzjVar2 != null) {
                        yzgVar.b(yzjVar2);
                    }
                }
            } else {
                yzj yzjVar3 = (yzj) vylVar.b.get(obj2);
                if (yzjVar3 != null) {
                    yzgVar.b(yzjVar3);
                }
            }
            yzqVarI = yzgVar.a().i();
        }
        zdl it2 = ((yzy) yzqVarI).iterator();
        while (it2.hasNext()) {
            yqt yqtVar = this.c;
            final vzp vzpVar = (vzp) it2.next();
            if (yqtVar.f() != vzpVar) {
                vyo vyoVar = this.b;
                int iOrdinal = vyoVar.b.ordinal();
                if (iOrdinal == 0) {
                    zA = vzn.a(vzpVar.a.d, null, vym.LOCAL_STATE_CHANGE);
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalStateException("Unrecognized CallReason: ".concat(vyoVar.toString()));
                    }
                    AtomicReference atomicReference = vzpVar.a.d;
                    vym vymVar = vym.LOCAL_STATE_CHANGE;
                    vym vymVar2 = vym.REMOTE_STATE_CHANGE;
                    if (!vzn.a(atomicReference, vymVar, vymVar2)) {
                        zA = vzn.a(atomicReference, null, vymVar2);
                    }
                }
                if (zA) {
                    vzq vzqVar = vzpVar.a;
                    vzqVar.b.execute(new Runnable() { // from class: vzo
                        @Override // java.lang.Runnable
                        public final void run() {
                            vzq vzqVar2 = vzpVar.a;
                            vym vymVar3 = (vym) vzqVar2.d.getAndSet(null);
                            vxi vxiVar = (vxi) vzqVar2.f;
                            long j = vxiVar.d;
                            boolean z = j != Long.MAX_VALUE;
                            Instant instantNow = Instant.now();
                            yqw.M(z, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
                            vxo vxoVar = vxiVar.a;
                            vzqVar2.f = new vxi(vxoVar, vxiVar.b, vxiVar.c, j, vxiVar.f, vxiVar.e.g(vxoVar, instantNow));
                            if (vym.LOCAL_STATE_CHANGE.equals(vymVar3)) {
                                vzqVar2.e(((vxi) vzqVar2.f).e);
                            } else {
                                if (!vym.REMOTE_STATE_CHANGE.equals(vymVar3)) {
                                    throw new IllegalStateException("Invalidation was ".concat(String.valueOf(String.valueOf(vymVar3))));
                                }
                                vzqVar2.d(((vxi) vzqVar2.f).e);
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
    }
}
