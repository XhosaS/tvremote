package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhf implements uef {
    @Override // defpackage.uef
    public final /* bridge */ /* synthetic */ Object a(uee ueeVar) throws IOException {
        uhg uhgVar = new uhg();
        uhgVar.a = true;
        File fileA = uhgVar.a(ueeVar);
        zkt.b(fileA);
        return new RandomAccessFile(fileA, "rw");
    }
}
