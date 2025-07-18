package defpackage;

import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mmz extends dxv {

    @eau(a = eav.NONE)
    @eat(a = 10)
    drq a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    obe b;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean c;

    public mmz() {
        super("DirectPropertyUpdate");
    }

    private final mmy aA(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (mmy) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        mmy mmyVarAA = aA(druVar);
        dxz dxzVar = new dxz();
        obe obeVar = this.b;
        obeVar.f();
        obeVar.c();
        dxzVar.a = new AtomicReference(obeVar);
        mmyVarAA.a = (AtomicReference) dxzVar.a;
    }

    @Override // defpackage.drq
    protected final void G(dru druVar) {
        obe obeVar = (obe) aA(druVar).a.get();
        if (obeVar == null || !obeVar.g()) {
            return;
        }
        obeVar.f();
        obeVar.c();
    }

    @Override // defpackage.drq
    protected final void J(dru druVar) {
        obe obeVar = (obe) aA(druVar).a.get();
        if (obeVar != null) {
            obeVar.b();
        }
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        ((mmy) dxxVar2).a = ((mmy) dxxVar).a;
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
        mmy mmyVarAA = aA(druVar);
        drq drqVar = this.a;
        obe obeVar = this.b;
        boolean z = this.c;
        AtomicReference atomicReference = mmyVarAA.a;
        dzs dzsVarAA = dzt.aA(druVar);
        dzsVarAA.c(drqVar);
        obe obeVar2 = (obe) atomicReference.get();
        if (obeVar2 != null) {
            if (z && obeVar2.g()) {
                obeVar2.f();
            }
            EnumMap enumMap = new EnumMap(acvm.class);
            mnf mnfVar = (mnf) obeVar;
            enumMap.put((EnumMap) acvm.DYNAMIC_PROP_TYPE_ALPHA, (acvm) Float.valueOf(mnfVar.d));
            enumMap.put((EnumMap) acvm.DYNAMIC_PROP_TYPE_SCALE_X, (acvm) Float.valueOf(mnfVar.e));
            enumMap.put((EnumMap) acvm.DYNAMIC_PROP_TYPE_SCALE_Y, (acvm) Float.valueOf(mnfVar.f));
            enumMap.put((EnumMap) acvm.DYNAMIC_PROP_TYPE_ROTATION, (acvm) Float.valueOf(mnfVar.g));
            enumMap.put((EnumMap) acvm.DYNAMIC_PROP_TYPE_TRANSLATION_X, (acvm) Float.valueOf(mnfVar.h));
            enumMap.put((EnumMap) acvm.DYNAMIC_PROP_TYPE_TRANSLATION_Y, (acvm) Float.valueOf(mnfVar.i));
            obeVar2.e(enumMap);
            obeVar2.d(mnfVar.b);
            mna.a(dzsVarAA, obeVar2.a());
        } else {
            obeVar.f();
            atomicReference.set(obeVar);
            obeVar.c();
            mna.a(dzsVarAA, ((mnf) obeVar).c);
        }
        return dzsVarAA.a();
    }

    @Override // defpackage.drq
    public final /* bridge */ /* synthetic */ drq l() {
        mmz mmzVar = (mmz) super.l();
        drq drqVar = mmzVar.a;
        mmzVar.a = drqVar != null ? drqVar.l() : null;
        return mmzVar;
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new mmy();
    }
}
