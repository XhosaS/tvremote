package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fjd extends ehm implements fix {
    private fix a;
    private long b;

    @Override // defpackage.fix
    public final int a() {
        fix fixVar = this.a;
        fixVar.getClass();
        return fixVar.a();
    }

    @Override // defpackage.fix
    public final int b(long j) {
        fix fixVar = this.a;
        fixVar.getClass();
        return fixVar.b(j - this.b);
    }

    @Override // defpackage.fix
    public final long c(int i) {
        fix fixVar = this.a;
        fixVar.getClass();
        return fixVar.c(i) + this.b;
    }

    @Override // defpackage.ehm, defpackage.ehe
    public final void clear() {
        super.clear();
        this.a = null;
    }

    public final void d(long j, fix fixVar, long j2) {
        this.timeUs = j;
        this.a = fixVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.b = j;
    }

    @Override // defpackage.fix
    public final List e(long j) {
        fix fixVar = this.a;
        fixVar.getClass();
        return fixVar.e(j - this.b);
    }
}
