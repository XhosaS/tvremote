package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nou {
    public final int a;
    public Object b;
    public Object c;

    public nou() {
        this(0, 7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    public final boolean a() {
        return !this.c.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    public final boolean b() {
        return !this.b.isEmpty();
    }

    public nou(int i) {
        this.a = i;
    }

    public nou(List list, List list2, int i) {
        this.a = i;
        if (i < 0) {
            wv.c("Capacity must be a positive integer");
        }
        if (list2.size() + list.size() > i) {
            wv.c("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        bje bjeVar = new bje();
        bjeVar.addAll(list);
        this.b = bjeVar;
        bje bjeVar2 = new bje();
        bjeVar2.addAll(list2);
        this.c = bjeVar2;
    }

    public /* synthetic */ nou(int i, int i2) {
        this((i2 & 1) != 0 ? yhb.a : null, (i2 & 2) != 0 ? yhb.a : null, (i2 & 4) != 0 ? 100 : i);
    }
}
