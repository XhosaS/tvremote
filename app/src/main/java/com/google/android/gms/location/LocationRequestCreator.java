package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.kkw;
import defpackage.kkx;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LocationRequestCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(LocationRequest locationRequest, Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, locationRequest.a);
        kkx.g(parcel, 2, locationRequest.a());
        kkx.g(parcel, 3, locationRequest.c());
        kkx.f(parcel, 6, locationRequest.d);
        kkx.d(parcel, 7, locationRequest.e);
        kkx.g(parcel, 8, locationRequest.b);
        kkx.c(parcel, 9, locationRequest.f);
        kkx.g(parcel, 10, locationRequest.c);
        kkx.g(parcel, 11, locationRequest.b());
        kkx.f(parcel, 12, locationRequest.g);
        kkx.f(parcel, 13, locationRequest.h);
        kkx.c(parcel, 15, locationRequest.i);
        kkx.q(parcel, 16, locationRequest.j, i);
        kkx.q(parcel, 17, locationRequest.k, i);
        kkx.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public LocationRequest createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        boolean zS = false;
        int iB = 0;
        int iB2 = 0;
        boolean zS2 = false;
        long jE = -1;
        float fA = 0.0f;
        int iB3 = Integer.MAX_VALUE;
        long jE2 = Long.MAX_VALUE;
        long jE3 = Long.MAX_VALUE;
        long jE4 = 0;
        long jE5 = 600000;
        long jE6 = 3600000;
        int iB4 = 102;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iB4 = kkw.b(parcel, i);
                    break;
                case 2:
                    jE6 = kkw.e(parcel, i);
                    break;
                case 3:
                    jE5 = kkw.e(parcel, i);
                    break;
                case 4:
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                default:
                    kkw.r(parcel, i);
                    break;
                case 5:
                    jE2 = kkw.e(parcel, i);
                    break;
                case 6:
                    iB3 = kkw.b(parcel, i);
                    break;
                case 7:
                    fA = kkw.a(parcel, i);
                    break;
                case '\b':
                    jE4 = kkw.e(parcel, i);
                    break;
                case '\t':
                    zS = kkw.s(parcel, i);
                    break;
                case '\n':
                    jE3 = kkw.e(parcel, i);
                    break;
                case 11:
                    jE = kkw.e(parcel, i);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    iB = kkw.b(parcel, i);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    iB2 = kkw.b(parcel, i);
                    break;
                case 15:
                    zS2 = kkw.s(parcel, i);
                    break;
                case 16:
                    workSource = (WorkSource) kkw.h(parcel, i, WorkSource.CREATOR);
                    break;
                case 17:
                    clientIdentity = (ClientIdentity) kkw.h(parcel, i, ClientIdentity.CREATOR);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new LocationRequest(iB4, jE6, jE5, jE4, jE2, jE3, iB3, fA, zS, jE, iB, iB2, zS2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
