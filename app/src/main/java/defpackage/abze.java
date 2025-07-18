package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abze extends abvh {
    final abzg a;
    abvj b = b();
    final /* synthetic */ abzi c;

    public abze(abzi abziVar) {
        this.c = abziVar;
        this.a = new abzg(abziVar);
    }

    private final abvj b() {
        abzg abzgVar = this.a;
        if (abzgVar.hasNext()) {
            return abzgVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.abvj
    public final byte a() {
        abvj abvjVar = this.b;
        if (abvjVar == null) {
            throw new NoSuchElementException();
        }
        byte bA = abvjVar.a();
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
