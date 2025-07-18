package defpackage;

import com.google.assistant.sdk.libassistant.ConversationStateListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jna {
    private final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void a(agux aguxVar) {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            aguxVar.a((ConversationStateListener) next);
        }
    }

    public final void b(ConversationStateListener conversationStateListener) {
        this.a.remove(conversationStateListener);
    }

    public final void c(ConversationStateListener conversationStateListener) {
        conversationStateListener.getClass();
        this.a.add(conversationStateListener);
    }
}
