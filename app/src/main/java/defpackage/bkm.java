package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bkm extends bkh {
    public final MeasurementManager a;

    public bkm(MeasurementManager measurementManager) {
        this.a = measurementManager;
    }

    static /* synthetic */ Object h(bkm bkmVar, bkf bkfVar, agsw agswVar) {
        new ahar(agth.c(agswVar), 1).z();
        MeasurementManager measurementManager = bkmVar.a;
        throw null;
    }

    static /* synthetic */ Object i(bkm bkmVar, agsw agswVar) {
        ahar aharVar = new ahar(agth.c(agswVar), 1);
        aharVar.z();
        bkmVar.a.getMeasurementApiStatus(new bkk(), new adq(aharVar));
        Object objM = aharVar.m();
        if (objM == agtg.a) {
            agswVar.getClass();
        }
        return objM;
    }

    static /* synthetic */ Object j(bkm bkmVar, bkn bknVar, agsw agswVar) {
        Object objA = ahbu.a(new bkl(bknVar, bkmVar, null), agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }

    static /* synthetic */ Object k(bkm bkmVar, Uri uri, InputEvent inputEvent, agsw agswVar) {
        ahar aharVar = new ahar(agth.c(agswVar), 1);
        aharVar.z();
        bkmVar.a.registerSource(uri, inputEvent, new bkk(), new adq(aharVar));
        Object objM = aharVar.m();
        agtg agtgVar = agtg.a;
        if (objM == agtgVar) {
            agswVar.getClass();
        }
        return objM == agtgVar ? objM : agpu.a;
    }

    static /* synthetic */ Object l(bkm bkmVar, Uri uri, agsw agswVar) {
        ahar aharVar = new ahar(agth.c(agswVar), 1);
        aharVar.z();
        bkmVar.a.registerTrigger(uri, new bkk(), new adq(aharVar));
        Object objM = aharVar.m();
        agtg agtgVar = agtg.a;
        if (objM == agtgVar) {
            agswVar.getClass();
        }
        return objM == agtgVar ? objM : agpu.a;
    }

    static /* synthetic */ Object m(bkm bkmVar, bko bkoVar, agsw agswVar) {
        new ahar(agth.c(agswVar), 1).z();
        MeasurementManager measurementManager = bkmVar.a;
        throw null;
    }

    static /* synthetic */ Object n(bkm bkmVar, bkp bkpVar, agsw agswVar) {
        new ahar(agth.c(agswVar), 1).z();
        MeasurementManager measurementManager = bkmVar.a;
        throw null;
    }

    @Override // defpackage.bkh
    public Object a(bkf bkfVar, agsw agswVar) {
        return h(this, bkfVar, agswVar);
    }

    @Override // defpackage.bkh
    public Object b(agsw agswVar) {
        return i(this, agswVar);
    }

    @Override // defpackage.bkh
    public Object c(bkn bknVar, agsw agswVar) {
        return j(this, bknVar, agswVar);
    }

    @Override // defpackage.bkh
    public Object d(Uri uri, InputEvent inputEvent, agsw agswVar) {
        return k(this, uri, inputEvent, agswVar);
    }

    @Override // defpackage.bkh
    public Object e(Uri uri, agsw agswVar) {
        return l(this, uri, agswVar);
    }

    @Override // defpackage.bkh
    public Object f(bko bkoVar, agsw agswVar) {
        return m(this, bkoVar, agswVar);
    }

    @Override // defpackage.bkh
    public Object g(bkp bkpVar, agsw agswVar) {
        return n(this, bkpVar, agswVar);
    }
}
