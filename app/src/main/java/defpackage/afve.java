package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afve implements afzy {
    private InputStream a;

    public afve(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.afzy
    public final InputStream e() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
