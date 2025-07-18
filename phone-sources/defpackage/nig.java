package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nig implements nzz {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nig(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.nzz
    public final void a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                nik nikVar = new nik((kwy) obj2);
                nif nifVar = (nif) ((nid) obj).L();
                Parcel parcelK = nifVar.k();
                ifl.e(parcelK, nikVar);
                ifl.c(parcelK, this.a);
                nifVar.m(5, parcelK);
                break;
            case 1:
                nii niiVar = new nii((kwy) obj2);
                nif nifVar2 = (nif) ((nid) obj).L();
                Parcel parcelK2 = nifVar2.k();
                ifl.e(parcelK2, niiVar);
                ifl.c(parcelK2, this.a);
                nifVar2.m(1, parcelK2);
                break;
            case 2:
                nij nijVar = new nij((kwy) obj2);
                nif nifVar3 = (nif) ((nid) obj).L();
                Parcel parcelK3 = nifVar3.k();
                ifl.e(parcelK3, nijVar);
                ifl.c(parcelK3, this.a);
                nifVar3.m(2, parcelK3);
                break;
            case 3:
                nrt nrtVar = (nrt) obj;
                nsa nsaVar = (nsa) nrtVar.L();
                Context context = nrtVar.u;
                nwl nwlVarQ = ocv.q();
                Parcel parcelK4 = nsaVar.k();
                ifl.e(parcelK4, ((nla) this.a).b);
                ifl.c(parcelK4, nwlVarQ);
                nsaVar.n(18, parcelK4);
                nsa nsaVar2 = (nsa) nrtVar.L();
                nwl nwlVarQ2 = ocv.q();
                Parcel parcelK5 = nsaVar2.k();
                ifl.c(parcelK5, nwlVarQ2);
                nsaVar2.n(17, parcelK5);
                ((kwy) obj2).u(null);
                break;
            case 4:
                nro nroVar = (nro) obj;
                int i = nrn.a;
                nrl nrlVar = new nrl((kwy) obj2);
                nsd nsdVar = (nsd) nroVar.L();
                Context context2 = nroVar.u;
                nwl nwlVarQ3 = ocv.q();
                Parcel parcelK6 = nsdVar.k();
                ifl.e(parcelK6, nrlVar);
                parcelK6.writeStringArray((String[]) this.a);
                ifl.c(parcelK6, nwlVarQ3);
                nsdVar.n(6, parcelK6);
                break;
            case 5:
                nro nroVar2 = (nro) obj;
                int i2 = nrn.a;
                nrk nrkVar = new nrk((kwy) obj2);
                nsd nsdVar2 = (nsd) nroVar2.L();
                Context context3 = nroVar2.u;
                nwl nwlVarQ4 = ocv.q();
                Parcel parcelK7 = nsdVar2.k();
                ifl.e(parcelK7, nrkVar);
                parcelK7.writeStringArray((String[]) this.a);
                ifl.c(parcelK7, nwlVarQ4);
                nsdVar2.n(5, parcelK7);
                break;
            case 6:
                nro nroVar3 = (nro) obj;
                int i3 = nrn.a;
                nrm nrmVar = new nrm((kwy) obj2);
                nsd nsdVar3 = (nsd) nroVar3.L();
                Context context4 = nroVar3.u;
                nwl nwlVarQ5 = ocv.q();
                Parcel parcelK8 = nsdVar3.k();
                ifl.e(parcelK8, nrmVar);
                parcelK8.writeStringArray((String[]) this.a);
                ifl.c(parcelK8, nwlVarQ5);
                nsdVar3.n(7, parcelK8);
                break;
            case 7:
                AtomicBoolean atomicBoolean = nty.a;
                ntu ntuVar = new ntu((kwy) obj2);
                nud nudVar = (nud) ((ntz) obj).L();
                Parcel parcelK9 = nudVar.k();
                ifl.e(parcelK9, ntuVar);
                ifl.c(parcelK9, this.a);
                nudVar.n(8, parcelK9);
                break;
            case 8:
                int i4 = ocl.a;
                ocj ocjVar = (ocj) ((ocm) obj).L();
                Parcel parcelK10 = ocjVar.k();
                ifl.c(parcelK10, this.a);
                ocjVar.n(1, parcelK10);
                ((kwy) obj2).u(null);
                break;
            case 9:
                ogb ogbVar = (ogb) obj;
                ofq ofqVar = ofr.a;
                ofo ofoVar = new ofo((kwy) obj2);
                oga ogaVar = (oga) ogbVar.L();
                Context context5 = ogbVar.u;
                String packageName = ((nwq) this.a).w.getPackageName();
                nwl nwlVarQ6 = ocv.q();
                Parcel parcelK11 = ogaVar.k();
                ifl.e(parcelK11, ofoVar);
                parcelK11.writeString(packageName);
                ifl.c(parcelK11, nwlVarQ6);
                ogaVar.m(2, parcelK11);
                break;
            case 10:
                ogb ogbVar2 = (ogb) obj;
                ofq ofqVar2 = ofr.a;
                ofp ofpVar = new ofp((kwy) obj2);
                oga ogaVar2 = (oga) ogbVar2.L();
                Context context6 = ogbVar2.u;
                nwl nwlVarQ7 = ocv.q();
                Parcel parcelK12 = ogaVar2.k();
                ifl.e(parcelK12, ofpVar);
                parcelK12.writeString((String) this.a);
                ifl.c(parcelK12, nwlVarQ7);
                ogaVar2.m(6, parcelK12);
                break;
            case 11:
                ogb ogbVar3 = (ogb) obj;
                ofx ofxVar = ofy.a;
                ofw ofwVar = new ofw((kwy) obj2);
                oga ogaVar3 = (oga) ogbVar3.L();
                Context context7 = ogbVar3.u;
                byte[] bArrH = ((vsg) this.a).h();
                nwl nwlVarQ8 = ocv.q();
                Parcel parcelK13 = ogaVar3.k();
                ifl.e(parcelK13, ofwVar);
                parcelK13.writeByteArray(bArrH);
                ifl.c(parcelK13, nwlVarQ8);
                ogaVar3.m(10, parcelK13);
                break;
            case 12:
                ogb ogbVar4 = (ogb) obj;
                ofx ofxVar2 = ofy.a;
                ofv ofvVar = new ofv((kwy) obj2);
                oga ogaVar4 = (oga) ogbVar4.L();
                Context context8 = ogbVar4.u;
                String packageName2 = ((nwq) this.a).w.getPackageName();
                nwl nwlVarQ9 = ocv.q();
                Parcel parcelK14 = ogaVar4.k();
                ifl.e(parcelK14, ofvVar);
                parcelK14.writeString(packageName2);
                ifl.c(parcelK14, nwlVarQ9);
                ogaVar4.m(8, parcelK14);
                break;
            case 13:
                ohi ohiVar = (ohi) obj;
                kwy kwyVar = (kwy) obj2;
                ohe oheVar = new ohe(kwyVar);
                ?? r1 = this.a;
                try {
                    ogz ogzVar = (ogz) ohiVar.L();
                    Context context9 = ohiVar.u;
                    nwl nwlVarQ10 = ocv.q();
                    Parcel parcelK15 = ogzVar.k();
                    ifl.e(parcelK15, oheVar);
                    ifl.c(parcelK15, r1);
                    ifl.c(parcelK15, nwlVarQ10);
                    ogzVar.m(3, parcelK15);
                    break;
                } catch (RemoteException unused) {
                    ocv.aS(Status.c, null, kwyVar);
                    return;
                }
            case 14:
                ohi ohiVar2 = (ohi) obj;
                kwy kwyVar2 = (kwy) obj2;
                ohd ohdVar = new ohd(kwyVar2);
                ?? r12 = this.a;
                try {
                    ogz ogzVar2 = (ogz) ohiVar2.L();
                    Context context10 = ohiVar2.u;
                    nwl nwlVarQ11 = ocv.q();
                    Parcel parcelK16 = ogzVar2.k();
                    ifl.e(parcelK16, ohdVar);
                    ifl.c(parcelK16, r12);
                    ifl.c(parcelK16, nwlVarQ11);
                    ogzVar2.m(2, parcelK16);
                    break;
                } catch (RemoteException unused2) {
                    ocv.aS(Status.c, null, kwyVar2);
                    return;
                }
            case 15:
                ohi ohiVar3 = (ohi) obj;
                kwy kwyVar3 = (kwy) obj2;
                ohc ohcVar = new ohc(kwyVar3);
                ?? r13 = this.a;
                try {
                    ogz ogzVar3 = (ogz) ohiVar3.L();
                    Context context11 = ohiVar3.u;
                    nwl nwlVarQ12 = ocv.q();
                    Parcel parcelK17 = ogzVar3.k();
                    ifl.e(parcelK17, ohcVar);
                    ifl.c(parcelK17, r13);
                    ifl.c(parcelK17, nwlVarQ12);
                    ogzVar3.m(1, parcelK17);
                    break;
                } catch (RemoteException unused3) {
                    ocv.aS(Status.c, null, kwyVar3);
                    return;
                }
            case 16:
                olb olbVar = (olb) obj;
                okt oktVar = (okt) olbVar.L();
                Context context12 = olbVar.u;
                oktVar.a((oks) this.a, true, 1, ocv.q());
                ((kwy) obj2).u(null);
                break;
            case 17:
                olb olbVar2 = (olb) obj;
                okt oktVar2 = (okt) olbVar2.L();
                Context context13 = olbVar2.u;
                oktVar2.a((oks) this.a, false, 0, ocv.q());
                ((kwy) obj2).u(true);
                break;
            case 18:
                ojt ojtVar = (ojt) obj;
                int i5 = okb.a;
                Object obj3 = this.a;
                try {
                    ojv ojvVar = (ojv) ojtVar.L();
                    oka okaVar = new oka((Context) obj3, (kwy) obj2);
                    Context context14 = ojtVar.u;
                    nwl nwlVarQ13 = ocv.q();
                    Parcel parcelK18 = ojvVar.k();
                    ifl.e(parcelK18, okaVar);
                    ifl.c(parcelK18, nwlVarQ13);
                    ojvVar.m(224705, parcelK18);
                    break;
                } catch (RemoteException e) {
                    ((kwy) obj2).v(e);
                    return;
                }
            case 19:
                ojt ojtVar2 = (ojt) obj;
                int i6 = okb.a;
                ojv ojvVar2 = (ojv) ojtVar2.L();
                ojy ojyVar = new ojy((nzt) this.a);
                Context context15 = ojtVar2.u;
                nwl nwlVarQ14 = ocv.q();
                Parcel parcelK19 = ojvVar2.k();
                ifl.e(parcelK19, ojyVar);
                ifl.c(parcelK19, nwlVarQ14);
                ojvVar2.m(224703, parcelK19);
                break;
            default:
                int i7 = omi.a;
                ((omp) ((omq) obj).L()).a(new omo((kwy) obj2), (String) this.a);
                break;
        }
    }
}
