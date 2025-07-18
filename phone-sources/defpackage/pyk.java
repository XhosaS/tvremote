package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pyk extends Exception {
    public pyk(vlo vloVar) {
        super(String.format(Locale.US, "Fetch disabled for FetchReason [%d].", Integer.valueOf(vloVar.p)));
    }

    public pyk(vmd vmdVar) {
        super(String.format(Locale.US, "Registration disabled for RegistrationReason [%d].", Integer.valueOf(vmdVar.p)));
    }
}
