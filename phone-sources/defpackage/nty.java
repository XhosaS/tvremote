package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nty extends nwq implements nta {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public nty(Context context) {
        jzs jzsVar = nsz.k;
        nwh nwhVar = nwi.q;
        nwo nwoVar = new nwo();
        nwoVar.a = new ujd(1);
        super(context, jzsVar, nwhVar, nwoVar.a());
    }

    public final onz a(nsw nswVar, ntl ntlVar) {
        ntx ntxVar = new ntx(this, nswVar, this.C, ntlVar);
        super.u(2, ntxVar);
        return ocv.aH(ntxVar);
    }

    public final void b(ntt nttVar) {
        if (nttVar.a.isEmpty()) {
            osk.r(Status.a);
            return;
        }
        oaf oafVar = new oaf();
        oafVar.a = new nig(nttVar, 7);
        oafVar.b = new nvg[]{nti.a};
        oafVar.b();
        q(oafVar.a());
    }

    public final onz c(nsw nswVar) {
        whn whnVar;
        whn whnVar2;
        whn whnVar3;
        uhp uhpVarI;
        Object objB;
        nbe nbeVar = new nbe(this, 4);
        int i = 1;
        byte[] bArr = null;
        if (nswVar.n) {
            Log.e("AbstractLogEventBuilder", "resolveComplianceData should not be invoked more than once per log.");
            uhpVarI = uhl.a;
        } else {
            nswVar.n = true;
            nte nteVar = nswVar.m;
            if (nteVar == null || nteVar.b != whn.EVENT_OVERRIDE) {
                ntc ntcVar = nswVar.a.j;
                nte nteVarA = ntcVar != null ? ntcVar.a() : null;
                if (nteVarA != null && (whnVar = nteVarA.b) != (whnVar2 = whn.LOGGER_OVERRIDE_PROVIDER) && whnVar != (whnVar3 = whn.LOGGER_DEFERRING_PROVIDER)) {
                    Log.e("AbstractLogEventBuilder", "The provided logger-level ProductIdOrigin value " + whnVar.toString() + " is not one of the values expected for a logger-level provider: " + String.valueOf(whnVar2) + " or " + String.valueOf(whnVar3));
                    nteVarA = null;
                }
                if (nteVarA == null || nteVarA.b != whn.LOGGER_OVERRIDE_PROVIDER) {
                    nte nteVar2 = nswVar.k;
                    if (nteVar2 != null && nteVar2.b == whn.CPS_APP_PROCESS_GLOBAL_PROVIDER) {
                        nswVar.d(nteVar2);
                    } else if (nteVar != null) {
                        nswVar.d(nteVar);
                    } else if (nteVarA != null) {
                        nswVar.d(nteVarA);
                    } else if (nteVar2 != null) {
                        nswVar.d(nteVar2);
                    }
                } else {
                    nswVar.d(nteVarA);
                }
            } else {
                nswVar.d(nteVar);
            }
            if (nswVar.a.e()) {
                uhpVarI = uhl.a;
            } else {
                uhp uhpVarC = sfy.C(null);
                pap papVar = new pap(nswVar, uhpVarC, i, bArr);
                ugk ugkVar = ugk.a;
                uhpVarI = ufn.i(ufn.j(uhpVarC, papVar, ugkVar), new nbe(nswVar, 3), ugkVar);
            }
        }
        if (!uhpVarI.isDone() || uhpVarI.isCancelled()) {
            kwy kwyVar = new kwy((char[]) null);
            kwy kwyVar2 = new kwy((kwy) kwyVar.a);
            ots otsVar = new ots(kwyVar2, uhpVarI, kwyVar);
            ugk ugkVar2 = ugk.a;
            sfy.K(uhpVarI, otsVar, ugkVar2);
            objB = ((onz) kwyVar2.a).b(ugkVar2, new nuy(nbeVar, nswVar, i));
        } else {
            try {
                a.G(uhpVarI);
                objB = nbeVar.apply(nswVar);
            } catch (RuntimeException | ExecutionException unused) {
            }
        }
        return (onz) objB;
    }
}
