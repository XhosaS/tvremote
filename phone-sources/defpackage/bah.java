package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bah implements bby {
    public final bhn a;
    private final yjk c;
    private final Object d;
    private Throwable e;
    private kc f;
    private kc g;

    public bah() {
        this(null);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, yih] */
    @Override // defpackage.bby
    public final Object a(yjv yjvVar, yih yihVar) {
        int i;
        int i2;
        yjk yjkVar;
        int i3;
        yof yofVar = new yof(wcq.S(yihVar), 1);
        yofVar.v();
        baf bafVar = new baf(yjvVar, yofVar);
        yld yldVar = new yld();
        yldVar.a = -1;
        synchronized (this.d) {
            Throwable th = this.e;
            if (th != null) {
                yofVar.resumeWith(ybn.e(th));
            } else {
                bhn bhnVar = this.a;
                do {
                    i = bhnVar.get();
                    i2 = i + 1;
                } while (!bhnVar.compareAndSet(i, i2));
                int i4 = 134217727 & i2;
                yldVar.a = (i2 >>> 27) & 15;
                this.f.p(bafVar);
                yofVar.b(new bag(bafVar, this, yldVar));
                if (i4 == 1 && (yjkVar = this.c) != null) {
                    try {
                        yjkVar.a();
                    } catch (Throwable th2) {
                        synchronized (this.d) {
                            if (this.e == null) {
                                this.e = th2;
                                kc kcVar = this.f;
                                Object[] objArr = kcVar.a;
                                int i5 = kcVar.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ?? r5 = ((baf) objArr[i6]).b;
                                    if (r5 != 0) {
                                        r5.resumeWith(ybn.e(th2));
                                    }
                                }
                                this.f.k();
                                bhn bhnVar2 = this.a;
                                do {
                                    i3 = bhnVar2.get();
                                } while (!bhnVar2.compareAndSet(i3, bae.a(((i3 >>> 27) & 15) + 1)));
                            }
                        }
                    }
                }
            }
        }
        return yofVar.i();
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, yoe] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yjv] */
    public final void b(long j) {
        int i;
        ?? r4;
        Object objE;
        synchronized (this.d) {
            kc kcVar = this.f;
            this.f = this.g;
            this.g = kcVar;
            bhn bhnVar = this.a;
            do {
                i = bhnVar.get();
            } while (!bhnVar.compareAndSet(i, bae.a(((i >>> 27) & 15) + 1)));
            int i2 = kcVar.b;
            for (int i3 = 0; i3 < i2; i3++) {
                baf bafVar = (baf) kcVar.c(i3);
                ?? r5 = bafVar.a;
                if (r5 != 0 && (r4 = bafVar.b) != 0) {
                    try {
                        objE = r5.a(Long.valueOf(j));
                    } catch (Throwable th) {
                        objE = ybn.e(th);
                    }
                    r4.resumeWith(objE);
                }
            }
            kcVar.k();
        }
    }

    @Override // defpackage.yil
    public final <R> R fold(R r, yjz<? super R, ? super yij, ? extends R> yjzVar) {
        return (R) wcq.T(this, r, yjzVar);
    }

    @Override // defpackage.yij, defpackage.yil
    public final <E extends yij> E get(yik<E> yikVar) {
        return (E) wcq.U(this, yikVar);
    }

    @Override // defpackage.yij
    public final /* synthetic */ yik getKey() {
        return bby.b;
    }

    @Override // defpackage.yil
    public final yil minusKey(yik<?> yikVar) {
        return wcq.V(this, yikVar);
    }

    @Override // defpackage.yil
    public final yil plus(yil yilVar) {
        return wcq.W(this, yilVar);
    }

    public bah(yjk yjkVar) {
        this.c = yjkVar;
        this.d = new Object();
        this.a = new bhn();
        this.f = new kc((byte[]) null);
        this.g = new kc((byte[]) null);
    }
}
