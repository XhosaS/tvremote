package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yub extends ytz {
    volatile long a;
    yuh b;
    yuh c;

    public yub(ReferenceQueue referenceQueue, Object obj, int i, yuh yuhVar) {
        super(referenceQueue, obj, i, yuhVar);
        this.a = Long.MAX_VALUE;
        int i2 = yug.x;
        ytl ytlVar = ytl.a;
        this.b = ytlVar;
        this.c = ytlVar;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final long c() {
        return this.a;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final yuh g() {
        return this.b;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final yuh i() {
        return this.c;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final void m(yuh yuhVar) {
        this.b = yuhVar;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final void o(yuh yuhVar) {
        this.c = yuhVar;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final void q(long j) {
        this.a = j;
    }
}
