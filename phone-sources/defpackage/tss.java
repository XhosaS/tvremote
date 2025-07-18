package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tss {
    public boolean a;
    private final String b;
    private final tsr c;
    private tsr d;

    public tss(String str) {
        tsr tsrVar = new tsr();
        this.c = tsrVar;
        this.d = tsrVar;
        this.a = false;
        str.getClass();
        this.b = str;
    }

    private final tsr g() {
        tsr tsrVar = new tsr();
        this.d.c = tsrVar;
        this.d = tsrVar;
        return tsrVar;
    }

    private final void h(String str, Object obj) {
        tsq tsqVar = new tsq();
        this.d.c = tsqVar;
        this.d = tsqVar;
        tsqVar.b = obj;
        tsqVar.a = str;
    }

    public final void a(Object obj) {
        g().b = obj;
    }

    public final void b(String str, Object obj) {
        tsr tsrVarG = g();
        tsrVarG.b = obj;
        tsrVarG.a = str;
    }

    public final void c(String str, double d) {
        h(str, String.valueOf(d));
    }

    public final void d(String str, int i) {
        h(str, String.valueOf(i));
    }

    public final void e(String str, long j) {
        h(str, String.valueOf(j));
    }

    public final void f(String str, boolean z) {
        h(str, String.valueOf(z));
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.b);
        sb.append('{');
        String str = "";
        for (tsr tsrVar = this.c.c; tsrVar != null; tsrVar = tsrVar.c) {
            boolean z2 = tsrVar instanceof tsq;
            Object obj = tsrVar.b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                String str2 = tsrVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
