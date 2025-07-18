package defpackage;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zjl implements Enumeration {
    final /* synthetic */ zjm a;
    private int b = 0;

    public zjl(zjm zjmVar) {
        this.a = zjmVar;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.b < this.a.a.length;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        zjm zjmVar = this.a;
        int i = this.b;
        zih[] zihVarArr = zjmVar.a;
        if (i >= zihVarArr.length) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return zihVarArr[i];
    }
}
