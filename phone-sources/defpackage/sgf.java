package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgf {
    public static final sgf a;
    public static final sgf b;
    public final boolean c;
    public final boolean d;
    public final ImmutableList e;
    public final ImmutableList f;

    static {
        sge sgeVar = new sge();
        sgeVar.c();
        a = sgeVar.a();
        sge sgeVar2 = new sge();
        sgeVar2.c();
        sgeVar2.b(new sgd());
        sgeVar2.a();
        sge sgeVar3 = new sge();
        sij.x(sgeVar3.a == null, "A SourcePolicy can only set internal() or external() once.");
        sgeVar3.a = true;
        b = sgeVar3.a();
    }

    public sgf(boolean z, boolean z2, ImmutableList immutableList, ImmutableList immutableList2) {
        this.c = z;
        this.d = z2;
        this.e = immutableList;
        this.f = immutableList2;
    }

    public static sgf a() {
        sge sgeVar = new sge();
        sgeVar.c();
        sgeVar.b = true;
        sgeVar.b(new sgc());
        return sgeVar.a();
    }
}
