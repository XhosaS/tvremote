package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abuu implements abyv {
    @Override // defpackage.abyv
    public final abyv c() {
        throw null;
    }

    @Override // com.google.protobuf.MessageLite
    public final abyq cN() {
        throw null;
    }

    public final /* synthetic */ Object clone() {
        throw null;
    }

    @Override // com.google.protobuf.MessageLite
    public final abyq cy() {
        throw null;
    }

    @Override // com.google.protobuf.MessageLite
    public final abvo d() {
        throw null;
    }

    @Override // com.google.protobuf.MessageLite
    public final void e(OutputStream outputStream) {
        throw null;
    }

    @Override // com.google.protobuf.MessageLite
    public final void f(abvz abvzVar) {
        throw null;
    }

    @Override // com.google.protobuf.MessageLite
    public final byte[] toByteArray() {
        try {
            int iG = g();
            boolean z = abvz.e;
            new abvw(new byte[iG], 0, iG);
            throw null;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }
}
