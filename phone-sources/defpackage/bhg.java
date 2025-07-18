package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhg extends bhd {
    private final brl c;

    public bhg(brl brlVar) {
        this.c = brlVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 2;
        Object[] objArr = this.a;
        return new bgt(this.c, objArr[i], objArr[i + 1]);
    }
}
