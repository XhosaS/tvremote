package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nqn extends ifj implements nqo {
    public nqn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // defpackage.nqo
    public final Bitmap a(Uri uri) {
        Parcel parcelK = k();
        ifl.c(parcelK, uri);
        Parcel parcelL = l(1, parcelK);
        Bitmap bitmap = (Bitmap) ifl.a(parcelL, Bitmap.CREATOR);
        parcelL.recycle();
        return bitmap;
    }
}
