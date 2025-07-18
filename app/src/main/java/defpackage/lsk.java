package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lsk extends eru implements lsl {
    public lsk() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) erv.a(parcel, Status.CREATOR);
                O(parcel);
                l(status);
                return true;
            case 2:
                Status status2 = (Status) erv.a(parcel, Status.CREATOR);
                O(parcel);
                q(status2);
                return true;
            case 3:
                Status status3 = (Status) erv.a(parcel, Status.CREATOR);
                O(parcel);
                p(status3);
                return true;
            case 4:
                Status status4 = (Status) erv.a(parcel, Status.CREATOR);
                Configurations configurations = (Configurations) erv.a(parcel, Configurations.CREATOR);
                O(parcel);
                h(status4, configurations);
                return true;
            case 5:
                Status status5 = (Status) erv.a(parcel, Status.CREATOR);
                O(parcel);
                c(status5);
                return true;
            case 6:
                Status status6 = (Status) erv.a(parcel, Status.CREATOR);
                ExperimentTokens experimentTokens = (ExperimentTokens) erv.a(parcel, ExperimentTokens.CREATOR);
                O(parcel);
                f(status6, experimentTokens);
                return true;
            case 7:
                Status status7 = (Status) erv.a(parcel, Status.CREATOR);
                DogfoodsToken dogfoodsToken = (DogfoodsToken) erv.a(parcel, DogfoodsToken.CREATOR);
                O(parcel);
                d(status7, dogfoodsToken);
                return true;
            case 8:
                Status status8 = (Status) erv.a(parcel, Status.CREATOR);
                O(parcel);
                e(status8);
                return true;
            case 9:
                Status status9 = (Status) erv.a(parcel, Status.CREATOR);
                Flag flag = (Flag) erv.a(parcel, Flag.CREATOR);
                O(parcel);
                i(status9, flag);
                return true;
            case 10:
                Status status10 = (Status) erv.a(parcel, Status.CREATOR);
                Configurations configurations2 = (Configurations) erv.a(parcel, Configurations.CREATOR);
                O(parcel);
                g(status10, configurations2);
                return true;
            case 11:
                Status status11 = (Status) erv.a(parcel, Status.CREATOR);
                parcel.readLong();
                O(parcel);
                r(status11);
                return true;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Status status12 = (Status) erv.a(parcel, Status.CREATOR);
                O(parcel);
                o(status12);
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Status status13 = (Status) erv.a(parcel, Status.CREATOR);
                FlagOverrides flagOverrides = (FlagOverrides) erv.a(parcel, FlagOverrides.CREATOR);
                O(parcel);
                k(status13, flagOverrides);
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Status status14 = (Status) erv.a(parcel, Status.CREATOR);
                O(parcel);
                m(status14);
                return true;
            case 15:
                Status status15 = (Status) erv.a(parcel, Status.CREATOR);
                O(parcel);
                n(status15);
                return true;
            case 16:
                Status status16 = (Status) erv.a(parcel, Status.CREATOR);
                long j = parcel.readLong();
                O(parcel);
                j(status16, j);
                return true;
            default:
                return false;
        }
    }
}
