package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjk implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, getServiceRequest.c);
        kkx.f(parcel, 2, getServiceRequest.d);
        kkx.f(parcel, 3, getServiceRequest.e);
        kkx.r(parcel, 4, getServiceRequest.f);
        kkx.l(parcel, 5, getServiceRequest.g);
        kkx.u(parcel, 6, getServiceRequest.h, i);
        kkx.i(parcel, 7, getServiceRequest.i);
        kkx.q(parcel, 8, getServiceRequest.j, i);
        kkx.u(parcel, 10, getServiceRequest.k, i);
        kkx.u(parcel, 11, getServiceRequest.l, i);
        kkx.c(parcel, 12, getServiceRequest.m);
        kkx.f(parcel, 13, getServiceRequest.n);
        kkx.c(parcel, 14, getServiceRequest.o);
        kkx.r(parcel, 15, getServiceRequest.p);
        kkx.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Scope[] scopeArr = GetServiceRequest.a;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.b;
        Feature[] featureArr2 = featureArr;
        String strL = null;
        IBinder iBinderG = null;
        Account account = null;
        String strL2 = null;
        int iB = 0;
        int iB2 = 0;
        int iB3 = 0;
        boolean zS = false;
        int iB4 = 0;
        boolean zS2 = false;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iB = kkw.b(parcel, i);
                    break;
                case 2:
                    iB2 = kkw.b(parcel, i);
                    break;
                case 3:
                    iB3 = kkw.b(parcel, i);
                    break;
                case 4:
                    strL = kkw.l(parcel, i);
                    break;
                case 5:
                    iBinderG = kkw.g(parcel, i);
                    break;
                case 6:
                    scopeArr = (Scope[]) kkw.v(parcel, i, Scope.CREATOR);
                    break;
                case 7:
                    bundle = kkw.f(parcel, i);
                    break;
                case '\b':
                    account = (Account) kkw.h(parcel, i, Account.CREATOR);
                    break;
                case '\t':
                default:
                    kkw.r(parcel, i);
                    break;
                case '\n':
                    featureArr = (Feature[]) kkw.v(parcel, i, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) kkw.v(parcel, i, Feature.CREATOR);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    zS = kkw.s(parcel, i);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    iB4 = kkw.b(parcel, i);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    zS2 = kkw.s(parcel, i);
                    break;
                case 15:
                    strL2 = kkw.l(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new GetServiceRequest(iB, iB2, iB3, strL, iBinderG, scopeArr, bundle, account, featureArr, featureArr2, zS, iB4, zS2, strL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
