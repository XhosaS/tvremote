package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpk implements hkw {
    @Override // defpackage.hkw
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, hll hllVar) throws Throwable {
        try {
            hwc.c((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
