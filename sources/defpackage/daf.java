package defpackage;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class daf implements Enumeration {
    final /* synthetic */ dag a;
    private int b = 0;

    public daf(dag dagVar) {
        this.a = dagVar;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.b < this.a.a.length;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        dag dagVar = this.a;
        int i = this.b;
        czb[] czbVarArr = dagVar.a;
        if (i >= czbVarArr.length) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return czbVarArr[i];
    }
}
