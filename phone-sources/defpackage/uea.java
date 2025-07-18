package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uea implements Serializable {
    private static final long serialVersionUID = 0;
    public final String a;
    private final int b;

    public uea(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uea) {
            uea ueaVar = (uea) obj;
            if (a.Q(this.a, ueaVar.a) && this.b == ueaVar.b) {
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
        int i = this.b;
        if (i >= 0) {
            sb.append(':');
            sb.append(i);
        }
        return sb.toString();
    }
}
