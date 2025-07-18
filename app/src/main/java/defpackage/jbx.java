package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Process;
import com.google.assistant.sdk.libassistant.ConversationStateListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbx extends ConversationStateListener {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/voice/controller/RecordAudioOpController");
    public final jnb a;
    private final AppOpsManager c;
    private final jdt d;
    private final Context e;
    private boolean f;

    public jbx(AppOpsManager appOpsManager, jdt jdtVar, Context context, jnb jnbVar) {
        jdtVar.getClass();
        context.getClass();
        jnbVar.getClass();
        this.c = appOpsManager;
        this.d = jdtVar;
        this.e = context;
        this.a = jnbVar;
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnConversationTurnFinished(ConversationStateListener.Resolution resolution) {
        resolution.getClass();
        if (this.f) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/controller/RecordAudioOpController", "OnConversationTurnFinished", 35, "RecordAudioOpController.kt")).u("#OnConversationTurnFinished finishOp for OPSTR_RECORD_AUDIO");
            this.c.finishOp("android:record_audio", Process.myUid(), this.e.getPackageName(), null);
            this.f = false;
        }
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnConversationTurnStarted(boolean z) {
        if (z && this.d.Z() == jlv.INVOCATION_TYPE_HOTWORD && !this.f) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/controller/RecordAudioOpController", "OnConversationTurnStarted", 54, "RecordAudioOpController.kt")).u("#OnConversationTurnStarted startOp for OPSTR_RECORD_AUDIO");
            this.f = this.c.startOpNoThrow("android:record_audio", Process.myUid(), this.e.getPackageName(), "", null) != 2;
        }
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRecognitionStateChanged(ConversationStateListener.RecognitionState recognitionState, ConversationStateListener.RecognitionResult recognitionResult) {
        recognitionResult.getClass();
        if (recognitionState == ConversationStateListener.RecognitionState.FINAL_RESULT && this.f) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/controller/RecordAudioOpController", "OnRecognitionStateChanged", 73, "RecordAudioOpController.kt")).u("#OnRecognitionStateChanged finishOp for OPSTR_RECORD_AUDIO");
            this.c.finishOp("android:record_audio", Process.myUid(), this.e.getPackageName(), null);
            this.f = false;
        }
    }
}
