package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class uhu {
    public static OutputStream a(uhv uhvVar, OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.close();
        }
        throw new ufx("wrapForAppend not supported by ".concat(uhvVar.c()));
    }
}
