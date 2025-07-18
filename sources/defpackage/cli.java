package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cli {
    public static final cli a = new cli(null);
    private static volatile boolean b = false;
    private static volatile cli c;
    private final Map d;

    cli() {
        this.d = new HashMap();
    }

    public static cli a() {
        cli cliVar = c;
        if (cliVar != null) {
            return cliVar;
        }
        synchronized (cli.class) {
            cli cliVar2 = c;
            if (cliVar2 != null) {
                return cliVar2;
            }
            cni cniVar = cni.a;
            cli cliVarB = cln.b(cli.class);
            c = cliVarB;
            return cliVarB;
        }
    }

    public cmt b(cmz cmzVar, int i) {
        return (cmt) this.d.get(new clh(cmzVar, i));
    }

    public cli(byte[] bArr) {
        this.d = Collections.EMPTY_MAP;
    }
}
