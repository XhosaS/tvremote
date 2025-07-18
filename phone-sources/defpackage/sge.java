package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sge {
    public Boolean a;
    private final ImmutableList.Builder c = ImmutableList.builder();
    private final ImmutableList.Builder d = ImmutableList.builder();
    public boolean b = false;

    public final sgf a() {
        this.a.getClass();
        return new sgf(this.a.booleanValue(), this.b, this.c.build(), this.d.build());
    }

    public final void b(sgh sghVar) {
        this.a.getClass();
        this.c.add((ImmutableList.Builder) sghVar);
    }

    public final void c() {
        sij.x(this.a == null, "A SourcePolicy can only set internal() or external() once.");
        this.a = false;
    }
}
