package defpackage;

import com.google.protobuf.MessageLite;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwa {
    public final abvz a;

    private abwa(abvz abvzVar) {
        Charset charset = abxt.a;
        this.a = abvzVar;
        abvzVar.f = this;
    }

    public static abwa a(abvz abvzVar) {
        abwa abwaVar = abvzVar.f;
        return abwaVar != null ? abwaVar : new abwa(abvzVar);
    }

    public final void b(int i, Object obj, abzj abzjVar) {
        abvz abvzVar = this.a;
        abvzVar.v(i, 3);
        abzjVar.m((MessageLite) obj, abvzVar.f);
        abvzVar.v(i, 4);
    }

    public final void c(int i, Object obj, abzj abzjVar) {
        this.a.p(i, (MessageLite) obj, abzjVar);
    }

    public final void d(int i, Object obj) {
        if (obj instanceof abvo) {
            this.a.s(i, (abvo) obj);
        } else {
            this.a.r(i, (MessageLite) obj);
        }
    }
}
