package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qmu implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo439andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        piz pizVar = (piz) obj;
        int iOrdinal = pizVar.ordinal();
        if (iOrdinal == 0) {
            return vlk.CUSTOM_UI_TYPE_GROWTH_CATALOG_DIALOG;
        }
        if (iOrdinal == 1) {
            return vlk.CUSTOM_UI_TYPE_ANDROID_DESKTOP_GROWTH_NUDGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(pizVar))));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
