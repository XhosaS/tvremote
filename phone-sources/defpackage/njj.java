package defpackage;

import android.os.Parcel;
import android.support.v7.appcompat.R;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njj extends njm {
    public njj(nwu nwuVar) {
        super(nwuVar);
    }

    @Override // defpackage.nxr
    protected final /* bridge */ /* synthetic */ void b(nwf nwfVar) {
        njh njhVar = (njh) nwfVar;
        njs njsVar = (njs) njhVar.L();
        nji njiVar = new nji(this);
        GoogleSignInOptions googleSignInOptions = njhVar.a;
        Parcel parcelK = njsVar.k();
        ifl.e(parcelK, njiVar);
        ifl.c(parcelK, googleSignInOptions);
        njsVar.m(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, parcelK);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ nxc a(Status status) {
        return status;
    }
}
