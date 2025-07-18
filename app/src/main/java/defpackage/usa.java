package defpackage;

import android.content.Context;
import com.android.libraries.tv.tvsystem.media.AudioDeviceAttributes;
import com.android.libraries.tv.tvsystem.media.TvAudioManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usa implements urz {
    private final TvAudioManager a;

    public usa(Context context) throws uru, ClassNotFoundException {
        try {
            Class.forName("com.android.libraries.tv.tvsystem.media.TvAudioManager");
            this.a = new TvAudioManager(context);
        } catch (ClassNotFoundException e) {
            throw new uru(e);
        }
    }

    @Override // defpackage.urz
    public final int a(ury uryVar) {
        return this.a.getDeviceVolumeBehavior(new AudioDeviceAttributes(2, 9, uryVar.a));
    }
}
