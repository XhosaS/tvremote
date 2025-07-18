package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvw {
    public Object a;
    public Object b;
    public Object c;

    public kvw() {
        throw null;
    }

    public final kvx a() {
        Object obj = this.a;
        if (obj == null) {
            throw new IllegalStateException("Missing required properties: position");
        }
        return new kvx((vtl) obj, (tst) this.b, (tst) this.c);
    }

    public final void b(vtl vtlVar) {
        if (vtlVar == null) {
            throw new NullPointerException("Null position");
        }
        this.a = vtlVar;
    }

    public final kkw c() {
        Object obj;
        Object obj2;
        Object obj3 = this.a;
        if (obj3 != null && (obj = this.c) != null && (obj2 = this.b) != null) {
            return new kkw((String) obj3, (String) obj, (ImmutableList) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.c == null) {
            sb.append(" contentDescription");
        }
        if (this.b == null) {
            sb.append(" children");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(List list) {
        this.b = ImmutableList.copyOf((Collection) list);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentDescription");
        }
        this.c = str;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }

    public final boolean g() {
        return this.c != null;
    }

    public final fzv h(fzx fzxVar) {
        Object obj;
        fzxVar.getClass();
        int iOrdinal = fzxVar.ordinal();
        if (iOrdinal == 0) {
            obj = this.c;
        } else if (iOrdinal == 1) {
            obj = this.b;
        } else {
            if (iOrdinal != 2) {
                throw new yfu();
            }
            obj = this.a;
        }
        return (fzv) obj;
    }

    public final fzw i() {
        Object obj = this.c;
        return new fzw((fzv) obj, (fzv) this.b, (fzv) this.a);
    }

    public final void j(fzx fzxVar, fzv fzvVar) {
        fzxVar.getClass();
        int iOrdinal = fzxVar.ordinal();
        if (iOrdinal == 0) {
            this.c = fzvVar;
        } else if (iOrdinal == 1) {
            this.b = fzvVar;
        } else {
            if (iOrdinal != 2) {
                throw new yfu();
            }
            this.a = fzvVar;
        }
    }

    public kvw(byte[] bArr) {
        trk trkVar = trk.a;
        this.b = trkVar;
        this.c = trkVar;
    }

    public kvw(char[] cArr) {
    }

    public kvw(char[] cArr, byte[] bArr) {
        fzu fzuVar = fzu.b;
        this.c = fzuVar;
        this.b = fzuVar;
        this.a = fzuVar;
    }
}
