package defpackage;

import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mpi extends dxv {

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oaa b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oal c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oap d;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    obh e;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    nir f;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oco s;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    Map t;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ofy u;

    public mpi() {
        super("ExpandableTextComponent");
    }

    public static dtu aA(dru druVar, ogq ogqVar, ogq ogqVar2) {
        return o(mpi.class, "ExpandableTextComponent", druVar, 2076732558, new Object[]{druVar, ogqVar, ogqVar2});
    }

    private final mph aB(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (mph) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        mph mphVarAB = aB(druVar);
        dxz dxzVar = new dxz();
        dxzVar.a = false;
        mphVarAB.a = (Boolean) dxzVar.a;
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        ((mph) dxxVar2).a = ((mph) dxxVar).a;
    }

    @Override // defpackage.drq
    protected final boolean P() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean U() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    @Override // defpackage.dxv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final defpackage.drq az(defpackage.dru r26, int r27) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpi.az(dru, int):drq");
    }

    @Override // defpackage.drq
    public final /* synthetic */ drq l() {
        return (mpi) super.l();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new mph();
    }

    @Override // defpackage.drq
    protected final Object y(dtu dtuVar, Object obj) {
        int i = dtuVar.c;
        if (i == -1048037474) {
            dsq.b((dru) dtuVar.d[0], (dto) obj);
            return null;
        }
        if (i == 2076732558) {
            dui duiVar = dtuVar.b;
            Object[] objArr = dtuVar.d;
            dru druVar = (dru) objArr[0];
            ogq ogqVar = (ogq) objArr[1];
            ogq ogqVar2 = (ogq) objArr[2];
            mpi mpiVar = (mpi) duiVar;
            mph mphVarAB = aB(druVar);
            oaa oaaVar = mpiVar.b;
            oal oalVar = mpiVar.c;
            boolean zBooleanValue = mphVarAB.a.booleanValue();
            if (druVar.c != null) {
                druVar.k(new dxw(0, new Object[0]), "updateState:ExpandableTextComponent.updateExpand");
            }
            nyx nyxVar = (nyx) oalVar;
            ocj ocjVar = nyxVar.q;
            nzv nzvVarP = nzx.p();
            nyu nyuVar = (nyu) nzvVarP;
            nyuVar.e = ocjVar;
            obj objVar = nyxVar.m;
            if (objVar != null) {
                nyuVar.d = objVar;
            }
            if (zBooleanValue) {
                if (ogqVar2 != null) {
                    oaaVar.a(ogqVar2.a(), nzvVarP.e()).k();
                }
            } else if (ogqVar != null) {
                oaaVar.a(ogqVar.a(), nzvVarP.e()).k();
            }
        }
        return null;
    }
}
