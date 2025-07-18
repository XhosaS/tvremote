package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryt implements ryq {
    private static final ryq a = new ryq() { // from class: rys
        @Override // defpackage.ryq
        public final ryp a(rwv rwvVar) {
            throw new IllegalStateException();
        }
    };
    private volatile ryq b;
    private ryp c;

    public ryt(ryq ryqVar) {
        this.b = ryqVar;
    }

    @Override // defpackage.ryq
    public final ryp a(rwv rwvVar) {
        a.H(Objects.equals("", ""));
        ryq ryqVar = this.b;
        ryq ryqVar2 = a;
        if (ryqVar != ryqVar2) {
            synchronized (this) {
                if (this.b != ryqVar2) {
                    this.c = this.b.a(rwvVar);
                    this.b = ryqVar2;
                }
            }
        }
        return this.c;
    }
}
