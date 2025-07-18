package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zgu implements zho {
    public final zho b;

    public zgu(zho zhoVar) {
        this.b = zhoVar;
    }

    @Override // defpackage.zho
    public long a(zgk zgkVar, long j) {
        return this.b.a(zgkVar, 8192L);
    }

    @Override // defpackage.zho
    public final zhq b() {
        return this.b.b();
    }

    @Override // defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.b + ")";
    }
}
