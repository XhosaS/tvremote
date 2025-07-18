package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwk {
    public Object a;
    public Object b;
    public Object c;

    public xwk() {
    }

    public final xsv a() {
        Object obj = this.b;
        return new xsv((xtm) obj, (xpv) this.c, (xst) this.a);
    }

    public final ses b() {
        Object obj;
        Object obj2;
        Object obj3 = this.b;
        if (obj3 != null && (obj = this.a) != null && (obj2 = this.c) != null) {
            return new ses((String) obj3, (String) obj, (ImmutableList) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" id");
        }
        if (this.a == null) {
            sb.append(" contentDescription");
        }
        if (this.c == null) {
            sb.append(" children");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(List list) {
        this.c = ImmutableList.copyOf((Collection) list);
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentDescription");
        }
        this.a = str;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.b = str;
    }

    public final void f(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null flavorCustomActions");
        }
        this.a = immutableList;
    }

    public final tst g() {
        Object obj = this.c;
        if (obj != null) {
            return (tst) obj;
        }
        yks.c("appIdentifier");
        return null;
    }

    public final nhr h() {
        Object obj;
        Object obj2;
        Object obj3 = this.b;
        if (obj3 != null && (obj = this.c) != null && (obj2 = this.a) != null) {
            return new nhr((String) obj3, (String) obj, null, null, (byte[]) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" title");
        }
        if (this.c == null) {
            sb.append(" dismissButtonLabel");
        }
        if (this.a == null) {
            sb.append(" richBodyTextHtmlProtoBytes");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null dismissButtonLabel");
        }
        this.c = str;
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
    }

    public final void k(tzm tzmVar) {
        this.a = tzmVar.h();
    }

    public xwk(byte[] bArr, char[] cArr) {
        trk trkVar = trk.a;
        this.b = trkVar;
        this.c = trkVar;
    }

    public xwk(byte[] bArr) {
        this.b = new xtm(null, Collections.EMPTY_LIST);
        this.c = xpv.a;
    }
}
