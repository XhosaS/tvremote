package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ylo implements ylr {
    public Object a;

    @Override // defpackage.ylr
    public final void c(ymp ympVar, Object obj) {
        throw null;
    }

    @Override // defpackage.ylr
    public final Object d(ymp ympVar) {
        throw null;
    }

    public final String toString() {
        String strConcat;
        Object obj = this.a;
        if (obj != null) {
            Objects.toString(obj);
            strConcat = "value=".concat(obj.toString());
        } else {
            strConcat = "value not initialized yet";
        }
        return a.cg(strConcat, "NotNullProperty(", ")");
    }
}
