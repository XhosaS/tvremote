package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0095m implements c0 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ EnumC0096n c;
    public final /* synthetic */ Predicate d;

    public C0095m(EnumC0096n enumC0096n, Predicate predicate) {
        this.c = enumC0096n;
        this.d = predicate;
        this.b = !enumC0096n.b;
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void accept(int i) {
        L.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.c0
    public final boolean g() {
        return this.a;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        EnumC0096n enumC0096n = this.c;
        if (zTest == enumC0096n.a) {
            this.a = true;
            this.b = enumC0096n.b;
        }
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void d(long j) {
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void end() {
    }
}
