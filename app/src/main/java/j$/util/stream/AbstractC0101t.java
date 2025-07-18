package j$.util.stream;

/* renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0101t implements InterfaceC0100s {
    public final InterfaceC0100s a;
    public final InterfaceC0100s b;
    public final long c;

    public AbstractC0101t(InterfaceC0100s interfaceC0100s, InterfaceC0100s interfaceC0100s2) {
        this.a = interfaceC0100s;
        this.b = interfaceC0100s2;
        this.c = interfaceC0100s2.count() + interfaceC0100s.count();
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final InterfaceC0100s a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final int o() {
        return 2;
    }

    @Override // j$.util.stream.InterfaceC0100s
    public /* bridge */ /* synthetic */ r a(int i) {
        return (r) a(i);
    }
}
