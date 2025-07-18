package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class leq implements lev {
    @Override // defpackage.lev
    public final /* synthetic */ Object a(InputStream inputStream, long j) {
        return kdw.s(inputStream, j);
    }

    @Override // defpackage.lev
    public final /* bridge */ /* synthetic */ void b(Object obj, OutputStream outputStream) throws IOException {
        mee meeVar = (mee) obj;
        outputStream.write(meeVar.b, 0, meeVar.c);
    }
}
