package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
class asl extends MediaDataSource {
    long a;
    final /* synthetic */ asq b;

    public asl(asq asqVar) {
        this.b = asqVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.a;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + this.b.a.available()) {
                    return -1;
                }
                this.b.c(j);
                this.a = j;
            }
            asq asqVar = this.b;
            DataInputStream dataInputStream = asqVar.a;
            if (i2 > dataInputStream.available()) {
                i2 = dataInputStream.available();
            }
            int i3 = asqVar.read(bArr, i, i2);
            if (i3 >= 0) {
                this.a += i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
