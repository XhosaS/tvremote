package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tlb implements Supplier {
    public final /* synthetic */ tld a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ nzx c;
    public final /* synthetic */ tli d;

    public /* synthetic */ tlb(tld tldVar, Object obj, nzx nzxVar, tli tliVar) {
        this.a = tldVar;
        this.b = obj;
        this.c = nzxVar;
        this.d = tliVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a.b.a(this.b, this.c, this.d);
    }
}
