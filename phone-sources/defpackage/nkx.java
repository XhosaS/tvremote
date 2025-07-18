package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.common.collect.EvictingQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nkx implements nzz {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ nkx(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v30, types: [android.os.IInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v41, types: [android.os.IInterface, java.lang.Object] */
    @Override // defpackage.nzz
    public final void a(Object obj, Object obj2) throws Exception {
        ArrayList arrayList;
        switch (this.c) {
            case 0:
                nrt nrtVar = (nrt) obj;
                Object obj3 = this.a;
                nla nlaVar = (nla) obj3;
                nlaVar.e();
                nsa nsaVar = (nsa) nrtVar.L();
                Context context = nrtVar.u;
                nsaVar.f((String) this.b, ocv.q());
                synchronized (nlaVar.g) {
                    if (((nla) obj3).u != null) {
                        ((kwy) obj2).t(nla.d(2001));
                        return;
                    } else {
                        ((nla) obj3).u = (kwy) obj2;
                        return;
                    }
                }
            case 1:
                nrt nrtVar2 = (nrt) obj;
                ((nla) this.a).j();
                Context context2 = nrtVar2.u;
                nwl nwlVarQ = ocv.q();
                nsa nsaVar2 = (nsa) nrtVar2.L();
                String str = (String) this.b;
                nsaVar2.g(str, nwlVarQ);
                ((nsa) nrtVar2.L()).d(str, nwlVarQ);
                ((kwy) obj2).u(null);
                return;
            case 2:
                ntz ntzVar = (ntz) obj;
                Object obj4 = this.b;
                Object obj5 = this.a;
                try {
                    ((nud) ntzVar.L()).a(new ntw((ntx) obj5, (nug) obj4), (ntk) ((nug) obj4).c);
                    return;
                } catch (Exception e) {
                    try {
                        if (nuh.c(((ntx) obj5).a.w).b() != null) {
                            nue.b().c(new nuf(((ntk) ((nug) obj4).c).a.f, 1003, 1));
                        }
                        throw e;
                    } finally {
                        nty.a.set(false);
                    }
                }
            case 3:
                oes oesVar = (oes) obj;
                ocv ocvVar = oesVar.a;
                WeakReference weakReference = new WeakReference(((oer) this.b).a);
                Object obj6 = this.a;
                GoogleHelp googleHelp = (GoogleHelp) ((Intent) obj6).getParcelableExtra("EXTRA_GOOGLE_HELP");
                int i = googleHelp.M;
                if (i == 0 || i == 1) {
                    EvictingQueue evictingQueue = oew.a;
                    synchronized (evictingQueue) {
                        arrayList = new ArrayList(evictingQueue);
                    }
                    if (!arrayList.isEmpty()) {
                        googleHelp.N = arrayList;
                    }
                }
                ocv ocvVar2 = googleHelp.R;
                try {
                    oeu oeuVar = (oeu) oesVar.L();
                    oeq oeqVar = new oeq((Intent) obj6, weakReference);
                    Parcel parcelK = oeuVar.k();
                    ifl.c(parcelK, googleHelp);
                    ifl.c(parcelK, null);
                    ifl.e(parcelK, oeqVar);
                    oeuVar.m(2, parcelK);
                    return;
                } catch (RemoteException e2) {
                    Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e2);
                    return;
                }
            case 4:
                ogb ogbVar = (ogb) obj;
                ofq ofqVar = ofr.a;
                ofp ofpVar = new ofp((kwy) obj2);
                oga ogaVar = (oga) ogbVar.L();
                Context context3 = ogbVar.u;
                String packageName = ((nwq) this.b).w.getPackageName();
                nwl nwlVarQ2 = ocv.q();
                Parcel parcelK2 = ogaVar.k();
                ifl.e(parcelK2, ofpVar);
                parcelK2.writeString(packageName);
                ifl.e(parcelK2, this.a);
                ifl.c(parcelK2, nwlVarQ2);
                ogaVar.m(1, parcelK2);
                return;
            case 5:
                ogb ogbVar2 = (ogb) obj;
                ofq ofqVar2 = ofr.a;
                ofp ofpVar2 = new ofp((kwy) obj2);
                oga ogaVar2 = (oga) ogbVar2.L();
                Context context4 = ogbVar2.u;
                nwl nwlVarQ3 = ocv.q();
                Parcel parcelK3 = ogaVar2.k();
                ifl.e(parcelK3, ofpVar2);
                parcelK3.writeString((String) this.a);
                parcelK3.writeString((String) this.b);
                ifl.c(parcelK3, nwlVarQ3);
                ogaVar2.m(4, parcelK3);
                return;
            case 6:
                ogb ogbVar3 = (ogb) obj;
                ofx ofxVar = ofy.a;
                ofw ofwVar = new ofw((kwy) obj2);
                oga ogaVar3 = (oga) ogbVar3.L();
                Context context5 = ogbVar3.u;
                String packageName2 = ((nwq) this.b).w.getPackageName();
                nwl nwlVarQ4 = ocv.q();
                Parcel parcelK4 = ogaVar3.k();
                ifl.e(parcelK4, ofwVar);
                parcelK4.writeString(packageName2);
                ifl.e(parcelK4, this.a);
                ifl.c(parcelK4, nwlVarQ4);
                ogaVar3.m(7, parcelK4);
                return;
            case 7:
                ogq ogqVar = (ogq) obj;
                int i2 = ogp.a;
                nnh nnhVar = new nnh((kwy) obj2, 6);
                ogn ognVar = (ogn) ogqVar.L();
                Context context6 = ogqVar.u;
                nwl nwlVarQ5 = ocv.q();
                Parcel parcelK5 = ognVar.k();
                ifl.e(parcelK5, nnhVar);
                ifl.c(parcelK5, this.b);
                ifl.c(parcelK5, this.a);
                ifl.c(parcelK5, nwlVarQ5);
                ognVar.m(1, parcelK5);
                return;
            case 8:
                int i3 = omi.a;
                omp ompVar = (omp) ((omq) obj).L();
                nnh nnhVar2 = new nnh((nzt) this.a, 8, (char[]) null);
                Parcel parcelK6 = ompVar.k();
                parcelK6.writeString((String) this.b);
                ifl.e(parcelK6, nnhVar2);
                ompVar.m(28, parcelK6);
                return;
            default:
                int i4 = omi.a;
                omo omoVar = new omo((kwy) obj2);
                ((omp) ((omq) obj).L()).a(omoVar, "CURRENT:" + ((String) this.b) + ":" + ((String) this.a));
                return;
        }
    }

    public /* synthetic */ nkx(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
