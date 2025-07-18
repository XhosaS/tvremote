package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
class dgk implements dgn {
    @Override // defpackage.dgn
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.dgn
    public final /* synthetic */ Object b(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // defpackage.dgn
    public final /* synthetic */ void c(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }
}
