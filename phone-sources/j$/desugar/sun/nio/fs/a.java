package j$.desugar.sun.nio.fs;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class a {
    public HashSet a;
    public HashMap b;
    public boolean c;

    public final void a(Object obj, String str) {
        this.b.put(str, obj);
    }

    public final boolean b(String str) {
        return this.c || this.a.contains(str);
    }
}
