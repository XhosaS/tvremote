package defpackage;

import com.google.assistant.sdk.libassistant.ConversationStateListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkw extends ConversationStateListener {
    final /* synthetic */ jkx a;

    public jkw(jkx jkxVar) {
        this.a = jkxVar;
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRespondingFinished() {
        this.a.k = false;
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRespondingStarted(boolean z) {
        this.a.k = true;
    }
}
