package defpackage;

import android.media.AudioManager$AudioPlaybackCallback;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evv extends AudioManager$AudioPlaybackCallback {
    final /* synthetic */ evx a;

    public evv(evx evxVar) {
        this.a = evxVar;
    }

    public final void onPlaybackConfigChanged(List list) {
        list.getClass();
        evx evxVar = this.a;
        if (agvy.c(evxVar.c, false)) {
            if (evxVar.d || evxVar.e) {
                evxVar.f();
            } else {
                evxVar.e();
            }
        }
    }
}
