package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaie {
    public String a = null;
    public int b;
    public aaik c;
    private final Set d;
    private final Set e;
    private int f;
    private final Set g;

    @SafeVarargs
    public aaie(aajj aajjVar, aajj... aajjVarArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(aajjVar);
        for (aajj aajjVar2 : aajjVarArr) {
            aajh.b(aajjVar2, "Null interface");
        }
        Collections.addAll(this.d, aajjVarArr);
    }

    public final aaif a() {
        aajh.a(this.c != null, "Missing required property: factory.");
        return new aaif(this.a, new HashSet(this.d), new HashSet(this.e), this.f, this.b, this.c, this.g);
    }

    public final void b(aaiw aaiwVar) {
        if (this.d.contains(aaiwVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.e.add(aaiwVar);
    }

    public final void c(int i) {
        aajh.a(this.f == 0, "Instantiation type has already been set.");
        this.f = i;
    }

    @SafeVarargs
    public aaie(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(new aajj(aaji.class, cls));
        for (Class cls2 : clsArr) {
            aajh.b(cls2, "Null interface");
            this.d.add(new aajj(aaji.class, cls2));
        }
    }
}
