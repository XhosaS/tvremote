package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fpq implements fqo {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fpq(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fqo
    public final Object a(foo fooVar, fnw fnwVar, int i) {
        if (this.c != 0) {
            boolean z = this.a;
            return fooVar.h(fnwVar, this.b, z ? -1 : fooVar.q.bd(), z ? -9223372036854775807L : fooVar.q.D());
        }
        boolean z2 = this.a;
        return fooVar.h(fnwVar, ImmutableList.of(this.b), z2 ? -1 : fooVar.q.bd(), z2 ? -9223372036854775807L : fooVar.q.D());
    }
}
