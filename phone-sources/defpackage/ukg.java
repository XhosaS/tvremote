package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ukg {
    public String a = null;
    public int b;
    public ukj c;
    private final Set d;
    private final Set e;
    private int f;
    private final Set g;

    @SafeVarargs
    public ukg(ulb ulbVar, ulb... ulbVarArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(ulbVar);
        for (ulb ulbVar2 : ulbVarArr) {
            a.ar(ulbVar2, "Null interface");
        }
        Collections.addAll(this.d, ulbVarArr);
    }

    public final ukh a() {
        a.ah(this.c != null, "Missing required property: factory.");
        return new ukh(this.a, new HashSet(this.d), new HashSet(this.e), this.f, this.b, this.c, this.g);
    }

    public final void b(ukq ukqVar) {
        if (this.d.contains(ukqVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.e.add(ukqVar);
    }

    public final void c() {
        a.ah(1 == (this.f ^ 1), "Instantiation type has already been set.");
        this.f = 1;
    }

    @SafeVarargs
    public ukg(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(new ulb(ula.class, cls));
        for (Class cls2 : clsArr) {
            a.ar(cls2, "Null interface");
            this.d.add(new ulb(ula.class, cls2));
        }
    }
}
