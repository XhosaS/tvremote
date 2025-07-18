package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yht<K, V> extends yhs<K, V> implements Iterator<V>, yli {
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yht(yhu yhuVar, int i, byte[] bArr) {
        super(yhuVar);
        this.d = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            a();
            int i = this.b;
            yhu yhuVar = this.a;
            if (i >= yhuVar.e) {
                throw new NoSuchElementException();
            }
            this.b = i + 1;
            this.c = i;
            Object obj = yhuVar.b[i];
            b();
            return obj;
        }
        a();
        int i2 = this.b;
        yhu yhuVar2 = this.a;
        if (i2 >= yhuVar2.e) {
            throw new NoSuchElementException();
        }
        this.b = i2 + 1;
        this.c = i2;
        Object[] objArr = yhuVar2.c;
        objArr.getClass();
        Object obj2 = objArr[i2];
        b();
        return obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yht(yhu yhuVar, int i) {
        super(yhuVar);
        this.d = i;
    }
}
