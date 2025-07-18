package defpackage;

import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class geb implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public geb(int i) {
        this.a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r14.equals("UNRECOGNIZED") != false) goto L29;
     */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.geb.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new gec[i];
            case 1:
                return new gdz[i];
            case 2:
                return new giz[i];
            case 3:
                return new ParcelImpl[i];
            case 4:
                return new gza[i];
            case 5:
                return new hbi[i];
            case 6:
                return new jxu[i];
            case 7:
                return new kkv[i];
            case 8:
                return new kkw[i];
            case 9:
                return new kkx[i];
            case 10:
                return new kky[i];
            case 11:
                return kti.CREATOR.newArray(i);
            case 12:
                return new ktf[i];
            case 13:
                return new ktg[i];
            case 14:
                return new kth[i];
            case 15:
                return new kti[i];
            case 16:
                return new ktj[i];
            case 17:
                return new ktk[i];
            case 18:
                return new ktl[i];
            case 19:
                return new ktm[i];
            default:
                return new ktn[i];
        }
    }
}
