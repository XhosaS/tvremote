package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yqq {
    public boolean a;
    private final String b;
    private final yqp c;
    private yqp d;

    public yqq(String str) {
        yqp yqpVar = new yqp();
        this.c = yqpVar;
        this.d = yqpVar;
        this.a = false;
        str.getClass();
        this.b = str;
    }

    public final yqp a() {
        yqp yqpVar = new yqp();
        this.d.c = yqpVar;
        this.d = yqpVar;
        return yqpVar;
    }

    public final void b(String str, Object obj) {
        yqp yqpVarA = a();
        yqpVarA.b = obj;
        yqpVarA.a = str;
    }

    public final void c(String str, Object obj) {
        yqo yqoVar = new yqo();
        this.d.c = yqoVar;
        this.d = yqoVar;
        yqoVar.b = obj;
        yqoVar.a = str;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.b);
        sb.append('{');
        String str = "";
        for (yqp yqpVar = this.c.c; yqpVar != null; yqpVar = yqpVar.c) {
            boolean z2 = yqpVar instanceof yqo;
            Object obj = yqpVar.b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                String str2 = yqpVar.a;
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
