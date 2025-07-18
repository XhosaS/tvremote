package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byf {
    private final String a;
    private final bye b;
    private bye c;

    public byf(String str) {
        bye byeVar = new bye();
        this.b = byeVar;
        this.c = byeVar;
        str.getClass();
        this.a = str;
    }

    public final bye a() {
        bye byeVar = new bye();
        this.c.c = byeVar;
        this.c = byeVar;
        return byeVar;
    }

    public final void b(String str, Object obj) {
        bye byeVarA = a();
        byeVarA.b = obj;
        byeVarA.a = str;
    }

    public final void c(String str, boolean z) {
        String strValueOf = String.valueOf(z);
        byd bydVar = new byd();
        this.c.c = bydVar;
        this.c = bydVar;
        bydVar.b = strValueOf;
        bydVar.a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        bye byeVar = this.b.c;
        String str = "";
        while (byeVar != null) {
            Object obj = byeVar.b;
            sb.append(str);
            String str2 = byeVar.a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            byeVar = byeVar.c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
