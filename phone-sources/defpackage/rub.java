package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rub {
    public byte a;
    public int b;
    public Object c;

    public rub() {
        throw null;
    }

    public final ruc a() {
        int i;
        if (this.a == 1 && (i = this.b) != 0) {
            return new ruc(i, (tst) this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == 0) {
            sb.append(" manualCapture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final rph b() {
        int i;
        Object obj;
        if (this.a == 1 && (i = this.b) != 0 && (obj = this.c) != null) {
            return new rph(i, (rrx) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == 0) {
            sb.append(" chargeCounterEnabled");
        }
        if (this.c == null) {
            sb.append(" metricExtensionProvider");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(boolean z) {
        this.b = true != z ? 2 : 3;
    }

    public final qka d() {
        Object obj;
        if (this.a == 1 && (obj = this.c) != null) {
            return new qka(this.b, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" registrationStatus");
        }
        if (this.c == null) {
            sb.append(" environment");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(int i) {
        this.b = i;
        this.a = (byte) 1;
    }

    public final mxc f() {
        Object obj;
        if (this.a == 1 && (obj = this.c) != null) {
            return new mxc((ImmutableList) obj, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" list");
        }
        if (this.a == 0) {
            sb.append(" state");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void g(List list) {
        this.c = ImmutableList.copyOf((Collection) list);
    }

    public final void h(int i) {
        this.b = i;
        this.a = (byte) 1;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, java.lang.Object] */
    public final mvd i() {
        ?? r0;
        if (this.a == 1 && (r0 = this.c) != 0) {
            return new mus(this.b, r0);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" titleResId");
        }
        if (this.c == null) {
            sb.append(" message");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void j(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null message");
        }
        this.c = charSequence;
    }

    public final void k(int i) {
        this.b = i;
        this.a = (byte) 1;
    }

    public rub(byte[] bArr) {
        this.c = trk.a;
    }

    public rub(char[] cArr) {
    }
}
