package defpackage;

import defpackage.dnz;
import defpackage.doa;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class doa<MessageType extends doa<MessageType, BuilderType>, BuilderType extends dnz<MessageType, BuilderType>> implements dqa {
    protected int memoizedHashCode = 0;

    public int b(dqk dqkVar) {
        throw null;
    }

    @Override // defpackage.dqa
    public final dol c() {
        try {
            int iG = g();
            dol dolVar = dol.b;
            byte[] bArr = new byte[iG];
            boolean z = dot.e;
            dor dorVar = new dor(bArr, iG);
            r(dorVar);
            return cwr.f(dorVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
