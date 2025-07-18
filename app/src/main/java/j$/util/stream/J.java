package j$.util.stream;

/* loaded from: classes3.dex */
public class J extends K {
    public final /* synthetic */ int c = 0;
    public final Object d;

    public J(InterfaceC0100s interfaceC0100s, Object[] objArr) {
        super(interfaceC0100s);
        this.d = objArr;
    }

    @Override // j$.util.stream.K
    public final void a() {
        switch (this.c) {
            case 0:
                ((r) this.a).h(this.b, (int[]) this.d);
                break;
            default:
                this.a.l((Object[]) this.d, this.b);
                break;
        }
    }

    @Override // j$.util.stream.K
    public final K b(int i, int i2) {
        switch (this.c) {
            case 0:
                return new J(this, ((r) this.a).a(i), i2);
            default:
                return new J(this, this.a.a(i), i2);
        }
    }

    public J(J j, InterfaceC0100s interfaceC0100s, int i) {
        super(j, interfaceC0100s, i);
        this.d = (Object[]) j.d;
    }

    public J(InterfaceC0099q interfaceC0099q, Object obj) {
        super(interfaceC0099q);
        this.d = (int[]) obj;
    }

    public J(J j, r rVar, int i) {
        super(j, rVar, i);
        this.d = (int[]) j.d;
    }
}
