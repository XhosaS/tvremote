package defpackage;

import defpackage.ddh;
import defpackage.ddi;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ddi<MessageType extends ddi<MessageType, BuilderType>, BuilderType extends ddh<MessageType, BuilderType>> implements dfh {
    protected int memoizedHashCode = 0;

    public int c(dfs dfsVar) {
        throw null;
    }

    @Override // defpackage.dfh
    public final dds d() {
        try {
            int iH = h();
            dds ddsVar = dds.b;
            byte[] bArr = new byte[iH];
            boolean z = ddz.e;
            ddx ddxVar = new ddx(bArr, iH);
            r(ddxVar);
            return cws.e(ddxVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
