package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egf {
    public eey a;
    public long b;
    public OutputStream c;
    public long d;
    public long e;
    private final egc f;
    private File g;
    private egu h;

    public egf(egc egcVar) {
        this(egcVar, null);
    }

    public final void a() {
        if (this.a == null) {
            return;
        }
        try {
            b();
        } catch (IOException e) {
            throw new egd(e);
        }
    }

    public final void b() {
        OutputStream outputStream = this.c;
        if (outputStream != null) {
            try {
                outputStream.flush();
                edt.ac(this.c);
                this.c = null;
                File file = this.g;
                this.g = null;
                this.f.h(file, this.d);
            } catch (Throwable th) {
                edt.ac(this.c);
                this.c = null;
                File file2 = this.g;
                this.g = null;
                file2.delete();
                throw th;
            }
        }
    }

    public final void c(eey eeyVar) {
        long j = eeyVar.g;
        long jMin = j != -1 ? Math.min(j - this.e, this.b) : -1L;
        egc egcVar = this.f;
        String str = eeyVar.h;
        String str2 = edt.a;
        this.g = egcVar.g(str, eeyVar.f + this.e, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.g);
        egu eguVar = this.h;
        if (eguVar == null) {
            this.h = new egu(fileOutputStream, null);
        } else {
            eguVar.a(fileOutputStream);
        }
        this.c = this.h;
        this.d = 0L;
    }

    public egf(egc egcVar, byte[] bArr) {
        eci.b(true, "fragmentSize must be positive or C.LENGTH_UNSET.");
        egcVar.getClass();
        this.f = egcVar;
    }
}
