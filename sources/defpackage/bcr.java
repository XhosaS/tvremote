package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcr implements bco {
    private static final bco a = new bco() { // from class: bcq
        @Override // defpackage.bco
        public final bcn a(bav bavVar) {
            throw new IllegalStateException();
        }
    };
    private volatile bco b;
    private bcn c;

    public bcr(bco bcoVar) {
        this.b = bcoVar;
    }

    @Override // defpackage.bco
    public final bcn a(bav bavVar) {
        bdq.e(Objects.equals("", ""));
        bco bcoVar = this.b;
        bco bcoVar2 = a;
        if (bcoVar != bcoVar2) {
            synchronized (this) {
                if (this.b != bcoVar2) {
                    this.c = this.b.a(bavVar);
                    this.b = bcoVar2;
                }
            }
        }
        return this.c;
    }
}
