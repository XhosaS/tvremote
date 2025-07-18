package defpackage;

import com.google.protobuf.MessageLite;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unr extends uid {
    private final MessageLite a;

    public unr(MessageLite messageLite) {
        this.a = messageLite;
    }

    @Override // defpackage.uid
    public final zyd a(final IOException iOException, uie uieVar) {
        return !(iOException.getCause() instanceof abxv) ? zxn.g(iOException) : zud.h(uieVar.a(zxn.h(this.a)), IOException.class, new zvi() { // from class: unq
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws IOException {
                IOException iOException2 = iOException;
                iOException2.addSuppressed((IOException) obj);
                throw iOException2;
            }
        }, zwk.a);
    }
}
