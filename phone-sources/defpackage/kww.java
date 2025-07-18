package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kww implements Serializable {
    private static final long serialVersionUID = 7810413361605259344L;

    private Object readResolve() {
        kwv kwvVar = new kwv();
        kwvVar.a = null;
        kwvVar.b = null;
        kwvVar.c = 0;
        return kwvVar.readResolve();
    }
}
