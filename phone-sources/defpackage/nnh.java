package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nnh extends ifk implements IInterface {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnh(nmq nmqVar, int i) {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
        this.b = i;
        this.a = nmqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        switch (this.b) {
            case 0:
                if (i == 1) {
                    String string = parcel.readString();
                    ifl.b(parcel);
                    yyh yyhVar = (yyh) this.a;
                    Object obj = yyhVar.d;
                    Object obj2 = yyhVar.a;
                    nmj nmjVar = (nmj) yyhVar.c;
                    noo nooVar = (noo) obj2;
                    Context context = (Context) obj;
                    odd oddVarQ = new nmq(context, (String) yyhVar.b, string, nmjVar, nooVar, new nqv(context, nmjVar, nooVar)).q();
                    parcel2.writeNoException();
                    ifl.e(parcel2, oddVarQ);
                    return true;
                }
                if (i == 2) {
                    Object obj3 = this.a;
                    parcel2.writeNoException();
                    int i5 = ifl.a;
                    parcel2.writeInt(((nmj) ((yyh) obj3).c).g ? 1 : 0);
                    return true;
                }
                if (i == 3) {
                    Object obj4 = this.a;
                    parcel2.writeNoException();
                    parcel2.writeString((String) ((yyh) obj4).b);
                    return true;
                }
                if (i != 4) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(252505000);
                return true;
            case 1:
                if (i == 1) {
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    ifl.b(parcel);
                    nkn nknVar = ((nmq) this.a).c;
                    if (nknVar != 0 && nknVar.a()) {
                        oaf oafVar = new oaf();
                        oafVar.a = new nkv(nknVar, string2, string3, i2);
                        oafVar.c = 8407;
                        ((nwq) nknVar).t(oafVar.a()).k(new nmn(this, i2));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i == 2) {
                    String string4 = parcel.readString();
                    nlc nlcVar = (nlc) ifl.a(parcel, nlc.CREATOR);
                    ifl.b(parcel);
                    nkn nknVar2 = ((nmq) this.a).c;
                    if (nknVar2 != 0 && nknVar2.a()) {
                        oaf oafVar2 = new oaf();
                        oafVar2.a = new nkv((nla) nknVar2, string4, nlcVar, i4);
                        oafVar2.c = 8406;
                        ((nwq) nknVar2).t(oafVar2.a()).k(new nmn(this, i3));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(252505000);
                        return true;
                    }
                    int i6 = parcel.readInt();
                    ifl.b(parcel);
                    ((nmq) this.a).e(i6);
                    parcel2.writeNoException();
                    return true;
                }
                String string5 = parcel.readString();
                ifl.b(parcel);
                nkn nknVar3 = ((nmq) this.a).c;
                if (nknVar3 != 0 && nknVar3.a()) {
                    oaf oafVar3 = new oaf();
                    oafVar3.a = new nkx(nknVar3, string5, i3);
                    oafVar3.c = 8409;
                    ((nwq) nknVar3).t(oafVar3.a());
                }
                parcel2.writeNoException();
                return true;
            case 2:
                switch (i) {
                    case 1:
                        odc odcVar = new odc(this.a);
                        parcel2.writeNoException();
                        ifl.e(parcel2, odcVar);
                        return true;
                    case 2:
                        Bundle bundle = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                        ifl.b(parcel);
                        ((nnl) this.a).k(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        Bundle bundle2 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                        ifl.b(parcel);
                        ((nnl) this.a).i(bundle2);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        boolean zF = ifl.f(parcel);
                        ifl.b(parcel);
                        ((nnl) this.a).f(zF);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        long jB = ((nnl) this.a).b();
                        parcel2.writeNoException();
                        parcel2.writeLong(jB);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(252505000);
                        return true;
                    case 7:
                        Bundle bundle3 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                        ifl.b(parcel);
                        ((nnl) this.a).h(bundle3);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        Bundle bundle4 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                        ifl.b(parcel);
                        ((nnl) this.a).g(bundle4);
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        Bundle bundle5 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                        ifl.b(parcel);
                        ((nnl) this.a).l(bundle5);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
            case 3:
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(252505000);
                    return true;
                }
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                ifl.b(parcel);
                ((nqm) this.a).publishProgress(Long.valueOf(j), Long.valueOf(j2));
                parcel2.writeNoException();
                return true;
            case 4:
                if (i != 1) {
                    return false;
                }
                byte[] bArrCreateByteArray = parcel.createByteArray();
                ifl.b(parcel);
                ((nzt) this.a).b(new ofu(bArrCreateByteArray, 1));
                return true;
            case 5:
                if (i != 1) {
                    return false;
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                ifl.b(parcel);
                ((nzt) this.a).b(new ofu(bArrCreateByteArray2, 0));
                return true;
            case 6:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) ifl.a(parcel, Status.CREATOR);
                ogs ogsVar = (ogs) ifl.a(parcel, ogs.CREATOR);
                ifl.b(parcel);
                ocv.aT(status, status.b() ? ogsVar.a : null, (kwy) this.a);
                return true;
            case 7:
                if (i != 1) {
                    return false;
                }
                Status status2 = (Status) ifl.a(parcel, Status.CREATOR);
                int i7 = parcel.readInt();
                ifl.b(parcel);
                status2.getClass();
                ocv.aS(status2, Integer.valueOf(i7), (kwy) this.a);
                return true;
            case 8:
                if (i != 2) {
                    return false;
                }
                byte[] bArrCreateByteArray3 = parcel.createByteArray();
                ifl.b(parcel);
                ((nzt) this.a).b(new ofu(bArrCreateByteArray3, 2));
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                Status status3 = (Status) ifl.a(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray4 = parcel.createByteArray();
                ifl.b(parcel);
                if (!status3.b()) {
                    ocv.aS(status3, null, (kwy) this.a);
                    return true;
                }
                try {
                    vtp vtpVar = vtp.a;
                    vvs vvsVar = vvs.a;
                    vuc vucVarP = vuc.p(rxt.a, bArrCreateByteArray4, 0, bArrCreateByteArray4.length, vtp.a);
                    vuc.B(vucVarP);
                    ocv.aS(status3, (rxt) vucVarP, (kwy) this.a);
                    return true;
                } catch (vuq e) {
                    ((kwy) this.a).t(e);
                    return true;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnh(nnl nnlVar, int i) {
        super("com.google.android.gms.cast.framework.ISessionProxy");
        this.b = i;
        this.a = nnlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnh(yyh yyhVar, int i) {
        super("com.google.android.gms.cast.framework.ISessionProvider");
        this.b = i;
        this.a = yyhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnh(nqm nqmVar, int i) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
        this.b = i;
        this.a = nqmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnh(nzt nztVar, int i) {
        super("com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener");
        this.b = i;
        this.a = nztVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnh(nzt nztVar, int i, byte[] bArr) {
        super("com.google.android.gms.inappreach.internal.IOnAccountMessagesListener");
        this.b = i;
        this.a = nztVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnh(kwy kwyVar, int i) {
        super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
        this.b = i;
        this.a = kwyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnh(kwy kwyVar, int i, byte[] bArr) {
        super("com.google.android.gms.notifications.capping.internal.INotificationsCappingGetNotificationsCountCallback");
        this.b = i;
        this.a = kwyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnh(kwy kwyVar, int i, char[] cArr) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.b = i;
        this.a = kwyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnh(nzt nztVar, int i, char[] cArr) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.b = i;
        this.a = nztVar;
    }
}
