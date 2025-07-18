package defpackage;

import android.database.SQLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bri {
    public static final void a(bsk bskVar, String str) throws Exception {
        brj brjVarA = bskVar.a(str);
        try {
            brjVarA.l();
            aguj.a(brjVarA, null);
        } finally {
        }
    }

    public static final void b(int i, String str) {
        throw new SQLException(a.b(i, "Error code: ").concat(", message: ".concat(str)));
    }
}
