package defpackage;

import android.os.Bundle;
import android.os.Message;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gew extends agtu implements agvb {
    final /* synthetic */ gex a;
    final /* synthetic */ ggi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gew(gex gexVar, ggi ggiVar, agsw agswVar) {
        super(2, agswVar);
        this.a = gexVar;
        this.b = ggiVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gew) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        int iA;
        agpl.b(obj);
        Message messageObtain = Message.obtain();
        messageObtain.what = 58;
        Bundle bundle = new Bundle();
        ggi ggiVar = this.b;
        try {
            int i = ggiVar.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(ggiVar.getClass()).a(ggiVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(ggiVar.getClass()).a(ggiVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    ggiVar.memoizedSerializedSize = (Integer.MIN_VALUE & ggiVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(ggiVar.getClass()).m(ggiVar, abwa.a(abvwVar));
            abvwVar.K();
            gex gexVar = this.a;
            bundle.putByteArray("KatnissAppFlowEvent", bArr);
            messageObtain.setData(bundle);
            gexVar.a.a(messageObtain);
            return agpu.a;
        } catch (IOException e) {
            throw new RuntimeException(a.x(ggiVar, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gew(this.a, this.b, agswVar);
    }
}
