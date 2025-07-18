package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvo extends abww implements abyr {
    public ahvo() {
        super(ahvp.a);
    }

    public final void a(int i) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        ahvp ahvpVar = (ahvp) this.b;
        ahvp ahvpVar2 = ahvp.a;
        abxj abxjVar = ahvpVar.c;
        if (!abxjVar.c()) {
            int size = abxjVar.size();
            ahvpVar.c = abxjVar.d(size + size);
        }
        ahvpVar.c.h(i);
    }

    public final void b(int i) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        ahvp ahvpVar = (ahvp) this.b;
        ahvp ahvpVar2 = ahvp.a;
        abxj abxjVar = ahvpVar.b;
        if (!abxjVar.c()) {
            int size = abxjVar.size();
            ahvpVar.b = abxjVar.d(size + size);
        }
        ahvpVar.b.h(i);
    }
}
