package defpackage;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abut implements MessageLite {
    public int memoizedHashCode = 0;

    public int cJ(abzj abzjVar) {
        throw null;
    }

    @Override // com.google.protobuf.MessageLite
    public final abvo d() {
        try {
            int iG = g();
            abvo abvoVar = abvo.b;
            byte[] bArr = new byte[iG];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iG);
            f(abvwVar);
            return abvk.a(abvwVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException(a.x(this, "Serializing ", " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    @Override // com.google.protobuf.MessageLite
    public final void e(OutputStream outputStream) {
        abvy abvyVar = new abvy(outputStream, abvz.F(g()));
        f(abvyVar);
        abvyVar.O();
    }

    @Override // com.google.protobuf.MessageLite
    public final byte[] toByteArray() {
        try {
            int iG = g();
            byte[] bArr = new byte[iG];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iG);
            f(abvwVar);
            abvwVar.K();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(a.x(this, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
