package defpackage;

import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnx implements RecognitionListener {
    final /* synthetic */ jny a;
    private boolean b;

    public jnx(jny jnyVar) {
        this.a = jnyVar;
    }

    private final String a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return "";
        }
        String str = stringArrayList.get(0);
        str.getClass();
        return str;
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
        jno jnoVar = this.a.d;
        if (jnoVar != null) {
            jnw jnwVar = ((jnt) jnoVar).a;
            jno jnoVar2 = jnwVar.d;
            if (jnoVar2 != null) {
                ((zdv) hxr.f.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity$maybeSetUpSpeechRecognitionListener$1", "onBeginningOfSpeech", 2461, "VoicePlateActivity.kt")).u("onBeginningOfSpeech");
                ((hxc) jnoVar2).a.U();
            }
            jnwVar.d();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
        bArr.getClass();
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        ((zdv) jny.a.d().q("com/google/android/apps/tvsearch/voice/recognition/SpeechRecognitionUtilsImpl$recognitionListener$1", "onError", 52, "SpeechRecognitionUtilsImpl.kt")).v("Speech recognition error: %d", i);
        SpeechRecognizer speechRecognizer = this.a.e;
        if (speechRecognizer != null) {
            speechRecognizer.cancel();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
        bundle.getClass();
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        bundle.getClass();
        String strA = a(bundle);
        if (strA.length() > 0) {
            if (bundle.getBoolean("final_result", false)) {
                jno jnoVar = this.a.d;
                if (jnoVar != null) {
                    jnoVar.a(strA);
                }
                this.b = true;
                return;
            }
            jno jnoVar2 = this.a.d;
            if (jnoVar2 != null) {
                jnw jnwVar = ((jnt) jnoVar2).a;
                jno jnoVar3 = jnwVar.d;
                if (jnoVar3 != null) {
                    ((zdv) hxr.f.b().q("com/google/android/apps/tvsearch/searchbar/activity/VoicePlateActivity$maybeSetUpSpeechRecognitionListener$1", "onPartialResults", 2466, "VoicePlateActivity.kt")).x("onPartialResults %s", strA);
                    ((hxc) jnoVar3).a.H().h(strA, "");
                }
                jnwVar.f(strA);
            }
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        bundle.getClass();
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        jno jnoVar;
        bundle.getClass();
        String strA = a(bundle);
        if (strA.length() > 0 && !this.b && (jnoVar = this.a.d) != null) {
            jnoVar.a(strA);
        }
        SpeechRecognizer speechRecognizer = this.a.e;
        if (speechRecognizer != null) {
            speechRecognizer.stopListening();
        }
        this.b = false;
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
    }
}
