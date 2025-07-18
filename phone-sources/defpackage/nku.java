package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nku implements nzz {
    private final /* synthetic */ int a;

    public /* synthetic */ nku(int i) {
        this.a = i;
    }

    @Override // defpackage.nzz
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                nrt nrtVar = (nrt) obj;
                nsf nsfVar = nla.a;
                nsa nsaVar = (nsa) nrtVar.L();
                Context context = nrtVar.u;
                nsaVar.a(ocv.q());
                ((kwy) obj2).u(null);
                break;
            case 1:
                njc njcVar = new njc((kwy) obj2);
                nja njaVar = (nja) ((niy) obj).L();
                Parcel parcelK = njaVar.k();
                ifl.e(parcelK, njcVar);
                njaVar.m(3, parcelK);
                break;
            case 2:
                nrt nrtVar2 = (nrt) obj;
                nsf nsfVar2 = nla.a;
                nsa nsaVar2 = (nsa) nrtVar2.L();
                Context context2 = nrtVar2.u;
                nwl nwlVarQ = ocv.q();
                Parcel parcelK2 = nsaVar2.k();
                ifl.c(parcelK2, nwlVarQ);
                nsaVar2.n(19, parcelK2);
                ((kwy) obj2).u(true);
                break;
            case 3:
                ogb ogbVar = (ogb) obj;
                ofq ofqVar = ofr.a;
                ofp ofpVar = new ofp((kwy) obj2);
                oga ogaVar = (oga) ogbVar.L();
                Context context3 = ogbVar.u;
                nwl nwlVarQ2 = ocv.q();
                Parcel parcelK3 = ogaVar.k();
                ifl.e(parcelK3, ofpVar);
                ifl.c(parcelK3, nwlVarQ2);
                ogaVar.m(3, parcelK3);
                break;
            case 4:
                ojt ojtVar = (ojt) obj;
                int i = okb.a;
                ojv ojvVar = (ojv) ojtVar.L();
                ojz ojzVar = new ojz((kwy) obj2);
                Context context4 = ojtVar.u;
                nwl nwlVarQ3 = ocv.q();
                Parcel parcelK4 = ojvVar.k();
                ifl.e(parcelK4, ojzVar);
                ifl.c(parcelK4, nwlVarQ3);
                ojvVar.m(224704, parcelK4);
                break;
            case 5:
                ojt ojtVar2 = (ojt) obj;
                int i2 = okb.a;
                try {
                    ojv ojvVar2 = (ojv) ojtVar2.L();
                    ojx ojxVar = new ojx((kwy) obj2);
                    Context context5 = ojtVar2.u;
                    nwl nwlVarQ4 = ocv.q();
                    Parcel parcelK5 = ojvVar2.k();
                    ifl.e(parcelK5, ojxVar);
                    ifl.c(parcelK5, nwlVarQ4);
                    ojvVar2.m(224702, parcelK5);
                    break;
                } catch (RemoteException e) {
                    ((kwy) obj2).v(e);
                    return;
                }
            case 6:
                int i3 = omi.a;
                omp ompVar = (omp) ((omq) obj).L();
                nnh nnhVar = new nnh((kwy) obj2, 9, (char[]) null);
                Parcel parcelK6 = ompVar.k();
                ifl.e(parcelK6, nnhVar);
                ompVar.m(27, parcelK6);
                break;
            case 7:
                int i4 = omi.a;
                break;
            case 8:
                int i5 = omi.a;
                omo omoVar = new omo((kwy) obj2);
                omp ompVar2 = (omp) ((omq) obj).L();
                Parcel parcelK7 = ompVar2.k();
                ifl.e(parcelK7, omoVar);
                parcelK7.writeString(null);
                parcelK7.writeString("MOVIES");
                ompVar2.m(6, parcelK7);
                break;
            case 9:
                omz omzVar = (omz) obj;
                omy omyVar = (omy) omzVar.L();
                omu omuVar = new omu((kwy) obj2);
                Context context6 = omzVar.u;
                nwl nwlVarQ5 = ocv.q();
                Parcel parcelK8 = omyVar.k();
                ifl.e(parcelK8, omuVar);
                ifl.c(parcelK8, nwlVarQ5);
                omyVar.n(1, parcelK8);
                break;
            default:
                ool oolVar = new ool((kwy) obj2);
                oow oowVar = (oow) ((opa) obj).L();
                Parcel parcelK9 = oowVar.k();
                ifl.e(parcelK9, oolVar);
                oowVar.m(2, parcelK9);
                break;
        }
    }
}
