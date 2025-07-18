package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjt extends agtu implements agvb {
    Object a;
    Object b;
    int c;
    final /* synthetic */ jkx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjt(jkx jkxVar, agsw agswVar) {
        super(2, agswVar);
        this.d = jkxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jjt) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        int iA;
        agtg agtgVar = agtg.a;
        if (this.c != 0) {
            obj2 = this.b;
            obj3 = this.a;
            agpl.b(obj);
        } else {
            agpl.b(obj);
            fau fauVar = this.d.h;
            faz fazVar = (faz) fauVar;
            String str = fazVar.c;
            this.a = str;
            String str2 = fazVar.d;
            this.b = str2;
            this.c = 1;
            obj = fauVar.a(this);
            if (obj == agtgVar) {
                return agtgVar;
            }
            obj2 = str2;
            obj3 = str;
        }
        xdz xdzVar = (xdz) obj;
        try {
            int i = xdzVar.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xdzVar.getClass()).a(xdzVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xdzVar.getClass()).a(xdzVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xdzVar.memoizedSerializedSize = (Integer.MIN_VALUE & xdzVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xdzVar.getClass()).m(xdzVar, abwa.a(abvwVar));
            abvwVar.K();
            List listSingletonList = Collections.singletonList(new ActionExecutor.ConversationParams((String) obj3, (String) obj2, bArr));
            listSingletonList.getClass();
            return listSingletonList;
        } catch (IOException e) {
            throw new RuntimeException(a.u(xdzVar, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jjt(this.d, agswVar);
    }
}
