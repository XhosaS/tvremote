package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* loaded from: classes4.dex */
public final class D0 extends A0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D0(K0 k0, Object obj, int i) {
        super(k0);
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((Consumer) this.c).accept(obj);
                ((K0) this.a).accept((K0) obj);
                break;
            case 1:
                if (((Predicate) this.c).test(obj)) {
                    ((K0) this.a).accept((K0) obj);
                    break;
                }
                break;
            case 2:
                ((K0) this.a).accept((K0) ((Function) this.c).apply(obj));
                break;
            default:
                ((K0) this.a).accept(((ToIntFunction) this.c).applyAsInt(obj));
                break;
        }
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public void d(long j) {
        switch (this.b) {
            case 1:
                ((K0) this.a).d(-1L);
                break;
            default:
                super.d(j);
                break;
        }
    }
}
