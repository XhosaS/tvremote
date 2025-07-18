package defpackage;

import com.google.common.collect.Lists;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzm implements Serializable {
    private final yyk a;

    public yzm(yyk yykVar) {
        this.a = yykVar;
    }

    Object readResolve() {
        yyk yykVar = this.a;
        return yykVar.isEmpty() ? yzn.a : Lists.d(yykVar, yyk.o(zcd.a)) ? yzn.b : new yzn(yykVar);
    }
}
