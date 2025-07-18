package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvv extends vss {
    final vvw a;
    vsu b = b();
    final /* synthetic */ vvx c;

    public vvv(vvx vvxVar) {
        this.c = vvxVar;
        this.a = new vvw(vvxVar);
    }

    private final vsu b() {
        vvw vvwVar = this.a;
        if (vvwVar.hasNext()) {
            return vvwVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.vsu
    public final byte a() {
        vsu vsuVar = this.b;
        if (vsuVar == null) {
            throw new NoSuchElementException();
        }
        byte bA = vsuVar.a();
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
