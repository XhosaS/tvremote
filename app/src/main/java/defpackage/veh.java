package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.tv.remote.service.AudioStream;
import com.google.android.tv.remote.service.IAtvAudioProviderService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class veh extends ert implements IAtvAudioProviderService {
    public veh(IBinder iBinder) {
        super(iBinder, "com.google.android.tv.remote.service.IAtvAudioProviderService");
    }

    @Override // com.google.android.tv.remote.service.IAtvAudioProviderService
    public final AudioStream e() {
        Parcel parcelB = b(1, a());
        AudioStream audioStream = (AudioStream) erv.a(parcelB, AudioStream.CREATOR);
        parcelB.recycle();
        return audioStream;
    }
}
