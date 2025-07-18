package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnt implements Serializable, rnv {
    private static final long serialVersionUID = -4770846455854161599L;
    private final String a = ":search";

    private static void b(StringBuilder sb, String str, int i) {
        for (int length = i - str.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(str);
    }

    @Override // defpackage.rnv
    public final String a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return rnv.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rnv) {
            return this.a.equals(((rnv) obj).a());
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.a.hashCode() ^ 1335633679;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder sb = new StringBuilder("@com.google.android.libraries.processinit.CustomMainProcess(");
        sb.append('\"');
        for (int i = 0; i < 7; i++) {
            char cCharAt = ":search".charAt(i);
            if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"' || cCharAt == '\'' || cCharAt == '\\') {
                sb.append('\\');
                sb.append(cCharAt);
            } else if (cCharAt < ' ') {
                sb.append('\\');
                b(sb, Integer.toOctalString(cCharAt), 3);
            } else if (cCharAt < 127 || Character.isLetter(cCharAt)) {
                sb.append(cCharAt);
            } else {
                sb.append("\\u");
                b(sb, Integer.toHexString(cCharAt), 4);
            }
        }
        sb.append("\")");
        return sb.toString();
    }
}
