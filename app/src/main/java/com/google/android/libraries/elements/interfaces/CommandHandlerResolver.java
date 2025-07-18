package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import defpackage.wu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class CommandHandlerResolver {
    private static final wu proxyMap = new wu();

    /* compiled from: PG */
    final class CppProxy extends CommandHandlerResolver {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        public static native CommandHandlerResolver create(CommandHandler commandHandler, ExecutorRegistry executorRegistry);

        public static native void nativeDestroy(long j);

        private native CommandHandler native_commandHandlerForExtension(long j, int i);

        private native Integer native_handleCommand(long j, CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);

        private native void native_handleCommandWithPlatformFallback(long j, CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);

        private native boolean native_hasCustomHandlerForExtension(long j, int i);

        private native void native_registerCommandHandler(long j, CommandHandler commandHandler, int i, CommandThread commandThread);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandHandlerResolver
        public CommandHandler commandHandlerForExtension(int i) {
            return native_commandHandlerForExtension(this.nativeRef, i);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandHandlerResolver
        public Integer handleCommand(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback) {
            return native_handleCommand(this.nativeRef, commandOuterClass$Command, commandRunContext, commandRunCompletionCallback);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandHandlerResolver
        public void handleCommandWithPlatformFallback(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback) {
            native_handleCommandWithPlatformFallback(this.nativeRef, commandOuterClass$Command, commandRunContext, commandRunCompletionCallback);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandHandlerResolver
        public boolean hasCustomHandlerForExtension(int i) {
            return native_hasCustomHandlerForExtension(this.nativeRef, i);
        }

        @Override // com.google.android.libraries.elements.interfaces.CommandHandlerResolver
        public void registerCommandHandler(CommandHandler commandHandler, int i, CommandThread commandThread) {
            native_registerCommandHandler(this.nativeRef, commandHandler, i, commandThread);
        }

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }
    }

    public static CommandHandlerResolver create(CommandHandler commandHandler, ExecutorRegistry executorRegistry) {
        return CppProxy.create(commandHandler, executorRegistry);
    }

    private static CppProxy createProxy(long j) {
        CppProxy existingProxy = getExistingProxy(j);
        if (existingProxy != null) {
            return existingProxy;
        }
        CppProxy cppProxy = new CppProxy(j);
        proxyMap.b(j, new WeakReference(cppProxy));
        return cppProxy;
    }

    private static CppProxy getExistingProxy(long j) {
        wu wuVar = proxyMap;
        WeakReference weakReference = (WeakReference) wuVar.a(j);
        if (weakReference == null) {
            return null;
        }
        CppProxy cppProxy = (CppProxy) weakReference.get();
        if (cppProxy != null) {
            return cppProxy;
        }
        wuVar.c(j);
        return null;
    }

    public abstract CommandHandler commandHandlerForExtension(int i);

    public abstract Integer handleCommand(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);

    public abstract void handleCommandWithPlatformFallback(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);

    public abstract boolean hasCustomHandlerForExtension(int i);

    public abstract void registerCommandHandler(CommandHandler commandHandler, int i, CommandThread commandThread);
}
