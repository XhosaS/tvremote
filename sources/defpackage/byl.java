package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byl {
    public final boolean a;
    public final Object b;
    public final Object c;

    private byl(byj byjVar, boolean z, awo awoVar) {
        this.c = byjVar;
        this.a = z;
        this.b = awoVar;
    }

    public static byl b(char c) {
        return new byl(new byj(new bxy(c)), false, bya.a);
    }

    public final byl a() {
        return new byl((byj) this.c, true, (awo) this.b);
    }

    public final Iterator c(CharSequence charSequence) {
        return new bxx(this, charSequence, (awo) ((byj) this.c).a);
    }

    public final List d(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itC = c(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itC.hasNext()) {
            arrayList.add((String) itC.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public byl(zu zuVar, zu zuVar2, boolean z) {
        this.b = zuVar;
        this.c = zuVar2;
        this.a = z;
    }
}
