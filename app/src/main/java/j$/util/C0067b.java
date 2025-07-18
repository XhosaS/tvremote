package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/* renamed from: j$.util.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0067b implements Comparator, Serializable {
    public final /* synthetic */ ToIntFunction a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ToIntFunction toIntFunction = this.a;
        return Integer.compare(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
    }
}
