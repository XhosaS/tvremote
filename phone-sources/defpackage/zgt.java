package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zgt implements zhm {
    public final zhm a;

    public zgt(zhm zhmVar) {
        this.a = zhmVar;
    }

    @Override // defpackage.zhm
    public final zhq b() {
        return ((zhd) this.a).a;
    }

    @Override // defpackage.zhm, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.zhm
    public void eW(zgk zgkVar, long j) {
        throw null;
    }

    @Override // defpackage.zhm, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.a + ")";
    }
}
