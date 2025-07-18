package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afey implements afez {
    public static final afez a = new afey();

    private afey() {
    }

    @Override // defpackage.affa, defpackage.affu
    public final String c() {
        return "identity";
    }

    @Override // defpackage.affu
    public final InputStream a(InputStream inputStream) {
        return inputStream;
    }

    @Override // defpackage.affa
    public final OutputStream b(OutputStream outputStream) {
        return outputStream;
    }
}
