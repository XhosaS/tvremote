package defpackage;

import com.google.android.libraries.elements.interfaces.CommandHandler;
import com.google.android.libraries.elements.interfaces.CommandHandlerResolver;
import com.google.android.libraries.elements.interfaces.CommandThread;
import com.google.android.libraries.elements.interfaces.ExecutorRegistry;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mvv {
    public final yrp a;
    public final agow b;
    public final agow c;
    public final mvx d;

    public mvv(agow agowVar, final CommandHandler commandHandler, final agow agowVar2, agow agowVar3, yqt yqtVar, Map map) {
        CommandThread commandThread;
        this.b = agowVar;
        if (commandHandler != null && ((Boolean) ((yqz) yqtVar).a).booleanValue()) {
            commandHandler = new mvu(new WeakReference(commandHandler));
        }
        this.a = yru.a(new yrp() { // from class: mvt
            @Override // defpackage.yrp
            public final Object eV() {
                mhw.a();
                CommandHandlerResolver commandHandlerResolverCreate = CommandHandlerResolver.create(commandHandler, (ExecutorRegistry) agowVar2.a());
                if (commandHandlerResolverCreate != null) {
                    return commandHandlerResolverCreate;
                }
                throw new ocp("Error creating djinni CommandHandlerResolver.");
            }
        });
        this.c = agowVar3;
        this.d = new mvx();
        for (ode odeVar : ((yyr) map).values()) {
            CommandHandler commandHandlerA = odeVar.a();
            if (commandHandlerA != null) {
                CommandHandlerResolver commandHandlerResolver = (CommandHandlerResolver) this.a.eV();
                int iA = odeVar.b().a();
                acuh acuhVarC = odeVar.c();
                if (acuhVarC == null || (acuhVarC.b & 1) == 0) {
                    commandThread = CommandThread.ANY;
                } else {
                    int iA2 = acuf.a(acuhVarC.c);
                    int i = (iA2 == 0 ? 1 : iA2) - 1;
                    commandThread = i != 1 ? i != 2 ? CommandThread.ANY : CommandThread.BACKGROUND : CommandThread.MAIN;
                }
                commandHandlerResolver.registerCommandHandler(commandHandlerA, iA, commandThread);
            }
        }
    }
}
