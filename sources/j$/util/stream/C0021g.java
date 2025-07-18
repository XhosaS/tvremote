package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0021g implements G {
    public boolean a;
    public boolean b;
    public final /* synthetic */ EnumC0022h c;
    public final /* synthetic */ Predicate d;

    public C0021g(EnumC0022h enumC0022h, Predicate predicate) {
        this.c = enumC0022h;
        this.d = predicate;
        this.b = !enumC0022h.b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        EnumC0022h enumC0022h = this.c;
        if (zTest == enumC0022h.a) {
            this.a = true;
            this.b = enumC0022h.b;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.G
    public final boolean c() {
        return this.a;
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void b(long j) {
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ void end() {
    }
}
