package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ytx extends ytz {
    volatile long a;
    yuh b;
    yuh c;

    public ytx(ReferenceQueue referenceQueue, Object obj, int i, yuh yuhVar) {
        super(referenceQueue, obj, i, yuhVar);
        this.a = Long.MAX_VALUE;
        int i2 = yug.x;
        ytl ytlVar = ytl.a;
        this.b = ytlVar;
        this.c = ytlVar;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final long b() {
        return this.a;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final yuh f() {
        return this.b;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final yuh h() {
        return this.c;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final void l(yuh yuhVar) {
        this.b = yuhVar;
    }

    @Override // defpackage.ytz, defpackage.yuh
    public final void n(yuh yuhVar) {
        this.c = yuhVar;
    }
}
