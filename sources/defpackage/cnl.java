package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnl extends ckp {
    final cnm a;
    ckr b = b();
    final /* synthetic */ cnn c;

    public cnl(cnn cnnVar) {
        this.c = cnnVar;
        this.a = new cnm(cnnVar);
    }

    private final ckr b() {
        cnm cnmVar = this.a;
        if (cnmVar.hasNext()) {
            return cnmVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.ckr
    public final byte a() {
        ckr ckrVar = this.b;
        if (ckrVar == null) {
            throw new NoSuchElementException();
        }
        byte bA = ckrVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return bA;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
