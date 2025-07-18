package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ozl {
    private MessageLite a;
    public final ozi f;
    public final oxs g;

    public ozl(ozi oziVar) {
        this.f = oziVar;
        this.g = oziVar.e;
    }

    protected MessageLite f(MessageLite messageLite) {
        throw null;
    }

    public final MessageLite k() {
        MessageLite messageLite = this.a;
        if (messageLite != null) {
            return messageLite;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void l(MessageLite messageLite) {
        messageLite.getClass();
        this.a = messageLite;
        this.a = f(k());
    }

    protected MessageLite o(MessageLite messageLite) {
        return messageLite;
    }
}
