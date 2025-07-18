package defpackage;

import java.io.File;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agui implements agxs {
    public final File a;

    public agui(File file) {
        this.a = file;
    }

    @Override // defpackage.agxs
    public final Iterator a() {
        return new agug(this);
    }
}
