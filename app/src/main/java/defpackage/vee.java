package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.tv.remote.service.AutoValue_AudioStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vee implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcel.readTypedObject(ParcelFileDescriptor.CREATOR);
        veg vegVar = new veg();
        vegVar.a = parcelFileDescriptor;
        vegVar.b = parcel.readInt();
        vegVar.f = (byte) (vegVar.f | 1);
        vegVar.c = parcel.readInt();
        vegVar.f = (byte) (vegVar.f | 2);
        vegVar.d = parcel.readInt();
        vegVar.f = (byte) (vegVar.f | 4);
        parcel.readInt();
        if (parcelFileDescriptor == null) {
            vegVar.g = new vej(parcel.readStrongBinder());
            vegVar.a(parcel.readInt());
        } else {
            vegVar.a(0);
        }
        if (vegVar.f == 15) {
            return new AutoValue_AudioStream(vegVar.a, vegVar.g, vegVar.b, vegVar.c, vegVar.d, vegVar.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((vegVar.f & 1) == 0) {
            sb.append(" channelCount");
        }
        if ((vegVar.f & 2) == 0) {
            sb.append(" bitsPerSample");
        }
        if ((vegVar.f & 4) == 0) {
            sb.append(" sampleRate");
        }
        if ((vegVar.f & 8) == 0) {
            sb.append(" interactionModel");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_AudioStream[i];
    }
}
