package defpackage;

import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.CommandRunContext;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.LoggingDelegate;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvw extends CommandRunContext {
    public final nzx a;
    private final ByteStore b;
    private final mvx c;
    private final DebuggerClient d = null;

    public mvw(ByteStore byteStore, nzx nzxVar, DebuggerClient debuggerClient, mvx mvxVar) {
        this.b = byteStore;
        this.a = nzxVar;
        this.c = mvxVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final BlockRegistryProvider blockRegistryProvider() {
        return ((nyx) ((nyv) this.a).h).z;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final String blockRegistryRef() {
        return ((nyx) ((nyv) this.a).h).y;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final ByteStore byteStore() {
        return this.b;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final DebuggerClient debuggerClient() {
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final boolean enableV2() {
        return false;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final LoggingDelegate logger() {
        return this.c;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final SenderStateOuterClass$SenderState senderState() {
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = ((nyv) this.a).e;
        return senderStateOuterClass$SenderState == null ? SenderStateOuterClass$SenderState.getDefaultInstance() : senderStateOuterClass$SenderState;
    }
}
