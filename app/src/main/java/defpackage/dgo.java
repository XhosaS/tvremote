package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
class dgo implements dgn {
    @Override // defpackage.dgn
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.dgn
    public final /* synthetic */ Object b(File file) {
        return new FileInputStream(file);
    }

    @Override // defpackage.dgn
    public final /* synthetic */ void c(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
