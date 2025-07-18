package defpackage;

import android.os.RemoteException;
import com.google.assistant.sdk.libassistant.ConversationStateListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbu extends ConversationStateListener {
    final /* synthetic */ fbv a;

    public fbu(fbv fbvVar) {
        this.a = fbvVar;
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRespondingFinished() throws RemoteException {
        this.a.c(false);
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRespondingStarted(boolean z) throws RemoteException {
        this.a.c(true);
    }
}
