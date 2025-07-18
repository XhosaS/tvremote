package defpackage;

import com.google.assistant.sdk.libassistant.ConversationStateListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjh extends ConversationStateListener {
    final /* synthetic */ jkx a;
    final /* synthetic */ ahap b;

    public jjh(jkx jkxVar, ahap ahapVar) {
        this.a = jkxVar;
        this.b = ahapVar;
    }

    @Override // com.google.assistant.sdk.libassistant.ConversationStateListener
    public final void OnRespondingFinished() {
        this.a.g.b(this);
        this.b.e(agpu.a);
    }
}
