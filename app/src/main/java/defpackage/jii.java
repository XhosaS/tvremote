package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jii extends agtu implements agvb {
    int a;
    final /* synthetic */ jip b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jii(jip jipVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jipVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jii) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        int iA;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            jip jipVar = this.b;
            this.a = 1;
            obj = jipVar.c.a(this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        jip jipVar2 = this.b;
        xch xchVar = (xch) obj;
        try {
            int i2 = xchVar.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xchVar.getClass()).a(xchVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xchVar.getClass()).a(xchVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xchVar.memoizedSerializedSize = (Integer.MIN_VALUE & xchVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xchVar.getClass()).m(xchVar, abwa.a(abvwVar));
            abvwVar.K();
            fab fabVar = jipVar2.c;
            List listSingletonList = Collections.singletonList(new ActionExecutor.ConversationParams(fabVar.b, fabVar.c, bArr));
            listSingletonList.getClass();
            return listSingletonList;
        } catch (IOException e) {
            throw new RuntimeException(a.u(xchVar, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jii(this.b, agswVar);
    }
}
