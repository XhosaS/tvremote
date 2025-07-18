package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eml extends AudioTrack$StreamEventCallback {
    final /* synthetic */ hnj a;

    public eml(hnj hnjVar) {
        this.a = hnjVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        elw elwVar;
        emm emmVar = (emm) this.a.c;
        if (audioTrack.equals(emmVar.g) && (elwVar = emmVar.e) != null && emmVar.l) {
            elwVar.f();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        emm emmVar = (emm) this.a.c;
        if (audioTrack.equals(emmVar.g)) {
            emmVar.k = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        elw elwVar;
        emm emmVar = (emm) this.a.c;
        if (audioTrack.equals(emmVar.g) && (elwVar = emmVar.e) != null && emmVar.l) {
            elwVar.f();
        }
    }
}
