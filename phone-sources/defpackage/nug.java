package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nug {
    final int a;
    int b;
    public final Object c;

    public nug(ntk ntkVar) {
        this.c = ntkVar;
        this.a = 1003;
        this.b = 0;
    }

    public final void a(Object obj) {
        krf.b();
        int i = this.b;
        if (i < this.a) {
            ((Object[]) this.c)[i] = obj;
            this.b = i + 1;
        }
    }

    public nug(Class cls, int i) {
        this.a = i;
        this.b = 0;
        this.c = (Object[]) Array.newInstance((Class<?>) cls, i);
    }
}
