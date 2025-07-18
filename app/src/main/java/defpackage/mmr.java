package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmr extends ecq {
    public static final /* synthetic */ int y = 0;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    nzu m;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ngd n;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oaa o;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    aggh p;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oal q;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oap r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    obk s;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oca t;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oco u;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ocr v;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean w;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean x;

    public mmr() {
        super("DataDrivenCollectionSection");
    }

    @Override // defpackage.ecq
    protected final /* synthetic */ dxx b() {
        return new mmq();
    }

    @Override // defpackage.ecq
    public final /* bridge */ /* synthetic */ ecq c(boolean z) {
        mmr mmrVar = (mmr) super.c(z);
        if (!z) {
            mmrVar.g = new mmq();
        }
        return mmrVar;
    }

    @Override // defpackage.ecq
    /* renamed from: f */
    public final boolean a(ecq ecqVar) {
        if (this == ecqVar) {
            return true;
        }
        if (ecqVar == null || getClass() != ecqVar.getClass()) {
            return false;
        }
        mmr mmrVar = (mmr) ecqVar;
        nzu nzuVar = this.m;
        if (nzuVar == null ? mmrVar.m != null : !nzuVar.equals(mmrVar.m)) {
            return false;
        }
        ngd ngdVar = this.n;
        if (ngdVar == null ? mmrVar.n != null : !ngdVar.equals(mmrVar.n)) {
            return false;
        }
        oaa oaaVar = this.o;
        if (oaaVar == null ? mmrVar.o != null : !oaaVar.equals(mmrVar.o)) {
            return false;
        }
        aggh agghVar = this.p;
        if (agghVar == null ? mmrVar.p != null : !agghVar.equals(mmrVar.p)) {
            return false;
        }
        oal oalVar = this.q;
        if (oalVar == null ? mmrVar.q != null : !oalVar.equals(mmrVar.q)) {
            return false;
        }
        oap oapVar = this.r;
        if (oapVar == null ? mmrVar.r != null : !oapVar.equals(mmrVar.r)) {
            return false;
        }
        obk obkVar = this.s;
        if (obkVar == null ? mmrVar.s != null : !obkVar.equals(mmrVar.s)) {
            return false;
        }
        oca ocaVar = this.t;
        if (ocaVar == null ? mmrVar.t != null : !ocaVar.equals(mmrVar.t)) {
            return false;
        }
        oco ocoVar = this.u;
        if (ocoVar == null ? mmrVar.u != null : !ocoVar.equals(mmrVar.u)) {
            return false;
        }
        ocr ocrVar = this.v;
        return ocrVar == null ? mmrVar.v == null : ocrVar.equals(mmrVar.v);
    }

    @Override // defpackage.ect
    protected final ecj g(ecr ecrVar) {
        mmq mmqVar = (mmq) this.g;
        Boolean bool = mmqVar.f;
        yyk yykVar = mmqVar.b;
        mmqVar.e.set(ecrVar);
        ecj ecjVar = new ecj();
        edi ediVar = new edi(ecrVar, new edj());
        edj edjVar = ediVar.a;
        edjVar.n = bool;
        edjVar.m = yykVar;
        ediVar.b.set(0);
        edjVar.r = q(mmr.class, ecrVar, 1380951079, new Object[]{ecrVar});
        edjVar.q = q(mmr.class, ecrVar, 1463818325, new Object[]{ecrVar});
        edjVar.p = q(mmr.class, ecrVar, 947264300, new Object[]{ecrVar});
        edjVar.o = q(mmr.class, ecrVar, 851046848, new Object[]{ecrVar});
        eci.a(ediVar, ecjVar);
        return ecjVar;
    }

    @Override // defpackage.ect
    protected final Object h(dtu dtuVar, Object obj) {
        aggh agghVar;
        nzu nzuVar;
        oap oapVar;
        byte[] bArr;
        oal oalVar;
        oco ocoVar;
        switch (dtuVar.c) {
            case 851046848:
                edo edoVar = (edo) obj;
                dui duiVar = dtuVar.b;
                break;
            case 947264300:
                edp edpVar = (edp) obj;
                dui duiVar2 = dtuVar.b;
                break;
            case 1380951079:
                dui duiVar3 = dtuVar.b;
                mmq mmqVar = (mmq) this.g;
                AtomicBoolean atomicBoolean = mmqVar.c;
                AtomicBoolean atomicBoolean2 = mmqVar.d;
                AtomicReference atomicReference = mmqVar.e;
                atomicBoolean.set(false);
                if (atomicBoolean2.compareAndSet(true, false)) {
                    ect.o((ecr) atomicReference.get(), 3);
                    break;
                }
                break;
            case 1463818325:
                edr edrVar = (edr) obj;
                dui duiVar4 = dtuVar.b;
                ecr ecrVar = (ecr) dtuVar.d[0];
                int i = edrVar.a;
                final String str = (String) edrVar.b;
                mmr mmrVar = (mmr) duiVar4;
                dxx dxxVar = this.g;
                oal oalVar2 = mmrVar.q;
                oco ocoVar2 = mmrVar.u;
                final oca ocaVar = mmrVar.t;
                final obk obkVar = mmrVar.s;
                aggh agghVar2 = mmrVar.p;
                nzu nzuVar2 = mmrVar.m;
                boolean z = mmrVar.w;
                oap oapVar2 = mmrVar.r;
                boolean z2 = mmrVar.x;
                final Map map = ((mmq) dxxVar).a;
                StatusOr statusOrElementBytesByKey = nzuVar2.elementBytesByKey(str);
                if (statusOrElementBytesByKey.hasValue) {
                    agghVar = agghVar2;
                    nzuVar = nzuVar2;
                    oapVar = oapVar2;
                    bArr = null;
                    oalVar = oalVar2;
                    ocoVar = ocoVar2;
                    byte[] bArr2 = (byte[]) statusOrElementBytesByKey.value;
                    if (bArr2 == null) {
                        ocoVar.b(acsw.LOG_TYPE_INTERNAL_ERROR, oalVar, "Null Element bytes from CollectionDataSource.", new Object[0]);
                    } else {
                        bArr = bArr2;
                    }
                } else {
                    bArr = null;
                    if (statusOrElementBytesByKey.status.getCode() == Status.Code.NOT_FOUND) {
                        agghVar = agghVar2;
                        nzuVar = nzuVar2;
                        oapVar = oapVar2;
                        oalVar = oalVar2;
                        ocoVar = ocoVar2;
                    } else {
                        agghVar = agghVar2;
                        oalVar = oalVar2;
                        ocoVar = ocoVar2;
                        oapVar = oapVar2;
                        nzuVar = nzuVar2;
                        ocoVar.d(acsw.LOG_TYPE_INTERNAL_ERROR, oalVar, statusOrElementBytesByKey.status.asException(), "Error getting Element bytes from CollectionDataSource.", new Object[0]);
                    }
                }
                if (bArr != null) {
                    if (map != null) {
                        ogs ogsVarAA = ogu.aA(ecrVar);
                        final oco ocoVar3 = ocoVar;
                        final oal oalVar3 = oalVar;
                        final byte[] bArr3 = bArr;
                        final aggh agghVar3 = agghVar;
                        final oap oapVar3 = oapVar;
                        ogsVarAA.c(new ogh() { // from class: mms
                            @Override // defpackage.ogh
                            public final drq a(dru druVar, oal oalVar4) {
                                aggh agghVar4;
                                dru druVar2;
                                oap oapVar4 = oapVar3;
                                Map map2 = map;
                                String str2 = str;
                                aggh agghVar5 = agghVar3;
                                oca ocaVar2 = ocaVar;
                                obk obkVar2 = obkVar;
                                byte[] bArr4 = bArr3;
                                synchronized (map2) {
                                    if (!map2.containsKey(str2)) {
                                        map2.put(str2, new aggh());
                                    }
                                    agghVar4 = (aggh) map2.get(str2);
                                    agghVar5.a(agghVar4);
                                }
                                try {
                                    nid nidVarB = oapVar4.b(bArr4);
                                    druVar2 = druVar;
                                    try {
                                        return ocaVar2.a(druVar2, oalVar4, nidVarB, obkVar2, agghVar4);
                                    } catch (IOException unused) {
                                        ocoVar3.b(acsw.LOG_TYPE_INTERNAL_ERROR, oalVar3, "DDC failed to parse element bytes.", new Object[0]);
                                        return efx.aA(druVar2).a;
                                    }
                                } catch (IOException unused2) {
                                    druVar2 = druVar;
                                }
                            }
                        });
                        ogsVarAA.d(oalVar3);
                        if (nzuVar.j()) {
                            ogu oguVar = ogsVarAA.a;
                            oguVar.a = true;
                            oguVar.d = new mmt(map, str);
                        }
                        efi efiVar = new efi();
                        efiVar.b = ogsVarAA.a();
                        break;
                    } else {
                        ocoVar.b(acsw.LOG_TYPE_INTERNAL_ERROR, oalVar, "DDC failed to fetch element disposable map.", new Object[0]);
                        break;
                    }
                } else {
                    break;
                }
        }
        return efk.n();
    }

    @Override // defpackage.ect
    protected final void j(ecr ecrVar) {
        dxx dxxVar = this.g;
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        dxz dxzVar3 = new dxz();
        dxz dxzVar4 = new dxz();
        dxz dxzVar5 = new dxz();
        dxz dxzVar6 = new dxz();
        nzu nzuVar = this.m;
        ocr ocrVar = this.v;
        oal oalVar = this.q;
        aggh agghVar = this.p;
        oco ocoVar = this.u;
        oaa oaaVar = this.o;
        dxzVar.a = false;
        yyk yykVarJ = yyk.j(nzuVar.identifiers());
        dxzVar2.a = yykVarJ;
        dxzVar3.a = new HashMap();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        dxzVar4.a = atomicBoolean;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        dxzVar5.a = atomicBoolean2;
        AtomicReference atomicReference = new AtomicReference(ecrVar);
        dxzVar6.a = atomicReference;
        nzuVar.h(new mmv(nzuVar, atomicReference, oalVar, ocoVar, agghVar, atomicBoolean, atomicBoolean2));
        if (ocrVar != null) {
            ocrVar.o(new mmu(atomicReference));
        }
        if (yykVarJ.isEmpty() && nzuVar.b() >= 0) {
            atomicBoolean.set(true);
            CommandOuterClass$Command commandOuterClass$CommandC = nzuVar.c();
            if (commandOuterClass$CommandC != null) {
                mmw.a(oaaVar, oalVar, agghVar, commandOuterClass$CommandC);
            } else {
                nzuVar.loadMore();
            }
        }
        mmq mmqVar = (mmq) dxxVar;
        mmqVar.f = (Boolean) dxzVar.a;
        mmqVar.b = (yyk) dxzVar2.a;
        mmqVar.a = (Map) dxzVar3.a;
        mmqVar.c = (AtomicBoolean) dxzVar4.a;
        mmqVar.d = (AtomicBoolean) dxzVar5.a;
        mmqVar.e = (AtomicReference) dxzVar6.a;
    }

    @Override // defpackage.ect
    protected final void k(dxx dxxVar, dxx dxxVar2) {
        mmq mmqVar = (mmq) dxxVar;
        mmq mmqVar2 = (mmq) dxxVar2;
        mmqVar2.a = mmqVar.a;
        mmqVar2.b = mmqVar.b;
        mmqVar2.c = mmqVar.c;
        mmqVar2.d = mmqVar.d;
        mmqVar2.e = mmqVar.e;
        mmqVar2.f = mmqVar.f;
    }

    @Override // defpackage.ect
    protected final void r() {
        dxx dxxVar = this.g;
        oal oalVar = this.q;
        aggh agghVar = this.p;
        oco ocoVar = this.u;
        nzu nzuVar = this.m;
        oaa oaaVar = this.o;
        if (((mmq) dxxVar).d.compareAndSet(false, true)) {
            CommandOuterClass$Command commandOuterClass$CommandD = nzuVar.d();
            if (commandOuterClass$CommandD != null) {
                mmw.a(oaaVar, oalVar, agghVar, commandOuterClass$CommandD);
                return;
            }
            Status statusReload = nzuVar.reload();
            if (statusReload.e()) {
                return;
            }
            ocoVar.d(acsw.LOG_TYPE_CONFIGURATION_ERROR, oalVar, statusReload.asException(), "Error reloading data driven collection (pull to refresh).", new Object[0]);
        }
    }

    @Override // defpackage.ect
    protected final void s(int i, int i2) {
        dxx dxxVar = this.g;
        oal oalVar = this.q;
        aggh agghVar = this.p;
        nzu nzuVar = this.m;
        oaa oaaVar = this.o;
        AtomicBoolean atomicBoolean = ((mmq) dxxVar).c;
        if (nzuVar.b() < 0 || (i2 - i) - 1 > nzuVar.b() || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        CommandOuterClass$Command commandOuterClass$CommandC = nzuVar.c();
        if (commandOuterClass$CommandC != null) {
            mmw.a(oaaVar, oalVar, agghVar, commandOuterClass$CommandC);
        } else {
            nzuVar.loadMore();
        }
    }
}
