package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ukh<T> {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final ukj f;
    public final Set g;

    public ukh(String str, Set set, Set set2, int i, int i2, ukj ukjVar, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = ukjVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static ukg a(ulb ulbVar) {
        return new ukg(ulbVar, new ulb[0]);
    }

    public static ukg b(Class cls) {
        return new ukg(cls, new Class[0]);
    }

    public static ukg c(Class cls) {
        ukg ukgVarB = b(cls);
        ukgVarB.b = 1;
        return ukgVarB;
    }

    public static ukh d(Object obj, Class cls) {
        ukg ukgVarC = c(cls);
        ukgVarC.c = new ukf(obj, 1);
        return ukgVarC.a();
    }

    @SafeVarargs
    public static ukh e(Object obj, Class cls, Class... clsArr) {
        ukg ukgVar = new ukg(cls, clsArr);
        ukgVar.c = new ukf(obj, 0);
        return ukgVar.a();
    }

    public final boolean f() {
        return this.e == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
