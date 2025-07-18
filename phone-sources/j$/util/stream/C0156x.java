package j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0156x extends AbstractC0160z {
    public final /* synthetic */ A c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0156x(A a, Predicate predicate) {
        super(a);
        this.c = a;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        A a = this.c;
        if (zTest == a.a) {
            this.a = true;
            this.b = a.b;
        }
    }
}
