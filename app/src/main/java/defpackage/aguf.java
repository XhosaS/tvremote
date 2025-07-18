package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aguf extends aguh {
    private boolean b;

    public aguf(File file) {
        super(file);
    }

    @Override // defpackage.aguh
    public final File a() {
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a;
    }
}
