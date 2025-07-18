package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ysi extends ysk implements Serializable {
    private static final long serialVersionUID = 0;
    private final yqi a;

    public ysi(yqi yqiVar) {
        this.a = yqiVar;
    }

    @Override // defpackage.ysk
    public final Object a(Object obj) {
        return this.a.apply(obj);
    }
}
