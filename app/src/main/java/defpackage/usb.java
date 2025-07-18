package defpackage;

import android.content.Context;
import android.media.AudioDeviceAttributes;
import android.media.AudioManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usb implements urz {
    private final AudioManager a;

    public usb(Context context) {
        this.a = (AudioManager) context.getSystemService(AudioManager.class);
    }

    @Override // defpackage.urz
    public final int a(ury uryVar) {
        return this.a.getDeviceVolumeBehavior(new AudioDeviceAttributes(2, 9, uryVar.a));
    }
}
