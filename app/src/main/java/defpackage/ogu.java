package defpackage;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogu extends dxv {

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Boolean a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogh b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oal c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public mmt d;

    private ogu() {
        super("LazilyConvertedElement");
    }

    public static ogs aA(dru druVar) {
        return new ogs(druVar, new ogu());
    }

    private final ogt aB(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (ogt) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        ogt ogtVarAB = aB(druVar);
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        dxzVar.a = new AtomicReference();
        dxzVar2.a = new AtomicReference();
        ogtVarAB.b = (AtomicReference) dxzVar.a;
        ogtVarAB.a = (AtomicReference) dxzVar2.a;
    }

    @Override // defpackage.drq
    protected final void J(dru druVar) {
        ogt ogtVarAB = aB(druVar);
        Boolean bool = this.a;
        mmt mmtVar = this.d;
        AtomicReference atomicReference = ogtVarAB.b;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        atomicReference.set(null);
        if (mmtVar != null) {
            String str = mmtVar.b;
            Map map = mmtVar.a;
            synchronized (map) {
                aggh agghVar = (aggh) map.remove(str);
                if (agghVar != null) {
                    agghVar.dispose();
                }
            }
        }
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        ogt ogtVar = (ogt) dxxVar;
        ogt ogtVar2 = (ogt) dxxVar2;
        ogtVar2.a = ogtVar.a;
        ogtVar2.b = ogtVar.b;
    }

    @Override // defpackage.drq
    protected final boolean Q() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean U() {
        return true;
    }

    @Override // defpackage.dxv
    protected final drq ay(dru druVar) {
        ogt ogtVarAB = aB(druVar);
        ogh oghVar = this.b;
        oal oalVar = this.c;
        AtomicReference atomicReference = ogtVarAB.b;
        AtomicReference atomicReference2 = ogtVarAB.a;
        if (atomicReference2.get() == null || ((WeakReference) atomicReference2.get()).get() != oghVar) {
            atomicReference2.set(new WeakReference(oghVar));
            atomicReference.set(null);
        }
        drq drqVar = (drq) atomicReference.get();
        if (drqVar != null) {
            return drqVar;
        }
        drq drqVarA = oghVar.a(druVar, oalVar);
        atomicReference.set(drqVarA);
        return drqVarA;
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new ogt();
    }
}
