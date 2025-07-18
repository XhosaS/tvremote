package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vtp {
    public static final vtp a = new vtp(null);
    private static volatile boolean b = false;
    private static volatile vtp c;
    private final Map d;

    vtp() {
        this.d = new HashMap();
    }

    public static vtp a() {
        vtp vtpVar = c;
        if (vtpVar != null) {
            return vtpVar;
        }
        synchronized (vtp.class) {
            vtp vtpVar2 = c;
            if (vtpVar2 != null) {
                return vtpVar2;
            }
            vvs vvsVar = vvs.a;
            vtp vtpVarB = vtv.b(vtp.class);
            c = vtpVarB;
            return vtpVarB;
        }
    }

    public vvd b(vvj vvjVar, int i) {
        return (vvd) this.d.get(new vto(vvjVar, i));
    }

    public vtp(byte[] bArr) {
        this.d = Collections.EMPTY_MAP;
    }
}
