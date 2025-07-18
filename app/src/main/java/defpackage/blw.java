package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blw {
    public final ble a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public blw(ble bleVar, int[] iArr, String[] strArr) {
        Set setSingleton;
        iArr.getClass();
        strArr.getClass();
        this.a = bleVar;
        this.b = iArr;
        this.c = strArr;
        int length = iArr.length;
        int length2 = strArr.length;
        if (length != length2) {
            throw new IllegalStateException("Check failed.");
        }
        if (length2 == 0) {
            setSingleton = agrf.a;
        } else {
            setSingleton = Collections.singleton(strArr[0]);
            setSingleton.getClass();
        }
        this.d = setSingleton;
    }
}
