package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zte implements Serializable {
    private static final long serialVersionUID = 0;
    public final String a;
    private final int b;

    private zte(String str, int i) {
        this.a = str;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[EDGE_INSN: B:88:0x00ae->B:37:0x00ae BREAK  A[LOOP:0: B:51:0x00d6->B:62:0x0100], EDGE_INSN: B:89:0x00ae->B:37:0x00ae BREAK  A[LOOP:0: B:51:0x00d6->B:62:0x0100], EDGE_INSN: B:90:0x00ae->B:37:0x00ae BREAK  A[LOOP:0: B:51:0x00d6->B:62:0x0100], EDGE_INSN: B:91:0x00ae->B:37:0x00ae BREAK  A[LOOP:0: B:51:0x00d6->B:62:0x0100]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.zte b(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zte.b(java.lang.String):zte");
    }

    public final int a() {
        yqw.L(c());
        return this.b;
    }

    public final boolean c() {
        return this.b >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zte) {
            zte zteVar = (zte) obj;
            if (yqs.a(this.a, zteVar.a) && this.b == zteVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 8);
        if (str.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(str);
            sb.append(']');
        } else {
            sb.append(str);
        }
        if (c()) {
            sb.append(':');
            sb.append(this.b);
        }
        return sb.toString();
    }
}
