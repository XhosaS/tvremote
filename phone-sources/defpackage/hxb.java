package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxb {
    public final String a;
    public List b = null;
    public List c = null;
    public final int d;

    public hxb(int i, String str) {
        this.d = i == 0 ? 1 : i;
        this.a = str;
    }

    public final void a(String str, int i, String str2) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(new rza(str, i, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.d;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.a;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        List<rza> list = this.b;
        if (list != null) {
            for (rza rzaVar : list) {
                sb.append('[');
                sb.append((String) rzaVar.b);
                int i2 = rzaVar.a - 1;
                if (i2 == 1) {
                    sb.append('=');
                    sb.append((String) rzaVar.c);
                } else if (i2 == 2) {
                    sb.append("~=");
                    sb.append((String) rzaVar.c);
                } else if (i2 == 3) {
                    sb.append("|=");
                    sb.append((String) rzaVar.c);
                }
                sb.append(']');
            }
        }
        List<String> list2 = this.c;
        if (list2 != null) {
            for (String str2 : list2) {
                sb.append(':');
                sb.append(str2);
            }
        }
        return sb.toString();
    }
}
