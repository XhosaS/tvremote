package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sez {
    private String a;
    private String b;
    private String c;
    private int d;
    private int e;
    private String f;
    private int g;
    private int h;
    private byte i;

    public sez() {
    }

    public final sfa a() {
        sfa sfaVarB = b();
        if (TextUtils.isEmpty(sfaVarB.a)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        return sfaVarB;
    }

    public final sfa b() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.i == 15 && (str = this.a) != null && (str2 = this.b) != null && (str3 = this.c) != null && (str4 = this.f) != null) {
            return new sfa(str, str2, str3, this.d, this.e, str4, this.g, this.h);
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
        if ((this.i & 1) == 0) {
            sb.append(" drawableRes");
        }
        if ((this.i & 2) == 0) {
            sb.append(" drawableColorRes");
        }
        if (this.f == null) {
            sb.append(" groupId");
        }
        if ((this.i & 4) == 0) {
            sb.append(" depth");
        }
        if ((this.i & 8) == 0) {
            sb.append(" flags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentDescription");
        }
        this.c = str;
    }

    public final void d(int i) {
        this.g = i;
        this.i = (byte) (this.i | 4);
    }

    public final void e(int i) {
        this.e = i;
        this.i = (byte) (this.i | 2);
    }

    public final void f(int i) {
        this.d = i;
        this.i = (byte) (this.i | 1);
    }

    public final void g(int i) {
        this.h = i;
        this.i = (byte) (this.i | 8);
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null groupId");
        }
        this.f = str;
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.b = str;
    }

    public final klb k() {
        klb klbVarL = l();
        if (TextUtils.isEmpty(klbVarL.a)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        return klbVarL;
    }

    public final klb l() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.i == 15 && (str = this.a) != null && (str2 = this.b) != null && (str3 = this.c) != null && (str4 = this.f) != null) {
            return new klb(str, str2, str3, this.d, this.e, str4, this.g, this.h);
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
        if ((this.i & 1) == 0) {
            sb.append(" drawableRes");
        }
        if ((this.i & 2) == 0) {
            sb.append(" drawableColorRes");
        }
        if (this.f == null) {
            sb.append(" groupId");
        }
        if ((this.i & 4) == 0) {
            sb.append(" depth");
        }
        if ((this.i & 8) == 0) {
            sb.append(" flags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void m(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentDescription");
        }
        this.c = str;
    }

    public final void n(int i) {
        this.g = i;
        this.i = (byte) (this.i | 4);
    }

    public final void o(int i) {
        this.e = i;
        this.i = (byte) (this.i | 2);
    }

    public final void p(int i) {
        this.d = i;
        this.i = (byte) (this.i | 1);
    }

    public final void q(int i) {
        this.h = i;
        this.i = (byte) (this.i | 8);
    }

    public final void r(String str) {
        if (str == null) {
            throw new NullPointerException("Null groupId");
        }
        this.f = str;
    }

    public final void s(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }

    public final void t(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.b = str;
    }

    public sez(klb klbVar) {
        this.a = klbVar.a;
        this.b = klbVar.b;
        this.c = klbVar.c;
        this.d = klbVar.d;
        this.e = klbVar.e;
        this.f = klbVar.f;
        this.g = klbVar.g;
        this.h = klbVar.h;
        this.i = (byte) 15;
    }

    public sez(sfa sfaVar) {
        this.a = sfaVar.a;
        this.b = sfaVar.b;
        this.c = sfaVar.c;
        this.d = sfaVar.d;
        this.e = sfaVar.e;
        this.f = sfaVar.f;
        this.g = sfaVar.g;
        this.h = sfaVar.h;
        this.i = (byte) 15;
    }
}
