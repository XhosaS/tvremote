package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oic extends oie {
    @Override // defpackage.oie
    /* renamed from: a */
    public final oid createFromParcel(Parcel parcel) throws IOException {
        oid oidVarCreateFromParcel = super.createFromParcel(parcel);
        ParcelFileDescriptor parcelFileDescriptor = oidVarCreateFromParcel.b;
        if (parcelFileDescriptor == null) {
            return oidVarCreateFromParcel;
        }
        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        try {
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.read(bArr);
                oid.a(dataInputStream);
                oidVarCreateFromParcel.a = bArr;
                return oidVarCreateFromParcel;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            }
        } catch (Throwable th) {
            oid.a(dataInputStream);
            throw th;
        }
    }

    @Override // defpackage.oie, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }
}
