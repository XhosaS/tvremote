package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaif {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final aaik f;
    public final Set g;

    public aaif(String str, Set set, Set set2, int i, int i2, aaik aaikVar, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = aaikVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static aaie a(aajj aajjVar) {
        return new aaie(aajjVar, new aajj[0]);
    }

    public static aaie b(Class cls) {
        return new aaie(cls, new Class[0]);
    }

    public static aaif c(final Object obj, Class cls) {
        aaie aaieVarB = b(cls);
        aaieVarB.b = 1;
        aaieVarB.c = new aaik() { // from class: aaic
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return obj;
            }
        };
        return aaieVarB.a();
    }

    @SafeVarargs
    public static aaif d(final Object obj, Class cls, Class... clsArr) {
        aaie aaieVar = new aaie(cls, clsArr);
        aaieVar.c = new aaik() { // from class: aaid
            @Override // defpackage.aaik
            public final Object a(aaih aaihVar) {
                return obj;
            }
        };
        return aaieVar.a();
    }

    public final boolean e() {
        return this.e == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
