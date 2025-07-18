package defpackage;

import com.google.protobuf.MessageLite;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzr implements Function {
    public static final fzr a = new fzr();

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo116andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return (MessageLite) obj;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
