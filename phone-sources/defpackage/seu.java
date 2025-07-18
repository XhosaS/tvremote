package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class seu {
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public byte j;
    public Object k;

    public final sev a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj;
        if (this.j == 15 && (str = this.a) != null && (str2 = this.b) != null && (str3 = this.c) != null && (str4 = this.f) != null && (str5 = this.g) != null && (obj = this.k) != null) {
            return new sev(str, str2, str3, this.d, this.e, str4, str5, (ImmutableList) obj, this.h, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" name");
        }
        if (this.c == null) {
            sb.append(" contentDescription");
        }
        if ((this.j & 1) == 0) {
            sb.append(" drawableRes");
        }
        if ((this.j & 2) == 0) {
            sb.append(" drawableColorRes");
        }
        if (this.f == null) {
            sb.append(" dimensionId");
        }
        if (this.g == null) {
            sb.append(" parentId");
        }
        if (this.k == null) {
            sb.append(" children");
        }
        if ((this.j & 4) == 0) {
            sb.append(" isKnob");
        }
        if ((this.j & 8) == 0) {
            sb.append(" excludeFromAnalytics");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(List list) {
        this.k = ImmutableList.copyOf((Collection) list);
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentDescription");
        }
        this.c = str;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null dimensionId");
        }
        this.f = str;
    }

    public final void e(int i) {
        this.e = i;
        this.j = (byte) (this.j | 2);
    }

    public final void f(int i) {
        this.d = i;
        this.j = (byte) (this.j | 1);
    }

    public final void g(boolean z) {
        this.i = z;
        this.j = (byte) (this.j | 8);
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }

    public final void i(boolean z) {
        this.h = z;
        this.j = (byte) (this.j | 4);
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.b = str;
    }

    public final void k(String str) {
        if (str == null) {
            throw new NullPointerException("Null parentId");
        }
        this.g = str;
    }

    public final void l(boolean z) {
        this.i = z;
        this.j = (byte) (this.j | 2);
    }

    public final void m(boolean z) {
        this.h = z;
        this.j = (byte) (this.j | 1);
    }

    public final kky n() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj;
        if (this.j == 15 && (str = this.a) != null && (str2 = this.b) != null && (str3 = this.c) != null && (str4 = this.f) != null && (str5 = this.g) != null && (obj = this.k) != null) {
            return new kky(str, str2, str3, this.d, this.e, str4, str5, (ImmutableList) obj, this.h, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" name");
        }
        if (this.c == null) {
            sb.append(" contentDescription");
        }
        if ((this.j & 1) == 0) {
            sb.append(" drawableRes");
        }
        if ((this.j & 2) == 0) {
            sb.append(" drawableColorRes");
        }
        if (this.f == null) {
            sb.append(" dimensionId");
        }
        if (this.g == null) {
            sb.append(" parentId");
        }
        if (this.k == null) {
            sb.append(" children");
        }
        if ((this.j & 4) == 0) {
            sb.append(" isKnob");
        }
        if ((this.j & 8) == 0) {
            sb.append(" excludeFromAnalytics");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void o(List list) {
        this.k = ImmutableList.copyOf((Collection) list);
    }

    public final void p(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentDescription");
        }
        this.c = str;
    }

    public final void q(String str) {
        if (str == null) {
            throw new NullPointerException("Null dimensionId");
        }
        this.f = str;
    }

    public final void r(int i) {
        this.e = i;
        this.j = (byte) (this.j | 2);
    }

    public final void s(int i) {
        this.d = i;
        this.j = (byte) (this.j | 1);
    }

    public final void t(boolean z) {
        this.i = z;
        this.j = (byte) (this.j | 8);
    }

    public final void u(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }

    public final void v(boolean z) {
        this.h = z;
        this.j = (byte) (this.j | 4);
    }

    public final void w(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.b = str;
    }

    public final void x(String str) {
        if (str == null) {
            throw new NullPointerException("Null parentId");
        }
        this.g = str;
    }
}
