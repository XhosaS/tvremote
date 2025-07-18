package defpackage;

import android.content.Context;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jny {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/recognition/SpeechRecognitionUtilsImpl");
    public final Context b;
    public final RecognitionListener c = new jnx(this);
    public jno d;
    public SpeechRecognizer e;

    public jny(Context context) {
        this.b = context;
    }
}
