package defpackage;

import com.google.android.libraries.elements.interfaces.CommandHandler;
import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import com.google.android.libraries.elements.interfaces.CommandRunContext;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mvu extends CommandHandler {
    private final WeakReference a;

    public mvu(WeakReference weakReference) {
        this.a = weakReference;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandHandler
    public final void run(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback) {
        CommandHandler commandHandler = (CommandHandler) this.a.get();
        if (commandHandler != null) {
            commandHandler.run(commandOuterClass$Command, commandRunContext, commandRunCompletionCallback);
        }
    }
}
