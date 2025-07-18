package defpackage;

import android.os.RemoteException;
import com.google.assistant.sdk.libassistant.ConversationStateListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbp extends ConversationStateListener {
    final /* synthetic */ jbq a;

    public jbp(jbq jbqVar) {
        this.a = jbqVar;
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnConversationTurnFinished(ConversationStateListener.Resolution resolution) throws RemoteException {
        this.a.g(1);
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnConversationTurnStarted(boolean z) throws RemoteException {
        this.a.g(2);
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRecognitionStateChanged(ConversationStateListener.RecognitionState recognitionState, ConversationStateListener.RecognitionResult recognitionResult) throws RemoteException {
        this.a.g(3);
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRespondingFinished() throws RemoteException {
        this.a.g(1);
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRespondingStarted(boolean z) throws RemoteException {
        this.a.g(5);
    }
}
