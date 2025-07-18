package defpackage;

import java.io.IOException;
import java.io.StringReader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abaw {
    public static abar a(abdx abdxVar) {
        int i = abdxVar.i;
        if (i == 2) {
            abdxVar.i = 1;
        }
        try {
            try {
                return abbs.a(abdxVar);
            } catch (OutOfMemoryError e) {
                throw new abav(a.t(abdxVar, "Failed parsing JSON source: ", " to Json"), e);
            } catch (StackOverflowError e2) {
                throw new abav(a.t(abdxVar, "Failed parsing JSON source: ", " to Json"), e2);
            }
        } finally {
            abdxVar.q(i);
        }
    }

    public static abar b(String str) {
        try {
            abdx abdxVar = new abdx(new StringReader(str));
            abar abarVarA = a(abdxVar);
            if (!(abarVarA instanceof abat) && abdxVar.p() != 10) {
                throw new abay();
            }
            return abarVarA;
        } catch (abea e) {
            throw new abay(e);
        } catch (IOException e2) {
            throw new abas(e2);
        } catch (NumberFormatException e3) {
            throw new abay(e3);
        }
    }
}
