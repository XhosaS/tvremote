package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oei extends obe {
    private final Context a;

    public oei(Context context, Looper looper, nws nwsVar, nwt nwtVar, oav oavVar) {
        super(context, looper, 29, oavVar, nwsVar, nwtVar);
        this.a = context;
        opm.b(context);
    }

    @Override // defpackage.obe, defpackage.oat, defpackage.nwj
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.oat
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return iInterfaceQueryLocalInterface instanceof oej ? (oej) iInterfaceQueryLocalInterface : new oej(iBinder);
    }

    @Override // defpackage.oat
    protected final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.oat
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.oat
    public final boolean f() {
        return true;
    }

    @Override // defpackage.oat
    public final nvg[] g() {
        return odu.b;
    }

    public final void m(odz odzVar, long j) {
        opk opkVar = (opk) oek.b;
        boolean zF = opc.f(opm.a, opkVar.b, ((Boolean) opkVar.c).booleanValue());
        Boolean.valueOf(zF).getClass();
        if (zF) {
            Parcel parcelObtain = Parcel.obtain();
            oea.a(odzVar, parcelObtain, 0);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            opm opmVar = oek.a;
            if (iDataSize > ((Integer) opmVar.a()).intValue()) {
                throw new IllegalStateException("Max allowed feedback options size of " + opmVar.a().toString() + " exceeded, you are passing in feedback options of " + iDataSize + " size.");
            }
        }
        ErrorReport errorReport = new ErrorReport(odzVar, this.a.getCacheDir());
        oej oejVar = (oej) L();
        Parcel parcelK = oejVar.k();
        ifl.c(parcelK, errorReport);
        parcelK.writeLong(j);
        oejVar.n(6, parcelK);
    }
}
