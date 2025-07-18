package defpackage;

import android.media.AudioManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgf extends AudioManager.VolumeGroupCallback {
    final /* synthetic */ bgo a;

    public bgf(bgo bgoVar) {
        this.a = bgoVar;
    }

    public final void onAudioVolumeGroupChanged(int i, int i2) {
        bgp bgpVar = this.a.a;
        if (i == bgpVar.c) {
            bgpVar.i();
        }
    }
}
