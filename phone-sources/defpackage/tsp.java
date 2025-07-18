package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class tsp {
    private final String a;

    public tsp(String str) {
        this.a = str;
    }

    public CharSequence a(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String b(Iterable iterable) throws IOException {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        d(sb, it);
        return sb.toString();
    }

    public final String c(Object obj, Object obj2, Object... objArr) {
        return b(new tso(objArr, obj, obj2));
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

    public tsp(tsp tspVar) {
        this.a = tspVar.a;
    }
}
