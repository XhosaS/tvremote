package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yqn {
    private final String a;

    public yqn(yqn yqnVar) {
        this.a = yqnVar.a;
    }

    public static yqn b(char c) {
        return new yqn(String.valueOf(c));
    }

    public CharSequence a(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String c(Iterable iterable) throws IOException {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        d(sb, it);
        return sb.toString();
    }

    public final void d(StringBuilder sb, Iterator it) throws IOException {
        try {
            if (it.hasNext()) {
                sb.append(a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    sb.append(a(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void e(StringBuilder sb, Iterable iterable) throws IOException {
        d(sb, iterable.iterator());
    }

    public yqn(String str) {
        str.getClass();
        this.a = str;
    }
}
