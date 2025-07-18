package defpackage;

import android.content.Context;
import android.media.AudioManager;
import com.android.libraries.tv.tvsystem.media.AudioDeviceAttributes;
import com.android.libraries.tv.tvsystem.media.TvAudioManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgy implements bgx {
    private final /* synthetic */ int a;
    private final Object b;

    public bgy(Context context, int i, byte[] bArr) throws bgu, ClassNotFoundException {
        this.a = i;
        try {
            Class.forName("com.android.libraries.tv.tvsystem.media.TvAudioManager");
            this.b = new TvAudioManager(context);
        } catch (ClassNotFoundException e) {
            throw new bgu(e);
        }
    }

    @Override // defpackage.bgx
    public final int a(bgw bgwVar) {
        if (this.a != 0) {
            return ((TvAudioManager) this.b).getDeviceVolumeBehavior(new AudioDeviceAttributes(2, bgwVar.a, bgwVar.b));
        }
        return ((AudioManager) this.b).getDeviceVolumeBehavior(new android.media.AudioDeviceAttributes(2, bgwVar.a, bgwVar.b));
    }

    public bgy(Context context, int i) {
        this.a = i;
        this.b = (AudioManager) context.getSystemService(AudioManager.class);
    }
}
