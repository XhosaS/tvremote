package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qef {
    public final boolean a;
    private final Object b;
    private final Object c;

    public qef(boolean z, Object obj, Object obj2) {
        this.a = z;
        this.b = obj;
        this.c = obj2;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean e(qef qefVar, qef qefVar2, Comparator comparator) {
        Object obj;
        Object obj2;
        if (qefVar == null || !qefVar.a || (obj = qefVar.b) == null || qefVar2 == null || !qefVar2.a || (obj2 = qefVar2.b) == null) {
            return c(qefVar, qefVar2);
        }
        ArrayList arrayList = new ArrayList((Collection) obj);
        ArrayList arrayList2 = new ArrayList((Collection) obj2);
        Collections.sort(arrayList, comparator);
        Collections.sort(arrayList2, comparator);
        return arrayList.equals(arrayList2);
    }

    public final Object a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Either was not left");
    }

    public final Object b() {
        if (d()) {
            return this.c;
        }
        throw new IllegalStateException("Either was not right");
    }

    public final boolean d() {
        return !this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qef)) {
            return false;
        }
        qef qefVar = (qef) obj;
        return this.a ? qefVar.a && c(a(), qefVar.a()) : qefVar.d() && c(b(), qefVar.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c});
    }
}
