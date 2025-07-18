package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ypq extends yps {
    final /* synthetic */ ypu a;
    private final yoe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypq(ypu ypuVar, long j, yoe yoeVar) {
        super(j);
        this.a = ypuVar;
        this.c = yoeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.d(this.a, ygi.a);
    }

    @Override // defpackage.yps
    public final String toString() {
        String string = super.toString();
        yoe yoeVar = this.c;
        Objects.toString(yoeVar);
        return string.concat(yoeVar.toString());
    }
}
