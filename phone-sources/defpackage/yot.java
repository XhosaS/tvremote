package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yot extends yid implements yii {
    public static final yie l = new yie(yii.k, new qyx(12));

    public yot() {
        super(yii.k);
    }

    public abstract void a(yil yilVar, Runnable runnable);

    public boolean cF(yil yilVar) {
        return true;
    }

    @Override // defpackage.yii
    public final void d(yih yihVar) {
        ynu ynuVar = ((ywu) yihVar).f;
        while (ynuVar.a == ywv.b) {
        }
        Object obj = ynuVar.a;
        yof yofVar = obj instanceof yof ? (yof) obj : null;
        if (yofVar != null) {
            yofVar.t();
        }
    }

    @Override // defpackage.yii
    public final yih eF(yih yihVar) {
        return new ywu(this, yihVar);
    }

    public void f(yil yilVar, Runnable runnable) {
        ywv.b(this, yilVar, runnable);
    }

    public yot g(int i) {
        wae.S(i);
        return new yxb(this, i);
    }

    @Override // defpackage.yid, defpackage.yij, defpackage.yil
    public final <E extends yij> E get(yik<E> yikVar) {
        yikVar.getClass();
        if (!(yikVar instanceof yie)) {
            if (yii.k == yikVar) {
                return this;
            }
            return null;
        }
        yie yieVar = (yie) yikVar;
        if (!yieVar.b(getKey())) {
            return null;
        }
        E e = (E) yieVar.a(this);
        if (e instanceof yij) {
            return e;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (defpackage.yii.k == r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        return defpackage.yim.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r2.a(r1) != null) goto L11;
     */
    @Override // defpackage.yid, defpackage.yil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.yil minusKey(defpackage.yik<?> r2) {
        /*
            r1 = this;
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.yie
            if (r0 == 0) goto L1a
            yie r2 = (defpackage.yie) r2
            yik r0 = r1.getKey()
            boolean r0 = r2.b(r0)
            if (r0 == 0) goto L21
            yij r2 = r2.a(r1)
            if (r2 == 0) goto L21
            goto L1e
        L1a:
            bbx r0 = defpackage.yii.k
            if (r0 != r2) goto L21
        L1e:
            yim r2 = defpackage.yim.a
            return r2
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yot.minusKey(yik):yil");
    }

    public String toString() {
        return yoz.a(this) + "@" + yoz.b(this);
    }
}
