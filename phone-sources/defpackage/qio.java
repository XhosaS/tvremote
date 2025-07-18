package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qio {
    public String a;
    public String b;
    public String c;
    public vmo d;
    public vsl e;
    public String f;
    public viu g;
    public vtl h;
    public byte i;
    public int j;

    public final qir a() {
        String str;
        int i;
        String str2;
        String str3;
        vmo vmoVar;
        String str4;
        viu viuVar;
        vtl vtlVar;
        if (this.i == 1 && (str = this.a) != null && (i = this.j) != 0 && (str2 = this.b) != null && (str3 = this.c) != null && (vmoVar = this.d) != null && (str4 = this.f) != null && (viuVar = this.g) != null && (vtlVar = this.h) != null) {
            return new qir(str, i, str2, str3, vmoVar, this.e, str4, viuVar, vtlVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" actionId");
        }
        if (this.j == 0) {
            sb.append(" builtInActionType");
        }
        if (this.i == 0) {
            sb.append(" iconResourceId");
        }
        if (this.b == null) {
            sb.append(" text");
        }
        if (this.c == null) {
            sb.append(" url");
        }
        if (this.d == null) {
            sb.append(" threadStateUpdate");
        }
        if (this.f == null) {
            sb.append(" replyHintText");
        }
        if (this.g == null) {
            sb.append(" preferenceKey");
        }
        if (this.h == null) {
            sb.append(" snoozeDuration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null actionId");
        }
        this.a = str;
    }

    public final void c() {
        this.i = (byte) 1;
    }

    public final void d(viu viuVar) {
        if (viuVar == null) {
            throw new NullPointerException("Null preferenceKey");
        }
        this.g = viuVar;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null replyHintText");
        }
        this.f = str;
    }

    public final void f(vtl vtlVar) {
        if (vtlVar == null) {
            throw new NullPointerException("Null snoozeDuration");
        }
        this.h = vtlVar;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.b = str;
    }

    public final void h(vmo vmoVar) {
        if (vmoVar == null) {
            throw new NullPointerException("Null threadStateUpdate");
        }
        this.d = vmoVar;
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.c = str;
    }

    public final void j(int i) {
        if (i == 0) {
            throw new NullPointerException("Null builtInActionType");
        }
        this.j = i;
    }

    public final void k(String str) {
        if (str == null) {
            throw new NullPointerException("Null actionId");
        }
        this.a = str;
    }

    public final void l() {
        this.i = (byte) 1;
    }

    public final void m(viu viuVar) {
        if (viuVar == null) {
            throw new NullPointerException("Null preferenceKey");
        }
        this.g = viuVar;
    }

    public final void n(String str) {
        if (str == null) {
            throw new NullPointerException("Null replyHintText");
        }
        this.f = str;
    }

    public final void o(vtl vtlVar) {
        if (vtlVar == null) {
            throw new NullPointerException("Null snoozeDuration");
        }
        this.h = vtlVar;
    }

    public final void p(vmo vmoVar) {
        if (vmoVar == null) {
            throw new NullPointerException("Null threadStateUpdate");
        }
        this.d = vmoVar;
    }

    public final void q(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.c = str;
    }

    public final void r(int i) {
        if (i == 0) {
            throw new NullPointerException("Null builtInActionType");
        }
        this.j = i;
    }
}
