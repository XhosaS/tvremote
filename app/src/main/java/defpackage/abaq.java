package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abaq extends abar implements Iterable {
    public final ArrayList a;

    public abaq() {
        this.a = new ArrayList();
    }

    private final abar g() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        if (size == 1) {
            return (abar) arrayList.get(0);
        }
        throw new IllegalStateException(a.b(size, "Array must have size 1, but has size "));
    }

    @Override // defpackage.abar
    public final int a() {
        return g().a();
    }

    @Override // defpackage.abar
    public final /* bridge */ /* synthetic */ abar b() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return new abaq();
        }
        abaq abaqVar = new abaq(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            abaqVar.a.add(((abar) arrayList.get(i)).b());
        }
        return abaqVar;
    }

    @Override // defpackage.abar
    public final String c() {
        return g().c();
    }

    public final void d(String str) {
        this.a.add(str == null ? abat.a : new abax(str));
    }

    @Override // defpackage.abar
    public final boolean e() {
        return g().e();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof abaq) && ((abaq) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public abaq(int i) {
        this.a = new ArrayList(i);
    }
}
