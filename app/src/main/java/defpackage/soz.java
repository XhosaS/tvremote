package defpackage;

import android.media.AudioManager$AudioPlaybackCallback;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class soz extends AudioManager$AudioPlaybackCallback {
    final /* synthetic */ spa a;

    public soz(spa spaVar) {
        this.a = spaVar;
    }

    public final void onPlaybackConfigChanged(List list) {
        list.getClass();
        spa spaVar = this.a;
        spaVar.b(list);
        spaVar.a(list);
    }
}
