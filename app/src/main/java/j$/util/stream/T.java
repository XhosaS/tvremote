package j$.util.stream;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* loaded from: classes3.dex */
public final class T extends a0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(c0 c0Var, Object obj, int i) {
        super(c0Var);
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (((Predicate) this.c).test(obj)) {
                    this.a.accept((c0) obj);
                    break;
                }
                break;
            case 1:
                this.a.accept((c0) ((Function) this.c).apply(obj));
                break;
            default:
                this.a.accept(((ToIntFunction) this.c).applyAsInt(obj));
                break;
        }
    }

    @Override // j$.util.stream.a0, j$.util.stream.c0
    public void d(long j) {
        switch (this.b) {
            case 0:
                this.a.d(-1L);
                break;
            default:
                super.d(j);
                break;
        }
    }
}
