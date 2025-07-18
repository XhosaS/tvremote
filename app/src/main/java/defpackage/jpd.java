package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import androidx.leanback.widget.SearchEditText;
import androidx.leanback.widget.SpeechOrbView;
import com.google.android.apps.tvsearch.voice.voiceinput.VoiceInputActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpd extends jpe {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/voiceinput/VoiceInputActivityPeer");
    public jrv c;
    public final VoiceInputActivity d;
    public final AudioManager e;
    public SpeechOrbView f;
    public SpeechRecognizer g;
    public SearchEditText i;
    public final ghp j;
    public final Object b = new Object();
    public final Handler h = new Handler();
    public final AudioFocusRequest k = new AudioFocusRequest.Builder(4).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: joz
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            if (i == -1) {
                VoiceInputActivity voiceInputActivity = this.a.d;
                voiceInputActivity.setResult(0);
                voiceInputActivity.finish();
            }
        }
    }).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(3).build()).build();

    public jpd(VoiceInputActivity voiceInputActivity, AudioManager audioManager, ghp ghpVar) {
        this.d = voiceInputActivity;
        this.e = audioManager;
        this.j = ghpVar;
    }

    public final void a() {
        this.d.overridePendingTransition(0, 0);
    }
}
