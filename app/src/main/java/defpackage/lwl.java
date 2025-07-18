package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lwl extends eru implements lwm {
    public lwl() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) erv.a(parcel, Status.CREATOR);
                UsageReportingOptInOptions usageReportingOptInOptions = (UsageReportingOptInOptions) erv.a(parcel, UsageReportingOptInOptions.CREATOR);
                O(parcel);
                c(status, usageReportingOptInOptions);
                return true;
            case 3:
                O(parcel);
                n();
                return true;
            case 4:
                Status status2 = (Status) erv.a(parcel, Status.CREATOR);
                O(parcel);
                a(status2);
                return true;
            case 5:
                Status status3 = (Status) erv.a(parcel, Status.CREATOR);
                O(parcel);
                d(status3);
                return true;
            case 6:
                parcel.createStringArrayList();
                O(parcel);
                g();
                return true;
            case 7:
                O(parcel);
                l();
                return true;
            case 8:
                erv.d(parcel);
                O(parcel);
                e();
                return true;
            case 9:
                O(parcel);
                j();
                return true;
            case 10:
                O(parcel);
                h();
                return true;
            case 11:
                O(parcel);
                m();
                return true;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                O(parcel);
                i();
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                O(parcel);
                o();
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                O(parcel);
                k();
                return true;
            case 15:
                O(parcel);
                f();
                return true;
            default:
                return false;
        }
    }
}
