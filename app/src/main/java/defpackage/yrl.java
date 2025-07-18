package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yrl {
    public final yqd a;
    public final boolean b;
    private final yrk c;

    private yrl(yrk yrkVar, boolean z, yqd yqdVar) {
        this.c = yrkVar;
        this.b = z;
        this.a = yqdVar;
    }

    public static yrl b(final yqd yqdVar) {
        return new yrl(new yrk() { // from class: yrf
            @Override // defpackage.yrk
            public final Iterator a(yrl yrlVar, CharSequence charSequence) {
                return new yrg(yrlVar, charSequence, yqdVar);
            }
        });
    }

    public static yrl c(final String str) {
        yqw.B(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? b(new ypz(str.charAt(0))) : new yrl(new yrk() { // from class: yre
            @Override // defpackage.yrk
            public final Iterator a(yrl yrlVar, CharSequence charSequence) {
                return new yrh(yrlVar, charSequence, str);
            }
        });
    }

    public final yrl a() {
        return new yrl(this.c, true, this.a);
    }

    public final yrl d(yqd yqdVar) {
        yqdVar.getClass();
        return new yrl(this.c, this.b, yqdVar);
    }

    public final Iterable e(CharSequence charSequence) {
        charSequence.getClass();
        return new yri(this, charSequence);
    }

    public final Iterator f(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final List g(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itF = f(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itF.hasNext()) {
            arrayList.add((String) itF.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private yrl(yrk yrkVar) {
        this(yrkVar, false, yqb.a);
    }
}
