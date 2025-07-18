package defpackage;

import com.google.assistant.sdk.libassistant.AudioInputEventListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgs extends AudioInputEventListener {
    final /* synthetic */ jhh a;

    public jgs(jhh jhhVar) {
        this.a = jhhVar;
    }

    @Override // com.google.assistant.sdk.libassistant.AudioInputEventListener
    public final void onAudioInputEvent(AudioInputEventListener.InputEvent inputEvent) {
        inputEvent.getClass();
        zdy zdyVar = jhh.a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$registerKatnissAudioInputEventListeners$1", "onAudioInputEvent", 915, "AssistantWrapperImpl.kt")).x("Audio Input Event: %s", new qsk(inputEvent));
        int iOrdinal = inputEvent.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            final jhh jhhVar = this.a;
            if (jhhVar.aa) {
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$registerKatnissAudioInputEventListeners$1", "onAudioInputEvent", 935, "AssistantWrapperImpl.kt")).u("Resume software Hotword needed.");
                jhhVar.Z.post(new Runnable() { // from class: jgr
                    @Override // java.lang.Runnable
                    public final void run() {
                        jhhVar.F(true);
                    }
                });
                return;
            }
            return;
        }
        jhh jhhVar2 = this.a;
        if ((jhhVar2.R || !jhhVar2.V()) && !jhhVar2.m.m()) {
            return;
        }
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$registerKatnissAudioInputEventListeners$1", "onAudioInputEvent", 924, "AssistantWrapperImpl.kt")).u("Resetting hotword after capture failure");
        if (!((Boolean) jhhVar2.K.a()).booleanValue()) {
            jhhVar2.v();
            return;
        }
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$registerKatnissAudioInputEventListeners$1", "onAudioInputEvent", 926, "AssistantWrapperImpl.kt")).u("Starting loopback with microphone restart");
        feq.e(jhhVar2.Z, jhh.b, jhhVar2.ad);
    }
}
